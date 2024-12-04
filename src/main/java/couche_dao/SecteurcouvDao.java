
package couche_dao;

import couche_jpa.Secteurcouv;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author famille chijou
 */
@Transactional
public class SecteurcouvDao implements ISecteurcouv {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public SecteurcouvDao(){ 
    }

    @Override
    public Secteurcouv create(Secteurcouv secteurcouv) {
        try{
            em.persist(secteurcouv);
            return secteurcouv;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Secteurcouv edit(Secteurcouv secteurcouv) {
        try{
            em.merge(secteurcouv);
            return secteurcouv;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Secteurcouv secteurcouv) {
        try{
            em.remove(em.merge(secteurcouv));//on le rattache au contexte de persistance d'abord avec em.merge(secteurcouv)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Secteurcouv find(int id) {
        try{
            return em.find(Secteurcouv.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Secteurcouv> findAll() {
        try{
            return em.createQuery("select s from Secteurcouv s").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Secteurcouv> findSecteurscouvD1Region(String nomRegion) {
        try{
            return em.createQuery("select s from Secteurcouv s join s.centrebilletage.etablissement.arrondissement.departement.region r where r.nomreg=:param order by s.centrebilletage.etablissement.abreviation asc").setParameter("param", nomRegion).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Secteurcouv> findSecteurscouvD1Centrebilletage(String nomCentrebilletage) {
        try{
            return em.createQuery("select s from Secteurcouv s join s.centrebilletage c where c.etablissement.abreviation=:param order by s.souscentre.nomsouscent asc").setParameter("param", nomCentrebilletage).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
     
}
