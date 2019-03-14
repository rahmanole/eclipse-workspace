/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import conn.ConnectionDB;
import dao.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Role;
import pojo.User;

/**
 *
 * @author ccsl-pc
 */
public class UserDBServices implements UserDAO {

    @Override
    public boolean isEmailExists(String email) {
        boolean flag = false;
        try {
            Connection conn = ConnectionDB.connecet();
            String query = "select * from user where email=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBServices.class.getName()).log(Level.SEVERE, null, ex);
        }

        return flag;
    }

    public int saveUser(User user) {
        int flag = -1;
        try {
            Connection conn = ConnectionDB.connecet();
            String query = "insert into user(name,username,email,role_id,mobile,password) values(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user.getName());
            ps.setString(2, user.getUserName());
            ps.setString(3, user.getEmail());
            ps.setInt(4, user.getRole().getId());
            ps.setString(5, user.getMobile());
            ps.setString(6, user.getPass());
            ps.execute();
            flag = 1;
            System.out.println("User saved");

        } catch (SQLException ex) {
            Logger.getLogger(UserDBServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public Role getRoleByRoleName(String role_name) {
        Role role = null;
        try {
            Connection conn = ConnectionDB.connecet();
            String query = "select * from role where role_name=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, role_name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                role = new Role(rs.getInt(1), rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDBServices.class.getName()).log(Level.SEVERE, null, ex);
        }

        return role;
    }

    public Role getRoleByRoleId(int role_id) {
        Role role = null;
        try {
            Connection conn = ConnectionDB.connecet();
            String query = "select * from role where id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, role_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                role = new Role(rs.getInt(1), rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDBServices.class.getName()).log(Level.SEVERE, null, ex);
        }

        return role;
    }

    public List<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();

        String sql = "select * from user";
        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                users.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), getRoleByRoleId(rs.getInt(5)), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBServices.class.getName()).log(Level.SEVERE, null, ex);
        }

        return users;

    }

    //Get user by email
    public User getUserByEmail(String email) {
        User user = null;

        String sql = "select * from user where email=?";
        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), getRoleByRoleId(rs.getInt(5)), rs.getString(6), rs.getString(7));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDBServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    //For updateing  data
    public int update(User user) {
        int flag = -1;
        try {
            Connection conn = ConnectionDB.connecet();
            String query = "update user set name=?,username=?,email=?,role_id=?,mobile=?,password=? where id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user.getName());
            ps.setString(2, user.getUserName());
            ps.setString(3, user.getEmail());
            ps.setInt(4, user.getRole().getId());
            ps.setString(5, user.getMobile());
            ps.setString(6, user.getPass());
            ps.setInt(7, user.getId());
            ps.execute();
            System.out.println("Change saved");
            flag = 1;

        } catch (SQLException ex) {
            Logger.getLogger(UserDBServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
    //Delete methood
    
    public int delete(int dbId){
        int i = -1;
        
        try {
            Connection conn = ConnectionDB.connecet();
            String query = "delete from user where id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, dbId);
            ps.execute();
            System.out.println("Deleted");
            i = 1;
        } catch (SQLException ex) {
            Logger.getLogger(UserDBServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    
    //Finding Users
    public List<User> getUsersByRole(String role_name) {
        ArrayList<User> usersByRole = new ArrayList<>();
        
        int role_id = getRoleByRoleName(role_name).getId();
        
        String sql = "select * from user where role_id=?";
        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, role_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                usersByRole.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), getRoleByRoleId(rs.getInt(5)), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBServices.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usersByRole;

    }
    
}
