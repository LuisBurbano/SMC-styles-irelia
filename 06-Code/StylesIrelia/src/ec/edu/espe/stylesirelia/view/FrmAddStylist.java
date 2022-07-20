package ec.edu.espe.stylesirelia.view;

import ec.edu.espe.stylesirelia.controller.StylistController;
import ec.edu.espe.stylesirelia.model.Connection;
import ec.edu.espe.stylesirelia.model.Stylist;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BETTACODDERS
 */
public class FrmAddStylist extends javax.swing.JFrame {

    /**
     * Creates new form AddStylist
     */
    public FrmAddStylist() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdentification = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtAppoinment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        bntBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Identification Card");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 53, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Appoinment");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 107, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 71, -1));

        txtIdentification.setToolTipText("only numbers");
        txtIdentification.setBorder(null);
        txtIdentification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificationActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 179, -1));

        txtName.setToolTipText("please first name and last name");
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 179, -1));

        txtNumber.setToolTipText("only numbers");
        txtNumber.setBorder(null);
        jPanel1.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 179, -1));

        txtAddress.setBorder(null);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 387, -1));

        txtAppoinment.setBorder(null);
        txtAppoinment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppoinmentActionPerformed(evt);
            }
        });
        jPanel1.add(txtAppoinment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 179, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Payment");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 130, -1));

        txtPayment.setBorder(null);
        jPanel1.add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 387, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel8.setText("Stylist");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, -10, 150, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 179, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 179, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 179, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 179, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 387, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 387, 10));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        btnRead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });
        jPanel1.add(btnRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        bntBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntBack.setText("Back");
        bntBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBackActionPerformed(evt);
            }
        });
        jPanel1.add(bntBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/sources/bg-logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String identificationCard;
        String name;
        String number;
        double payment;
        String appointment;
        String address;

        identificationCard = txtIdentification.getText();
        name = txtName.getText();
        number = txtNumber.getText();
        payment = Integer.parseInt(txtPayment.getText());
        appointment = txtAppoinment.getText();
        address = txtAddress.getText();

        Stylist stylist = new Stylist(identificationCard, name, number, payment, appointment, address);

        Connection connection = new Connection();
        connection.connectionDataBase();

        StylistController stylistController = new StylistController(stylist, "Stylist");
        stylistController.create();

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String identificationCard;
        String name;
        String number;
        double payment;
        String appointment;
        String address;

        identificationCard = txtIdentification.getText();
        name = txtName.getText();
        number = txtNumber.getText();
        payment = Integer.parseInt(txtPayment.getText());
        appointment = txtAppoinment.getText();
        address = txtAddress.getText();

        Stylist stylist = new Stylist(identificationCard, name, number, payment, appointment, address);

        Connection connection = new Connection();
        connection.connectionDataBase();

        StylistController stylistController = new StylistController(stylist, "Stylist");
        stylistController.update(name, name, address, name);    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       String identificationCard;
        String name;
        String number;
        double payment;
        String appointment;
        String address;
        
        identificationCard = txtIdentification.getText();
        name = txtName.getText();
        number = txtNumber.getText();
        payment = Integer.parseInt(txtPayment.getText());
        appointment = txtAppoinment.getText();
        address = txtAddress.getText();
        
        Stylist stylist = new Stylist(identificationCard, name, number, payment, appointment, address);
        
        Connection connection = new Connection();
        connection.connectionDataBase();
        
        StylistController stylistController = new StylistController(stylist, "Stylist");
        stylistController.delete(name, name);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
       String identificationCard;
        String name;
        String number;
        double payment;
        String appointment;
        String address;
        
        identificationCard = txtIdentification.getText();
        name = txtName.getText();
        number = txtNumber.getText();
        payment = Integer.parseInt(txtPayment.getText());
        appointment = txtAppoinment.getText();
        address = txtAddress.getText();
        
        Stylist stylist = new Stylist(identificationCard, name, number, payment, appointment, address);
        
        Connection connection = new Connection();
        connection.connectionDataBase();
        
        StylistController stylistController = new StylistController(stylist,"Stylist");
        stylistController.read(name);
    }//GEN-LAST:event_btnReadActionPerformed

    private void bntBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBackActionPerformed
        FrmStylesIreliaMenu frmStylesirelia;
        frmStylesirelia = new FrmStylesIreliaMenu();
        frmStylesirelia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntBackActionPerformed

    private void txtAppoinmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppoinmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppoinmentActionPerformed

    private void txtIdentificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificationActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAddStylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddStylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddStylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddStylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddStylist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBack;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAppoinment;
    private javax.swing.JTextField txtIdentification;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables
}
