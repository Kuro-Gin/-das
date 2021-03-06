/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nhaantran
 */
public class Forgetpassword extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public Forgetpassword() {
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

        JPanel1 = new javax.swing.JPanel();
        lblforgetpasswordicon = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnconfirm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblbookicon = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblnewpassword = new javax.swing.JLabel();
        lblstatement = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lbllogin = new javax.swing.JLabel();
        lblconfirm = new javax.swing.JLabel();
        txtpasswordconfirm = new javax.swing.JPasswordField();
        jcbshowpassword = new javax.swing.JCheckBox();
        jcbshowpassword1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblforgetpasswordicon.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        lblforgetpasswordicon.setForeground(new java.awt.Color(0, 0, 0));
        lblforgetpasswordicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manager.png"))); // NOI18N
        lblforgetpasswordicon.setText("Manager Forget password");
        lblforgetpasswordicon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtpassword.setBackground(new java.awt.Color(255, 255, 255));
        txtpassword.setText("password");
        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });

        btnconfirm.setBackground(new java.awt.Color(0, 153, 255));
        btnconfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnconfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnconfirm.setText("Confirm new password");
        btnconfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblbookicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bookshelves.png"))); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(lblbookicon)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblbookicon, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblnewpassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnewpassword.setForeground(new java.awt.Color(0, 0, 0));
        lblnewpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/padlock.png"))); // NOI18N
        lblnewpassword.setText("New password");
        lblnewpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblstatement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblstatement.setForeground(new java.awt.Color(0, 0, 0));
        lblstatement.setText("Already a user?");
        lblstatement.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblemail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblemail.setForeground(new java.awt.Color(0, 0, 0));
        lblemail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email.png"))); // NOI18N
        lblemail.setText("Email"); // NOI18N
        lblemail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtemail.setBackground(new java.awt.Color(255, 255, 255));
        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtemail.setText("Enter Email");
        txtemail.setToolTipText("");
        txtemail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });

        lbllogin.setForeground(new java.awt.Color(0, 153, 255));
        lbllogin.setText("Log in");
        lbllogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbllogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblloginMouseExited(evt);
            }
        });

        lblconfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblconfirm.setForeground(new java.awt.Color(0, 0, 0));
        lblconfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/padlock.png"))); // NOI18N
        lblconfirm.setText("Confirm new password");
        lblconfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtpasswordconfirm.setBackground(new java.awt.Color(255, 255, 255));
        txtpasswordconfirm.setText("password");
        txtpasswordconfirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtpasswordconfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordconfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordconfirmFocusLost(evt);
            }
        });

        jcbshowpassword.setText("Show password");
        jcbshowpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbshowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbshowpasswordActionPerformed(evt);
            }
        });

        jcbshowpassword1.setText("Show password");
        jcbshowpassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbshowpassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbshowpassword1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnewpassword)
                                    .addComponent(lblforgetpasswordicon)
                                    .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnconfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(txtpasswordconfirm, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addComponent(jcbshowpassword1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblconfirm, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbshowpassword, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblstatement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbllogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblforgetpasswordicon, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblnewpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbshowpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblconfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpasswordconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbshowpassword1)
                .addGap(18, 18, 18)
                .addComponent(btnconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstatement)
                    .addComponent(lbllogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void lblloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblloginMouseClicked
        // TODO add your handling code here:
        Login screen = new Login();
        screen.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblloginMouseClicked

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        // TODO add your handling code here:
        if(txtemail.getText().equals("Enter Email")){
            txtemail.setText("");
            txtemail.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        // TODO add your handling code here:
        if(txtemail.getText().equals("")){
            txtemail.setText("Enter Email");
            txtemail.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        // TODO add your handling code here:
        String password = String.valueOf(txtpassword.getPassword());
        if(password.toLowerCase().equals("password")){
            txtpassword.setText("");
            txtpassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
        // TODO add your handling code here:
        String password = String.valueOf(txtpassword.getPassword());
        if(password.toLowerCase().equals("")){
            txtpassword.setText("password");
            txtpassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtpasswordFocusLost

    private void txtpasswordconfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordconfirmFocusGained
        // TODO add your handling code here:
        String password = String.valueOf(txtpasswordconfirm.getPassword());
        if(password.toLowerCase().equals("password")){
            txtpasswordconfirm.setText("");
            txtpasswordconfirm.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtpasswordconfirmFocusGained

    private void txtpasswordconfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordconfirmFocusLost
        // TODO add your handling code here:
        String password = String.valueOf(txtpasswordconfirm.getPassword());
        if(password.toLowerCase().equals("")){
            txtpasswordconfirm.setText("password");
            txtpasswordconfirm.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtpasswordconfirmFocusLost

    private void jcbshowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbshowpasswordActionPerformed
        // TODO add your handling code here:
        txtpassword.setEchoChar(jcbshowpassword.isSelected() ?(char)0 : '*' );
    }//GEN-LAST:event_jcbshowpasswordActionPerformed

    private void jcbshowpassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbshowpassword1ActionPerformed
        // TODO add your handling code here:
        txtpasswordconfirm.setEchoChar(jcbshowpassword1.isSelected() ?(char)0 : '*' );
    }//GEN-LAST:event_jcbshowpassword1ActionPerformed

    Font original;
    private void lblloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblloginMouseEntered
        // TODO add your handling code here:
        original = evt.getComponent().getFont();
        Font font = lbllogin.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lbllogin.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_lblloginMouseEntered

    private void lblloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblloginMouseExited
        // TODO add your handling code here:
        evt.getComponent().setFont(original);
    }//GEN-LAST:event_lblloginMouseExited

    
                                     

                
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
            java.util.logging.Logger.getLogger(Forgetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgetpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgetpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JCheckBox jcbshowpassword;
    private javax.swing.JCheckBox jcbshowpassword1;
    private javax.swing.JLabel lblbookicon;
    private javax.swing.JLabel lblconfirm;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblforgetpasswordicon;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblnewpassword;
    private javax.swing.JLabel lblstatement;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpasswordconfirm;
    // End of variables declaration//GEN-END:variables
}
