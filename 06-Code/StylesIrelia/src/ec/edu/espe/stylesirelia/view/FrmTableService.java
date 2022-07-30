package ec.edu.espe.stylesirelia.view;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.stylesirelia.controller.Connection;
import ec.edu.espe.stylesirelia.model.Service;

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
public class FrmTableService extends javax.swing.JFrame {

    /**
     * Creates new form FrmTableService
     */
    public FrmTableService() {
        initComponents();
        Connection.connectionDataBase();
    }
    
     public void loadServicesTable() { 
        
        //-------
        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = Connection.mongodb.withCodecRegistry(codecRegistry);
        MongoCollection<Service> collectionServices = db.getCollection("services", Service.class); 
        List<Service> services = collectionServices.find(new Document(), Service.class).into(new ArrayList<Service>());

        Object[][] objects = new Object[services.size()][5];

        for (int i = 0; i < services.size(); i++) {
            objects[i][0] = services.get(i).getName();
            objects[i][1] = services.get(i).getPrice();
            objects[i][2] = services.get(i).isPendingPayment();
            objects[i][3] = services.get(i).isAvailable();
            objects[i][4] = services.get(i).getAvailableStylist();


            tableServices.setModel(new javax.swing.table.DefaultTableModel(
                    objects,
                    new String[]{
                         "Name", "Price", "PendingPayment", "Available", "AavailableStylist"
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableServices = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnPrintService = new javax.swing.JToggleButton();
        btnImprimir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableServices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Price", "Pending Payment", "Available", "Available Stylist"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableServices);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 540, 380));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("SERVICE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 220, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        jPanel3.add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/sources/bg-logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, -10, 270, -1));

        btnPrintService.setText("Print Table Service");
        btnPrintService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintServiceActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrintService, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        btnImprimir.setText("imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnImprimir)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnImprimir)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed

        loadServicesTable();

    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmStylesIreliaMenu frmStylesirelia;
        frmStylesirelia = new FrmStylesIreliaMenu();
        frmStylesirelia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        MessageFormat headerFormat = new MessageFormat("Services");
        MessageFormat footerFormat = new MessageFormat("- Página {0} -");
        try {
            tableServices.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
        } catch (PrinterException ex) {
            Logger.getLogger(FrmTableService.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean complete = false;
        try {
            complete = tableServices.print();
        } catch (PrinterException ex) {
            Logger.getLogger(FrmTableService.class.getName()).log(Level.SEVERE, null, ex);
        }
         if (complete) {
            System.out.println("---print finished!--");
        } else {
            System.out.println("---Error printing---");
        }

       
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnPrintServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintServiceActionPerformed

        MessageFormat headerFormat = new MessageFormat("Table Service");
        MessageFormat footerFormat = new MessageFormat("- Página {0} -");
        try {
            tableServices.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
        } catch (PrinterException ex) {
            Logger.getLogger(FrmTableService.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean complete = false;
        try {
            complete = tableServices.print();
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
    }//GEN-LAST:event_btnPrintServiceActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTableService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTableService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTableService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTableService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTableService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JToggleButton btnImprimir;
    private javax.swing.JButton btnLoad;
    private javax.swing.JToggleButton btnPrintService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableServices;
    // End of variables declaration//GEN-END:variables
}
