/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package mib_projekt;
import oru.inf.InfDB;
import oru.inf.InfException; 

import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class AndraKontorsChef extends javax.swing.JFrame {
    private InfDB idb;
    
    /**
     * Creates new form AndraKontorsChef
     */
    public AndraKontorsChef() {
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

        jtxtAgentID = new javax.swing.JTextField();
        jlAndraKontorschef = new javax.swing.JLabel();
        jlSkrivIAgentID = new javax.swing.JLabel();
        jbBekraftaAndring = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtAgentID.setText("AgentID");

        jlAndraKontorschef.setText("Ändra kontorschef");

        jlSkrivIAgentID.setText("Skriv in AgentID för den nytillträdande kontorschefen");

        jbBekraftaAndring.setText("Bekräfta ändring");
        jbBekraftaAndring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBekraftaAndringActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAndraKontorschef)
                    .addComponent(jtxtAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSkrivIAgentID)
                    .addComponent(jbBekraftaAndring))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlAndraKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSkrivIAgentID)
                .addGap(18, 18, 18)
                .addComponent(jtxtAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBekraftaAndring)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBekraftaAndringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBekraftaAndringActionPerformed

        //Klicka på knapp bekfräta ändring
        
        if (jtxtAgentID.getText().isEmpty()){
        // Om textrutan är tom, visa felmeddelande
        JOptionPane.showMessageDialog(null, "Fyll i AgentID");
        jtxtAgentID.requestFocus();

        } else {
            try {
            String Agent_ID = jtxtAgentID.getText();
            
            //Kolla om Agent redan är kontorschef
            String existerandeChef = idb.fetchSingle(
               "SELECT agent_ID FROM kontorschef WHERE agent_ID =" + Agent_ID );
            
            if (existerandeChef !=null){
                JOptionPane.showMessageDialog(null, "Agenten du valt är den nuvarande kontorschefen");
                
            } else if (Agent_ID !=null){
                String agentNamn = idb.fetchSingle("SELECT Namn FROM agent WHERE agent_ID = " + Agent_ID);
                idb.update("UPDATE kontorschef SET agent_ID =" + Agent_ID);
                System.out.println("Kontorschefen är nu ändrad till " + agentNamn);
            
            } else{
            System.out.println("Kontorschefsändringen misslyckadas, kontrollera AgentID");
            }
        
            } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
            }
        } 
    }//GEN-LAST:event_jbBekraftaAndringActionPerformed
      
    
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
            java.util.logging.Logger.getLogger(AndraKontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraKontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraKontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraKontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraKontorsChef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBekraftaAndring;
    private javax.swing.JLabel jlAndraKontorschef;
    private javax.swing.JLabel jlSkrivIAgentID;
    private javax.swing.JTextField jtxtAgentID;
    // End of variables declaration//GEN-END:variables
}
