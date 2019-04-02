package view;

import controller.pojo.Manager;
import java.awt.Color;
import model.dao.LoginServices;
import model.dao.ManagerService;
import model.dao.RoleServices;

/**
 *
 * @author ccsl-pc
 */
public class LogingPage extends javax.swing.JFrame {

    RoleServices roleServices = new RoleServices();
    LoginServices loginServices = new LoginServices();
    ManagerService managerService = new ManagerService();
    Manager manager = null;

    public LogingPage() {
        initComponents();
        setLocationRelativeTo(null);
        t_email.setBackground(new Color(0, 0, 0, 0));
        t_pass.setBackground(new Color(0, 0, 0, 0));
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
        t_email = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btn_login = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lbl_logMsgs = new javax.swing.JLabel();
        t_pass = new javax.swing.JPasswordField();
        lbl_bg = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_email.setForeground(new java.awt.Color(255, 255, 255));
        t_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_email.setBorder(null);
        t_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t_email.setOpaque(false);
        getContentPane().add(t_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 200, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 250, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 250, 11));

        btn_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_login.setContentAreaFilled(false);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 86, 28));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 330, 11));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Log In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        lbl_logMsgs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_logMsgs.setForeground(new java.awt.Color(153, 0, 0));
        lbl_logMsgs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_logMsgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 187, 30));

        t_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_pass.setForeground(new java.awt.Color(255, 255, 255));
        t_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_pass.setBorder(null);
        t_pass.setOpaque(false);
        getContentPane().add(t_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 200, 30));

        lbl_bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\OLEE\\Desktop\\asset\\Untitled Export\\251850.jpg")); // NOI18N
        getContentPane().add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:

        String email = t_email.getText().trim().toLowerCase();
        String pin = t_pass.getText().trim().toLowerCase();

        if (email.equals("") && pin.equals("")) {
            lbl_logMsgs.setText("Enter values!!");
            lbl_logMsgs.setForeground(Color.RED);
            return;
        }

        if (email.equals("")) {
            lbl_logMsgs.setText("Enter Username!!");
            lbl_logMsgs.setForeground(Color.RED);
            return;
        }

        if (pin.equals("")) {
            lbl_logMsgs.setText("Enter Password!!");
            lbl_logMsgs.setForeground(Color.RED);
            return;
        }

        if (roleServices.isEmailExists(email)) {
            if (loginServices.isUsrPassMatched(pin, email)) {
                if (roleServices.getRoleNameByPin(pin).equalsIgnoreCase("manager")) {
                    manager = managerService.getManagerByPin(pin);
                    if (manager == null) {
                        lbl_logMsgs.setText("Manager does not exists!!");
                        lbl_logMsgs.setForeground(Color.RED);

                    } else {
                        new ManagerDashBoard(manager).setVisible(true);
                         this.setVisible(false);
                    }

                    this.setVisible(false);
                } else {
                    new AdminDashboard().setVisible(true);
                    this.setVisible(false);
                }
            } else {
                lbl_logMsgs.setText("Invalid password");
                lbl_logMsgs.setForeground(Color.RED);
            }
        } else {
            lbl_logMsgs.setText("Email doesn;t exists");
            lbl_logMsgs.setForeground(Color.RED);
        }

    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_logMsgs;
    private javax.swing.JTextField t_email;
    private javax.swing.JPasswordField t_pass;
    // End of variables declaration//GEN-END:variables
}
