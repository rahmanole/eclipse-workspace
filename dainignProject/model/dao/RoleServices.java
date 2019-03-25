/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.Role;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import model.conn.ConnectionForDB;

/**
 *
 * @author Student J2ee-37
 */
public class RoleServices {

    MemberServices memberServices = new MemberServices();
    public static String sql = "create table IF NOT EXISTS role(id int(5)primary key auto_increment,"
            + "email varchar(55),role_name varchar(55),pin varchar(10))";

    public static void main(String[] args) {
        TableCreateServices.createTable(sql);
    }

    public int save(Role role, JLabel lbl) {
        String insert = "insert into role(email,role_name,pin) values(?,?,?)";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, role.getEmail());
            ps.setString(2, role.getRoleNmae());
            ps.setString(3, role.getPin());
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean isEmailExists(String email){
        String sql = "select * from role where email = ?";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
