
package couche_dao;


import couche_jpa.Eltcmpratique2secret;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Eltcmpratique2secretDao implements IEltcmpratique2secret{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public Eltcmpratique2secretDao(){ 
    }

    @Override
    public Eltcmpratique2secret create(Eltcmpratique2secret eltcmpratique2secret) {
        try{
            em.persist(eltcmpratique2secret);
            return eltcmpratique2secret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltcmpratique2secret edit(Eltcmpratique2secret eltcmpratique2secret) {
        try{
            em.merge(eltcmpratique2secret);
            return eltcmpratique2secret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltcmpratique2secret eltcmpratique2secret) {
        try{
            em.remove(em.merge(eltcmpratique2secret));//on le rattache au contexte de persistance d'abord avec em.merge(eltcmpratique2secret)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltcmpratique2secret find(int id) {
        try{
            return em.find(Eltcmpratique2secret.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltcmpratique2secret> findAll() {
        try{
            return em.createQuery("select c from Eltcmpratique2secret c").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Eltcmpratique2secret> findEltcmpratique2secretD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltcmpratique2secret e join e.intervenantsecret intervsec where intervsec.session.annee=:param1 and intervsec.groupe.niveau=:param2 and intervsec.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
    
}
