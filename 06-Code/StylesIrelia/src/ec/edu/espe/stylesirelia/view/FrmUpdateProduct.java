/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.stylesirelia.view;

import com.toedter.calendar.JDateChooser;
import ec.edu.espe.stylesirelia.controller.Connection;
import ec.edu.espe.stylesirelia.controller.ProductController;
import ec.edu.espe.stylesirelia.model.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author widin
 */
public class FrmUpdateProduct extends javax.swing.JFrame {

    SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
    ProductController productController;

    public String getDate(JDateChooser jdDate) {
        if (jdDate.getDate() != null) {
            return formDate.format(jdDate.getDate());
        } else {
            return null;
        }

    }

    /**
     * Creates new form FrmUpdateProduct
     */
    public FrmUpdateProduct() {
        initComponents();
        Connection.connectionDataBase();
        productController = new ProductController();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNameProduct = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        Appoiment = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBackMenu = new javax.swing.JButton();
        txtExpirationDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("UPDATE PRODUCT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/sources/bg-logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -20, -1, -1));
        jPanel1.add(txtNameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 164, -1));

        jLabel3.setText("Name Product");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 121, -1));

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel1.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 78, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 164, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 164, -1));

        jLabel5.setText("Price:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 121, -1));

        jLabel6.setText("Expiration:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 121, -1));
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 164, -1));

        Appoiment.setText("Stock");
        jPanel1.add(Appoiment, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 121, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        btnBackMenu.setText("Back to Menu");
        btnBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnBackMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));
        jPanel1.add(txtExpirationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        try {
            Document doc = productController.read(txtNameProduct.getText(), "name");
            Product product = productController.parseDocumentToClass(doc);
            txtNameProduct.setText(product.getName());
            txtStock.setText(product.getExpiration());
            txtName.setText(product.getName());
            txtPrice.setText(String.valueOf(product.getPrice()));
            txtExpirationDate.setDate(formDate.parse(product.getExpiration()));
            txtStock.setText(String.valueOf(product.getStock()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Something happened, please try again");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "It was not found");
        }
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Product product = new Product(txtName.getText(),Float.parseFloat(txtPrice.getText()),formDate.format(txtExpirationDate.getDate()),Integer.parseInt(txtStock.getText()));
        Document doc = productController.read(txtNameProduct.getText(), "name");
          
        productController.update(doc, productController.buildDocument(product));
        Document result = productController.read(productController.buildDocument(product));
        if (result!=null) {
            
            JOptionPane.showMessageDialog(null, "Updated successfully");
        }else{
            JOptionPane.showMessageDialog(null, "A problem has occurred");
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMenuActionPerformed
        FrmStylesIreliaMenu frmStylesIreliaMenu = new FrmStylesIreliaMenu();
        frmStylesIreliaMenu.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnBackMenuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appoiment;
    private javax.swing.JButton btnBackMenu;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser txtExpirationDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameProduct;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
