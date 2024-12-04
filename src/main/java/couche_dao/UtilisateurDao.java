
package couche_dao;

import couche_jpa.Utilisateur;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UtilisateurDao implements IUtilisateur{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public UtilisateurDao(){ 
    }
    
    @Override
    public Utilisateur create(Utilisateur utilisateur) {
        try{
            em.persist(utilisateur);
            return utilisateur;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Utilisateur edit(Utilisateur utilisateur) {
        try{
            em.merge(utilisateur);
            return utilisateur;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Utilisateur utilisateur) {
        try{
            em.remove(em.merge(utilisateur));//on le rattache au contexte de persistance d'abord avec em.merge(utilisateur)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Utilisateur find(int id) {
        try{
            return em.find(Utilisateur.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Utilisateur> findAll() {
        try{
            return em.createQuery("select u from Utilisateur u").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Utilisateur findByLoginAndPwd(String log, String pwd) {
        try{
            return (Utilisateur) em.createQuery("select u from Utilisateur u where u.login=:param1 and u.motpass=:param2").setParameter("param1", log).setParameter("param2", pwd).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
}
