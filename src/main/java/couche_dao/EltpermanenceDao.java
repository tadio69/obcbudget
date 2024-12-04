
package couche_dao;

import couche_jpa.Eltpermanence;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltpermanenceDao implements IEltpermanence{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltpermanenceDao(){ 
    }

    @Override
    public Eltpermanence create(Eltpermanence eltpermanence) {
        try{
            em.persist(eltpermanence);
            return eltpermanence;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltpermanence edit(Eltpermanence eltpermanence) {
        try{
            em.merge(eltpermanence);
            return eltpermanence;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltpermanence eltpermanence) {
        try{
            em.remove(em.merge(eltpermanence));//on le rattache au contexte de persistance d'abord avec em.merge(eltpermanence)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltpermanence find(int id) {
        try{
            return em.find(Eltpermanence.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Eltpermanence> findAll() {
        try{
            return em.createQuery("select e from Eltpermanence e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Eltpermanence> findAllEltpermanenceD1Session(int anneeSelected) {
        try{
            return em.createQuery("select e from Eltpermanence e join e.session ses where ses.annee=:param order by e.intervenant.personnel.nompers asc,e.intervenant.personnel.prenom asc").setParameter("param", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
}
