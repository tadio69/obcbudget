
package couche_dao;

import couche_jpa.Rattachregroupement;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RattachregroupementDao implements IRattachregroupement {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RattachregroupementDao(){ 
    }

    @Override
    public Rattachregroupement create(Rattachregroupement rattachregroupement) {
        try{
            em.persist(rattachregroupement);
            return rattachregroupement;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Rattachregroupement edit(Rattachregroupement rattachregroupement) {
        try{
            em.merge(rattachregroupement);
            return rattachregroupement;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Rattachregroupement rattachregroupement) {
        try{
            em.remove(em.merge(rattachregroupement));//on le rattache au contexte de persistance d'abord avec em.merge(rattachregroupement)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Rattachregroupement find(int id) {
        try{
            return em.find(Rattachregroupement.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Rattachregroupement> findAll() {
        try{
            return em.createQuery("select r from Rattachregroupement r order by r.etablissement.arrondissement.departement.region.nomreg asc,r.etablissement.arrondissement.departement.nomdepart asc, r.etablissement.arrondissement.nomarr asc, r.etablissement asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    
    @Override
    public Rattachregroupement findRattachregroupementD1Centreregroupement(String centreregroup) {
       try{
            return (Rattachregroupement) em.createQuery("select r from Rattachregroupement r where r.etablissement.abreviation=:param").setParameter("param",centreregroup).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Rattachregroupement> findRattachregroupementsD1CentredispatchingD1Type(String nomExacte, String typeExate) {
        try{
            return em.createQuery("select r from Rattachregroupement r join r.centreventilation centrevent where centrevent.etablissement.abreviation=:param1 and centrevent.type=:param2 order by r.centreventilation.etablissement.arrondissement.departement.region.nomreg asc, r.centreventilation.etablissement.abreviation asc").setParameter("param1",nomExacte).setParameter("param2",typeExate).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }  

    @Override
    public List<Rattachregroupement> findRattachregroupementsD1Centredispatching(String nom) {
        try{
            return em.createQuery("select r from Rattachregroupement r join r.centreventilation centrevent where centrevent.etablissement.abreviation=:param order by r.centreventilation.etablissement.arrondissement.departement.region.nomreg asc, r.centreventilation.etablissement.abreviation asc").setParameter("param",nom).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
}
