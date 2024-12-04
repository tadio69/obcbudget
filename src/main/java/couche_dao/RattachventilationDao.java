
package couche_dao;

import couche_jpa.Rattachventilation;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RattachventilationDao implements IRattachventilation{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RattachventilationDao(){ 
    }

    @Override
    public Rattachventilation create(Rattachventilation rattachventilation) {
        try{
            em.persist(rattachventilation);
            return rattachventilation;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Rattachventilation edit(Rattachventilation rattachventilation) {
        try{
            em.merge(rattachventilation);
            return rattachventilation;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Rattachventilation rattachventilation) {
        try{
            em.remove(em.merge(rattachventilation));//on le rattache au contexte de persistance d'abord avec em.merge(rattachventilation)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Rattachventilation find(int id) {
        try{
            return em.find(Rattachventilation.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Rattachventilation> findAll() {
        try{
            return em.createQuery("select r from Rattachventilation r").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Rattachventilation findRattachventilationD1Centreventilation(String nomCentreventil) {
        try{
            return (Rattachventilation) em.createQuery("select r from Rattachventilation r join r.centreventilation centrevent where centrevent.etablissement.abreviation=:param").setParameter("param",nomCentreventil).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Rattachventilation> findRattachventilationsD1CentreventilationSpecial(String nomExacte) {
        try{
            return em.createQuery("select r from Rattachventilation r join r.centreventilationspeciale centreventspec where centreventspec.etablissement.abreviation=:param order by r.centreventilationspeciale.etablissement.arrondissement.departement.region.nomreg asc, r.centreventilationspeciale.etablissement.abreviation asc").setParameter("param",nomExacte).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
