/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.Manager;
import controller.pojo.Member;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.conn.ConnectionForDB;

/**
 *
 * @author OLEE
 */
public class MealHistoryServices {
    static SummaryService summaryService = new SummaryService();

    

    public static void createMealHistoryTable(String month, String year, Date startDate, Date endDate) {
        String tblName = "meal_history_for_" + month + "_" + year;
        String tblCrtStmt = "create table IF NOT EXISTS " + tblName + "(id int(5)primary key auto_increment,"
                + "card_no int)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(tblCrtStmt);
            ps.execute();
            getDateList(startDate, endDate).forEach((date) -> {
                addCol(date, tblName);
            });
            List<Integer> cardListInSummaryTable = summaryService.getCardList();
            
            for(int cardNo:cardListInSummaryTable){
                insertOneCard(cardNo,tblName);
                
                
            }
            

            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static List<Integer> getCardList(Manager manager) {
        List<Integer> cardList = new ArrayList<>();
        String tblName = "meal_history_for_" + manager.getMonthName() + "_" + manager.getYear();
        String sql = "select card_no from " + tblName;
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cardList.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cardList;
    }

    public static void main(String[] args) {
    }

    public static void insertOneCard(int cardNo,String tblName) {
        String stmt = "insert into " + tblName + "(card_no) values(?)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setInt(1, cardNo);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void addCol(String date, String tblName) {
        String stmt = "alter table " + tblName + " add " + date + " varchar(10)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.executeUpdate();
            System.out.println(date);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static String getMonth(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }

    public static List<String> getDateList(java.util.Date startDate, java.util.Date endDate) {
        java.util.Date fromDate = startDate;
        java.util.Date toDate = endDate;
        List<String> dates = new ArrayList(25);
        Calendar cal = Calendar.getInstance();
        cal.setTime(fromDate);
        while (cal.getTime().before(toDate)) {

            int day = cal.get(Calendar.DAY_OF_MONTH);
            int month = cal.get(Calendar.MONTH);
            String date_name = getMonth(month) + "_" + day;
            dates.add(date_name);
            cal.add(Calendar.DATE, 1);
        }

        return dates;
    }

    public String dateFormate(java.util.Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        String date_name = getMonth(month) + "_" + day;
        return date_name;
    }

    private static void updateMealDate(Date date, String tblName) {
        String stmt = "update " + tblName + "set meal_date=?";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setDate(1, date);
            ps.executeUpdate();
            System.out.println(date);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static List<java.sql.Date> updateAlMealDates(java.util.Date startDate, java.util.Date endDate, String tblName) {
        java.util.Date fromDate = startDate;
        java.util.Date toDate = endDate;
        List<java.sql.Date> dates = new ArrayList<java.sql.Date>(25);
        Calendar cal = Calendar.getInstance();
        cal.setTime(fromDate);
        while (cal.getTime().before(toDate)) {
            cal.add(Calendar.DATE, 1);
            updateMealDate(new java.sql.Date(cal.getTime().getTime() - 86400000), tblName);
            dates.add(new java.sql.Date(cal.getTime().getTime() - 86400000));
            System.out.println(new java.sql.Date(cal.getTime().getTime() - 86400000));
        }

        return dates;
    }

}
