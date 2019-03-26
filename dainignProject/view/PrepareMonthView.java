/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.pojo.Manager;
import controller.pojo.MonthDetails;
import java.awt.Color;
import java.time.Month;
import java.time.YearMonth;
import java.sql.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.dao.DeptNmaesServices;
import model.dao.MealHistoryServices;
import model.dao.MealDetailsServices;
import model.dao.MemberServices;
import model.dao.MonthDetailsServices;

/**
 *
 * @author OLEE
 */
public class PrepareMonthView extends javax.swing.JFrame {

    /**
     * Creates new form PersonalInfo
     */
    MemberServices memberServices = new MemberServices();
    DeptNmaesServices deptNmaesServices = new DeptNmaesServices();
    MonthDetailsServices monthDetailsServices = new MonthDetailsServices();

    String monthName = "";
    String year = "";

    public PrepareMonthView(Manager manager) {

        initComponents();
        monthName = manager.getMonthName();
        year = manager.getYear();
        lbl_monthName.setText(monthName);
        lbl_year.setText(year);
        YearMonth yearMonthObject = YearMonth.of(Integer.parseInt(year), Month.valueOf(monthName.toUpperCase()).getValue());
        int daysInMonth = yearMonthObject.lengthOfMonth();
        t_totalDays.setText(daysInMonth + "");
        //t_friDays.setText(totalFridays()+"");
        lbl_title.setText("Month Name:" + manager.getMonthName() + " " + manager.getYear());

        this.setTitle("Registrar Memebr");
        lbl_bg.setBackground(new Color(0, 0, 0, 0));
        t_feastMealRate.setBackground(new Color(0, 0, 0, 0));
        t_totalDays.setBackground(new Color(0, 0, 0, 0));
        t_toalFridays.setBackground(new Color(0, 0, 0, 0));
        t_fridayMealRate.setBackground(new Color(0, 0, 0, 0));
        t_totalNoramlDays.setBackground(new Color(0, 0, 0, 0));
        t_normalMealRate.setBackground(new Color(0, 0, 0, 0));
        t_empFees.setBackground(new Color(0, 0, 0, 0));
        //jDateChooser1.setBackground(new Color(0, 0, 0, 0));

        pnl_sideBar.setBackground(new Color(0, 0, 0, 100));

    }

    private PrepareMonthView() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    private int totalFridays(){
//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.MONTH, Month.valueOf(monthName.toUpperCase()).getValue()); // may is just an example
//        c.set(Calendar.YEAR, Integer.parseInt(year));
//        
//        return Calendar.FRIDAY;
//    }
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

        pnl_sideBar = new javax.swing.JPanel();
        sideBtn_addmmeber = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sideBtn_addMontlyExpensess = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_monthName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_year = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        t_feastMealRate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        t_totalDays = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        t_toalFridays = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_msgs = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t_totalNoramlDays = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        drpDown_member = new javax.swing.JPanel();
        btn_addMember = new javax.swing.JLabel();
        btn_editMember = new javax.swing.JLabel();
        btn_removeMember = new javax.swing.JLabel();
        lbl_title1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t_fridayMealRate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t_empFees = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        t_normalMealRate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        date_feastDate = new com.toedter.calendar.JDateChooser();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_sideBar.setBackground(new java.awt.Color(0, 0, 0));
        pnl_sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBtn_addmmeber.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_addmmeber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_addmmeber.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_addmmeber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_addmmeber.setText("Add Member");
        sideBtn_addmmeber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_addmmeber.setOpaque(true);
        sideBtn_addmmeber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_addmmeberMouseClicked(evt);
            }
        });
        pnl_sideBar.add(sideBtn_addmmeber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 40));

        jLabel13.setOpaque(true);
        pnl_sideBar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 10, 40));

        sideBtn_addMontlyExpensess.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_addMontlyExpensess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_addMontlyExpensess.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_addMontlyExpensess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_addMontlyExpensess.setText("Preapre Month");
        sideBtn_addMontlyExpensess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_addMontlyExpensess.setOpaque(true);
        sideBtn_addMontlyExpensess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_addMontlyExpensessMouseClicked(evt);
            }
        });
        pnl_sideBar.add(sideBtn_addMontlyExpensess, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 40));

        jLabel14.setOpaque(true);
        pnl_sideBar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 10, 40));

        getContentPane().add(pnl_sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 650));

        lbl_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Personal Information");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 1020, 20));

        lbl_monthName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_monthName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_monthName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_monthName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 250, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 250, 10));

        lbl_year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_year.setForeground(new java.awt.Color(255, 255, 255));
        lbl_year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 250, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 250, 10));

        t_feastMealRate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_feastMealRate.setForeground(new java.awt.Color(255, 255, 255));
        t_feastMealRate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_feastMealRate.setBorder(null);
        t_feastMealRate.setOpaque(false);
        getContentPane().add(t_feastMealRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 250, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Fees");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 100, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 250, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Feast Meal Rate");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 100, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 280, 250, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Days");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 100, 30));

        t_totalDays.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_totalDays.setForeground(new java.awt.Color(255, 255, 255));
        t_totalDays.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_totalDays.setBorder(null);
        t_totalDays.setOpaque(false);
        getContentPane().add(t_totalDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 250, 30));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 250, 10));

        t_toalFridays.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_toalFridays.setForeground(new java.awt.Color(255, 255, 255));
        t_toalFridays.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_toalFridays.setBorder(null);
        t_toalFridays.setOpaque(false);
        getContentPane().add(t_toalFridays, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 250, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Fridays");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 80, 30));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 250, 10));
        getContentPane().add(lbl_msgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 380, 140, 30));

        btn_save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save");
        btn_save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_save.setContentAreaFilled(false);
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 430, 100, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Feast Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 80, 30));

        t_totalNoramlDays.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_totalNoramlDays.setForeground(new java.awt.Color(255, 255, 255));
        t_totalNoramlDays.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_totalNoramlDays.setBorder(null);
        t_totalNoramlDays.setOpaque(false);
        getContentPane().add(t_totalNoramlDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, 250, 30));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 160, 250, 10));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 10, 420));

        btn_addMember.setBackground(new java.awt.Color(51, 0, 153));
        btn_addMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_addMember.setForeground(new java.awt.Color(255, 255, 255));
        btn_addMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_addMember.setText("Add Member");
        btn_addMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addMember.setOpaque(true);

        btn_editMember.setBackground(new java.awt.Color(51, 0, 153));
        btn_editMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_editMember.setForeground(new java.awt.Color(255, 255, 255));
        btn_editMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_editMember.setText("Edit Info");
        btn_editMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editMember.setOpaque(true);

        btn_removeMember.setBackground(new java.awt.Color(51, 0, 153));
        btn_removeMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_removeMember.setForeground(new java.awt.Color(255, 255, 255));
        btn_removeMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_removeMember.setText("Remove Member");
        btn_removeMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_removeMember.setOpaque(true);

        javax.swing.GroupLayout drpDown_memberLayout = new javax.swing.GroupLayout(drpDown_member);
        drpDown_member.setLayout(drpDown_memberLayout);
        drpDown_memberLayout.setHorizontalGroup(
            drpDown_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drpDown_memberLayout.createSequentialGroup()
                .addGroup(drpDown_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_addMember, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editMember, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_removeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        drpDown_memberLayout.setVerticalGroup(
            drpDown_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drpDown_memberLayout.createSequentialGroup()
                .addComponent(btn_addMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_removeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(drpDown_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 130, 180));

        lbl_title1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_title1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title1.setText("Monthly Expenses ");
        getContentPane().add(lbl_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 280, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Month Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Year");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, 30));

        t_fridayMealRate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_fridayMealRate.setForeground(new java.awt.Color(255, 255, 255));
        t_fridayMealRate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_fridayMealRate.setBorder(null);
        t_fridayMealRate.setOpaque(false);
        getContentPane().add(t_fridayMealRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 250, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Normal Days");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 80, 30));

        t_empFees.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_empFees.setForeground(new java.awt.Color(255, 255, 255));
        t_empFees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_empFees.setBorder(null);
        t_empFees.setOpaque(false);
        getContentPane().add(t_empFees, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 250, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Friday Meal Rate");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 100, 30));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 250, 10));

        t_normalMealRate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_normalMealRate.setForeground(new java.awt.Color(255, 255, 255));
        t_normalMealRate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_normalMealRate.setBorder(null);
        t_normalMealRate.setOpaque(false);
        getContentPane().add(t_normalMealRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 190, 250, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Normal Meal Rate");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 110, 30));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 220, 250, 10));

        date_feastDate.setDateFormatString("d-MM- yyyy");
        getContentPane().add(date_feastDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 320, 250, 30));

        lbl_bg.setBackground(new java.awt.Color(0, 102, 102));
        lbl_bg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_bg.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bg.setOpaque(true);
        getContentPane().add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        double employee_fees = 0;
        int totalDays = 0;
        int totalFridays = 0;
        double friDayMealRate = 0;
        int numberOfNormalDaymeals = 0;
        double normalMealRate = 0;
        double feastMealRate = 0;

        try {
            employee_fees = Double.parseDouble(t_empFees.getText().trim());
            totalDays = Integer.parseInt(t_totalDays.getText().trim());
            totalFridays = Integer.parseInt(t_totalDays.getText().trim());;
            friDayMealRate = Double.parseDouble(t_fridayMealRate.getText().trim());
            numberOfNormalDaymeals = Integer.parseInt(t_totalNoramlDays.getText().trim());;;
            normalMealRate = Double.parseDouble(t_normalMealRate.getText().trim());;
            feastMealRate = Double.parseDouble(t_feastMealRate.getText().trim());;
        } catch (NumberFormatException e) {
            lbl_msgs.setText("Enter number not symbol or text");
            lbl_msgs.setForeground(Color.red);
            return;
        }
        Date feastDate = new java.sql.Date(date_feastDate.getDate().getTime());;

        if (employee_fees == 0 || totalDays == 0 || totalFridays == 0 || friDayMealRate == 0 || numberOfNormalDaymeals == 0
                || normalMealRate == 0 || feastMealRate == 0 || feastDate == null) {
            lbl_msgs.setText("Fill out all the fields");
            lbl_msgs.setForeground(Color.red);
        } else {
            MonthDetails monthDetails = new MonthDetails(monthName, year, employee_fees, totalDays, totalFridays, friDayMealRate, numberOfNormalDaymeals, normalMealRate, feastMealRate, feastDate);
            if (monthDetailsServices.save(monthDetails) > 0) {
                lbl_msgs.setText("Successfully saved");
                lbl_msgs.setForeground(Color.GREEN);
            } else {
                lbl_msgs.setText("Data not saved");
                lbl_msgs.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void sideBtn_addmmeberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_addmmeberMouseClicked
        // TODO add your handling code here:
        new Addmember().setVisible(true);
    }//GEN-LAST:event_sideBtn_addmmeberMouseClicked

    private void sideBtn_addMontlyExpensessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_addMontlyExpensessMouseClicked
        // TODO add your handling code here:
        new PrepareMonthView().setVisible(true);
    }//GEN-LAST:event_sideBtn_addMontlyExpensessMouseClicked
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
            java.util.logging.Logger.getLogger(PrepareMonthView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrepareMonthView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrepareMonthView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrepareMonthView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrepareMonthView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_addMember;
    private javax.swing.JLabel btn_editMember;
    private javax.swing.JLabel btn_removeMember;
    private javax.swing.JButton btn_save;
    private com.toedter.calendar.JDateChooser date_feastDate;
    private javax.swing.JPanel drpDown_member;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_monthName;
    private javax.swing.JLabel lbl_msgs;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_title1;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JPanel pnl_sideBar;
    private javax.swing.JLabel sideBtn_addMontlyExpensess;
    private javax.swing.JLabel sideBtn_addmmeber;
    private javax.swing.JTextField t_empFees;
    private javax.swing.JTextField t_feastMealRate;
    private javax.swing.JTextField t_fridayMealRate;
    private javax.swing.JTextField t_normalMealRate;
    private javax.swing.JTextField t_toalFridays;
    private javax.swing.JTextField t_totalDays;
    private javax.swing.JTextField t_totalNoramlDays;
    // End of variables declaration//GEN-END:variables
}
