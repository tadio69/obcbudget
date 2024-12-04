
package couche_dao;

import couche_jpa.Session;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class SessionDao implements ISession{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public SessionDao(){ 
    }
    
    @Override
    public Session create(Session session) {
        try{
            em.persist(session);
            return session;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Session edit(Session session) {
        try{
            em.merge(session);
            return session;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Session session) {
        try{
            em.remove(em.merge(session));//on le rattache au contexte de persistance d'abord avec em.merge(session)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Session find(int id) {
        try{
            return em.find(Session.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Session> findAll() {
        try{
            return em.createQuery("select s from Session s order by s.annee").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }
    
}
