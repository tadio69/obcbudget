
package couche_dao;

import couche_jpa.Rattachscentre;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RattachscentreDao implements IRattachscentre{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RattachscentreDao(){ 
    }

    @Override
    public Rattachscentre create(Rattachscentre rattachscentre) {
        try{
            em.persist(rattachscentre);
            return rattachscentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Rattachscentre edit(Rattachscentre rattachscentre) {
        try{
            em.merge(rattachscentre);
            return rattachscentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Rattachscentre rattachscentre) {
        try{
            em.remove(em.merge(rattachscentre));//on le rattache au contexte de persistance d'abord avec em.merge(rattachscentre)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Rattachscentre find(int id) {
        try{
            return em.find(Rattachscentre.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Rattachscentre> findAll() {
        try{
            return em.createQuery("select r from Rattachscentre r").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Rattachscentre> findRattachscentresD1Centre(String nomCentre) {
        try{
            return em.createQuery("select r from Rattachscentre r join r.centre c where c.nomcent=:param order by r.souscentre.nomsouscent asc").setParameter("param", nomCentre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Rattachscentre findRattachscentreD1Souscentre(String nomSouscentre) {
        try{
            return (Rattachscentre) em.createQuery("select r from Rattachscentre r join r.souscentre s where s.nomsouscent=:param").setParameter("param", nomSouscentre).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
    
}
