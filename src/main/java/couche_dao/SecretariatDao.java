
package couche_dao;

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
public class SecretariatDao implements ISecretariat{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public SecretariatDao(){ 
    }

    @Override
    public Secretariat create(Secretariat secretariat) {
        try{
            em.persist(secretariat);
            return secretariat;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Secretariat edit(Secretariat secretariat) {
        try{
            em.merge(secretariat);
            return secretariat;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Secretariat secretariat) {
        try{
            em.remove(em.merge(secretariat));//on le rattache au contexte de persistance d'abord avec em.merge(secretariat)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Secretariat find(int id) {
        try{
            return em.find(Secretariat.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }  
    
    @Override
    public List<Secretariat> findAll() {
        try{
            return em.createQuery("select s from Secretariat s order by s.session.annee").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    /*
    @Override
    public List<Secretariat> findSecretariatsD1SouscentreD1Session(String nomSouscentre,int annee){
         try{
            return em.createQuery("select s from Secretariat s join s.souscentre scent join s.session ses where scent.nomsouscent=:param1 and ses.annee=:param2").setParameter("param1",nomSouscentre).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    */
    @Override
    public void supprimerSecretariatsD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected) {
        try{
            em.createQuery("delete from Secretariat s where s in (select sec from Secretariat sec where sec.souscentre.nomsouscent=:param1 and sec.session.annee=:param2)").setParameter("param1",nomSouscentreSelected).setParameter("param2", anneeSelected).executeUpdate();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
/*
    @Override
    public List<Secretariat> findSecretariatsD1GroupedexamensDans1Session(int annee, String niveau, String type) {
        try{
            return em.createQuery("select s from Secretariat s join s.session ses where ses.annee=:param1").setParameter("param1", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
*/

    @Override
    public Secretariat findSecretariatD1NumeroD1SessionD1SouscentreD1Etablissement(int numsec, int anneeSelected, String nomSouscentreSelected, String nomEtablissementSelected) {                      
        try{
            return (Secretariat) em.createQuery("select s from Secretariat s where s.numsec=:param1 and s.session.annee=:param2 and s.souscentre.nomsouscent=:param3 and s.etablissement.abreviation=:param4").setParameter("param1", numsec).setParameter("param2", anneeSelected).setParameter("param3", nomSouscentreSelected).setParameter("param4", nomEtablissementSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    /*
    @Override
    public List<Secretariat> findSecretariatsD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected) {
        try{
            return em.createQuery("select s from Secretariat s where s.session.annee=:param1 and s.examen.sigle=:param2").setParameter("param1", anneeSelected).setParameter("param2", sigleExamenSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }
    

    @Override
    public List<Secretariat> findSecretariatsD1SouscentreA1SessionEt1Examen(String nomSouscentre, int annee, String sigleExamen) {
        try{
            return em.createQuery("select s from Secretariat s join s.souscentre scent join s.session ses join s.examen exam where scent.nomsouscent=:param1 and ses.annee=:param2 and exam.sigle=:param3").setParameter("param1",nomSouscentre).setParameter("param2", annee).setParameter("param3", sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }    
    
    @Override
    public Secretariat findSecretariatD1SouscentreD1numeroD1Session(String scentre, int num, int annee, String niveau, String type) {
        try{
            return (Secretariat) em.createQuery("select s from Secretariat s join s.souscentre scent join s.session ses join s.examen exam where scent.nomsouscent=:param1 and s.numsec=:param2 and ses.annee=:param3 and exam.niveau=:param4 and exam.type=:param5").setParameter("param1",scentre).setParameter("param2", num).setParameter("param3", annee).setParameter("param4", niveau).setParameter("param5", type).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    }
    */
    
    @Override
    public List<Secretariat> findSecretariatsD1SouscentreEtSession(String nomSouscentre, int annee) {
        try{
            return em.createQuery("select s from Secretariat s join s.souscentre scent join s.session ses where scent.nomsouscent=:param1 and ses.annee=:param2").setParameter("param1",nomSouscentre).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,13);
            }
    }

    @Override
    public List<Secretariat> findSecretariatsD1Session(int annee) {
        try{
            return em.createQuery("select s from Secretariat s join s.session ses where ses.annee=:param").setParameter("param", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,14);
            }
    }

    @Override
    public Secretariat findSecretariatD1SouscentreDeNumeroEtSessionDonnes(String nomSouscentre, int numsec, int annee) {
        try{
            return (Secretariat) em.createQuery("select s from Secretariat s join s.souscentre scent join s.session ses where scent.nomsouscent=:param1 and s.numsec=:param2 and ses.annee=:param3").setParameter("param1",nomSouscentre).setParameter("param2", numsec).setParameter("param3", annee).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,15);
            }
    }
}
