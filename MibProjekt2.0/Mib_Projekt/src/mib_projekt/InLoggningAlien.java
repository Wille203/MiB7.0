/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib_projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 
 * @author William
 */
public class InLoggningAlien extends javax.swing.JFrame {
    private InfDB idb;
    
    public InLoggningAlien() {
        initComponents();
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loggaIn = new javax.swing.JButton();
        txtEpost = new javax.swing.JTextField();
        txtLosenord = new javax.swing.JTextField();
        lbValkommen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Epost");

        jLabel2.setText("Lösenord");

        loggaIn.setText("Logga in");
        loggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaInActionPerformed(evt);
            }
        });

        txtEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEpostActionPerformed(evt);
            }
        });

        txtLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLosenordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValkommen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loggaIn))
                        .addGap(0, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggaIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbValkommen, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEpostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEpostActionPerformed

    private void txtLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLosenordActionPerformed

    private void loggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInActionPerformed
        //klicka på knapp
    if (txtEpost.getText().isEmpty() || txtLosenord.getText().isEmpty()) {
    // Om någon av textrutorna är tom, visa felmeddelande
    JOptionPane.showMessageDialog(null, "Fyll i båda fälten!");
    txtEpost.requestFocus();
    txtLosenord.requestFocus();
    } else {
    try {
        String epost = txtEpost.getText();
        String losenord = txtLosenord.getText();
        
        // Formatera strängarna korrekt i SQL-frågan
        String fraga = "SELECT EPOST, LOSENORD FROM ALIEN WHERE EPOST = '" + epost + "' AND LOSENORD = '" + losenord + "'";
        
        // Utför frågan och hämta resultatet
        String svar = idb.fetchSingle(fraga);
        //String resultat = svar;
        //lbValkommen.setText(resultat);
        if (svar !=null && !svar.isEmpty()){
            lbValkommen.setText("Inloggningen lyckades välkommen!"+ epost);
            EfterInloggningAlien nytt = new EfterInloggningAlien(epost);
            InLoggningAlien.this.setVisible(false);
            nytt.setVisible(true);
        }
        else{
            lbValkommen.setText("Inloggningen misslyckades \n kontrollera epost och lösenord");
        }
        
    } catch (InfException e) {
        JOptionPane.showMessageDialog(null, "Något gick fel!");
        System.out.println("Internt felmeddelande" + e.getMessage());
    }
    }

    }//GEN-LAST:event_loggaInActionPerformed

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
            java.util.logging.Logger.getLogger(InLoggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InLoggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InLoggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InLoggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InLoggningAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbValkommen;
    private javax.swing.JButton loggaIn;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtLosenord;
    // End of variables declaration//GEN-END:variables
}
