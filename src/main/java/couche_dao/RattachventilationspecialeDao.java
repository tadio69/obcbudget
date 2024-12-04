
package couche_dao;

import couche_jpa.Rattachventilationspeciale;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RattachventilationspecialeDao implements IRattachventilationspeciale{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RattachventilationspecialeDao(){ 
    } 
    
    @Override
    public Rattachventilationspeciale create(Rattachventilationspeciale rattachventilationspeciale) {
        try{
            em.persist(rattachventilationspeciale);
            return rattachventilationspeciale;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Rattachventilationspeciale edit(Rattachventilationspeciale rattachventilationspeciale) {
        try{
            em.merge(rattachventilationspeciale);
            return rattachventilationspeciale;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Rattachventilationspeciale rattachventilationspeciale) {
        try{
            em.remove(em.merge(rattachventilationspeciale));//on le rattache au contexte de persistance d'abord avec em.merge(rattachventilationspeciale)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Rattachventilationspeciale find(int id) {
        try{
            return em.find(Rattachventilationspeciale.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Rattachventilationspeciale> findAll() {
        try{
            return em.createQuery("select r from Rattachventilationspeciale r").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Rattachventilationspeciale findRattachventilationspecialeD1Centreventilationspeciale(String abreviation) {
        try{
            return (Rattachventilationspeciale) em.createQuery("select r from Rattachventilationspeciale r join r.centreventilationspeciale centreventspec where centreventspec.etablissement.abreviation=:param").setParameter("param",abreviation).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Rattachventilationspeciale> findAllRattachventilationspeciauxD1CentreTri(String abreviation) {
        try{
            return em.createQuery("select r from Rattachventilationspeciale r join r.centretri centri where centri.etablissement.abreviation=:param").setParameter("param",abreviation).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
