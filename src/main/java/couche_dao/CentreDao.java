
package couche_dao;

import couche_jpa.Centre;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CentreDao implements ICentre{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public CentreDao(){ 
    }
    
    @Override
    public Centre create(Centre centre) {
        try{
            em.persist(centre);
            return centre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Centre edit(Centre centre) {
        try{
            em.merge(centre);
            return centre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Centre centre) {
        try{
            em.remove(em.merge(centre));//on le rattache au contexte de persistance d'abord avec em.merge(centre)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Centre find(int id) {
        try{
            return em.find(Centre.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Centre> findAll() {
        try{
            return em.createQuery("select c from Centre c order by c.arrondissement.departement.region.nomreg asc,c.arrondissement.departement.nomdepart asc,c.nomcent asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Centre> findAllLikeName(String nom) {
        try{
            return em.createQuery("SELECT c FROM Centre c WHERE c.nomcent LIKE :param").setParameter("param","%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }    

    @Override
    public List<Centre> findCentresD1Departement(String nomDepartement) {
        try{
            return em.createQuery("SELECT c FROM Centre c JOIN c.arrondissement.departement d WHERE d.nomdepart=:param ORDER BY c.nomcent ASC").setParameter("param",nomDepartement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    @Override
    public List<Centre> findCentresD1Arrondissement(String nomArrondissement) {
        try{
            return em.createQuery("SELECT c FROM Centre c JOIN c.arrondissement a WHERE a.nomarr=:param ORDER BY c.nomcent ASC").setParameter("param",nomArrondissement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Centre> findCentresD1Region(String nomRegionSelected) {
        try{
            return em.createQuery("SELECT c FROM Centre c JOIN c.arrondissement.departement.region r WHERE r.nomreg=:param ORDER BY c.nomcent ASC").setParameter("param",nomRegionSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public Centre findCentreByNom(String centreDeliberation) {
        try{
            return (Centre) em.createQuery("SELECT c FROM Centre c WHERE c.nomcent=:param").setParameter("param",centreDeliberation).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public Centre findCentreByEtablissement(String nometab) {
        try{
            return (Centre) em.createQuery("SELECT c FROM Centre c WHERE c.etablissement.abreviation=:param").setParameter("param",nometab).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }
}
