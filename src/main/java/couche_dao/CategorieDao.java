
package couche_dao;

import couche_jpa.Categorie;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CategorieDao implements ICategorie {

    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public CategorieDao(){ 
    }
    
    @Override
    public Categorie create(Categorie categorie) {
        try{
            em.persist(categorie); 
            return categorie;
            }catch (Throwable th){
               throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Categorie edit(Categorie categorie) {
        try{
            em.merge(categorie);
            return categorie;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Categorie categorie) {
        try{
            em.remove(em.merge(categorie));//on le rattache au contexte de persistance d'abord avec em.merge(categorie)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Categorie find(int id) {
        try{
            return em.find(Categorie.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Categorie> findAll() {
        try{
            return em.createQuery("select c from Categorie c ORDER BY c.titre ASC").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Categorie> findAllLikeTitre(String titre) {
        try{
            return em.createQuery("select c from Categorie c where c.titre like :param").setParameter("param", "%"+titre+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
}
