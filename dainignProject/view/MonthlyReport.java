package view;

import controller.pojo.Manager;
import controller.pojo.Summary;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.dao.DeptNmaesServices;
import model.dao.*;

public class MonthlyReport extends javax.swing.JFrame {

    /**
     * Creates new form PersonalInfo
     */
    MemberServices memberServices = new MemberServices();
    DeptNmaesServices deptNmaesServices = new DeptNmaesServices();
    MealHistoryServices mealHistoryServices = new MealHistoryServices();
    MonthlyExpensessServices monthlyExpensessServices = new MonthlyExpensessServices();

    ArrayList<String> deptNames = (ArrayList<String>) deptNmaesServices.getDepartmentList();
    LogingPage logingPage = new LogingPage();
    String monthName = "";
    String year = "";
    Manager manager = logingPage.manager;

    public MonthlyReport(Manager manager) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.manager = manager;
        monthName = manager.getMonthName();
        year = manager.getYear();

        lbl_isManagerNull.setText("Month Name:" + manager.getMonthName() + " " + manager.getYear());
        this.setTitle("Montly Report");
        lbl_bg.setBackground(new Color(0, 0, 0, 0));
        t_cardNo.setBackground(new Color(0, 0, 0, 0));

        pnl_sideBar.setBackground(new Color(0, 0, 0, 100));
        
        sideBtn_home.setBackground(new Color(0, 0, 0, 0));
        sideBtn_prePareMonth.setBackground(new Color(0, 0, 0, 0));
        sideBtn_addmmeber.setBackground(new Color(0, 0, 0, 0));
        sideBtn_collectExpense.setBackground(new Color(0, 0, 0, 0));
        sideBtn_editMeal.setBackground(new Color(0, 0, 0, 0));
        sideBtn_manageMeals.setBackground(new Color(0, 0, 0, 0));

        designTable(tbl_report);

    }

    private MonthlyReport() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void designTable(JTable tableName) {
        tableName.getTableHeader().setForeground(new Color(255, 255, 255));
        tableName.getTableHeader().setBackground(Color.BLACK);
        tableName.getTableHeader().setForeground(Color.black);

        ((DefaultTableCellRenderer) tableName.getDefaultRenderer(Object.class)).setOpaque(false);

        tableName.setBackground(new Color(0, 0, 0));
        //jScrollPane1.setBackground(new Color(0, 0, 0));
        //jScrollPane1.getViewport().setOpaque(false);
        tableName.setShowGrid(true);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableName.setDefaultRenderer(String.class, centerRenderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lbl_title1 = new javax.swing.JLabel();
        t_cardNo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_msgs = new javax.swing.JLabel();
        lbl_title4 = new javax.swing.JLabel();
        btn_details = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_report = new javax.swing.JTable();
        lbl_isManagerNull = new javax.swing.JLabel();
        pnl_sideBar = new javax.swing.JPanel();
        sideBtn_home = new javax.swing.JPanel();
        ind_home = new javax.swing.JLabel();
        lbl_home = new javax.swing.JLabel();
        sideBtn_prePareMonth = new javax.swing.JPanel();
        lbl_ddd = new javax.swing.JLabel();
        ind_prepMonth = new javax.swing.JLabel();
        sideBtn_manageMeals = new javax.swing.JPanel();
        lbl_sss = new javax.swing.JLabel();
        ind_nextMeal = new javax.swing.JLabel();
        sideBtn_collectExpense = new javax.swing.JPanel();
        lbl_exp = new javax.swing.JLabel();
        ind_collectEx = new javax.swing.JLabel();
        sideBtn_editMeal = new javax.swing.JPanel();
        lbl_fff = new javax.swing.JLabel();
        sideBtn_report = new javax.swing.JPanel();
        lbl_rr = new javax.swing.JLabel();
        ind_editMeal = new javax.swing.JLabel();
        sideBtn_addmmeber = new javax.swing.JPanel();
        lbl_ccc = new javax.swing.JLabel();
        ind_addMember = new javax.swing.JLabel();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 1020, 20));

        lbl_title1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_title1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title1.setText("Manager Dashboard");
        getContentPane().add(lbl_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 280, 30));

        t_cardNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cardNo.setForeground(new java.awt.Color(255, 255, 255));
        t_cardNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_cardNo.setBorder(null);
        t_cardNo.setOpaque(false);
        getContentPane().add(t_cardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 250, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 250, 10));

        lbl_msgs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_msgs.setForeground(new java.awt.Color(255, 255, 255));
        lbl_msgs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_msgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 250, 30));

        lbl_title4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_title4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title4.setText("Card No");
        getContentPane().add(lbl_title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 70, 30));

        btn_details.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_details.setForeground(new java.awt.Color(255, 255, 255));
        btn_details.setText("Details");
        btn_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_details.setContentAreaFilled(false);
        btn_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 100, 40));

        tbl_report.setBackground(new java.awt.Color(0, 0, 0));
        tbl_report.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_report.setForeground(new java.awt.Color(255, 255, 255));
        tbl_report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fields", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_report.setRowHeight(40);
        jScrollPane1.setViewportView(tbl_report);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 360, 390));

        lbl_isManagerNull.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_isManagerNull.setForeground(new java.awt.Color(255, 255, 255));
        lbl_isManagerNull.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_isManagerNull, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 250, 30));

        pnl_sideBar.setBackground(new java.awt.Color(0, 0, 0));
        pnl_sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBtn_home.setBackground(new java.awt.Color(51, 51, 51));
        sideBtn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_home.setOpaque(true);
        sideBtn_home.add(ind_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 10, 40));

        lbl_home.setBackground(new java.awt.Color(0, 0, 0));
        lbl_home.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_home.setForeground(new java.awt.Color(255, 255, 255));
        lbl_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Home_22px_3.png"))); // NOI18N
        lbl_home.setText("Home");
        lbl_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_home.setIconTextGap(20);
        lbl_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homeMouseClicked(evt);
            }
        });
        sideBtn_home.add(lbl_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 40));

        pnl_sideBar.add(sideBtn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 40));

        sideBtn_prePareMonth.setBackground(new java.awt.Color(0, 153, 102));
        sideBtn_prePareMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_prePareMonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_prePareMonthMouseClicked(evt);
            }
        });
        sideBtn_prePareMonth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ddd.setBackground(new java.awt.Color(0, 0, 0));
        lbl_ddd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ddd.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ddd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Today_22px.png"))); // NOI18N
        lbl_ddd.setText("Preapre Month");
        lbl_ddd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_ddd.setIconTextGap(20);
        sideBtn_prePareMonth.add(lbl_ddd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 40));
        sideBtn_prePareMonth.add(ind_prepMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        pnl_sideBar.add(sideBtn_prePareMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 40));

        sideBtn_manageMeals.setBackground(new java.awt.Color(0, 153, 102));
        sideBtn_manageMeals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_manageMeals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_manageMealsMouseClicked(evt);
            }
        });
        sideBtn_manageMeals.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_sss.setBackground(new java.awt.Color(0, 0, 0));
        lbl_sss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_sss.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Cutlery_22px.png"))); // NOI18N
        lbl_sss.setText("Add Next Meal");
        lbl_sss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_sss.setIconTextGap(20);
        sideBtn_manageMeals.add(lbl_sss, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 40));
        sideBtn_manageMeals.add(ind_nextMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        pnl_sideBar.add(sideBtn_manageMeals, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 200, 40));

        sideBtn_collectExpense.setBackground(new java.awt.Color(0, 153, 102));
        sideBtn_collectExpense.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_collectExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_collectExpenseMouseClicked(evt);
            }
        });
        sideBtn_collectExpense.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_exp.setBackground(new java.awt.Color(0, 0, 0));
        lbl_exp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_exp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Paycheque_22px_1.png"))); // NOI18N
        lbl_exp.setText("Collect Expense");
        lbl_exp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exp.setIconTextGap(20);
        sideBtn_collectExpense.add(lbl_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 40));
        sideBtn_collectExpense.add(ind_collectEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        pnl_sideBar.add(sideBtn_collectExpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 40));

        sideBtn_editMeal.setBackground(new java.awt.Color(51, 51, 51));
        sideBtn_editMeal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_editMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_editMealMouseClicked(evt);
            }
        });
        sideBtn_editMeal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_fff.setBackground(new java.awt.Color(0, 0, 0));
        lbl_fff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_fff.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Edit_Property_22px_1.png"))); // NOI18N
        lbl_fff.setText("Edit Meal Details");
        lbl_fff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_fff.setIconTextGap(20);
        lbl_fff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fffMouseClicked(evt);
            }
        });
        sideBtn_editMeal.add(lbl_fff, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 40));

        pnl_sideBar.add(sideBtn_editMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 40));

        sideBtn_report.setBackground(new java.awt.Color(51, 51, 51));
        sideBtn_report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_reportMouseClicked(evt);
            }
        });
        sideBtn_report.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_rr.setBackground(new java.awt.Color(0, 0, 0));
        lbl_rr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_rr.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Report_Card_22px_3.png"))); // NOI18N
        lbl_rr.setText("View Report");
        lbl_rr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_rr.setIconTextGap(20);
        sideBtn_report.add(lbl_rr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 40));

        ind_editMeal.setBackground(new java.awt.Color(255, 255, 255));
        ind_editMeal.setOpaque(true);
        sideBtn_report.add(ind_editMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        pnl_sideBar.add(sideBtn_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 40));

        sideBtn_addmmeber.setBackground(new java.awt.Color(0, 153, 102));
        sideBtn_addmmeber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_addmmeber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_addmmeberMouseClicked(evt);
            }
        });
        sideBtn_addmmeber.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ccc.setBackground(new java.awt.Color(0, 0, 0));
        lbl_ccc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ccc.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ccc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_Member_22px_1.png"))); // NOI18N
        lbl_ccc.setText("Add Member");
        lbl_ccc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_ccc.setIconTextGap(20);
        sideBtn_addmmeber.add(lbl_ccc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 40));
        sideBtn_addmmeber.add(ind_addMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        pnl_sideBar.add(sideBtn_addmmeber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 40));

        getContentPane().add(pnl_sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 650));

        lbl_bg.setBackground(new java.awt.Color(0, 102, 102));
        lbl_bg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_bg.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/251850.jpg"))); // NOI18N
        lbl_bg.setOpaque(true);
        getContentPane().add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailsActionPerformed
        // TODO add your handling code here:
        int cardNo = 0;
        List<Integer> cardList = MealHistoryServices.getCardList(manager);
        try {
            cardNo = Integer.parseInt(t_cardNo.getText().trim());

        } catch (NumberFormatException e) {
            lbl_msgs.setText("Enter only number");
            lbl_msgs.setForeground(Color.red);
            return;
        }

        if (mealHistoryServices.isCardExists(cardNo, manager)) {
            Summary report = mealHistoryServices.getSummary(cardNo, manager);
            
            Object[][] values = {{"Card No.",report.getCardNo()},{"Total Meal",report.getTotalMeals()},{"Total On Meal",report.getTotalMeals()-report.getTotalOffMeal()},
                {"Normal Off Meal",report.getNormalOffDays()},{"Friday Off",report.getFridayOffMeal()},{"Feast",report.getWasFeastOn()?"Was on":"Was off"},
                {"Total Off Meal",report.getTotalOffMeal()},{"Remaining Balance",report.getBumping()},{"Payment status",monthlyExpensessServices.isPayemntPaid(cardNo, manager)}};
            

            
            DefaultTableModel model = (DefaultTableModel) tbl_report.getModel();
            model.setRowCount(0);
            for(Object[] value:values){
                addToTable(value);
            }
            
            
            
        } else {
            lbl_msgs.setText("This card was not in this month");
            lbl_msgs.setForeground(Color.red);

        }

    }//GEN-LAST:event_btn_detailsActionPerformed

    private void lbl_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homeMouseClicked
        // TODO add your handling code here:
        new ManagerDashboard(manager).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_homeMouseClicked

    private void sideBtn_prePareMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_prePareMonthMouseClicked
        // TODO add your handling code here:
        new PrepareMonthView(manager).setVisible(true);
    }//GEN-LAST:event_sideBtn_prePareMonthMouseClicked

    private void sideBtn_manageMealsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_manageMealsMouseClicked
        // TODO add your handling code here:

        new StartMealView(manager).setVisible(true);

    }//GEN-LAST:event_sideBtn_manageMealsMouseClicked

    private void sideBtn_collectExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_collectExpenseMouseClicked
        // TODO add your handling code here:

        new MonthlyExpenseView(manager).setVisible(true);

    }//GEN-LAST:event_sideBtn_collectExpenseMouseClicked

    private void lbl_fffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fffMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_fffMouseClicked

    private void sideBtn_editMealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_editMealMouseClicked
        // TODO add your handling code here:
        new EditMealDetailsView(manager).setVisible(true);
    }//GEN-LAST:event_sideBtn_editMealMouseClicked

    private void sideBtn_reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_reportMouseClicked
        // TODO add your handling code here:
        new MonthlyReport(manager).setVisible(true);
    }//GEN-LAST:event_sideBtn_reportMouseClicked

    private void sideBtn_addmmeberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_addmmeberMouseClicked
        // TODO add your handling code here:
        new Addmember().setVisible(true);
    }//GEN-LAST:event_sideBtn_addmmeberMouseClicked
    
    private void addToTable(Object[] values) {
        DefaultTableModel model = (DefaultTableModel) tbl_report.getModel();

        Object[] obj = new Object[2];

        obj[0] = values[0];
        obj[1] = values[1];
        model.addRow(obj);
    }
    //
//    private void addToTable(Member member) {
//        //DefaultTableModel model = (DefaultTableModel) tbl_pInfo.getModel();
//
//        Object[] obj = new Object[6];
//
//        obj[0] = persoanlInfo.getName();
//        obj[1] = persoanlInfo.getContNum();
//        obj[2] = persoanlInfo.getEmail();
//        obj[3] = persoanlInfo.getDeptName();
//        obj[4] = persoanlInfo.getRegNum();
//        obj[5] = persoanlInfo.getSession();
//
//        //model.addRow(obj);
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MonthlyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonthlyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonthlyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonthlyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlyReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_details;
    private javax.swing.JLabel ind_addMember;
    private javax.swing.JLabel ind_collectEx;
    private javax.swing.JLabel ind_editMeal;
    private javax.swing.JLabel ind_home;
    private javax.swing.JLabel ind_nextMeal;
    private javax.swing.JLabel ind_prepMonth;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_ccc;
    private javax.swing.JLabel lbl_ddd;
    private javax.swing.JLabel lbl_exp;
    private javax.swing.JLabel lbl_fff;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_isManagerNull;
    private javax.swing.JLabel lbl_msgs;
    private javax.swing.JLabel lbl_rr;
    private javax.swing.JLabel lbl_sss;
    private javax.swing.JLabel lbl_title1;
    private javax.swing.JLabel lbl_title4;
    private javax.swing.JPanel pnl_sideBar;
    private javax.swing.JPanel sideBtn_addmmeber;
    private javax.swing.JPanel sideBtn_collectExpense;
    private javax.swing.JPanel sideBtn_editMeal;
    private javax.swing.JPanel sideBtn_home;
    private javax.swing.JPanel sideBtn_manageMeals;
    private javax.swing.JPanel sideBtn_prePareMonth;
    private javax.swing.JPanel sideBtn_report;
    private javax.swing.JTextField t_cardNo;
    private javax.swing.JTable tbl_report;
    // End of variables declaration//GEN-END:variables
}
