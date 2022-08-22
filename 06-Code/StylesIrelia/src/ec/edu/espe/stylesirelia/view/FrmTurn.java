package ec.edu.espe.stylesirelia.view;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.toedter.calendar.JDateChooser;
import ec.edu.espe.stylesirelia.controller.TurnController;
import ec.edu.espe.stylesirelia.controller.Connection;
import ec.edu.espe.stylesirelia.model.Turn;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import ec.edu.espe.stylesirelia.controller.Connection;
import ec.edu.espe.stylesirelia.model.Customer;
import ec.edu.espe.stylesirelia.model.Service;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class FrmTurn extends javax.swing.JFrame {

    SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
    private TurnController cTurn;
    public String getDate(JDateChooser jdDate) {
        if (jdDate.getDate() != null) {
            return formDate.format(jdDate.getDate());
        } else {
            return null;
        }

    }

    /**
     * Creates new form FrmTurn
     */
    public FrmTurn() {
        initComponents();
        Connection.connectionDataBase();
        cTurn = new TurnController();
        loadCustomerComboBox();
        loadServiceComboBox();
    }
    public void loadServiceComboBox() {

        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = Connection.mongodb.withCodecRegistry(codecRegistry);
        MongoCollection<Service> collectionServices = db.getCollection("services", Service.class);
        List<Service> services = collectionServices.find(new Document(), Service.class).into(new ArrayList<Service>());

        for (Service service : services) {
            comboBoxServices.addItem(service.getName());
        }

    }
     public void loadCustomerComboBox() {

        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = Connection.mongodb.withCodecRegistry(codecRegistry);
        MongoCollection<Customer> collectionCustomers = db.getCollection("customers", Customer.class);
        List<Customer> customers = collectionCustomers.find(new Document(), Customer.class).into(new ArrayList<Customer>());

        for (Customer customer : customers) {
            comboBoxCustomers.addItem(customer.getIdentificationCard());
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dtcServiceTurn = new com.toedter.calendar.JDateChooser();
        btnRegisterTurn = new javax.swing.JButton();
        comboBoxServices = new javax.swing.JComboBox<>();
        btnBackToMenu = new javax.swing.JButton();
        txtGetATurn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxCustomers = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("Styles Irelia");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("About");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Login Stylist");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Products");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");
        jMenuBar1.add(jMenu5);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Seleccionar servicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        dtcServiceTurn.setMaxSelectableDate(new java.util.Date(1672552916000L));
        dtcServiceTurn.setMinSelectableDate(new java.util.Date(1657605716000L));
        jPanel1.add(dtcServiceTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 176, -1));

        btnRegisterTurn.setText("Registrar turno");
        btnRegisterTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterTurnActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisterTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 216, -1, -1));

        comboBoxServices.setToolTipText("");
        jPanel1.add(comboBoxServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 176, -1));

        btnBackToMenu.setText("Volver");
        btnBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnBackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 216, -1, -1));

        txtGetATurn.setText("Turno");
        jPanel1.add(txtGetATurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 25, -1, -1));

        jLabel1.setText("Fecha del turno");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/sources/bg-logo.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -80, -1, -1));
        jPanel1.add(comboBoxCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 190, -1));

        jLabel4.setText("Cedula");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btnBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMenuActionPerformed
        FrmStylesIreliaMenu frmStylesirelia;
        frmStylesirelia = new FrmStylesIreliaMenu();
        frmStylesirelia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToMenuActionPerformed

    private void btnRegisterTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterTurnActionPerformed
        
        String date;
        date = formDate.format(dtcServiceTurn.getDate());

        Turn turn = new Turn(1, date,comboBoxCustomers.getSelectedItem().toString(), comboBoxServices.getSelectedItem().toString());
        
        cTurn.create(cTurn.buildDocument(turn));
        Document result = cTurn.read(cTurn.buildDocument(turn));
        if (result!=null) {
            JOptionPane.showMessageDialog(null, "Successfully created");
        }else{
            JOptionPane.showMessageDialog(null, "A problem has occurred");
        }

    }//GEN-LAST:event_btnRegisterTurnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTurn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToMenu;
    private javax.swing.JButton btnRegisterTurn;
    private javax.swing.JComboBox<String> comboBoxCustomers;
    private javax.swing.JComboBox<String> comboBoxServices;
    private com.toedter.calendar.JDateChooser dtcServiceTurn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtGetATurn;
    // End of variables declaration//GEN-END:variables
}
