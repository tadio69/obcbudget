
package couche_dao;

import couche_jpa.Eltacmtemoin;
import couche_jpa.Eltcoordo;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltcoordoDao implements IEltcoordo{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltcoordoDao(){ 
    }

    @Override
    public Eltcoordo create(Eltcoordo eltcoordo) {
        try{
            em.persist(eltcoordo);
            return eltcoordo;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltcoordo edit(Eltcoordo eltcoordo) {
        try{
            em.merge(eltcoordo);
            return eltcoordo;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltcoordo eltcoordo) {
        try{
            em.remove(em.merge(eltcoordo));//on le rattache au contexte de persistance d'abord avec em.merge(eltcoordo)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltcoordo find(int id) {
        try{
            return em.find(Eltcoordo.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Eltcoordo> findAll() {
        try{
            return em.createQuery("select e from Eltcoordo e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Eltcoordo> findAllEltcoordoD1Session(int anneeSelected) {
        try{
            return em.createQuery("select e from Eltcoordo e join e.session ses where ses.annee=:param").setParameter("param", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
}
