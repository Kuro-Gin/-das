/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author nhaantran
 */
public class InsertSupplier extends javax.swing.JPanel {

    /**
     * Creates new form InsertBook
     */
    public InsertSupplier() {
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

        insertbookpane1 = new javax.swing.JPanel();
        lblinsertname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblinsertname1 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblinsertname2 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        lblinsertname12 = new javax.swing.JLabel();
        txtnumofproducts = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        insertbookpane1.setBackground(new java.awt.Color(255, 255, 255));

        lblinsertname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblinsertname.setForeground(new java.awt.Color(0, 0, 0));
        lblinsertname.setText("Name:");

        txtname.setForeground(new java.awt.Color(153, 153, 153));
        txtname.setText("Enter Name");
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        lblinsertname1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblinsertname1.setForeground(new java.awt.Color(0, 0, 0));
        lblinsertname1.setText("Email");

        txtemail.setForeground(new java.awt.Color(153, 153, 153));
        txtemail.setText("Enter Email");
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });

        lblinsertname2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblinsertname2.setForeground(new java.awt.Color(0, 0, 0));
        lblinsertname2.setText("Address");

        txtaddress.setForeground(new java.awt.Color(153, 153, 153));
        txtaddress.setText("Enter Address");
        txtaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaddressFocusLost(evt);
            }
        });

        lblinsertname12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblinsertname12.setForeground(new java.awt.Color(0, 0, 0));
        lblinsertname12.setText("NumofProducts");

        txtnumofproducts.setForeground(new java.awt.Color(153, 153, 153));
        txtnumofproducts.setText("Enter NumofProducts");
        txtnumofproducts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnumofproductsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnumofproductsFocusLost(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(0, 153, 255));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add Supplier");
        btnadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Phone");

        txtphone.setForeground(new java.awt.Color(153, 153, 153));
        txtphone.setText("Enter Phone");
        txtphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtphoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtphoneFocusLost(evt);
            }
        });

        javax.swing.GroupLayout insertbookpane1Layout = new javax.swing.GroupLayout(insertbookpane1);
        insertbookpane1.setLayout(insertbookpane1Layout);
        insertbookpane1Layout.setHorizontalGroup(
            insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertbookpane1Layout.createSequentialGroup()
                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insertbookpane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertbookpane1Layout.createSequentialGroup()
                                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblinsertname, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblinsertname1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtemail)
                                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertbookpane1Layout.createSequentialGroup()
                                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblinsertname12)
                                    .addComponent(lblinsertname2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(insertbookpane1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtnumofproducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(insertbookpane1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtaddress))))))
                    .addGroup(insertbookpane1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 132, Short.MAX_VALUE))
                    .addGroup(insertbookpane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        insertbookpane1Layout.setVerticalGroup(
            insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertbookpane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinsertname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinsertname1)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinsertname2)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinsertname12)
                    .addComponent(txtnumofproducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insertbookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnadd))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertbookpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertbookpane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        // TODO add your handling code here:
        if(txtname.getText().equals("Enter Name")){
            txtname.setText("");
            txtname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        // TODO add your handling code here:
        if(txtname.getText().equals("")){
            txtname.setText("Enter Name");
            txtname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnameFocusLost

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

    private void txtaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusGained
        // TODO add your handling code here:
        if(txtaddress.getText().equals("Enter Address")){
            txtaddress.setText("");
            txtaddress.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtaddressFocusGained

    private void txtaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusLost
        // TODO add your handling code here:
        if(txtaddress.getText().equals("")){
            txtaddress.setText("Enter Address");
            txtaddress.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtaddressFocusLost

    private void txtnumofproductsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumofproductsFocusGained
        // TODO add your handling code here:
        if(txtnumofproducts.getText().equals("Enter NumofProducts")){
            txtnumofproducts.setText("");
            txtnumofproducts.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnumofproductsFocusGained

    private void txtnumofproductsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumofproductsFocusLost
        // TODO add your handling code here:
        if(txtnumofproducts.getText().equals("")){
            txtnumofproducts.setText("Enter NumofProducts");
            txtnumofproducts.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnumofproductsFocusLost

    private void txtphoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusGained
        // TODO add your handling code here:
        if(txtphone.getText().equals("Enter Phone")){
            txtphone.setText("");
            txtphone.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtphoneFocusGained

    private void txtphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusLost
        // TODO add your handling code here:
        if(txtphone.getText().equals("")){
            txtphone.setText("Enter Phone");
            txtphone.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtphoneFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JPanel insertbookpane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblinsertname;
    private javax.swing.JLabel lblinsertname1;
    private javax.swing.JLabel lblinsertname12;
    private javax.swing.JLabel lblinsertname2;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumofproducts;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
