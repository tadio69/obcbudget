
package couche_dao;

import couche_jpa.Rubriquedegroupe;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RubriquedegroupeDao implements IRubriquedegroupe{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RubriquedegroupeDao(){ 
    }

    @Override
    public Rubriquedegroupe create(Rubriquedegroupe rubriquedegroupe) {
        try{
            em.persist(rubriquedegroupe);
            return rubriquedegroupe;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Rubriquedegroupe edit(Rubriquedegroupe rubriquedegroupe) {
        try{
            em.merge(rubriquedegroupe);
            return rubriquedegroupe;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Rubriquedegroupe rubriquedegroupe) {
        try{
            em.remove(em.merge(rubriquedegroupe));//on le rattache au contexte de persistance d'abord avec em.merge(rubriquedegroupe)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Rubriquedegroupe find(int id) {
        try{
            return em.find(Rubriquedegroupe.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Rubriquedegroupe> findAll() {
        try{
            return em.createQuery("select r from Rubriquedegroupe r").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }
}
