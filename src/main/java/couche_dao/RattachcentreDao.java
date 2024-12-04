
package couche_dao;

import couche_jpa.Rattachcentre;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RattachcentreDao implements IRattachcentre{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RattachcentreDao(){ 
    }

    @Override
    public Rattachcentre create(Rattachcentre rattachcentre) {
        try{
            em.persist(rattachcentre);
            return rattachcentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Rattachcentre edit(Rattachcentre rattachcentre) {
        try{
            em.merge(rattachcentre);
            return rattachcentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Rattachcentre rattachcentre) {
        try{
            em.remove(em.merge(rattachcentre));//on le rattache au contexte de persistance d'abord avec em.merge(rattachcentre)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Rattachcentre find(int id) {
        try{
            return em.find(Rattachcentre.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Rattachcentre> findAll() {
        try{
            return em.createQuery("select r from Rattachcentre r").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Rattachcentre> findRattachcentresD1Grandcentre(String nomGrandcentre) {
        try{
            return em.createQuery("select r from Rattachcentre r join r.grandcentre g where g.nom=:param order by r.centre.nomcent asc").setParameter("param", nomGrandcentre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Rattachcentre findRattachcentreD1Centre(String nomCentreDeliberation) {
        try{
            return (Rattachcentre) em.createQuery("select r from Rattachcentre r join r.centre c where c.nomcent=:param").setParameter("param", nomCentreDeliberation).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
    
}
