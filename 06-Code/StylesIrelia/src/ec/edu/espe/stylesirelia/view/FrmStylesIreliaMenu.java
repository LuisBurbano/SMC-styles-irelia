package ec.edu.espe.stylesirelia.view;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class FrmStylesIreliaMenu extends javax.swing.JFrame {
    
    
       @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/menu_bg.png"));
        return retValue;
    }
    

    /**
     * Creates new form frmStylesirelia
     */
    public FrmStylesIreliaMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        txtStyles = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmaddstylist = new javax.swing.JMenuItem();
        itmUpdateStylist = new javax.swing.JMenuItem();
        itemDeleteStylist = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        itmSupplier = new javax.swing.JMenuItem();
        itmProduct = new javax.swing.JMenuItem();
        itmServices = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itmTableSupplier = new javax.swing.JMenu();
        itmTableProduct = new javax.swing.JMenuItem();
        itmTableCustomer = new javax.swing.JMenuItem();
        itmTableService = new javax.swing.JMenuItem();
        itmTableStylist = new javax.swing.JMenuItem();
        itmTableSupllier = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itemAddSuppliers = new javax.swing.JMenuItem();
        itemUpdateSuppliers = new javax.swing.JMenuItem();
        itemDeleteSuppliers = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        itemAddService = new javax.swing.JMenuItem();
        itemUpdateService = new javax.swing.JMenuItem();
        itemDeleteService = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/view/mn_bg.jpg"))); // NOI18N

        txtStyles.setText("Styles Irelia");
        txtStyles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStylesActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        txtStyles.add(jMenuItem1);

        jMenuBar1.add(txtStyles);

        jMenu2.setText("Stylist");

        itmaddstylist.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmaddstylist.setText("Add Stylist");
        itmaddstylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmaddstylistActionPerformed(evt);
            }
        });
        jMenu2.add(itmaddstylist);

        itmUpdateStylist.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmUpdateStylist.setText("Update Stylist");
        itmUpdateStylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateStylistActionPerformed(evt);
            }
        });
        jMenu2.add(itmUpdateStylist);

        itemDeleteStylist.setText("Delete Stylist");
        itemDeleteStylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeleteStylistActionPerformed(evt);
            }
        });
        jMenu2.add(itemDeleteStylist);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Products");

        jMenuItem2.setText("Add or sell");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        itmSupplier.setText("Supplier");
        itmSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSupplierActionPerformed(evt);
            }
        });
        jMenu4.add(itmSupplier);

        itmProduct.setText("Product");
        itmProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProductActionPerformed(evt);
            }
        });
        jMenu4.add(itmProduct);

        itmServices.setText("Services");
        itmServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmServicesActionPerformed(evt);
            }
        });
        jMenu4.add(itmServices);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");
        jMenuBar1.add(jMenu5);

        itmTableSupplier.setText("Tables");

        itmTableProduct.setText("Table Product");
        itmTableProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTableProductActionPerformed(evt);
            }
        });
        itmTableSupplier.add(itmTableProduct);

        itmTableCustomer.setText("TableCustomer");
        itmTableCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTableCustomerActionPerformed(evt);
            }
        });
        itmTableSupplier.add(itmTableCustomer);

        itmTableService.setText("Table Service");
        itmTableService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTableServiceActionPerformed(evt);
            }
        });
        itmTableSupplier.add(itmTableService);

        itmTableStylist.setText("Table Stylist");
        itmTableStylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTableStylistActionPerformed(evt);
            }
        });
        itmTableSupplier.add(itmTableStylist);

        itmTableSupllier.setText("Table Supplier");
        itmTableSupllier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTableSupllierActionPerformed(evt);
            }
        });
        itmTableSupplier.add(itmTableSupllier);

        jMenuBar1.add(itmTableSupplier);

        jMenu6.setText("Supplier");

        itemAddSuppliers.setText("Add Supplier");
        itemAddSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddSuppliersActionPerformed(evt);
            }
        });
        jMenu6.add(itemAddSuppliers);

        itemUpdateSuppliers.setText("Update Supplier");
        itemUpdateSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdateSuppliersActionPerformed(evt);
            }
        });
        jMenu6.add(itemUpdateSuppliers);

        itemDeleteSuppliers.setText("Delete Supplier");
        itemDeleteSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeleteSuppliersActionPerformed(evt);
            }
        });
        jMenu6.add(itemDeleteSuppliers);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Services");

        itemAddService.setText("Add Service");
        itemAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddServiceActionPerformed(evt);
            }
        });
        jMenu7.add(itemAddService);

        itemUpdateService.setText("Update Service");
        itemUpdateService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdateServiceActionPerformed(evt);
            }
        });
        jMenu7.add(itemUpdateService);

        itemDeleteService.setText("Delete Service");
        itemDeleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeleteServiceActionPerformed(evt);
            }
        });
        jMenu7.add(itemDeleteService);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStylesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStylesActionPerformed
        FrmStylesIreliaMenu frmStylesirelia;
        frmStylesirelia = new FrmStylesIreliaMenu();
        frmStylesirelia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtStylesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmProduct frmProduct;
        frmProduct = new FrmProduct();
        frmProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void itmaddstylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmaddstylistActionPerformed
        FrmAddStylist frmCustomer;
        frmCustomer = new FrmAddStylist();
        frmCustomer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmaddstylistActionPerformed

    private void itmUpdateStylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateStylistActionPerformed
        FrmUpdateStylist frmAddStylist;
        frmAddStylist = new FrmUpdateStylist();
        frmAddStylist.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmUpdateStylistActionPerformed

    private void itmProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProductActionPerformed
        FrmProduct frmProduct;
        frmProduct = new FrmProduct();
        frmProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmProductActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmAbout frmAbout;
        frmAbout = new FrmAbout();
        frmAbout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itmTableStylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTableStylistActionPerformed
        FrmTableStylist frmTableStylist;
        frmTableStylist = new FrmTableStylist();
        frmTableStylist.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmTableStylistActionPerformed

    private void itmTableProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTableProductActionPerformed
        FrmTableProduct frmTableProduct;
        frmTableProduct = new FrmTableProduct();
        frmTableProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmTableProductActionPerformed

    private void itmSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSupplierActionPerformed
         FrmSupplier frmSupplier;
        frmSupplier = new FrmSupplier();
        frmSupplier.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmSupplierActionPerformed

    private void itmTableCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTableCustomerActionPerformed
        FrmTableCustomer frmTableCustomer;
        frmTableCustomer = new FrmTableCustomer();
        frmTableCustomer.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_itmTableCustomerActionPerformed

    private void itmTableServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTableServiceActionPerformed
        
        FrmTableService frmTableService;
        frmTableService = new FrmTableService();
        frmTableService.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmTableServiceActionPerformed

    private void itmTableSupllierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTableSupllierActionPerformed
        
        FrmTableSupplier frmTableSupplier;
        frmTableSupplier = new FrmTableSupplier();
        frmTableSupplier.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmTableSupllierActionPerformed

    private void itmServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmServicesActionPerformed
        FrmService frmService;
        frmService = new FrmService();
        frmService.setVisible(true);
        this.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_itmServicesActionPerformed

    private void itemAddSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddSuppliersActionPerformed
       FrmSupplier frmSupplier;
        frmSupplier = new FrmSupplier();
        frmSupplier.setVisible(true);
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_itemAddSuppliersActionPerformed

    private void itemUpdateSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdateSuppliersActionPerformed
        FrmUpdateSupplier frmUpdateSupplier;
        frmUpdateSupplier = new FrmUpdateSupplier();
        frmUpdateSupplier.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_itemUpdateSuppliersActionPerformed

    private void itemDeleteSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeleteSuppliersActionPerformed
       FrmDeleteSupplier frmDeleteSupplier;
        frmDeleteSupplier = new FrmDeleteSupplier();
        frmDeleteSupplier.setVisible(true);
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_itemDeleteSuppliersActionPerformed

    private void itemAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddServiceActionPerformed
        FrmService frmService;
        frmService = new FrmService();
        frmService.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_itemAddServiceActionPerformed

    private void itemUpdateServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdateServiceActionPerformed
       FrmUpdateService frmService;
        frmService = new FrmUpdateService();
        frmService.setVisible(true);
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_itemUpdateServiceActionPerformed

    private void itemDeleteServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeleteServiceActionPerformed
       FrmDeleteService frmService;
        frmService = new FrmDeleteService();
        frmService.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_itemDeleteServiceActionPerformed

    private void itemDeleteStylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeleteStylistActionPerformed
        FrmDeleteStylist frmAddStylist;
        frmAddStylist = new FrmDeleteStylist();
        frmAddStylist.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_itemDeleteStylistActionPerformed

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
            java.util.logging.Logger.getLogger(FrmStylesIreliaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStylesIreliaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStylesIreliaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStylesIreliaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStylesIreliaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAddService;
    private javax.swing.JMenuItem itemAddSuppliers;
    private javax.swing.JMenuItem itemDeleteService;
    private javax.swing.JMenuItem itemDeleteStylist;
    private javax.swing.JMenuItem itemDeleteSuppliers;
    private javax.swing.JMenuItem itemUpdateService;
    private javax.swing.JMenuItem itemUpdateSuppliers;
    private javax.swing.JMenuItem itmProduct;
    private javax.swing.JMenuItem itmServices;
    private javax.swing.JMenuItem itmSupplier;
    private javax.swing.JMenuItem itmTableCustomer;
    private javax.swing.JMenuItem itmTableProduct;
    private javax.swing.JMenuItem itmTableService;
    private javax.swing.JMenuItem itmTableStylist;
    private javax.swing.JMenuItem itmTableSupllier;
    private javax.swing.JMenu itmTableSupplier;
    private javax.swing.JMenuItem itmUpdateStylist;
    private javax.swing.JMenuItem itmaddstylist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu txtStyles;
    // End of variables declaration//GEN-END:variables
}
