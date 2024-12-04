package couche_ui;

import couche_jpa.Famille;
import couche_metier.IMetier;
import exception.ObcbudgetException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author famille chijou
 */
public class VueFamille extends javax.swing.JFrame {

    DefaultTableModel model;

    public VueFamille() {
        initComponents();
        model = (DefaultTableModel) jTable2.getModel();
        doMyInit();
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
        jButtonSupprimer = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonFermer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTitre = new javax.swing.JTextField();
        jButtonCreer = new javax.swing.JButton();
        jButtonRechercher = new javax.swing.JButton();
        jButtonModifier = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("FAMILLE DE SERIES/SPECIALITES");

        jButtonSupprimer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        jButtonAnnuler.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jButtonFermer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonFermer.setText("Fermer");
        jButtonFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFermerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Titre :");

        jTextFieldTitre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jButtonCreer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCreer.setText("Créer");
        jButtonCreer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreerActionPerformed(evt);
            }
        });

        jButtonRechercher.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRechercher.setText("Rechercher");
        jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercherActionPerformed(evt);
            }
        });

        jButtonModifier.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonModifier.setText("Modifier");
        jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "N° Ordre", "Titre", "Version"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setShowHorizontalLines(true);
        jTable2.setShowVerticalLines(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonCreer)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonRechercher)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonModifier)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonSupprimer)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonAnnuler)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonFermer)))
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(150, 150, 150)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTitre, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonFermer, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(jButtonAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRechercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCreer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(281, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        int result = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer cette Famille d'options?", "confirmation de suppression", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (!titreSaisi.equals("")) {
                try {
                    metier.supprimerFamille(metier.findFamilleById(idFamilleSelected));
                    JOptionPane.showMessageDialog(this, " Famille d'options supprimée avec succès !");
                    videFrame();
                    familles = metier.findAllFamilles();
                    int i = 1;
                    for (Famille f : familles) {
                        model.insertRow(model.getRowCount(), new Object[]{f.getIdfam(), i++, f.getTitre(), f.getVersion()});
                    }
                } catch (ObcbudgetException ex) {
                    JOptionPane.showMessageDialog(this, "Impossible de supprimer la famille d'options de titre proche de [" + titreSaisi + "] \n raison:" + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, " Le champ titre est obligatoire !");
            }
        }
        /*
            else if (result == JOptionPane.NO_OPTION){
                label.setText("You selected: No");
            }
         */
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        videFrame();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFermerActionPerformed

    private void jButtonCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreerActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        if (!titreSaisi.equals("")) {
            try {
                metier.creerFamille(new Famille(titreSaisi.toUpperCase()));
                JOptionPane.showMessageDialog(this, "Famille d'options créée avec succès !");
                videFrame();
                familles = metier.findAllFamilles();
                int i = 1;
                for (Famille f : familles) {
                    model.insertRow(model.getRowCount(), new Object[]{f.getIdfam(), i++, f.getTitre(), f.getVersion()});
                }
            } catch (ObcbudgetException ex) {
                JOptionPane.showMessageDialog(this, "Impossible de créer la famille d'options de titre [" + titreSaisi + "] \n raison:" + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, " Le champ titre est obligatoire !");
        }
    }//GEN-LAST:event_jButtonCreerActionPerformed

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        if (!titreSaisi.equals("") && !titreSaisi.equalsIgnoreCase("toutes")) {
            try {
                famillesRecherchees = metier.findAllFamillesLikeTitre(titreSaisi.toUpperCase());
                int i = 1;
                for (Famille f : famillesRecherchees) {
                    model.insertRow(model.getRowCount(), new Object[]{f.getIdfam(), i++, f.getTitre(), f.getVersion()});
                }
            } catch (ObcbudgetException ex) {
                JOptionPane.showMessageDialog(this, "Impossible de trouver des familles de titre proche de [" + titreSaisi + "] \n raison:" + ex.getMessage());
            }
        } else {
            if (titreSaisi.equals("")) {
                JOptionPane.showMessageDialog(this, " Le champ titre est obligatoire !");
            } else {
                familles = metier.findAllFamilles();
                int i = 1;
                for (Famille f : familles) {
                    model.insertRow(model.getRowCount(), new Object[]{f.getIdfam(), i++, f.getTitre(), f.getVersion()});
                }
            }
        }
    }//GEN-LAST:event_jButtonRechercherActionPerformed

    private void jButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        int result = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment modifier cette famille d'options?", "confirmation de modification", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (!titreSaisi.equals("")) {
                /*//code remplacé par la ligne suivante
                for(Region r:regions){
                    if(r.getIdreg()==idRegionSelected){
                        regionSelected=r;
                        break;
                    }
                }
                 */
                familleSelected = metier.findFamilleById(idFamilleSelected);

                familleSelected.setTitre(titreSaisi.toUpperCase());
                try {
                    metier.modifierFamille(familleSelected);
                    JOptionPane.showMessageDialog(this, "Famille d'options modifiée avec succès !");
                    videFrame();
                    familles = metier.findAllFamilles();
                    int i = 1;
                    for (Famille f : familles) {
                        model.insertRow(model.getRowCount(), new Object[]{f.getIdfam(), i++, f.getTitre(), f.getVersion()});
                    }
                } catch (ObcbudgetException ex) {
                    JOptionPane.showMessageDialog(this, "Impossible de modifier la famille d'options de titre proche de [" + titreSaisi + "] \n raison:" + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, " Le champ titre est obligatoire !");
            }
        }
        /*
        else if (result == JOptionPane.NO_OPTION){
            label.setText("You selected: No");
        }
         */
    }//GEN-LAST:event_jButtonModifierActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        //remplit les champs
        int ligne = jTable2.getSelectedRow();
        idFamilleSelected = (int) model.getValueAt(ligne, 0);
        jTextFieldTitre.setText((String) model.getValueAt(ligne, 2));
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(VueFamille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueFamille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueFamille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueFamille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueFamille().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonCreer;
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonRechercher;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldTitre;
    // End of variables declaration//GEN-END:variables

    // variables d'instance
    private IMetier metier = null;
    private String titreSaisi = "";
    private List<Famille> famillesRecherchees = null;
    private List<Famille> familles = null;
    private int idFamilleSelected = 0;
    private Famille familleSelected = null;

    private void doMyInit() {
        // init contexte
        // instanciation couche [metier]
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-metier.xml");
        metier = (IMetier) ctx.getBean("metier");
    }

    private void infoSaisies() {
        titreSaisi = jTextFieldTitre.getText();
    }

    private void videFrame() {
        jTextFieldTitre.setText("");
        model.setRowCount(0);//vide la jTable
    }

}