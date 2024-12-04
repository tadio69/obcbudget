
package couche_dao;

import couche_jpa.Optiond1sousfamille;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Optiond1sousfamilleDao implements IOptiond1sousfamille{
    
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public Optiond1sousfamilleDao(){ 
    }

    @Override
    public Optiond1sousfamille create(Optiond1sousfamille optiond1sousfamille) {
        try{
            em.persist(optiond1sousfamille);
            return optiond1sousfamille;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Optiond1sousfamille edit(Optiond1sousfamille optiond1sousfamille) {
        try{
            em.merge(optiond1sousfamille);
            return optiond1sousfamille;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Optiond1sousfamille optiond1sousfamille) {
        try{
            em.remove(em.merge(optiond1sousfamille));//on le rattache au contexte de persistance d'abord avec em.merge(optiond1sousfamille)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Optiond1sousfamille find(int id) {
        try{
            return em.find(Optiond1sousfamille.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Optiond1sousfamille> findAll() {
        try{
            return em.createQuery("select o from Optiond1sousfamille o").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }
    
}
