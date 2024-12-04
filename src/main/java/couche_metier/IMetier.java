
package couche_metier;

import couche_jpa.Activite;
import couche_jpa.Arrondissement;
import couche_jpa.Bureau;
import couche_jpa.Caisse;
import couche_jpa.Caissesport;
import couche_jpa.Categorie;
import couche_jpa.Centre;
import couche_jpa.Centrebilletage;
import couche_jpa.Centredispatching;
import couche_jpa.Combine;
import couche_jpa.Combinetout;
import couche_jpa.Departement;
import couche_jpa.Deplacecorrect;
import couche_jpa.Deplacepratique;
import couche_jpa.Dureepratique;
import couche_jpa.Elementsurvdeficient;
import couche_jpa.Eltacmtemoin;
import couche_jpa.Eltcmpratique2;
import couche_jpa.Eltcmpratique2sansnoms;
import couche_jpa.Eltcmpratique2sansnomsecret;
import couche_jpa.Eltcmpratique2secret;
import couche_jpa.Eltcomeval;
import couche_jpa.Eltcoordo;
import couche_jpa.Eltcorrecttech;
import couche_jpa.Eltcorrecttechsecret;
import couche_jpa.Eltetatmoepreuvefac;
import couche_jpa.Eltharmo;
import couche_jpa.Eltjuryano;
import couche_jpa.Eltjurypratique2;
import couche_jpa.Eltpermanence;
import couche_jpa.Eltpratique1ind;
import couche_jpa.Eltpratiquestt;
import couche_jpa.Eltpratiquesttsecret;
import couche_jpa.Eltpratiqueti;
import couche_jpa.Eltpratiquinfo;
import couche_jpa.Elttranscriptcopie;
import couche_jpa.Elttranscriptepreuve;
import couche_jpa.Eltvacpratepreuvefac;
import couche_jpa.Epreuve;
import couche_jpa.Etablissement;
import couche_jpa.Examen;
import couche_jpa.Famille;
import couche_jpa.Fmissprimchefcentre;
import couche_jpa.Fonction;
import couche_jpa.Grandcentre;
import couche_jpa.Groupe;
import couche_jpa.Groupedexamen;
import couche_jpa.Inscritsprives;
import couche_jpa.Intervenant;
import couche_jpa.Intervenantsecret;
import couche_jpa.Intervjuryti;
import couche_jpa.Intervsec;
import couche_jpa.Jurycorrige;
import couche_jpa.Jurycorrigesecret;
import couche_jpa.Jurydel;
import couche_jpa.Jurydeladmiss;
import couche_jpa.Jurypratique2;
import couche_jpa.Jurytemoin;
import couche_jpa.Matiere;
import couche_jpa.Matoeuvresf;
import couche_jpa.Mopratiquee;
import couche_jpa.Mopratiquesti;
import couche_jpa.Nature;
import couche_jpa.Naturesecretariat;
import couche_jpa.Nbadmissibles;
import couche_jpa.Nbcandepreuvefac;
import couche_jpa.Nbcandlibresg;
import couche_jpa.Nbcandlibrestp;
import couche_jpa.Nbcartons;
import couche_jpa.Nbchefsalle;
import couche_jpa.Nbchefsallesecret;
import couche_jpa.Nbcopiesdelib;
import couche_jpa.Nbcopiesdispatchees;
import couche_jpa.Nbentetes;
import couche_jpa.Nbepreuveprof;
import couche_jpa.Nbinaptes;
import couche_jpa.Nblivrets;
import couche_jpa.Nbnotesprat2;
import couche_jpa.Option;
import couche_jpa.Optiond1sousfamille;
import couche_jpa.Personnel;
import couche_jpa.Ponderation;
import couche_jpa.Qualite;
import couche_jpa.Rattachcentre;
import couche_jpa.Rattachdispatching;
import couche_jpa.Rattachetab;
import couche_jpa.Rattachregroupement;
import couche_jpa.Rattachscentre;
import couche_jpa.Rattachventilation;
import couche_jpa.Rattachventilationspeciale;
import couche_jpa.Region;
import couche_jpa.Rubriquedegroupe;
import couche_jpa.Rubriquetat;
import couche_jpa.Scentaplus;
import couche_jpa.Secretariat;
import couche_jpa.Secteurcouv;
import couche_jpa.Session;
import couche_jpa.Souscentre;
import couche_jpa.Sousfamille;
import couche_jpa.Specialisation;
import couche_jpa.Specialisationsec;
import couche_jpa.Stataptes;
import couche_jpa.Statistique;
import couche_jpa.Statsecretariat;
import couche_jpa.Utilisateur;
import java.util.List;


public interface IMetier {
    // utilisateurs
    public List<Utilisateur> findAllUtilisateurs();
    public Utilisateur creerUtilisateur(Utilisateur user);
    public Utilisateur modifierUtlisateur(Utilisateur user);
    public void supprimerUtilisateur(Utilisateur user);
    public Utilisateur findUtlisateurById(int id);
    public Utilisateur findUtilisateurByLoginAndPwd(String log,String pwd);
    // régions
    public List<Region> findAllRegions();
    public Region creerRegion(Region region);
    public Region modifierRegion(Region region);
    public void supprimerRegion(Region region);
    public List<Region> findAllRegionsLikeName(String nom);
    public Region findRegionById(int id);
    
    // départements
    public List<Departement> findAllDepartements();
    public Departement creerDepartement(Departement departement);
    public Departement modifierDepartement(Departement departement);
    public void supprimerDepartement(Departement departement);
    public List<Departement> findAllDepartementsLikeName(String nom);
    public Departement findDepartementById(int id);
    public List<Departement> findAllDepartementsD1Region(String nom);
    
    //arrondissements
    public List<Arrondissement> findAllArrondissements();
    public Arrondissement creerArrondissement(Arrondissement arrondissement);
    public Arrondissement modifierArrondissement(Arrondissement arrondissement);
    public void supprimerArrondissement(Arrondissement arrondissement);
    public List<Arrondissement> findAllArrondissementsLikeName(String nom);
    public Arrondissement findArrondissementById(int id);
    public List<Arrondissement> findAllArrondissementsD1Departement(String nom);
    public List<Arrondissement> findAllArrondissementsD1Region(String nomRegionSelected);
    public Arrondissement findArrondissementByName(String arrondt);
    
    
    // caisses
    public List<Caisse> findAllCaisses();
    public Caisse creerCaisse(Caisse caisse);
    public Caisse modifierCaisse(Caisse caisse);
    public void supprimerCaisse(Caisse caisse);
    public Caisse findCaisseById(int id);
    public List<Caisse> findAllCaissesD1Session(int annee);
    public Caisse findCaisseD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int annee, String nomSouscentre, String niveau, String type, String designationRubriquetat);
    public List<Caisse> findAllCaissesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int annee, String niveau, String type);
    public List<Caisse> findAllCaissesOrdinairesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Caisse> findAllCaissesAdditivesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int anneeSelected, String niveauSelected, String typeSelected);
    public Caisse findCaisseOrdinaireD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String designationRubriquetatSelected);
    public Caisse findCaisseAdditiveD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String designationRubriquetatSelected);
    
    // caissesport
    public List<Caissesport> findAllCaissesport();
    public Caissesport creerCaissesport(Caissesport caissesport);
    public Caissesport modifierCaissesport(Caissesport caissesport);
    public void supprimerCaissesport(Caissesport caissesport);
    public Caissesport findCaissesportById(int id);
    public List<Caissesport> findAllCaissesportD1Session(int anneeSelected);
    public Caissesport findCaissesportD1EtablissementDans1SessionPour1Groupedexamens(int annee, String nomEtablissement, String niveau, String type);
    public List<Caissesport> findAllCaissesportsD1SessionPour1Groupedexamens(int annee, String niveau, String type);
    
    // centres
    public List<Centre> findAllCentres();
    public Centre creerCentre(Centre centre);
    public Centre modifierCentre(Centre centre);
    public void supprimerCentre(Centre centre);
    public List<Centre> findAllCentresLikeName(String nom);
    public Centre findCentreById(int id);
    public List<Centre> findAllCentresD1Departement(String nomDepartement);
    public List<Centre> findAllCentresD1Arrondissement(String nomArrondissement);
    public List<Centre> findAllCentresD1Region(String nomRegionSelected);
    public Centre findCentreByNom(String centreDeliberation);
    public Centre findCentreByEtablissement(String abreviation);
    
    // établissements
    public List<Etablissement> findAllEtablissements();
    public Etablissement creerEtablissement(Etablissement etablissement);
    public Etablissement modifierEtablissement(Etablissement etablissement);
    public void supprimerEtablissement(Etablissement etablissement);
    public List<Etablissement> findAllEtablissementsLikeName(String nom);
    public Etablissement findEtablissementById(int id);
    public List<Etablissement> findAllEtablissementsD1Departement(String nom);
    public List<Etablissement> findAllEtablissementsD1Arrondissement(String nomArrondissement);
    public Etablissement findEtablissementByAbreviation(String abreviation);
    public List<Etablissement> findAllEtablissementsCentreDEpsD1Arrondissement(String nomArrondissement);
    
    // examens
    public List<Examen> findAllExamens();
    public Examen creerExamen(Examen examen);
    public Examen modifierExamen(Examen examen);
    public void supprimerExamen(Examen examen);
    public List<Examen> findAllExamensLikeName(String nom);
    public Examen findExamenById(int id);
    public Examen findExamenBySigle(String sigle);
    public List<Examen> findAllExamensD1NiveauEtD1Type(String niveau, String type);
    public List<Examen> findAllExamensD1Type(String type);
    public List<Examen> findAllExamensD1Niveau(String niveau);
    public List<Examen> findAllExamensIndustiels();
    public List<Examen> findAllExamensStt();
    public List<Examen> findAllExamensEstp();
    public List<Examen> findAllExamensIndustielsD1Niveau(String niveau);
    public List<Examen> findAllExamensSttD1Niveau(String niveau);
    public List<Examen> findAllExamensEstpD1Niveau(String niveau);
    
    // natures
    public List<Nature> findAllNatures();
    public Nature creerNature(Nature nature);
    public Nature modifierNature(Nature nature);
    public void supprimerNature(Nature nature);
    public Nature findNatureById(int id);
    public List<Character> findAllNaturesEnCharD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomEtablissement);//nomEtablissement abritant le sous-centre
    public List<String> findAllPhasesD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected);
    public List<String> findAllNaturesEnStringD1ExamenEtD1Session(int anneeSelected, String sigleExamenSelected);
    public void supprimerLesNaturesD1SouscentrePour1SessionD1Examen(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected);
    public List<Nature> findAllNaturesD1ExamenDans1Session(int anneeSelected, String sigle);
    public List<String> findAllNaturesD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected);
    public List<Nature> findAllNaturesDesCentreD1ExamenDans1Session(int annee,String sigleExamen);
    public List<Nature> findAllNaturesDesSousCentreD1ExamenDans1Session(int annee,String sigleExamen);
    public List<Nature> findAllPhasesD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected);
    
    // nbepreuveprofs
    public List<Nbepreuveprof> findAllNbepreuveprofs();
    public Nbepreuveprof creerNbepreuveprof(Nbepreuveprof nbepreuveprof);
    public Nbepreuveprof modifierNbepreuveprof(Nbepreuveprof nbepreuveprof);
    public void supprimerNbepreuveprof(Nbepreuveprof nbepreuveprof);
    public Nbepreuveprof findNbepreuveprofById(int id);
    public List<Nbepreuveprof> findAllNbepreuveprofsD1Examen(String sigleExamenCliked);
    public Nbepreuveprof findAllNbepreuveprofsD1ExamenEtD1Option(String sigleExamenCliked, String sigleOptionCliked);
    public List<Nbepreuveprof> findAllOptionsD1Examen(String sigleExamen);
    
    // options
    public List<Option> findAllOptions();
    public Option creerOption(Option option);
    public Option modifierOption(Option option);
    public void supprimerOption(Option option);
    public List<Option> findAllOptionsLikeName(String nom);
    public Option findOptionById(int id);
    public Option findOptionBySigle(String sigle);
    public List<Option> findAllOptionsDeSigleLikeChaine(String chaine);
     public List<Option> findAllOptionsD1Famille(String titreFamilleSelected);
    
    // personnels
    public List<Personnel> findAllPersonnels();
    public Personnel creerPersonnel(Personnel personnel);
    public Personnel modifierPersonnel(Personnel personnel);
    public void supprimerPersonnel(Personnel personnel);
    public List<Personnel> findAllPersonnelsLikeName(String nom);
    public Personnel findPersonnelById(int id);
    public Personnel findPersonnelByMatricule(String matricule);
    public List<Personnel> findAllPersonnelsD1Departement(String nomDepartement);
    public List<Personnel> findAllPersonnelsD1Arrondissement(String nomArrondissementSelected);
    
    // rubriquetats
    public List<Rubriquetat> findAllRubriquetats();
    public Rubriquetat creerRubriquetat(Rubriquetat rubriquetat);
    public Rubriquetat modifierRubriquetat(Rubriquetat rubriquetat);
    public void supprimerRubriquetat(Rubriquetat rubriquetat);
    public List<Rubriquetat> findAllRubriquetatsLikeName(String nom);
    public Rubriquetat findRubriquetatById(int id);
    public List<Rubriquetat> findAllRubriquetatsD1Categorie(String titreCategorie);
    public Rubriquetat findRubriquetatByDesignation(String prise_en_charge_deps);
    
    // sessions
    public List<Session> findAllSessions();
    public Session creerSession(Session session);
    public Session modifierSession(Session session);
    public void supprimerSession(Session session);
    public Session findSessionById(int id);
    
    // sous-centres
    public List<Souscentre> findAllSouscentres();
    public Souscentre creerSouscentre(Souscentre souscentre);
    public Souscentre modifierSouscentre(Souscentre souscentre);
    public void supprimerSouscentre(Souscentre souscentre);
    public List<Souscentre> findAllSouscentresLikeName(String nom);
    public Souscentre findSouscentreById(int id);
    //public List<Souscentre> findAllSouscentresD1Centre(String nomCentre);
    public List<Souscentre> findAllSouscentresD1Departement(String nomDepartement);
    public List<Souscentre> findAllSouscentresD1Arrondissement(String nomArrondissement);
    public Souscentre findSouscentreByName(String nom);
    public Souscentre findSouscentreByEtablissement(String abreviation);
    public List<Souscentre> findAllSouscentresNoso();
    public List<Souscentre> findAllSouscentresArisquesExtNord();
    public List<Souscentre> findAllSouscentresEnclaves(); 
    public List<Souscentre> findAllSouscentresPrivesD1Arrondissement(String nomArrondissementSouscentreSelected);
    
    
    // statistiques
    public List<Statistique> findAllStatistiques();
    public Statistique creerStatistique(Statistique statistique);
    public Statistique modifierStatistique(Statistique statistique);
    public void supprimerStatistique(Statistique statistique);    
    public Statistique findStatistiqueById(int id); 
    public List<Statistique> findAllStatistiquesD1SouscentreA1ExamenDans1Session(int annee, String nomSouscentre, String sigleExamen);
    public List<Statistique> findAllStatistiquesD1ExamenDans1Session(int annee,String sigleExamen);
    public List<Statistique> findAllStatistiquesD1ExamenDans1Session(String sigle, int anneeSelected);
    public List<Statistique> findAllStatistiquesD1ExamenDans1SessionET1Souscentre(String sigle, int anneeSelected, String nomSouscentreSelected);
    public List<Statistique> findAllStatistiquesD1SouscentreDans1Session(int anneeSelected, String nomSouscentreSelected);
    public int findStatistiqueD1SouscentreA1Examen1SessionEt1Option(String nomsouscent, String sigle, int annee, String sigle0);
    public List<Statistique> findAllStatistiquesABID1ExamenDans1Session(String sigle, int anneeSelected);
    public List<Statistique> findAllStatistiquesTID1ExamenDans1Session(String sigle, int anneeSelected);
    public List<Statistique> findAllStatistiquesAutresLitterairesD1ExamenDans1Session(String sigle, int anneeSelected);
    public List<Statistique> findAllStatistiquesScientifiquesD1ExamenDans1Session(String sigle, int anneeSelected);

    
    //catégories
    public Categorie creerCategorie(Categorie categorie);    
    public Categorie modifierCategorie(Categorie categorie);  
    public void supprimerCategorie(Categorie categorie);   
    public Categorie findCategorieById(int id); 
    public List<Categorie> findAllCategories();  
    public List<Categorie> findAllCategoriesLikeTitre(String titre);   

    //fonctions
    public Fonction creerFonction(Fonction fonction);    
    public Fonction modifierFonction(Fonction fonction);  
    public void supprimerFonction(Fonction fonction);   
    public Fonction findFonctionById(int id); 
    public List<Fonction> findAllFonctions();
    public List<Fonction> findAllFonctionsLikeTitre(String titre);
    public Fonction findFonctionByTitre(String titrefonct);
    
    //activités
    public Activite creerActivite(Activite activite);    
    public Activite modifierActivite(Activite activite);  
    public void supprimerActivite(Activite activite);   
    public Activite findActiviteById(int id); 
    public List<Activite> findAllActivites();
    public List<Activite> findAllActivitesLikeNom(String nom);
    public Activite findActiviteByNom(String nom);
    
    //spécialisations
    public Specialisation creerSpecialisation(Specialisation specialisation);    
    public Specialisation modifierSpecialisation(Specialisation specialisation);  
    public void supprimerSpecialisation(Specialisation specialisation);   
    public Specialisation findSpecialisationById(int id); 
    public List<Specialisation> findAllSpecialisations();
    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1ExamenEtSession(int annee, String sigleExamen, String nomSouscentre);
    public List<Specialisation> findAllSpecialisationsD1ExamenEtD1Session(int anneeSelected, String sigleExamen);
    public void supprimerLesSpecialisationsD1SouscentrePour1SessionD1Examen(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected);
    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1SessionEtniveau(int anneeSelected, String nomSouscentreSelected, String niveauSelected);
    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1SessionD1NiveauEtType(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected);
    public List<Specialisation> findAllSpecialisationsD1SouscentreEtSession(int anneeSelected, String nomSouscentreSelected);
    
    //stataptes    
    public Stataptes creerStataptes(Stataptes stataptes);    
    public Stataptes modifierStataptes(Stataptes stataptes);    
    public void supprimerStataptes(Stataptes stataptes);    
    public Stataptes findStataptesById(int id);    
    public List<Stataptes> findAllStataptes();
    public Stataptes findStataptesD1EtablissementA1ExamenDans1Session(int anneeSelected, String nomEtablissementSelected, String sigleExamenSelected);
    public List<Stataptes> findAllStataptesD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected);

    //scentaplus
    public Scentaplus creerScentaplus(Scentaplus scentaplus);    
    public Scentaplus modifierScentaplus(Scentaplus scentaplus);  
    public void supprimerScentaplus(Scentaplus scentaplus);   
    public Scentaplus findScentaplusById(int id); 
    public List<Scentaplus> findAllScentaplus();
    public void supprimerUnScentaplus(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected);
    public List<Scentaplus> findAllScentaplusD1RegionA1ExamenEt1Session(int anneeSelected, String sigleExamenSelected, String nomRegionSelected);
    public List<Scentaplus> findAllScentaplusD1ExamenEt1Session(int anneeSelected, String sigleExamenSelected);

    //centres de dispatching
    public Centredispatching creerCentredispatching(Centredispatching centredispatching);    
    public Centredispatching modifierCentredispatching(Centredispatching centredispatching);  
    public void supprimerCentredispatching(Centredispatching centredispatching);   
    public Centredispatching findCentredispatchingById(int id);
    public List<Centredispatching> findAllCentresdispatchingD1Arrondissement(String nomArrondissementSelected);
    public Centredispatching findCentredispatchingLikeName(String nomCentreSelected);
    public List<Centredispatching> findAllCentresdispatchingD1Region(String nomRegionSelected);
    public List<Centredispatching> findAllCentresdispatchingD1Departement(String nomDepartementSelected);
    public List<Centredispatching> findAllCentredispatchingD1Type(String type);
    public List<Centredispatching> findAllCentresdispatchingD1TypeD1Region(String type, String nomRegion);
    public List<Centredispatching> findAllCentresdispatchingD1TypeD1Departement(String type, String nomDepartement);
    public List<Centredispatching> findAllCentredispatchings();
    public Centredispatching findCentredispatchingD1TypeByEtablissement(String etab, String type);
    public List<Centredispatching> findAllCentresVentilationEtspecialeD1Region(String nomRegionVentilationSelected);
    public List<Centredispatching> findAllCentresVentilationEtspeciale();
    
    
    //secretariats
    public Secretariat creerSecretariat(Secretariat secretariat);    
    public Secretariat modifierSecretariat(Secretariat secretariat);  
    public void supprimerSecretariat(Secretariat secretariat);   
    public Secretariat findSecretariatById(int id); 
    public List<Secretariat> findAllSecretariats();
    public List<Secretariat> findAllSecretariatsD1SouscentreEtSession(String nomSouscentre,int annee);
    public void supprimerAllSecretariatsD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected);
    //public List<Secretariat> findAllSecretariatsD1GroupedexamensDans1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public Secretariat findSecretariatD1NumeroD1SessionD1SouscentreD1Etablissement(int numsec, int anneeSelected, String nomSouscentreSelected, String nomEtablissementSelected);
    //public List<Secretariat> findAllSecretariatsD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected);
    //public List<Secretariat> findAllSecretariatsD1SouscentreA1SessionEt1Examen(String nomSouscentreSelected,int anneeSelected,String sigleExamenSelected);
    //public Secretariat findSecretariatD1SouscentreD1numeroD1Session(String scentre, int numsec, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Secretariat> findAllSecretariatsD1Session(int anneeSelected);
    public Secretariat findSecretariatD1SouscentreDeNumeroEtSessionDonnes(String nomSouscentreSelected, int numsec, int anneeSelected);
    
    //secteurcouv
    public Secteurcouv creerSecteurcouv(Secteurcouv secteurcouv);    
    public Secteurcouv modifierSecteurcouv(Secteurcouv secteurcouv);  
    public void supprimerSecteurcouv(Secteurcouv secteurcouv);   
    public Secteurcouv findSecteurcouvById(int id); 
    public List<Secteurcouv> findAllSecteurscouvD1Region(String nomRegion);
    public List<Secteurcouv> findAllSecteurscouvD1Centrebilletage(String nomCentrebilletage);
    public List<Secteurcouv> findAllSecteurscouv();
    
    //bureau
    public Bureau creerBureau(Bureau bureau);    
    public Bureau modifierBureau(Bureau bureau);  
    public void supprimerBureau(Bureau bureau);   
    public Bureau findBureauById(int id); 
    public Bureau findBureauD1CentrebilletageDans1Session(String nomCentrebilletageSelected, int anneeSelected);   
    public List<Bureau> findAllBureauxD1Session(int anneeSelected);  
    public List<Bureau> findAllBureauxD1ArrondissementDans1Session(String nomArrondissement,int annee);
    public List<Bureau> findAllBureauxD1DepartementDans1Session(String nomDepartement, int annee);
    public List<Bureau> findAllBureauxD1RegionDans1Session(String nomRegion, int annee);
    
    //bureau
    public Naturesecretariat creerNaturesecretariat(Naturesecretariat naturesecretariat);    
    public Naturesecretariat modifierNaturesecretariat(Naturesecretariat naturesecretariat);  
    public void supprimerNaturesecretariat(Naturesecretariat naturesecretariat);   
    public Naturesecretariat findNaturesecretariatById(int id);
    public List<Naturesecretariat> findAllNaturesecretariats();
    public void supprimerAllNaturesecretariatsD1SouscentreDans1SessionEt1Groupedexamens(String nomSouscentreSelected,int annee,String niveau,String type);
    public List<Naturesecretariat> findAllNaturesecretariatsD1SouscentreA1SessionEt1Groupedexamens(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Naturesecretariat> findAllNaturesecretariatsD1SouscentreA1SessionDans1Activite(String act, String nomSouscentreSelected, int anneeSelected);
    public List<Naturesecretariat> findAllNaturesecretariatsD1GroupedexamensA1SessionDans1Activite(String phase, String niveauSelected, String typeSelected, int anneeSelected);
    public List<Naturesecretariat> findAllNaturesecretariatsD1Secreatariat(Integer idsec);
    public List<Naturesecretariat> findAllNaturesecretariatD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected,int numsec);
    public List<Naturesecretariat> findAllNaturesecretariatsD1ExamensD1Session(int anneeSelected, String sigleExamenSelected);
    public List<Naturesecretariat> findAllNaturesecretariatsD1Session(int anneeSelected);
    public List<Naturesecretariat> findAllNaturesecretariatD1SouscentreEtSession(int anneeSelected, String nomSouscentreSelected);
    public List<Naturesecretariat> findAllNaturesecretariatD1Secretariat(int num, int sess, String scent, String etab);
    
    //groupes
    public Groupe creerGroupe(Groupe groupe);    
    public Groupe modifierGroupe(Groupe groupe);  
    public void supprimerGroupe(Groupe groupe);   
    public Groupe findGroupeById(int id);
    public List<Groupe> findAllGroupes();
    public Groupe findGroupeD1NiveauEtD1Type(String niveauSelected, String typeSelected);
    
    //groupedexamens
    public Groupedexamen creerGroupedexamen(Groupedexamen groupedexamen);    
    public Groupedexamen modifierGroupedexamen(Groupedexamen groupedexamen);  
    public void supprimerGroupedexamen(Groupedexamen groupedexamen);   
    public Groupedexamen findGroupedexamenById(int id);
    public List<Groupedexamen> findAllGroupedexamens();
    public List<Groupedexamen> findAllGroupedexamensD1NiveauEtD1Type(String niveau, String type);
    
    //rubriquedegroupes
    public Rubriquedegroupe creerRubriquedegroupe(Rubriquedegroupe rubriquedegroupe);    
    public Rubriquedegroupe modifierRubriquedegroupe(Rubriquedegroupe rubriquedegroupe);  
    public void supprimerRubriquedegroupe(Rubriquedegroupe rubriquedegroupe);   
    public Rubriquedegroupe findRubriquedegroupeById(int id);
    public List<Rubriquedegroupe> findAllRubriquedegroupes();
    
    // familles
    public List<Famille> findAllFamilles();
    public Famille creerFamille(Famille famille);
    public Famille modifierFamille(Famille famille);
    public void supprimerFamille(Famille famille);
    public Famille findFamilleById(int id);
    public List<Famille> findAllFamillesLikeTitre(String titre);
    public Famille findFamilleByTitre(String titre);
    
    
    // Rattachdispatching
    public List<Rattachdispatching> findAllRattachdispatchings();
    public Rattachdispatching creerRattachdispatching(Rattachdispatching rattachdispatching);
    public Rattachdispatching modifierRattachdispatching(Rattachdispatching rattachdispatching);
    public void supprimerRattachdispatching(Rattachdispatching rattachdispatching);
    public Rattachdispatching findRattachdispatchingById(int id);
    public List<Rattachdispatching> findAllRattachdispatchingsD1CentredispatchingD1Type(String nomCentreregroupement,String type);
    public List<Rattachdispatching> findAllRattachdispatchingsD1Centredispatching(String nomCentreDispatchingSelected);
    public Rattachdispatching findRattachdispatchingD1SouscentreD1Type(String nomsouscent,String type);
    public List<Rattachdispatching> findAllRattachdispatchingsD1Souscentre(String nomsouscent);
    
    // grandcentres
    public List<Grandcentre> findAllGrandcentres();
    public Grandcentre creerGrandcentre(Grandcentre grandcentre);
    public Grandcentre modifierGrandcentre(Grandcentre grandcentre);
    public void supprimerGrandcentre(Grandcentre grandcentre);
    public Grandcentre findGrandcentreById(int id);
    public List<Grandcentre> findAllGrandcentresD1Region(String nomRegion);
    public List<Grandcentre> findAllGrandcentresLikeName(String nom);
    public List<Grandcentre> findAllGrandcentresD1RegionD1NiveauEtD1Type(String nomreg, String nomniv, String nomtyp);

    // centres de billetages
    public List<Centrebilletage> findAllCentrebilletages();
    public Centrebilletage creerCentrebilletage(Centrebilletage centrebilletage);
    public Centrebilletage modifierCentrebilletage(Centrebilletage centrebilletage);
    public void supprimerCentrebilletage(Centrebilletage centrebilletage);
    public Centrebilletage findCentrebilletageById(int id); 
    public List<Centrebilletage> findAllCentrebilletagesD1Arrondissement(String nomArrondissement);
    public Centrebilletage findCentrebilletageD1Etablissement(String nomEtablissement);
    public List<Centrebilletage> findAllCentrebilletagesD1Departement(String nomDepartement);
    public List<Centrebilletage> findAllCentrebilletagesD1Region(String nomRegion);

    // Rattachetab
    public List<Rattachetab> findAllRattachetabs();
    public Rattachetab creerRattachetab(Rattachetab rattachetab);
    public Rattachetab modifierRattachetab(Rattachetab rattachetab);
    public void supprimerRattachetab(Rattachetab rattachetab);
    public Rattachetab findRattachetabById(int id); 
    public Rattachetab findRattachetabD1Etablissement(String nomEtablissement);
    public List<Rattachetab> findAllRattachetabD1Souscentre(String nomSouscentre);
    
    // Rattachscentre
    public List<Rattachscentre> findAllRattachscentres();
    public Rattachscentre creerRattachscentre(Rattachscentre rattachscentre);
    public Rattachscentre modifierRattachscentre(Rattachscentre rattachscentre);
    public void supprimerRattachscentre(Rattachscentre rattachscentre);
    public Rattachscentre findRattachscentreById(int id); 
    public List<Rattachscentre> findAllRattachscentresD1Centre(String nomCentre);
    public Rattachscentre findRattachscentreD1Souscentre(String nomSouscentre);
    
    // Rattachcentre
    public List<Rattachcentre> findAllRattachcentres();
    public Rattachcentre creerRattachcentre(Rattachcentre rattachcentre);
    public Rattachcentre modifierRattachcentre(Rattachcentre rattachcentre);
    public void supprimerRattachcentre(Rattachcentre rattachcentre);
    public Rattachcentre findRattachcentreById(int id);     
    public List<Rattachcentre> findAllRattachcentresD1Grandcentre(String nomGrandcentre);
    public Rattachcentre findRattachcentreD1Centre(String nomCentreDeliberation);
    public List<Centrebilletage> findAllCentrebilletagesD1NiveauD1Type(String niveau, String type);

    // Elementsurvdeficient
    public List<Elementsurvdeficient> findAllElementsurvdeficients();
    public Elementsurvdeficient creerElementsurvdeficient(Elementsurvdeficient elementsurvdeficient);
    public Elementsurvdeficient modifierElementsurvdeficient(Elementsurvdeficient elementsurvdeficient);
    public void supprimerElementsurvdeficient(Elementsurvdeficient elementsurvdeficient);
    public Elementsurvdeficient findElementsurvdeficientById(int id); 
    public List<Elementsurvdeficient> findAllElementsurvdeficientsD1groupedexamenA1Session(int annee, String niveau, String type);

    // qualites
    public List<Qualite> findAllQualites();
    public Qualite creerQualite(Qualite qualite);
    public Qualite modifierQualite(Qualite qualite);
    public void supprimerQualite(Qualite qualite);
    public Qualite findQualiteById(int id); 
    public List<Qualite> findAllQualitesLikeTitre(String titre);
    public Qualite findQualiteByTitre(String titre);
    
    // intervenants
    public List<Intervenant> findAllIntervenants();
    public Intervenant creerIntervenant(Intervenant intervenant);
    public Intervenant modifierIntervenant(Intervenant intervenant);
    public void supprimerIntervenant(Intervenant intervenant);
    public Intervenant findIntervenantById(int id);    
    public Intervenant findIntervenantByNomEtPrenomD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(String nom,String prenom, int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titre);
    public List<Intervenant> findAllIntervenantsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titre);
    public Intervenant findIntervenantByQualiteD1GroupeDexamensD1SessionD1SouscentreEtActivite(int anneeSelected, String nomsouscent, String niveauSelected, String typeSelected, String phase, String qualiteResponsble);
    public List<Intervenant> findAllIntervenantsD1GroupeDexamensD1SouscentreD1SessionD1ActiviteEt1Qualite(int annee, String nomSouscentre, String niveau, String type, String phase, String titreQualite);
    public Intervenant findIntervenantD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titreQualite);
    public List<Intervenant> findAllIntervenantsProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String correcteur);
    public List<Intervenant> findAllIntervenantsNonProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String correcteur);
    
    // intervsec
    public List<Intervsec> findAllIntervsecs();
    public Intervsec creerIntervsec(Intervsec intervsec);
    public Intervsec modifierIntervsec(Intervsec intervsec);
    public void supprimerIntervsec(Intervsec intervsec);
    public Intervsec findIntervsecById(int id);
    public Intervsec findIntersecD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1QualiteD1Secretariat(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titreQualite, int numsec);
    public List<Intervsec> findAllIntervsecsD1GroupedexamensD1SessionD1ActiviteD1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titreQualite);
    
    // intervjuryti
    public List<Intervjuryti> findAllIntervjurytis();
    public Intervjuryti creerIntervjuryti(Intervjuryti intervjuryti);
    public Intervjuryti modifierIntervjuryti(Intervjuryti intervjuryti);
    public void supprimerIntervjuryti(Intervjuryti intervjuryti);
    public Intervjuryti findIntervjurytiById(int id);
    public List<Intervjuryti> findAllIntervjurytisD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String chefjury);
    public void supprimerIntervjurytiByIntervenantId(Integer idinterv);
    public List<Intervjuryti> findAllIntervjurytisD1SouscentreD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(String nomsouscent, int anneeSelected, String niveauSelected, String typeSelected, String phase, String chefjury);


    // nbcopiesdelib
    public List<Nbcopiesdelib> findAllNbcopiesdelib();
    public Nbcopiesdelib creerNbcopiesdelib(Nbcopiesdelib nbcopiesdelib);
    public Nbcopiesdelib modifierNbcopiesdelib(Nbcopiesdelib nbcopiesdelib);
    public void supprimerNbcopiesdelib(Nbcopiesdelib nbcopiesdelib);
    public Nbcopiesdelib findNbcopiesdelibById(int id);
    public Nbcopiesdelib findNbcopiesdelibD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Nbcopiesdelib> findAllNbcopiesdelibD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    // nbcopiesdispatchees
    public List<Nbcopiesdispatchees> findAllNbcopiesdispatchees();
    public Nbcopiesdispatchees creerNbcopiesdispatchees(Nbcopiesdispatchees nbcopiesdispatchees);
    public Nbcopiesdispatchees modifierNbcopiesdispatchees(Nbcopiesdispatchees nbcopiesdispatchees);
    public void supprimerNbcopiesdispatchees(Nbcopiesdispatchees nbcopiesdispatchees);
    public Nbcopiesdispatchees findNbcopiesdispatcheesById(int id);
    public Nbcopiesdispatchees findNbcopiesdispatcheesD1CentreregroupementD1GroupedexamensD1Session(String nomCentreregroupementSelected, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Nbcopiesdispatchees> findAllNbcopiesdispatcheesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);  
    
    // Rattachregroupement
    public List<Rattachregroupement> findAllRattachregroupements();
    public Rattachregroupement creerRattachregroupement(Rattachregroupement rattachregroupement);
    public Rattachregroupement modifierRattachregroupement(Rattachregroupement rattachregroupement);
    public void supprimerRattachregroupement(Rattachregroupement rattachregroupement);
    public Rattachregroupement findRattachregroupementById(int id);
    public Rattachregroupement findRattachregroupementD1Centreregroupement(String centreregroup); //on ne saurait l'avoir d'un autre type   
    public List<Rattachregroupement> findAllRattachregroupementsD1CentredispatchingD1Type(String nomExacte, String typeExate);
    public List<Rattachregroupement> findAllRattachregroupementsD1Centredispatching(String abreviation);
    
    // nbchefsalles
    public List<Nbchefsalle> findAllNbchefsalles();
    public Nbchefsalle creerNbchefsalle(Nbchefsalle nbchefsalle);
    public Nbchefsalle modifierNbchefsalle(Nbchefsalle nbchefsalle);
    public void supprimerNbchefsalle(Nbchefsalle nbchefsalle);
    public Nbchefsalle findNbchefsalleById(int id);
    public Nbchefsalle findNbchefsalleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Nbchefsalle> findAllNbchefsallesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    // Jurycorriges
    public List<Jurycorrige> findAllJurycorriges();
    public Jurycorrige creerJurycorrige(Jurycorrige jurycorrige);
    public Jurycorrige modifierJurycorrige(Jurycorrige jurycorrige);
    public void supprimerJurycorrige(Jurycorrige jurycorrige);
    public Jurycorrige findJurycorrigeById(int id);
    public Jurycorrige findJurycorrigeD1SousfamilleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);
    
    //Sousfamilles
    public List<Sousfamille> findAllSousfamilles();
    public Sousfamille creerSousfamille(Sousfamille sousfamille);
    public Sousfamille modifierSousfamille(Sousfamille sousfamille);
    public void supprimerSousfamille(Sousfamille sousfamille);
    public Sousfamille findSousfamilleById(int id);
    public List<Sousfamille> findAllSousfamillesTI();
    public Sousfamille findSousfamilleByTitre(String titre);
    public List<Sousfamille> findAllSousfamillesESG();
    public List<Sousfamille> findAllSousfamillesSTT();
    
    //Optiond1sousfamilles
    public List<Optiond1sousfamille> findAllOptiond1sousfamilles();
    public Optiond1sousfamille creerOptiond1sousfamille(Optiond1sousfamille optiond1sousfamille);
    public Optiond1sousfamille modifierOptiond1sousfamille(Optiond1sousfamille optiond1sousfamille);
    public void supprimerOptiond1sousfamille(Optiond1sousfamille optiond1sousfamille);
    public Optiond1sousfamille findOptiond1sousfamilleById(int id);
    public List<Sousfamille> findAllSousfamillesLikeTitre(String titre);
     public List<Sousfamille> findAllSousfamillesD1Famille(String titreFamilleSelected);
    
    //Rattachventilations
    public List<Rattachventilation> findAllRattachventilations();
    public Rattachventilation creerRattachventilation(Rattachventilation rattachventilation);
    public Rattachventilation modifierRattachventilation(Rattachventilation rattachventilation);
    public void supprimerRattachventilation(Rattachventilation rattachventilation);
    public Rattachventilation findRattachventilationById(int id);
    public List<Rattachventilation> findAllRattachventilationsD1CentreventilationSpecial(String nomExacteventilationSpecial);//il n'en existe pas d'un autre type
    public Rattachventilation findRattachventilationD1Centreventilation(String nomCentreventil);//il n'en existe pas d'un autre type

    public List<Jurycorrige> findAllJurycorrigesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //eltacmtemoin
    public List<Eltacmtemoin> findAllEltacmtemoins();
    public Eltacmtemoin creerEltacmtemoin(Eltacmtemoin eltacmtemoin);
    public Eltacmtemoin modifierEltacmtemoin(Eltacmtemoin eltacmtemoin);
    public void supprimerEltacmtemoin(Eltacmtemoin eltacmtemoin);
    public Eltacmtemoin findEltacmtemoinById(int id);
    public List<Eltacmtemoin> findAllEltacmtemoinsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //jurytemoin
    public List<Jurytemoin> findAllJurytemoins();
    public Jurytemoin creerJurytemoin(Jurytemoin jurytemoin);
    public Jurytemoin modifierJurytemoin(Jurytemoin jurytemoin);
    public void supprimerJurytemoin(Jurytemoin jurytemoin);
    public Jurytemoin findJurytemoinById(int id);
    public Jurytemoin findJurytemoinD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Jurytemoin> findAllJurystemoinsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //jurydel
    public List<Jurydel> findAllJurydels();
    public Jurydel creerJurydel(Jurydel jurydel);
    public Jurydel modifierJurydel(Jurydel jurydel);
    public void supprimerJurydel(Jurydel jurydel);
    public Jurydel findJurydelById(int id);
    public Jurydel findJurydelD1SousfamilleD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);
    public List<Jurydel> findAllJurydelsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //eltcmpratique2
    public List<Eltcmpratique2> findAllEltcmpratique2();
    public Eltcmpratique2 creerEltcmpratique2(Eltcmpratique2 eltcmpratique2);
    public Eltcmpratique2 modifierEltcmpratique2(Eltcmpratique2 eltcmpratique2);
    public void supprimerEltcmpratique2(Eltcmpratique2 eltcmpratique2);
    public Eltcmpratique2 findEltcmpratique2ById(int id);
    public List<Eltcmpratique2> findAllEltcmpratique2D1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //eltcmpratique2sansnoms
    public List<Eltcmpratique2sansnoms> findAllEltcmpratique2sansnoms();
    public Eltcmpratique2sansnoms creerEltcmpratique2sansnoms(Eltcmpratique2sansnoms eltcmpratique2sansnoms);
    public Eltcmpratique2sansnoms modifierEltcmpratique2sansnoms(Eltcmpratique2sansnoms eltcmpratique2sansnoms);
    public void supprimerEltcmpratique2sansnoms(Eltcmpratique2sansnoms eltcmpratique2sansnoms);
    public Eltcmpratique2sansnoms findEltcmpratique2sansnomsById(int id);
    public Eltcmpratique2sansnoms findEltcmpratique2sansnomsD1GroupeDexamensD1SessionD1Souscentre(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected);
    public List<Eltcmpratique2sansnoms> findAllEltcmpratique2sansnomsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //eltjurypratique2
    public List<Eltjurypratique2> findAllEltjurypratique2();
    public Eltjurypratique2 creerEltjurypratique2(Eltjurypratique2 eltjurypratique2);
    public Eltjurypratique2 modifierEltjurypratique2(Eltjurypratique2 eltjurypratique2);
    public void supprimerEltjurypratique2(Eltjurypratique2 eltjurypratique2);
    public Eltjurypratique2 findEltjurypratique2ById(int id);
    public Eltjurypratique2 findEltjurypratique2D1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Eltjurypratique2> findAllEltjurypratique2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //jurypratique2
    public List<Jurypratique2> findAllJurypratique2();
    public Jurypratique2 creerJurypratique2(Jurypratique2 jurypratique2);
    public Jurypratique2 modifierJurypratique2(Jurypratique2 jurypratique2);
    public void supprimerJurypratique2(Jurypratique2 jurypratique2);
    public Jurypratique2 findJurypratique2ById(int id);
    public Jurypratique2 findJurypratique2D1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected);
    public List<Jurypratique2> findAllJuryspratique2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //jurydel
    public List<Jurydeladmiss> findAllJurydeladmiss();
    public Jurydeladmiss creerJurydeladmiss(Jurydeladmiss jurydeladmiss);
    public Jurydeladmiss modifierJurydeladmiss(Jurydeladmiss jurydeladmiss);
    public void supprimerJurydeladmiss(Jurydeladmiss jurydeladmiss);
    public Jurydeladmiss findJurydeladmissById(int id);
    public List<Jurydeladmiss> findAllJurydeladmissD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public Jurydeladmiss findJurydeladmissD1SousfamilleD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);

    //Epreuve
    public List<Epreuve> findAllEpreuves();
    public Epreuve creerEpreuve(Epreuve epreuve);
    public Epreuve modifierEpreuve(Epreuve epreuve);
    public void supprimerEpreuve(Epreuve epreuve);
    public Epreuve findEpreuveById(int id);
    public List<Epreuve> findAllEpreuvesLikeTitre(String titre);
    public List<Epreuve> findAllEpreuvefacs();
     public List<Epreuve> findAllEpreuvesD1Caractere(String caractereSelected);
    
    //Eltetatmoepreuvefac
    public List<Eltetatmoepreuvefac> findAllEltetatmoepreuvefacs();
    public Eltetatmoepreuvefac creerEltetatmoepreuvefac(Eltetatmoepreuvefac eltetatmoepreuvefac);
    public Eltetatmoepreuvefac modifierEltetatmoepreuvefac(Eltetatmoepreuvefac eltetatmoepreuvefac);
    public void supprimerEltetatmoepreuvefac(Eltetatmoepreuvefac eltetatmoepreuvefac);
    public Eltetatmoepreuvefac findEltetatmoepreuvefacById(int id);
    public Eltetatmoepreuvefac findEltetatmoepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleEpreuvefacSelected);
    public List<Eltetatmoepreuvefac> findAllEltetatmoepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Mopratiquesti
    public List<Mopratiquesti> findAllMopratiquestis();
    public Mopratiquesti creerMopratiquesti(Mopratiquesti mopratiquesti);
    public Mopratiquesti modifierMopratiquesti(Mopratiquesti mopratiquesti);
    public void supprimerMopratiquesti(Mopratiquesti mopratiquesti);
    public Mopratiquesti findMopratiquestiById(int id);
    public List<Mopratiquesti> findAllMopratiquestisD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected,int numprat);
    public Mopratiquesti findMopratiquestiD1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected,int numprat);

    //Matoeuvresf
    public List<Matoeuvresf> findAllMatoeuvresfs();
    public Matoeuvresf creerMatoeuvresf(Matoeuvresf matoeuvresf);
    public Matoeuvresf modifierMatoeuvresf(Matoeuvresf matoeuvresf);
    public void supprimerMatoeuvresf(Matoeuvresf matoeuvresf);
    public Matoeuvresf findMatoeuvresfById(int id);
    public Matoeuvresf findMatoeuvresfD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Matoeuvresf> findAllMatoeuvresfsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Nbadmissibles
    public List<Nbadmissibles> findAllNbadmissibles();
    public Nbadmissibles creerNbadmissibles(Nbadmissibles nbadmissibles);
    public Nbadmissibles modifierNbadmissibles(Nbadmissibles nbadmissibles);
    public void supprimerNbadmissibles(Nbadmissibles nbadmissibles);
    public Nbadmissibles findNbadmissiblesById(int id);
    public Nbadmissibles findNbadmissiblesD1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected);
    public List<Nbadmissibles> findAllNbadmissiblesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Matiere
    public List<Matiere> findAllMatieres();
    public Matiere creerMatiere(Matiere matiere);
    public Matiere modifierMatiere(Matiere matiere);
    public void supprimerMatiere(Matiere matiere);
    public Matiere findMatiereById(int id);
    public List<Matiere> findAllMatieresLikeNom(String nom);
    public List<Matiere> findAllMatieresD1Famille(String titreFamilleSelected);
    public Matiere findMatiereByName(String nomMat);
    
    //Deplacecorrect
    public List<Deplacecorrect> findAllDeplacecorrects();
    public Deplacecorrect creerDeplacecorrect(Deplacecorrect deplacecorrect);
    public Deplacecorrect modifierDeplacecorrect(Deplacecorrect deplacecorrect);
    public void supprimerDeplacecorrect(Deplacecorrect deplacecorrect);
    public Deplacecorrect findDeplacecorrectById(int id);
    public List<Deplacecorrect> findAllDeplacecorrectsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public List<Deplacecorrect> findAllDeplacecorrectsProfessionnelsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public List<Deplacecorrect> findAllDeplacecorrectsNonProfessionnelsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //Dureepratique
    public List<Dureepratique> findAllDureepratique();
    public Dureepratique creerDureepratique(Dureepratique dureepratique);
    public Dureepratique modifierDureepratique(Dureepratique dureepratique);
    public void supprimerDureepratique(Dureepratique dureepratique);
    public Dureepratique findDureepratiqueById(int id);
    public List<Dureepratique> findAllDureepratiqueD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected,int numprat);
    public Dureepratique findDureepratiqueD1SouscentreD1GroupeDexamensD1SessionD1SpecialiteEt1Pratique(String nomSouscentre,int anneeSelected, String niveauSelected, String typeSelected, String sigleSpecialiteDureeSelected, int numprat);
    
    //Deplacepratique
    public List<Deplacepratique> findAllDeplacepratique();
    public Deplacepratique creerDeplacepratique(Deplacepratique deplacepratique);
    public Deplacepratique modifierDeplacepratique(Deplacepratique deplacepratique);
    public void supprimerDeplacepratique(Deplacepratique deplacepratique);
    public Deplacepratique findDeplacepratiqueById(int id);
    public List<Deplacepratique> findAllDeplacepratiquesD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected,int numprat);
    public List<Deplacepratique> findAllDeplacepratiquesProfessionnelsD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected, int i);
    public List<Deplacepratique> findAllDeplacepratiquesNonProfessionnelsD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected, int numprat);
    
    //Mopratiquee
    public List<Mopratiquee> findAllMopratiquee();
    public Mopratiquee creerMopratiquee(Mopratiquee mopratiquee);
    public Mopratiquee modifierMopratiquee(Mopratiquee mopratiquee);
    public void supprimerMopratiquee(Mopratiquee mopratiquee);
    public Mopratiquee findMopratiqueeById(int id);
    public Mopratiquee findMopratiqueeD1SouscentreD1SouscentrepratD1GroupedexamensD1Session(String nomSouscentreSelected, String nomSouscentrepratSelected, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Mopratiquee> findAllMopratiqueeD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Fmissprimchefcentre
    public List<Fmissprimchefcentre> findAllFmissprimchefcentre();
    public Fmissprimchefcentre creerFmissprimchefcentre(Fmissprimchefcentre fmissprimchefcentre);
    public Fmissprimchefcentre modifierFmissprimchefcentre(Fmissprimchefcentre fmissprimchefcentre);
    public void supprimerFmissprimchefcentre(Fmissprimchefcentre fmissprimchefcentre);
    public Fmissprimchefcentre findFmissprimchefcentreById(int id);
    public List<Fmissprimchefcentre> findAllFmissprimchefcentresD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected); 
    
    //Inscritsprives
    public List<Inscritsprives> findAllInscritsprives();
    public Inscritsprives creerInscritsprives(Inscritsprives inscritsprives);
    public Inscritsprives modifierInscritsprives(Inscritsprives inscritsprives);
    public void supprimerInscritsprives(Inscritsprives inscritsprives);
    public Inscritsprives findInscritsprivesById(int id);
    public Inscritsprives findInscritsprivesD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, String niveauSelected, String typeSelected, int anneeSelected);
    public List<Inscritsprives> findAllInscritsprivesD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Eltcorrecttech
    public List<Eltcorrecttech> findAllEltcorrecttech();
    public Eltcorrecttech creerEltcorrecttech(Eltcorrecttech eltcorrecttech);
    public Eltcorrecttech modifierEltcorrecttech(Eltcorrecttech eltcorrecttech);
    public void supprimerEltcorrecttech(Eltcorrecttech eltcorrecttech);
    public Eltcorrecttech findEltcorrecttechById(int id);
    public Eltcorrecttech findEltcorrecttechD1NatureD1SousfamilleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected, String natureSelected);
    public List<Eltcorrecttech> findAllEltcorrecttechsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //Ponderations
    public List<Ponderation> findAllPonderation();
    public Ponderation creerPonderation(Ponderation ponderation);
    public Ponderation modifierPonderation(Ponderation ponderation);
    public void supprimerPonderation(Ponderation ponderation);
    public Ponderation findPonderationById(int id);
    public Ponderation findPonderationD1GroupedexamensD1NatureEtD1Sousfamille(String typeSelected, String niveauSelected, String natureSelected, String sousfamilleSelected);
    public List<Ponderation> findAllPonderationsD1Groupedexamens(String niveauSelected, String typeSelected);
    
    //Eltpratiqueti
    public List<Eltpratiqueti> findAllEltpratiqueti();
    public Eltpratiqueti creerEltpratiqueti(Eltpratiqueti eltpratiqueti);
    public Eltpratiqueti modifierEltpratiqueti(Eltpratiqueti eltpratiqueti);
    public void supprimerEltpratiqueti(Eltpratiqueti eltpratiqueti);
    public Eltpratiqueti findEltpratiquetiById(int id);
    public List<Eltpratiqueti> findAllEltpratiquetiD1Session(int anneeSelected);
    public Eltpratiqueti findEltpratiquetiD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected);

   //Eltpratiquestt
    public List<Eltpratiquestt> findAllEltpratiquestt();
    public Eltpratiquestt creerEltpratiquestt(Eltpratiquestt eltpratiquestt);
    public Eltpratiquestt modifierEltpratiquestt(Eltpratiquestt eltpratiquestt);
    public void supprimerEltpratiquestt(Eltpratiquestt eltpratiquestt);
    public Eltpratiquestt findEltpratiquesttById(int id);
    public List<Eltpratiquestt> findAllEltpratiquesttD1Session(int anneeSelected);
    public Eltpratiquestt findEltpratiquesttD1SouscentreD1OptionD1Session(String nomSouscentreSelected, String sigleOptionSelected, int anneeSelected);
    public List<Eltpratiquestt> findAllEltpratiquesttD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected);
    
    //Eltpratiquinfo
    public List<Eltpratiquinfo> findAllEltpratiquinfo();
    public Eltpratiquinfo creerEltpratiquinfo(Eltpratiquinfo eltpratiquinfo);
    public Eltpratiquinfo modifierEltpratiquinfo(Eltpratiquinfo eltpratiquinfo);
    public void supprimerEltpratiquinfo(Eltpratiquinfo eltpratiquinfo);
    public Eltpratiquinfo findEltpratiquinfoById(int id);
    public List<Eltpratiquinfo> findAllEltpratiquinfoD1GroupedexamensD1Session(int anneeSelected,String niveauSelected,String typeSelected);
    public Eltpratiquinfo findEltpratiquinfoD1GroupedexamensD1SouscentreD1Session(String niveauSelected, String typeSelected,String nomSouscentreSelected, int anneeSelected);

    //Eltpratique1ind
    public List<Eltpratique1ind> findAllEltpratique1ind();
    public Eltpratique1ind creerEltpratique1ind(Eltpratique1ind eltpratique1ind);
    public Eltpratique1ind modifierEltpratique1ind(Eltpratique1ind eltpratique1ind);
    public void supprimerEltpratique1ind(Eltpratique1ind eltpratique1ind);
    public Eltpratique1ind findEltpratique1indById(int id);
    public List<Eltpratique1ind> findAllEltpratique1indD1Session(int anneeSelected);
    public Eltpratique1ind findEltpratique1indD1SouscentreD1OptionD1Session(String nomSouscentreSelected, String sigleOptionSelected, int anneeSelected);
    public List<Eltpratique1ind> findAllEltpratique1indD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected);

    //Elttranscriptepreuve
    public List<Elttranscriptepreuve> findAllElttranscriptepreuve();
    public Elttranscriptepreuve creerElttranscriptepreuve(Elttranscriptepreuve elttranscriptepreuve);
    public Elttranscriptepreuve modifierElttranscriptepreuve(Elttranscriptepreuve elttranscriptepreuve);
    public void supprimerElttranscriptepreuve(Elttranscriptepreuve elttranscriptepreuve);
    public Elttranscriptepreuve findElttranscriptepreuveById(int id);
    
    //Eltvacpratepreuvefac
    public List<Eltvacpratepreuvefac> findAllEltvacpratepreuvefac();
    public Eltvacpratepreuvefac creerEltvacpratepreuvefac(Eltvacpratepreuvefac eltvacpratepreuvefac);
    public Eltvacpratepreuvefac modifierEltvacpratepreuvefac(Eltvacpratepreuvefac eltvacpratepreuvefac);
    public void supprimerEltvacpratepreuvefac(Eltvacpratepreuvefac eltvacpratepreuvefac);
    public Eltvacpratepreuvefac findEltvacpratepreuvefacById(int id);
    public List<Eltvacpratepreuvefac> findAllEltvacpratepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public Eltvacpratepreuvefac findEltvacpratepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleEpreuvefacSelected);
    
    //Rattachventilationspeciale
    public List<Rattachventilationspeciale> findAllRattachventilationspeciale();
    public Rattachventilationspeciale creerRattachventilationspeciale(Rattachventilationspeciale rattachventilationspeciale);
    public Rattachventilationspeciale modifierRattachventilationspeciale(Rattachventilationspeciale rattachventilationspeciale);
    public void supprimerRattachventilationspeciale(Rattachventilationspeciale rattachventilationspeciale);
    public Rattachventilationspeciale findRattachventilationspecialeById(int id);
    public Rattachventilationspeciale findRattachventilationspecialeD1Centreventilationspeciale(String abreviation);
    public List<Rattachventilationspeciale> findAllRattachventilationspeciauxD1CentreTri(String abreviation);
    public List<Elttranscriptepreuve> findAllElttranscriptepreuveD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Elttranscriptcopie
    public List<Elttranscriptcopie> findAllElttranscriptcopie();
    public Elttranscriptcopie creerElttranscriptcopie(Elttranscriptcopie elttranscriptcopie);
    public Elttranscriptcopie modifierElttranscriptcopie(Elttranscriptcopie elttranscriptcopie);
    public void supprimerElttranscriptcopie(Elttranscriptcopie elttranscriptcopie);
    public Elttranscriptcopie findElttranscriptcopieById(int id);
    public List<Elttranscriptcopie> findAllElttranscriptcopieD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Nbentetes
    public List<Nbentetes> findAllNbentetes();
    public Nbentetes creerNbentetes(Nbentetes nbentetes);
    public Nbentetes modifierNbentetes(Nbentetes nbentetes);
    public void supprimerNbentetes(Nbentetes nbentetes);
    public Nbentetes findNbentetesById(int id);
    public List<Nbentetes> findAllNbentetesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public Nbentetes findNbentetesD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected);
    
    //Nbinaptes
    public List<Nbinaptes> findAllNbinaptes();
    public Nbinaptes creerNbinaptes(Nbinaptes nb);
    public Nbinaptes modifierNbinaptes(Nbinaptes nb);
    public void supprimerNbinaptes(Nbinaptes nb);
    public Nbinaptes findNbinaptesById(int id);
    public Nbinaptes findNbinaptesD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Nbinaptes> findAllNbinaptesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Nblivrets
    public List<Nblivrets> findAllNblivrets();
    public Nblivrets creerNblivrets(Nblivrets nb);
    public Nblivrets modifierNblivrets(Nblivrets nb);
    public void supprimerNblivrets(Nblivrets nb);
    public Nblivrets findNblivretsById(int id);
    public List<Nblivrets> findAllNblivretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public Nblivrets findNblivretsD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected);
    
    //Nbnotesprat2
    public List<Nbnotesprat2> findAllNbnotesprat2();
    public Nbnotesprat2 creerNbnotesprat2(Nbnotesprat2 nb);
    public Nbnotesprat2 modifierNbnotesprat2(Nbnotesprat2 nb);
    public void supprimerNbnotesprat2(Nbnotesprat2 nb);
    public Nbnotesprat2 findNbnotesprat2ById(int id);
    public List<Nbnotesprat2> findAllNbnotesprat2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public Nbnotesprat2 findNbnotesprat2D1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected);

    //Eltcomeval
    public List<Eltcomeval> findAllEltcomeval();
    public Eltcomeval creerEltcomeval(Eltcomeval eltcomeval);
    public Eltcomeval modifierEltcomeval(Eltcomeval eltcomeval);
    public void supprimerEltcomeval(Eltcomeval eltcomeval);
    public Eltcomeval findEltcomevalById(int id);
    public List<Eltcomeval> findAllEltcomevalD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Nbcandlibresg
    public List<Nbcandlibresg> findAllNbcandlibresg();
    public Nbcandlibresg creerNbcandlibresg(Nbcandlibresg nbcand);
    public Nbcandlibresg modifierNbcandlibresg(Nbcandlibresg nbcand);
    public void supprimerNbcandlibresg(Nbcandlibresg nbcand);
    public Nbcandlibresg findNbcandlibresgById(int id);
    public List<Nbcandlibresg> findAllNbcandlibresgD1Session(int anneeSelected);
    public Nbcandlibresg findNbcandlibresgD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected);
    
    //Nbcandlibrestp
    public List<Nbcandlibrestp> findAllNbcandlibrestp();
    public Nbcandlibrestp creerNbcandlibrestp(Nbcandlibrestp nbcand);
    public Nbcandlibrestp modifierNbcandlibrestp(Nbcandlibrestp nbcand);
    public void supprimerNbcandlibrestp(Nbcandlibrestp nbcand);
    public Nbcandlibrestp findNbcandlibrestpById(int id);
    public List<Nbcandlibrestp> findAllNbcandlibrestpD1Session(int anneeSelected);
    public Nbcandlibrestp findNbcandlibrestpD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected);

    //Eltharmo
    public List<Eltharmo> findAllEltharmo();
    public Eltharmo creerEltharmo(Eltharmo eltharmo);
    public Eltharmo modifierEltharmo(Eltharmo eltharmo);
    public void supprimerEltharmo(Eltharmo eltharmo);
    public Eltharmo findEltharmoById(int id);
    public List<Eltharmo> findAllEltharmoD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);   
    
    //Eltcoordo
    public List<Eltcoordo> findAllEltcoordo();
    public Eltcoordo creerEltcoordo(Eltcoordo eltcoordo);
    public Eltcoordo modifierEltcoordo(Eltcoordo eltcoordo);
    public void supprimerEltcoordo(Eltcoordo eltcoordo);
    public Eltcoordo findEltcoordoById(int id);
    public List<Eltcoordo> findAllEltcoordoD1Session(int anneeSelected);
    
    //Eltpermanence
    public List<Eltpermanence> findAllEltpermanence();
    public Eltpermanence creerEltpermanence(Eltpermanence eltpermanence);
    public Eltpermanence modifierEltpermanence(Eltpermanence eltpermanence);
    public void supprimerEltpermanence(Eltpermanence eltpermanence);
    public Eltpermanence findEltpermanenceById(int id);
    public List<Eltpermanence> findAllEltpermanenceD1Session(int anneeSelected);
    
    //Statsecretariat
    public List<Statsecretariat> findAllStatsecretariat();
    public Statsecretariat creerStatsecretariat(Statsecretariat statsecretariat);
    public Statsecretariat modifierStatsecretariat(Statsecretariat statsecretariat);
    public void supprimerStatsecretariat(Statsecretariat statsecretariat);
    public Statsecretariat findStatsecretariatById(int id);
    public List<Statsecretariat> findAllStatsecretariatsD1SecretariatD1SouscentreA1ExamenDans1Session(int numsec, int anneeSelected, String nomSouscentreSelected, String sigleExamenSelected);
    public List<Statsecretariat> findAllStatsecretariatsD1SouscentreA1ExamenDans1Session(int anneeSelected, String nomSouscentreSelected, String sigleExamenSelected);
    public List<Statsecretariat> findAllStatsecretariatsD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected);
    public List<Statsecretariat> findAllStatsecretariatsD1SouscentreA1SessionEt1Groupedexamens(String nomsouscent, int anneeSelected, String niveauSelected, String typeSelected);
    public List<Statsecretariat> findAllStatsecretariatsABID1ExamenDans1Session(String sigle, int anneeSelected);
    public List<Statsecretariat> findAllStatsecretariatsAutresLitterairesD1ExamenDans1Session(String sigle, int anneeSelected);
    public List<Statsecretariat> findAllStatsecretariatsScientifiquesD1ExamenDans1Session(String sigle, int anneeSelected);
    
    
     //Intervenantsecret
    public List<Intervenantsecret> findAllIntervenantsecret();
    public Intervenantsecret creerIntervenantsecret(Intervenantsecret intervenantsecret);
    public Intervenantsecret modifierIntervenantsecret(Intervenantsecret intervenantsecret);
    public void supprimerIntervenantsecret(Intervenantsecret intervenantsecret);
    public Intervenantsecret findIntervenantsecretById(int id);
    public List<Intervenantsecret> findAllIntervenantsecretD1GroupedexamensD1SouscentreA1SessionD1ActiviteEt1Qualite(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titreQualiteSelected);
    public List<Intervenantsecret> findAllIntervenantsecretD1GroupedexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titreQualiteSelected);
    public Intervenantsecret findIntervenantsecretByNomEtPrenomD1GroupeDexamensD1SessionD1SecretariatD1ActiviteEt1Qualite(String nompers, String prenom, int anneeSelected, String nomSouscentreSelected, int numsecSelected, String niveauSelected, String typeSelected, String phase, String titreQualite);
    
    //Nbcandepreuvefac
    public List<Nbcandepreuvefac> findAllNbcandepreuvefac();
    public Nbcandepreuvefac creerNbcandepreuvefac(Nbcandepreuvefac nbcandepreuvefac);
    public Nbcandepreuvefac modifierNbcandepreuvefac(Nbcandepreuvefac nbcandepreuvefac);
    public void supprimerNbcandepreuvefac(Nbcandepreuvefac nbcandepreuvefac);
    public Nbcandepreuvefac findNbcandepreuvefacById(int id);
    public List<Nbcandepreuvefac> findAllNbcandepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public Nbcandepreuvefac findNbcandepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String nomEpreuvefacSelected);      

    //Nbchefsallesecret
    public List<Nbchefsallesecret> findAllNbchefsallesecret();
    public Nbchefsallesecret creerNbchefsallesecret(Nbchefsallesecret nbchefsallesecret);
    public Nbchefsallesecret modifierNbchefsallesecret(Nbchefsallesecret nbchefsallesecret);
    public void supprimerNbchefsallesecret(Nbchefsallesecret nbchefsallesecret);
    public Nbchefsallesecret findNbchefsallesecretById(int id);
    public List<Nbchefsallesecret> findAllNbchefsallesecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    public Nbchefsallesecret findNbchefsalleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected);  
    
    //Jurycorrigesecret
    public List<Jurycorrigesecret> findAllJurycorrigesecret();
    public Jurycorrigesecret creerJurycorrigesecret(Jurycorrigesecret jurycorrigesecret);
    public Jurycorrigesecret modifierJurycorrigesecret(Jurycorrigesecret jurycorrigesecret);
    public void supprimerJurycorrigesecret(Jurycorrigesecret jurycorrigesecret);
    public Jurycorrigesecret findJurycorrigesecretById(int id);    
    public Jurycorrigesecret findJurycorrigesecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);
    public List<Jurycorrigesecret> findAllJurycorrigesecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    //Eltcorrecttechsecret
    public List<Eltcorrecttechsecret> findAllEltcorrecttechsecret();
    public Eltcorrecttechsecret creerEltcorrecttechsecret(Eltcorrecttechsecret eltcorrecttechsecret);
    public Eltcorrecttechsecret modifierEltcorrecttechsecret(Eltcorrecttechsecret eltcorrecttechsecret);
    public void supprimerEltcorrecttechsecret(Eltcorrecttechsecret eltcorrecttechsecret);
    public Eltcorrecttechsecret findEltcorrecttechsecretById(int id);
    public Eltcorrecttechsecret findEltcorrecttechsecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);
    public List<Eltcorrecttechsecret> findAllEltcorrecttechsecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
   
    //Eltjuryano
    public List<Eltjuryano> findAllEltjuryano();
    public Eltjuryano creerEltjuryano(Eltjuryano eltjuryano);
    public Eltjuryano modifierEltjuryano(Eltjuryano eltjuryano);
    public void supprimerEltjuryano(Eltjuryano eltjuryano);
    public Eltjuryano findEltjuryanoById(int id);
    public List<Eltjuryano> findAllEltjuryanoD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //Nbcartons
    public List<Nbcartons> findAllNbcartons();
    public Nbcartons creerNbcartons(Nbcartons nbcartons);
    public Nbcartons modifierNbcartons(Nbcartons nbcartons);
    public void supprimerNbcartons(Nbcartons nbcartons);
    public Nbcartons findNbcartonsById(int id);
    public Nbcartons findNbcartonsD1SouscentreD1GroupedexamensDans1SessionD1Numprat(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, int numprat);
    public List<Nbcartons> findAllNbcartonsD1GroupedexamensDans1SessionD1Numprat(int anneeSelected, String niveauSelected, String typeSelected, int numprat);

    //Combine
    public List<Combine> findAllCombines();
    public Combine creerCombine(Combine combine);
    public Combine modifierCombine(Combine combine);
    public void supprimerCombine(Combine combine);
    public Combine findCombineById(int id);
    public List<Combine> findAllCombinesD1EpreuveD1GroupedexamensDans1SessionD1Numprat(String titreEpreuveSelected, int anneeSelected, String niveauSelected, String typeSelected, int numprat);

    //Combinetout
    public List<Combinetout> findAllCombinetouts();
    public Combinetout creerCombinetout(Combinetout combinetout);
    public Combinetout modifierCombinetout(Combinetout combinetout);
    public void supprimerCombinetout(Combinetout combinetout);
    public Combinetout findCombinetoutById(int id);
    public Combinetout findCombinetoutD1EpreuveD1GroupedexamensDans1SessionD1Numprat(String titreEpreuveSelected, int anneeSelected, String niveauSelected, String typeSelected, int numprat);

    //Specialisationsec
    public List<Specialisationsec> findAllSpecialisationsecs();
    public Specialisationsec creerSpecialisationsec(Specialisationsec specialisationsec);
    public Specialisationsec modifierSpecialisationsec(Specialisationsec specialisationsec);
    public void supprimerSpecialisationsec(Specialisationsec specialisationsec);
    public Specialisationsec findSpecialisationsecById(int id);
    public List<Specialisationsec> findAllSpecialisationsecD1Secretariat(int numsec, int annee, String nomsouscent, String abreviation);
    public List<Specialisationsec> findAllSpecialisationsecD1SecretariatEtExamen(int numsec, int anneeSelected, String nomSouscentreSelected, String abreviation, String sigleExamenSelected);
    public List<Specialisationsec> findAllSpecialisationsecD1SecretariatD1GroupedexamenD1session(int numsecSelected, int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected);
    
    
    //Eltcmpratique2secret
    public List<Eltcmpratique2secret> findAllEltcmpratique2secrets();
    public Eltcmpratique2secret creerEltcmpratique2secret(Eltcmpratique2secret eltcmpratique2secret);
    public Eltcmpratique2secret modifierEltcmpratique2secret(Eltcmpratique2secret eltcmpratique2secret);
    public void supprimerEltcmpratique2secret(Eltcmpratique2secret eltcmpratique2secret);
    public Eltcmpratique2secret findEltcmpratique2secretById(int id);
    public List<Eltcmpratique2secret> findAllEltcmpratique2secretD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //Eltcmpratique2sansnomsecret
    public List<Eltcmpratique2sansnomsecret> findAllEltcmpratique2sansnomsecrets();
    public Eltcmpratique2sansnomsecret creerEltcmpratique2sansnomsecret(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret);
    public Eltcmpratique2sansnomsecret modifierEltcmpratique2sansnomsecret(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret);
    public void supprimerEltcmpratique2sansnomsecret(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret);
    public Eltcmpratique2sansnomsecret findEltcmpratique2sansnomsecretById(int id);
    public List<Eltcmpratique2sansnomsecret> findAllEltcmpratique2sansnomsecretD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
    
    //Eltpratiquesttsecret
    public List<Eltpratiquesttsecret> findAllEltpratiquesttsecret();
    public Eltpratiquesttsecret creerEltpratiquesttsecret(Eltpratiquesttsecret eltpratiquesttsecret);
    public Eltpratiquesttsecret modifierEltcmpratique2sansnomsecret(Eltpratiquesttsecret eltpratiquesttsecret);
    public void supprimerEltpratiquesttsecret(Eltpratiquesttsecret eltpratiquesttsecret);
    public Eltpratiquesttsecret findEltpratiquesttsecretById(int id);
    public Eltpratiquesttsecret findEltpratiquesttsecretD1SecretariatD1OptionD1Session(String nomSouscentreSelected, int numsec, String sigleOptionSelected, int anneeSelected);
    public List<Eltpratiquesttsecret> findAllEltpratiquesttsecretD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected);
   
}
