package couche_ui;

import couche_jpa.Examen;
import couche_jpa.Groupe;
import couche_jpa.Groupedexamen;
import couche_metier.IMetier;
import exception.ObcbudgetException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author famille chijou
 */
public class VueGroupedexamen extends javax.swing.JFrame {

    DefaultTableModel model;
    DefaultListModel mylistModel = new DefaultListModel();

    public VueGroupedexamen() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        jListExamens.setModel(mylistModel);
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
        jLabeExamen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListExamens = new javax.swing.JList<>();
        jLabelNiveauExamen = new javax.swing.JLabel();
        jComboBoxNiveau = new javax.swing.JComboBox<>();
        jLabelType = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonCreer = new javax.swing.JButton();
        jButtonRechercher = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonFermer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("REGROUPEMENT D'EXAMENS");

        jLabeExamen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabeExamen.setText("Examens :");

        jListExamens.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jListExamens);

        jLabelNiveauExamen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNiveauExamen.setText("Niveau :");

        jComboBoxNiveau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabelType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelType.setText("Type :");

        jComboBoxType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeActionPerformed(evt);
            }
        });

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

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Niveau", "Type", "Examens du groupe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabeExamen)
                            .addComponent(jLabelNiveauExamen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabelType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButtonCreer)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRechercher)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSupprimer)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAnnuler)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFermer))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNiveauExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreerActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        if (listeExamensSelected.size() > 0) {
            String examensSelectedEnchaine = "";
            int i = 0;
            try {
                Groupe g = metier.creerGroupe(new Groupe(typeSelected, niveauSelected));
                for (int j = 0; j < listeExamensSelected.size(); j++) {
                    for (Examen e : examens) {
                        if (e.getSigle().equals(listeExamensSelected.get(j))) {
                            metier.creerGroupedexamen(new Groupedexamen(e, g));
                            break;
                        }
                    }
                }
                JOptionPane.showMessageDialog(this, "Groupe d'examens créé avec succès !");
                groupedexamens = metier.findAllGroupedexamensD1NiveauEtD1Type(niveauSelected, typeSelected);
                int id=groupedexamens.get(0).getGroupe().getIdgpe();
                int l = 0;
                for (Groupedexamen gpex : groupedexamens) {
                    if (l++ == 0) {
                        examensSelectedEnchaine += gpex.getExamen().getSigle();
                    } else {
                        examensSelectedEnchaine += ", " + gpex.getExamen().getSigle();
                    }
                }
                model.insertRow(model.getRowCount(), new Object[]{id, niveauSelected, typeSelected, examensSelectedEnchaine});
            } catch (ObcbudgetException ex) {
                JOptionPane.showMessageDialog(this, "Impossible de créer le groupe d'examens souhaité !\n Raison " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires !");
        }
    }//GEN-LAST:event_jButtonCreerActionPerformed

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        if (!niveauSelected.equals("---") && !typeSelected.equals("---")) {
            String examensSelectedEnchaine = "";
            try {
                groupedexamens = metier.findAllGroupedexamensD1NiveauEtD1Type(niveauSelected, typeSelected);
                int id=groupedexamens.get(0).getGroupe().getIdgpe();
                int i = 0;
                for (Groupedexamen g : groupedexamens) {
                    if (i++ == 0) {
                        examensSelectedEnchaine += g.getExamen().getSigle();
                    } else {
                        examensSelectedEnchaine += ", " + g.getExamen().getSigle();
                    }
                }
                model.insertRow(model.getRowCount(), new Object[]{id, niveauSelected, typeSelected, examensSelectedEnchaine});
            } catch (ObcbudgetException ex) {
                JOptionPane.showMessageDialog(this, "Impossible d'extraire le groupe d'examens souhaité !\n raison:" + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Les champs niveau et type sont obligatoires et différents de 'TOUT' !");
        }
        groupedexamens.clear();
    }//GEN-LAST:event_jButtonRechercherActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();
        int result = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer ce groupe d'examens ?", "confirmation de suppression", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if(!niveauSelected.equals("---") && !typeSelected.equals("---")){
                try{
                    metier.supprimerGroupe(metier.findGroupeById(idGroupeSelected));
                    JOptionPane.showMessageDialog(this, "Groupe d'examens supprimé avec succès !");
                }catch(ObcbudgetException ex){
                    JOptionPane.showMessageDialog(this, "Impossible de supprimer le groupe d'examens souhaité !\n raison:"+ex.getMessage());
                }
            }
            else JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires !");
        }
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        videFrame();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFermerActionPerformed

    private void jComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeActionPerformed
        niveauSelected = (String) jComboBoxNiveau.getSelectedItem();
        if (!niveauSelected.equals("---")) {
            remplirJListExamens();
        }
    }//GEN-LAST:event_jComboBoxTypeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //remplit le champ
        int ligne=jTable1.getSelectedRow();
        idGroupeSelected=(int) model.getValueAt(ligne,0);
        jComboBoxNiveau.setSelectedItem((String) model.getValueAt(ligne,1));
        jComboBoxType.setSelectedItem((String) model.getValueAt(ligne,2));
        String examensSelectedEnchaine = (String) model.getValueAt(ligne,3);
        String separateur = ", ";
        String[] listExamens = examensSelectedEnchaine.split(separateur);
        jListExamens.setListData(listExamens);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(VueGroupedexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueGroupedexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueGroupedexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueGroupedexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueGroupedexamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonCreer;
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonRechercher;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JComboBox<String> jComboBoxNiveau;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabeExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNiveauExamen;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JList<String> jListExamens;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    // variables d'instance
    private IMetier metier = null;
    private List<Examen> examens = null;
    private List<Examen> examensSelected = new ArrayList<Examen>();
    private List<String> listeExamensSelected = null;
    private String[] examensList = null;
    private String niveauSelected = "";
    private String typeSelected = "";
    private String[] typesCombo = null;
    private String[] niveauxCombo = null;    
    private List<Groupedexamen> groupedexamens = null;
    private int idGroupeSelected=0;

    private void doMyInit() {
        // init contexte
        // instanciation couche [metier]
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-metier.xml");
        metier = (IMetier) ctx.getBean("metier");
        examens = metier.findAllExamens();

        //on remplit la combobox des types
        typesCombo = new String[]{"---", "GEN", "IND", "IND PROF", "STT", "STT PROF", "TOUT", "TOUT ESTI","TOUT STT","TOUT ESTP"};//TOUT=tous les types; TOUT ESTI=INDUSTRIEL+INDUSTRIEL PROFESSIONNEL; TOUT STT=STT+STT PROFESSIONNEL; TOUTN ESTP=TOUT SAUF ESG
        jComboBoxType.setModel(new DefaultComboBoxModel(typesCombo));

        //on remplit la combobox des niveaux
        niveauxCombo = new String[]{"---", "PROB", "BACC", "TOUT"};
        jComboBoxNiveau.setModel(new DefaultComboBoxModel(niveauxCombo));
    }

    private void infoSaisies() {
        niveauSelected = (String) jComboBoxNiveau.getSelectedItem();
        typeSelected = (String) jComboBoxType.getSelectedItem();
        listeExamensSelected = jListExamens.getSelectedValuesList();
    }

    private void videFrame() {
        mylistModel.clear();
        jListExamens.setModel(mylistModel);
        jComboBoxNiveau.setSelectedIndex(0);
        jComboBoxType.setSelectedIndex(0);
    }

    private void remplirJListExamens() {
        typeSelected = (String) jComboBoxType.getSelectedItem();
        if (typeSelected.equals("---")) {
            JOptionPane.showMessageDialog(this, "Le champ Type est vide !");
        } else {
            if (!niveauSelected.equals("TOUT") && !typeSelected.equals("TOUT") && !typeSelected.equals("TOUT ESTI") && !typeSelected.equals("TOUT STT") && !typeSelected.equals("TOUT ESTP")) {
                //on recherche les examens d'un niveau et type usuels
                examens = metier.findAllExamensD1NiveauEtD1Type(niveauSelected, typeSelected);
            }

            if (niveauSelected.equals("TOUT") && !typeSelected.equals("TOUT") && !typeSelected.equals("TOUT ESTI") && !typeSelected.equals("TOUT STT") && !typeSelected.equals("TOUT ESTP")) {
                //on recherche les examens d'un type usuel
                examens = metier.findAllExamensD1Type(typeSelected);
            }
            
            if (niveauSelected.equals("TOUT") && typeSelected.equals("TOUT")) {
                //on recherche tous les examens
                examens = metier.findAllExamens();
            }
            
            if (niveauSelected.equals("TOUT") && typeSelected.equals("TOUT ESTI")) {
                //on recherche tous les examens industriels (professionnels ou non)
                examens = metier.findAllExamensIndustiels();
            }
            
            if (niveauSelected.equals("TOUT") && typeSelected.equals("TOUT STT")) {
                //on recherche tous les examens STT (professionnels ou non)
                examens = metier.findAllExamensStt();
            }
            
            if (niveauSelected.equals("TOUT") && typeSelected.equals("TOUT ESTP")) {
                //on recherche tous les examens STT et industriels (professionnels ou non) ie tous les examens sauf ceux de l'ESG
                examens = metier.findAllExamensEstp();
            }

            if (!niveauSelected.equals("TOUT") && typeSelected.equals("TOUT")) {
                //on recherche les examens d'un niveau usuel
                examens = metier.findAllExamensD1Niveau(niveauSelected);
            }
            
            if (!niveauSelected.equals("TOUT") && typeSelected.equals("TOUT ESTI")) {
                //on recherche tous les examens d'un niveau et de type industriel (professionnels ou non)
                examens = metier.findAllExamensIndustielsD1Niveau(niveauSelected);
            }
            
            if (!niveauSelected.equals("TOUT") && typeSelected.equals("TOUT STT")) {
                //on recherche tous les examens d'un niveau et de type STT (professionnels ou non)
                examens = metier.findAllExamensSttD1Niveau(niveauSelected);
            }
            
            if (!niveauSelected.equals("TOUT") && typeSelected.equals("TOUT ESTP")) {
                //on recherche tous les examens d'un niveau et de type STT ou industriel (professionnels ou non) ie tous les examens sauf ceux de l'ESG
                examens = metier.findAllExamensEstpD1Niveau(niveauSelected);
            }
            
            examensList = new String[examens.size()];
            int l = 0;
            for (Examen examen : examens) {
                examensList[l++] = examen.getSigle();
            }
            jListExamens.setListData(examensList);

            jListExamens.setLayoutOrientation(2);//affiche la jlist sur plusieurs colonnes
        }
    }
}