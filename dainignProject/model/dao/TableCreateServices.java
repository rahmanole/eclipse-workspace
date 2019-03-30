package model.dao;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.conn.ConnectionForDB;

public class TableCreateServices {
    
    public static void main(String[] args) {
        createTable(DeptNmaesServices.tblCrtStmt);
        createTable(ManagerService.tblCrtStmt);
        createTable(MemberServices.tblCrtStmt);
        createTable(PersonalInfoServices.tblCrtStmt);
        createTable(RoleServices.tblCrtStmt);
        createTable(MonthDetailsServices.tblCrtStmt);
        createTable(SummaryService.createTblStmt);
        createTblLastDayMealHistory();
        uncertainCards();
    }
    
    public static void createTable(String sql) {
        
        try {
            Connection conn = ConnectionForDB.connect();
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void createTblLastDayMealHistory() {
        String sql = "create table IF NOT EXISTS last_day_meal_history(id int(5) primary key auto_increment,card_no int,on_or_off varchar(5))";
        try {
            Connection conn = ConnectionForDB.connect();
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void uncertainCards() {
        String sql = "create table IF NOT EXISTS uncertain_cards(id int(5) primary key auto_increment,"
                + "card_no int)";
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
