/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.pojo.Department;
import controller.pojo.PersonalInfo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.dao.DeptNmaesServices;
import model.dao.PersonalInfoServices;

/**
 *
 * @author OLEE
 */
public class PersonalInfoView extends javax.swing.JFrame {

    /**
     * Creates new form PersonalInfo
     */
    PersonalInfoServices personalInfoServices = new PersonalInfoServices();
    DeptNmaesServices deptNmaesServices = new DeptNmaesServices();

    ArrayList<String> deptNames = (ArrayList<String>) deptNmaesServices.getDepartmentList();

    public PersonalInfoView() {
        initComponents();
        t_name.setBackground(new Color(0, 0, 0, 0));
        lbl_bg.setBackground(new Color(0, 0, 0, 0));
        t_cntNum.setBackground(new Color(0, 0, 0, 0));
        t_email.setBackground(new Color(0, 0, 0, 0));
        t_regNo.setBackground(new Color(0, 0, 0, 0));
        t_session.setBackground(new Color(0, 0, 0, 0));
        com_depts.setBackground(new Color(0, 0, 0, 0));

        pnl_sideBar.setBackground(new Color(0, 0, 0, 100));

        for (String deptNames : deptNames) {
            com_depts.addItem(deptNames);
        }
        designTable(tbl_pInfo);
    }

    private void designTable(JTable tableName) {
        tableName.getTableHeader().setForeground(new Color(255, 255, 255));
        tableName.getTableHeader().setBackground(Color.BLACK);
        tableName.getTableHeader().setForeground(Color.black);

        ((DefaultTableCellRenderer) tableName.getDefaultRenderer(Object.class)).setOpaque(false);

        tableName.setBackground(new Color(0, 0, 0));
        jScrollPane1.setBackground(new Color(0, 0, 0));
        jScrollPane1.getViewport().setOpaque(false);
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        t_name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        t_cntNum = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        t_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        t_regNo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        t_session = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_msgs = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pInfo = new javax.swing.JTable();
        com_depts = new javax.swing.JComboBox<>();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_sideBar.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnl_sideBarLayout = new javax.swing.GroupLayout(pnl_sideBar);
        pnl_sideBar.setLayout(pnl_sideBarLayout);
        pnl_sideBarLayout.setHorizontalGroup(
            pnl_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        pnl_sideBarLayout.setVerticalGroup(
            pnl_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(pnl_sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 650));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Personal Information");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 620, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 1020, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 70, 30));

        t_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_name.setForeground(new java.awt.Color(255, 255, 255));
        t_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_name.setBorder(null);
        t_name.setOpaque(false);
        getContentPane().add(t_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 250, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 250, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 70, 30));

        t_cntNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cntNum.setForeground(new java.awt.Color(255, 255, 255));
        t_cntNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_cntNum.setBorder(null);
        t_cntNum.setOpaque(false);
        getContentPane().add(t_cntNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 250, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 250, 10));

        t_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_email.setForeground(new java.awt.Color(255, 255, 255));
        t_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_email.setBorder(null);
        t_email.setOpaque(false);
        getContentPane().add(t_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 70, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 250, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 80, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 250, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reg. No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 80, 30));

        t_regNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_regNo.setForeground(new java.awt.Color(255, 255, 255));
        t_regNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_regNo.setBorder(null);
        t_regNo.setOpaque(false);
        getContentPane().add(t_regNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 250, 30));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 250, 10));

        t_session.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_session.setForeground(new java.awt.Color(255, 255, 255));
        t_session.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_session.setBorder(null);
        t_session.setOpaque(false);
        getContentPane().add(t_session, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 250, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Session");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 80, 30));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 250, 10));
        getContentPane().add(lbl_msgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 140, 30));

        btn_update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_update.setContentAreaFilled(false);
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 100, 40));

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
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 100, 40));

        tbl_pInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_pInfo.setForeground(new java.awt.Color(255, 255, 255));
        tbl_pInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Mobile", "Email", "Department", "Reg. No", "Session"
            }
        ));
        tbl_pInfo.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_pInfo.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_pInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 550, 400));

        com_depts.setBackground(new java.awt.Color(255, 51, 51));
        com_depts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        com_depts.setForeground(new java.awt.Color(0, 102, 51));
        com_depts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        getContentPane().add(com_depts, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 250, 30));

        lbl_bg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_bg.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\OLEE\\Desktop\\asset\\Untitled Export\\251850.jpg")); // NOI18N
        getContentPane().add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        String name = t_name.getText().trim();
        String cnt_num = t_cntNum.getText().trim();
        String email = t_email.getText().trim();
        String deptName = com_depts.getSelectedItem().toString();
        String regNo = t_regNo.getText().trim();
        String session = t_session.getText().trim();

        if (name.isEmpty() || cnt_num.isEmpty() || email.isEmpty() || deptName.isEmpty() || regNo.isEmpty() || session.isEmpty()) {
            lbl_msgs.setText("Fill out all the fields");
            lbl_msgs.setForeground(Color.red);
        } else {
            if (!personalInfoServices.isEmailExists(email)) {
                PersonalInfo personalInfo = new PersonalInfo(name, cnt_num, email, deptName, regNo, session);

                if (personalInfoServices.saveInfo(personalInfo) > 0) {
                    lbl_msgs.setText("Info saved");
                    lbl_msgs.setForeground(Color.GREEN);
                    addToTable(personalInfo);
                } else {
                    lbl_msgs.setText("Not saved");
                    lbl_msgs.setForeground(Color.red);
                }
            } else {
                lbl_msgs.setText("Email already exists");
                lbl_msgs.setForeground(Color.red);
            }
        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void addToTable(PersonalInfo persoanlInfo) {
        DefaultTableModel model = (DefaultTableModel) tbl_pInfo.getModel();

        Object[] obj = new Object[6];

        obj[0] = persoanlInfo.getName();
        obj[1] = persoanlInfo.getContNum();
        obj[2] = persoanlInfo.getEmail();
        obj[3] = persoanlInfo.getDeptName();
        obj[4] = persoanlInfo.getRegNum();
        obj[5] = persoanlInfo.getSession();

        model.addRow(obj);
    }

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
            java.util.logging.Logger.getLogger(PersonalInfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInfoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> com_depts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_msgs;
    private javax.swing.JPanel pnl_sideBar;
    private javax.swing.JTextField t_cntNum;
    private javax.swing.JTextField t_email;
    private javax.swing.JTextField t_name;
    private javax.swing.JTextField t_regNo;
    private javax.swing.JTextField t_session;
    private javax.swing.JTable tbl_pInfo;
    // End of variables declaration//GEN-END:variables
}