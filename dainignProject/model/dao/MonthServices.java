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
public class MonthServices {
    private static final String TBL_NAME_PREFIX = "meal_records_of_";
    
    String tblCreate = "create table IF NOT EXISTS month(id int(5)primary key auto_increment,"
            + "monthName varchar(55),year varchar(5),totalDays int,numberOfFriDaymeals int,"
            + "numberOfNormalDaymeals int,mealRate double,feastMealRate double ,employee_fees double)";
    
    
    public void createMealHistoryTable(String monthNmae){
        String tableNmae = TBL_NAME_PREFIX + monthNmae;
        String sql = "create table "+tableNmae+"(id int,cardNo int)";
        try {
            Connection conn = ConnectionForDB.connect();
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
}
