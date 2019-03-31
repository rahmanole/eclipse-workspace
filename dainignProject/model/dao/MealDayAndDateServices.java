/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.Manager;
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
public class MealDayAndDateServices {

    public static String createTableDayWithDate = "create table IF NOT EXISTS table_with_date(id int(5) primary key auto_increment,"
            + "day int(2),meal_date date)";

    public static void createTable() {

    

        String createTableDayWithDate = "create table IF NOT EXISTS table_with_date(id int(5) primary key auto_increment,"
                + "day int(2),meal_date date)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(createTableDayWithDate);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void dropTblDayWithDate() {

        String createTableDayWithDate = "drop table table_with_date";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(createTableDayWithDate);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
     public  int getDay(){
         int day = 0;
         String sql = "select day from table_with_date";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                day = rs.getInt(1);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return day;
     }
     
     public  Date getDate(){
         Date date = null;
         String sql = "select meal_date from table_with_date";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                date = rs.getDate(1);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return date;
     }
     
    public void inserInDayWithDate(int day, Date meal_date) {
        String stmt = "insert into table_with_date(day,meal_date) values(?,?)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setInt(1, day);
            ps.setDate(2, meal_date);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteFromDayWithDate(int day) {
        String stmt = "delete from table_with_date where day=?";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setInt(1, day);
            ps.execute();
            System.out.println("Removed a day");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static List<Date> getActualDateList(java.util.Date startDate, java.util.Date endDate) {
        java.util.Date fromDate = startDate;
        java.util.Date toDate = endDate;
        List<Date> dates = new ArrayList(25);
        Calendar cal = Calendar.getInstance();
        cal.setTime(fromDate);
        while (cal.getTime().before(toDate)) {

            dates.add(new java.sql.Date(cal.getTime().getTime()));
            cal.add(Calendar.DATE, 1);
        }

        return dates;
    }

    public void insertInDayWithDateTable(java.util.Date startDate, java.util.Date endDate) {
        int i = 1;
        for (Date date : getActualDateList(startDate, endDate)) {
            inserInDayWithDate(i, date);
            i++;
        }
    }
    
   

}
