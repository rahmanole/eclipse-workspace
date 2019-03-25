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
import model.conn.ConnectionForDB;

/**
 *
 * @author ccsl-pc
 */
public class ManagerService {
    
    static String sql = "create table manager(id int(5),card_no int(5),month_name varchar(10),year varchar(5))";

    public static void main(String[] args) {
        TableCreateServices.createTable(sql);
    }
    
    public boolean isCardActive(int cardNo) {
        String sql = "select membership_status from member_info where card_no=?";
        boolean flag = false;
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cardNo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                flag = rs.getString(1).equalsIgnoreCase("Active") ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public int save(Manager manager) {
        String insert = "insert into manager(card_no,month_name,year) values(?,?,?)";
        
        try {
            if (isCardActive(manager.getCardNo())) {
                Connection conn = ConnectionForDB.connect();
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setInt(1, manager.getCardNo());
                ps.setString(2, manager.getMonthName());
                ps.setString(3, manager.getYear());
                ps.executeUpdate();
                
                return 1;                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    
}
