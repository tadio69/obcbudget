package couche_ui;

import couche_jpa.Epreuve;
import couche_metier.IMetier;
import exception.ObcbudgetException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VueEpreuve extends javax.swing.JFrame {

    DefaultTableModel model;

    public VueEpreuve() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelTitre = new javax.swing.JLabel();
        jLabelSigle = new javax.swing.JLabel();
        jTextFieldTitre = new javax.swing.JTextField();
        jTextFieldSigle = new javax.swing.JTextField();
        jButtonCreer = new javax.swing.JButton();
        jButtonRechercher = new javax.swing.JButton();
        jButtonModifier = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonFermer = new javax.swing.JButton();
        jLabelCaractere = new javax.swing.JLabel();
        jComboBoxCaractere = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "N° Ordre", "Titre", "Sigle", "Caratère", "Version"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("EPREUVE");

        jLabelTitre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTitre.setText("Titre :");

        jLabelSigle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSigle.setText("Sigle :");

        jTextFieldTitre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jTextFieldSigle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

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

        jLabelCaractere.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCaractere.setText("Caractère :");

        jComboBoxCaractere.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelSigle)
                                    .addComponent(jLabelTitre)
                                    .addComponent(jLabelCaractere))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxCaractere, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldSigle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
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
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSigle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSigle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCaractere, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCaractere, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButtonModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRechercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFermer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCreer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFermerActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        videFrame();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreerActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        if (!titreSaisi.equals("") && !sigleSaisi.equals("") && !caractereSelected.equals("---")) {
            try {
                metier.creerEpreuve(new Epreuve(titreSaisi.toUpperCase(), sigleSaisi.toUpperCase(), caractereSelected));
                JOptionPane.showMessageDialog(this, "Epreuve créée avec succès !");
                //videFrame();
                epreuves = metier.findAllEpreuves();
                int i = 1;
                for (Epreuve e : epreuves) {
                    model.insertRow(model.getRowCount(), new Object[]{e.getIdep(), i++, e.getTitre(), e.getSigle(), e.getCaractere(), e.getVersion()});
                }
            } catch (ObcbudgetException ex) {
                JOptionPane.showMessageDialog(this, "Impossible de créer l'épreuve de titre [" + titreSaisi + "] \n raison:" + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, " Tous les champs sont obligatoires !");
        }
    }//GEN-LAST:event_jButtonCreerActionPerformed

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        if (titreSaisi.equals("")) {
            JOptionPane.showMessageDialog(this, " Le champ titre est obligatoire !");
        } else {
            epreuves = metier.findAllEpreuvesLikeTitre(titreSaisi.toUpperCase());
            int i = 1;
            for (Epreuve e : epreuves) {
                model.insertRow(model.getRowCount(), new Object[]{e.getIdep(), i++, e.getTitre(), e.getSigle(), e.getCaractere(), e.getVersion()});
            }
        }
    }//GEN-LAST:event_jButtonRechercherActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //remplit les champs
        int ligne = jTable1.getSelectedRow();
        idEpreuveCliked = (int) model.getValueAt(ligne, 0);
        jTextFieldTitre.setText((String) model.getValueAt(ligne, 2));
        jTextFieldSigle.setText((String) model.getValueAt(ligne, 3));
        jComboBoxCaractere.setSelectedItem((String) model.getValueAt(ligne, 4));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        int result = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment modifier cette épreuve?", "confirmation de modification", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (!titreSaisi.equals("") && !sigleSaisi.equals("") && !caractereSelected.equals("---")) {
                epreuveCliked = metier.findEpreuveById(idEpreuveCliked);
                epreuveCliked.setTitre(titreSaisi.toUpperCase());
                epreuveCliked.setSigle(sigleSaisi.toUpperCase());
                epreuveCliked.setCaractere(caractereSelected);
                try {
                    metier.modifierEpreuve(epreuveCliked);
                    JOptionPane.showMessageDialog(this, "Epreuve modifiée avec succès !");
                    //videFrame();
                    epreuves = metier.findAllEpreuves();
                    int i = 1;
                    for (Epreuve e : epreuves) {
                        model.insertRow(model.getRowCount(), new Object[]{e.getIdep(), i++, e.getTitre(), e.getSigle(), e.getCaractere(), e.getVersion()});
                    }
                } catch (ObcbudgetException ex) {
                    JOptionPane.showMessageDialog(this, "Impossible de modifier l'épreuve de titre proche de [" + titreSaisi + "] \n raison:" + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, " Tous les champs sont obligatoires !");
            }
        }
    }//GEN-LAST:event_jButtonModifierActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        int result = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer cette épreuve?", "confirmation de suppression", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (!titreSaisi.equals("") && !sigleSaisi.equals("") && !caractereSelected.equals("---")) {
                try {
                    metier.supprimerEpreuve(metier.findEpreuveById(idEpreuveCliked));
                    JOptionPane.showMessageDialog(this, "Epreuve supprimée avec succès !");
                    //videFrame();
                    epreuves = metier.findAllEpreuves();
                    int i = 1;
                    for (Epreuve e : epreuves) {
                        model.insertRow(model.getRowCount(), new Object[]{e.getIdep(), i++, e.getTitre(), e.getSigle(), e.getCaractere(), e.getVersion()});
                    }
                } catch (ObcbudgetException ex) {
                    JOptionPane.showMessageDialog(this, "Impossible de supprimer l'épreuve de titre proche de [" + titreSaisi + "] \n raison:" + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, " Tous les champs sont obligatoires !");
            }
        }
        /*
        else if (result == JOptionPane.NO_OPTION){
               label.setText("You selected: No");
            }
         */
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

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
            java.util.logging.Logger.getLogger(VueEpreuve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueEpreuve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueEpreuve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueEpreuve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueEpreuve().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxCaractere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCaractere;
    private javax.swing.JLabel jLabelSigle;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSigle;
    private javax.swing.JTextField jTextFieldTitre;
    // End of variables declaration//GEN-END:variables

    // variables d'instance
    private IMetier metier = null;
    private String titreSaisi = "";
    private String sigleSaisi = "";
    private String caractereSelected = "";
    private List<Epreuve> epreuvesRecherchees = null;
    private List<Epreuve> epreuves = null;
    private int idEpreuveCliked = 0;
    private Epreuve epreuveCliked = null;
    private String[] caracteresCombo = null;

    private void doMyInit() {
        // init contexte
        // instanciation couche [metier]
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-metier.xml");
        metier = (IMetier) ctx.getBean("metier");

        //on remplit la combobox des niveaux
        caracteresCombo = new String[]{"---", "Facultative", "Contraignante"};
        jComboBoxCaractere.setModel(new DefaultComboBoxModel(caracteresCombo));
    }

    private void infoSaisies() {
        titreSaisi = jTextFieldTitre.getText();
        sigleSaisi = jTextFieldSigle.getText();
        caractereSelected=(String) jComboBoxCaractere.getSelectedItem();
    }

    private void videFrame() {
        jTextFieldTitre.setText("");
        jTextFieldSigle.setText("");
        jComboBoxCaractere.setSelectedIndex(0);
        model.setRowCount(0);//vide la jTable
    }
}
