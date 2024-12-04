
package couche_dao;

import couche_jpa.Naturesecretariat;
import couche_jpa.Secretariat;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author famille chijou
 */
@Transactional
public class NaturesecretariatDao implements INaturesecretariat{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NaturesecretariatDao(){ 
    }
    
    
    @Override
    public Naturesecretariat create(Naturesecretariat naturesecretariat) {
        try{
            em.persist(naturesecretariat);
            return naturesecretariat;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Naturesecretariat edit(Naturesecretariat naturesecretariat) {
         try{
            em.merge(naturesecretariat);
            return naturesecretariat;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Naturesecretariat naturesecretariat) {
        try{
            em.remove(em.merge(naturesecretariat));//on le rattache au contexte de persistance d'abord avec em.merge(examcon)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Naturesecretariat find(int id) {
        try{
            return em.find(Naturesecretariat.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Naturesecretariat> findAll() {
        try{
            return em.createQuery("select n from Naturesecretariat n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public void supprimerNaturesecretariatsD1SouscentreDans1SessionEt1Groupedexamens(String nomSouscentreSelected, int annee,String niveau,String type) {
        try{
            em.createQuery("delete from Naturesecretariat n where n in (select nat from Naturesecretariat nat join nat.secretariat.groupe grpe where nat.secretariat.souscentre.nomsouscent=:param1 and nat.secretariat.session.annee=:param2 and grpe.niveau=:param3 and grpe.type=:param4)").setParameter("param1",nomSouscentreSelected).setParameter("param2", annee).setParameter("param3", niveau).setParameter("param4", type).executeUpdate();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Naturesecretariat> findNaturesecretariatsD1SouscentreA1SessionEt1Groupedexamens(String nomSouscentre, int annee, String niveauSelected, String typeSelected) {
         try{
            return em.createQuery("select n from Naturesecretariat n join n.secretariat.souscentre scent join n.secretariat.session ses join n.secretariat sec where scent.nomsouscent=:param1 and ses.annee=:param2 and sec.groupe.niveau=:param3 and sec.groupe.type=:param4 order by n.examen.sigle asc,n.option.sigle asc").setParameter("param1", nomSouscentre).setParameter("param2", annee).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Naturesecretariat> findNaturesecretariatsD1SouscentreA1SessionDans1Activite(String act, String nomSouscentreSelected, int anneeSelected) {
        try{
            return em.createQuery("select n from Naturesecretariat n join n.activite ac join n.secretariat se where ac.nomact=:param1 and se.souscentre.nomsouscent=:param2 and se.session.annee=:param3").setParameter("param1", act).setParameter("param2", nomSouscentreSelected).setParameter("param3", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public List<Naturesecretariat> findNaturesecretariatsD1GroupedexamensA1SessionDans1Activite(String phase, String niveau, String type, int annee) {
       try{
            return em.createQuery("select n from Naturesecretariat n join n.activite ac join n.secretariat se where ac.nomact=:param1 and se.groupe.niveau=:param2 and se.groupe.type=:param3 and se.session.annee=:param4").setParameter("param1", phase).setParameter("param2", niveau).setParameter("param3", type).setParameter("param4", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public List<Naturesecretariat> findNaturesecretariatsD1Secreatariat(Integer idsec) {
        try{
            return em.createQuery("select n from Naturesecretariat n join n.secretariat se where se.idsec=:param").setParameter("param", idsec).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }

    @Override
    public List<Naturesecretariat> findNaturesecretariatD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected, int numsec) {
        try{
            return em.createQuery("select n from Naturesecretariat n join n.secretariat.session ses join n.secretariat.souscentre scent join n.secretariat sec where ses.annee=:param1 and sec.examen.sigle=:param2 and scent.nomsouscent=:param3 and sec.numsec=:param4").setParameter("param1", anneeSelected).setParameter("param2", sigleExamenSelected).setParameter("param3", nomSouscentreSelected).setParameter("param4", numsec).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    }

    @Override
    public List<Naturesecretariat> findNaturesecretariatsD1ExamensD1Session(int anneeSelected, String sigleExamenSelected) {
        try{
            return em.createQuery("select n from Naturesecretariat n where n.secretariat.session.annee=:param1 and n.secretariat.examen.sigle=:param2").setParameter("param1", anneeSelected).setParameter("param2", sigleExamenSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,13);
            }
    }

    @Override
    public List<Naturesecretariat> findNaturesecretariatsD1Session(int anneeSelected) {
        try{
            return em.createQuery("select n from Naturesecretariat n where n.secretariat.session.annee=:param").setParameter("param", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,14);
            }
    }

    @Override
    public List<Naturesecretariat> findNaturesecretariatD1SouscentreEtSession(int anneeSelected, String nomSouscentreSelected) {
        try{
            return em.createQuery("select n from Naturesecretariat n join n.secretariat.session ses join n.secretariat.souscentre scent where ses.annee=:param1 and scent.nomsouscent=:param2").setParameter("param1", anneeSelected).setParameter("param2", nomSouscentreSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,15);
            }
    }

    @Override
    public List<Naturesecretariat> findNaturesecretariatD1Secretariat(int num, int sess, String scent, String etab) {
        try{
            return em.createQuery("select n from Naturesecretariat n where n.secretariat.numsec=:param1 and n.secretariat.session.annee=:param2 and n.secretariat.souscentre.nomsouscent=:param3 and n.secretariat.etablissement.abreviation=:param4").setParameter("param1", num).setParameter("param2", sess).setParameter("param3", scent).setParameter("param4", etab).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,16);
            }
    }
    
}
