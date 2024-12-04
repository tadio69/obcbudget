
package couche_dao;

import couche_jpa.Arrondissement;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ArrondissementDao implements IArrondissement{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public ArrondissementDao(){ 
    }

    @Override
    public Arrondissement create(Arrondissement arrondissement) {
        try{
            em.persist(arrondissement);
            return arrondissement;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Arrondissement edit(Arrondissement arrondissement) {
        try{
            em.merge(arrondissement);
            return arrondissement;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Arrondissement arrondissement) {
        try{
            em.remove(em.merge(arrondissement));//on le rattache au contexte de persistance d'abord avec em.merge(arrondissement)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Arrondissement find(int id) {
        try{
            return em.find(Arrondissement.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Arrondissement> findAll() {
        try{
            return em.createQuery("select a from Arrondissement a ORDER BY a.departement.region.nomreg ASC, a.departement.nomdepart ASC,a.nomarr ASC").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Arrondissement> findAllLikeName(String nom) {
        try{
            return em.createQuery("SELECT a FROM Arrondissement a WHERE a.nomarr LIKE :param").setParameter("param","%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Arrondissement> findArrondissementsD1Departement(String nom) {
        try{
            return em.createQuery("SELECT a FROM Arrondissement a join a.departement d where d.nomdepart=:param ORDER BY d.nomdepart ASC,a.nomarr ASC").setParameter("param",nom).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Arrondissement> findArrondissementsD1Region(String nomRegion) {
        try{
            return em.createQuery("SELECT a FROM Arrondissement a join a.departement.region r where r.nomreg=:param ORDER BY a.nomarr ASC").setParameter("param",nomRegion).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public Arrondissement findArrondissementByName(String arrondt) {
        try{
            return (Arrondissement) em.createQuery("SELECT a FROM Arrondissement a WHERE a.nomarr=:param").setParameter("param",arrondt).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    } 
}
