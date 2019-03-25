/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.pojo.AssignedMonths;
import controller.pojo.Department;
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
import model.dao.MemberServices;
import model.dao.OffDaysServices;
import model.dao.PersonalInfoServices;

/**
 *
 * @author OLEE
 */
public class ManagerView extends javax.swing.JFrame {

    /**
     * Creates new form PersonalInfo
     */
    MemberServices memberServices = new MemberServices();
    DeptNmaesServices deptNmaesServices = new DeptNmaesServices();

    ArrayList<String> deptNames = (ArrayList<String>) deptNmaesServices.getDepartmentList();

    public ManagerView() {

        initComponents();

        this.setTitle("Registrar Memebr");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        pnl_sideBar.setBackground(new Color(0, 0, 0, 100));

    
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
        jLabel11 = new javax.swing.JLabel();
        sideBtn_member1 = new javax.swing.JLabel();
        drpDown_member = new javax.swing.JPanel();
        btn_addMember = new javax.swing.JLabel();
        btn_editMember = new javax.swing.JLabel();
        btn_removeMember = new javax.swing.JLabel();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_sideBar.setBackground(new java.awt.Color(0, 0, 0));
        pnl_sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setOpaque(true);
        pnl_sideBar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 10, 40));

        sideBtn_member1.setBackground(new java.awt.Color(51, 0, 153));
        sideBtn_member1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sideBtn_member1.setForeground(new java.awt.Color(255, 255, 255));
        sideBtn_member1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBtn_member1.setText("Member");
        sideBtn_member1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideBtn_member1.setOpaque(true);
        pnl_sideBar.add(sideBtn_member1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 40));

        getContentPane().add(pnl_sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 650));

        btn_addMember.setBackground(new java.awt.Color(51, 0, 153));
        btn_addMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_addMember.setForeground(new java.awt.Color(255, 255, 255));
        btn_addMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_addMember.setText("Add Member");
        btn_addMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addMember.setOpaque(true);
        btn_addMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMemberMouseClicked(evt);
            }
        });

        btn_editMember.setBackground(new java.awt.Color(51, 0, 153));
        btn_editMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_editMember.setForeground(new java.awt.Color(255, 255, 255));
        btn_editMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_editMember.setText("Edit Info");
        btn_editMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editMember.setOpaque(true);
        btn_editMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMemberMouseClicked(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_removeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(drpDown_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 130, 130));

        lbl_bg.setBackground(new java.awt.Color(0, 102, 102));
        lbl_bg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_bg.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bg.setOpaque(true);
        getContentPane().add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMemberMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Addmember().setVisible(true);
    }//GEN-LAST:event_btn_addMemberMouseClicked

    private void btn_editMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMemberMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new EditMemberView().setVisible(true);
        
    }//GEN-LAST:event_btn_editMemberMouseClicked
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
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_addMember;
    private javax.swing.JLabel btn_editMember;
    private javax.swing.JLabel btn_removeMember;
    private javax.swing.JPanel drpDown_member;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JPanel pnl_sideBar;
    private javax.swing.JLabel sideBtn_member1;
    // End of variables declaration//GEN-END:variables
}
