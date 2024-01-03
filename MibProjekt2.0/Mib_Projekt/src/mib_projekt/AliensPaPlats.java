/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib_projekt;

import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author William
 */
public class AliensPaPlats extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form AliensPaPlats
     */
    public AliensPaPlats() {
        initComponents();
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("funka");
            fyllcbplats();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        cbplats = new javax.swing.JComboBox<>();
        cbVisaNamn = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbplats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbplatsActionPerformed(evt);
            }
        });

        cbVisaNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVisaNamnActionPerformed(evt);
            }
        });

        jLabel1.setText("Platsen");

        jLabel2.setText("Namnen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbplats, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVisaNamn, 0, 187, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbplats, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVisaNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbplatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbplatsActionPerformed
        cbVisaNamn.removeAllItems();
        fyllcbnamn();
    }//GEN-LAST:event_cbplatsActionPerformed

    private void cbVisaNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVisaNamnActionPerformed
    
    }//GEN-LAST:event_cbVisaNamnActionPerformed
    
    private void fyllcbplats(){
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
                    // Lägg till Benamning i dropdown-menyn
                    cbplats.addItem(platsNamn);
                }
            }
        } catch (InfException ex) {
            // Visa felmeddelande om något går fel med databasen
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }
    
    private void fyllcbnamn(){
        try {
            String platsen = (String)cbplats.getSelectedItem();
            String fraga = "SELECT Namn "
                + "FROM Alien, Plats "
                + "WHERE Benamning = '"+ platsen +"' "
                + "AND Alien.Plats = Plats_ID";
            ArrayList<String> namnen = idb.fetchColumn(fraga);

            // Iterera över varje rad i resultatet
            for(String alienNamn : namnen){
                // Hämta Plats_ID och Benamning från raden
                //String alienNamn = namnet.get("Namn");

                // Kontrollera om benämning inte null
                if (alienNamn != null) {
                    // Lägg till namnet i combo box
                    cbVisaNamn.addItem(alienNamn);
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
            java.util.logging.Logger.getLogger(AliensPaPlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AliensPaPlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AliensPaPlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AliensPaPlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AliensPaPlats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbVisaNamn;
    private javax.swing.JComboBox<String> cbplats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
