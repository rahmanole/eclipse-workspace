/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.conn.ConnectionForDB;

/**
 *
 * @author OLEE
 */
public class MealManageService {

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
}
