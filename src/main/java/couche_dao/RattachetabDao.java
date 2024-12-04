
package couche_dao;

import couche_jpa.Rattachetab;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RattachetabDao implements IRattachetab{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RattachetabDao(){ 
    }

    @Override
    public Rattachetab create(Rattachetab rattachetab) {
        try{
            em.persist(rattachetab);
            return rattachetab;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Rattachetab edit(Rattachetab rattachetab) {
        try{
            em.merge(rattachetab);
            return rattachetab;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Rattachetab rattachetab) {
        try{
            em.remove(em.merge(rattachetab));//on le rattache au contexte de persistance d'abord avec em.merge(rattachetab)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Rattachetab find(int id) {
        try{
            return em.find(Rattachetab.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Rattachetab> findAll() {
        try{
            return em.createQuery("select r from Rattachetab r").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Rattachetab findRattachetabD1Etablissement(String nomEtablissement) {
        try{
            return (Rattachetab) em.createQuery("select r from Rattachetab r join r.etablissement e where e.abreviation=:param").setParameter("param", nomEtablissement).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Rattachetab> findRattachetabD1Souscentre(String nomSouscentre) {
        try{
            return em.createQuery("select r from Rattachetab r join r.souscentre s where s.nomsouscent=:param order by r.etablissement.abreviation asc").setParameter("param", nomSouscentre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
    
}
