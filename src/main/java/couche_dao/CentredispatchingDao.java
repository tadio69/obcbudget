
package couche_dao;

import couche_jpa.Centredispatching;
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
public class CentredispatchingDao implements ICentredispatching{
    
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public CentredispatchingDao(){ 
    }
    @Override
    public Centredispatching create(Centredispatching centredispatching) {
        try{
            em.persist(centredispatching);
            return centredispatching;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Centredispatching edit(Centredispatching centredispatching) {
        try{
            em.merge(centredispatching);
            return centredispatching;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Centredispatching centredispatching) {
         try{
            em.remove(em.merge(centredispatching));//on le rattache au contexte de persistance d'abord avec em.merge(centredispatching)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Centredispatching find(int id) {
        try{
            return em.find(Centredispatching.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Centredispatching> findCentresdispatchingD1Arrondissement(String nomArrondissementSelected) {
        try{
            return em.createQuery("select c from Centredispatching c join c.etablissement.arrondissement a where a.nomarr=:param").setParameter("param", nomArrondissementSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Centredispatching findCentredispatchingLikeName(String nomCentre) {
        try{
            return (Centredispatching) em.createQuery("select c from Centredispatching c join c.etablissement e where e.abreviation=:param").setParameter("param", nomCentre).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Centredispatching> findCentresdispatchingD1Region(String nomRegionSelected) {
        try{
            return em.createQuery("select c from Centredispatching c join c.etablissement.arrondissement.departement.region r where r.nomreg=:param").setParameter("param", nomRegionSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Centredispatching> findCentresdispatchingD1Departement(String nomDepartementSelected) {
        try{
            return em.createQuery("select c from Centredispatching c join c.etablissement.arrondissement.departement d where d.nomdepart=:param").setParameter("param", nomDepartementSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Centredispatching> findCentredispatchingD1Type(String type) {
        try{
            return em.createQuery("select c from Centredispatching c where c.type=:param").setParameter("param", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }    

    @Override
    public List<Centredispatching> findCentresdispatchingD1TypeD1Region(String type, String nomRegion) {
        try{
            return em.createQuery("select c from Centredispatching c where c.type=:param1 and c.etablissement.arrondissement.departement.region.nomreg=:param2").setParameter("param1", type).setParameter("param2", nomRegion).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public List<Centredispatching> findCentresdispatchingD1TypeD1Departement(String type, String nomDepartement) {
        try{
            return em.createQuery("select c from Centredispatching c where c.type=:param1 and c.etablissement.arrondissement.departement.nomdepart=:param2").setParameter("param1", type).setParameter("param2", nomDepartement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }

    @Override
    public List<Centredispatching> findAll() {
        try{
            return em.createQuery("select c from Centredispatching c").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    }

    @Override
    public Centredispatching findCentredispatchingD1TypeByEtablissement(String etab, String type) {
        try{
            return (Centredispatching) em.createQuery("select c from Centredispatching c where c.etablissement.abreviation=:param1 and c.type=:param2").setParameter("param1", etab).setParameter("param2", type).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,13);
            }
    }

    @Override
    public List<Centredispatching> findCentresVentilationEtspecialeD1Region(String nomRegion) {
        try{
            return em.createQuery("select c from Centredispatching c where c.type like 'Ventilation%' and c.etablissement.arrondissement.departement.region.nomreg=:param").setParameter("param", nomRegion).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,14);
            }
    }

    @Override
    public List<Centredispatching> findCentresVentilationEtspeciale() {
        try{
            return em.createQuery("select c from Centredispatching c where c.type like 'Ventilation%'").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,15);
            }
    }
}
