/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.pojo.Manager;
import controller.pojo.Member;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.dao.DeptNmaesServices;
import model.dao.MealManageService;
import model.dao.MemberServices;

/**
 *
 * @author OLEE
 */
public class Addmember extends javax.swing.JFrame {

    /**
     * Creates new form PersonalInfo
     */
    MemberServices memberServices = new MemberServices();
    DeptNmaesServices deptNmaesServices = new DeptNmaesServices();
    MealManageService mealManageService = new MealManageService();

    ArrayList<String> deptNames = (ArrayList<String>) deptNmaesServices.getDepartmentList();
    
    Manager manager = null;

    public Addmember() {

        initComponents();
        this.manager = manager;
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Memebr");
        t_name.setBackground(new Color(0, 0, 0, 0));
        lbl_bg.setBackground(new Color(0, 0, 0, 0));
        t_cntNum.setBackground(new Color(0, 0, 0, 0));
        t_email.setBackground(new Color(0, 0, 0, 0));
        t_regNo.setBackground(new Color(0, 0, 0, 0));
        t_session.setBackground(new Color(0, 0, 0, 0));
        t_cardNo.setBackground(new Color(0, 0, 0, 0));
        com_depts.setBackground(new Color(0, 0, 0, 0));
        
        com_type.setBackground(new Color(0, 0, 0, 0));

        pnl_sideBar.setBackground(new Color(0, 0, 0, 100));
        Collections.sort(deptNames);
        for (String deptNames : deptNames) {
            com_depts.addItem(deptNames);
        }
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
        btn_save = new javax.swing.JButton();
        com_depts = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        t_cardNo = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        com_type = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        pnl_sideBar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sideBtn_editMember = new javax.swing.JLabel();
        sideBtn_addAdmin = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Personal Information");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 620, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 1020, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 70, 30));

        t_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_name.setForeground(new java.awt.Color(255, 255, 255));
        t_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_name.setBorder(null);
        t_name.setOpaque(false);
        getContentPane().add(t_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 250, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 250, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 70, 30));

        t_cntNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cntNum.setForeground(new java.awt.Color(255, 255, 255));
        t_cntNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_cntNum.setBorder(null);
        t_cntNum.setOpaque(false);
        getContentPane().add(t_cntNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 250, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 250, 10));

        t_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_email.setForeground(new java.awt.Color(255, 255, 255));
        t_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_email.setBorder(null);
        t_email.setOpaque(false);
        getContentPane().add(t_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 70, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 250, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 80, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 250, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reg. No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 80, 30));

        t_regNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_regNo.setForeground(new java.awt.Color(255, 255, 255));
        t_regNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_regNo.setBorder(null);
        t_regNo.setOpaque(false);
        getContentPane().add(t_regNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 250, 30));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 250, 10));

        t_session.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_session.setForeground(new java.awt.Color(255, 255, 255));
        t_session.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_session.setBorder(null);
        t_session.setOpaque(false);
        getContentPane().add(t_session, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 250, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Session");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 80, 30));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 250, 10));
        getContentPane().add(lbl_msgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, 140, 30));

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
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 300, 100, 40));

        com_depts.setBackground(new java.awt.Color(255, 51, 51));
        com_depts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        com_depts.setForeground(new java.awt.Color(0, 102, 51));
        com_depts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        com_depts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(com_depts, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 250, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Card No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 70, 30));

        t_cardNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cardNo.setForeground(new java.awt.Color(255, 255, 255));
        t_cardNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_cardNo.setBorder(null);
        t_cardNo.setOpaque(false);
        getContentPane().add(t_cardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 250, 30));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 250, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 70, 30));

        com_type.setBackground(new java.awt.Color(255, 51, 51));
        com_type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        com_type.setForeground(new java.awt.Color(0, 102, 51));
        com_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select type", "Regular", "Extra" }));
        com_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(com_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 250, 30));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, 250, 10));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 10, 420));

        pnl_sideBar.setBackground(new java.awt.Color(0, 0, 0));
        pnl_sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setOpaque(true);
        pnl_sideBar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 10, 40));

        sideBtn_editMember.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_editMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_editMember.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_editMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_editMember.setText("Edit Member");
        sideBtn_editMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_editMember.setOpaque(true);
        sideBtn_editMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_editMemberMouseClicked(evt);
            }
        });
        pnl_sideBar.add(sideBtn_editMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 40));

        sideBtn_addAdmin.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_addAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_addAdmin.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_addAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_addAdmin.setText("Delete Member");
        sideBtn_addAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_addAdmin.setOpaque(true);
        sideBtn_addAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideBtn_addAdminMouseClicked(evt);
            }
        });
        pnl_sideBar.add(sideBtn_addAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 40));

        jLabel12.setOpaque(true);
        pnl_sideBar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 10, 40));

        getContentPane().add(pnl_sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 650));

        lbl_bg.setBackground(new java.awt.Color(0, 102, 102));
        lbl_bg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_bg.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/251850.jpg"))); // NOI18N
        lbl_bg.setOpaque(true);
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
        int cardNo = 0;
        try {
            cardNo = Integer.parseInt(t_cardNo.getText().trim());
        } catch (NumberFormatException e) {
            lbl_msgs.setText("Enter valid card no");
            lbl_msgs.setForeground(Color.red);
        }
        String memberType = com_type.getSelectedItem().toString();

        if (name.isEmpty() || cnt_num.isEmpty() || email.isEmpty() || deptName.isEmpty() || regNo.isEmpty() || session.isEmpty()) {
            lbl_msgs.setText("Fill out all the fields");
            lbl_msgs.setForeground(Color.red);
        } else {
            if (!memberServices.isCardExists(cardNo)) {
                if (!memberServices.isEmailExists(email)) {
                    Member member = new Member(name, cnt_num, email, deptName, regNo, session, cardNo, memberType, "Inactive", new Date(System.currentTimeMillis()));

                    if (memberServices.saveInfo(member) > 0) {
                        lbl_msgs.setText(cardNo+" card saved");
                        lbl_msgs.setForeground(Color.GREEN);
                    } else {
                        lbl_msgs.setText("Not saved");
                        lbl_msgs.setForeground(Color.red);
                    }
                } else {
                    lbl_msgs.setText("Email already exists");
                    lbl_msgs.setForeground(Color.red);
                }
            } else {
                lbl_msgs.setText("Card No. already exists");
                lbl_msgs.setForeground(Color.red);
            }
        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void sideBtn_editMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_editMemberMouseClicked
        // TODO add your handling code here:
        new EditMemberView().setVisible(true);
    }//GEN-LAST:event_sideBtn_editMemberMouseClicked

    private void sideBtn_addAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBtn_addAdminMouseClicked
        // TODO add your handling code here:
        new AddAdminView().setVisible(true);
    }//GEN-LAST:event_sideBtn_addAdminMouseClicked
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
            java.util.logging.Logger.getLogger(Addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Addmember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> com_depts;
    private javax.swing.JComboBox<String> com_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_msgs;
    private javax.swing.JPanel pnl_sideBar;
    private javax.swing.JLabel sideBtn_addAdmin;
    private javax.swing.JLabel sideBtn_editMember;
    private javax.swing.JTextField t_cardNo;
    private javax.swing.JTextField t_cntNum;
    private javax.swing.JTextField t_email;
    private javax.swing.JTextField t_name;
    private javax.swing.JTextField t_regNo;
    private javax.swing.JTextField t_session;
    // End of variables declaration//GEN-END:variables
}
