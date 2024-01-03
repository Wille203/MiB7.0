/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib_projekt;

import javax.swing.JOptionPane;
import oru.inf.InfException;
import oru.inf.InfDB;

/**
 *
 * @author David
 */
public class SokaFramOmradesChef extends javax.swing.JFrame {
   
    private InfDB idb;
    /**
     * Creates new form SokaFramOmradesChef
     */
    public SokaFramOmradesChef() {
        initComponents();
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("funka");
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

        CBomrade = new javax.swing.JComboBox<>();
        SökfunktionOmradesansvarigAgent = new javax.swing.JLabel();
        btSokKnapp = new javax.swing.JButton();
        lbAnsvarigAgent = new javax.swing.JLabel();
        lbAgentNamn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CBomrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));

        SökfunktionOmradesansvarigAgent.setText("Sökfunktion: Områdesansvariga agenter");

        btSokKnapp.setText("Sök");
        btSokKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSokKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSokKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBomrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SökfunktionOmradesansvarigAgent)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbAgentNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAnsvarigAgent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SökfunktionOmradesansvarigAgent)
                .addGap(18, 18, 18)
                .addComponent(CBomrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSokKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAnsvarigAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbAgentNamn)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSokKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSokKnappActionPerformed
        
    String omradeValt = CBomrade.getSelectedItem().toString();

    try{
        String chefOverOmrade = hamtaChefForOmrade(omradeValt);
        
        
        lbAnsvarigAgent.setText("Områdeschefen över " + omradeValt + " är: " + chefOverOmrade + "");
    } catch (InfException undantag){
        undantag.printStackTrace();
        JOptionPane.showMessageDialog(null, "Något gick fel");
        System.out.println("Något blev inte som tänkt");
     }
    }//GEN-LAST:event_btSokKnappActionPerformed

    private String hamtaChefForOmrade(String omradeValt) throws InfException {
        String fraga = "SELECT agent.Namn FROM Omradeschef " +
            "JOIN Omrade ON Omradeschef.Omrade = Omrade.Omrades_ID " +
            "JOIN Agent ON Omradeschef.Agent_ID = Agent.Agent_ID " +
            "WHERE Omrade.Benamning = '" + omradeValt + "'";
        return idb.fetchSingle(fraga);
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
            java.util.logging.Logger.getLogger(SokaFramOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SokaFramOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SokaFramOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SokaFramOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SokaFramOmradesChef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBomrade;
    private javax.swing.JLabel SökfunktionOmradesansvarigAgent;
    private javax.swing.JButton btSokKnapp;
    private javax.swing.JLabel lbAgentNamn;
    private javax.swing.JLabel lbAnsvarigAgent;
    // End of variables declaration//GEN-END:variables
}
