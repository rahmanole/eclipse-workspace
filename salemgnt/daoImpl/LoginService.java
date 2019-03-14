/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ccsl-pc
 */
public class LoginService {
    
    public boolean logInVerify(String username,String password){
        boolean flag = false;
        String sql = "select password from user where username=?";
        
        Connection con = conn.ConnectionDB.connecet();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(password.equalsIgnoreCase(rs.getString(2))){
                flag = true;
            }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public boolean isUserExists(String username){
        boolean flag = false;
        String sql = "select * from user where username=?";
        
        Connection con = conn.ConnectionDB.connecet();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                flag = true;
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
}
