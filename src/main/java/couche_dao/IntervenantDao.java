
package couche_dao;

import couche_jpa.Intervenant;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class IntervenantDao implements IIntervenant{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public IntervenantDao(){ 
    }

    @Override
    public Intervenant create(Intervenant intervenant) {
        try{
            em.persist(intervenant);
            return intervenant;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Intervenant edit(Intervenant intervenant) {
        try{
            em.merge(intervenant);
            return intervenant;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Intervenant intervenant) {
        try{
            em.remove(em.merge(intervenant));//on le rattache au contexte de persistance d'abord avec em.merge(intervenant)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Intervenant find(int id) {
        try{
            return em.find(Intervenant.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Intervenant> findAll() {
        try{
            return em.createQuery("select i from Intervenant i").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Intervenant findIntervenantByNomEtPrenomD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(String nom, String prenom, int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titre) {
        try{
            return (Intervenant) em.createQuery("select i from Intervenant i join i.personnel pers join i.session ses join i.souscentre sous join i.groupe gpe join i.activite act join i.qualite qual where pers.nompers=:param1 and pers.prenom=:param2 and ses.annee=:param3 and sous.nomsouscent=:param4 and gpe.niveau=:param5 and gpe.type=:param6 and act.nomact=:param7 and qual.titre=:param8").setParameter("param1", nom).setParameter("param2", prenom).setParameter("param3", anneeSelected).setParameter("param4", nomSouscentreSelected).setParameter("param5", niveauSelected).setParameter("param6", typeSelected).setParameter("param7", phase).setParameter("param8", titre).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Intervenant> findIntervenantsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titre) {
        try{
            return em.createQuery("select i from Intervenant i join i.session ses join i.groupe gpe join i.activite act join i.qualite qual where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 and act.nomact=:param4 and qual.titre=:param5 order by i.souscentre.etablissement.arrondissement.departement.region.nomreg asc,i.souscentre.etablissement.arrondissement.departement.nomdepart asc,i.souscentre.etablissement.arrondissement.nomarr asc,i.souscentre.nomsouscent asc,i.personnel.nompers asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", phase).setParameter("param5", titre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }  

    @Override
    public Intervenant findIntervenantByQualiteD1GroupeDexamensD1SessionD1SouscentreEtActivite(int anneeSelected, String nomsouscent, String niveauSelected, String typeSelected, String phase, String qualite) {
        try{
            return (Intervenant) em.createQuery("select i from Intervenant i join i.session ses join i.souscentre scent join i.groupe gpe join i.activite act join i.qualite qual where ses.annee=:param1 and scent.nomsouscent=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and act.nomact=:param5 and qual.titre=:param6").setParameter("param1", anneeSelected).setParameter("param2", nomsouscent).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", phase).setParameter("param6", qualite).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Intervenant> findIntervenantsD1GroupeDexamensD1SouscentreD1SessionD1ActiviteEt1Qualite(int annee, String nomSouscentre, String niveau, String type, String phase, String titreQualite) {
        try{
            return em.createQuery("select i from Intervenant i join i.session ses join i.souscentre scent join i.groupe gpe join i.activite act join i.qualite qual where ses.annee=:param1 and scent.nomsouscent=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and act.nomact=:param5 and qual.titre=:param6").setParameter("param1", annee).setParameter("param2", nomSouscentre).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", phase).setParameter("param6", titreQualite).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public Intervenant findIntervenantD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(int annee, String nomSouscentre, String niveau, String type, String phase, String titreQualite) {
        try{
            return (Intervenant) em.createQuery("select i from Intervenant i join i.session ses join i.souscentre scent join i.groupe gpe join i.activite act join i.qualite qual where ses.annee=:param1 and scent.nomsouscent=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and act.nomact=:param5 and qual.titre=:param6").setParameter("param1", annee).setParameter("param2", nomSouscentre).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", phase).setParameter("param6", titreQualite).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public List<Intervenant> findIntervenantsProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String correcteur) {
        try{
            return em.createQuery("select i from Intervenant i join i.session ses join i.groupe gpe join i.activite act join i.qualite qual where i.personnel.fonction.titre='PROF' and ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 and act.nomact=:param4 and qual.titre=:param5 order by i.souscentre.etablissement.arrondissement.departement.region.nomreg asc,i.souscentre.etablissement.arrondissement.departement.nomdepart asc,i.souscentre.etablissement.arrondissement.nomarr asc,i.souscentre.nomsouscent asc,i.personnel.nompers asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", phase).setParameter("param5", correcteur).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }
    
    @Override
    public List<Intervenant> findIntervenantsNonProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titre) {
        try{
            return em.createQuery("select i from Intervenant i join i.session ses join i.groupe gpe join i.activite act join i.qualite qual where i.personnel.fonction.titre<>'PROF' and ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 and act.nomact=:param4 and qual.titre=:param5 order by i.souscentre.etablissement.arrondissement.departement.region.nomreg asc,i.souscentre.etablissement.arrondissement.departement.nomdepart asc,i.souscentre.etablissement.arrondissement.nomarr asc,i.souscentre.nomsouscent asc,i.personnel.nompers asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", phase).setParameter("param5", titre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    } 
}
