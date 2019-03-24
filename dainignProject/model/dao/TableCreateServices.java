package model.dao;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.conn.ConnectionForDB;


public class TableCreateServices {
    
   public static void createTable(String sql){
       
        try {
            Connection conn = ConnectionForDB.connect();
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } 
   
   public static void createOffDaysRecordTable(int cardNo){
        String sql = "create table IF NOT EXISTS offDays_for_"+cardNo+"(id int(5) primary key auto_increment,off_date date)";
        try {
            Connection conn = ConnectionForDB.connect();
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
   
   public static void createMonthsAssignedRecordTable(String sql,int cardNo){
       
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
