
package couche_dao;

import couche_jpa.Combine;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CombineDao implements ICombine{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public CombineDao(){ 
    }

    @Override
    public Combine create(Combine combine) {
        try{
            em.persist(combine);
            return combine;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Combine edit(Combine combine) {
        try{
            em.merge(combine);
            return combine;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Combine combine) {
        try{
            em.remove(em.merge(combine));//on le rattache au contexte de persistance d'abord avec em.merge(combine)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Combine find(int id) {
        try{
            return em.find(Combine.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Combine> findAll() {
        try{
            return em.createQuery("select c from Combine c").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Combine> findCombinesD1EpreuveD1GroupedexamensDans1SessionD1Numprat(String titreEpreuve, int annee, String niveau, String type, int numprat) {
        try{
            return em.createQuery("select c from Combine c join c.epreuve epr join c.groupe gpe join c.session sess where epr.titre=:param1 and sess.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and c.numprat=:param5").setParameter("param1", titreEpreuve).setParameter("param2", annee).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", numprat).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
}
