/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.Department;
import controller.pojo.PersonalInfo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.conn.ConnectionForDB;
import static model.dao.PersonalInfoServices.sql;

/**
 *
 * @author ccsl-pc
 */
public class DeptNmaesServices {

    static String sql = "create table IF NOT EXISTS dept_names(id int(4) primary key auto_increment,dept_name varchar(55))";

//    public static void main(String[] args) {
//        TableCreateServices.createTable(sql);
//    }
    
//Save operation    
    public void save(String dept_name) {
        String insert = "insert into dept_names(dept_name) values(?)";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, dept_name);
            ps.execute();
        } catch (Exception e) {
        }
    }
//Retieving Dept ID by Name    

    public Department getDepartmentIdByName(String dept_name) {
        Department dept = null;
        String retrive = "select * from dept_names where id=?";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(retrive);
            ps.setString(1, dept_name);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                dept = new Department(rs.getInt(1), dept_name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dept;
    }
    //Retriveing dept name by id 

    public Department getDepartmentNameById(int dept_id) {
        Department dept = null;
        String retrive = "select * from dept_names where id=?";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(retrive);
            ps.setInt(1, dept_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                dept = new Department(dept_id, rs.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dept;
    }

    //All dept list
    public List<String> getDepartmentList() {
        List<String> deptList = new ArrayList<>();
        String retrive = "select dept_name from dept_names";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(retrive);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                deptList.add(rs.getString(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return deptList;
    }

    //Check if exits any dept name
    public boolean isDeptNameExists(String dept_name) {
        try {
            String delete = "select * from dept_names where dept_name=?";

            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, dept_name);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeptNmaesServices.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    //Delete any dept by name
    public void delete(String dept_name) throws SQLException {
        String delete = "delete from dept_names where dept_name=?";

        Connection conn = ConnectionForDB.connect();
        PreparedStatement ps = conn.prepareStatement(delete);
        ps.setString(1, dept_name);
        ps.execute();
    }

}
