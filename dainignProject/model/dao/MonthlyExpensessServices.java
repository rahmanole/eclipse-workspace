package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.Manager;
import controller.pojo.MonthlyExpense;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.conn.ConnectionForDB;

public class MonthlyExpensessServices {

    SummaryService summaryService = new SummaryService();
    MealHistoryServices mealHistoryServices = new MealHistoryServices();
    List<Integer> cardListInSummaryTable = summaryService.getCardList();

    public void createMontlyExpenseTable(Manager manager) {

        String tblName = "monthly_expense_" + manager.getMonthName() + "_" + manager.getYear();

        String creatTblStmt = "create table IF NOT EXISTS " + tblName + "(id int(5)primary key auto_increment,"
                + "card_no int,previsous_month_bumping double,needtopay double,payment_date date)";

        TableCreateServices.createTable(creatTblStmt);
    }

    public void saveMonthlyExpense(MonthlyExpense monthlyExpense, Manager manager) {
        String tblName = "monthly_expense_" + manager.getMonthName() + "_" + manager.getYear();
        String stmt = "insert into " + tblName + "(card_no,previsous_month_bumping,needtopay,payment_date) values(?,?,?,?)";
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setInt(1, monthlyExpense.getCardNo());
            ps.setDouble(2, monthlyExpense.getPrevious_month_bumpingMoney());
            ps.setDouble(3, monthlyExpense.getNeedToPay());
            ps.setDate(4, monthlyExpense.getPaymentDate());

            ps.executeUpdate();
            if(!cardListInSummaryTable.contains(monthlyExpense.getCardNo())){
                summaryService.save(monthlyExpense.getCardNo());
                mealHistoryServices.insertOneCard(monthlyExpense.getCardNo(), manager.getMonthName(), manager.getYear());
            }
             
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
