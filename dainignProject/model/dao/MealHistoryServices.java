/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.conn.ConnectionForDB;

/**
 *
 * @author OLEE
 */
public class MealHistoryServices {

    public static void createMealHistoryTable(String month, String year,List<Integer> cardList,Date startDate,int totalDays) {
        String tblName = "meal_history_for_" + month + "_" + year;
        String tblCrtStmt = "create table IF NOT EXISTS " + tblName + "(id int(5)primary key auto_increment,"
                + "meal_date date,card_no int)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(tblCrtStmt);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        for(int cardNo:cardList){
            addCol(cardNo,tblName);
        }
        
        insertAllDate(totalDays,startDate, tblName);
        
    }
    

    
    private static  void addCol(int cardNo,String tblName){
        String stmt = "altert table "+tblName+" add column "+cardNo+" varchar(6)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.execute();
            System.out.println("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void insertOneDate(Date date,String tblName){
        String stmt = "insert into "+tblName+"(meal_date) values(?)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setDate(1, date);
            ps.execute();
            System.out.println("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void insertAllDate(int totalDays,Date startDate,String tblName){
        long timeMills = startDate.getTime();
        
        for(int i=0;i<totalDays;i++){
            insertOneDate(new Date(i*86400000+timeMills),tblName);
        }
        long x = 35*86400000;
        System.out.println("Date inserted");
    }
}
