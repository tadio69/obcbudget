
package couche_ui;

import couche_jpa.Arrondissement;
import couche_jpa.Departement;
import couche_jpa.Etablissement;
import couche_jpa.Region;
import couche_jpa.Souscentre;
import couche_metier.IMetier;
import exception.ObcbudgetException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class VueEtablissement extends javax.swing.JFrame {

   
    DefaultTableModel model;
    
    public VueEtablissement() {
        initComponents();
        model=(DefaultTableModel) jTable1.getModel();
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
        jLabelNom = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jLabelSecteur = new javax.swing.JLabel();
        jComboBoxSecteur = new javax.swing.JComboBox<>();
        jLabelType = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jLabelDepartement = new javax.swing.JLabel();
        jComboBoxDepartement = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonCreer = new javax.swing.JButton();
        jButtonRechercher = new javax.swing.JButton();
        jButtonModier = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonFermer = new javax.swing.JButton();
        jLabelRegion = new javax.swing.JLabel();
        jComboBoxRegion = new javax.swing.JComboBox<>();
        jLabelArrondissement = new javax.swing.JLabel();
        jComboBoxArrondissement = new javax.swing.JComboBox<>();
        jLabelAbreviation = new javax.swing.JLabel();
        jTextFieldAbreviation = new javax.swing.JTextField();
        jLabelSport = new javax.swing.JLabel();
        jCheckBoxSport = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("ETABLISSEMENT");

        jLabelNom.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNom.setText("Nom :");

        jTextFieldNom.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabelSecteur.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSecteur.setText("Secteur :");

        jComboBoxSecteur.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxSecteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelType.setText("Type :");

        jComboBoxType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelDepartement.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDepartement.setText("Département :");

        jComboBoxDepartement.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxDepartement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDepartement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepartementActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "N° Ordre", "Région", "Département", "Arrondissement", "Etablissement", "Abréviation", "Secteur", "Type", "Sport", "Version"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        jButtonModier.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonModier.setText("Modifier");
        jButtonModier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModierActionPerformed(evt);
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

        jLabelRegion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelRegion.setText("Région :");

        jComboBoxRegion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegionActionPerformed(evt);
            }
        });

        jLabelArrondissement.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelArrondissement.setText("Arrondissement :");

        jComboBoxArrondissement.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxArrondissement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxArrondissement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArrondissementActionPerformed(evt);
            }
        });

        jLabelAbreviation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAbreviation.setText("Abreviation :");

        jTextFieldAbreviation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabelSport.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSport.setText("Abrite l'EPS :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(jButtonCreer)
                .addGap(18, 18, 18)
                .addComponent(jButtonRechercher)
                .addGap(18, 18, 18)
                .addComponent(jButtonModier)
                .addGap(18, 18, 18)
                .addComponent(jButtonSupprimer)
                .addGap(18, 18, 18)
                .addComponent(jButtonAnnuler)
                .addGap(18, 18, 18)
                .addComponent(jButtonFermer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAbreviation)
                    .addComponent(jLabelNom)
                    .addComponent(jLabelSecteur)
                    .addComponent(jLabelType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAbreviation, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRegion)
                    .addComponent(jLabelArrondissement)
                    .addComponent(jLabelDepartement)
                    .addComponent(jLabelSport))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxArrondissement, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxDepartement, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxSport)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(473, 473, 473))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAbreviation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAbreviation)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelArrondissement, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxArrondissement, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jCheckBoxSport)))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRechercher, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCreer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFermer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jComboBoxRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegionActionPerformed
        remplirDepartementCombobox();
    }//GEN-LAST:event_jComboBoxRegionActionPerformed

    private void jButtonCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreerActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();           
        if(!nomEtabSaisi.equals("") && !abreviationSaisie.equals("")){
            if(!nomArrondissementSelected.equals("---") && !secteurSelected.equals("---") && !typeSelected.equals("---")){
                for(Arrondissement a:arrondissements){
                    if(a.getNomarr().equals(nomArrondissementSelected)){
                        arrondissementSelected=a;
                        break;
                    }
                }
                boolean valSport=false;
                if (sport) {
                    valSport = true;
                }
                try{
                    metier.creerEtablissement(new Etablissement(nomEtabSaisi.toUpperCase(),secteurSelected,typeSelected,abreviationSaisie.toUpperCase(),arrondissementSelected,valSport));
                    JOptionPane.showMessageDialog(this, "Etablissement créé avec succès !"); 
                    //videFrame();
                    int i=1;
                    etablissements=metier.findAllEtablissementsD1Arrondissement(nomArrondissementSelected);
                    for(Etablissement e:etablissements){
                        model.insertRow(model.getRowCount(),new Object[]{e.getIdetab(),i++,e.getArrondissement().getDepartement().getRegion().getNomreg(), e.getArrondissement().getDepartement().getNomdepart(),e.getArrondissement().getNomarr(),e.getNometab(),e.getAbreviation(),e.getSecteur(),e.getType(),e.getSport(), e.getVersion()});
                    }
                }catch(ObcbudgetException ex){
                    JOptionPane.showMessageDialog(this, "Impossible de créer l'établissement de nom ["+nomEtabSaisi+"] \n raison:"+ex.getMessage()); 
                }
            }
            else JOptionPane.showMessageDialog(this, " Veuillez recommencer svp. Au moins une donnée est incorrecte !");
        }
        else JOptionPane.showMessageDialog(this, " Le champ nom est obligatoire !"); 
    }//GEN-LAST:event_jButtonCreerActionPerformed

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();        
        if(!nomEtabSaisi.equals("") && !nomEtabSaisi.equalsIgnoreCase("tous")){
            try{
                etablissementsRecherches=metier.findAllEtablissementsLikeName(nomEtabSaisi.toUpperCase()); 
                int i=1;
                for(Etablissement e:etablissementsRecherches){
                    model.insertRow(model.getRowCount(),new Object[]{e.getIdetab(),i++,e.getArrondissement().getDepartement().getRegion().getNomreg(), e.getArrondissement().getDepartement().getNomdepart(),e.getArrondissement().getNomarr(),e.getNometab(),e.getAbreviation(),e.getSecteur(),e.getType(),e.getSport(), e.getVersion()});
                } 
            }catch(ObcbudgetException ex){
                    JOptionPane.showMessageDialog(this, "Impossible de trouver des établissements de nom proche de ["+nomEtabSaisi+"] \n raison:"+ex.getMessage()); 
            } 
        }
        else{
            if(nomEtabSaisi.equals("")) JOptionPane.showMessageDialog(this, " Le champ nom est obligatoire !");
            else{
                nomArrondissementSelected=(String) jComboBoxArrondissement.getSelectedItem();
                if(!nomArrondissementSelected.equals("---")){
                    etablissements=metier.findAllEtablissementsD1Arrondissement(nomArrondissementSelected);
                    int i=1;
                    for(Etablissement e:etablissements){
                        model.insertRow(model.getRowCount(),new Object[]{e.getIdetab(),i++,e.getArrondissement().getDepartement().getRegion().getNomreg(), e.getArrondissement().getDepartement().getNomdepart(),e.getArrondissement().getNomarr(),e.getNometab(),e.getAbreviation(),e.getSecteur(),e.getType(),e.getSport(), e.getVersion()});
                    }
                }
                else JOptionPane.showMessageDialog(this, " Veuillez sélectionner un arrondissement svp !");
            }
        }
    }//GEN-LAST:event_jButtonRechercherActionPerformed

    private void jButtonModierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModierActionPerformed
        model.setRowCount(0);//vide la jTable
        infoSaisies();  
        int result = JOptionPane.showConfirmDialog(this,"Voulez-vous vraiment modifier cet établissement?", "confirmation de modification",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            if(!nomEtabSaisi.equals("") && !abreviationSaisie.equals("")){
                if(!nomArrondissementSelected.equals("---") && !secteurSelected.equals("---") && !typeSelected.equals("---")){
                    etablissementCliked=metier.findEtablissementById(idEtablissementCliked);
                    for(Arrondissement a:arrondissements){
                        if(a.getNomarr().equals(nomArrondissementSelected)){
                            arrondissementSelected=a;
                            break;
                        }
                    }
                    boolean valSport=false;
                    if (sport) {
                        valSport = true;
                    }
                    etablissementCliked.setNometab(nomEtabSaisi.toUpperCase());
                    etablissementCliked.setAbreviation(abreviationSaisie.toUpperCase());
                    etablissementCliked.setSecteur(secteurSelected);
                    etablissementCliked.setType(typeSelected);
                    etablissementCliked.setArrondissement(arrondissementSelected);
                    etablissementCliked.setSport(valSport);
                    try{
                        metier.modifierEtablissement(etablissementCliked);
                        JOptionPane.showMessageDialog(this, " Etablissement modifié avec succès !"); 
                        //videFrame();
                        int i=1;
                        etablissements=metier.findAllEtablissementsD1Arrondissement(nomArrondissementSelected);
                        for(Etablissement e:etablissements){
                            model.insertRow(model.getRowCount(),new Object[]{e.getIdetab(),i++,e.getArrondissement().getDepartement().getRegion().getNomreg(), e.getArrondissement().getDepartement().getNomdepart(),e.getArrondissement().getNomarr(),e.getNometab(),e.getAbreviation(),e.getSecteur(),e.getType(),e.getSport(), e.getVersion()});
                        }
                    }catch(ObcbudgetException ex){
                        JOptionPane.showMessageDialog(this, "Impossible de modifier l'établissement de nom ["+nomEtabSaisi+"] \n raison:"+ex.getMessage()); 
                    }
                }
                else JOptionPane.showMessageDialog(this, " Veuillez recommencer svp. Au moins une donnée est incorrecte !");                
            }
            else JOptionPane.showMessageDialog(this, " Le champ nom est obligatoire !");                
        }
        /*
        else if (result == JOptionPane.NO_OPTION){
               label.setText("You selected: No");
            }
        */       
    }//GEN-LAST:event_jButtonModierActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //remplit les champs
        int ligne=jTable1.getSelectedRow();
        idEtablissementCliked=(int) model.getValueAt(ligne,0);
        jComboBoxRegion.setSelectedItem((String) model.getValueAt(ligne,2));
        jComboBoxDepartement.setSelectedItem((String) model.getValueAt(ligne,3));
        jComboBoxArrondissement.setSelectedItem((String) model.getValueAt(ligne,4));
        jTextFieldNom.setText((String) model.getValueAt(ligne,5));
        jTextFieldAbreviation.setText((String) model.getValueAt(ligne,6));
        jComboBoxSecteur.setSelectedItem((String) model.getValueAt(ligne,7));
        jComboBoxType.setSelectedItem((String) model.getValueAt(ligne,8));
        jCheckBoxSport.setSelected((boolean) model.getValueAt(ligne, 9));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        //model.setRowCount(0);//vide la jTable
        infoSaisies();  
        int result = JOptionPane.showConfirmDialog(this,"Voulez-vous vraiment supprimer cet établissement?", "confirmation de suppression",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            if(!nomEtabSaisi.equals("")){                
                try{
                    metier.supprimerEtablissement(metier.findEtablissementById(idEtablissementCliked));
                    JOptionPane.showMessageDialog(this, " Etablissement supprimé avec succès !"); 
                    model.setRowCount(0);//vide la jTable
                    nomArrondissementSelected=(String) jComboBoxArrondissement.getSelectedItem();
                    int i=1;
                    etablissements=metier.findAllEtablissementsD1Arrondissement(nomArrondissementSelected);
                    for(Etablissement e:etablissements){
                        model.insertRow(model.getRowCount(),new Object[]{e.getIdetab(),i++,e.getArrondissement().getDepartement().getRegion().getNomreg(), e.getArrondissement().getDepartement().getNomdepart(),e.getArrondissement().getNomarr(),e.getNometab(),e.getAbreviation(),e.getSecteur(),e.getType(),e.getSport(), e.getVersion()});
                    }
                }catch(ObcbudgetException ex){
                    JOptionPane.showMessageDialog(this, "Impossible de supprimer l'établissement de nom ["+nomEtabSaisi+"] \n raison:"+ex.getMessage()); 
                }                        
            }
            else JOptionPane.showMessageDialog(this, " Le champ nom est obligatoire !"); 
        }
        /*
        else if (result == JOptionPane.NO_OPTION){
               label.setText("You selected: No");
            }
        */     
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void jComboBoxDepartementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepartementActionPerformed
        remplirArrondissementCombobox();
    }//GEN-LAST:event_jComboBoxDepartementActionPerformed

    private void jComboBoxArrondissementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArrondissementActionPerformed
        //
    }//GEN-LAST:event_jComboBoxArrondissementActionPerformed

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
            java.util.logging.Logger.getLogger(VueEtablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueEtablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueEtablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueEtablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueEtablissement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonCreer;
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonModier;
    private javax.swing.JButton jButtonRechercher;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JCheckBox jCheckBoxSport;
    private javax.swing.JComboBox<String> jComboBoxArrondissement;
    private javax.swing.JComboBox<String> jComboBoxDepartement;
    private javax.swing.JComboBox<String> jComboBoxRegion;
    private javax.swing.JComboBox<String> jComboBoxSecteur;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAbreviation;
    private javax.swing.JLabel jLabelArrondissement;
    private javax.swing.JLabel jLabelDepartement;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelRegion;
    private javax.swing.JLabel jLabelSecteur;
    private javax.swing.JLabel jLabelSport;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAbreviation;
    private javax.swing.JTextField jTextFieldNom;
    // End of variables declaration//GEN-END:variables

    // variables d'instance
    private IMetier metier=null;
    private List<Region> regions=null;
    private List<Departement> departements=null;
    private List<Arrondissement> arrondissements=null;
    private String[] secteursCombo=null;
    private String[] typesCombo=null;
    private String[] regionsCombo=null;
    private String[] departementsCombo=null;
    private String[] arrondissementsCombo=null;
    private String[] souscentreCombo=null;
    private List<Souscentre> souscentres=null;
    private String nomSouscentreSelected="";
    private Souscentre souscentreSelected=null;
    private String[] espCombo=null;
    private String secteurSelected="";
    private String typeSelected="";
    private String nomRegionSelected="";
    private String nomDepartementSelected="";
    private String nomArrondissementSelected="";
    private Departement departementSelected=null;
    private Arrondissement arrondissementSelected=null;
    private String nomEtabSaisi="";
    private String abreviationSaisie="";
    private List<Etablissement> etablissements=null;
    private List<Etablissement> etablissementsRecherches=null;
    private int idEtablissementCliked=0;
    private Etablissement etablissementCliked=null;
    private boolean sport = false;
    
    private void doMyInit(){
        // init contexte
        // instanciation couche [metier]
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-metier.xml");
        metier = (IMetier) ctx.getBean("metier");
        regions=metier.findAllRegions();
        
        
        //on remplit la combobox des secteurs
        secteursCombo=new String[]{"---","Public","Privé laïc", "Privé confessionnel"};       
        jComboBoxSecteur.setModel(new DefaultComboBoxModel(secteursCombo));
        
        //on remplit la combobox des types
        typesCombo=new String[]{"---","Général","Technique", "Polyvalent","Normal"};       
        jComboBoxType.setModel(new DefaultComboBoxModel(typesCombo));            
        
        //on remplit la combobox des régions
        regionsCombo=new String[regions.size()+1];
        regionsCombo[0]="---";
        int i=1;
        for(Region region : regions){
            regionsCombo[i++]=region.getNomreg();
        }
        jComboBoxRegion.setModel(new DefaultComboBoxModel(regionsCombo));
        
        remplirDepartementCombobox();
        remplirArrondissementCombobox();
    }
    
    private void infoSaisies(){
        nomEtabSaisi=jTextFieldNom.getText();
        abreviationSaisie=jTextFieldAbreviation.getText();
        secteurSelected=(String) jComboBoxSecteur.getSelectedItem();
        typeSelected=(String) jComboBoxType.getSelectedItem();
        nomRegionSelected=(String) jComboBoxRegion.getSelectedItem();
        nomDepartementSelected=(String) jComboBoxDepartement.getSelectedItem();
        nomArrondissementSelected=(String) jComboBoxArrondissement.getSelectedItem();
        sport = false;
        if (jCheckBoxSport.isSelected()) {
            sport = true;
        }
    }
    private void videFrame(){
        jTextFieldNom.setText("");
        jTextFieldAbreviation.setText("");
        jComboBoxSecteur.setSelectedIndex(0);
        jComboBoxType.setSelectedIndex(0);
        jComboBoxRegion.setSelectedIndex(0);
        jComboBoxDepartement.setSelectedIndex(0);
        jComboBoxArrondissement.setSelectedIndex(0);
        jCheckBoxSport.setSelected(false);
        model.setRowCount(0);//vide la jTable
    }
    
    private void remplirDepartementCombobox(){
        nomRegionSelected=(String) jComboBoxRegion.getSelectedItem();
        departements=metier.findAllDepartementsD1Region(nomRegionSelected);
        //on remplit la combobox des départements
        departementsCombo=new String[departements.size()+1];
        departementsCombo[0]="---";
        int i=1;
        for(Departement departement : departements){
            departementsCombo[i++]=departement.getNomdepart();
        }
        jComboBoxDepartement.setModel(new DefaultComboBoxModel(departementsCombo));
    }
    
    private void remplirArrondissementCombobox(){
        nomDepartementSelected=(String) jComboBoxDepartement.getSelectedItem();
        arrondissements=metier.findAllArrondissementsD1Departement(nomDepartementSelected);
        //on remplit la combobox des arrondissements
        arrondissementsCombo=new String[arrondissements.size()+1];
        arrondissementsCombo[0]="---";
        int i=1;
        for(Arrondissement arrondissement : arrondissements){
            arrondissementsCombo[i++]=arrondissement.getNomarr();
        }
        jComboBoxArrondissement.setModel(new DefaultComboBoxModel(arrondissementsCombo));
    }
}
