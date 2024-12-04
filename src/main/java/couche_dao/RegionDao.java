
package couche_dao;

import couche_jpa.Region;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class RegionDao implements IRegion {

    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RegionDao(){ 
    }
    
    @Override
    public Region create(Region region) {
        try{
            em.persist(region); 
            return region;
            }catch (Throwable th){
               throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Region edit(Region region) { 
        try{
            em.merge(region);
            return region;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Region region) {
        try{
            em.remove(em.merge(region));//on le rattache au contexte de persistance d'abord avec em.merge(region)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Region find(int id) {
        try{
            return em.find(Region.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Region> findAll() {
         try{
            return em.createQuery("select r from Region r ORDER BY r.nomreg ASC").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Region> findAllLikeName(String nom) {
        try{
            return em.createQuery("select r from Region r where r.nomreg like :param").setParameter("param", "%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
}
