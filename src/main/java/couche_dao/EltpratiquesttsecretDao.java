
package couche_dao;

import couche_jpa.Eltpratiquestt;
import couche_jpa.Eltpratiquesttsecret;
import couche_jpa.Secretariat;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltpratiquesttsecretDao implements IEltpratiquesttsecret{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltpratiquesttsecretDao(){ 
    }

    @Override
    public Eltpratiquesttsecret create(Eltpratiquesttsecret eltpratiquesttsecret) {
        try{
            em.persist(eltpratiquesttsecret);
            return eltpratiquesttsecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltpratiquesttsecret edit(Eltpratiquesttsecret eltpratiquesttsecret) {
        try{
            em.merge(eltpratiquesttsecret);
            return eltpratiquesttsecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltpratiquesttsecret eltpratiquesttsecret) {
        try{
            em.remove(em.merge(eltpratiquesttsecret));//on le rattache au contexte de persistance d'abord avec em.merge(eltpratiquesttsecret)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltpratiquesttsecret find(int id) {
        try{
            return em.find(Eltpratiquesttsecret.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltpratiquesttsecret> findAll() {
        try{
            return em.createQuery("select e from Eltpratiquesttsecret e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Eltpratiquesttsecret findEltpratiquesttsecretD1SecretariatD1OptionD1Session(String nomsouscentre, int numsec, String sigleOption, int annee) {
        try{
            return (Eltpratiquesttsecret) em.createQuery("select e from Eltpratiquesttsecret e where e.secretariat.souscentre.nomsouscent=:param1 and e.secretariat.numsec=:param2 and e.option.sigle=:param3 and e.secretariat.session.annee=:param4").setParameter("param1", nomsouscentre).setParameter("param2", numsec).setParameter("param3", sigleOption).setParameter("param4", annee).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Eltpratiquesttsecret> findEltpratiquesttsecretD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected) {
        try{
            return em.createQuery("select e from Eltpratiquesttsecret e where e.groupe.niveau=:param1 and e.groupe.type=:param2 and e.secretariat.session.annee=:param3").setParameter("param1", niveauSelected).setParameter("param2", typeSelected).setParameter("param3", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
    
}
