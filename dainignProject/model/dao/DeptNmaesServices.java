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

/**
 *
 * @author ccsl-pc
 */
public class DeptNmaesServices {

    static String sql = "create table IF NOT EXISTS dept_names(id int(4) primary key auto_increment,dept_name varchar(55))";
    
    
    public void save(String dept_name) throws SQLException{
        String insert = "insert into dept_names(dept_name) values(?)";
        
        Connection conn = ConnectionForDB.connect();
        PreparedStatement ps = conn.prepareStatement(insert);
        ps.setString(1, dept_name);
        ps.execute();
    }
    
    public Department getDepartment(int dept_id){
        Department dept = null;
        String retrive = "select * from dept_names where id=?";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(retrive);
            ps.setInt(1,dept_id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                dept = new Department(dept_id,rs.getString(2));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dept;
    }
    public void delete(String dept_name) throws SQLException{
        String delete = "delete from dept_names where dept_name=?";
        
        Connection conn = ConnectionForDB.connect();
        PreparedStatement ps = conn.prepareStatement(delete);
        ps.setString(1, dept_name);
        ps.execute();
    }
    
}
