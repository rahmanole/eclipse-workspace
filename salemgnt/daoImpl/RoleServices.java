package daoImpl;

import conn.ConnectionDB;
import dao.RoleDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Role;

public class RoleServices implements RoleDAO {

    @Override
    public boolean createTable(String s) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = ConnectionDB.connecet();
        //String createTable = "create table if not exists role(id int(2) primary key auto_increment,role_name varchar(55) not null unique)";

        boolean flag = false;
        try {
            PreparedStatement ps = conn.prepareStatement(s);
            ps.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return flag;
    }

    public boolean isRoleExists(String roleName) {
        boolean flag = false;

        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            Connection conn = ConnectionDB.connecet();
            String sql = "select * from role where role_name=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, roleName);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                flag = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    @Override
    public void save(Role role) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            Connection conn = ConnectionDB.connecet();
            String sql = "insert into role(role_name) values(?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, role.getRoleName());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void update(Role role) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getRolesById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public Role getRoleByRoleName(String roleName) {
        Role role = new Role();
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            Connection conn = ConnectionDB.connecet();

            String query = "select * from role where role_name=?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, roleName);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                role.setId(rs.getInt(1));
                role.setRoleName(rs.getString(2));
            }
            return role;
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return role;
    }

    @Override
    public boolean deleteRole(String roleName) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean flag = true;
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            Connection conn = ConnectionDB.connecet();

            String query = "delete from role where role_name=?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, roleName);
            if(!isRoleExists(roleName)){
                ps.execute();
            }
        } catch (SQLException ex) {
            flag = false;
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }

    @Override
    public List<Role> getRoles() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Role> roles = new ArrayList<>();
        String query  = "select * from role";
        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                roles.add(new Role(rs.getInt(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return roles;
    }

}
