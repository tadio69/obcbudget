
package couche_dao;

import couche_jpa.Famille;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class FamilleDao implements IFamille{
    
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public FamilleDao(){ 
    }
    
    @Override
    public Famille create(Famille famille) {
        try{
            em.persist(famille); 
            return famille;
            }catch (Throwable th){
               throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Famille edit(Famille famille) {
        try{
            em.merge(famille);
            return famille;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Famille famille) {
        try{
            em.remove(em.merge(famille));//on le rattache au contexte de persistance d'abord avec em.merge(famille)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Famille find(int id) {
        try{
            return em.find(Famille.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Famille> findAll() {
        try{
            return em.createQuery("select f from Famille f ORDER BY f.titre ASC").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Famille> findFamillesLikeTitre(String titre) {
        try{
            return em.createQuery("select f from Famille f where f.titre like :param").setParameter("param", "%"+titre+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Famille findFamilleByTitre(String titre) {
        try{
            return (Famille) em.createQuery("select f from Famille f where f.titre=:param").setParameter("param", titre).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
