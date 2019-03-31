/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.pojo.Manager;
import java.awt.Color;
import java.sql.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.dao.*;
import model.dao.MealHistoryServices;
import model.dao.MealManageService;
import model.dao.MemberServices;
import static view.StartMealView.day;

public class StopMealView extends javax.swing.JFrame {

    MemberServices memberServices = new MemberServices();
    DeptNmaesServices deptNmaesServices = new DeptNmaesServices();
    MealManageService mealManageService = new MealManageService();
    MealHistoryServices mealHistoryServices = new MealHistoryServices();
    MonthDetailsServices monthDetailsServices = new MonthDetailsServices();
    MealStopService mealStopService = new MealStopService();
    

    String monthName = "";
    String year = "";
    Manager manager = null;
    List<Integer> uncetainCards = null;
    List<String> dateList = null;
    
    static int day = MealDayAndDateServices.getDay();
    static Date meal_date = MealDayAndDateServices.getDate();

    public StopMealView(Manager manager) {

        initComponents();
        monthName = manager.getMonthName();
        year = manager.getYear();
        this.manager = manager;

        dateList = monthDetailsServices.getDateList(manager);
        
        lbl_dayInStopMeal.setText("Day " + day + "");
        lbl_dateInStopMeal.setText("Date " + meal_date.toString());

        lbl_title.setText("Month Name:" + manager.getMonthName() + " " + manager.getYear());
        this.setTitle("Registrar Memebr");

        t_cardNoToStopMoreThan.setBackground(new Color(0, 0, 0, 0));
        t_cardNoToStopOneDay.setBackground(new Color(0, 0, 0, 0));
        pnl_sideBar.setBackground(new Color(0, 0, 0, 100));

        lbl_endDateTitle.setVisible(false);
        date_endDate.setVisible(false);

    }

    private StopMealView() {
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
        jLabel14 = new javax.swing.JLabel();
        sideBtn_stopMeal = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sideBtn_startMeal = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_title1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_stopParticular = new javax.swing.JButton();
        lbl_particularStop = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        t_cardNoToStopMoreThan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_stopedToday = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        com_uncertain = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        btn_particularStop = new javax.swing.JButton();
        lbl_moreTheanOne = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t_cardNoToStopOneDay = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        date_endDate = new com.toedter.calendar.JDateChooser();
        lbl_endDateTitle = new javax.swing.JLabel();
        sideBtn_next = new javax.swing.JLabel();
        sideBtn_back = new javax.swing.JLabel();
        lbl_nextBtnmsgs = new javax.swing.JLabel();
        lbl_dayInStopMeal = new javax.swing.JLabel();
        lbl_dateInStopMeal = new javax.swing.JLabel();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_sideBar.setBackground(new java.awt.Color(0, 0, 0));
        pnl_sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setOpaque(true);
        pnl_sideBar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 10, 40));

        sideBtn_stopMeal.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_stopMeal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_stopMeal.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_stopMeal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_stopMeal.setText("Stop Meal");
        sideBtn_stopMeal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_stopMeal.setOpaque(true);
        sideBtn_stopMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_stopMealMouseClicked(evt);
            }
        });
        pnl_sideBar.add(sideBtn_stopMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 40));

        jLabel15.setOpaque(true);
        pnl_sideBar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 10, 40));

        sideBtn_startMeal.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_startMeal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_startMeal.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_startMeal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_startMeal.setText("Start Meal");
        sideBtn_startMeal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_startMeal.setOpaque(true);
        sideBtn_startMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_startMealMouseClicked(evt);
            }
        });
        pnl_sideBar.add(sideBtn_startMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 40));

        jLabel16.setOpaque(true);
        pnl_sideBar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 10, 40));

        getContentPane().add(pnl_sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 650));

        lbl_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Month Information");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 1020, 10));

        lbl_title1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_title1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title1.setText("Stop Meal");
        getContentPane().add(lbl_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 280, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 10, 340));

        btn_stopParticular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_stopParticular.setForeground(new java.awt.Color(255, 255, 255));
        btn_stopParticular.setText("Stop");
        btn_stopParticular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_stopParticular.setContentAreaFilled(false);
        btn_stopParticular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_stopParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stopParticularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_stopParticular, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, 90, 40));
        getContentPane().add(lbl_particularStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 250, 30));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 250, 10));

        t_cardNoToStopMoreThan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cardNoToStopMoreThan.setForeground(new java.awt.Color(255, 255, 255));
        t_cardNoToStopMoreThan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_cardNoToStopMoreThan.setBorder(null);
        t_cardNoToStopMoreThan.setOpaque(false);
        getContentPane().add(t_cardNoToStopMoreThan, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 250, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Card No");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 70, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Stop For This Meal Only");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 420, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 420, 10));

        lbl_stopedToday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_stopedToday.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_stopedToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 570, 80, 30));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 420, 10));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Stop meal for all uncertain card");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 420, 30));

        com_uncertain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        com_uncertain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uncertain", "Particular Date" }));
        com_uncertain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                com_uncertainItemStateChanged(evt);
            }
        });
        getContentPane().add(com_uncertain, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 250, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Type");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 70, 30));

        btn_particularStop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_particularStop.setForeground(new java.awt.Color(255, 255, 255));
        btn_particularStop.setText("Stop");
        btn_particularStop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_particularStop.setContentAreaFilled(false);
        btn_particularStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_particularStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_particularStopActionPerformed(evt);
            }
        });
        getContentPane().add(btn_particularStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 130, 40));
        getContentPane().add(lbl_moreTheanOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 360, 250, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Card No");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 70, 30));

        t_cardNoToStopOneDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cardNoToStopOneDay.setForeground(new java.awt.Color(255, 255, 255));
        t_cardNoToStopOneDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_cardNoToStopOneDay.setBorder(null);
        t_cardNoToStopOneDay.setOpaque(false);
        getContentPane().add(t_cardNoToStopOneDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 250, 30));

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 250, 10));
        getContentPane().add(date_endDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 250, 30));

        lbl_endDateTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_endDateTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_endDateTitle.setText("End Date");
        getContentPane().add(lbl_endDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 70, 30));

        sideBtn_next.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_next.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_next.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_next.setText("Next >>");
        sideBtn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_next.setOpaque(true);
        sideBtn_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_nextMouseClicked(evt);
            }
        });
        getContentPane().add(sideBtn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 100, 30));

        sideBtn_back.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_back.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_back.setText("<< Back");
        sideBtn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_back.setOpaque(true);
        sideBtn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_backMouseClicked(evt);
            }
        });
        getContentPane().add(sideBtn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 100, 30));
        getContentPane().add(lbl_nextBtnmsgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 250, 30));

        lbl_dayInStopMeal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_dayInStopMeal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dayInStopMeal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dayInStopMeal.setText("Day");
        getContentPane().add(lbl_dayInStopMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 60, 30));

        lbl_dateInStopMeal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_dateInStopMeal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dateInStopMeal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dateInStopMeal.setText("Date");
        getContentPane().add(lbl_dateInStopMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 120, 30));

        lbl_bg.setBackground(new java.awt.Color(0, 102, 102));
        lbl_bg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_bg.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bg.setOpaque(true);
        getContentPane().add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sideBtn_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_nextMouseClicked
        // TODO add your handling code here:
        lbl_nextBtnmsgs.setText("Wait....");

        List<Integer> offCards = mealStopService.getCardList();
        for (int offCard : offCards) {
            mealStopService.stopMeal(offCard);
        }

        List<Integer> cardsToUpdateMeal = mealManageService.cardList();

        Date toDayDate = null;
        if (meal_date == null) {
            lbl_nextBtnmsgs.setText("Select date");
            return;
        } else {
            toDayDate = new java.sql.Date(meal_date.getTime());
            if (dateList.contains(mealHistoryServices.dateFormate(toDayDate))) {
                for (int cardNo : cardsToUpdateMeal) {
                    mealHistoryServices.updateStatusForNextMeal(cardNo, toDayDate, manager);
                }
                new StopMealView(manager).setVisible(true);
            } else {
                lbl_nextBtnmsgs.setText("Keep selected this meal date");
                lbl_nextBtnmsgs.setForeground(Color.red);
                return;
            }
        }

        new MealDetailsView(manager).setVisible(true);
    }//GEN-LAST:event_sideBtn_nextMouseClicked

    private void sideBtn_stopMealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_stopMealMouseClicked
        // TODO add your handling code here:
        new StartMealView(manager).setVisible(true);
    }//GEN-LAST:event_sideBtn_stopMealMouseClicked

    private void sideBtn_startMealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_startMealMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sideBtn_startMealMouseClicked
    String flag = "Uncertain";
    private void btn_stopParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopParticularActionPerformed
        // TODO add your handling code here:
        flag = com_uncertain.getSelectedItem().toString();
        int cardNo = 0;
        try {
            cardNo = Integer.parseInt(t_cardNoToStopMoreThan.getText());
        } catch (NumberFormatException e) {
            lbl_particularStop.setText("Enter valid card No");
            lbl_particularStop.setForeground(Color.red);
        }

        if (cardNo > 0) {
            Date startDate = null;
            Date endDate = null;
            if (flag.equals("Particular Date")) {

                if (meal_date == null || date_endDate.getDate() == null) {
                    lbl_moreTheanOne.setText("Select date");
                    return;
                } else {
                    startDate = new java.sql.Date(meal_date.getTime());
                    endDate = new java.sql.Date(date_endDate.getDate().getTime());
                }
                if (dateList.contains(mealHistoryServices.dateFormate(startDate)) && dateList.contains(mealHistoryServices.dateFormate(startDate))) {
                    mealStopService.svae(cardNo, startDate, endDate);
                    lbl_moreTheanOne.setText("Meal Stoped");
                } else {
                    lbl_moreTheanOne.setText("Select this month date");
                }

            } else {
                if (startDate == null) {
                    lbl_moreTheanOne.setText("Select date");
                    return;
                }
                if (dateList.contains(mealHistoryServices.dateFormate(startDate))) {
                    mealStopService.svae(cardNo, startDate);
                    lbl_moreTheanOne.setText("Meal Stoped");
                } else {
                    lbl_moreTheanOne.setText("Select this month date");
                }

            }
        } else {
            lbl_particularStop.setText("Enter valid No");
            lbl_particularStop.setForeground(Color.red);
        }

    }//GEN-LAST:event_btn_stopParticularActionPerformed

    private void com_uncertainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_com_uncertainItemStateChanged
        // TODO add your handling code here:
        flag = com_uncertain.getSelectedItem().toString();
        if (flag.equals("Uncertain")) {
            lbl_endDateTitle.setVisible(false);
            date_endDate.setVisible(false);
        } else {
            lbl_endDateTitle.setVisible(true);
            date_endDate.setVisible(true);
        }

    }//GEN-LAST:event_com_uncertainItemStateChanged

    private void btn_particularStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_particularStopActionPerformed
        // TODO add your handling code here:

        Date startDate = new java.sql.Date(meal_date.getTime());
        int cardNo = 0;
        try {
            cardNo = Integer.parseInt(t_cardNoToStopOneDay.getText());

        } catch (NumberFormatException e) {
            lbl_particularStop.setText("Enter valid card No");
            lbl_particularStop.setForeground(Color.red);
            return;
        }

        if (mealHistoryServices.isCardExists(cardNo, manager)) {
            mealStopService.stopMeal(cardNo);
            lbl_particularStop.setText("Meal Stope for " + cardNo);
            lbl_particularStop.setForeground(Color.red);
        } else {
            lbl_particularStop.setText("Add summary for " + cardNo);
            lbl_particularStop.setForeground(Color.red);
        }
    }//GEN-LAST:event_btn_particularStopActionPerformed

    private void sideBtn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_backMouseClicked
        // TODO add your handling code here:
        new StartMealView(manager).setVisible(true);
    }//GEN-LAST:event_sideBtn_backMouseClicked

    private void addToTable(int cardNo, JTable tbl_name) {
        DefaultTableModel model = (DefaultTableModel) tbl_name.getModel();

        Object[] obj = new Object[1];

        obj[0] = cardNo + "";
        model.addRow(obj);
    }

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
            java.util.logging.Logger.getLogger(StopMealView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StopMealView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StopMealView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StopMealView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StopMealView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_particularStop;
    private javax.swing.JButton btn_stopParticular;
    private javax.swing.JComboBox<String> com_uncertain;
    private com.toedter.calendar.JDateChooser date_endDate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_dateInStopMeal;
    private javax.swing.JLabel lbl_dayInStopMeal;
    private javax.swing.JLabel lbl_endDateTitle;
    private javax.swing.JLabel lbl_moreTheanOne;
    private javax.swing.JLabel lbl_nextBtnmsgs;
    private javax.swing.JLabel lbl_particularStop;
    private javax.swing.JLabel lbl_stopedToday;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_title1;
    private javax.swing.JPanel pnl_sideBar;
    private javax.swing.JLabel sideBtn_back;
    private javax.swing.JLabel sideBtn_next;
    private javax.swing.JLabel sideBtn_startMeal;
    private javax.swing.JLabel sideBtn_stopMeal;
    private javax.swing.JTextField t_cardNoToStopMoreThan;
    private javax.swing.JTextField t_cardNoToStopOneDay;
    // End of variables declaration//GEN-END:variables
}
