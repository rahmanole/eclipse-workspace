/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.Member;
import controller.pojo.Summary;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.conn.ConnectionForDB;

/**
 *
 * @author OLEE
 */
public class SummaryService {

    public static String createTblStmt = "create table IF NOT EXISTS summary(id int(5)primary key auto_increment,"
            + "card_no int,onDays int,offDays int,bumping double)";
    


    public int save(Summary lastMonthSummary) {
        String insertStmt = "update summary set  onDays=?,offDays=?,bumping=? where card_no = ?";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(insertStmt);

            ps.setInt(1, lastMonthSummary.getOnDays());
            ps.setInt(2, lastMonthSummary.getOffDays());
            ps.setDouble(3, lastMonthSummary.getBumping());
            ps.setInt(4, lastMonthSummary.getCardNo());
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }

    public int save(int cardNo) {
        String insertStmt = "insert into summary(card_no) values(?)";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(insertStmt);
            ps.setInt(1, cardNo);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }

    public Summary getLastMonthSummaryByCardNo(int cardNo) {
        Summary lastMonthSummary = null;
        String sql = "select * from summary where card_no=?";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,cardNo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                lastMonthSummary = new Summary(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lastMonthSummary;
    }
    
    public List<Integer> getCardList(){
        ArrayList<Integer> cardList = new ArrayList<>();
        String sql = "select card_no from summary";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cardList.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return cardList;
    }
}
