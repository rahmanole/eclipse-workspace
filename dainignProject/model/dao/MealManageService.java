/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.Manager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import model.conn.ConnectionForDB;

/**
 *
 * @author OLEE
 */
public class MealManageService {

    public int stopMeal(Manager manager,String colName,int cardNo) {
        String tblName = "meal_history_for_" + manager.getMonthName() + "_" + manager.getYear();
        String stmt = "update "+tblName+" set "+colName+"=? where card_no=?";
        
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
    
    public int startMeal(Manager manager,String colName,int cardNo) {
        String tblName = "meal_history_for_" + manager.getMonthName() + "_" + manager.getYear();
        String stmt = "update "+tblName+" set "+colName+"=? where card_no=?";
        
        try {
            Connection conn = ConnectionForDB.connect();
            
            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setString(1, "on");
            ps.setInt(2, cardNo);
            ps.execute();
            
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return -1;
    }

    public int save(int cardNo) {
        String stmt = "insert into last_day_meal_history(card_no) values(?)";

        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setInt(1, cardNo);
            ps.execute();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return -1;
    }

    public int updateStartStopMeal(int cardNo, String flag) {
        String stmt = "update last_day_meal_history set on_or_off=? where card_no=?";

        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setString(1, flag);
            ps.setInt(2, cardNo);
            ps.execute();
            return 1;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return -1;
    }

    public List<Integer> cardList() {
        ArrayList<Integer> cardList = new ArrayList<>();
        String stmt = "select card_no from last_day_meal_history";

        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cardList.add(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Collections.sort(cardList);
        return cardList;
    }
}
