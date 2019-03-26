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
public class MealDetailsServices {


    
    
    
    public static void createMealDetailsTable(String month,String year) {
        String tblName = "meal_details_for_"+month+"_"+year;
        String tblCrtStmt = "create table IF NOT EXISTS "+ tblName+"(id int(5)primary key auto_increment,"
            + "meal_date date,totalMeals int,meal_type varchar(10),actual_expensess double,spent_expenss double,"
            + "balance double,item_details varchar(1000),meal_histiry_id int,"
                + "foreign key (meal_histiry_id) references meal_history_for_"+ month+"_"+year+"(id))";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(tblCrtStmt);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}