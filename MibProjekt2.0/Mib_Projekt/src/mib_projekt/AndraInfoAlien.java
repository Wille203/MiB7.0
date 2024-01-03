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
public class AndraInfoAlien extends javax.swing.JFrame {

    private InfDB idb;
    private int AlienID;
    private String ursprungligRas;
    private String currentRas;
    private String columnName;

    /**
     * Creates new form AndraInfoAlien
     */
    public AndraInfoAlien() {
        initComponents();
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("Databasanslutning lyckades");
            fyllPlatsCBox();
            setTextFields();
            setNuvarandeRas();
            
            ursprungligRas = currentRas;
        } catch (InfException ettUndantag) {
            // Visa felmeddelande om det uppstår problem med databasanslutningen
            JOptionPane.showMessageDialog(null, "Något gick fel vid anslutning till databasen!");
            System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
        }
    }

    public AndraInfoAlien(int AlienID) {
        initComponents();
        this.AlienID = AlienID;
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("Databasanslutning lyckades");
            fyllPlatsCBox();
            setTextFields();
            setNuvarandeRas();
            
            ursprungligRas = currentRas;
        } catch (InfException ettUndantag) {
            // Visa felmeddelande om det uppstår problem med databasanslutningen
            JOptionPane.showMessageDialog(null, "Något gick fel vid anslutning till databasen!");
            System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
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

        btnAndraInfoAlien = new javax.swing.JButton();
        txtNyttLosenord = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbRas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbtnPlats = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        cbtnRas = new javax.swing.JComboBox<>();
        lbRasInfo = new javax.swing.JLabel();
        txtRasInfo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAndraInfoAlien.setText("Ändra");
        btnAndraInfoAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInfoAlienActionPerformed(evt);
            }
        });

        jLabel3.setText("Losenord:");

        lbRas.setText("Ras:");

        jLabel5.setText("Plats:");

        jLabel6.setText("Namn:");

        jLabel7.setText("Telefon");

        cbtnRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Squid", "Worm", "Boglodite" }));
        cbtnRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtnRasActionPerformed(evt);
            }
        });

        lbRasInfo.setText("Antal Armar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbRas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbtnRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbtnPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAndraInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRas)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbtnRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbtnPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnAndraInfoAlien)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbRasInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setNuvarandeRas() {
        try {
            String fraga1 = "SELECT Alien_ID FROM WORM WHERE ALIEN_ID = '" + AlienID + "'";
            String svarFraga1 = idb.fetchSingle(fraga1);
            if (svarFraga1 != null) {
                cbtnRas.removeAllItems();

                // Lägg till önskade strängar till JComboBox
                cbtnRas.addItem("Worm");
                cbtnRas.addItem("Squid");
                cbtnRas.addItem("Boglodite");

                String rasInfoFraga = "SELECT LANGD FROM WORM WHERE ALIEN_ID = '" + AlienID + "'";
                String svar = idb.fetchSingle(rasInfoFraga);
                txtRasInfo.setText(svar);
            }
            String fraga2 = "SELECT Alien_ID FROM SQUID WHERE ALIEN_ID = '" + AlienID + "'";
            String svarFraga2 = idb.fetchSingle(fraga2);
            if (svarFraga2 != null) {
                cbtnRas.removeAllItems();

                // Lägg till önskade strängar till JComboBox
                cbtnRas.addItem("Squid");
                cbtnRas.addItem("Worm");
                cbtnRas.addItem("Boglodite");

                String rasInfoFraga = "SELECT ANTAL_ARMAR FROM SQUID WHERE ALIEN_ID = '" + AlienID + "'";
                String svar = idb.fetchSingle(rasInfoFraga);
                txtRasInfo.setText(svar);
            } else {
                cbtnRas.removeAllItems();

                // Lägg till önskade strängar till JComboBox
                cbtnRas.addItem("Boglodite");
                cbtnRas.addItem("Squid");
                cbtnRas.addItem("Worm");

                String rasInfoFraga = "SELECT ANTAL_BOOGIES FROM BOGLODITE WHERE ALIEN_ID = '" + AlienID + "'";
                String svar = idb.fetchSingle(rasInfoFraga);
                txtRasInfo.setText(svar);
            }
            currentRas = (String) cbtnRas.getSelectedItem();

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void setTextFields() {

        try {
            String namnFraga = "SELECT Namn FROM ALIEN WHERE ALIEN_ID = '" + AlienID + "'";
            String svarNamn = idb.fetchSingle(namnFraga);
            txtNamn.setText(svarNamn);

            String losenordFraga = "SELECT Losenord FROM ALIEN WHERE ALIEN_ID = '" + AlienID + "'";
            String svarLosenord = idb.fetchSingle(losenordFraga);
            txtNyttLosenord.setText(svarLosenord);

            String telefonFraga = "SELECT Telefon FROM ALIEN WHERE ALIEN_ID = '" + AlienID + "'";
            String svarTelefon = idb.fetchSingle(telefonFraga);
            txtTelefon.setText(svarTelefon);

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }

    }

    private void btnAndraInfoAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraInfoAlienActionPerformed
        // TODO add your handling code here:
        try {
            String losenord = txtNyttLosenord.getText();
            String telefon = txtTelefon.getText();
            String Namn = txtNamn.getText();
            String rasInfo = txtRasInfo.getText();
            String Plats = (String) cbtnPlats.getSelectedItem();
            String Ras = (String) cbtnRas.getSelectedItem();

            String fragaPlatsID = "SELECT Plats_ID FROM plats WHERE Benamning = '" + Plats + "';";
            String platsID = idb.fetchSingle(fragaPlatsID);

            String andraAlienFraga = "UPDATE ALIEN SET Losenord = '" + losenord + "', Telefon = '" + telefon + "', Namn = '" + Namn + "', Plats = '" + platsID + "' WHERE ALIEN_ID = '" + AlienID + "';";
            idb.update(andraAlienFraga);

            if (!Ras.equals(currentRas)) {
                lbRasInfo.setText("Rasen har ändrats!");

                // Uppdatera currentRas till det nya värdet
                currentRas = Ras;

                deleteFromPreviousRaceTable();
                insertIntoNewRaceTable();

            }
            
          JOptionPane.showMessageDialog(null, "Alien registrerad!");


        } catch (InfException ex) {
            // Visa felmeddelande om något går fel med databasen
            JOptionPane.showMessageDialog(null, "Något gick fel vid uppdateringen av Alien!");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnAndraInfoAlienActionPerformed

    private void deleteFromPreviousRaceTable() throws InfException {

        try {
            // Implementera logiken för att radera alien från den föregående rasen
            if ("Squid".equals(ursprungligRas)) {
                String deleteFromSquid = "DELETE FROM SQUID WHERE ALIEN_ID = '" + AlienID + "'";
                idb.delete(deleteFromSquid);
            } else if ("Worm".equals(ursprungligRas)) {
                String deleteFromWorm = "DELETE FROM WORM WHERE ALIEN_ID = '" + AlienID + "'";
                idb.delete(deleteFromWorm);
            } else if ("Boglodite".equals(ursprungligRas)) {
                String deleteFromBoglodite = "DELETE FROM BOGLODITE WHERE ALIEN_ID = '" + AlienID + "'";
                idb.delete(deleteFromBoglodite);
            }
        } catch (InfException ex) {
            // Visa felmeddelande om något går fel med databasen
            JOptionPane.showMessageDialog(null, "Något gick fel vid raderingen av Alien från den föregående rasen!");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
    }

    private void insertIntoNewRaceTable() throws InfException {

        String rasInfo = txtRasInfo.getText();

        // Implementera logiken för att lägga till alien i den nya rasen
        if ("Squid".equals(currentRas)) {
            // Lägg till i den nya Squid-tabellen
            String insertIntoSquid = "INSERT INTO SQUID (ALIEN_ID, ANTAL_ARMAR) VALUES "
                    + "('" + AlienID + "', '" + rasInfo + "');";
            idb.insert(insertIntoSquid);
        } else if ("Worm".equals(currentRas)) {
            // Lägg till i den nya Worm-tabellen
            String insertIntoWorm = "INSERT INTO WORM (ALIEN_ID, LANGD) VALUES "
                    + "('" + AlienID + "', '" + rasInfo + "');";
            idb.insert(insertIntoWorm);
        } else if ("Boglodite".equals(currentRas)) {
            // Lägg till i den nya Boglodite-tabellen
            String insertIntoBogdolite = "INSERT INTO BOGLDODITE (ALIEN_ID, ANTAL_BOOGIES) VALUES "
                    + "('" + AlienID + "', '" + rasInfo + "');";
            idb.insert(insertIntoBogdolite);
        }
    }


    private void cbtnRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtnRasActionPerformed
        // TODO add your handling code here:
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

    private String hamtaNuvarandePlats() {
        try {
            String platsFraga = "SELECT Benamning FROM plats WHERE Plats_ID = (SELECT Plats FROM ALIEN WHERE ALIEN_ID = '" + AlienID + "')";
            String nuvarandePlats = idb.fetchSingle(platsFraga);

            // Kontrollera om resultatet är null eller tomt
            if (nuvarandePlats == null || nuvarandePlats.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingen plats hittades för den angivna alien.");
                return null;
            }

            return nuvarandePlats;
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel när platsen skulle hämtas!");
            System.out.println("Internt felmeddelande: " + ex.getMessage());
            return null;
        }
    }

    /**
     * @param args the command line arguments
     */
    private void fyllPlatsCBox() {
        try {
            // Hämta nuvarande plats för alien
            String nuvarandePlats = hamtaNuvarandePlats();

            // SQL-fråga för att hämta Plats_ID och Benamning från plats-tabellen
            String fraga = "SELECT Plats_ID, Benamning FROM plats;";
            // Utför SQL-frågan och få resultatet
            var resultat = idb.fetchRows(fraga);

            // Lägg till nuvarande plats för den valda alien i ComboBox
            cbtnPlats.addItem(nuvarandePlats);

            // Iterera över varje rad i resultatet
            for (HashMap<String, String> rad : resultat) {
                // Hämta Plats_ID och Benamning från raden
                String platsIdStr = rad.get("Plats_ID");
                String platsNamn = rad.get("Benamning");

                // Kontrollera om Plats_ID är inte null och inte samma som nuvarande plats
                if (platsIdStr != null && !platsIdStr.equals(nuvarandePlats)) {
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
            java.util.logging.Logger.getLogger(AndraInfoAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraInfoAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraInfoAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraInfoAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraInfoAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraInfoAlien;
    private javax.swing.JComboBox<String> cbtnPlats;
    private javax.swing.JComboBox<String> cbtnRas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbRas;
    private javax.swing.JLabel lbRasInfo;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtNyttLosenord;
    private javax.swing.JTextField txtRasInfo;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
