
package ec.edu.espe.stylesirelia.view;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.stylesirelia.controller.Connection;
import ec.edu.espe.stylesirelia.model.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.text.*;
import java.awt.print.*;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTable.PrintMode;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author widin
 */
public class FrmTableSupplier extends javax.swing.JFrame {

    /**
     * Creates new form FrmTableSupplier
     */
    public FrmTableSupplier() {
        initComponents();
        Connection.connectionDataBase();
    }
    
     public void loadSuppliersTable() {
       //borrar estas dos lineas despues de juntar todas las pantallas
        
        
        //-------
        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = Connection.mongodb.withCodecRegistry(codecRegistry);
        MongoCollection<Supplier> collectionSuppliers = db.getCollection("suppliers", Supplier.class); 
        List<Supplier> suppliers = collectionSuppliers.find(new Document(), Supplier.class).into(new ArrayList<Supplier>());

        Object[][] objects = new Object[suppliers.size()][5];

        for (int i = 0; i < suppliers.size(); i++) {
            objects[i][0] = suppliers.get(i).getName();
            objects[i][1] = suppliers.get(i).getNumber();
            objects[i][2] = suppliers.get(i).isPendingPayment();
            objects[i][3] =suppliers.get(i).getAppointment();
            objects[i][4] = suppliers.get(i).getAddress();
//            objects[i][5] = services.get(i).getAddress();

            tableSuppliers.setModel(new javax.swing.table.DefaultTableModel(
                    objects,
                    new String[]{
                         "Name", "Number", "PendingPayment", "Appointment", "Address"
                    }
            ));

        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSuppliers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnPrintSupplier = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableSuppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Number", "Pending Payment", "Appointment", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSuppliers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 630, 280));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("SUPPLIER TABLE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        btnBack.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        btnLoad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/view/banner.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        btnPrintSupplier.setText("Print table Supplier");
        btnPrintSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintSupplierActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrintSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed

        loadSuppliersTable();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmStylesIreliaMenu frmStylesirelia;
        frmStylesirelia = new FrmStylesIreliaMenu();
        frmStylesirelia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmSupplier frmSupplier;
        frmSupplier = new FrmSupplier();
        frmSupplier.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPrintSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintSupplierActionPerformed
       
                MessageFormat headerFormat = new MessageFormat("Table Supplier");
        MessageFormat footerFormat = new MessageFormat("- Página {0} -");
        try {
           tableSuppliers.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
        } catch (PrinterException ex) {
            Logger.getLogger(FrmTableService.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean complete = false;
        try {
            complete = tableSuppliers.print();
        } catch (PrinterException ex) {
            Logger.getLogger(FrmTableService.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (complete) {
            System.out.println("Impresión finalizada!");
        } else {
            System.out.println("Error al imprimir");
        }

        //        MessageFormat cabesa = new MessageFormat("table print");
        //        MessageFormat pie = new MessageFormat("Page{o,number.integer}");
        //        try {
            //            tableServices.print(JTable.PrintMode.NORMAL, cabesa, pie);
            //
            //        } catch (Exception e) {
            //            System.err.format("no se pudo imprimir", e.getMessage());
            //
            //        }
        
    }//GEN-LAST:event_btnPrintSupplierActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTableSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTableSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTableSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTableSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTableSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLoad;
    private javax.swing.JToggleButton btnPrintSupplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSuppliers;
    // End of variables declaration//GEN-END:variables
}
