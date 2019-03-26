/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.MonthDetails;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.conn.ConnectionForDB;

/**
 *
 * @author OLEE
 */
public class MonthDetailsServices {

    private static final String TBL_NAME_PREFIX = "meal_records_of_";

    public static String tblCrtStmt = "create table IF NOT EXISTS month_details(id int(5)primary key auto_increment,"
            + "month_name varchar(55),year varchar(5),employee_fees double,total_days int,"
            + "total_fridays int,friday_mealRate double,total_normalDaymeals double ,normal_mealRate double,"
            + "feast_mealRate double,feast_date date)";

    public int save(MonthDetails month) {
        String inserStmt = "insert into month_details(month_name,year,employee_fees,total_days,total_fridays,friday_mealRate,"
                + "total_normalDaymeals,normal_mealRate,feast_mealRate,feast_date) values(?,?,?,?,?,?,?,?,?,?)";
        
         try {
            Connection conn = ConnectionForDB.connect();
            
            PreparedStatement ps = conn.prepareStatement(inserStmt);
            ps.setString(1, month.getMonthName());
            ps.setString(2, month.getYear());
            ps.setDouble(3, month.getEmployee_fees());
            ps.setInt(4, month.getTotalDays());
            ps.setInt(5, month.getTotalFridays());
            ps.setDouble(6, month.getFriDayMealRate());
            ps.setInt(7,month.getNumberOfNormalDaymeals());
            ps.setDouble(8, month.getNormalMealRate());
            ps.setDouble(9, month.getFeastMealRate());
            ps.setDate(10, month.getFeastDate());
            ps.executeUpdate();
            
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
