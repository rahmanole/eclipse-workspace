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
import static model.dao.MealHistoryServices.getMonth;

/**
 *
 * @author Student J2ee-37
 */
public class MealStopService {

    MealHistoryServices mealHistoryServices = new MealHistoryServices();

    public static String offCardTbl = "create table IF NOT EXISTS off_cards(id int(5) primary key auto_increment,"
            + "card_no int(5) unique,start_daet date,end_date date)";
//   
//    public static List<Integer> getUncertainCardList() {
//        ArrayList<Integer> uncertainCards = new ArrayList<>();
//        String sql = "select card_no from uncertain_cards";
//        Member member = null;
//        try {
//            Connection conn = ConnectionForDB.connect();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                uncertainCards.add(rs.getInt(1));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return uncertainCards;
//    }

    public int svae(int cardNo, Date startDate, Date endDate) {
        String insert = "insert into off_cards(card_no,start_daet,end_date) values(?,?,?)";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, cardNo);
            ps.setDate(2, startDate);
            ps.setDate(3, endDate);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;

    }

    public int svae(int cardNo, Date startDate) {
        String insert = "insert into off_cards(card_no,start_daet) values(?,?)";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, cardNo);
            ps.setDate(2, startDate);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;

    }

    public int stopMeal(int cardNo) {
        String stmt = "update current_meal_status set on_or_off=? where card_no=?";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setString(1, "off");
            ps.setInt(2, cardNo);
            ps.execute();

            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return -1;
    }
    
    public List<Integer> getCardList(){
        ArrayList<Integer> cardList = new ArrayList<>();
        String sql = "select card_no from off_cards";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cardList.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return cardList;
    }

    public List<String> getLastDateList() {
        String sql = "select end_date from off_cards";
        List<String> lastDateList = new ArrayList<>();
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getDate(1) != null) {
                    lastDateList.add(MealHistoryServices.dateFormate(rs.getDate(1)));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lastDateList;
    }
    
    public void removeAccordingToLastDate(Date toDayMealDate){
        
        String sql = "delete from off_cards where end_date=?";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, toDayMealDate);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int removeFromOffCardList(int cardNo) {
        String sql = "delete from off_cards where card_no=?";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cardNo);
            ps.execute();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }

    public int insertIntoUncertain(int cardNo) {
        String insert = "insert into uncertain_cards(card_no) values(?)";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, cardNo);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public List<String> getDateListToStopMeal(int cardNo) {
        String sql = "select * from stop_meal_in_range where card_no=?";
        List<String> dateListToStopMeal = new ArrayList<>();
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cardNo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dateListToStopMeal = mealHistoryServices.getDateList(rs.getDate(13), rs.getDate(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dateListToStopMeal;
    }

}
