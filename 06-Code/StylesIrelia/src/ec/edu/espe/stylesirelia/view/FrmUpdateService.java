/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.stylesirelia.view;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.stylesirelia.controller.ServiceController;
import ec.edu.espe.stylesirelia.controller.Connection;
import ec.edu.espe.stylesirelia.model.Service;
import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author widin
 */
public class FrmUpdateService extends javax.swing.JFrame {

    private ServiceController serviceController;

    /**
     * Creates new form FrmUpdateService
     */
    public FrmUpdateService() {
        initComponents();
        Connection.connectionDataBase();
        serviceController = new ServiceController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAvailableStylist = new javax.swing.JTextField();
        txtAvailable = new javax.swing.JTextField();
        txtPendingPayment = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBackToMenu = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Services");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 6, -1, -1));

        jLabel2.setText("Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 102, -1, -1));

        txtAvailableStylist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAvailableStylistKeyTyped(evt);
            }
        });
        jPanel3.add(txtAvailableStylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 241, 132, -1));
        jPanel3.add(txtAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 207, 230, -1));
        jPanel3.add(txtPendingPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 173, 230, -1));

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });
        jPanel3.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 133, 230, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 230, -1));

        jLabel3.setText("Price");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 136, -1, -1));

        jLabel4.setText("Pending Payment");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 176, -1, -1));

        jLabel5.setText("Available");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 210, -1, -1));

        jLabel6.setText("Available Stylist");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 244, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/view/banner.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        btnBackToMenu.setText("Back ");
        btnBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMenuActionPerformed(evt);
            }
        });
        jPanel3.add(btnBackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        btnUpdate.setText("Update ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel3.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMenuActionPerformed
        FrmStylesIreliaMenu frmStylesirelia;
        frmStylesirelia = new FrmStylesIreliaMenu();
        frmStylesirelia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToMenuActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        Document doc = serviceController.read(txtName.getText(), "name");

        Service service = new Service(txtName.getText(), Double.parseDouble(txtPrice.getText()), false, false, txtAvailableStylist.getText());

        serviceController.update(doc, serviceController.buildDocument(service));
        Document result = serviceController.read(serviceController.buildDocument(service));
        if (result!=null) {
            
            JOptionPane.showMessageDialog(null, "Updated successfully");
        }else{
            JOptionPane.showMessageDialog(null, "A problem has occurred");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        try {
            Document doc = serviceController.read(txtName.getText(), "name");

            Service service = serviceController.parseDocumentToClass(doc);
            txtName.setText(service.getName());
            txtName.setText(service.getName());
            txtPrice.setText(String.valueOf(service.getPrice()));
            txtAvailable.setText(String.valueOf(service.isAvailable()));
            txtAvailableStylist.setText(service.getAvailableStylist());
            txtPendingPayment.setText(String.valueOf(service.isPendingPayment()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "It was not found");
        }


    }//GEN-LAST:event_btnFindActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
         char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");}// TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros \n Enter only numbers");} // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtAvailableStylistKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailableStylistKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");} // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableStylistKeyTyped

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
            java.util.logging.Logger.getLogger(FrmUpdateService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToMenu;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtAvailableStylist;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPendingPayment;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
