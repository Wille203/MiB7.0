/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib_projekt;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author hillv
 */
public class EfterInloggAdmin extends javax.swing.JFrame {

    private InfDB idb;
    private String epost;
    private String nuvarandeLosenord;
    private static String epost1;
    private String Tidigare;
    /**
     * Skapar ett nytt EfterInlogg-fönster.
     */
    // Konstruktör för EfterInlogg utan e-post
    public EfterInloggAdmin() {
        initComponents();
        Tidigare = "ADMIN";
        // Försök att skapa en anslutning till databasen
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("Databasanslutning lyckades");
        } catch (InfException ettUndantag) {
            // Visa felmeddelande om det uppstår problem med databasanslutningen
            JOptionPane.showMessageDialog(null, "Något gick fel vid anslutning till databasen!");
            System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
        }
    }

// Konstruktör för EfterInlogg med e-post
    public EfterInloggAdmin(String epost) {
        initComponents();
        this.epost = epost;
        epost1 = epost;
        Tidigare = "ADMIN";
        
        

        // Uppdatera välkomstmeddelandet med användarens e-post
        lbValkommen.setText("Välkommen, " + epost + "!");

        // Försök att skapa en anslutning till databasen
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("Databasanslutning lyckades");
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

        lbValkommen = new javax.swing.JLabel();
        btnAndraLosenord = new javax.swing.JButton();
        txtNyttLosenord = new javax.swing.JTextField();
        lbAndraLosenord = new javax.swing.JLabel();
        btnRegAlien = new javax.swing.JButton();
        btnAndraAlien = new javax.swing.JButton();
        btnListaUtrustning = new javax.swing.JButton();
        btnRas = new javax.swing.JButton();
        btnDatum = new javax.swing.JButton();
        btnPlats = new javax.swing.JButton();
        btnTillbaka2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAndraKontors = new javax.swing.JButton();
        btnNyAgent = new javax.swing.JButton();
        btnInfoAgent = new javax.swing.JButton();
        btnAndraAgent = new javax.swing.JButton();
        btnBortAgent = new javax.swing.JButton();
        btnGeAdmin = new javax.swing.JButton();
        btnBortUtrustning = new javax.swing.JButton();
        btnSokaOmrådes = new javax.swing.JButton();
        btnAndraOmrades = new javax.swing.JButton();
        btnRegNyUtrustning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbValkommen.setText("Välkommen!");

        btnAndraLosenord.setText("Ändra Lösenord");
        btnAndraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenordActionPerformed(evt);
            }
        });

        lbAndraLosenord.setText("Om du vill ändra lösenord:");

        btnRegAlien.setText("Registera Alien");
        btnRegAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAlienActionPerformed(evt);
            }
        });

        btnAndraAlien.setText("Ändra Alien");
        btnAndraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAlienActionPerformed(evt);
            }
        });

        btnListaUtrustning.setText("Lista Utrustning");
        btnListaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaUtrustningActionPerformed(evt);
            }
        });

        btnRas.setText("Aliens av ras");
        btnRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRasActionPerformed(evt);
            }
        });

        btnDatum.setText("Aliens registrerade mellan datum");
        btnDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatumActionPerformed(evt);
            }
        });

        btnPlats.setText("Aliens på plats");
        btnPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatsActionPerformed(evt);
            }
        });

        btnTillbaka2.setText("Tillbaka");
        btnTillbaka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbaka2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Admin");

        btnAndraKontors.setText("Ändra kontorschef");
        btnAndraKontors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraKontorsActionPerformed(evt);
            }
        });

        btnNyAgent.setText("Registrera ny agent");
        btnNyAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyAgentActionPerformed(evt);
            }
        });

        btnInfoAgent.setText("Lista all info om agent");
        btnInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoAgentActionPerformed(evt);
            }
        });

        btnAndraAgent.setText("Ändra info om agent");
        btnAndraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAgentActionPerformed(evt);
            }
        });

        btnBortAgent.setText("Ta bort agent");
        btnBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBortAgentActionPerformed(evt);
            }
        });

        btnGeAdmin.setText("Ge agent admin");
        btnGeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeAdminActionPerformed(evt);
            }
        });

        btnBortUtrustning.setText("Ta bort utrustning");
        btnBortUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBortUtrustningActionPerformed(evt);
            }
        });

        btnSokaOmrådes.setText("Söka områdeschef");
        btnSokaOmrådes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokaOmrådesActionPerformed(evt);
            }
        });

        btnAndraOmrades.setText("Ändra områdeschef");
        btnAndraOmrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraOmradesActionPerformed(evt);
            }
        });

        btnRegNyUtrustning.setText("Registrera ny utrustning");
        btnRegNyUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegNyUtrustningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValkommen, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTillbaka2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAndraLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNyttLosenord)
                                        .addComponent(lbAndraLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(btnRas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAndraAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                            .addComponent(btnDatum))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnListaUtrustning, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnPlats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnRegAlien, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(btnBortUtrustning))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnGeAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnBortAgent, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnRegNyUtrustning, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnAndraAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSokaOmrådes, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAndraOmrades, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAndraKontors, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnInfoAgent, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(btnNyAgent, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValkommen)
                    .addComponent(btnTillbaka2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPlats)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegAlien))
                            .addComponent(btnGeAdmin)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegNyUtrustning)
                                .addGap(18, 18, 18)
                                .addComponent(btnBortAgent)
                                .addGap(29, 29, 29)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListaUtrustning)
                            .addComponent(btnBortUtrustning)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbAndraLosenord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAndraLosenord)
                        .addGap(68, 68, 68)
                        .addComponent(btnRas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAndraAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatum))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAndraKontors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAndraOmrades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSokaOmrådes)
                        .addGap(24, 24, 24)
                        .addComponent(btnNyAgent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInfoAgent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAndraAgent)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenordActionPerformed

        try {
            // Hämta det nya lösenordet från textfältet
            String nyttLosenord = txtNyttLosenord.getText();

            // Kontrollera om det nya lösenordet är 6 tecken eller kortare
            if (nyttLosenord.length() <= 6) {
                // Skapa SQL-frågan för att uppdatera lösenordet i databasen
                String fraga = "UPDATE agent SET losenord ='" + nyttLosenord + "' WHERE epost = '" + epost1 + "'";

                // Utför uppdateringen i databasen
                idb.update(fraga);

                // Uppdatera användargränssnittet med bekräftelsemeddelande
                lbValkommen.setText("Lösenord är ändrat!");
            } else {
                // Visa felmeddelande om lösenordet är för långt
                JOptionPane.showMessageDialog(null, "För långt lösenord!");
            }
        } catch (InfException ex) {
            // Visa felmeddelande om det uppstår ett internt fel
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnAndraLosenordActionPerformed

    private int getAlienID(String epost, String losenord) {
        int agentID = -1;
        try {
            // Skapa SQL-frågan för att hämta Agent_ID baserat på e-post och lösenord
            String fraga = "SELECT Agent_ID FROM agent WHERE epost = '" + epost + "'";

            // Utför frågan och hämta resultatet
            String svar = idb.fetchSingle(fraga);

            // Konvertera svar till int och sätt värdet för agentID
            if (svar != null && !svar.isEmpty()) {
                agentID = Integer.parseInt(svar);
            }

        } catch (InfException e) {
            // Visa felmeddelande om det uppstår ett internt fel
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

        return agentID;
    }
    private void btnRegAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAlienActionPerformed

        // Hämta agentID
        int agentID = getAlienID(epost, nuvarandeLosenord);

        // Skapa ett nytt objekt av RegNyAlien och skicka med agentID
        RegNyAlien nytt = new RegNyAlien(agentID,Tidigare);
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);;
    }//GEN-LAST:event_btnRegAlienActionPerformed

    private void btnAndraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAlienActionPerformed
        // TODO add your handling code here:
        NamnAllaAlien nytt = new NamnAllaAlien(Tidigare);
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnAndraAlienActionPerformed

    private void btnListaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaUtrustningActionPerformed

        try {
            String agentIdQuery = "SELECT AGENT_ID FROM AGENT WHERE epost = '" + epost1 + "';";
            String resultatAgentID = idb.fetchSingle(agentIdQuery);
            int agentID = Integer.parseInt(resultatAgentID);

            String listaUtrustningQuery = "SELECT Benamning "
                    + "FROM utrustning, innehar_utrustning "
                    + "WHERE Agent_ID = " + agentID + " AND innehar_utrustning.Utrustnings_ID = utrustning.Utrustnings_ID";
            ArrayList<String> utrustning = idb.fetchColumn(listaUtrustningQuery);
            // Visa resultatet i ett popup-fönster
            JOptionPane.showMessageDialog(null, "Utrustning:\n" + String.join("\n", utrustning), "Lista över Utrustning", JOptionPane.INFORMATION_MESSAGE);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }


    }//GEN-LAST:event_btnListaUtrustningActionPerformed

    private void btnRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRasActionPerformed
        //öppnar nytt fönster
        AliensAvRas nytt = new AliensAvRas(epost,Tidigare);
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnRasActionPerformed

    private void btnDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatumActionPerformed
        // TODO add your handling code here:
        AliensMellanDatum nytt = new AliensMellanDatum(Tidigare);
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnDatumActionPerformed

    private void btnPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatsActionPerformed
        // TODO add your handling code here:
        AliensPaPlats nytt = new AliensPaPlats(epost,Tidigare);
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnPlatsActionPerformed

    private void btnTillbaka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbaka2ActionPerformed
        // TODO add your handling code here:
        InLoggningAgent nytt = new InLoggningAgent();
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnTillbaka2ActionPerformed

    private void btnAndraKontorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraKontorsActionPerformed
        // TODO add your handling code here:
        AndraKontorsChef nytt = new AndraKontorsChef();
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnAndraKontorsActionPerformed

    private void btnNyAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyAgentActionPerformed
        // TODO add your handling code here:
        RegNyAgent nytt = new RegNyAgent();
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnNyAgentActionPerformed

    private void btnInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoAgentActionPerformed
        // TODO add your handling code here:
        InfoAllAgent nytt = new InfoAllAgent(idb);
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnInfoAgentActionPerformed

    private void btnAndraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAgentActionPerformed
        // TODO add your handling code here:
        NamnAllaAgenter nytt = new NamnAllaAgenter();
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnAndraAgentActionPerformed

    private void btnBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBortAgentActionPerformed
        // TODO add your handling code here:
        //DeleteAgent nytt = new DeleteAgent();
        //EfterInloggAdmin.this.setVisible(false);
        //nytt.setVisible(true);
    }//GEN-LAST:event_btnBortAgentActionPerformed

    private void btnGeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeAdminActionPerformed
        GeAgentAdminstatus nytt = new GeAgentAdminstatus(idb);
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnGeAdminActionPerformed

    private void btnBortUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBortUtrustningActionPerformed
        // TODO add your handling code here:
        //TaBortUtrustning nytt = new TaBortUtrustning();
        //EfterInloggAdmin.this.setVisible(false);
        //nytt.setVisible(true);
    }//GEN-LAST:event_btnBortUtrustningActionPerformed

    private void btnSokaOmrådesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokaOmrådesActionPerformed
        // TODO add your handling code here:
        SokaFramOmradesChef nytt = new SokaFramOmradesChef();
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnSokaOmrådesActionPerformed

    private void btnAndraOmradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraOmradesActionPerformed
        // TODO add your handling code here:
        AndraOmradesChef nytt = new AndraOmradesChef();
        EfterInloggAdmin.this.setVisible(false);
        nytt.setVisible(true);
    }//GEN-LAST:event_btnAndraOmradesActionPerformed

    private void btnRegNyUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegNyUtrustningActionPerformed
        // TODO add your handling code here:
        //RegNyUtrustning nytt = new RegNyUtrustning();
        //EfterInloggAdmin.this.setVisible(false);
        //nytt.setVisible(true);
    }//GEN-LAST:event_btnRegNyUtrustningActionPerformed

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
            java.util.logging.Logger.getLogger(EfterInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EfterInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EfterInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EfterInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EfterInlogg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraAgent;
    private javax.swing.JButton btnAndraAlien;
    private javax.swing.JButton btnAndraKontors;
    private javax.swing.JButton btnAndraLosenord;
    private javax.swing.JButton btnAndraOmrades;
    private javax.swing.JButton btnBortAgent;
    private javax.swing.JButton btnBortUtrustning;
    private javax.swing.JButton btnDatum;
    private javax.swing.JButton btnGeAdmin;
    private javax.swing.JButton btnInfoAgent;
    private javax.swing.JButton btnListaUtrustning;
    private javax.swing.JButton btnNyAgent;
    private javax.swing.JButton btnPlats;
    private javax.swing.JButton btnRas;
    private javax.swing.JButton btnRegAlien;
    private javax.swing.JButton btnRegNyUtrustning;
    private javax.swing.JButton btnSokaOmrådes;
    private javax.swing.JButton btnTillbaka2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAndraLosenord;
    private javax.swing.JLabel lbValkommen;
    private javax.swing.JTextField txtNyttLosenord;
    // End of variables declaration//GEN-END:variables
}
