
package couche_dao;

import couche_jpa.Departement;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class DepartementDao implements IDepartement{

    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public DepartementDao(){ 
    }
    
    @Override
    public Departement create(Departement departement) {
        try{
            em.persist(departement);
            return departement;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Departement edit(Departement departement) {
        try{
            em.merge(departement);
            return departement;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Departement departement) {
        try{
            em.remove(em.merge(departement));//on le rattache au contexte de persistance d'abord avec em.merge(departement)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Departement find(int id) {
        try{
            return em.find(Departement.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Departement> findAll() {
        try{
            return em.createQuery("select d from Departement d ORDER BY d.region.nomreg ASC, d.nomdepart ASC").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Departement> findAllLikeName(String nom) {
        try{
            return em.createQuery("SELECT d FROM Departement d WHERE d.nomdepart LIKE :param").setParameter("param","%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Departement> findDepartementsD1Region(String nom) {
        try{
            return em.createQuery("SELECT d FROM Departement d join d.region r where r.nomreg=:param ORDER BY d.nomdepart ASC").setParameter("param",nom).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
