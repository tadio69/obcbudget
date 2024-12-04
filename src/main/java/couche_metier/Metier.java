package couche_metier;

import couche_dao.IActivite;
import couche_dao.IArrondissement;
import couche_dao.IBureau;
import couche_dao.ICaisse;
import couche_dao.ICaissesport;
import couche_dao.ICategorie;
import couche_dao.ICentre;
import couche_dao.ICentrebilletage;
import couche_dao.ICentredispatching;
import couche_dao.IDepartement;
import couche_dao.IDeplacecorrect;
import couche_dao.IDeplacepratique;
import couche_dao.IElementsurvdeficient;
import couche_dao.IEltacmtemoin;
import couche_dao.IEltcmpratique2;
import couche_dao.IEltcmpratique2sansnoms;
import couche_dao.IEltetatmoepreuvefac;
import couche_dao.IEltjurypratique2;
import couche_dao.IEtablissement;
import couche_dao.IExamen;
import couche_dao.IFamille;
import couche_dao.IFmissprimchefcentre;
import couche_dao.IFonction;
import couche_dao.IGrandcentre;
import couche_dao.IGroupe;
import couche_dao.IGroupedexamen;
import couche_dao.IIntervenant;
import couche_dao.IIntervjuryti;
import couche_dao.IIntervsec;
import couche_dao.IJurycorrige;
import couche_dao.IJurydel;
import couche_dao.IJurydeladmiss;
import couche_dao.IJurypratique2;
import couche_dao.IJurytemoin;
import couche_dao.IMatiere;
import couche_dao.IMatoeuvresf;
import couche_dao.IMopratiquee;
import couche_dao.INature;
import couche_dao.INaturesecretariat;
import couche_dao.INbchefsalle;
import couche_dao.INbcopiesdelib;
import couche_dao.INbcopiesdispatchees;
import couche_dao.INbepreuveprof;
import couche_dao.IOption;
import couche_dao.IOptiond1sousfamille;
import couche_dao.IPersonnel;
import couche_dao.IQualite;
import couche_dao.IRattachcentre;
import couche_dao.IRattachdispatching;
import couche_dao.IRattachetab;
import couche_dao.IRattachregroupement;
import couche_dao.IRattachscentre;
import couche_dao.IRattachventilation;
import couche_dao.IRegion;
import couche_dao.IRubriquedegroupe;
import couche_dao.IRubriquetat;
import couche_dao.IScentaplus;
import couche_dao.ISecretariat;
import couche_dao.ISecteurcouv;
import couche_dao.ISession;
import couche_dao.ISouscentre;
import couche_dao.ISousfamille;
import couche_dao.ISpecialisation;
import couche_dao.IStataptes;
import couche_dao.IStatistique;
import couche_dao.IUtilisateur;
import couche_jpa.Activite;
import couche_jpa.Arrondissement;
import couche_jpa.Bureau;
import couche_jpa.Caisse;
import couche_jpa.Caissesport;
import couche_jpa.Categorie;
import couche_jpa.Centre;
import couche_jpa.Centrebilletage;
import couche_jpa.Centredispatching;
import couche_jpa.Departement;
import couche_jpa.Elementsurvdeficient;
import couche_jpa.Eltacmtemoin;
import couche_jpa.Eltcmpratique2;
import couche_jpa.Eltcmpratique2sansnoms;
import couche_jpa.Eltetatmoepreuvefac;
import couche_jpa.Eltjurypratique2;
import couche_jpa.Etablissement;
import couche_jpa.Examen;
import couche_jpa.Famille;
import couche_jpa.Fonction;
import couche_jpa.Grandcentre;
import couche_jpa.Groupe;
import couche_jpa.Groupedexamen;
import couche_jpa.Intervenant;
import couche_jpa.Intervjuryti;
import couche_jpa.Intervsec;
import couche_jpa.Jurycorrige;
import couche_jpa.Jurydel;
import couche_jpa.Jurydeladmiss;
import couche_jpa.Jurypratique2;
import couche_jpa.Jurytemoin;
import couche_jpa.Matoeuvresf;
import couche_jpa.Mopratiquesti;
import couche_jpa.Nature;
import couche_jpa.Naturesecretariat;
import couche_jpa.Nbchefsalle;
import couche_jpa.Nbcopiesdelib;
import couche_jpa.Nbcopiesdispatchees;
import couche_jpa.Nbepreuveprof;
import couche_jpa.Option;
import couche_jpa.Optiond1sousfamille;
import couche_jpa.Personnel;
import couche_jpa.Qualite;
import couche_jpa.Rattachcentre;
import couche_jpa.Rattachdispatching;
import couche_jpa.Rattachetab;
import couche_jpa.Rattachregroupement;
import couche_jpa.Rattachscentre;
import couche_jpa.Rattachventilation;
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
import couche_jpa.Stataptes;
import couche_jpa.Statistique;
import couche_jpa.Utilisateur;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import couche_dao.IMopratiquesti;
import couche_dao.INbadmissibles;
import couche_jpa.Deplacecorrect;
import couche_jpa.Deplacepratique;
import couche_jpa.Dureepratique;
import couche_jpa.Fmissprimchefcentre;
import couche_jpa.Matiere;
import couche_jpa.Mopratiquee;
import couche_jpa.Nbadmissibles;
import couche_dao.IDureepratique;
import couche_dao.IEltcomeval;
import couche_dao.IEltcoordo;
import couche_dao.IEltcorrecttech;
import couche_dao.IEltcorrecttechsecret;
import couche_dao.IEltharmo;
import couche_dao.IEltjuryano;
import couche_dao.IEltpermanence;
import couche_dao.IEltpratique1ind;
import couche_dao.IEltpratiquestt;
import couche_dao.IEltpratiqueti;
import couche_dao.IEltpratiquinfo;
import couche_dao.IElttranscriptcopie;
import couche_dao.IElttranscriptepreuve;
import couche_dao.IEltvacpratepreuvefac;
import couche_dao.IInscritsprives;
import couche_dao.INbcandlibresg;
import couche_dao.INbcandlibrestp;
import couche_dao.INbentetes;
import couche_dao.INbinaptes;
import couche_dao.INblivrets;
import couche_dao.INbnotesprat2;
import couche_dao.IPonderation;
import couche_dao.IRattachventilationspeciale;
import couche_jpa.Eltcomeval;
import couche_jpa.Eltcoordo;
import couche_jpa.Eltcorrecttech;
import couche_jpa.Eltharmo;
import couche_jpa.Eltpratique1ind;
import couche_jpa.Eltpratiquestt;
import couche_jpa.Eltpratiqueti;
import couche_jpa.Eltpratiquinfo;
import couche_jpa.Elttranscriptcopie;
import couche_jpa.Elttranscriptepreuve;
import couche_jpa.Eltvacpratepreuvefac;
import couche_jpa.Inscritsprives;
import couche_jpa.Nbcandlibresg;
import couche_jpa.Nbcandlibrestp;
import couche_jpa.Nbentetes;
import couche_jpa.Nbinaptes;
import couche_jpa.Nblivrets;
import couche_jpa.Nbnotesprat2;
import couche_jpa.Ponderation;
import couche_jpa.Rattachventilationspeciale;
import couche_dao.IEpreuve;
import couche_dao.IIntervenantsecret;
import couche_dao.IJurycorrigesecret;
import couche_dao.INbcandepreuvefac;
import couche_dao.INbcartons;
import couche_dao.INbchefsallesecret;
import couche_dao.IStatsecretariat;
import couche_jpa.Combine;
import couche_jpa.Eltcorrecttechsecret;
import couche_jpa.Eltjuryano;
import couche_jpa.Eltpermanence;
import couche_jpa.Epreuve;
import couche_jpa.Intervenantsecret;
import couche_jpa.Jurycorrigesecret;
import couche_jpa.Nbcandepreuvefac;
import couche_jpa.Nbcartons;
import couche_jpa.Nbchefsallesecret;
import couche_jpa.Statsecretariat;
import couche_dao.ICombine;
import couche_dao.ICombinetout;
import couche_dao.IEltcmpratique2sansnomsecret;
import couche_dao.IEltcmpratique2secret;
import couche_dao.IEltpratiquesttsecret;
import couche_dao.ISpecialisationsec;
import couche_jpa.Combinetout;
import couche_jpa.Eltcmpratique2sansnomsecret;
import couche_jpa.Eltcmpratique2secret;
import couche_jpa.Eltpratiquesttsecret;
import couche_jpa.Specialisationsec;

@Transactional
public class Metier implements IMetier {

    // références sur la couche [DAO]
    private ICaisse caisseDao = null;
    private ICaissesport caissesportDao = null;
    private ICentre centreDao = null;
    private IDepartement departementDao = null;
    private IArrondissement arrondissementDao = null;
    private IEtablissement etablissementDao = null;
    private IExamen examenDao = null;
    private INature natureDao = null;
    private INbepreuveprof nbepreuveprofDao = null;
    private IOption optionDao = null;
    private IPersonnel personnelDao = null;
    private IRegion regionDao = null;
    private IRubriquetat rubriquetatDao = null;
    private ISession sessionDao = null;
    private ISouscentre souscentreDao = null;
    private IStatistique statistiqueDao = null;
    private IUtilisateur utilisateurDao = null;
    private ICategorie categorieDao = null;
    private IFonction fonctionDao = null;
    private IActivite activiteDao = null;
    private ISpecialisation specialisationDao = null;
    private IStataptes stataptesDao = null;
    private IScentaplus scentaplusDao = null;
    private ICentredispatching centredispatchingDao = null;
    private ISecretariat secretariatDao = null;
    private ISecteurcouv secteurcouvDao = null;
    private IBureau bureauDao = null;
    private INaturesecretariat naturesecretariatDao = null;
    private IGroupe groupeDao = null;
    private IGroupedexamen groupedexamenDao = null;
    private IRubriquedegroupe rubriquedegroupeDao = null;
    private IFamille familleDao = null;
    private IRattachdispatching rattachdispatchingDao = null;
    private IGrandcentre grandcentreDao = null;
    private ICentrebilletage centrebilletageDao = null;
    private IRattachetab rattachetabDao = null;
    private IRattachcentre rattachcentreDao = null;
    private IRattachscentre rattachscentreDao = null;
    private IElementsurvdeficient elementsurvdeficientDao = null;
    private IQualite qualiteDao = null;
    private IIntervenant intervenantDao = null;
    private IIntervsec intervsecDao = null;
    private IIntervjuryti intervjurytiDao = null;
    private INbcopiesdelib nbcopiesdelibDao = null;
    private INbcopiesdispatchees nbcopiesdispatcheesDao = null;
    private IRattachregroupement rattachregroupementDao = null;
    private INbchefsalle nbchefsalleDao = null;
    private IJurycorrige jurycorrigeDao = null;
    private ISousfamille sousfamilleDao = null;
    private IOptiond1sousfamille optiond1sousfamilleDao = null;
    private IRattachventilation rattachventilationDao = null;
    private IEltacmtemoin eltacmtemoinDao = null;
    private IJurytemoin jurytemoinDao = null;
    private IJurydel jurydelDao = null;
    private IEltcmpratique2 eltcmpratique2Dao = null;
    private IEltcmpratique2sansnoms eltcmpratique2sansnomsDao = null;
    private IEltjurypratique2 eltjurypratique2Dao = null;
    private IJurypratique2 jurypratique2Dao = null;
    private IJurydeladmiss jurydeladmissDao = null;
    private IEpreuve epreuveDao = null;
    private IEltetatmoepreuvefac eltetatmoepreuvefacDao=null;
    private IMopratiquesti mopratiquestiDao=null;
    private IMatoeuvresf matoeuvresfDao=null;
    private INbadmissibles nbadmissiblesDao=null;
    private IMatiere matiereDao=null;
    private IDeplacecorrect deplacecorrectDao=null;
    private IDeplacepratique deplacepratiqueDao=null;
    private IDureepratique dureepratiqueDao=null;
    private IMopratiquee mopratiqueeDao=null;
    private IFmissprimchefcentre fmissprimchefcentreDao=null;
    private IInscritsprives inscritsprivesDao=null;
    private IEltcorrecttech eltcorrecttechDao=null;
    private IPonderation ponderationDao=null;
    private IEltpratiqueti eltpratiquetiDao=null;
    private IEltpratiquestt eltpratiquesttDao=null;
    private IEltpratiquinfo eltpratiquinfoDao=null;
    private IEltpratique1ind eltpratique1indDao=null;
    private IElttranscriptepreuve elttranscriptepreuveDao=null;
    private IEltvacpratepreuvefac eltvacpratepreuvefacDao=null;
    private IRattachventilationspeciale rattachventilationspecialeDao=null;
    private IElttranscriptcopie elttranscriptcopieDao=null;
    private INbentetes nbentetesDao=null;
    private INbinaptes nbinaptesDao=null;
    private INblivrets nblivretsDao=null;
    private INbnotesprat2 nbnotesprat2Dao=null;
    private IEltcomeval eltcomevalDao=null;
    private INbcandlibrestp nbcandlibrestpDao=null;
    private INbcandlibresg nbcandlibresgDao=null;
    private IEltharmo eltharmoDao=null;
    private IEltcoordo eltcoordoDao=null;
    private IEltpermanence eltpermanenceDao=null;
    private IStatsecretariat statsecretariatDao=null;
    private IIntervenantsecret intervenantsecretDao=null;
    private INbcandepreuvefac nbcandepreuvefacDao=null;
    private INbchefsallesecret nbchefsallesecretDao=null;
    private IJurycorrigesecret jurycorrigesecretDao=null;
    private IEltcorrecttechsecret eltcorrecttechsecretDao=null;
    private IEltjuryano eltjuryanoDao=null;
    private INbcartons nbcartonsDao=null;
    private ICombine combineDao=null;
    private ICombinetout combinetoutDao=null;
    private ISpecialisationsec specialisationsecDao=null;
    private IEltcmpratique2secret eltcmpratique2secretDao=null;
    private IEltcmpratique2sansnomsecret eltcmpratique2sansnomsecretDao = null;
    private IEltpratiquesttsecret eltpratiquesttsecretDao = null;
    
    
    @Override
    public List<Utilisateur> findAllUtilisateurs() {
        return utilisateurDao.findAll();
    }

    @Override
    public Utilisateur creerUtilisateur(Utilisateur user) {
        return utilisateurDao.create(user);
    }

    @Override
    public Utilisateur modifierUtlisateur(Utilisateur user) {
        return utilisateurDao.edit(user);
    }

    @Override
    public void supprimerUtilisateur(Utilisateur user) {
        utilisateurDao.destroy(user);
    }

    @Override
    public List<Region> findAllRegions() {
        return regionDao.findAll();
    }

    @Override
    public Region creerRegion(Region region) {
        return regionDao.create(region);
    }

    @Override
    public Region modifierRegion(Region region) {
        return regionDao.edit(region);
    }

    @Override
    public void supprimerRegion(Region region) {
        regionDao.destroy(region);
    }

    @Override
    public List<Region> findAllRegionsLikeName(String nom) {
        return regionDao.findAllLikeName(nom);
    }

    @Override
    public List<Departement> findAllDepartements() {
        return departementDao.findAll();
    }

    @Override
    public Departement creerDepartement(Departement departement) {
        return departementDao.create(departement);
    }

    @Override
    public Departement modifierDepartement(Departement departement) {
        return departementDao.edit(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departementDao.destroy(departement);
    }

    @Override
    public List<Departement> findAllDepartementsLikeName(String nom) {
        return departementDao.findAllLikeName(nom);
    }

    @Override
    public List<Departement> findAllDepartementsD1Region(String nom) {
        return departementDao.findDepartementsD1Region(nom);
    }

    @Override
    public List<Arrondissement> findAllArrondissements() {
        return arrondissementDao.findAll();
    }

    @Override
    public Arrondissement creerArrondissement(Arrondissement arrondissement) {
        return arrondissementDao.create(arrondissement);
    }

    @Override
    public Arrondissement modifierArrondissement(Arrondissement arrondissement) {
        return arrondissementDao.edit(arrondissement);
    }

    @Override
    public void supprimerArrondissement(Arrondissement arrondissement) {
        arrondissementDao.destroy(arrondissement);
    }

    @Override
    public List<Arrondissement> findAllArrondissementsLikeName(String nom) {
        return arrondissementDao.findAllLikeName(nom);
    }

    @Override
    public Arrondissement findArrondissementById(int id) {
        return arrondissementDao.find(id);
    }

    @Override
    public List<Arrondissement> findAllArrondissementsD1Departement(String nom) {
        return arrondissementDao.findArrondissementsD1Departement(nom);
    }

    @Override
    public List<Arrondissement> findAllArrondissementsD1Region(String nomRegion) {
        return arrondissementDao.findArrondissementsD1Region(nomRegion);
    }

    @Override
    public Arrondissement findArrondissementByName(String arrondt) {
        return arrondissementDao.findArrondissementByName(arrondt);
    }

    @Override
    public List<Caisse> findAllCaisses() {
        return caisseDao.findAll();
    }

    @Override
    public List<Caisse> findAllCaissesD1Session(int annee) {
        return caisseDao.findCaissesD1Session(annee);
    }

    @Override
    public List<Caisse> findAllCaissesOrdinairesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int anneeSelected, String niveauSelected, String typeSelected) {
        return caisseDao.findCaissesOrdinairesD1GroupedexamensDans1RubriquetatEt1Session(designation, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Caisse> findAllCaissesAdditivesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int anneeSelected, String niveauSelected, String typeSelected) {
        return caisseDao.findCaissesAdditivesD1GroupedexamensDans1RubriquetatEt1Session(designation, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public Caisse findCaisseOrdinaireD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String designationRubriquetatSelected) {
        return caisseDao.findCaisseOrdinaireD1SouscentreDans1Session1GroupedexamensEt1Rubrique(anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected, designationRubriquetatSelected);
    }

    @Override
    public Caisse findCaisseAdditiveD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String designationRubriquetatSelected) {
        return caisseDao.findCaisseAdditiveD1SouscentreDans1Session1GroupedexamensEt1Rubrique(anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected, designationRubriquetatSelected);
    }

    @Override
    public List<Caissesport> findAllCaissesportD1Session(int anneeSelected) {
        return caissesportDao.findCaissesportD1Session(anneeSelected);
    }

    @Override
    public List<Caissesport> findAllCaissesportsD1SessionPour1Groupedexamens(int annee, String niveau, String type) {
        return caissesportDao.findCaissesportsD1SessionPour1Groupedexamens(annee, niveau, type);
    }

    @Override
    public Caisse creerCaisse(Caisse caisse) {
        return caisseDao.create(caisse);
    }

    @Override
    public Caisse modifierCaisse(Caisse caisse) {
        return caisseDao.edit(caisse);
    }

    @Override
    public void supprimerCaisse(Caisse caisse) {
        caisseDao.destroy(caisse);
    }

    @Override
    public Caisse findCaisseD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int annee, String nomSouscentre, String niveau, String type, String designationRubriquetat) {
        return caisseDao.findCaisseD1SouscentreDans1Session1GroupedexamensEt1Rubrique(annee, nomSouscentre, niveau, type, designationRubriquetat);
    }

    @Override
    public List<Caisse> findAllCaissesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int annee, String niveau, String type) {
        return caisseDao.findCaissesD1GroupedexamensDans1RubriquetatEt1Session(designation, annee, niveau, type);
    }

    @Override
    public List<Centre> findAllCentres() {
        return centreDao.findAll();
    }

    @Override
    public Centre creerCentre(Centre centre) {
        return centreDao.create(centre);
    }

    @Override
    public Centre modifierCentre(Centre centre) {
        return centreDao.edit(centre);
    }

    @Override
    public void supprimerCentre(Centre centre) {
        centreDao.destroy(centre);
    }

    @Override
    public List<Centre> findAllCentresLikeName(String nom) {
        return centreDao.findAllLikeName(nom);
    }

    @Override
    public Centre findCentreByNom(String centreDeliberation) {
        return centreDao.findCentreByNom(centreDeliberation);
    }

    @Override
    public List<Centre> findAllCentresD1Region(String nomRegionSelected) {
        return centreDao.findCentresD1Region(nomRegionSelected);
    }

    @Override
    public List<Centre> findAllCentresD1Departement(String nomDepartement) {
        return centreDao.findCentresD1Departement(nomDepartement);
    }

    @Override
    public List<Centre> findAllCentresD1Arrondissement(String nomArrondissement) {
        return centreDao.findCentresD1Arrondissement(nomArrondissement);
    }

    @Override
    public Centre findCentreByEtablissement(String abreviation) {
        return centreDao.findCentreByEtablissement(abreviation);
    }

    @Override
    public List<Etablissement> findAllEtablissements() {
        return etablissementDao.findAll();
    }

    @Override
    public Etablissement creerEtablissement(Etablissement etablissement) {
        return etablissementDao.create(etablissement);
    }

    @Override
    public Etablissement modifierEtablissement(Etablissement etablissement) {
        return etablissementDao.edit(etablissement);
    }

    @Override
    public void supprimerEtablissement(Etablissement etablissement) {
        etablissementDao.destroy(etablissement);
    }

    @Override
    public List<Etablissement> findAllEtablissementsLikeName(String nom) {
        return etablissementDao.findAllLikeName(nom);
    }

    @Override
    public List<Etablissement> findAllEtablissementsD1Departement(String nom) {
        return etablissementDao.findEtablissementsD1Departement(nom);
    }

    @Override
    public List<Etablissement> findAllEtablissementsD1Arrondissement(String nomArrondissement) {
        return etablissementDao.findEtablissementsD1Arrondissement(nomArrondissement);
    }

    @Override
    public Etablissement findEtablissementByAbreviation(String abreviation) {
        return etablissementDao.findEtablissementByAbreviation(abreviation);
    }

    @Override
    public List<Etablissement> findAllEtablissementsCentreDEpsD1Arrondissement(String nomArrondissement) {
        return etablissementDao.findEtablissementsCentreDEpsD1Arrondissement(nomArrondissement);
    }

    @Override
    public List<Examen> findAllExamens() {
        return examenDao.findAll();
    }

    @Override
    public Examen creerExamen(Examen examen) {
        return examenDao.create(examen);
    }

    @Override
    public Examen modifierExamen(Examen examen) {
        return examenDao.edit(examen);
    }

    @Override
    public void supprimerExamen(Examen examen) {
        examenDao.destroy(examen);
    }

    @Override
    public List<Examen> findAllExamensLikeName(String nom) {
        return examenDao.findAllLikeName(nom);
    }

    @Override
    public List<Examen> findAllExamensD1NiveauEtD1Type(String niveau, String type) {
        return examenDao.findExamensD1NiveauEtD1Type(niveau, type);
    }

    @Override
    public List<Examen> findAllExamensD1Type(String type) {
        return examenDao.findExamensD1Type(type);
    }

    @Override
    public List<Examen> findAllExamensD1Niveau(String niveau) {
        return examenDao.findExamensD1Niveau(niveau);
    }

    @Override
    public List<Examen> findAllExamensIndustiels() {
        return examenDao.findExamensIndustiels();
    }

    @Override
    public List<Examen> findAllExamensStt() {
        return examenDao.findExamensStt();
    }

    @Override
    public List<Examen> findAllExamensEstp() {
        return examenDao.findExamensEstp();
    }

    @Override
    public List<Examen> findAllExamensIndustielsD1Niveau(String niveau) {
        return examenDao.findExamensIndustielsD1Niveau(niveau);
    }

    @Override
    public List<Examen> findAllExamensSttD1Niveau(String niveau) {
        return examenDao.findExamensSttD1Niveau(niveau);
    }

    @Override
    public List<Examen> findAllExamensEstpD1Niveau(String niveau) {
        return examenDao.findExamensEstpD1Niveau(niveau);
    }

    @Override
    public List<Nature> findAllNatures() {
        return natureDao.findAll();
    }

    @Override
    public Nature creerNature(Nature nature) {
        return natureDao.create(nature);
    }

    @Override
    public Nature modifierNature(Nature nature) {
        return natureDao.edit(nature);
    }

    @Override
    public void supprimerNature(Nature nature) {
        natureDao.destroy(nature);
    }

    @Override
    public List<Character> findAllNaturesEnCharD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomEtablissement) {
        return natureDao.findNaturesEnCharD1SouscentrePour1ExamenEtSession(anneeSelected, sigleExamenSelected, nomEtablissement);//nomEtablissement abritant le sous-centre
    }

    @Override
    public List<String> findAllPhasesD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected) {
        return natureDao.findPhasesD1SouscentrePour1ExamenEtSession(anneeSelected, sigleExamenSelected, nomSouscentreSelected);
    }

    @Override
    public List<String> findAllNaturesEnStringD1ExamenEtD1Session(int anneeSelected, String sigleExamenSelected) {
        return natureDao.findNaturesEnStringD1ExamenEtD1Session(anneeSelected, sigleExamenSelected);
    }

    @Override
    public List<Nature> findAllNaturesD1ExamenDans1Session(int anneeSelected, String sigle) {
        return natureDao.findNaturesD1ExamenDans1Session(anneeSelected, sigle);
    }

    @Override
    public void supprimerLesNaturesD1SouscentrePour1SessionD1Examen(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected) {
        natureDao.supprimerLesNaturesD1SouscentrePour1SessionD1Examen(anneeSelected, sigleExamenSelected, nomSouscentreSelected);
    }

    @Override
    public List<String> findAllNaturesD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected) {
        return natureDao.findNaturesD1SouscentreDans1Session(nomSouscentreSelected, anneeSelected);
    }

    @Override
    public List<Nature> findAllNaturesDesCentreD1ExamenDans1Session(int annee, String sigleExamen) {
        return natureDao.findNaturesDesCentreD1ExamenDans1Session(annee, sigleExamen);
    }

    @Override
    public List<Nature> findAllNaturesDesSousCentreD1ExamenDans1Session(int annee, String sigleExamen) {
        return natureDao.findNaturesDesSousCentreD1ExamenDans1Session(annee, sigleExamen);
    }
    
    @Override
    public List<Nature> findAllPhasesD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected) {
        return natureDao.findPhasesD1SouscentreDans1Session(nomSouscentreSelected, anneeSelected);
    }

    @Override
    public List<Nbepreuveprof> findAllNbepreuveprofs() {
        return nbepreuveprofDao.findAll();
    }

    @Override
    public Nbepreuveprof creerNbepreuveprof(Nbepreuveprof nbepreuveprof) {
        return nbepreuveprofDao.create(nbepreuveprof);
    }

    @Override
    public Nbepreuveprof modifierNbepreuveprof(Nbepreuveprof nbepreuveprof) {
        return nbepreuveprofDao.edit(nbepreuveprof);
    }

    @Override
    public void supprimerNbepreuveprof(Nbepreuveprof nbepreuveprof) {
        nbepreuveprofDao.destroy(nbepreuveprof);
    }

    @Override
    public List<Nbepreuveprof> findAllNbepreuveprofsD1Examen(String sigleExamen) {
        return nbepreuveprofDao.findNbepreuveprofsD1Examen(sigleExamen);
    }

    @Override
    public Nbepreuveprof findAllNbepreuveprofsD1ExamenEtD1Option(String sigleExamen, String sigleOption) {
        return nbepreuveprofDao.findNbepreuveprofsD1ExamenEtD1Option(sigleExamen, sigleOption);
    }

    @Override
    public List<Nbepreuveprof> findAllOptionsD1Examen(String sigleExamen) {
        return nbepreuveprofDao.findOptionsD1Examen(sigleExamen);
    }

    @Override
    public List<Option> findAllOptions() {
        return optionDao.findAll();
    }

    @Override
    public Option creerOption(Option option) {
        return optionDao.create(option);
    }

    @Override
    public Option modifierOption(Option option) {
        return optionDao.edit(option);
    }

    @Override
    public void supprimerOption(Option option) {
        optionDao.destroy(option);
    }

    @Override
    public List<Option> findAllOptionsLikeName(String nom) {
        return optionDao.findAllLikeName(nom);
    }

    @Override
    public Option findOptionBySigle(String sigle) {
        return optionDao.findBySigle(sigle);
    }

    @Override
    public List<Option> findAllOptionsDeSigleLikeChaine(String chaine) {
        return optionDao.findOptionsDeSigleLikeChaine(chaine);
    }
    
    @Override
    public List<Option> findAllOptionsD1Famille(String titreFamilleSelected) {
        return optionDao.findAllOptionsD1Famille(titreFamilleSelected) ;
    }

    @Override
    public List<Personnel> findAllPersonnels() {
        return personnelDao.findAll();
    }

    @Override
    public Personnel creerPersonnel(Personnel personnel) {
        return personnelDao.create(personnel);
    }

    @Override
    public Personnel modifierPersonnel(Personnel personnel) {
        return personnelDao.edit(personnel);
    }

    @Override
    public void supprimerPersonnel(Personnel personnel) {
        personnelDao.destroy(personnel);
    }

    @Override
    public List<Personnel> findAllPersonnelsLikeName(String nom) {
        return personnelDao.findAllLikeName(nom);
    }

    @Override
    public Personnel findPersonnelByMatricule(String matricule) {
        return personnelDao.findByMatricule(matricule);
    }

    @Override
    public List<Personnel> findAllPersonnelsD1Departement(String nomDepartement) {
        return personnelDao.findPersonnelsD1Departement(nomDepartement);
    }

    @Override
    public List<Personnel> findAllPersonnelsD1Arrondissement(String nomArrondissement) {
        return personnelDao.findPersonnelsD1Arrondissement(nomArrondissement);
    }

    @Override
    public List<Rubriquetat> findAllRubriquetats() {
        return rubriquetatDao.findAll();
    }

    @Override
    public Rubriquetat creerRubriquetat(Rubriquetat rubriquetat) {
        return rubriquetatDao.create(rubriquetat);
    }

    @Override
    public Rubriquetat modifierRubriquetat(Rubriquetat rubriquetat) {
        return rubriquetatDao.edit(rubriquetat);
    }

    @Override
    public void supprimerRubriquetat(Rubriquetat rubriquetat) {
        rubriquetatDao.destroy(rubriquetat);
    }

    @Override
    public List<Rubriquetat> findAllRubriquetatsLikeName(String nom) {
        return rubriquetatDao.findAllLikeName(nom);
    }

    @Override
    public List<Rubriquetat> findAllRubriquetatsD1Categorie(String titreCategorie) {
        return rubriquetatDao.findRubriquetatsD1Categorie(titreCategorie);
    }

    @Override
    public Rubriquetat findRubriquetatByDesignation(String designation) {
        return rubriquetatDao.findRubriquetatByDesignation(designation);
    }

    @Override
    public List<Session> findAllSessions() {
        return sessionDao.findAll();
    }

    @Override
    public Session creerSession(Session session) {
        return sessionDao.create(session);
    }

    @Override
    public Session modifierSession(Session session) {
        return sessionDao.edit(session);
    }

    @Override
    public void supprimerSession(Session session) {
        sessionDao.destroy(session);
    }

    @Override
    public List<Souscentre> findAllSouscentres() {
        return souscentreDao.findAll();
    }

    @Override
    public Souscentre creerSouscentre(Souscentre souscentre) {
        return souscentreDao.create(souscentre);
    }

    @Override
    public Souscentre modifierSouscentre(Souscentre souscentre) {
        return souscentreDao.edit(souscentre);
    }

    @Override
    public void supprimerSouscentre(Souscentre souscentre) {
        souscentreDao.destroy(souscentre);
    }

    @Override
    public List<Souscentre> findAllSouscentresLikeName(String nom) {
        return souscentreDao.findAllLikeName(nom);
    }

    @Override
    public List<Souscentre> findAllSouscentresD1Departement(String nomDepartement) {
        return souscentreDao.findSouscentresD1Departement(nomDepartement);
    }

    @Override
    public List<Souscentre> findAllSouscentresD1Arrondissement(String nomArrondissement) {
        return souscentreDao.findSouscentresD1Arrondissement(nomArrondissement);
    }

    @Override
    public Souscentre findSouscentreByName(String nom) {
        return souscentreDao.findSouscentreByName(nom);
    }

    @Override
    public Souscentre findSouscentreByEtablissement(String abreviation) {
        return souscentreDao.findSouscentreByEtablissement(abreviation);
    }

    @Override
    public List<Souscentre> findAllSouscentresNoso() {
        return souscentreDao.findSouscentresNoso();
    }

    @Override
    public List<Souscentre> findAllSouscentresArisquesExtNord() {
        return souscentreDao.findSouscentresArisquesExtNord();
    }
    
    @Override
    public List<Souscentre> findAllSouscentresEnclaves() {
        return souscentreDao.findSouscentresEnclaves();
    }
    
    @Override
    public List<Souscentre> findAllSouscentresPrivesD1Arrondissement(String nomArrondissementSouscentreSelected) {
        return souscentreDao.findSouscentresPrivesD1Arrondissement(nomArrondissementSouscentreSelected);
    }

    @Override
    public List<Statistique> findAllStatistiques() {
        return statistiqueDao.findAll();
    }

    @Override
    public Statistique creerStatistique(Statistique statistique) {
        return statistiqueDao.create(statistique);
    }

    @Override
    public Statistique modifierStatistique(Statistique statistique) {
        return statistiqueDao.edit(statistique);
    }

    @Override
    public void supprimerStatistique(Statistique statistique) {
        statistiqueDao.destroy(statistique);
    }

    @Override
    public List<Statistique> findAllStatistiquesD1SouscentreA1ExamenDans1Session(int annee, String nomSouscentre, String sigleExamen) {
        return statistiqueDao.findStatistiquesD1SouscentreA1ExamenDans1Session(annee, nomSouscentre, sigleExamen);
    }

    @Override
    public List<Statistique> findAllStatistiquesD1ExamenDans1Session(String sigle, int anneeSelected) {
        return statistiqueDao.findAllStatistiquesD1ExamenDans1Session(sigle, anneeSelected);
    }

    @Override
    public List<Statistique> findAllStatistiquesD1ExamenDans1Session(int annee, String sigleExamen) {
        return statistiqueDao.findStatistiquesD1ExamenDans1Session(annee, sigleExamen);
    }

    @Override
    public List<Statistique> findAllStatistiquesD1ExamenDans1SessionET1Souscentre(String sigle, int anneeSelected, String nomSouscentreSelected) {
        return statistiqueDao.findStatistiquesD1ExamenDans1SessionET1Souscentre(sigle, anneeSelected, nomSouscentreSelected);
    }

    @Override
    public List<Statistique> findAllStatistiquesD1SouscentreDans1Session(int annee, String nomSouscentre) {
        return statistiqueDao.findStatistiquesD1SouscentreDans1Session(annee, nomSouscentre);
    }

    @Override
    public int findStatistiqueD1SouscentreA1Examen1SessionEt1Option(String nomsouscent, String sigleExamen, int annee, String sigleOption) {
        return statistiqueDao.findStatistiqueD1SouscentreA1Examen1SessionEt1Option(nomsouscent, sigleExamen, annee, sigleOption);
    }

    @Override
    public List<Statistique> findAllStatistiquesABID1ExamenDans1Session(String sigle, int anneeSelected) {
        return statistiqueDao.findStatistiquesABID1ExamenDans1Session(sigle, anneeSelected);
    }

    @Override
    public List<Statistique> findAllStatistiquesTID1ExamenDans1Session(String sigle, int anneeSelected) {
        return statistiqueDao.findStatistiquesTID1ExamenDans1Session(sigle, anneeSelected);
    }
    
    @Override
    public List<Statistique> findAllStatistiquesAutresLitterairesD1ExamenDans1Session(String sigle, int anneeSelected) {
        return statistiqueDao.findStatistiquesAutresLitterairesD1ExamenDans1Session(sigle, anneeSelected);
    }

    @Override
    public List<Statistique> findAllStatistiquesScientifiquesD1ExamenDans1Session(String sigle, int anneeSelected) {
        return statistiqueDao.findStatistiquesScientifiquesD1ExamenDans1Session(sigle, anneeSelected);
    }

    @Override
    public Categorie creerCategorie(Categorie categorie) {
        return categorieDao.create(categorie);
    }

    @Override
    public Categorie modifierCategorie(Categorie categorie) {
        return categorieDao.edit(categorie);
    }

    @Override
    public void supprimerCategorie(Categorie categorie) {
        categorieDao.destroy(categorie);
    }

    @Override
    public Categorie findCategorieById(int id) {
        return categorieDao.find(id);
    }

    @Override
    public List<Categorie> findAllCategories() {
        return categorieDao.findAll();
    }

    @Override
    public List<Categorie> findAllCategoriesLikeTitre(String titre) {
        return categorieDao.findAllLikeTitre(titre);
    }

    public ICaisse getCaisseDao() {
        return caisseDao;
    }

    public void setCaisseDao(ICaisse caisseDao) {
        this.caisseDao = caisseDao;
    }

    public ICentre getCentreDao() {
        return centreDao;
    }

    public ICaissesport getCaissesportDao() {
        return caissesportDao;
    }

    public void setCaissesportDao(ICaissesport caissesportDao) {
        this.caissesportDao = caissesportDao;
    }

    public void setCentreDao(ICentre centreDao) {
        this.centreDao = centreDao;
    }

    public IDepartement getDepartementDao() {
        return departementDao;
    }

    public void setDepartementDao(IDepartement departementDao) {
        this.departementDao = departementDao;
    }

    public IEtablissement getEtablissementDao() {
        return etablissementDao;
    }

    public void setEtablissementDao(IEtablissement etablissementDao) {
        this.etablissementDao = etablissementDao;
    }

    public IExamen getExamenDao() {
        return examenDao;
    }

    public void setExamenDao(IExamen examenDao) {
        this.examenDao = examenDao;
    }

    public INature getNatureDao() {
        return natureDao;
    }

    public void setNatureDao(INature natureDao) {
        this.natureDao = natureDao;
    }

    public INbepreuveprof getNbepreuveprofDao() {
        return nbepreuveprofDao;
    }

    public void setNbepreuveprofDao(INbepreuveprof nbepreuveprofDao) {
        this.nbepreuveprofDao = nbepreuveprofDao;
    }

    public IOption getOptionDao() {
        return optionDao;
    }

    public void setOptionDao(IOption optionDao) {
        this.optionDao = optionDao;
    }

    public IPersonnel getPersonnelDao() {
        return personnelDao;
    }

    public void setPersonnelDao(IPersonnel personnelDao) {
        this.personnelDao = personnelDao;
    }

    public IRegion getRegionDao() {
        return regionDao;
    }

    public void setRegionDao(IRegion regionDao) {
        this.regionDao = regionDao;
    }

    public IRubriquetat getRubriquetatDao() {
        return rubriquetatDao;
    }

    public void setRubriquetatDao(IRubriquetat rubriquetatDao) {
        this.rubriquetatDao = rubriquetatDao;
    }

    public ISession getSessionDao() {
        return sessionDao;
    }

    public void setSessionDao(ISession sessionDao) {
        this.sessionDao = sessionDao;
    }

    public ISouscentre getSouscentreDao() {
        return souscentreDao;
    }

    public void setSouscentreDao(ISouscentre souscentreDao) {
        this.souscentreDao = souscentreDao;
    }

    public IStatistique getStatistiqueDao() {
        return statistiqueDao;
    }

    public void setStatistiqueDao(IStatistique statistiqueDao) {
        this.statistiqueDao = statistiqueDao;
    }

    public IUtilisateur getUtilisateurDao() {
        return utilisateurDao;
    }

    public void setUtilisateurDao(IUtilisateur utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }

    public IArrondissement getArrondissementDao() {
        return arrondissementDao;
    }

    public void setArrondissementDao(IArrondissement arrondissementDao) {
        this.arrondissementDao = arrondissementDao;
    }

    public ICategorie getCategorieDao() {
        return categorieDao;
    }

    public void setCategorieDao(ICategorie categorieDao) {
        this.categorieDao = categorieDao;
    }

    public IFonction getFonctionDao() {
        return fonctionDao;
    }

    public void setFonctionDao(IFonction fonctionDao) {
        this.fonctionDao = fonctionDao;
    }

    public IActivite getActiviteDao() {
        return activiteDao;
    }

    public void setActiviteDao(IActivite activiteDao) {
        this.activiteDao = activiteDao;
    }

    public ISpecialisation getSpecialisationDao() {
        return specialisationDao;
    }

    public void setSpecialisationDao(ISpecialisation specialisationDao) {
        this.specialisationDao = specialisationDao;
    }

    public IStataptes getStataptesDao() {
        return stataptesDao;
    }

    public void setStataptesDao(IStataptes stataptesDao) {
        this.stataptesDao = stataptesDao;
    }

    @Override
    public Utilisateur findUtlisateurById(int id) {
        return utilisateurDao.find(id);
    }

    @Override
    public Region findRegionById(int id) {
        return regionDao.find(id);
    }

    @Override
    public Departement findDepartementById(int id) {
        return departementDao.find(id);
    }

    @Override
    public Caisse findCaisseById(int id) {
        return caisseDao.find(id);
    }

    @Override
    public List<Caissesport> findAllCaissesport() {
        return caissesportDao.findAll();
    }

    @Override
    public Caissesport creerCaissesport(Caissesport caissesport) {
        return caissesportDao.create(caissesport);
    }

    @Override
    public Caissesport modifierCaissesport(Caissesport caissesport) {
        return caissesportDao.edit(caissesport);
    }

    @Override
    public void supprimerCaissesport(Caissesport caissesport) {
        caissesportDao.destroy(caissesport);
    }

    @Override
    public Caissesport findCaissesportById(int id) {
        return caissesportDao.find(id);
    }

    @Override
    public Caissesport findCaissesportD1EtablissementDans1SessionPour1Groupedexamens(int annee, String nomEtablissement, String niveau, String type) {
        return caissesportDao.findCaissesportD1EtablissementDans1SessionPour1Groupedexamens(annee, nomEtablissement, niveau, type);
    }

    @Override
    public Centre findCentreById(int id) {
        return centreDao.find(id);
    }

    @Override
    public Etablissement findEtablissementById(int id) {
        return etablissementDao.find(id);
    }

    @Override
    public Examen findExamenById(int id) {
        return examenDao.find(id);
    }

    @Override
    public Examen findExamenBySigle(String sigle) {
        return examenDao.findExamenBySigle(sigle);
    }

    @Override
    public Nature findNatureById(int id) {
        return natureDao.find(id);
    }

    @Override
    public Nbepreuveprof findNbepreuveprofById(int id) {
        return nbepreuveprofDao.find(id);
    }

    @Override
    public Option findOptionById(int id) {
        return optionDao.find(id);
    }

    @Override
    public Personnel findPersonnelById(int id) {
        return personnelDao.find(id);
    }

    @Override
    public Rubriquetat findRubriquetatById(int id) {
        return rubriquetatDao.find(id);
    }

    @Override
    public Session findSessionById(int id) {
        return sessionDao.find(id);
    }

    @Override
    public Souscentre findSouscentreById(int id) {
        return souscentreDao.find(id);
    }

    @Override
    public Statistique findStatistiqueById(int id) {
        return statistiqueDao.find(id);
    }

    @Override
    public Utilisateur findUtilisateurByLoginAndPwd(String log, String pwd) {
        return utilisateurDao.findByLoginAndPwd(log, pwd);
    }

    @Override
    public Fonction creerFonction(Fonction fonction) {
        return fonctionDao.create(fonction);
    }

    @Override
    public Fonction modifierFonction(Fonction fonction) {
        return fonctionDao.edit(fonction);
    }

    @Override
    public void supprimerFonction(Fonction fonction) {
        fonctionDao.destroy(fonction);
    }

    @Override
    public Fonction findFonctionById(int id) {
        return fonctionDao.find(id);
    }

    @Override
    public List<Fonction> findAllFonctions() {
        return fonctionDao.findAll();
    }

    @Override
    public List<Fonction> findAllFonctionsLikeTitre(String titre) {
        return fonctionDao.findFonctionsLikeTitre(titre);
    }
    
    @Override
    public Fonction findFonctionByTitre(String titrefonct) {
        return fonctionDao.findFonctionByTitre(titrefonct);
    }   

    @Override
    public Activite creerActivite(Activite activite) {
        return activiteDao.create(activite);
    }

    @Override
    public Activite modifierActivite(Activite activite) {
        return activiteDao.edit(activite);
    }

    @Override
    public void supprimerActivite(Activite activite) {
        activiteDao.destroy(activite);
    }

    @Override
    public Activite findActiviteById(int id) {
        return activiteDao.find(id);
    }

    @Override
    public List<Activite> findAllActivites() {
        return activiteDao.findAll();
    }

    @Override
    public List<Activite> findAllActivitesLikeNom(String nom) {
        return activiteDao.findAllLikeNom(nom);
    }

    @Override
    public Activite findActiviteByNom(String nom) {
        return activiteDao.findByNom(nom);
    }

    @Override
    public Specialisation creerSpecialisation(Specialisation specialisation) {
        return specialisationDao.create(specialisation);
    }

    @Override
    public Specialisation modifierSpecialisation(Specialisation specialisation) {
        return specialisationDao.edit(specialisation);
    }

    @Override
    public void supprimerSpecialisation(Specialisation specialisation) {
        specialisationDao.destroy(specialisation);
    }

    @Override
    public Specialisation findSpecialisationById(int id) {
        return specialisationDao.find(id);
    }

    @Override
    public List<Specialisation> findAllSpecialisations() {
        return specialisationDao.findAll();
    }

    @Override
    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1ExamenEtSession(int annee, String sigleExamen, String nomSouscentre) {
        return specialisationDao.findSpecialisationsD1SouscentrePour1ExamenEtSession(annee, sigleExamen, nomSouscentre);

    }

    @Override
    public List<Specialisation> findAllSpecialisationsD1ExamenEtD1Session(int anneeSelected, String sigleExamen) {
        return specialisationDao.findSpecialisationsD1ExamenEtD1Session(anneeSelected, sigleExamen);
    }

    @Override
    public void supprimerLesSpecialisationsD1SouscentrePour1SessionD1Examen(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected) {
        specialisationDao.supprimerLesSpecialisationsD1SouscentrePour1SessionD1Examen(anneeSelected, sigleExamenSelected, nomSouscentreSelected);
    }

    @Override
    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1SessionEtniveau(int anneeSelected, String nomSouscentreSelected, String niveauSelected) {
        return specialisationDao.findAllSpecialisationsD1SouscentrePour1SessionEtniveau(anneeSelected, nomSouscentreSelected, niveauSelected);
    }

     @Override
    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1SessionD1NiveauEtType(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected) {
        return specialisationDao.findAllSpecialisationsD1SouscentrePour1SessionD1NiveauEtType(anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected);
    }
    
    @Override
    public List<Specialisation> findAllSpecialisationsD1SouscentreEtSession(int anneeSelected, String nomSouscentreSelected) {
        return specialisationDao.findSpecialisationsD1SouscentreEtSession(anneeSelected, nomSouscentreSelected);
    }
    
    @Override
    public Stataptes creerStataptes(Stataptes stataptes) {
        return stataptesDao.create(stataptes);
    }

    @Override
    public Stataptes modifierStataptes(Stataptes stataptes) {
        return stataptesDao.edit(stataptes);
    }

    @Override
    public void supprimerStataptes(Stataptes stataptes) {
        stataptesDao.destroy(stataptes);
    }

    @Override
    public Stataptes findStataptesById(int id) {
        return stataptesDao.find(id);
    }

    @Override
    public List<Stataptes> findAllStataptes() {
        return stataptesDao.findAll();
    }

    @Override
    public Stataptes findStataptesD1EtablissementA1ExamenDans1Session(int anneeSelected, String nomEtablissementSelected, String sigleExamenSelected) {
        return stataptesDao.findStataptesD1EtablissementA1ExamenDans1Session(anneeSelected, nomEtablissementSelected, sigleExamenSelected);
    }

    @Override
    public List<Stataptes> findAllStataptesD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected) {
        return stataptesDao.findAllStataptesD1ExamenDans1Session(anneeSelected, sigleExamenSelected);
    }

    @Override
    public Scentaplus creerScentaplus(Scentaplus scentaplus) {
        return scentaplusDao.create(scentaplus);
    }

    @Override
    public Scentaplus modifierScentaplus(Scentaplus scentaplus) {
        return scentaplusDao.edit(scentaplus);
    }

    @Override
    public void supprimerScentaplus(Scentaplus scentaplus) {
        scentaplusDao.destroy(scentaplus);
    }

    @Override
    public Scentaplus findScentaplusById(int id) {
        return scentaplusDao.find(id);
    }

    @Override
    public List<Scentaplus> findAllScentaplus() {
        return scentaplusDao.findAll();
    }

    public IScentaplus getScentaplusDao() {
        return scentaplusDao;
    }

    public void setScentaplusDao(IScentaplus scentaplusDao) {
        this.scentaplusDao = scentaplusDao;
    }

    @Override
    public void supprimerUnScentaplus(int annee, String sigleExamen, String nomSouscentre) {
        scentaplusDao.supprimerUnScentaplus(annee, sigleExamen, nomSouscentre);
    }

    @Override
    public List<Scentaplus> findAllScentaplusD1ExamenEt1Session(int annee, String sigleExamen) {
        return scentaplusDao.findScentaplusD1ExamenEt1Session(annee, sigleExamen);
    }

    @Override
    public List<Scentaplus> findAllScentaplusD1RegionA1ExamenEt1Session(int anneeSelected, String sigleExamenSelected, String nomRegionSelected) {
        return scentaplusDao.findScentaplusD1RegionA1ExamenEt1Session(anneeSelected, sigleExamenSelected, nomRegionSelected);
    }

    @Override
    public Centredispatching creerCentredispatching(Centredispatching centredispatching) {
        return centredispatchingDao.create(centredispatching);
    }

    @Override
    public Centredispatching modifierCentredispatching(Centredispatching centredispatching) {
        return centredispatchingDao.edit(centredispatching);
    }

    @Override
    public void supprimerCentredispatching(Centredispatching centredispatching) {
        centredispatchingDao.destroy(centredispatching);
    }

    @Override
    public Centredispatching findCentredispatchingById(int id) {
        return centredispatchingDao.find(id);
    }

    @Override
    public List<Centredispatching> findAllCentresdispatchingD1Arrondissement(String nomArrondissementSelected) {
        return centredispatchingDao.findCentresdispatchingD1Arrondissement(nomArrondissementSelected);
    }

    @Override
    public Centredispatching findCentredispatchingLikeName(String nomCentre) {
        return centredispatchingDao.findCentredispatchingLikeName(nomCentre);
    }

    @Override
    public List<Centredispatching> findAllCentresdispatchingD1Region(String nomRegionSelected) {
        return centredispatchingDao.findCentresdispatchingD1Region(nomRegionSelected);
    }

    @Override
    public List<Centredispatching> findAllCentresdispatchingD1Departement(String nomDepartementSelected) {
        return centredispatchingDao.findCentresdispatchingD1Departement(nomDepartementSelected);
    }

    @Override
    public List<Centredispatching> findAllCentredispatchingD1Type(String type) {
        return centredispatchingDao.findCentredispatchingD1Type(type);
    }

    @Override
    public List<Centredispatching> findAllCentresdispatchingD1TypeD1Region(String type, String nomRegion) {
        return centredispatchingDao.findCentresdispatchingD1TypeD1Region(type, nomRegion);
    }

    @Override
    public List<Centredispatching> findAllCentresdispatchingD1TypeD1Departement(String type, String nomDepartement) {
        return centredispatchingDao.findCentresdispatchingD1TypeD1Departement(type, nomDepartement);
    }

    @Override
    public List<Centredispatching> findAllCentredispatchings() {
        return centredispatchingDao.findAll();
    }

    @Override
    public Centredispatching findCentredispatchingD1TypeByEtablissement(String etab, String type) {
        return centredispatchingDao.findCentredispatchingD1TypeByEtablissement(etab, type);
    }

    @Override
    public List<Centredispatching> findAllCentresVentilationEtspecialeD1Region(String nomRegionVentilationSelected) {
        return centredispatchingDao.findCentresVentilationEtspecialeD1Region(nomRegionVentilationSelected);
    }

    @Override
    public List<Centredispatching> findAllCentresVentilationEtspeciale() {
        return centredispatchingDao.findCentresVentilationEtspeciale();
    }

    @Override
    public Secretariat creerSecretariat(Secretariat secretariat) {
        return secretariatDao.create(secretariat);
    }

    @Override
    public Secretariat modifierSecretariat(Secretariat secretariat) {
        return secretariatDao.edit(secretariat);
    }

    @Override
    public void supprimerSecretariat(Secretariat secretariat) {
        secretariatDao.destroy(secretariat);
    }

    @Override
    public Secretariat findSecretariatById(int id) {
        return secretariatDao.find(id);
    }
    
    @Override
    public List<Secretariat> findAllSecretariats() {
        return secretariatDao.findAll();
    }

    /*
    @Override
    public List<Secretariat> findAllSecretariatsD1SouscentreD1SessionEt1Groupedexamens(String nomSouscentre, int annee, String niveau, String type) {
        return secretariatDao.findSecretariatsD1SouscentreD1SessionEt1Groupedexamens(nomSouscentre, annee, niveau, type);
    }
    */


    @Override
    public void supprimerAllSecretariatsD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected) {
        secretariatDao.supprimerSecretariatsD1SouscentreDans1Session(nomSouscentreSelected, anneeSelected);
    }

    /*
    @Override
    public List<Secretariat> findAllSecretariatsD1GroupedexamensDans1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return secretariatDao.findSecretariatsD1GroupedexamensDans1Session(anneeSelected, niveauSelected, typeSelected);
    }
    */
    
    @Override
    public Secretariat findSecretariatD1NumeroD1SessionD1SouscentreD1Etablissement(int numsec, int anneeSelected, String nomSouscentreSelected, String nomEtablissementSelected) {
        return secretariatDao.findSecretariatD1NumeroD1SessionD1SouscentreD1Etablissement(numsec, anneeSelected, nomSouscentreSelected, nomEtablissementSelected);
    }
    
    /*
    @Override
    public List<Secretariat> findAllSecretariatsD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected) {
        return secretariatDao.findSecretariatsD1ExamenDans1Session(anneeSelected, sigleExamenSelected);
    }
    
    
    @Override
    public List<Secretariat> findAllSecretariatsD1SouscentreA1SessionEt1Examen(String nomSouscentreSelected,int anneeSelected,String sigleExamenSelected) {
        return secretariatDao.findSecretariatsD1SouscentreA1SessionEt1Examen(nomSouscentreSelected,anneeSelected,sigleExamenSelected);
    }
    
    
    @Override
    public Secretariat findSecretariatD1SouscentreD1numeroD1Session(String scentre, int numsec, int anneeSelected, String niveauSelected, String typeSelected) {
        return secretariatDao.findSecretariatD1SouscentreD1numeroD1Session(scentre, numsec, anneeSelected, niveauSelected, typeSelected);
    }
    */

    @Override
    public List<Secretariat> findAllSecretariatsD1SouscentreEtSession(String nomSouscentreSelected, int anneeSelected) {
        return secretariatDao.findSecretariatsD1SouscentreEtSession(nomSouscentreSelected, anneeSelected);
    }
    
    @Override
    public List<Secretariat> findAllSecretariatsD1Session(int anneeSelected) {
        return secretariatDao.findSecretariatsD1Session(anneeSelected);
    }
    
    @Override
    public Secretariat findSecretariatD1SouscentreDeNumeroEtSessionDonnes(String nomSouscentreSelected, int numsec, int anneeSelected) {
        return secretariatDao.findSecretariatD1SouscentreDeNumeroEtSessionDonnes(nomSouscentreSelected, numsec, anneeSelected);
    }
        
    public ICentredispatching getCentredispatchingDao() {
        return centredispatchingDao;
    }

    public void setCentredispatchingDao(ICentredispatching centredispatchingDao) {
        this.centredispatchingDao = centredispatchingDao;
    }

    public ISecretariat getSecretariatDao() {
        return secretariatDao;
    }

    public void setSecretariatDao(ISecretariat secretariatDao) {
        this.secretariatDao = secretariatDao;
    }

    @Override
    public Secteurcouv creerSecteurcouv(Secteurcouv secteurcouv) {
        return secteurcouvDao.create(secteurcouv);
    }

    @Override
    public Secteurcouv modifierSecteurcouv(Secteurcouv secteurcouv) {
        return secteurcouvDao.edit(secteurcouv);
    }

    @Override
    public void supprimerSecteurcouv(Secteurcouv secteurcouv) {
        secteurcouvDao.destroy(secteurcouv);
    }

    @Override
    public Secteurcouv findSecteurcouvById(int id) {
        return secteurcouvDao.find(id);
    }

    @Override
    public List<Secteurcouv> findAllSecteurscouvD1Region(String nomRegion) {
        return secteurcouvDao.findSecteurscouvD1Region(nomRegion);
    }

    @Override
    public List<Secteurcouv> findAllSecteurscouvD1Centrebilletage(String nomCentrebilletage) {
        return secteurcouvDao.findSecteurscouvD1Centrebilletage(nomCentrebilletage);
    }

    @Override
    public List<Secteurcouv> findAllSecteurscouv() {
        return secteurcouvDao.findAll();
    }

    public ISecteurcouv getSecteurcouvDao() {
        return secteurcouvDao;
    }

    public void setSecteurcouvDao(ISecteurcouv secteurcouvDao) {
        this.secteurcouvDao = secteurcouvDao;
    }

    @Override
    public Bureau creerBureau(Bureau bureau) {
        return bureauDao.create(bureau);
    }

    @Override
    public Bureau modifierBureau(Bureau bureau) {
        return bureauDao.edit(bureau);
    }

    @Override
    public void supprimerBureau(Bureau bureau) {
        bureauDao.destroy(bureau);
    }

    @Override
    public Bureau findBureauById(int id) {
        return bureauDao.find(id);
    }

    @Override
    public Bureau findBureauD1CentrebilletageDans1Session(String nomCentrebilletage, int annee) {
        return bureauDao.findBureauD1CentrebilletageDans1Session(nomCentrebilletage, annee);
    }

    @Override
    public List<Bureau> findAllBureauxD1Session(int anneeSelected) {
        return bureauDao.findBureauxD1Session(anneeSelected);
    }

    @Override
    public List<Bureau> findAllBureauxD1ArrondissementDans1Session(String nomArrondissement, int annee) {
        return bureauDao.findBureauxD1ArrondissementDans1Session(nomArrondissement, annee);
    }

    @Override
    public List<Bureau> findAllBureauxD1DepartementDans1Session(String nomDepartement, int annee) {
        return bureauDao.findBureauxD1DepartementDans1Session(nomDepartement, annee);
    }

    @Override
    public List<Bureau> findAllBureauxD1RegionDans1Session(String nomRegion, int annee) {
        return bureauDao.findBureauxD1RegionDans1Session(nomRegion, annee);
    }

    public IBureau getBureauDao() {
        return bureauDao;
    }

    public void setBureauDao(IBureau bureauDao) {
        this.bureauDao = bureauDao;
    }

    @Override
    public Naturesecretariat creerNaturesecretariat(Naturesecretariat naturesecretariat) {
        return naturesecretariatDao.create(naturesecretariat);
    }

    @Override
    public Naturesecretariat modifierNaturesecretariat(Naturesecretariat naturesecretariat) {
        return naturesecretariatDao.edit(naturesecretariat);
    }

    @Override
    public void supprimerNaturesecretariat(Naturesecretariat naturesecretariat) {
        naturesecretariatDao.destroy(naturesecretariat);
    }

    @Override
    public Naturesecretariat findNaturesecretariatById(int id) {
        return naturesecretariatDao.find(id);
    }

    @Override
    public List<Naturesecretariat> findAllNaturesecretariats() {
        return naturesecretariatDao.findAll();
    }

    @Override
    public List<Naturesecretariat> findAllNaturesecretariatsD1SouscentreA1SessionEt1Groupedexamens(String nomSouscentre, int annee, String niveauSelected, String typeSelected) {
        return naturesecretariatDao.findNaturesecretariatsD1SouscentreA1SessionEt1Groupedexamens(nomSouscentre, annee, niveauSelected, typeSelected);
    }

    @Override
    public List<Naturesecretariat> findAllNaturesecretariatsD1SouscentreA1SessionDans1Activite(String act, String nomSouscentreSelected, int anneeSelected) {
        return naturesecretariatDao.findNaturesecretariatsD1SouscentreA1SessionDans1Activite(act, nomSouscentreSelected, anneeSelected);
    }

    @Override
    public void supprimerAllNaturesecretariatsD1SouscentreDans1SessionEt1Groupedexamens(String nomSouscentreSelected, int annee, String niveau, String type) {
        naturesecretariatDao.supprimerNaturesecretariatsD1SouscentreDans1SessionEt1Groupedexamens(nomSouscentreSelected, annee, niveau, type);
    }

    @Override
    public List<Naturesecretariat> findAllNaturesecretariatsD1GroupedexamensA1SessionDans1Activite(String phase, String niveauSelected, String typeSelected, int anneeSelected) {
        return naturesecretariatDao.findNaturesecretariatsD1GroupedexamensA1SessionDans1Activite(phase, niveauSelected, typeSelected, anneeSelected);
    }

    @Override
    public List<Naturesecretariat> findAllNaturesecretariatsD1Secreatariat(Integer idsec) {
        return naturesecretariatDao.findNaturesecretariatsD1Secreatariat(idsec);
    }

    public INaturesecretariat getNaturesecretariatDao() {
        return naturesecretariatDao;
    }

    public void setNaturesecretariatDao(INaturesecretariat naturesecretariatDao) {
        this.naturesecretariatDao = naturesecretariatDao;
    }
    
    @Override
    public List<Naturesecretariat> findAllNaturesecretariatD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected,int numsec) {
        return naturesecretariatDao.findNaturesecretariatD1SouscentrePour1ExamenEtSession(anneeSelected, sigleExamenSelected, nomSouscentreSelected,numsec);
    }
    
    @Override
    public List<Naturesecretariat> findAllNaturesecretariatsD1ExamensD1Session(int anneeSelected, String sigleExamenSelected) {
        return naturesecretariatDao.findNaturesecretariatsD1ExamensD1Session(anneeSelected, sigleExamenSelected);
    }
    
    @Override
    public List<Naturesecretariat> findAllNaturesecretariatsD1Session(int anneeSelected) {
        return naturesecretariatDao.findNaturesecretariatsD1Session(anneeSelected);
    }

    @Override
    public List<Naturesecretariat> findAllNaturesecretariatD1SouscentreEtSession(int anneeSelected, String nomSouscentreSelected) {
        return naturesecretariatDao.findNaturesecretariatD1SouscentreEtSession(anneeSelected, nomSouscentreSelected);
    }
    
    @Override
    public List<Naturesecretariat> findAllNaturesecretariatD1Secretariat(int num, int sess, String scent, String etab) {
        return naturesecretariatDao.findNaturesecretariatD1Secretariat(num, sess, scent, etab);
    }
    
    @Override
    public Groupe creerGroupe(Groupe groupe) {
        return groupeDao.create(groupe);
    }

    @Override
    public Groupe modifierGroupe(Groupe groupe) {
        return groupeDao.edit(groupe);
    }

    @Override
    public void supprimerGroupe(Groupe groupe) {
        groupeDao.destroy(groupe);
    }

    @Override
    public Groupe findGroupeById(int id) {
        return groupeDao.find(id);
    }

    @Override
    public List<Groupe> findAllGroupes() {
        return groupeDao.findAll();
    }

    @Override
    public Groupe findGroupeD1NiveauEtD1Type(String niveau, String type) {
        return groupeDao.findGroupeD1NiveauEtD1Type(niveau, type);
    }

    @Override
    public Groupedexamen creerGroupedexamen(Groupedexamen groupedexamen) {
        return groupedexamenDao.create(groupedexamen);
    }

    @Override
    public Groupedexamen modifierGroupedexamen(Groupedexamen groupedexamen) {
        return groupedexamenDao.edit(groupedexamen);
    }

    @Override
    public void supprimerGroupedexamen(Groupedexamen groupedexamen) {
        groupedexamenDao.destroy(groupedexamen);
    }

    @Override
    public Groupedexamen findGroupedexamenById(int id) {
        return groupedexamenDao.find(id);
    }

    @Override
    public List<Groupedexamen> findAllGroupedexamens() {
        return groupedexamenDao.findAll();
    }

    @Override
    public List<Groupedexamen> findAllGroupedexamensD1NiveauEtD1Type(String niveau, String type) {
        return groupedexamenDao.findGroupedexamensD1NiveauEtD1Type(niveau, type);
    }

    @Override
    public Rubriquedegroupe creerRubriquedegroupe(Rubriquedegroupe rubriquedegroupe) {
        return rubriquedegroupeDao.create(rubriquedegroupe);
    }

    @Override
    public Rubriquedegroupe modifierRubriquedegroupe(Rubriquedegroupe rubriquedegroupe) {
        return rubriquedegroupeDao.edit(rubriquedegroupe);
    }

    @Override
    public void supprimerRubriquedegroupe(Rubriquedegroupe rubriquedegroupe) {
        rubriquedegroupeDao.destroy(rubriquedegroupe);
    }

    @Override
    public Rubriquedegroupe findRubriquedegroupeById(int id) {
        return rubriquedegroupeDao.find(id);
    }

    @Override
    public List<Rubriquedegroupe> findAllRubriquedegroupes() {
        return rubriquedegroupeDao.findAll();
    }

    public IGroupe getGroupeDao() {
        return groupeDao;
    }

    public void setGroupeDao(IGroupe groupeDao) {
        this.groupeDao = groupeDao;
    }

    public IGroupedexamen getGroupedexamenDao() {
        return groupedexamenDao;
    }

    public void setGroupedexamenDao(IGroupedexamen groupedexamenDao) {
        this.groupedexamenDao = groupedexamenDao;
    }

    public IRubriquedegroupe getRubriquedegroupeDao() {
        return rubriquedegroupeDao;
    }

    public void setRubriquedegroupeDao(IRubriquedegroupe rubriquedegroupeDao) {
        this.rubriquedegroupeDao = rubriquedegroupeDao;
    }

    @Override
    public List<Famille> findAllFamilles() {
        return familleDao.findAll();
    }

    @Override
    public Famille creerFamille(Famille famille) {
        return familleDao.create(famille);
    }

    @Override
    public Famille modifierFamille(Famille famille) {
        return familleDao.edit(famille);
    }

    @Override
    public void supprimerFamille(Famille famille) {
        familleDao.destroy(famille);
    }

    @Override
    public Famille findFamilleById(int id) {
        return familleDao.find(id);
    }

    @Override
    public List<Famille> findAllFamillesLikeTitre(String titre) {
        return familleDao.findFamillesLikeTitre(titre);
    }

    @Override
    public Famille findFamilleByTitre(String titre) {
        return familleDao.findFamilleByTitre(titre);
    }

    public IFamille getFamilleDao() {
        return familleDao;
    }

    public void setFamilleDao(IFamille familleDao) {
        this.familleDao = familleDao;
    }

    @Override
    public List<Rattachdispatching> findAllRattachdispatchings() {
        return rattachdispatchingDao.findAll();
    }

    @Override
    public Rattachdispatching creerRattachdispatching(Rattachdispatching rattachdispatching) {
        return rattachdispatchingDao.create(rattachdispatching);
    }

    @Override
    public Rattachdispatching modifierRattachdispatching(Rattachdispatching rattachdispatching) {
        return rattachdispatchingDao.edit(rattachdispatching);
    }

    @Override
    public void supprimerRattachdispatching(Rattachdispatching rattachdispatching) {
        rattachdispatchingDao.destroy(rattachdispatching);
    }

    @Override
    public Rattachdispatching findRattachdispatchingById(int id) {
        return rattachdispatchingDao.find(id);
    }

    public IRattachdispatching getRattachdispatchingDao() {
        return rattachdispatchingDao;
    }

    public void setRattachdispatchingDao(IRattachdispatching rattachdispatchingDao) {
        this.rattachdispatchingDao = rattachdispatchingDao;
    }

    @Override
    public List<Rattachdispatching> findAllRattachdispatchingsD1CentredispatchingD1Type(String nomCentreregroupement, String type) {
        return rattachdispatchingDao.findRattachdispatchingsD1CentredispatchingD1Type(nomCentreregroupement, type);
    }

    @Override
    public List<Rattachdispatching> findAllRattachdispatchingsD1Centredispatching(String nomCentreDispatchingSelected) {
        return rattachdispatchingDao.findRattachdispatchingsD1Centredispatching(nomCentreDispatchingSelected);
    }

    @Override
    public Rattachdispatching findRattachdispatchingD1SouscentreD1Type(String nomsouscent, String type) {
        return rattachdispatchingDao.findRattachdispatchingD1SouscentreD1Type(nomsouscent, type);
    }

    @Override
    public List<Rattachdispatching> findAllRattachdispatchingsD1Souscentre(String nomsouscent) {
        return rattachdispatchingDao.findRattachdispatchingsD1Souscentre(nomsouscent);
    }

    @Override
    public List<Grandcentre> findAllGrandcentres() {
        return grandcentreDao.findAll();
    }

    @Override
    public Grandcentre creerGrandcentre(Grandcentre grandcentre) {
        return grandcentreDao.create(grandcentre);
    }

    @Override
    public Grandcentre modifierGrandcentre(Grandcentre grandcentre) {
        return grandcentreDao.edit(grandcentre);
    }

    @Override
    public void supprimerGrandcentre(Grandcentre grandcentre) {
        grandcentreDao.destroy(grandcentre);
    }

    @Override
    public Grandcentre findGrandcentreById(int id) {
        return grandcentreDao.find(id);
    }

    @Override
    public List<Grandcentre> findAllGrandcentresD1Region(String nomRegion) {
        return grandcentreDao.findGrandcentresD1Region(nomRegion);
    }

    @Override
    public List<Grandcentre> findAllGrandcentresLikeName(String nom) {
        return grandcentreDao.findGrandcentresLikeName(nom);
    }

    @Override
    public List<Grandcentre> findAllGrandcentresD1RegionD1NiveauEtD1Type(String nomreg, String nomniv, String nomtyp) {
        return grandcentreDao.findGrandcentresD1RegionD1NiveauEtD1Type(nomreg, nomniv, nomtyp);
    }

    public IGrandcentre getGrandcentreDao() {
        return grandcentreDao;
    }

    public void setGrandcentreDao(IGrandcentre grandcentreDao) {
        this.grandcentreDao = grandcentreDao;
    }

    @Override
    public List<Centrebilletage> findAllCentrebilletages() {
        return centrebilletageDao.findAll();
    }

    @Override
    public Centrebilletage creerCentrebilletage(Centrebilletage centrebilletage) {
        return centrebilletageDao.create(centrebilletage);
    }

    @Override
    public Centrebilletage modifierCentrebilletage(Centrebilletage centrebilletage) {
        return centrebilletageDao.edit(centrebilletage);
    }

    @Override
    public void supprimerCentrebilletage(Centrebilletage centrebilletage) {
        centrebilletageDao.destroy(centrebilletage);
    }

    @Override
    public Centrebilletage findCentrebilletageById(int id) {
        return centrebilletageDao.find(id);
    }

    @Override
    public List<Centrebilletage> findAllCentrebilletagesD1NiveauD1Type(String niveau, String type) {
        return centrebilletageDao.findCentrebilletagesD1NiveauD1Type(niveau, type);
    }

    public ICentrebilletage getCentrebilletageDao() {
        return centrebilletageDao;
    }

    public void setCentrebilletageDao(ICentrebilletage centrebilletageDao) {
        this.centrebilletageDao = centrebilletageDao;
    }

    @Override
    public List<Centrebilletage> findAllCentrebilletagesD1Arrondissement(String nomArrondissement) {
        return centrebilletageDao.findCentrebilletagesD1Arrondissement(nomArrondissement);
    }

    @Override
    public Centrebilletage findCentrebilletageD1Etablissement(String nomEtablissement) {
        return centrebilletageDao.findCentrebilletageD1Etablissement(nomEtablissement);
    }

    @Override
    public List<Centrebilletage> findAllCentrebilletagesD1Departement(String nomDepartement) {
        return centrebilletageDao.findCentrebilletagesD1Departement(nomDepartement);
    }

    @Override
    public List<Centrebilletage> findAllCentrebilletagesD1Region(String nomRegion) {
        return centrebilletageDao.findCentrebilletagesD1Region(nomRegion);
    }

    @Override
    public List<Rattachetab> findAllRattachetabs() {
        return rattachetabDao.findAll();
    }

    @Override
    public Rattachetab creerRattachetab(Rattachetab rattachetab) {
        return rattachetabDao.create(rattachetab);
    }

    @Override
    public Rattachetab modifierRattachetab(Rattachetab rattachetab) {
        return rattachetabDao.edit(rattachetab);
    }

    @Override
    public void supprimerRattachetab(Rattachetab rattachetab) {
        rattachetabDao.destroy(rattachetab);
    }

    @Override
    public Rattachetab findRattachetabById(int id) {
        return rattachetabDao.find(id);
    }

    @Override
    public Rattachetab findRattachetabD1Etablissement(String nomEtablissement) {
        return rattachetabDao.findRattachetabD1Etablissement(nomEtablissement);
    }

    @Override
    public List<Rattachetab> findAllRattachetabD1Souscentre(String nomSouscentre) {
        return rattachetabDao.findRattachetabD1Souscentre(nomSouscentre);
    }

    public IRattachetab getRattachetabDao() {
        return rattachetabDao;
    }

    public void setRattachetabDao(IRattachetab rattachetabDao) {
        this.rattachetabDao = rattachetabDao;
    }

    @Override
    public List<Rattachscentre> findAllRattachscentres() {
        return rattachscentreDao.findAll();
    }

    @Override
    public Rattachscentre creerRattachscentre(Rattachscentre rattachscentre) {
        return rattachscentreDao.create(rattachscentre);
    }

    @Override
    public Rattachscentre modifierRattachscentre(Rattachscentre rattachscentre) {
        return rattachscentreDao.edit(rattachscentre);
    }

    @Override
    public void supprimerRattachscentre(Rattachscentre rattachscentre) {
        rattachscentreDao.destroy(rattachscentre);
    }

    @Override
    public Rattachscentre findRattachscentreById(int id) {
        return rattachscentreDao.find(id);
    }

    @Override
    public List<Rattachscentre> findAllRattachscentresD1Centre(String nomCentre) {
        return rattachscentreDao.findRattachscentresD1Centre(nomCentre);
    }

    @Override
    public Rattachscentre findRattachscentreD1Souscentre(String nomSouscentre) {
        return rattachscentreDao.findRattachscentreD1Souscentre(nomSouscentre);
    }

    public IRattachscentre getRattachscentreDao() {
        return rattachscentreDao;
    }

    public void setRattachscentreDao(IRattachscentre rattachscentreDao) {
        this.rattachscentreDao = rattachscentreDao;
    }

    @Override
    public List<Rattachcentre> findAllRattachcentres() {
        return rattachcentreDao.findAll();
    }

    @Override
    public Rattachcentre creerRattachcentre(Rattachcentre rattachcentre) {
        return rattachcentreDao.create(rattachcentre);
    }

    @Override
    public Rattachcentre modifierRattachcentre(Rattachcentre rattachcentre) {
        return rattachcentreDao.edit(rattachcentre);
    }

    @Override
    public void supprimerRattachcentre(Rattachcentre rattachcentre) {
        rattachcentreDao.destroy(rattachcentre);
    }

    @Override
    public Rattachcentre findRattachcentreById(int id) {
        return rattachcentreDao.find(id);
    }

    @Override
    public List<Rattachcentre> findAllRattachcentresD1Grandcentre(String nomGrandcentre) {
        return rattachcentreDao.findRattachcentresD1Grandcentre(nomGrandcentre);
    }

    @Override
    public Rattachcentre findRattachcentreD1Centre(String nomCentreDeliberation) {
        return rattachcentreDao.findRattachcentreD1Centre(nomCentreDeliberation);
    }

    public IRattachcentre getRattachcentreDao() {
        return rattachcentreDao;
    }

    public void setRattachcentreDao(IRattachcentre rattachcentreDao) {
        this.rattachcentreDao = rattachcentreDao;
    }

    @Override
    public List<Elementsurvdeficient> findAllElementsurvdeficients() {
        return elementsurvdeficientDao.findAll();
    }

    @Override
    public Elementsurvdeficient creerElementsurvdeficient(Elementsurvdeficient elementsurvdeficient) {
        return elementsurvdeficientDao.create(elementsurvdeficient);
    }

    @Override
    public Elementsurvdeficient modifierElementsurvdeficient(Elementsurvdeficient elementsurvdeficient) {
        return elementsurvdeficientDao.edit(elementsurvdeficient);
    }

    @Override
    public void supprimerElementsurvdeficient(Elementsurvdeficient elementsurvdeficient) {
        elementsurvdeficientDao.destroy(elementsurvdeficient);
    }

    @Override
    public Elementsurvdeficient findElementsurvdeficientById(int id) {
        return elementsurvdeficientDao.find(id);
    }

    public IElementsurvdeficient getElementsurvdeficientDao() {
        return elementsurvdeficientDao;
    }

    public void setElementsurvdeficientDao(IElementsurvdeficient elementsurvdeficientDao) {
        this.elementsurvdeficientDao = elementsurvdeficientDao;
    }

    @Override
    public List<Elementsurvdeficient> findAllElementsurvdeficientsD1groupedexamenA1Session(int annee, String niveau, String type) {
        return elementsurvdeficientDao.findElementsurvdeficientsD1groupedexamenA1Session(annee, niveau, type);
    }

    @Override
    public List<Qualite> findAllQualites() {
        return qualiteDao.findAll();
    }

    @Override
    public Qualite creerQualite(Qualite qualite) {
        return qualiteDao.create(qualite);
    }

    @Override
    public Qualite modifierQualite(Qualite qualite) {
        return qualiteDao.edit(qualite);
    }

    @Override
    public void supprimerQualite(Qualite qualite) {
        qualiteDao.destroy(qualite);
    }

    @Override
    public Qualite findQualiteById(int id) {
        return qualiteDao.find(id);
    }

    @Override
    public List<Qualite> findAllQualitesLikeTitre(String titre) {
        return qualiteDao.findQualitesLikeTitre(titre);
    }

    @Override
    public Qualite findQualiteByTitre(String titre) {
        return qualiteDao.findQualiteByTitre(titre);
    }

    @Override
    public List<Intervenant> findAllIntervenants() {
        return intervenantDao.findAll();
    }

    @Override
    public Intervenant creerIntervenant(Intervenant intervenant) {
        return intervenantDao.create(intervenant);
    }

    @Override
    public Intervenant modifierIntervenant(Intervenant intervenant) {
        return intervenantDao.edit(intervenant);
    }

    @Override
    public void supprimerIntervenant(Intervenant intervenant) {
        intervenantDao.destroy(intervenant);
    }

    @Override
    public Intervenant findIntervenantById(int id) {
        return intervenantDao.find(id);
    }

    @Override
    public Intervenant findIntervenantByNomEtPrenomD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(String nom, String prenom, int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titre) {
        return intervenantDao.findIntervenantByNomEtPrenomD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(nom, prenom, anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected, phase, titre);
    }

    @Override
    public List<Intervenant> findAllIntervenantsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titre) {
        return intervenantDao.findIntervenantsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(anneeSelected, niveauSelected, typeSelected, phase, titre);
    }

    @Override
    public Intervenant findIntervenantByQualiteD1GroupeDexamensD1SessionD1SouscentreEtActivite(int anneeSelected, String nomsouscent, String niveauSelected, String typeSelected, String phase, String qualiteResponsble) {
        return intervenantDao.findIntervenantByQualiteD1GroupeDexamensD1SessionD1SouscentreEtActivite(anneeSelected, nomsouscent, niveauSelected, typeSelected, phase, qualiteResponsble);
    }

    @Override
    public List<Intervenant> findAllIntervenantsD1GroupeDexamensD1SouscentreD1SessionD1ActiviteEt1Qualite(int annee, String nomSouscentre, String niveau, String type, String phase, String titreQualite) {
        return intervenantDao.findIntervenantsD1GroupeDexamensD1SouscentreD1SessionD1ActiviteEt1Qualite(annee, nomSouscentre, niveau, type, phase, titreQualite);
    }

    @Override
    public Intervenant findIntervenantD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titreQualite) {
        return intervenantDao.findIntervenantD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected, phase, titreQualite);
    }

    @Override
    public List<Intervenant> findAllIntervenantsProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String correcteur) {
        return intervenantDao.findIntervenantsProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(anneeSelected, niveauSelected, typeSelected, phase, correcteur);
    }
    
    @Override
    public List<Intervenant> findAllIntervenantsNonProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String correcteur) {
        return intervenantDao.findIntervenantsNonProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(anneeSelected, niveauSelected, typeSelected, phase, correcteur);
    }
        
    public IQualite getQualiteDao() {
        return qualiteDao;
    }

    public void setQualiteDao(IQualite qualiteDao) {
        this.qualiteDao = qualiteDao;
    }

    public IIntervenant getIntervenantDao() {
        return intervenantDao;
    }

    public void setIntervenantDao(IIntervenant intervenantDao) {
        this.intervenantDao = intervenantDao;
    }

    @Override
    public List<Intervsec> findAllIntervsecs() {
        return intervsecDao.findAll();
    }

    @Override
    public Intervsec creerIntervsec(Intervsec intervsec) {
        return intervsecDao.create(intervsec);
    }

    @Override
    public Intervsec modifierIntervsec(Intervsec intervsec) {
        return intervsecDao.edit(intervsec);
    }

    @Override
    public void supprimerIntervsec(Intervsec intervsec) {
        intervsecDao.destroy(intervsec);
    }

    @Override
    public Intervsec findIntervsecById(int id) {
        return intervsecDao.find(id);
    }

    public IIntervsec getIntervsecDao() {
        return intervsecDao;
    }

    public void setIntervsecDao(IIntervsec intervsecDao) {
        this.intervsecDao = intervsecDao;
    }

    @Override
    public Intervsec findIntersecD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1QualiteD1Secretariat(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titreQualite, int numsec) {
        return intervsecDao.findIntersecD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1QualiteD1Secretariat(anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected, phase, titreQualite, numsec);
    }

    @Override
    public List<Intervsec> findAllIntervsecsD1GroupedexamensD1SessionD1ActiviteD1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titreQualite) {
        return intervsecDao.findIntervsecsD1GroupedexamensD1SessionD1ActiviteD1Qualite(anneeSelected, niveauSelected, typeSelected, phase, titreQualite);
    }

    @Override
    public List<Intervjuryti> findAllIntervjurytis() {
        return intervjurytiDao.findAll();
    }

    @Override
    public Intervjuryti creerIntervjuryti(Intervjuryti intervjuryti) {
        return intervjurytiDao.create(intervjuryti);
    }

    @Override
    public Intervjuryti modifierIntervjuryti(Intervjuryti intervjuryti) {
        return intervjurytiDao.edit(intervjuryti);
    }

    @Override
    public void supprimerIntervjuryti(Intervjuryti intervjuryti) {
        intervjurytiDao.destroy(intervjuryti);
    }

    @Override
    public Intervjuryti findIntervjurytiById(int id) {
        return intervjurytiDao.find(id);
    }

    @Override
    public List<Intervjuryti> findAllIntervjurytisD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String chefjury) {
        return intervjurytiDao.findIntervjurytisD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(anneeSelected, niveauSelected, typeSelected, phase, chefjury);
    }

    @Override
    public List<Intervjuryti> findAllIntervjurytisD1SouscentreD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(String nomsouscent, int anneeSelected, String niveauSelected, String typeSelected, String phase, String chefjury) {
        return intervjurytiDao.findIntervjurytisD1SouscentreD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(nomsouscent, anneeSelected, niveauSelected, typeSelected, phase, chefjury);
    }

    @Override
    public void supprimerIntervjurytiByIntervenantId(Integer idinterv) {
        intervjurytiDao.supprimerIntervjurytiByIntervenantId(idinterv);
    }

    public IIntervjuryti getIntervjurytiDao() {
        return intervjurytiDao;
    }

    public void setIntervjurytiDao(IIntervjuryti intervjurytiDao) {
        this.intervjurytiDao = intervjurytiDao;
    }

    @Override
    public List<Nbcopiesdelib> findAllNbcopiesdelib() {
        return nbcopiesdelibDao.findAll();
    }

    @Override
    public Nbcopiesdelib creerNbcopiesdelib(Nbcopiesdelib nbcopiesdelib) {
        return nbcopiesdelibDao.create(nbcopiesdelib);
    }

    @Override
    public Nbcopiesdelib modifierNbcopiesdelib(Nbcopiesdelib nbcopiesdelib) {
        return nbcopiesdelibDao.edit(nbcopiesdelib);
    }

    @Override
    public void supprimerNbcopiesdelib(Nbcopiesdelib nbcopiesdelib) {
        nbcopiesdelibDao.destroy(nbcopiesdelib);
    }

    @Override
    public Nbcopiesdelib findNbcopiesdelibById(int id) {
        return nbcopiesdelibDao.find(id);
    }

    @Override
    public Nbcopiesdelib findNbcopiesdelibD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return nbcopiesdelibDao.findNbcopiesdelibD1CentredeliberationD1GroupedexamensD1Session(nomCentredeliberationSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbcopiesdelib> findAllNbcopiesdelibD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nbcopiesdelibDao.findNbcopiesdelibD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbcopiesdispatchees> findAllNbcopiesdispatchees() {
        return nbcopiesdispatcheesDao.findAll();
    }

    @Override
    public Nbcopiesdispatchees creerNbcopiesdispatchees(Nbcopiesdispatchees nbcopiesdispatchees) {
        return nbcopiesdispatcheesDao.create(nbcopiesdispatchees);
    }

    @Override
    public Nbcopiesdispatchees modifierNbcopiesdispatchees(Nbcopiesdispatchees nbcopiesdispatchees) {
        return nbcopiesdispatcheesDao.edit(nbcopiesdispatchees);
    }

    @Override
    public void supprimerNbcopiesdispatchees(Nbcopiesdispatchees nbcopiesdispatchees) {
        nbcopiesdispatcheesDao.destroy(nbcopiesdispatchees);
    }

    @Override
    public Nbcopiesdispatchees findNbcopiesdispatcheesById(int id) {
        return nbcopiesdispatcheesDao.find(id);
    }

    @Override
    public Nbcopiesdispatchees findNbcopiesdispatcheesD1CentreregroupementD1GroupedexamensD1Session(String nomCentreregroupementSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return nbcopiesdispatcheesDao.findNbcopiesdispatcheesD1CentreregroupementD1GroupedexamensD1Session(nomCentreregroupementSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbcopiesdispatchees> findAllNbcopiesdispatcheesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nbcopiesdispatcheesDao.findNbcopiesdispatcheesD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    public INbcopiesdelib getNbcopiesdelibDao() {
        return nbcopiesdelibDao;
    }

    public void setNbcopiesdelibDao(INbcopiesdelib nbcopiesdelibDao) {
        this.nbcopiesdelibDao = nbcopiesdelibDao;
    }

    public INbcopiesdispatchees getNbcopiesdispatcheesDao() {
        return nbcopiesdispatcheesDao;
    }

    public void setNbcopiesdispatcheesDao(INbcopiesdispatchees nbcopiesdispatcheesDao) {
        this.nbcopiesdispatcheesDao = nbcopiesdispatcheesDao;
    }

    @Override
    public List<Rattachregroupement> findAllRattachregroupements() {
        return rattachregroupementDao.findAll();
    }

    @Override
    public Rattachregroupement creerRattachregroupement(Rattachregroupement rattachregroupement) {
        return rattachregroupementDao.create(rattachregroupement);
    }

    @Override
    public Rattachregroupement modifierRattachregroupement(Rattachregroupement rattachregroupement) {
        return rattachregroupementDao.edit(rattachregroupement);
    }

    @Override
    public void supprimerRattachregroupement(Rattachregroupement rattachregroupement) {
        rattachregroupementDao.destroy(rattachregroupement);
    }

    @Override
    public Rattachregroupement findRattachregroupementById(int id) {
        return rattachregroupementDao.find(id);
    }

    public IRattachregroupement getRattachregroupementDao() {
        return rattachregroupementDao;
    }

    public void setRattachregroupementDao(IRattachregroupement rattachregroupementDao) {
        this.rattachregroupementDao = rattachregroupementDao;
    }

    @Override
    public Rattachregroupement findRattachregroupementD1Centreregroupement(String centreregroup) {
        return rattachregroupementDao.findRattachregroupementD1Centreregroupement(centreregroup);
    }

    @Override
    public List<Rattachregroupement> findAllRattachregroupementsD1CentredispatchingD1Type(String nomExacte, String typeExate) {
        return rattachregroupementDao.findRattachregroupementsD1CentredispatchingD1Type(nomExacte, typeExate);
    }

    @Override
    public List<Rattachregroupement> findAllRattachregroupementsD1Centredispatching(String nom) {
        return rattachregroupementDao.findRattachregroupementsD1Centredispatching(nom);
    }

    @Override
    public List<Nbchefsalle> findAllNbchefsalles() {
        return nbchefsalleDao.findAll();
    }

    @Override
    public Nbchefsalle creerNbchefsalle(Nbchefsalle nbchefsalle) {
        return nbchefsalleDao.create(nbchefsalle);
    }

    @Override
    public Nbchefsalle modifierNbchefsalle(Nbchefsalle nbchefsalle) {
        return nbchefsalleDao.edit(nbchefsalle);
    }

    @Override
    public void supprimerNbchefsalle(Nbchefsalle nbchefsalle) {
        nbchefsalleDao.destroy(nbchefsalle);
    }

    @Override
    public Nbchefsalle findNbchefsalleById(int id) {
        return nbchefsalleDao.find(id);
    }

    public INbchefsalle getNbchefsalleDao() {
        return nbchefsalleDao;
    }

    public void setNbchefsalleDao(INbchefsalle nbchefsalleDao) {
        this.nbchefsalleDao = nbchefsalleDao;
    }

    @Override
    public Nbchefsalle findNbchefsalleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return nbchefsalleDao.findNbchefsalleD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbchefsalle> findAllNbchefsallesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nbchefsalleDao.findNbchefsallesD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Jurycorrige> findAllJurycorriges() {
        return jurycorrigeDao.findAll();
    }

    @Override
    public Jurycorrige creerJurycorrige(Jurycorrige jurycorrige) {
        return jurycorrigeDao.create(jurycorrige);
    }

    @Override
    public Jurycorrige modifierJurycorrige(Jurycorrige jurycorrige) {
        return jurycorrigeDao.edit(jurycorrige);
    }

    @Override
    public void supprimerJurycorrige(Jurycorrige jurycorrige) {
        jurycorrigeDao.destroy(jurycorrige);
    }

    @Override
    public Jurycorrige findJurycorrigeById(int id) {
        return jurycorrigeDao.find(id);
    }

    @Override
    public Jurycorrige findJurycorrigeD1SousfamilleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        return jurycorrigeDao.findJurycorrigeD1SousfamilleD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected, titreSousfamilleSelected);
    }

    @Override
    public List<Jurycorrige> findAllJurycorrigesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return jurycorrigeDao.findJurycorrigesD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Sousfamille> findAllSousfamilles() {
        return sousfamilleDao.findAll();
    }

    @Override
    public Sousfamille creerSousfamille(Sousfamille sousfamille) {
        return sousfamilleDao.create(sousfamille);
    }

    @Override
    public Sousfamille modifierSousfamille(Sousfamille sousfamille) {
        return sousfamilleDao.edit(sousfamille);
    }

    @Override
    public void supprimerSousfamille(Sousfamille sousfamille) {
        sousfamilleDao.destroy(sousfamille);
    }

    @Override
    public Sousfamille findSousfamilleById(int id) {
        return sousfamilleDao.find(id);
    }

    @Override
    public List<Sousfamille> findAllSousfamillesLikeTitre(String titre) {
        return sousfamilleDao.findSousfamillesLikeTitre(titre);
    }
    
    @Override
    public List<Sousfamille> findAllSousfamillesTI() {
        return sousfamilleDao.findSousfamillesTI();
    }
    
     @Override
    public Sousfamille findSousfamilleByTitre(String titre) {
        return sousfamilleDao.findSousfamillesByTitre(titre);
    }
    
    @Override
    public List<Sousfamille> findAllSousfamillesESG() {
        return sousfamilleDao.findSousfamillesESG();
    }

    @Override
    public List<Sousfamille> findAllSousfamillesSTT() {
        return sousfamilleDao.findSousfamillesSTT();
    }
    
    @Override
    public List<Sousfamille> findAllSousfamillesD1Famille(String titreFamilleSelected) {
       return sousfamilleDao.findAllSousfamillesD1Famille(titreFamilleSelected);
    }

    @Override
    public List<Optiond1sousfamille> findAllOptiond1sousfamilles() {
        return optiond1sousfamilleDao.findAll();
    }

    @Override
    public Optiond1sousfamille creerOptiond1sousfamille(Optiond1sousfamille optiond1sousfamille) {
        return optiond1sousfamilleDao.create(optiond1sousfamille);
    }

    @Override
    public Optiond1sousfamille modifierOptiond1sousfamille(Optiond1sousfamille optiond1sousfamille) {
        return optiond1sousfamilleDao.edit(optiond1sousfamille);
    }

    @Override
    public void supprimerOptiond1sousfamille(Optiond1sousfamille optiond1sousfamille) {
        optiond1sousfamilleDao.destroy(optiond1sousfamille);
    }

    @Override
    public Optiond1sousfamille findOptiond1sousfamilleById(int id) {
        return optiond1sousfamilleDao.find(id);
    }

    @Override
    public List<Rattachventilation> findAllRattachventilations() {
        return rattachventilationDao.findAll();
    }

    @Override
    public Rattachventilation creerRattachventilation(Rattachventilation rattachventilation) {
        return rattachventilationDao.create(rattachventilation);
    }

    @Override
    public Rattachventilation modifierRattachventilation(Rattachventilation rattachventilation) {
        return rattachventilationDao.edit(rattachventilation);
    }

    @Override
    public void supprimerRattachventilation(Rattachventilation rattachventilation) {
        rattachventilationDao.destroy(rattachventilation);
    }

    @Override
    public Rattachventilation findRattachventilationById(int id) {
        return rattachventilationDao.find(id);
    }

    @Override
    public List<Rattachventilation> findAllRattachventilationsD1CentreventilationSpecial(String nomExacte) {
        return rattachventilationDao.findRattachventilationsD1CentreventilationSpecial(nomExacte);//il ne saurait y avoir d'un autre type
    }

    @Override
    public Rattachventilation findRattachventilationD1Centreventilation(String nomCentreventil) {
        return rattachventilationDao.findRattachventilationD1Centreventilation(nomCentreventil);//il ne saurait y avoir d'un autre type
    }

    public IJurycorrige getJurycorrigeDao() {
        return jurycorrigeDao;
    }

    public void setJurycorrigeDao(IJurycorrige jurycorrigeDao) {
        this.jurycorrigeDao = jurycorrigeDao;
    }

    public ISousfamille getSousfamilleDao() {
        return sousfamilleDao;
    }

    public void setSousfamilleDao(ISousfamille sousfamilleDao) {
        this.sousfamilleDao = sousfamilleDao;
    }

    public IOptiond1sousfamille getOptiond1sousfamilleDao() {
        return optiond1sousfamilleDao;
    }

    public void setOptiond1sousfamilleDao(IOptiond1sousfamille optiond1sousfamilleDao) {
        this.optiond1sousfamilleDao = optiond1sousfamilleDao;
    }

    public IRattachventilation getRattachventilationDao() {
        return rattachventilationDao;
    }

    public void setRattachventilationDao(IRattachventilation rattachventilationDao) {
        this.rattachventilationDao = rattachventilationDao;
    }

    @Override
    public List<Eltacmtemoin> findAllEltacmtemoins() {
        return eltacmtemoinDao.findAll();
    }

    @Override
    public Eltacmtemoin creerEltacmtemoin(Eltacmtemoin eltacmtemoin) {
        return eltacmtemoinDao.create(eltacmtemoin);
    }

    @Override
    public Eltacmtemoin modifierEltacmtemoin(Eltacmtemoin eltacmtemoin) {
        return eltacmtemoinDao.edit(eltacmtemoin);
    }

    @Override
    public void supprimerEltacmtemoin(Eltacmtemoin eltacmtemoin) {
        eltacmtemoinDao.destroy(eltacmtemoin);
    }

    @Override
    public Eltacmtemoin findEltacmtemoinById(int id) {
        return eltacmtemoinDao.find(id);
    }

    @Override
    public List<Eltacmtemoin> findAllEltacmtemoinsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltacmtemoinDao.findEltacmtemoinsD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    public IEltacmtemoin getEltacmtemoinDao() {
        return eltacmtemoinDao;
    }

    public void setEltacmtemoinDao(IEltacmtemoin eltacmtemoinDao) {
        this.eltacmtemoinDao = eltacmtemoinDao;
    }

    @Override
    public List<Jurytemoin> findAllJurytemoins() {
        return jurytemoinDao.findAll();
    }

    @Override
    public Jurytemoin creerJurytemoin(Jurytemoin jurytemoin) {
        return jurytemoinDao.create(jurytemoin);
    }

    @Override
    public Jurytemoin modifierJurytemoin(Jurytemoin jurytemoin) {
        return jurytemoinDao.edit(jurytemoin);
    }

    @Override
    public void supprimerJurytemoin(Jurytemoin jurytemoin) {
        jurytemoinDao.destroy(jurytemoin);
    }

    @Override
    public Jurytemoin findJurytemoinById(int id) {
        return jurytemoinDao.find(id);
    }

    public IJurytemoin getJurytemoinDao() {
        return jurytemoinDao;
    }

    public void setJurytemoinDao(IJurytemoin jurytemoinDao) {
        this.jurytemoinDao = jurytemoinDao;
    }

    @Override
    public Jurytemoin findJurytemoinD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return jurytemoinDao.findJurytemoinD1CentreD1GroupedexamensD1Session(nomCentreSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Jurytemoin> findAllJurystemoinsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return jurytemoinDao.findJurystemoinsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Jurydel> findAllJurydels() {
        return jurydelDao.findAll();
    }

    @Override
    public Jurydel creerJurydel(Jurydel jurydel) {
        return jurydelDao.create(jurydel);
    }

    @Override
    public Jurydel modifierJurydel(Jurydel jurydel) {
        return jurydelDao.edit(jurydel);
    }

    @Override
    public void supprimerJurydel(Jurydel jurydel) {
        jurydelDao.destroy(jurydel);
    }

    @Override
    public Jurydel findJurydelById(int id) {
        return jurydelDao.find(id);
    }

    public IJurydel getJurydelDao() {
        return jurydelDao;
    }

    public void setJurydelDao(IJurydel jurydelDao) {
        this.jurydelDao = jurydelDao;
    }

    @Override
    public Jurydel findJurydelD1SousfamilleD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        return jurydelDao.findJurydelD1SousfamilleD1CentreD1GroupedexamensD1Session(nomCentreSelected, anneeSelected, niveauSelected, typeSelected, titreSousfamilleSelected);
    }

    @Override
    public List<Jurydel> findAllJurydelsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return jurydelDao.findJurydelsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltcmpratique2> findAllEltcmpratique2() {
        return eltcmpratique2Dao.findAll();
    }

    @Override
    public Eltcmpratique2 creerEltcmpratique2(Eltcmpratique2 eltcmpratique2) {
        return eltcmpratique2Dao.create(eltcmpratique2);
    }

    @Override
    public Eltcmpratique2 modifierEltcmpratique2(Eltcmpratique2 eltcmpratique2) {
        return eltcmpratique2Dao.edit(eltcmpratique2);
    }

    @Override
    public void supprimerEltcmpratique2(Eltcmpratique2 eltcmpratique2) {
        eltcmpratique2Dao.destroy(eltcmpratique2);
    }

    @Override
    public Eltcmpratique2 findEltcmpratique2ById(int id) {
        return eltcmpratique2Dao.find(id);
    }

    public IEltcmpratique2 getEltcmpratique2Dao() {
        return eltcmpratique2Dao;
    }

    public void setEltcmpratique2Dao(IEltcmpratique2 eltcmpratique2Dao) {
        this.eltcmpratique2Dao = eltcmpratique2Dao;
    }

    @Override
    public List<Eltcmpratique2> findAllEltcmpratique2D1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltcmpratique2Dao.findEltcmpratique2D1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltcmpratique2sansnoms> findAllEltcmpratique2sansnoms() {
        return eltcmpratique2sansnomsDao.findAll();
    }

    @Override
    public Eltcmpratique2sansnoms creerEltcmpratique2sansnoms(Eltcmpratique2sansnoms eltcmpratique2sansnoms) {
        return eltcmpratique2sansnomsDao.create(eltcmpratique2sansnoms);
    }

    @Override
    public Eltcmpratique2sansnoms modifierEltcmpratique2sansnoms(Eltcmpratique2sansnoms eltcmpratique2sansnoms) {
        return eltcmpratique2sansnomsDao.edit(eltcmpratique2sansnoms);
    }

    @Override
    public void supprimerEltcmpratique2sansnoms(Eltcmpratique2sansnoms eltcmpratique2sansnoms) {
        eltcmpratique2sansnomsDao.destroy(eltcmpratique2sansnoms);
    }

    @Override
    public Eltcmpratique2sansnoms findEltcmpratique2sansnomsById(int id) {
        return eltcmpratique2sansnomsDao.find(id);
    }

    @Override
    public Eltcmpratique2sansnoms findEltcmpratique2sansnomsD1GroupeDexamensD1SessionD1Souscentre(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected) {
        return eltcmpratique2sansnomsDao.findEltcmpratique2sansnomsD1GroupeDexamensD1SessionD1Souscentre(anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltcmpratique2sansnoms> findAllEltcmpratique2sansnomsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltcmpratique2sansnomsDao.findEltcmpratique2sansnomsD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    public IEltcmpratique2sansnoms getEltcmpratique2sansnomsDao() {
        return eltcmpratique2sansnomsDao;
    }

    public void setEltcmpratique2sansnomsDao(IEltcmpratique2sansnoms eltcmpratique2sansnomsDao) {
        this.eltcmpratique2sansnomsDao = eltcmpratique2sansnomsDao;
    }

    @Override
    public List<Eltjurypratique2> findAllEltjurypratique2() {
        return eltjurypratique2Dao.findAll();
    }

    @Override
    public Eltjurypratique2 creerEltjurypratique2(Eltjurypratique2 eltjurypratique2) {
        return eltjurypratique2Dao.create(eltjurypratique2);
    }

    @Override
    public Eltjurypratique2 modifierEltjurypratique2(Eltjurypratique2 eltjurypratique2) {
        return eltjurypratique2Dao.edit(eltjurypratique2);
    }

    @Override
    public void supprimerEltjurypratique2(Eltjurypratique2 eltjurypratique2) {
        eltjurypratique2Dao.destroy(eltjurypratique2);
    }

    @Override
    public Eltjurypratique2 findEltjurypratique2ById(int id) {
        return eltjurypratique2Dao.find(id);
    }

    @Override
    public Eltjurypratique2 findEltjurypratique2D1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return eltjurypratique2Dao.findEltjurypratique2D1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltjurypratique2> findAllEltjurypratique2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltjurypratique2Dao.findEltjurypratique2D1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    public IEltjurypratique2 getEltjurypratique2Dao() {
        return eltjurypratique2Dao;
    }

    public void setEltjurypratique2Dao(IEltjurypratique2 eltjurypratique2Dao) {
        this.eltjurypratique2Dao = eltjurypratique2Dao;
    }

    @Override
    public List<Jurypratique2> findAllJurypratique2() {
        return jurypratique2Dao.findAll();
    }

    @Override
    public Jurypratique2 creerJurypratique2(Jurypratique2 jurypratique2) {
        return jurypratique2Dao.create(jurypratique2);
    }

    @Override
    public Jurypratique2 modifierJurypratique2(Jurypratique2 jurypratique2) {
        return jurypratique2Dao.edit(jurypratique2);
    }

    @Override
    public void supprimerJurypratique2(Jurypratique2 jurypratique2) {
        jurypratique2Dao.destroy(jurypratique2);
    }

    @Override
    public Jurypratique2 findJurypratique2ById(int id) {
        return jurypratique2Dao.find(id);
    }

    public IJurypratique2 getJurypratique2Dao() {
        return jurypratique2Dao;
    }

    public void setJurypratique2Dao(IJurypratique2 jurypratique2Dao) {
        this.jurypratique2Dao = jurypratique2Dao;
    }

    @Override
    public Jurypratique2 findJurypratique2D1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected) {
        return jurypratique2Dao.findJurypratique2D1OptionD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected, sigleOptionSelected);
    }

    @Override
    public List<Jurypratique2> findAllJuryspratique2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return jurypratique2Dao.findJuryspratique2D1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Jurydeladmiss> findAllJurydeladmiss() {
        return jurydeladmissDao.findAll();
    }

    @Override
    public Jurydeladmiss creerJurydeladmiss(Jurydeladmiss jurydeladmiss) {
        return jurydeladmissDao.create(jurydeladmiss);
    }

    @Override
    public Jurydeladmiss modifierJurydeladmiss(Jurydeladmiss jurydeladmiss) {
        return jurydeladmissDao.edit(jurydeladmiss);
    }

    @Override
    public void supprimerJurydeladmiss(Jurydeladmiss jurydeladmiss) {
        jurydeladmissDao.destroy(jurydeladmiss);
    }

    @Override
    public Jurydeladmiss findJurydeladmissById(int id) {
        return jurydeladmissDao.find(id);
    }

    public IJurydeladmiss getJurydeladmissDao() {
        return jurydeladmissDao;
    }

    public void setJurydeladmissDao(IJurydeladmiss jurydeladmissDao) {
        this.jurydeladmissDao = jurydeladmissDao;
    }
    
    @Override
    public List<Jurydeladmiss> findAllJurydeladmissD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return jurydeladmissDao.findJurydeladmissD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public Jurydeladmiss findJurydeladmissD1SousfamilleD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        return jurydeladmissDao.findJurydeladmissD1SousfamilleD1CentreD1GroupedexamensD1Session(nomCentreSelected, anneeSelected, niveauSelected, typeSelected, titreSousfamilleSelected);
    }

    @Override
    public List<Epreuve> findAllEpreuves() {
        return epreuveDao.findAll();
    }

    @Override
    public Epreuve creerEpreuve(Epreuve epreuve) {
        return epreuveDao.create(epreuve);
    }

    @Override
    public Epreuve modifierEpreuve(Epreuve epreuve) {
        return epreuveDao.edit(epreuve);
    }

    @Override
    public void supprimerEpreuve(Epreuve epreuve) {
        epreuveDao.destroy(epreuve);
    }

    @Override
    public Epreuve findEpreuveById(int id) {
        return epreuveDao.find(id);
    }

    public IEpreuve getEpreuveDao() {
        return epreuveDao;
    }

    public void setEpreuveDao(IEpreuve epreuveDao) {
        this.epreuveDao = epreuveDao;
    }

    @Override
    public List<Epreuve> findAllEpreuvesLikeTitre(String titre) {
        return epreuveDao.findEpreuvesLikeTitre(titre) ;
    }
    
    @Override
    public List<Epreuve> findAllEpreuvefacs() {
        return epreuveDao.findAllEpreuvefacs();
    }
    
    @Override
    public List<Epreuve> findAllEpreuvesD1Caractere(String caractereSelected) {
        return epreuveDao.findEpreuvesD1Caractere(caractereSelected);
    }

    @Override
    public List<Eltetatmoepreuvefac> findAllEltetatmoepreuvefacs() {
        return eltetatmoepreuvefacDao.findAll();
    }

    @Override
    public Eltetatmoepreuvefac creerEltetatmoepreuvefac(Eltetatmoepreuvefac eltetatmoepreuvefac) {
        return eltetatmoepreuvefacDao.create(eltetatmoepreuvefac);
    }

    @Override
    public Eltetatmoepreuvefac modifierEltetatmoepreuvefac(Eltetatmoepreuvefac eltetatmoepreuvefac) {
        return eltetatmoepreuvefacDao.edit(eltetatmoepreuvefac);
    }

    @Override
    public void supprimerEltetatmoepreuvefac(Eltetatmoepreuvefac eltetatmoepreuvefac) {
        eltetatmoepreuvefacDao.destroy(eltetatmoepreuvefac);
    }

    @Override
    public Eltetatmoepreuvefac findEltetatmoepreuvefacById(int id) {
        return eltetatmoepreuvefacDao.find(id);
    }

    public IEltetatmoepreuvefac getEltetatmoepreuvefacDao() {
        return eltetatmoepreuvefacDao;
    }

    public void setEltetatmoepreuvefacDao(IEltetatmoepreuvefac eltetatmoepreuvefacDao) {
        this.eltetatmoepreuvefacDao = eltetatmoepreuvefacDao;
    }

    @Override
    public Eltetatmoepreuvefac findEltetatmoepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleEpreuvefacSelected) {
        return eltetatmoepreuvefacDao.findEltetatmoepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected, sigleEpreuvefacSelected);
    }

    @Override
    public List<Eltetatmoepreuvefac> findAllEltetatmoepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltetatmoepreuvefacDao.findEltetatmoepreuvefacsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Mopratiquesti> findAllMopratiquestis() {
        return mopratiquestiDao.findAll();
    }

    @Override
    public Mopratiquesti creerMopratiquesti(Mopratiquesti mopratiquesti) {
        return mopratiquestiDao.create(mopratiquesti);
    }

    @Override
    public Mopratiquesti modifierMopratiquesti(Mopratiquesti mopratiquesti) {
        return mopratiquestiDao.edit(mopratiquesti);
    }

    @Override
    public void supprimerMopratiquesti(Mopratiquesti mopratiquesti) {
        mopratiquestiDao.destroy(mopratiquesti);
    }

    @Override
    public Mopratiquesti findMopratiquestiById(int id) {
        return mopratiquestiDao.find(id);
    }

    public IMopratiquesti getMopratiquestiDao() {
        return mopratiquestiDao;
    }

    public void setMopratiquestiDao(IMopratiquesti mopratiquestiDao) {
        this.mopratiquestiDao = mopratiquestiDao;
    }

    @Override
    public List<Mopratiquesti> findAllMopratiquestisD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected,int numprat) {
        return mopratiquestiDao.findMopratiquestisD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected,numprat);
    }

    @Override
    public Mopratiquesti findMopratiquestiD1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected,int numprat) {
        return mopratiquestiDao.findMopratiquestiD1OptionD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected, sigleOptionSelected,numprat);
    }

    @Override
    public List<Matoeuvresf> findAllMatoeuvresfs() {
        return matoeuvresfDao.findAll();
    }

    @Override
    public Matoeuvresf creerMatoeuvresf(Matoeuvresf matoeuvresf) {
        return matoeuvresfDao.create(matoeuvresf);
    }

    @Override
    public Matoeuvresf modifierMatoeuvresf(Matoeuvresf matoeuvresf) {
        return matoeuvresfDao.edit(matoeuvresf);
    }

    @Override
    public void supprimerMatoeuvresf(Matoeuvresf matoeuvresf) {
        matoeuvresfDao.destroy(matoeuvresf);
    }

    @Override
    public Matoeuvresf findMatoeuvresfById(int id) {
        return matoeuvresfDao.find(id);
    } 

    public IMatoeuvresf getMatoeuvresfDao() {
        return matoeuvresfDao;
    }

    public void setMatoeuvresfDao(IMatoeuvresf matoeuvresfDao) {
        this.matoeuvresfDao = matoeuvresfDao;
    }

    @Override
    public Matoeuvresf findMatoeuvresfD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return matoeuvresfDao.findMatoeuvresfD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Matoeuvresf> findAllMatoeuvresfsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return matoeuvresfDao.findMatoeuvresfsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbadmissibles> findAllNbadmissibles() {
        return nbadmissiblesDao.findAll();
    }

    @Override
    public Nbadmissibles creerNbadmissibles(Nbadmissibles nbadmissibles) {
        return nbadmissiblesDao.create(nbadmissibles);
    }

    @Override
    public Nbadmissibles modifierNbadmissibles(Nbadmissibles nbadmissibles) {
        return nbadmissiblesDao.edit(nbadmissibles);
    }

    @Override
    public void supprimerNbadmissibles(Nbadmissibles nbadmissibles) {
        nbadmissiblesDao.destroy(nbadmissibles);
    }

    @Override
    public Nbadmissibles findNbadmissiblesById(int id) {
        return nbadmissiblesDao.find(id);
    }

    public INbadmissibles getNbadmissiblesDao() {
        return nbadmissiblesDao;
    }

    public void setNbadmissiblesDao(INbadmissibles nbadmissiblesDao) {
        this.nbadmissiblesDao = nbadmissiblesDao;
    }

    @Override
    public Nbadmissibles findNbadmissiblesD1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected) {
        return nbadmissiblesDao.findNbadmissiblesD1OptionD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected, sigleOptionSelected);
    }

    @Override
    public List<Nbadmissibles> findAllNbadmissiblesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nbadmissiblesDao.findNbadmissiblesD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Matiere> findAllMatieres() {
        return matiereDao.findAll();
    }

    @Override
    public Matiere creerMatiere(Matiere matiere) {
        return matiereDao.create(matiere);
    }

    @Override
    public Matiere modifierMatiere(Matiere matiere) {
        return matiereDao.edit(matiere);
    }

    @Override
    public void supprimerMatiere(Matiere matiere) {
        matiereDao.destroy(matiere);
    }

    @Override
    public Matiere findMatiereById(int id) {
        return matiereDao.find(id);
    }

    public IMatiere getMatiereDao() {
        return matiereDao;
    }

    public void setMatiereDao(IMatiere matiereDao) {
        this.matiereDao = matiereDao;
    }

    @Override
    public List<Matiere> findAllMatieresLikeNom(String nom) {
        return matiereDao.findMatieresLikeNom(nom);
    }
    
    @Override
    public List<Matiere> findAllMatieresD1Famille(String titreFamilleSelected) {
        return matiereDao.findMatieresD1Famille(titreFamilleSelected);
    }

    @Override
    public Matiere findMatiereByName(String nomMat) {
        return matiereDao.findMatiereByName(nomMat);
    }
    
    @Override
    public List<Deplacecorrect> findAllDeplacecorrects() {
        return deplacecorrectDao.findAll();
    }

    @Override
    public Deplacecorrect creerDeplacecorrect(Deplacecorrect deplacecorrect) {
        return deplacecorrectDao.create(deplacecorrect);
    }

    @Override
    public Deplacecorrect modifierDeplacecorrect(Deplacecorrect deplacecorrect) {
        return deplacecorrectDao.edit(deplacecorrect);
    }

    @Override
    public void supprimerDeplacecorrect(Deplacecorrect deplacecorrect) {
        deplacecorrectDao.destroy(deplacecorrect);
    }

    @Override
    public Deplacecorrect findDeplacecorrectById(int id) {
        return deplacecorrectDao.find(id);
    }

    public IDeplacecorrect getDeplacecorrectDao() {
        return deplacecorrectDao;
    }

    public void setDeplacecorrectDao(IDeplacecorrect deplacecorrectDao) {
        this.deplacecorrectDao = deplacecorrectDao;
    }

    @Override
    public List<Deplacecorrect> findAllDeplacecorrectsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return deplacecorrectDao.findDeplacecorrectsD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }
    
    @Override
    public List<Deplacecorrect> findAllDeplacecorrectsProfessionnelsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return deplacecorrectDao.findDeplacecorrectsProfessionnelsD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }
    
    @Override
    public List<Deplacecorrect> findAllDeplacecorrectsNonProfessionnelsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return deplacecorrectDao.findDeplacecorrectsNonProfessionnelsD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Dureepratique> findAllDureepratique() {
        return dureepratiqueDao.findAll();
    }

    @Override
    public Dureepratique creerDureepratique(Dureepratique dureepratique) {
        return dureepratiqueDao.create(dureepratique);
    }

    @Override
    public Dureepratique modifierDureepratique(Dureepratique dureepratique) {
        return dureepratiqueDao.edit(dureepratique);
    }

    @Override
    public void supprimerDureepratique(Dureepratique dureepratique) {
        dureepratiqueDao.destroy(dureepratique);
    }

    @Override
    public Dureepratique findDureepratiqueById(int id) {
        return dureepratiqueDao.find(id);
    }
    
    @Override
    public List<Dureepratique> findAllDureepratiqueD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected,int numprat) {
        return dureepratiqueDao.findDureespratiqueD1GroupeDexamensD1SessionD1Pratique(anneeSelected, niveauSelected, typeSelected,numprat);
    }
    
    @Override
    public Dureepratique findDureepratiqueD1SouscentreD1GroupeDexamensD1SessionD1SpecialiteEt1Pratique(String nomSouscentre,int anneeSelected, String niveauSelected, String typeSelected, String sigleSpecialiteDureeSelected, int numprat) {
        return dureepratiqueDao.findDureepratiqueD1SouscentreD1GroupeDexamensD1SessionD1SpecialiteEt1Pratique(nomSouscentre,anneeSelected, niveauSelected, typeSelected, sigleSpecialiteDureeSelected, numprat);
    }

    public IDureepratique getDureepratiqueDao() {
        return dureepratiqueDao;
    }

    public void setDureepratiqueDao(IDureepratique dureepratiqueDao) {
        this.dureepratiqueDao = dureepratiqueDao;
    }

    @Override
    public List<Deplacepratique> findAllDeplacepratique() {
        return deplacepratiqueDao.findAll();
    }

    @Override
    public Deplacepratique creerDeplacepratique(Deplacepratique deplacepratique) {
        return deplacepratiqueDao.create(deplacepratique);
    }

    @Override
    public Deplacepratique modifierDeplacepratique(Deplacepratique deplacepratique) {
        return deplacepratiqueDao.edit(deplacepratique);
    }

    @Override
    public void supprimerDeplacepratique(Deplacepratique deplacepratique) {
        deplacepratiqueDao.destroy(deplacepratique);
    }

    @Override
    public Deplacepratique findDeplacepratiqueById(int id) {
        return deplacepratiqueDao.find(id);
    }

    public IDeplacepratique getDeplacepratiqueDao() {
        return deplacepratiqueDao;
    }

    public void setDeplacepratiqueDao(IDeplacepratique deplacepratiqueDao) {
        this.deplacepratiqueDao = deplacepratiqueDao;
    }

    @Override
    public List<Deplacepratique> findAllDeplacepratiquesD1GroupeDexamensD1SessionD1Pratique(int anneeSelected,String niveauSelected, String typeSelected,int numprat) {
        return deplacepratiqueDao.findDeplacepratiquesD1GroupeDexamensD1SessionD1Pratique(anneeSelected,niveauSelected, typeSelected,numprat);
    }
    
    @Override
    public List<Deplacepratique> findAllDeplacepratiquesProfessionnelsD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected, int i) {
        return deplacepratiqueDao.findDeplacepratiquesProfessionnelsD1GroupeDexamensD1SessionD1Pratique(anneeSelected, niveauSelected, typeSelected, i);
    }
    
    @Override
    public List<Deplacepratique> findAllDeplacepratiquesNonProfessionnelsD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected, int numprat) {
        return deplacepratiqueDao.findDeplacepratiquesNonProfessionnelsD1GroupeDexamensD1SessionD1Pratique(anneeSelected, niveauSelected, typeSelected, numprat);
    }

    @Override
    public List<Mopratiquee> findAllMopratiquee() {
        return mopratiqueeDao.findAll();
    }

    @Override
    public Mopratiquee creerMopratiquee(Mopratiquee mopratiquee) {
        return mopratiqueeDao.create(mopratiquee);
    }

    @Override
    public Mopratiquee modifierMopratiquee(Mopratiquee mopratiquee) {
        return mopratiqueeDao.edit(mopratiquee);
    }

    @Override
    public void supprimerMopratiquee(Mopratiquee mopratiquee) {
        mopratiqueeDao.destroy(mopratiquee);
    }

    public IMopratiquee getMopratiqueeDao() {
        return mopratiqueeDao;
    }

    public void setMopratiqueeDao(IMopratiquee mopratiqueeDao) {
        this.mopratiqueeDao = mopratiqueeDao;
    }   

    @Override
    public Mopratiquee findMopratiqueeById(int id) {
        return mopratiqueeDao.find(id);
    }

    @Override
    public Mopratiquee findMopratiqueeD1SouscentreD1SouscentrepratD1GroupedexamensD1Session(String nomSouscentreSelected, String nomSouscentrepratSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return mopratiqueeDao.findMopratiqueeD1SouscentreD1SouscentrepratD1GroupedexamensD1Session(nomSouscentreSelected, nomSouscentrepratSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Mopratiquee> findAllMopratiqueeD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return mopratiqueeDao.findAllMopratiqueeD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Fmissprimchefcentre> findAllFmissprimchefcentre() {
        return fmissprimchefcentreDao.findAll();
    }

    @Override
    public Fmissprimchefcentre creerFmissprimchefcentre(Fmissprimchefcentre fmissprimchefcentre) {
        return fmissprimchefcentreDao.create(fmissprimchefcentre);
    }

    @Override
    public Fmissprimchefcentre modifierFmissprimchefcentre(Fmissprimchefcentre fmissprimchefcentre) {
        return fmissprimchefcentreDao.edit(fmissprimchefcentre);
    }

    @Override
    public void supprimerFmissprimchefcentre(Fmissprimchefcentre fmissprimchefcentre) {
        fmissprimchefcentreDao.destroy(fmissprimchefcentre);
    }

    @Override
    public Fmissprimchefcentre findFmissprimchefcentreById(int id) {
        return fmissprimchefcentreDao.find(id);
    }

    public IFmissprimchefcentre getFmissprimchefcentreDao() {
        return fmissprimchefcentreDao;
    }

    public void setFmissprimchefcentreDao(IFmissprimchefcentre fmissprimchefcentreDao) {
        this.fmissprimchefcentreDao = fmissprimchefcentreDao;
    }

    @Override
    public List<Fmissprimchefcentre> findAllFmissprimchefcentresD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return fmissprimchefcentreDao.findFmissprimchefcentresD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Inscritsprives> findAllInscritsprives() {
        return inscritsprivesDao.findAll();
    }

    @Override
    public Inscritsprives creerInscritsprives(Inscritsprives inscritsprives) {
        return inscritsprivesDao.create(inscritsprives);
    }

    @Override
    public Inscritsprives modifierInscritsprives(Inscritsprives inscritsprives) {
        return inscritsprivesDao.edit(inscritsprives);
    }

    @Override
    public void supprimerInscritsprives(Inscritsprives inscritsprives) {
        inscritsprivesDao.destroy(inscritsprives);
    }

    @Override
    public Inscritsprives findInscritsprivesById(int id) {
        return inscritsprivesDao.find(id);
    }

    public IInscritsprives getInscritsprivesDao() {
        return inscritsprivesDao;
    }

    public void setInscritsprivesDao(IInscritsprives inscritsprivesDao) {
        this.inscritsprivesDao = inscritsprivesDao;
    }

    @Override
    public Inscritsprives findInscritsprivesD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, String niveauSelected, String typeSelected, int anneeSelected) {
        return inscritsprivesDao.findInscritsprivesD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, niveauSelected, typeSelected, anneeSelected);
    }

    @Override
    public List<Inscritsprives> findAllInscritsprivesD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return inscritsprivesDao.findInscritsprivesD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    public IEltcorrecttech getEltcorrecttechDao() {
        return eltcorrecttechDao;
    }

    public void setEltcorrecttechDao(IEltcorrecttech eltcorrecttechDao) {
        this.eltcorrecttechDao = eltcorrecttechDao;
    }

    public IPonderation getPonderationDao() {
        return ponderationDao;
    }

    public void setPonderationDao(IPonderation ponderationDao) {
        this.ponderationDao = ponderationDao;
    }
    
    @Override
    public List<Eltcorrecttech> findAllEltcorrecttech() {
        return eltcorrecttechDao.findAll();
    }

    @Override
    public Eltcorrecttech creerEltcorrecttech(Eltcorrecttech eltcorrecttech) {
        return eltcorrecttechDao.create(eltcorrecttech);
    }

    @Override
    public Eltcorrecttech modifierEltcorrecttech(Eltcorrecttech eltcorrecttech) {
        return eltcorrecttechDao.edit(eltcorrecttech);
    }

    @Override
    public void supprimerEltcorrecttech(Eltcorrecttech eltcorrecttech) {
        eltcorrecttechDao.destroy(eltcorrecttech);
    }

    @Override
    public Eltcorrecttech findEltcorrecttechById(int id) {
        return eltcorrecttechDao.find(id);
    }
    
    @Override
    public Eltcorrecttech findEltcorrecttechD1NatureD1SousfamilleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected, String natureSelected) {
        return eltcorrecttechDao.findEltcorrecttechD1NatureD1SousfamilleD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected, titreSousfamilleSelected, natureSelected);
    }
    
    @Override
    public List<Eltcorrecttech> findAllEltcorrecttechsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltcorrecttechDao.findEltcorrecttechsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Ponderation> findAllPonderation() {
        return ponderationDao.findAll();
    }

    @Override
    public Ponderation creerPonderation(Ponderation ponderation) {
        return ponderationDao.create(ponderation);
    }

    @Override
    public Ponderation modifierPonderation(Ponderation ponderation) {
        return ponderationDao.edit(ponderation);
    }

    @Override
    public void supprimerPonderation(Ponderation ponderation) {
        ponderationDao.destroy(ponderation);
    }

    @Override
    public Ponderation findPonderationById(int id) {
        return ponderationDao.find(id);
    }

    @Override
    public Ponderation findPonderationD1GroupedexamensD1NatureEtD1Sousfamille(String typeSelected, String niveauSelected, String natureSelected, String sousfamilleSelected) {
        return ponderationDao.findPonderationD1GroupedexamensD1NatureEtD1Sousfamille(typeSelected, niveauSelected, natureSelected, sousfamilleSelected);
    }

    @Override
    public List<Ponderation> findAllPonderationsD1Groupedexamens(String niveauSelected, String typeSelected) {
        return ponderationDao.findPonderationsD1Groupedexamens(niveauSelected, typeSelected);
    }

    @Override
    public List<Eltpratiqueti> findAllEltpratiqueti() {
        return eltpratiquetiDao.findAll();
    }

    @Override
    public Eltpratiqueti creerEltpratiqueti(Eltpratiqueti eltpratiqueti) {
        return eltpratiquetiDao.create(eltpratiqueti);
    }

    @Override
    public Eltpratiqueti modifierEltpratiqueti(Eltpratiqueti eltpratiqueti) {
        return eltpratiquetiDao.edit(eltpratiqueti);
    }

    @Override
    public void supprimerEltpratiqueti(Eltpratiqueti eltpratiqueti) {
        eltpratiquetiDao.destroy(eltpratiqueti);
    }

    @Override
    public Eltpratiqueti findEltpratiquetiById(int id) {
        return eltpratiquetiDao.find(id);
    }

    public IEltpratiqueti getEltpratiquetiDao() {
        return eltpratiquetiDao;
    }

    public void setEltpratiquetiDao(IEltpratiqueti eltpratiquetiDao) {
        this.eltpratiquetiDao = eltpratiquetiDao;
    }

    @Override
    public List<Eltpratiqueti> findAllEltpratiquetiD1Session(int anneeSelected) {
        return eltpratiquetiDao.findAllEltpratiquetiD1Session(anneeSelected);
    }

    @Override
    public Eltpratiqueti findEltpratiquetiD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected) {
        return eltpratiquetiDao.findEltpratiquetiD1SouscentreD1Session(nomSouscentreSelected, anneeSelected);
    }

    @Override
    public List<Eltpratiquestt> findAllEltpratiquestt() {
        return eltpratiquesttDao.findAll();
    }

    @Override
    public Eltpratiquestt creerEltpratiquestt(Eltpratiquestt eltpratiquestt) {
        return eltpratiquesttDao.create(eltpratiquestt);
    }

    @Override
    public Eltpratiquestt modifierEltpratiquestt(Eltpratiquestt eltpratiquestt) {
        return eltpratiquesttDao.edit(eltpratiquestt);
    }

    @Override
    public void supprimerEltpratiquestt(Eltpratiquestt eltpratiquestt) {
        eltpratiquesttDao.destroy(eltpratiquestt);
    }

    @Override
    public Eltpratiquestt findEltpratiquesttById(int id) {
        return eltpratiquesttDao.find(id);
    }

    @Override
    public List<Eltpratiquestt> findAllEltpratiquesttD1Session(int anneeSelected) {
        return eltpratiquesttDao.findAllEltpratiquesttD1Session(anneeSelected);
    }

    @Override
    public Eltpratiquestt findEltpratiquesttD1SouscentreD1OptionD1Session(String nomSouscentreSelected, String sigleOptionSelected, int anneeSelected) {
        return eltpratiquesttDao.findEltpratiquesttD1SouscentreD1OptionD1Session(nomSouscentreSelected, sigleOptionSelected, anneeSelected);
    }
    
    @Override
    public List<Eltpratiquestt> findAllEltpratiquesttD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected) {
        return eltpratiquesttDao.findAllEltpratiquesttD1GroupedexamensD1Session(niveauSelected, typeSelected, anneeSelected);
    }

    public IEltpratiquestt getEltpratiquesttDao() {
        return eltpratiquesttDao;
    }

    public void setEltpratiquesttDao(IEltpratiquestt eltpratiquesttDao) {
        this.eltpratiquesttDao = eltpratiquesttDao;
    }

    @Override
    public List<Eltpratiquinfo> findAllEltpratiquinfo() {
        return eltpratiquinfoDao.findAll();
    }

    @Override
    public Eltpratiquinfo creerEltpratiquinfo(Eltpratiquinfo eltpratiquinfo) {
        return eltpratiquinfoDao.create(eltpratiquinfo);
    }

    @Override
    public Eltpratiquinfo modifierEltpratiquinfo(Eltpratiquinfo eltpratiquinfo) {
        return eltpratiquinfoDao.edit(eltpratiquinfo);
    }

    @Override
    public void supprimerEltpratiquinfo(Eltpratiquinfo eltpratiquinfo) {
        eltpratiquinfoDao.destroy(eltpratiquinfo);
    }

    @Override
    public Eltpratiquinfo findEltpratiquinfoById(int id) {
        return eltpratiquinfoDao.find(id);
    }

    public IEltpratiquinfo getEltpratiquinfoDao() {
        return eltpratiquinfoDao;
    }

    public void setEltpratiquinfoDao(IEltpratiquinfo eltpratiquinfoDao) {
        this.eltpratiquinfoDao = eltpratiquinfoDao;
    }

    @Override
    public List<Eltpratiquinfo> findAllEltpratiquinfoD1GroupedexamensD1Session(int anneeSelected,String niveauSelected,String typeSelected) {
        return eltpratiquinfoDao.findAllEltpratiquinfoD1GroupedexamensD1Session(anneeSelected,niveauSelected,typeSelected);
    }

    @Override
    public Eltpratiquinfo findEltpratiquinfoD1GroupedexamensD1SouscentreD1Session(String niveauSelected, String typeSelected,String nomSouscentreSelected, int anneeSelected) {
        return eltpratiquinfoDao.findEltpratiquinfoD1GroupedexamensD1SouscentreD1Session(niveauSelected, typeSelected,nomSouscentreSelected, anneeSelected);
    }        
    
    public IEltpratique1ind getEltpratique1indDao() {
        return eltpratique1indDao;
    }

    public void setEltpratique1indDao(IEltpratique1ind eltpratique1indDao) {
        this.eltpratique1indDao = eltpratique1indDao;
    }

    @Override
    public List<Eltpratique1ind> findAllEltpratique1ind() {
        return eltpratique1indDao.findAll();
    }

    @Override
    public Eltpratique1ind creerEltpratique1ind(Eltpratique1ind eltpratique1ind) {
        return eltpratique1indDao.create(eltpratique1ind);
    }

    @Override
    public Eltpratique1ind modifierEltpratique1ind(Eltpratique1ind eltpratique1ind) {
        return eltpratique1indDao.edit(eltpratique1ind);
    }

    @Override
    public void supprimerEltpratique1ind(Eltpratique1ind eltpratique1ind) {
        eltpratique1indDao.destroy(eltpratique1ind);
    }

    @Override
    public Eltpratique1ind findEltpratique1indById(int id) {
        return eltpratique1indDao.find(id);
    }

    @Override
    public List<Eltpratique1ind> findAllEltpratique1indD1Session(int anneeSelected) {
        return eltpratique1indDao.findAllEltpratique1indD1Session(anneeSelected);
    }

    @Override
    public Eltpratique1ind findEltpratique1indD1SouscentreD1OptionD1Session(String nomSouscentreSelected, String sigleOptionSelected, int anneeSelected) {
        return eltpratique1indDao.findEltpratique1indD1SouscentreD1OptionD1Session(nomSouscentreSelected, sigleOptionSelected, anneeSelected);
    }

    @Override
    public List<Eltpratique1ind> findAllEltpratique1indD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected) {
        return eltpratique1indDao.findAllEltpratique1indD1GroupedexamensD1Session(niveauSelected, typeSelected, anneeSelected);
    }

    @Override
    public List<Elttranscriptepreuve> findAllElttranscriptepreuve() {
        return elttranscriptepreuveDao.findAll();
    }

    @Override
    public Elttranscriptepreuve creerElttranscriptepreuve(Elttranscriptepreuve elttranscriptepreuve) {
        return elttranscriptepreuveDao.create(elttranscriptepreuve);
    }

    @Override
    public Elttranscriptepreuve modifierElttranscriptepreuve(Elttranscriptepreuve elttranscriptepreuve) {
        return elttranscriptepreuveDao.edit(elttranscriptepreuve);
    }

    @Override
    public void supprimerElttranscriptepreuve(Elttranscriptepreuve elttranscriptepreuve) {
        elttranscriptepreuveDao.destroy(elttranscriptepreuve);
    }

    @Override
    public Elttranscriptepreuve findElttranscriptepreuveById(int id) {
        return elttranscriptepreuveDao.find(id);
    }
    
    @Override
    public List<Elttranscriptepreuve> findAllElttranscriptepreuveD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return elttranscriptepreuveDao.findAllElttranscriptepreuveD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltvacpratepreuvefac> findAllEltvacpratepreuvefac() {
        return eltvacpratepreuvefacDao.findAll();
    }

    @Override
    public Eltvacpratepreuvefac creerEltvacpratepreuvefac(Eltvacpratepreuvefac eltvacpratepreuvefac) {
        return eltvacpratepreuvefacDao.create(eltvacpratepreuvefac);
    }

    @Override
    public Eltvacpratepreuvefac modifierEltvacpratepreuvefac(Eltvacpratepreuvefac eltvacpratepreuvefac) {
        return eltvacpratepreuvefacDao.edit(eltvacpratepreuvefac);
    }

    @Override
    public void supprimerEltvacpratepreuvefac(Eltvacpratepreuvefac eltvacpratepreuvefac) {
        eltvacpratepreuvefacDao.destroy(eltvacpratepreuvefac);
    }

    @Override
    public Eltvacpratepreuvefac findEltvacpratepreuvefacById(int id) {
        return eltvacpratepreuvefacDao.find(id);
    }

    @Override
    public List<Eltvacpratepreuvefac> findAllEltvacpratepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltvacpratepreuvefacDao.findEltvacpratepreuvefacsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public Eltvacpratepreuvefac findEltvacpratepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleEpreuvefacSelected) {
        return eltvacpratepreuvefacDao.findEltvacpratepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected, sigleEpreuvefacSelected);
    }

    public IElttranscriptepreuve getElttranscriptepreuveDao() {
        return elttranscriptepreuveDao;
    }

    public void setElttranscriptepreuveDao(IElttranscriptepreuve elttranscriptepreuveDao) {
        this.elttranscriptepreuveDao = elttranscriptepreuveDao;
    }

    public IEltvacpratepreuvefac getEltvacpratepreuvefacDao() {
        return eltvacpratepreuvefacDao;
    }

    public void setEltvacpratepreuvefacDao(IEltvacpratepreuvefac eltvacpratepreuvefacDao) {
        this.eltvacpratepreuvefacDao = eltvacpratepreuvefacDao;
    }

    @Override
    public List<Rattachventilationspeciale> findAllRattachventilationspeciale() {
        return rattachventilationspecialeDao.findAll();
    }

    @Override
    public Rattachventilationspeciale creerRattachventilationspeciale(Rattachventilationspeciale rattachventilationspeciale) {
        return rattachventilationspecialeDao.create(rattachventilationspeciale);
    }

    @Override
    public Rattachventilationspeciale modifierRattachventilationspeciale(Rattachventilationspeciale rattachventilationspeciale) {
        return rattachventilationspecialeDao.edit(rattachventilationspeciale);
    }

    @Override
    public void supprimerRattachventilationspeciale(Rattachventilationspeciale rattachventilationspeciale) {
        rattachventilationspecialeDao.destroy(rattachventilationspeciale);
    }

    @Override
    public Rattachventilationspeciale findRattachventilationspecialeById(int id) {
        return rattachventilationspecialeDao.find(id);
    }

    public IRattachventilationspeciale getRattachventilationspecialeDao() {
        return rattachventilationspecialeDao;
    }

    public void setRattachventilationspecialeDao(IRattachventilationspeciale rattachventilationspecialeDao) {
        this.rattachventilationspecialeDao = rattachventilationspecialeDao;
    }

    @Override
    public Rattachventilationspeciale findRattachventilationspecialeD1Centreventilationspeciale(String abreviation) {
        return rattachventilationspecialeDao.findRattachventilationspecialeD1Centreventilationspeciale(abreviation);
    }

    @Override
    public List<Rattachventilationspeciale> findAllRattachventilationspeciauxD1CentreTri(String abreviation) {
        return rattachventilationspecialeDao.findAllRattachventilationspeciauxD1CentreTri(abreviation);
    }       

    @Override
    public List<Elttranscriptcopie> findAllElttranscriptcopie() {
        return elttranscriptcopieDao.findAll();
    }

    @Override
    public Elttranscriptcopie creerElttranscriptcopie(Elttranscriptcopie elttranscriptcopie) {
        return elttranscriptcopieDao.create(elttranscriptcopie);
    }

    @Override
    public Elttranscriptcopie modifierElttranscriptcopie(Elttranscriptcopie elttranscriptcopie) {
        return elttranscriptcopieDao.edit(elttranscriptcopie);
    }

    @Override
    public void supprimerElttranscriptcopie(Elttranscriptcopie elttranscriptcopie) {
        elttranscriptcopieDao.destroy(elttranscriptcopie);
    }

    @Override
    public Elttranscriptcopie findElttranscriptcopieById(int id) {
        return elttranscriptcopieDao.find(id);
    }

    public IElttranscriptcopie getElttranscriptcopieDao() {
        return elttranscriptcopieDao;
    }

    public void setElttranscriptcopieDao(IElttranscriptcopie elttranscriptcopieDao) {
        this.elttranscriptcopieDao = elttranscriptcopieDao;
    }
    
    @Override
    public List<Elttranscriptcopie> findAllElttranscriptcopieD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return elttranscriptcopieDao.findAllElttranscriptcopieD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbentetes> findAllNbentetes() {
        return nbentetesDao.findAll();
    }

    @Override
    public Nbentetes creerNbentetes(Nbentetes nbentetes) {
        return nbentetesDao.create(nbentetes);
    }

    @Override
    public Nbentetes modifierNbentetes(Nbentetes nbentetes) {
        return nbentetesDao.edit(nbentetes);
    }

    @Override
    public void supprimerNbentetes(Nbentetes nbentetes) {
        nbentetesDao.destroy(nbentetes);
    }

    @Override
    public Nbentetes findNbentetesById(int id) {
        return nbentetesDao.find(id);
    }

    public INbentetes getNbentetesDao() {
        return nbentetesDao;
    }

    public void setNbentetesDao(INbentetes nbentetesDao) {
        this.nbentetesDao = nbentetesDao;
    }   

    @Override
    public List<Nbentetes> findAllNbentetesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nbentetesDao.findAllNbentetesD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public Nbentetes findNbentetesD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return nbentetesDao.findNbentetesD1CentredeliberationD1GroupedexamensD1Session(nomCentredeliberationSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbinaptes> findAllNbinaptes() {
        return nbinaptesDao.findAll();
    }

    @Override
    public Nbinaptes creerNbinaptes(Nbinaptes nb) {
        return nbinaptesDao.create(nb);
    }

    @Override
    public Nbinaptes modifierNbinaptes(Nbinaptes nb) {
        return nbinaptesDao.edit(nb);
    }

    @Override
    public void supprimerNbinaptes(Nbinaptes nb) {
        nbinaptesDao.destroy(nb);
    }

    @Override
    public Nbinaptes findNbinaptesById(int id) {
        return nbinaptesDao.find(id);
    }

    @Override
    public Nbinaptes findNbinaptesD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return nbinaptesDao.findNbinaptesD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbinaptes> findAllNbinaptesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nbinaptesDao.findAllNbinaptesD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    public INbinaptes getNbinaptesDao() {
        return nbinaptesDao;
    }

    public void setNbinaptesDao(INbinaptes nbinaptesDao) {
        this.nbinaptesDao = nbinaptesDao;
    }

    @Override
    public List<Nblivrets> findAllNblivrets() {
        return nblivretsDao.findAll();
    }

    @Override
    public Nblivrets creerNblivrets(Nblivrets nb) {
        return nblivretsDao.create(nb);
    }

    @Override
    public Nblivrets modifierNblivrets(Nblivrets nb) {
        return nblivretsDao.edit(nb);
    }

    @Override
    public void supprimerNblivrets(Nblivrets nb) {
        nblivretsDao.destroy(nb);
    }

    @Override
    public Nblivrets findNblivretsById(int id) {
        return nblivretsDao.find(id);
    }

    public INblivrets getNblivretsDao() {
        return nblivretsDao;
    }

    public void setNblivretsDao(INblivrets nblivretsDao) {
        this.nblivretsDao = nblivretsDao;
    }

    @Override
    public List<Nblivrets> findAllNblivretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nblivretsDao.findAllNblivretsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public Nblivrets findNblivretsD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return nblivretsDao.findNblivretsD1CentredeliberationD1GroupedexamensD1Session(nomCentredeliberationSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbnotesprat2> findAllNbnotesprat2() {
        return nbnotesprat2Dao.findAll();
    }

    @Override
    public Nbnotesprat2 creerNbnotesprat2(Nbnotesprat2 nb) {
        return nbnotesprat2Dao.create(nb);
    }

    @Override
    public Nbnotesprat2 modifierNbnotesprat2(Nbnotesprat2 nb) {
        return nbnotesprat2Dao.edit(nb);
    }

    @Override
    public void supprimerNbnotesprat2(Nbnotesprat2 nb) {
        nbnotesprat2Dao.destroy(nb);
    }

    @Override
    public Nbnotesprat2 findNbnotesprat2ById(int id) {
        return nbnotesprat2Dao.find(id);
    }

    public INbnotesprat2 getNbnotesprat2Dao() {
        return nbnotesprat2Dao;
    }

    public void setNbnotesprat2Dao(INbnotesprat2 nbnotesprat2Dao) {
        this.nbnotesprat2Dao = nbnotesprat2Dao;
    }    

    @Override
    public List<Nbnotesprat2> findAllNbnotesprat2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nbnotesprat2Dao.findAllNbnotesprat2D1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public Nbnotesprat2 findNbnotesprat2D1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return nbnotesprat2Dao.findNbnotesprat2D1CentredeliberationD1GroupedexamensD1Session(nomCentredeliberationSelected, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltcomeval> findAllEltcomeval() {
        return eltcomevalDao.findAll();
    }

    @Override
    public Eltcomeval creerEltcomeval(Eltcomeval eltcomeval) {
        return eltcomevalDao.create(eltcomeval);
    }

    @Override
    public Eltcomeval modifierEltcomeval(Eltcomeval eltcomeval) {
        return eltcomevalDao.edit(eltcomeval);
    }

    @Override
    public void supprimerEltcomeval(Eltcomeval eltcomeval) {
        eltcomevalDao.destroy(eltcomeval);
    }

    @Override
    public Eltcomeval findEltcomevalById(int id) {
        return eltcomevalDao.find(id);
    }

    public IEltcomeval getEltcomevalDao() {
        return eltcomevalDao;
    }

    public void setEltcomevalDao(IEltcomeval eltcomevalDao) {
        this.eltcomevalDao = eltcomevalDao;
    }

    @Override
    public List<Eltcomeval> findAllEltcomevalD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltcomevalDao.findAllEltcomevalD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbcandlibresg> findAllNbcandlibresg() {
        return nbcandlibresgDao.findAll();
    }

    @Override
    public Nbcandlibresg creerNbcandlibresg(Nbcandlibresg nbcand) {
        return nbcandlibresgDao.create(nbcand);
    }

    @Override
    public Nbcandlibresg modifierNbcandlibresg(Nbcandlibresg nbcand) {
        return nbcandlibresgDao.edit(nbcand);
    }

    @Override
    public void supprimerNbcandlibresg(Nbcandlibresg nbcand) {
        nbcandlibresgDao.destroy(nbcand);
    }

    @Override
    public Nbcandlibresg findNbcandlibresgById(int id) {
        return nbcandlibresgDao.find(id);
    }
    
    @Override
    public List<Nbcandlibresg> findAllNbcandlibresgD1Session(int anneeSelected) {
        return nbcandlibresgDao.findAllNbcandlibresgD1Session(anneeSelected);
    }

    @Override
    public Nbcandlibresg findNbcandlibresgD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected) {
        return nbcandlibresgDao.findNbcandlibresgD1SouscentreD1Session(nomSouscentreSelected, anneeSelected);
    }

    @Override
    public List<Nbcandlibrestp> findAllNbcandlibrestp() {
        return nbcandlibrestpDao.findAll();
    }

    @Override
    public Nbcandlibrestp creerNbcandlibrestp(Nbcandlibrestp nbcand) {
        return nbcandlibrestpDao.create(nbcand);
    }

    @Override
    public Nbcandlibrestp modifierNbcandlibrestp(Nbcandlibrestp nbcand) {
        return nbcandlibrestpDao.edit(nbcand);
    }

    @Override
    public void supprimerNbcandlibrestp(Nbcandlibrestp nbcand) {
        nbcandlibrestpDao.destroy(nbcand);
    }

    @Override
    public Nbcandlibrestp findNbcandlibrestpById(int id) {
        return nbcandlibrestpDao.find(id);
    }
    
    @Override
    public List<Nbcandlibrestp> findAllNbcandlibrestpD1Session(int anneeSelected) {
        return nbcandlibrestpDao.findAllNbcandlibrestpD1Session(anneeSelected);
    }

    @Override
    public Nbcandlibrestp findNbcandlibrestpD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected) {
        return nbcandlibrestpDao.findNbcandlibrestpD1SouscentreD1Session(nomSouscentreSelected, anneeSelected);
    }

    public INbcandlibrestp getNbcandlibrestpDao() {
        return nbcandlibrestpDao;
    }
    
    public void setNbcandlibrestpDao(INbcandlibrestp nbcandlibrestpDao) {
        this.nbcandlibrestpDao = nbcandlibrestpDao;
    }

    public INbcandlibresg getNbcandlibresgDao() {
        return nbcandlibresgDao;
    }

    public void setNbcandlibresgDao(INbcandlibresg nbcandlibresgDao) {
        this.nbcandlibresgDao = nbcandlibresgDao;
    }

    @Override
    public List<Eltharmo> findAllEltharmo() {
        return eltharmoDao.findAll();
    }

    @Override
    public Eltharmo creerEltharmo(Eltharmo eltharmo) {
        return eltharmoDao.create(eltharmo);
    }

    @Override
    public Eltharmo modifierEltharmo(Eltharmo eltharmo) {
        return eltharmoDao.edit(eltharmo);
    }

    @Override
    public void supprimerEltharmo(Eltharmo eltharmo) {
        eltharmoDao.destroy(eltharmo);
    }

    @Override
    public Eltharmo findEltharmoById(int id) {
        return eltharmoDao.find(id);
    }

    public IEltharmo getEltharmoDao() {
        return eltharmoDao;
    }

    public void setEltharmoDao(IEltharmo eltharmoDao) {
        this.eltharmoDao = eltharmoDao;
    }

    @Override
    public List<Eltharmo> findAllEltharmoD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltharmoDao.findAllEltharmoD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltcoordo> findAllEltcoordo() {
        return eltcoordoDao.findAll();
    }

    @Override
    public Eltcoordo creerEltcoordo(Eltcoordo eltcoordo) {
        return eltcoordoDao.create(eltcoordo);
    }

    @Override
    public Eltcoordo modifierEltcoordo(Eltcoordo eltcoordo) {
        return eltcoordoDao.edit(eltcoordo);
    }

    @Override
    public void supprimerEltcoordo(Eltcoordo eltcoordo) {
        eltcoordoDao.destroy(eltcoordo);
    }

    @Override
    public Eltcoordo findEltcoordoById(int id) {
        return eltcoordoDao.find(id);
    }

    public IEltcoordo getEltcoordoDao() {
        return eltcoordoDao;
    }

    public void setEltcoordoDao(IEltcoordo eltcoordoDao) {
        this.eltcoordoDao = eltcoordoDao;
    }   

    @Override
    public List<Eltcoordo> findAllEltcoordoD1Session(int anneeSelected) {
        return eltcoordoDao.findAllEltcoordoD1Session(anneeSelected);
    }

    @Override
    public List<Eltpermanence> findAllEltpermanence() {
        return eltpermanenceDao.findAll();
    }

    @Override
    public Eltpermanence creerEltpermanence(Eltpermanence eltpermanence) {
        return eltpermanenceDao.create(eltpermanence);
    }

    @Override
    public Eltpermanence modifierEltpermanence(Eltpermanence eltpermanence) {
        return eltpermanenceDao.edit(eltpermanence);
    }

    @Override
    public void supprimerEltpermanence(Eltpermanence eltpermanence) {
        eltpermanenceDao.destroy(eltpermanence);
    }

    @Override
    public Eltpermanence findEltpermanenceById(int id) {
        return eltpermanenceDao.find(id);
    }

    @Override
    public List<Eltpermanence> findAllEltpermanenceD1Session(int anneeSelected) {
        return eltpermanenceDao.findAllEltpermanenceD1Session(anneeSelected);
    }

    public IEltpermanence getEltpermanenceDao() {
        return eltpermanenceDao;
    }

    public void setEltpermanenceDao(IEltpermanence eltpermanenceDao) {
        this.eltpermanenceDao = eltpermanenceDao;
    }
    
    @Override
    public List<Statsecretariat> findAllStatsecretariat() {
        return statsecretariatDao.findAll();
    }

    @Override
    public Statsecretariat creerStatsecretariat(Statsecretariat statsecretariat) {
        return statsecretariatDao.create(statsecretariat);
    }

    @Override
    public Statsecretariat modifierStatsecretariat(Statsecretariat statsecretariat) {
        return statsecretariatDao.edit(statsecretariat);
    }

    @Override
    public void supprimerStatsecretariat(Statsecretariat statsecretariat) {
        statsecretariatDao.destroy(statsecretariat);
    }

    @Override
    public Statsecretariat findStatsecretariatById(int id) {
        return statsecretariatDao.find(id);
    }

    public IStatsecretariat getStatsecretariatDao() {
        return statsecretariatDao;
    }

    public void setStatsecretariatDao(IStatsecretariat statsecretariatDao) {
        this.statsecretariatDao = statsecretariatDao;
    } 
    
     @Override
    public List<Statsecretariat> findAllStatsecretariatsD1SecretariatD1SouscentreA1ExamenDans1Session(int numsec, int anneeSelected, String nomSouscentreSelected, String sigleExamenSelected) {
        return statsecretariatDao.findStatsecretariatsD1SecretariatD1SouscentreA1ExamenDans1Session(numsec, anneeSelected, nomSouscentreSelected, sigleExamenSelected);
    }

    @Override
    public List<Statsecretariat> findAllStatsecretariatsD1SouscentreA1ExamenDans1Session(int anneeSelected, String nomSouscentreSelected, String sigleExamenSelected) {
        return statsecretariatDao.findStatsecretariatsD1SouscentreA1ExamenDans1Session(anneeSelected, nomSouscentreSelected, sigleExamenSelected);
    }

    @Override
    public List<Statsecretariat> findAllStatsecretariatsD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected) {
        return statsecretariatDao.findStatsecretariatsD1ExamenDans1Session(anneeSelected, sigleExamenSelected);
    }
    
    @Override
    public List<Statsecretariat> findAllStatsecretariatsD1SouscentreA1SessionEt1Groupedexamens(String nomsouscent, int anneeSelected, String niveauSelected, String typeSelected) {
        return statsecretariatDao.findStatsecretariatsD1SouscentreA1SessionEt1Groupedexamens(nomsouscent, anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Statsecretariat> findAllStatsecretariatsABID1ExamenDans1Session(String sigle, int anneeSelected) {
        return statsecretariatDao.findStatsecretariatsABID1ExamenDans1Session(sigle, anneeSelected);
    }

    @Override
    public List<Statsecretariat> findAllStatsecretariatsAutresLitterairesD1ExamenDans1Session(String sigle, int anneeSelected) {
        return statsecretariatDao.findStatsecretariatsAutresLitterairesD1ExamenDans1Session(sigle, anneeSelected);
    }

    @Override
    public List<Statsecretariat> findAllStatsecretariatsScientifiquesD1ExamenDans1Session(String sigle, int anneeSelected) {
        return statsecretariatDao.findStatsecretariatsScientifiquesD1ExamenDans1Session(sigle, anneeSelected);
    }
    
    @Override
    public List<Intervenantsecret> findAllIntervenantsecret() {
        return intervenantsecretDao.findAll();
    }

    @Override
    public Intervenantsecret creerIntervenantsecret(Intervenantsecret intervenantsecret) {
        return intervenantsecretDao.create(intervenantsecret);
    }

    @Override
    public Intervenantsecret modifierIntervenantsecret(Intervenantsecret intervenantsecret) {
        return intervenantsecretDao.edit(intervenantsecret);
    }

    @Override
    public void supprimerIntervenantsecret(Intervenantsecret intervenantsecret) {
        intervenantsecretDao.destroy(intervenantsecret);
    }

    @Override
    public Intervenantsecret findIntervenantsecretById(int id) {
        return intervenantsecretDao.find(id);
    }

    public IIntervenantsecret getIntervenantsecretDao() {
        return intervenantsecretDao;
    }

    public void setIntervenantsecretDao(IIntervenantsecret intervenantsecretDao) {
        this.intervenantsecretDao = intervenantsecretDao;
    }

    @Override
    public List<Intervenantsecret> findAllIntervenantsecretD1GroupedexamensD1SouscentreA1SessionD1ActiviteEt1Qualite(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titreQualiteSelected) {
        return intervenantsecretDao.findIntervenantsecretD1GroupedexamensD1SouscentreA1SessionD1ActiviteEt1Qualite(anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected, phase, titreQualiteSelected);
    }
    
    @Override
    public Intervenantsecret findIntervenantsecretByNomEtPrenomD1GroupeDexamensD1SessionD1SecretariatD1ActiviteEt1Qualite(String nompers, String prenom, int anneeSelected, String nomSouscentreSelected,int numsecSelected, String niveauSelected, String typeSelected, String phase, String titreQualite) {
        return intervenantsecretDao.findIntervenantsecretByNomEtPrenomD1GroupeDexamensD1SessionD1SecretariatD1ActiviteEt1Qualite(nompers, prenom, anneeSelected, nomSouscentreSelected,numsecSelected, niveauSelected, typeSelected, phase, titreQualite);
    }

    @Override
    public List<Intervenantsecret> findAllIntervenantsecretD1GroupedexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titreQualiteSelected) {
        return intervenantsecretDao.findIntervenantsecretD1GroupedexamensD1SessionD1ActiviteEt1Qualite(anneeSelected, niveauSelected, typeSelected, phase, titreQualiteSelected);
    }

    @Override
    public List<Nbcandepreuvefac> findAllNbcandepreuvefac() {
        return nbcandepreuvefacDao.findAll();
    }

    @Override
    public Nbcandepreuvefac creerNbcandepreuvefac(Nbcandepreuvefac nbcandepreuvefac) {
        return nbcandepreuvefacDao.create(nbcandepreuvefac);
    }

    @Override
    public Nbcandepreuvefac modifierNbcandepreuvefac(Nbcandepreuvefac nbcandepreuvefac) {
        return nbcandepreuvefacDao.edit(nbcandepreuvefac);
    }

    @Override
    public void supprimerNbcandepreuvefac(Nbcandepreuvefac nbcandepreuvefac) {
        nbcandepreuvefacDao.destroy(nbcandepreuvefac);
    }

    @Override
    public Nbcandepreuvefac findNbcandepreuvefacById(int id) {
        return nbcandepreuvefacDao.find(id);
    }

    @Override
    public List<Nbcandepreuvefac> findAllNbcandepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nbcandepreuvefacDao.findNbcandepreuvefacsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public Nbcandepreuvefac findNbcandepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String nomEpreuvefacSelected) {
        return nbcandepreuvefacDao.findNbcandepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(nomSouscentreSelected, anneeSelected, niveauSelected, typeSelected, nomEpreuvefacSelected);
    }

    public INbcandepreuvefac getNbcandepreuvefacDao() {
        return nbcandepreuvefacDao;
    }

    public void setNbcandepreuvefacDao(INbcandepreuvefac nbcandepreuvefacDao) {
        this.nbcandepreuvefacDao = nbcandepreuvefacDao;
    }

    @Override
    public List<Nbchefsallesecret> findAllNbchefsallesecret() {
        return nbchefsallesecretDao.findAll();
    }

    @Override
    public Nbchefsallesecret creerNbchefsallesecret(Nbchefsallesecret nbchefsallesecret) {
        return nbchefsallesecretDao.create(nbchefsallesecret);
    }

    @Override
    public Nbchefsallesecret modifierNbchefsallesecret(Nbchefsallesecret nbchefsallesecret) {
        return nbchefsallesecretDao.edit(nbchefsallesecret);
    }

    @Override
    public void supprimerNbchefsallesecret(Nbchefsallesecret nbchefsallesecret) {
        nbchefsallesecretDao.destroy(nbchefsallesecret);
    }

    @Override
    public Nbchefsallesecret findNbchefsallesecretById(int id) {
        return nbchefsallesecretDao.find(id);
    }
    
    @Override
    public Nbchefsallesecret findNbchefsalleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        return nbchefsallesecretDao.findNbchefsalleD1SecretariatD1GroupedexamensD1Session(nomSouscentreSelected, numsecSelected, anneeSelected, niveauSelected, typeSelected);
    }
    
    @Override
    public List<Nbchefsallesecret> findAllNbchefsallesecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return nbchefsallesecretDao.findNbchefsallesecretsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Jurycorrigesecret> findAllJurycorrigesecret() {
        return jurycorrigesecretDao.findAll();
    }

    @Override
    public Jurycorrigesecret creerJurycorrigesecret(Jurycorrigesecret jurycorrigesecret) {
        return jurycorrigesecretDao.create(jurycorrigesecret);
    }

    @Override
    public Jurycorrigesecret modifierJurycorrigesecret(Jurycorrigesecret jurycorrigesecret) {
        return jurycorrigesecretDao.edit(jurycorrigesecret);
    }

    @Override
    public void supprimerJurycorrigesecret(Jurycorrigesecret jurycorrigesecret) {
        jurycorrigesecretDao.destroy(jurycorrigesecret);
    }

    @Override
    public Jurycorrigesecret findJurycorrigesecretById(int id) {
        return jurycorrigesecretDao.find(id);
    }
    
    @Override
    public Jurycorrigesecret findJurycorrigesecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        return jurycorrigesecretDao.findJurycorrigesecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(nomSouscentreSelected, numsecSelected, anneeSelected, niveauSelected, typeSelected, titreSousfamilleSelected);
    }
    
    @Override
    public List<Jurycorrigesecret> findAllJurycorrigesecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return jurycorrigesecretDao.findJurycorrigesecretsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    public INbchefsallesecret getNbchefsallesecretDao() {
        return nbchefsallesecretDao;
    }

    public void setNbchefsallesecretDao(INbchefsallesecret nbchefsallesecretDao) {
        this.nbchefsallesecretDao = nbchefsallesecretDao;
    }

    public IJurycorrigesecret getJurycorrigesecretDao() {
        return jurycorrigesecretDao;
    }

    public void setJurycorrigesecretDao(IJurycorrigesecret jurycorrigesecretDao) {
        this.jurycorrigesecretDao = jurycorrigesecretDao;
    }

    @Override
    public List<Eltcorrecttechsecret> findAllEltcorrecttechsecret() {
        return eltcorrecttechsecretDao.findAll();
    }

    @Override
    public Eltcorrecttechsecret creerEltcorrecttechsecret(Eltcorrecttechsecret eltcorrecttechsecret) {
        return eltcorrecttechsecretDao.create(eltcorrecttechsecret);
    }

    @Override
    public Eltcorrecttechsecret modifierEltcorrecttechsecret(Eltcorrecttechsecret eltcorrecttechsecret) {
        return eltcorrecttechsecretDao.edit(eltcorrecttechsecret);
    }

    @Override
    public void supprimerEltcorrecttechsecret(Eltcorrecttechsecret eltcorrecttechsecret) {
        eltcorrecttechsecretDao.destroy(eltcorrecttechsecret);
    }

    @Override
    public Eltcorrecttechsecret findEltcorrecttechsecretById(int id) {
        return eltcorrecttechsecretDao.find(id);
    }

    public IEltcorrecttechsecret getEltcorrecttechsecretDao() {
        return eltcorrecttechsecretDao;
    }

    public void setEltcorrecttechsecretDao(IEltcorrecttechsecret eltcorrecttechsecretDao) {
        this.eltcorrecttechsecretDao = eltcorrecttechsecretDao;
    }

    @Override
    public Eltcorrecttechsecret findEltcorrecttechsecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        return eltcorrecttechsecretDao.findEltcorrecttechsecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(nomSouscentreSelected, numsecSelected, anneeSelected, niveauSelected, typeSelected, titreSousfamilleSelected);
    }

    @Override
    public List<Eltcorrecttechsecret> findAllEltcorrecttechsecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltcorrecttechsecretDao.findEltcorrecttechsecretsD1GroupedexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltjuryano> findAllEltjuryano() {
        return eltjuryanoDao.findAll();
    }

    @Override
    public Eltjuryano creerEltjuryano(Eltjuryano eltjuryano) {
        return eltjuryanoDao.create(eltjuryano);
    }

    @Override
    public Eltjuryano modifierEltjuryano(Eltjuryano eltjuryano) {
        return eltjuryanoDao.edit(eltjuryano);
    }

    @Override
    public void supprimerEltjuryano(Eltjuryano eltjuryano) {
        eltjuryanoDao.destroy(eltjuryano);
    }

    @Override
    public Eltjuryano findEltjuryanoById(int id) {
        return eltjuryanoDao.find(id);
    }

    public IEltjuryano getEltjuryanoDao() {
        return eltjuryanoDao;
    }

    public void setEltjuryanoDao(IEltjuryano eltjuryanoDao) {
        this.eltjuryanoDao = eltjuryanoDao;
    }

    @Override
    public List<Eltjuryano> findAllEltjuryanoD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltjuryanoDao.findAllEltjuryanoD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Nbcartons> findAllNbcartons() {
        return nbcartonsDao.findAll();
    }

    @Override
    public Nbcartons creerNbcartons(Nbcartons nbcartons) {
        return nbcartonsDao.create(nbcartons);
    }

    @Override
    public Nbcartons modifierNbcartons(Nbcartons nbcartons) {
        return nbcartonsDao.edit(nbcartons);
    }

    @Override
    public void supprimerNbcartons(Nbcartons nbcartons) {
        nbcartonsDao.destroy(nbcartons);
    }

    @Override
    public Nbcartons findNbcartonsById(int id) {
        return nbcartonsDao.find(id);
    }

    public INbcartons getNbcartonsDao() {
        return nbcartonsDao;
    }

    public void setNbcartonsDao(INbcartons nbcartonsDao) {
        this.nbcartonsDao = nbcartonsDao;
    }   

    @Override
    public Nbcartons findNbcartonsD1SouscentreD1GroupedexamensDans1SessionD1Numprat(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected,int numprat) {
        return nbcartonsDao.findNbcartonsD1SouscentreD1GroupedexamensDans1SessionD1Numprat(anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected, numprat);
    }

    @Override
    public List<Nbcartons> findAllNbcartonsD1GroupedexamensDans1SessionD1Numprat(int anneeSelected, String niveauSelected, String typeSelected, int numprat) {
        return nbcartonsDao.findAllNbcartonsD1GroupedexamensDans1SessionD1Numprat(anneeSelected, niveauSelected, typeSelected, numprat);
    }

    @Override
    public List<Combine> findAllCombines() {
        return combineDao.findAll();
    }

    @Override
    public Combine creerCombine(Combine combine) {
        return combineDao.create(combine);
    }

    @Override
    public Combine modifierCombine(Combine combine) {
        return combineDao.edit(combine);
    }

    @Override
    public void supprimerCombine(Combine combine) {
        combineDao.destroy(combine);
    }

    @Override
    public Combine findCombineById(int id) {
        return combineDao.find(id);
    }

    public ICombine getCombineDao() {
        return combineDao;
    }

    public void setCombineDao(ICombine combineDao) {
        this.combineDao = combineDao;
    }           

    @Override
    public List<Combine> findAllCombinesD1EpreuveD1GroupedexamensDans1SessionD1Numprat(String titreEpreuveSelected, int anneeSelected, String niveauSelected, String typeSelected, int numprat) {
        return combineDao.findCombinesD1EpreuveD1GroupedexamensDans1SessionD1Numprat(titreEpreuveSelected, anneeSelected, niveauSelected, typeSelected, numprat);
    }

    @Override
    public List<Combinetout> findAllCombinetouts() {
        return combinetoutDao.findAll();
    }

    @Override
    public Combinetout creerCombinetout(Combinetout combinetout) {
        return combinetoutDao.create(combinetout);
    }

    @Override
    public Combinetout modifierCombinetout(Combinetout combinetout) {
        return combinetoutDao.edit(combinetout);
    }

    @Override
    public void supprimerCombinetout(Combinetout combinetout) {
        combinetoutDao.destroy(combinetout);
    }

    @Override
    public Combinetout findCombinetoutById(int id) {
        return combinetoutDao.find(id);
    }

    public ICombinetout getCombinetoutDao() {
        return combinetoutDao;
    }

    public void setCombinetoutDao(ICombinetout combinetoutDao) {
        this.combinetoutDao = combinetoutDao;
    }

    @Override
    public Combinetout findCombinetoutD1EpreuveD1GroupedexamensDans1SessionD1Numprat(String titreEpreuveSelected, int anneeSelected, String niveauSelected, String typeSelected, int numprat) {
        return combinetoutDao.findCombinetoutD1EpreuveD1GroupedexamensDans1SessionD1Numprat(titreEpreuveSelected, anneeSelected, niveauSelected, typeSelected, numprat);
    }

    public ISpecialisationsec getSpecialisationsecDao() {
        return specialisationsecDao;
    }

    public void setSpecialisationsecDao(ISpecialisationsec specialisationsecDao) {
        this.specialisationsecDao = specialisationsecDao;
    }

    @Override
    public List<Specialisationsec> findAllSpecialisationsecs() {
        return specialisationsecDao.findAll();
    }

    @Override
    public Specialisationsec creerSpecialisationsec(Specialisationsec specialisationsec) {
        return specialisationsecDao.create(specialisationsec);
    }

    @Override
    public Specialisationsec modifierSpecialisationsec(Specialisationsec specialisationsec) {
        return specialisationsecDao.edit(specialisationsec);
    }

    @Override
    public void supprimerSpecialisationsec(Specialisationsec specialisationsec) {
        specialisationsecDao.destroy(specialisationsec);
    }

    @Override
    public Specialisationsec findSpecialisationsecById(int id) {
        return specialisationsecDao.find(id);
    }

    @Override
    public List<Specialisationsec> findAllSpecialisationsecD1Secretariat(int numsec, int annee, String nomsouscent, String abreviation) {
        return specialisationsecDao.findSpecialisationsecD1Secretariat(numsec, annee, nomsouscent, abreviation);

    }

    @Override
    public List<Specialisationsec> findAllSpecialisationsecD1SecretariatEtExamen(int numsec, int anneeSelected, String nomSouscentreSelected, String abreviation, String sigleExamenSelected) {
        return specialisationsecDao.findSpecialisationsecD1SecretariatEtExamen(numsec, anneeSelected, nomSouscentreSelected, abreviation, sigleExamenSelected);
    }
    
    @Override
    public List<Specialisationsec> findAllSpecialisationsecD1SecretariatD1GroupedexamenD1session(int numsecSelected, int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected) {
        return specialisationsecDao.findSpecialisationsecD1SecretariatD1GroupedexamenD1session(numsecSelected, anneeSelected, nomSouscentreSelected, niveauSelected, typeSelected);
    }

    public IEltcmpratique2secret getEltcmpratique2secretDao() {
        return eltcmpratique2secretDao;
    }

    public void setEltcmpratique2secretDao(IEltcmpratique2secret eltcmpratique2secretDao) {
        this.eltcmpratique2secretDao = eltcmpratique2secretDao;
    }

    @Override
    public List<Eltcmpratique2secret> findAllEltcmpratique2secrets() {
        return eltcmpratique2secretDao.findAll();
    }

    @Override
    public Eltcmpratique2secret creerEltcmpratique2secret(Eltcmpratique2secret eltcmpratique2secret) {
        return eltcmpratique2secretDao.create(eltcmpratique2secret);
    }

    @Override
    public Eltcmpratique2secret modifierEltcmpratique2secret(Eltcmpratique2secret eltcmpratique2secret) {
        return eltcmpratique2secretDao.edit(eltcmpratique2secret);
    }

    @Override
    public void supprimerEltcmpratique2secret(Eltcmpratique2secret eltcmpratique2secret) {
        eltcmpratique2secretDao.destroy(eltcmpratique2secret);
    }

    @Override
    public Eltcmpratique2secret findEltcmpratique2secretById(int id) {
        return eltcmpratique2secretDao.find(id);
    }
    
    @Override
    public List<Eltcmpratique2secret> findAllEltcmpratique2secretD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltcmpratique2secretDao.findEltcmpratique2secretD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltcmpratique2sansnomsecret> findAllEltcmpratique2sansnomsecrets() {
       return eltcmpratique2sansnomsecretDao.findAll();
    }

    @Override
    public Eltcmpratique2sansnomsecret creerEltcmpratique2sansnomsecret(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret) {
        return eltcmpratique2sansnomsecretDao.create(eltcmpratique2sansnomsecret);
    }

    @Override
    public Eltcmpratique2sansnomsecret modifierEltcmpratique2sansnomsecret(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret) {
        return eltcmpratique2sansnomsecretDao.edit(eltcmpratique2sansnomsecret);
    }

    @Override
    public void supprimerEltcmpratique2sansnomsecret(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret) {
        eltcmpratique2sansnomsecretDao.destroy(eltcmpratique2sansnomsecret);
    }

    @Override
    public Eltcmpratique2sansnomsecret findEltcmpratique2sansnomsecretById(int id) {
        return eltcmpratique2sansnomsecretDao.find(id);
    }

    public IEltcmpratique2sansnomsecret getEltcmpratique2sansnomsecretDao() {
        return eltcmpratique2sansnomsecretDao;
    }

    public void setEltcmpratique2sansnomsecretDao(IEltcmpratique2sansnomsecret eltcmpratique2sansnomsecretDao) {
        this.eltcmpratique2sansnomsecretDao = eltcmpratique2sansnomsecretDao;
    }    

    @Override
    public List<Eltcmpratique2sansnomsecret> findAllEltcmpratique2sansnomsecretD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        return eltcmpratique2sansnomsecretDao.findEltcmpratique2sansnomsecretD1GroupeDexamensD1Session(anneeSelected, niveauSelected, typeSelected);
    }

    @Override
    public List<Eltpratiquesttsecret> findAllEltpratiquesttsecret() {
        return eltpratiquesttsecretDao.findAll();
    }

    @Override
    public Eltpratiquesttsecret creerEltpratiquesttsecret(Eltpratiquesttsecret eltpratiquesttsecret) {
        return eltpratiquesttsecretDao.create(eltpratiquesttsecret);
    }

    @Override
    public Eltpratiquesttsecret modifierEltcmpratique2sansnomsecret(Eltpratiquesttsecret eltpratiquesttsecret) {
        return eltpratiquesttsecretDao.edit(eltpratiquesttsecret);
    }

    @Override
    public void supprimerEltpratiquesttsecret(Eltpratiquesttsecret eltpratiquesttsecret) {
        eltpratiquesttsecretDao.destroy(eltpratiquesttsecret);
    }

    @Override
    public Eltpratiquesttsecret findEltpratiquesttsecretById(int id) {
        return eltpratiquesttsecretDao.find(id);
    }

    public IEltpratiquesttsecret getEltpratiquesttsecretDao() {
        return eltpratiquesttsecretDao;
    }

    public void setEltpratiquesttsecretDao(IEltpratiquesttsecret eltpratiquesttsecretDao) {
        this.eltpratiquesttsecretDao = eltpratiquesttsecretDao;
    }

    @Override
    public Eltpratiquesttsecret findEltpratiquesttsecretD1SecretariatD1OptionD1Session(String nomSouscentreSelected, int numsec, String sigleOptionSelected, int anneeSelected) {
        return eltpratiquesttsecretDao.findEltpratiquesttsecretD1SecretariatD1OptionD1Session(nomSouscentreSelected, numsec, sigleOptionSelected, anneeSelected);
    }

    @Override
    public List<Eltpratiquesttsecret> findAllEltpratiquesttsecretD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected) {
        return eltpratiquesttsecretDao.findEltpratiquesttsecretD1GroupedexamensD1Session(niveauSelected, typeSelected, anneeSelected);
    }

}
