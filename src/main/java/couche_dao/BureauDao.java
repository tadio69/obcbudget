
package couche_dao;

import couche_jpa.Bureau;
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
public class BureauDao implements IBureau {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public BureauDao(){ 
    }

    @Override
    public Bureau create(Bureau bureau) {
        try{
            em.persist(bureau);
            return bureau;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Bureau edit(Bureau bureau) {
        try{
            em.merge(bureau);
            return bureau;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Bureau bureau) {
        try{
            em.remove(em.merge(bureau));//on le rattache au contexte de persistance d'abord avec em.merge(bureau)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Bureau find(int id) {
        try{
            return em.find(Bureau.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public Bureau findBureauD1CentrebilletageDans1Session(String nomCentrebilletage, int annee) {
        try{
            return (Bureau) em.createQuery("select b from Bureau b join b.centrebilletage c join b.session s where c.etablissement.abreviation=:param1 and s.annee=:param2").setParameter("param1", nomCentrebilletage).setParameter("param2", annee).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Bureau> findBureauxD1Session(int anneeSelected) {
        try{
            return em.createQuery("select b from Bureau b join b.session s where s.annee=:param order by b.centrebilletage.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Bureau> findBureauxD1ArrondissementDans1Session(String nomArrondissement,int annee) {
        try{
            return em.createQuery("select b from Bureau b join b.centrebilletage.etablissement.arrondissement a join b.session s where a.nomarr=:param1 and s.annee=:param2 order by b.centrebilletage.etablissement.abreviation asc").setParameter("param1", nomArrondissement).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Bureau> findBureauxD1DepartementDans1Session(String nomDepartement, int annee) {
        try{
            return em.createQuery("select b from Bureau b join b.centrebilletage.etablissement.arrondissement.departement d join b.session s where d.nomdepart=:param1 and s.annee=:param2 order by b.centrebilletage.etablissement.arrondissement.nomarr asc,b.centrebilletage.etablissement.abreviation asc").setParameter("param1", nomDepartement).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Bureau> findBureauxD1RegionDans1Session(String nomRegion, int annee) {
        try{
            return em.createQuery("select b from Bureau b join b.centrebilletage.etablissement.arrondissement.departement.region r join b.session s where r.nomreg=:param1 and s.annee=:param2 order by b.centrebilletage.etablissement.arrondissement.departement.nomdepart asc,b.centrebilletage.etablissement.arrondissement.nomarr asc,b.centrebilletage.etablissement.abreviation asc").setParameter("param1", nomRegion).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }
}
