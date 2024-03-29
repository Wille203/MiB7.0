/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib_projekt;

import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author hillv
 */
public class NamnAllaAlien extends javax.swing.JFrame {

    private InfDB idb;
    private int valtAlienID;
    private String Tidigare;

    /**
     * Creates new form NamnAllaAlien
     */
    public NamnAllaAlien() {
        initComponents();
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("Databasanslutning lyckades");
            fyllCbtnAlienNamn();
        } catch (InfException ettUndantag) {
            // Visa felmeddelande om det uppstår problem med databasanslutningen
            JOptionPane.showMessageDialog(null, "Något gick fel vid anslutning till databasen!");
            System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
        }
    }
    public NamnAllaAlien(String Tidigare) {
        initComponents();
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("Databasanslutning lyckades");
            fyllCbtnAlienNamn();
            this.Tidigare = Tidigare;
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

        jButton1 = new javax.swing.JButton();
        cbtnAlienNamn = new javax.swing.JComboBox<>();
        lbAlien = new javax.swing.JLabel();
        btnAndra = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbtnAlienNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtnAlienNamnActionPerformed(evt);
            }
        });

        lbAlien.setText("Alien");

        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbtnAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka)
                .addGap(50, 50, 50)
                .addComponent(lbAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbtnAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnAndra)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fyllCbtnAlienNamn() {
        try {
            // SQL-fråga för att hämta Plats_ID och Benamning från plats-tabellen
            String fraga = "SELECT Alien_ID, Namn FROM Alien;";
            // Utför SQL-frågan och få resultatet
            var resultat = idb.fetchRows(fraga);

            // Iterera över varje rad i resultatet
            for (HashMap<String, String> rad : resultat) {
                // Hämta Plats_ID och Benamning från raden
                String AlienIdStr = rad.get("Alien_ID");
                String AlienNamn = rad.get("Namn");

                // Kontrollera om Plats_ID är inte null
                if (AlienIdStr != null) {
                    // Konvertera Plats_ID till integer
                    int AlienID = Integer.parseInt(AlienIdStr);
                    // Lägg till Benamning i dropdown-menyn
                    cbtnAlienNamn.addItem(AlienNamn);
                }
            }
        } catch (InfException ex) {
            // Visa felmeddelande om något går fel med databasen
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void cbtnAlienNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtnAlienNamnActionPerformed
        // TODO add your handling code here:
        String valtAlienNamn = (String) cbtnAlienNamn.getSelectedItem();

        try {
            // SQL-fråga för att hämta Alien_ID baserat på namnet
            String fraga = "SELECT Alien_ID FROM Alien WHERE Namn = '" + valtAlienNamn + "'";
            // Utför SQL-frågan och få resultatet
            var resultat = idb.fetchSingle(fraga);

            // Kontrollera om resultatet inte är null
            if (resultat != null) {
                // Konvertera resultatet till integer och lagra det i valtAlienID
                valtAlienID = Integer.parseInt(resultat);
            }
        } catch (InfException ex) {
            // Visa felmeddelande om något går fel med databasen
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }

    }//GEN-LAST:event_cbtnAlienNamnActionPerformed

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        // TODO add your handling code here:
        AndraInfoAlien nytt = new AndraInfoAlien(valtAlienID, Tidigare);
        NamnAllaAlien.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnAndraActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        if(Tidigare.equals("ADMIN")){
            EfterInloggAdmin nytt = new EfterInloggAdmin();
            NamnAllaAlien.this.setVisible(false);
            nytt.setVisible(true);
        }
        else{
            EfterInlogg nytt = new EfterInlogg();
            NamnAllaAlien.this.setVisible(false);
            nytt.setVisible(true);
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(NamnAllaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NamnAllaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NamnAllaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NamnAllaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NamnAllaAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbtnAlienNamn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbAlien;
    // End of variables declaration//GEN-END:variables
}
