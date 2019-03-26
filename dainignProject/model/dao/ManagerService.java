/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.Manager;
import controller.pojo.Member;
import java.awt.Color;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import model.conn.ConnectionForDB;

/**
 *
 * @author ccsl-pc
 */
public class ManagerService {
    
    MemberServices memberServices = new MemberServices();
    
    public static String tblCrtStmt = "create table manager(id int(5) primary key auto_increment,card_no int(5),month_name varchar(10),"
            + "year varchar(5),pin varchar(55))";
    

    public boolean isManagerAssignedForThisMonth(String month,String year) {
        String sql = "select * from manager where month_name=? and year =?";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, month);
            ps.setString(2,year);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int save(Manager manager, JLabel lbl) {
        String insert = "insert into manager(card_no,month_name,year,pin) values(?,?,?,?)";
        
        try {
            if (memberServices.isCardExists(manager.getCardNo())) {
                if (!memberServices.isCardAtive(manager.getCardNo())) {
                    Connection conn = ConnectionForDB.connect();
                    PreparedStatement ps = conn.prepareStatement(insert);
                    ps.setInt(1, manager.getCardNo());
                    ps.setString(2, manager.getMonthName());
                    ps.setString(3, manager.getYear());
                    ps.setString(4, manager.getPin());
                    ps.executeUpdate();
                    
                    lbl.setText("saved");
                    lbl.setForeground(Color.red);
                    
                    return 1;                    
                } else {
                    lbl.setText("Card not active");
                    lbl.setForeground(Color.red);
                }
            }else{
                 lbl.setText("Card doesn't exists");
                 lbl.setForeground(Color.red);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public List<Manager> getAllManager() {
        List<Manager> list = new ArrayList<>();
        
        String sql = "select * from manager";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                list.add(new Manager(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        
    }
    
    public Manager getManagerByPin(String pin) {
        Manager manager = null;
        String sql = "select * from manager where pin=?";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pin);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                return new Manager(rs.getInt(1), rs.getInt(2),rs.getString(3), rs.getString(4),rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return manager;
        
    }
    
}