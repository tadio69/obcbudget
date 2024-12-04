
package couche_dao;

import couche_jpa.Eltpratiqueti;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltpratiquetiDao implements IEltpratiqueti{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltpratiquetiDao(){ 
    }

    @Override
    public Eltpratiqueti create(Eltpratiqueti eltpratiqueti) {
        try{
            em.persist(eltpratiqueti);
            return eltpratiqueti;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltpratiqueti edit(Eltpratiqueti eltpratiqueti) {
        try{
            em.merge(eltpratiqueti);
            return eltpratiqueti;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltpratiqueti eltpratiqueti) {
        try{
            em.remove(em.merge(eltpratiqueti));//on le rattache au contexte de persistance d'abord avec em.merge(eltpratiqueti)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltpratiqueti find(int id) {
        try{
            return em.find(Eltpratiqueti.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltpratiqueti> findAll() {
        try{
            return em.createQuery("select e from Eltpratiqueti e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Eltpratiqueti> findAllEltpratiquetiD1Session(int anneeSelected) {
        try{
            return em.createQuery("select e from Eltpratiqueti e where e.session.annee=:param").setParameter("param", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            } 
    }

    @Override
    public Eltpratiqueti findEltpratiquetiD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected) {
        try{
            return (Eltpratiqueti) em.createQuery("select e from Eltpratiqueti e where e.souscentre.nomsouscent=:param1 and e.session.annee=:param2").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            } 
    }
}
