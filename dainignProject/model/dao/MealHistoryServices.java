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
public class MealHistoryServices {

    public static void createMealHistoryTable(String month, String year) {
        String tblName = "meal_history_for_" + month + "_" + year;
        String tblCrtStmt = "create table IF NOT EXISTS " + tblName + "(id int(5)primary key auto_increment,"
                + "member_cards int,payment varchar(5),meal_details_id int,active_days int,inactive_days int)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(tblCrtStmt);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
//    public int addMealHistoryForADay(String colName,String month, String year){
//        String tblName = "meal_history_for_" + month + "_" + year;
//        String sqlStmt = "alter table "+tblName+" add "+colName+" varchar(20)";
//        
//    }
}
