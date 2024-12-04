
package couche_dao;

import couche_jpa.Fonction;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class FonctionDao implements IFonction{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public FonctionDao(){ 
    }
    
    @Override
    public Fonction create(Fonction fonction) {
        try{
            em.persist(fonction);
            return fonction;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Fonction edit(Fonction fonction) {
        try{
            em.merge(fonction);
            return fonction;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Fonction fonction) {
        try{
            em.remove(em.merge(fonction));//on le rattache au contexte de persistance d'abord avec em.merge(fonction)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Fonction find(int id) {
        try{
            return em.find(Fonction.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Fonction> findAll() {
        try{
            return em.createQuery("select f from Fonction f ORDER BY f.titre ASC").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Fonction> findFonctionsLikeTitre(String titre) {
        try{
            return em.createQuery("select f from Fonction f where f.titre like :param").setParameter("param", "%"+titre+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Fonction findFonctionByTitre(String titrefonct) {
        try{
            return (Fonction) em.createQuery("select f from Fonction f where f.titre=:param").setParameter("param", titrefonct).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
