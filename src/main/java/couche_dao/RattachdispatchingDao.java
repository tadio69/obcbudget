
package couche_dao;

import couche_jpa.Rattachdispatching;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RattachdispatchingDao implements IRattachdispatching{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RattachdispatchingDao(){ 
    }

    @Override
    public Rattachdispatching create(Rattachdispatching rattachdispatching) {
        try{
            em.persist(rattachdispatching);
            return rattachdispatching;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Rattachdispatching edit(Rattachdispatching rattachdispatching) {
        try{
            em.merge(rattachdispatching);
            return rattachdispatching;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Rattachdispatching rattachdispatching) {
        try{
            em.remove(em.merge(rattachdispatching));//on le rattache au contexte de persistance d'abord avec em.merge(rattachdispatching)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Rattachdispatching find(int id) {
        try{
            return em.find(Rattachdispatching.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Rattachdispatching> findAll() {
        try{
            return em.createQuery("select r from Rattachdispatching r").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Rattachdispatching> findRattachdispatchingsD1CentredispatchingD1Type(String nomCentredispatching,String type) {
        try{
            return em.createQuery("select r from Rattachdispatching r where r.centredispatching.etablissement.abreviation=:param1 and r.centredispatching.type=:param2").setParameter("param1", nomCentredispatching).setParameter("param2", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Rattachdispatching> findRattachdispatchingsD1Centredispatching(String nomCentreDispatchingSelected) {//que rattachdispatching soit regroupement ou ventilation
        try{
            return em.createQuery("select r from Rattachdispatching r where r.centredispatching.etablissement.abreviation=:param").setParameter("param", nomCentreDispatchingSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public Rattachdispatching findRattachdispatchingD1SouscentreD1Type(String nomsouscent,String type) {
        try{
            return (Rattachdispatching) em.createQuery("select r from Rattachdispatching r join r.souscentre scent where scent.nomsouscent=:param1  and r.centredispatching.type=:param2").setParameter("param1", nomsouscent).setParameter("param2", type).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Rattachdispatching> findRattachdispatchingsD1Souscentre(String nomsouscent) {
        try{
            return em.createQuery("select r from Rattachdispatching r join r.souscentre scent where scent.nomsouscent=:param").setParameter("param", nomsouscent).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }
}
