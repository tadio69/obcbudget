
package couche_dao;

import couche_jpa.Intervenantsecret;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class IntervenantsecretDao implements IIntervenantsecret{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public IntervenantsecretDao(){ 
    }

    @Override
    public Intervenantsecret create(Intervenantsecret intervenantsecret) {
        try{
            em.persist(intervenantsecret);
            return intervenantsecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Intervenantsecret edit(Intervenantsecret intervenantsecret) {
        try{
            em.merge(intervenantsecret);
            return intervenantsecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Intervenantsecret intervenantsecret) {
        try{
            em.remove(em.merge(intervenantsecret));//on le rattache au contexte de persistance d'abord avec em.merge(intervenantsecret)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Intervenantsecret find(int id) {
        try{
            return em.find(Intervenantsecret.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Intervenantsecret> findAll() {
        try{
            return em.createQuery("select i from Intervenantsecret i").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override                       
    public List<Intervenantsecret> findIntervenantsecretD1GroupedexamensD1SouscentreA1SessionD1ActiviteEt1Qualite(int annee, String nomSouscentre, String niveau, String type, String phase, String titreQualite) {
        try{
            return em.createQuery("select i from Intervenantsecret i join i.session ses join i.groupe gpe join i.activite act join i.qualite qual where ses.annee=:param1 and i.secretariat.souscentre.nomsouscent=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and act.nomact=:param5 and qual.titre=:param6").setParameter("param1", annee).setParameter("param2", nomSouscentre).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", phase).setParameter("param6", titreQualite).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override                       
    public List<Intervenantsecret> findIntervenantsecretD1GroupedexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titreQualite) {
        try{
            return em.createQuery("select i from Intervenantsecret i join i.session ses join i.groupe gpe join i.activite act join i.qualite qual where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 and act.nomact=:param4 and qual.titre=:param5 order by i.secretariat.souscentre.etablissement.arrondissement.departement.region.nomreg asc,i.secretariat.souscentre.etablissement.arrondissement.departement.nomdepart asc,i.secretariat.souscentre.etablissement.arrondissement.nomarr asc,i.secretariat.souscentre.nomsouscent asc,i.secretariat.numsec asc,i.personnel.nompers asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", phase).setParameter("param5", titreQualite).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public Intervenantsecret findIntervenantsecretByNomEtPrenomD1GroupeDexamensD1SessionD1SecretariatD1ActiviteEt1Qualite(String nom, String prenom, int anneeSelected, String nomSouscentreSelected,int numsecSelected, String niveauSelected, String typeSelected, String phase, String titre) {
        try{
            return (Intervenantsecret) em.createQuery("select i from Intervenantsecret i join i.personnel pers where pers.nompers=:param1 and pers.prenom=:param2 and i.secretariat.session.annee=:param3 and i.secretariat.souscentre.nomsouscent=:param4 and i.secretariat.numsec=:param5 and i.groupe.niveau=:param6 and i.groupe.type=:param7 and i.activite.nomact=:param8 and i.qualite.titre=:param9").setParameter("param1", nom).setParameter("param2", prenom).setParameter("param3", anneeSelected).setParameter("param4", nomSouscentreSelected).setParameter("param5", numsecSelected).setParameter("param6", niveauSelected).setParameter("param7", typeSelected).setParameter("param8", phase).setParameter("param9", titre).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
}
