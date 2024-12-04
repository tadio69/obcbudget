
package couche_dao;

import couche_jpa.Elementsurvdeficient;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ElementsurvdeficientDao implements IElementsurvdeficient{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public ElementsurvdeficientDao(){ 
    }

    @Override
    public Elementsurvdeficient create(Elementsurvdeficient elementsurvdeficient) {
        try{
            em.persist(elementsurvdeficient);
            return elementsurvdeficient;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Elementsurvdeficient edit(Elementsurvdeficient elementsurvdeficient) {
        try{
            em.merge(elementsurvdeficient);
            return elementsurvdeficient;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Elementsurvdeficient elementsurvdeficient) {
        try{
            em.remove(em.merge(elementsurvdeficient));//on le rattache au contexte de persistance d'abord avec em.merge(elementsurvdeficient)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Elementsurvdeficient find(int id) {
        try{
            return em.find(Elementsurvdeficient.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Elementsurvdeficient> findAll() {
        try{
            return em.createQuery("select e from Elementsurvdeficient e order by e.souscentre.nomsouscent asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Elementsurvdeficient> findElementsurvdeficientsD1groupedexamenA1Session(int annee, String niveau, String type) {
        try{
            return em.createQuery("select e from Elementsurvdeficient e where e.session.annee=:param1 and e.groupe.niveau=:param2 and e.groupe.type=:param3 order by e.souscentre.nomsouscent asc").setParameter("param1", annee).setParameter("param2", niveau).setParameter("param3", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            } 
    }
}
