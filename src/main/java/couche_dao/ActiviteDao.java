
package couche_dao;

import couche_jpa.Activite;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ActiviteDao implements IActivite{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public ActiviteDao(){ 
    }

    @Override
    public Activite create(Activite activite) {
        try{
            em.persist(activite);
            return activite;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Activite edit(Activite activite) {
        try{
            em.merge(activite);
            return activite;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Activite activite) {
        try{
            em.remove(em.merge(activite));//on le rattache au contexte de persistance d'abord avec em.merge(activite)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Activite find(int id) {
        try{
            return em.find(Activite.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Activite> findAll() {
        try{
            return em.createQuery("select a from Activite a ORDER BY a.nomact ASC").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Activite> findAllLikeNom(String nom) {
        try{
            return em.createQuery("SELECT a FROM Activite a WHERE a.nomact LIKE :param").setParameter("param","%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Activite findByNom(String nom) {
        try{
            return (Activite) em.createQuery("SELECT a FROM Activite a WHERE a.nomact=:param").setParameter("param",nom).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
    
}
