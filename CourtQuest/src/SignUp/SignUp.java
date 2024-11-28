/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUp;

import java.awt.Color;


/**
 *
 * @author Euwen
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CreateAccountlbl = new javax.swing.JLabel();
        Lastnamelbl = new javax.swing.JLabel();
        Lastnametxtfld = new javax.swing.JTextField();
        Firstnamelbl = new javax.swing.JLabel();
        Firstnametxtfld = new javax.swing.JTextField();
        Usernamelbl = new javax.swing.JLabel();
        Usernametxtfld = new javax.swing.JTextField();
        Passwordlbl = new javax.swing.JLabel();
        Passwordtxtfld = new javax.swing.JTextField();
        Conpasswordlbl = new javax.swing.JLabel();
        Conpasswordtxtfld = new javax.swing.JTextField();
        Continuepanel = new javax.swing.JPanel();
        Continuelbl = new javax.swing.JLabel();
        ContinueBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CreateAccountlbl.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        CreateAccountlbl.setText("Create Account");

        Lastnamelbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Lastnamelbl.setText("Lastname");

        Lastnametxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnametxtfldActionPerformed(evt);
            }
        });

        Firstnamelbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Firstnamelbl.setText("Firstname");

        Firstnametxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnametxtfldActionPerformed(evt);
            }
        });

        Usernamelbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Usernamelbl.setText("Username");

        Usernametxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernametxtfldActionPerformed(evt);
            }
        });

        Passwordlbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Passwordlbl.setText("Password");

        Passwordtxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordtxtfldActionPerformed(evt);
            }
        });

        Conpasswordlbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Conpasswordlbl.setText("Confirm Password");

        Conpasswordtxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConpasswordtxtfldActionPerformed(evt);
            }
        });

        Continuepanel.setBackground(new java.awt.Color(255, 255, 255));
        Continuepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Continuelbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Continuelbl.setForeground(new java.awt.Color(255, 255, 255));
        Continuelbl.setText("Continue");
        Continuepanel.add(Continuelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, 60, 20));

        ContinueBtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ContinueBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Button.png"))); // NOI18N
        ContinueBtn.setMaximumSize(new java.awt.Dimension(105, 30));
        ContinueBtn.setMinimumSize(new java.awt.Dimension(105, 30));
        ContinueBtn.setPreferredSize(new java.awt.Dimension(104, 30));
        ContinueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContinueBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContinueBtnMouseExited(evt);
            }
        });
        Continuepanel.add(ContinueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Usernametxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Conpasswordlbl)
                            .addComponent(Passwordlbl)
                            .addComponent(Lastnamelbl)
                            .addComponent(Firstnamelbl)
                            .addComponent(Usernamelbl)
                            .addComponent(Lastnametxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Firstnametxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Passwordtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Conpasswordtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(CreateAccountlbl))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(Continuepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(CreateAccountlbl)
                .addGap(42, 42, 42)
                .addComponent(Lastnamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lastnametxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Firstnamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Firstnametxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(Usernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usernametxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Passwordlbl)
                .addGap(18, 18, 18)
                .addComponent(Passwordtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Conpasswordlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Conpasswordtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Continuepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 354, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LastnametxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnametxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnametxtfldActionPerformed

    private void FirstnametxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnametxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnametxtfldActionPerformed

    private void UsernametxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernametxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernametxtfldActionPerformed

    private void PasswordtxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordtxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordtxtfldActionPerformed

    private void ConpasswordtxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConpasswordtxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConpasswordtxtfldActionPerformed

    private void ContinueBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueBtnMouseEntered
       Color hoverColor = Color.BLACK;
       Continuelbl.setForeground(hoverColor);
    }//GEN-LAST:event_ContinueBtnMouseEntered

    private void ContinueBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueBtnMouseExited
        Color defaultColor = Color.WHITE;
       Continuelbl.setForeground(defaultColor);
    }//GEN-LAST:event_ContinueBtnMouseExited

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Conpasswordlbl;
    private javax.swing.JTextField Conpasswordtxtfld;
    private javax.swing.JLabel ContinueBtn;
    private javax.swing.JLabel Continuelbl;
    private javax.swing.JPanel Continuepanel;
    private javax.swing.JLabel CreateAccountlbl;
    private javax.swing.JLabel Firstnamelbl;
    private javax.swing.JTextField Firstnametxtfld;
    private javax.swing.JLabel Lastnamelbl;
    private javax.swing.JTextField Lastnametxtfld;
    private javax.swing.JLabel Passwordlbl;
    private javax.swing.JTextField Passwordtxtfld;
    private javax.swing.JLabel Usernamelbl;
    private javax.swing.JTextField Usernametxtfld;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}