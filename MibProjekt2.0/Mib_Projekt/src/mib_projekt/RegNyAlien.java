/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib_projekt;

import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author hillv
 */
public class RegNyAlien extends javax.swing.JFrame {

    private InfDB idb;
    private int agentID;
    private String columnName;
    /**
     * Creates new form RegNyAlien
     */
    public RegNyAlien() {
        initComponents();

        // Försök att skapa en anslutning till databasen
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("Databasanslutning lyckades");
            fyllPlatsCBox();
        } catch (InfException ettUndantag) {
            // Visa felmeddelande om det uppstår problem med databasanslutningen
            JOptionPane.showMessageDialog(null, "Något gick fel vid anslutning till databasen!");
            System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
        }
    }

    public RegNyAlien(int agentID) {
        initComponents();
        this.agentID = agentID;

        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("funka");
            fyllPlatsCBox();
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
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

        cbtnPlats = new javax.swing.JComboBox<>();
        lbPlats = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();
        lbNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lbEpost = new javax.swing.JLabel();
        txtEpost = new javax.swing.JTextField();
        lbLosenord = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JTextField();
        lbTelefon = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        cbtnRas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtInfoRas = new javax.swing.JTextField();
        lbRasInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPlats.setText("Plats:");

        btnReg.setText("Registera");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        lbNamn.setText("Namn:");

        lbEpost.setText("Epost:");

        lbLosenord.setText("Losenord:");

        lbTelefon.setText("Telefon:");

        cbtnRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Squid", "Worm", "Boglodite" }));
        cbtnRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtnRasActionPerformed(evt);
            }
        });

        jLabel1.setText("Ras:");

        lbRasInfo.setText("Antal armar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbtnPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbRasInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInfoRas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtnRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(lbLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNamn)
                            .addComponent(lbEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTelefon)
                            .addComponent(lbPlats)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtnPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtnRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLosenord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lbRasInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInfoRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnReg)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TODO add your handling 
        try {
            // Hämta värden från användarinmatning
            String epost = txtEpost.getText();
            String losenord = txtLosenord.getText();
            String telefon = txtTelefon.getText();
            String Namn = txtNamn.getText();

            // Hämta valt platsnamn från dropdown-menyn
            String valtPlatsNamn = cbtnPlats.getSelectedItem().toString();

            // Hämta plats ID baserat på platsnamnet
            String fragaPlatsID = "SELECT Plats_ID FROM plats WHERE Benamning = '" + valtPlatsNamn + "';";
            String platsID = idb.fetchSingle(fragaPlatsID);

            // Skapa nytt AlienID
            String fragaAlienID = "SELECT COALESCE(MAX(Alien_ID), 0) + 1 AS NextAlienID FROM Alien";
            String alienIDResult = idb.fetchSingle(fragaAlienID);
            int alienID = (alienIDResult != null) ? Integer.parseInt(alienIDResult) : 1;

            // Bygg upp SQL-frågan för att registrera alien i databasen
            String fragaRegistreraAlien = "INSERT INTO alien (Epost, Losenord, Alien_ID, Telefon, Plats, Namn, Registreringsdatum, Ansvarig_Agent) VALUES "
                    + "('" + epost + "', '" + losenord + "', '" + alienID + "', '" + telefon + "', '" + platsID + "', '" + Namn + "', CURDATE(),'" + agentID + "');";

            // Utför SQL-frågan för att registrera alien
            idb.insert(fragaRegistreraAlien);

            String InfoRas = txtInfoRas.getText();
            int InfoRas1 = Integer.parseInt(InfoRas);

            String rasTable = (String) cbtnRas.getSelectedItem();
            String fragaRasAlien = "INSERT INTO " + rasTable + " (Alien_ID, " + columnName + ") VALUES (" + alienID + "," + InfoRas1 + ");";
            // Utför SQL-frågan för att registrera alien
            idb.insert(fragaRasAlien);
            // Visa meddelande om registreringen lyckades
            JOptionPane.showMessageDialog(null, "Alien registrerad!");

        } catch (InfException ex) {
            // Visa felmeddelande om något går fel med databasen
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }

    }//GEN-LAST:event_btnRegActionPerformed

    private void cbtnRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtnRasActionPerformed
        String ras = (String) cbtnRas.getSelectedItem();

        if ("Squid".equals(ras)) {
            lbRasInfo.setText("Antal armar:");
            columnName = "Antal_Armar";
        } else if ("Worm".equals(ras)) {
            lbRasInfo.setText("Längd:");
            columnName = "Langd";
        } else if ("Boglodite".equals(ras)) {
            lbRasInfo.setText("Antal Boogies:");
            columnName = "Antal_Boogies";
        }
    }//GEN-LAST:event_cbtnRasActionPerformed

    private void fyllPlatsCBox() {
        try {
            // SQL-fråga för att hämta Plats_ID och Benamning från plats-tabellen
            String fraga = "SELECT Plats_ID, Benamning FROM plats;";
            // Utför SQL-frågan och få resultatet
            var resultat = idb.fetchRows(fraga);

            // Iterera över varje rad i resultatet
            for (HashMap<String, String> rad : resultat) {
                // Hämta Plats_ID och Benamning från raden
                String platsIdStr = rad.get("Plats_ID");
                String platsNamn = rad.get("Benamning");

                // Kontrollera om Plats_ID är inte null
                if (platsIdStr != null) {
                    // Konvertera Plats_ID till integer
                    int platsId = Integer.parseInt(platsIdStr);
                    // Lägg till Benamning i dropdown-menyn
                    cbtnPlats.addItem(platsNamn);
                }
            }
        } catch (InfException ex) {
            // Visa felmeddelande om något går fel med databasen
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(RegNyAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegNyAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegNyAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegNyAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegNyAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox<String> cbtnPlats;
    private javax.swing.JComboBox<String> cbtnRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbEpost;
    private javax.swing.JLabel lbLosenord;
    private javax.swing.JLabel lbNamn;
    private javax.swing.JLabel lbPlats;
    private javax.swing.JLabel lbRasInfo;
    private javax.swing.JLabel lbTelefon;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtInfoRas;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}