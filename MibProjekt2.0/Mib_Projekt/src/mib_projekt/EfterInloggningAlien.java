/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib_projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;
import mib_projekt.BytaLosenord;

/**
 *
 * @author William
 */
public class EfterInloggningAlien extends javax.swing.JFrame {
    private String eposten;
    private InfDB idb;
    /**
     * Creates new form EfterInloggningAlien
     */
    public EfterInloggningAlien() {
        initComponents();
    }
    //Konstruktor för att få epost
    public EfterInloggningAlien(String eposten) {
        this.eposten=eposten;
        initComponents();
        lbTest.setText("Välkommen " + eposten);
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("funka");
        }
         catch(InfException ettUndantag) {
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

        lbTest = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbLosenord = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbOmradeschef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Byta Lösenord");

        jbLosenord.setText("Byta Lösenord");
        jbLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLosenordActionPerformed(evt);
            }
        });

        jLabel2.setText("Visa information om ansvarig områdeschef");

        jbOmradeschef.setText("Information");
        jbOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOmradeschefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbLosenord)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTest, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jbOmradeschef)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTest, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbOmradeschef)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLosenordActionPerformed
        // TODO add your handling code here:
        BytaLosenord nytt = new BytaLosenord(eposten);
        EfterInloggningAlien.this.setVisible(false);
        nytt.setVisible(true);
        
    }//GEN-LAST:event_jbLosenordActionPerformed

    private void jbOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOmradeschefActionPerformed

        try{
            //SQL fråga som hämtar namn epost och telefon som är den ansvarige områdeschefen
            System.out.println("Bra");
            String fraga = "SELECT Agent.Namn, Agent.Epost, Agent.Telefon "
                    + "FROM Alien, Plats, Omradeschef, Agent "
                    + "WHERE Alien.Epost = '"+ eposten +"' AND Plats = Plats_ID "
                    + "AND Finns_I = Omradeschef.Omrade AND Omradeschef.Agent_ID = Agent.Agent_ID;";
            System.out.println("Bättre");
            HashMap<String,String> svaret = idb.fetchRow(fraga);
            System.out.println("Bäst");
            JOptionPane.showMessageDialog(null, svaret);
        }
        catch (InfException ex){
              JOptionPane.showMessageDialog(null, "Något gick fel!");
              System.out.println("Internt felmeddelande" + ex.getMessage());

           }
    }//GEN-LAST:event_jbOmradeschefActionPerformed

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
            java.util.logging.Logger.getLogger(EfterInloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EfterInloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EfterInloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EfterInloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EfterInloggningAlien().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbLosenord;
    private javax.swing.JButton jbOmradeschef;
    private javax.swing.JLabel lbTest;
    // End of variables declaration//GEN-END:variables
}
