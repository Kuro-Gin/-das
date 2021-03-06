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
public class UpdateSupplier extends javax.swing.JPanel {

    /**
     * Creates new form UpdateBook
     */
    public UpdateSupplier() {
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

        updatebookpane1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdbtnname = new javax.swing.JRadioButton();
        rdbtnnational = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        updatebookpane3 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        txtnumofproducts = new javax.swing.JTextField();
        rdbtnphone = new javax.swing.JRadioButton();
        txtphone = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        updatebookpane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Input ID:");

        rdbtnname.setForeground(new java.awt.Color(0, 0, 0));
        rdbtnname.setText("Name");

        rdbtnnational.setForeground(new java.awt.Color(0, 0, 0));
        rdbtnnational.setText("Email");

        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Address");

        txtid.setForeground(new java.awt.Color(153, 153, 153));
        txtid.setText("Enter ID");
        txtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidFocusLost(evt);
            }
        });

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

        javax.swing.GroupLayout updatebookpane1Layout = new javax.swing.GroupLayout(updatebookpane1);
        updatebookpane1.setLayout(updatebookpane1Layout);
        updatebookpane1Layout.setHorizontalGroup(
            updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatebookpane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(rdbtnnational)
                    .addComponent(rdbtnname)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtaddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                .addContainerGap())
        );
        updatebookpane1Layout.setVerticalGroup(
            updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatebookpane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnnational)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        updatebookpane3.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton4.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setText("NumofProducts");

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

        rdbtnphone.setForeground(new java.awt.Color(0, 0, 0));
        rdbtnphone.setText("Phone");

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

        btnupdate.setBackground(new java.awt.Color(0, 153, 255));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update Supplier");
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout updatebookpane3Layout = new javax.swing.GroupLayout(updatebookpane3);
        updatebookpane3.setLayout(updatebookpane3Layout);
        updatebookpane3Layout.setHorizontalGroup(
            updatebookpane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatebookpane3Layout.createSequentialGroup()
                .addGroup(updatebookpane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(rdbtnphone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(updatebookpane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtphone)
                    .addComponent(txtnumofproducts))
                .addContainerGap())
            .addGroup(updatebookpane3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        updatebookpane3Layout.setVerticalGroup(
            updatebookpane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatebookpane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatebookpane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(txtnumofproducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatebookpane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnphone)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnupdate)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updatebookpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatebookpane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updatebookpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updatebookpane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusGained
        // TODO add your handling code here:
        if (txtid.getText().equals("Enter ID")) {
            txtid.setText("");
            txtid.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtidFocusGained

    private void txtidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusLost
        // TODO add your handling code here:
        if (txtid.getText().equals("")) {
            txtid.setText("Enter ID");
            txtid.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtidFocusLost

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        // TODO add your handling code here:
        if (txtname.getText().equals("Enter Name")) {
            txtname.setText("");
            txtname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        // TODO add your handling code here:
        if (txtname.getText().equals("")) {
            txtname.setText("Enter Name");
            txtname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtnameFocusLost

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        // TODO add your handling code here:
        if (txtemail.getText().equals("Enter Email")) {
            txtemail.setText("");
            txtemail.setForeground(new Color(153, 153, 153));
        }

    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        // TODO add your handling code here:
        if (txtemail.getText().equals("")) {
            txtemail.setText("Enter Email");
            txtemail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void txtaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusGained
        // TODO add your handling code here:
        if (txtaddress.getText().equals("Enter Address")) {
            txtaddress.setText("");
            txtaddress.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtaddressFocusGained

    private void txtaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusLost
        // TODO add your handling code here:
        if (txtaddress.getText().equals("")) {
            txtaddress.setText("Enter Address");
            txtaddress.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtaddressFocusLost

    private void txtnumofproductsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumofproductsFocusGained
        // TODO add your handling code here:
        if (txtnumofproducts.getText().equals("Enter NumofProducts")) {
            txtnumofproducts.setText("");
            txtnumofproducts.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtnumofproductsFocusGained

    private void txtnumofproductsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumofproductsFocusLost
        // TODO add your handling code here:
        if (txtnumofproducts.getText().equals("")) {
            txtnumofproducts.setText("Enter NumofProducts");
            txtnumofproducts.setForeground(new Color(153, 153, 153));
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
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton rdbtnname;
    private javax.swing.JRadioButton rdbtnnational;
    private javax.swing.JRadioButton rdbtnphone;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumofproducts;
    private javax.swing.JTextField txtphone;
    private javax.swing.JPanel updatebookpane1;
    private javax.swing.JPanel updatebookpane3;
    // End of variables declaration//GEN-END:variables
}
