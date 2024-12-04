
package couche_dao;

import couche_jpa.Grandcentre;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GrandcentreDao implements IGrandcentre {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public GrandcentreDao(){ 
    }

    @Override
    public Grandcentre create(Grandcentre grandcentre) {
        try{
            em.persist(grandcentre);
            return grandcentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Grandcentre edit(Grandcentre grandcentre) {
        try{
            em.merge(grandcentre);
            return grandcentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Grandcentre grandcentre) {
        try{
            em.remove(em.merge(grandcentre));//on le rattache au contexte de persistance d'abord avec em.merge(grandcentre)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Grandcentre find(int id) {
        try{
            return em.find(Grandcentre.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Grandcentre> findAll() {
        try{
            return em.createQuery("select g from Grandcentre g").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Grandcentre> findGrandcentresD1Region(String nomRegion) {
        try{
            return em.createQuery("select g from Grandcentre g join g.region r where r.nomreg=:param order by g.nom asc").setParameter("param", nomRegion).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Grandcentre> findGrandcentresLikeName(String nomgc) {
        try{
            return em.createQuery("SELECT g FROM Grandcentre g WHERE g.nom LIKE :param").setParameter("param","%"+nomgc+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Grandcentre> findGrandcentresD1RegionD1NiveauEtD1Type(String nomreg, String nomniv, String nomtyp) {
        try{
            return em.createQuery("select g from Grandcentre g join g.region r where r.nomreg=:param1 and g.niveau=:param2 and g.type=:param3 order by g.nom asc").setParameter("param1", nomreg).setParameter("param2", nomniv).setParameter("param3", nomtyp).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
    
    
}
