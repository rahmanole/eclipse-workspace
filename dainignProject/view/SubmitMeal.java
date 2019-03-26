/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.pojo.AssignedMonths;
import controller.pojo.Department;
import controller.pojo.Manager;
import controller.pojo.Member;
import controller.pojo.PersonalInfo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.dao.AssignedMonthsServices;
import model.dao.DeptNmaesServices;
import model.dao.MealManageService;
import model.dao.MemberServices;
import model.dao.OffDaysServices;
import model.dao.PersonalInfoServices;

/**
 *
 * @author OLEE
 */
public class SubmitMeal extends javax.swing.JFrame {

    /**
     * Creates new form PersonalInfo
     */
    MemberServices memberServices = new MemberServices();
    DeptNmaesServices deptNmaesServices = new DeptNmaesServices();
    MealManageService mealManageService = new MealManageService();

    String monthName = "";
    String year = "";
    Manager manager = null;

    public SubmitMeal(Manager manager) {

        initComponents();
        monthName = manager.getMonthName();
        year = manager.getYear();
        this.manager = manager;

        lbl_title.setText("Month Name:" + manager.getMonthName() + " " + manager.getYear());
        this.setTitle("Registrar Memebr");

        t_cardNoForStart.setBackground(new Color(0, 0, 0, 0));
        t_cardNoForStop.setBackground(new Color(0, 0, 0, 0));
        pnl_sideBar.setBackground(new Color(0, 0, 0, 100));

        designTable(tbl_started);
        designTable(tbl_stoped);

    }

    private SubmitMeal() {
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

        pnl_sideBar = new javax.swing.JPanel();
        sideBtn_addMontlyExpensess = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sideBtn_addMealDetails = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sideBtn_addmmeber2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        lbl_title1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btn_start = new javax.swing.JButton();
        lbl_msgsStart = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        t_cardNoForStart = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_stop = new javax.swing.JButton();
        lbl_msgsStop = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        t_cardNoForStop = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_startedToday = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_stoped = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        lbl_stopedToday = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_started = new javax.swing.JTable();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_sideBar.setBackground(new java.awt.Color(0, 0, 0));
        pnl_sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBtn_addMontlyExpensess.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_addMontlyExpensess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_addMontlyExpensess.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_addMontlyExpensess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_addMontlyExpensess.setText("Add Meal");
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

        sideBtn_addMealDetails.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_addMealDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_addMealDetails.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_addMealDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_addMealDetails.setText("Stop Meal");
        sideBtn_addMealDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_addMealDetails.setOpaque(true);
        sideBtn_addMealDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_addMealDetailsMouseClicked(evt);
            }
        });
        pnl_sideBar.add(sideBtn_addMealDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 40));

        jLabel15.setOpaque(true);
        pnl_sideBar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 10, 40));

        sideBtn_addmmeber2.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_addmmeber2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_addmmeber2.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_addmmeber2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_addmmeber2.setText("Start Meal");
        sideBtn_addmmeber2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_addmmeber2.setOpaque(true);
        sideBtn_addmmeber2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_addmmeber2MouseClicked(evt);
            }
        });
        pnl_sideBar.add(sideBtn_addmmeber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 40));

        jLabel16.setOpaque(true);
        pnl_sideBar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 10, 40));

        getContentPane().add(pnl_sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 650));

        lbl_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Month Information");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 1020, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Start Meal");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 70, 30));

        lbl_title1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_title1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title1.setText("Submit Meals");
        getContentPane().add(lbl_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 280, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 420, 10));

        btn_start.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_start.setForeground(new java.awt.Color(255, 255, 255));
        btn_start.setText("Start");
        btn_start.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_start.setContentAreaFilled(false);
        btn_start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        getContentPane().add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 100, 40));
        getContentPane().add(lbl_msgsStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 140, 30));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 250, 10));

        t_cardNoForStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cardNoForStart.setForeground(new java.awt.Color(255, 255, 255));
        t_cardNoForStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_cardNoForStart.setBorder(null);
        t_cardNoForStart.setOpaque(false);
        getContentPane().add(t_cardNoForStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 250, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Card No");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 70, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 20, 380));

        btn_stop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_stop.setForeground(new java.awt.Color(255, 255, 255));
        btn_stop.setText("Stop");
        btn_stop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_stop.setContentAreaFilled(false);
        btn_stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stopActionPerformed(evt);
            }
        });
        getContentPane().add(btn_stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, 100, 40));
        getContentPane().add(lbl_msgsStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 140, 30));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 180, 250, 10));

        t_cardNoForStop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cardNoForStop.setForeground(new java.awt.Color(255, 255, 255));
        t_cardNoForStop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_cardNoForStop.setBorder(null);
        t_cardNoForStop.setOpaque(false);
        getContentPane().add(t_cardNoForStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, 250, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Card No");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 70, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Stop Meal");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 70, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 420, 10));

        lbl_startedToday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_startedToday.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_startedToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 80, 30));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 420, 10));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cards Stared Meal Today");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 170, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 60, 30));

        tbl_stoped.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_stoped.setForeground(new java.awt.Color(255, 255, 255));
        tbl_stoped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Card No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_stoped.setRowHeight(30);
        jScrollPane2.setViewportView(tbl_stoped);
        if (tbl_stoped.getColumnModel().getColumnCount() > 0) {
            tbl_stoped.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 410, 100, 220));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 60, 30));

        lbl_stopedToday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_stopedToday.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_stopedToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, 80, 30));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 420, 10));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cards Stoped Meal Today");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 170, 30));

        tbl_started.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_started.setForeground(new java.awt.Color(255, 255, 255));
        tbl_started.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Card No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_started.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_started);
        if (tbl_started.getColumnModel().getColumnCount() > 0) {
            tbl_started.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 100, 220));

        lbl_bg.setBackground(new java.awt.Color(0, 102, 102));
        lbl_bg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_bg.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sideBtn_addMontlyExpensessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_addMontlyExpensessMouseClicked
        // TODO add your handling code here:
        new PrepareMonthView(manager).setVisible(true);
    }//GEN-LAST:event_sideBtn_addMontlyExpensessMouseClicked

    private void sideBtn_addMealDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_addMealDetailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sideBtn_addMealDetailsMouseClicked

    private void sideBtn_addmmeber2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_addmmeber2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sideBtn_addmmeber2MouseClicked

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        int cardNo = 0;
        int count = 0;
        try {
            cardNo = Integer.parseInt(t_cardNoForStart.getText().trim());
        } catch (NumberFormatException e) {
            lbl_msgsStart.setText("Enter only digit");
            lbl_msgsStart.setForeground(Color.red);
        }

        if (cardNo == 0 || cardNo < 0) {
            lbl_msgsStart.setText("Enter valid");
            lbl_msgsStart.setForeground(Color.red);
        } else {
            if (memberServices.isCardExists(cardNo)) {
                if (mealManageService.updateStartStopMeal(cardNo, "on") > 0) {
                    count++;
                    addToTable(cardNo,tbl_started);
                    lbl_startedToday.setText(count + "");
                    lbl_msgsStart.setText("Started Meal For " + cardNo);
                    lbl_msgsStart.setForeground(Color.GREEN);
                }
            } else {
                lbl_msgsStart.setText("Card doesn't exists");
                lbl_msgsStart.setForeground(Color.red);
            }

        }
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopActionPerformed
        // TODO add your handling code here:
        int cardNo = 0;
        int count = 0;
        try {
            cardNo = Integer.parseInt(t_cardNoForStop.getText().trim());
        } catch (NumberFormatException e) {
            lbl_msgsStop.setText("Enter only digit");
            lbl_msgsStop.setForeground(Color.red);
        }

        if (cardNo == 0 || cardNo < 0) {
            lbl_msgsStop.setText("Enter valid card");
            lbl_msgsStop.setForeground(Color.red);
        } else {
            if (memberServices.isCardExists(cardNo)) {
                if (mealManageService.updateStartStopMeal(cardNo, "off") > 0) {
                    count++;
                    addToTable(cardNo,tbl_stoped);
                    lbl_stopedToday.setText(count + "");
                    lbl_msgsStop.setText("Stoped Meal For " + cardNo);
                    lbl_msgsStop.setForeground(Color.GREEN);
                }
            } else {
                lbl_msgsStop.setText("Card doesn't exists");
                lbl_msgsStop.setForeground(Color.red);
            }

        }
    }//GEN-LAST:event_btn_stopActionPerformed
    private void addToTable(int cardNo,JTable tbl_name) {
        DefaultTableModel model = (DefaultTableModel) tbl_name.getModel();

        Object[] obj = new Object[1];

        obj[0] = cardNo + "";
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
            java.util.logging.Logger.getLogger(SubmitMeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmitMeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmitMeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmitMeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SubmitMeal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_start;
    private javax.swing.JButton btn_stop;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_msgsStart;
    private javax.swing.JLabel lbl_msgsStop;
    private javax.swing.JLabel lbl_startedToday;
    private javax.swing.JLabel lbl_stopedToday;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_title1;
    private javax.swing.JPanel pnl_sideBar;
    private javax.swing.JLabel sideBtn_addMealDetails;
    private javax.swing.JLabel sideBtn_addMontlyExpensess;
    private javax.swing.JLabel sideBtn_addmmeber2;
    private javax.swing.JTextField t_cardNoForStart;
    private javax.swing.JTextField t_cardNoForStop;
    private javax.swing.JTable tbl_started;
    private javax.swing.JTable tbl_stoped;
    // End of variables declaration//GEN-END:variables
}
