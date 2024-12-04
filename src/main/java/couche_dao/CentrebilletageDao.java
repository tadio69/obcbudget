
package couche_dao;

import couche_jpa.Centrebilletage;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CentrebilletageDao implements ICentrebilletage{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public CentrebilletageDao(){ 
    }

    @Override
    public Centrebilletage create(Centrebilletage centrebilletage) {
        try{
            em.persist(centrebilletage);
            return centrebilletage;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Centrebilletage edit(Centrebilletage centrebilletage) {
        try{
            em.merge(centrebilletage);
            return centrebilletage;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Centrebilletage centrebilletage) {
        try{
            em.remove(em.merge(centrebilletage));//on le rattache au contexte de persistance d'abord avec em.merge(centrebilletage)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Centrebilletage find(int id) {
        try{
            return em.find(Centrebilletage.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Centrebilletage> findAll() {
        try{
            return em.createQuery("select c from Centrebilletage c order by c.etablissement.arrondissement.departement.region.nomreg asc,c.etablissement.arrondissement.departement.nomdepart asc,c.etablissement.arrondissement.nomarr asc,c.etablissement.abreviation asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Centrebilletage> findCentrebilletagesD1Arrondissement(String nomArrondissement) {
        try{
            return em.createQuery("select c from Centrebilletage c join c.etablissement.arrondissement a where a.nomarr=:param order by c.etablissement.abreviation asc").setParameter("param", nomArrondissement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            } 
    }

    @Override
    public Centrebilletage findCentrebilletageD1Etablissement(String nomEtablissement) {
        try{
            return (Centrebilletage) em.createQuery("select c from Centrebilletage c join c.etablissement e where e.abreviation=:param").setParameter("param", nomEtablissement).setParameter("param", nomEtablissement).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            } 
    }

    @Override
    public List<Centrebilletage> findCentrebilletagesD1Departement(String nomDepartement) {
        try{
            return em.createQuery("select c from Centrebilletage c join c.etablissement.arrondissement.departement d where d.nomdepart=:param ORDER BY c.etablissement.arrondissement.nomarr asc,c.etablissement.abreviation asc").setParameter("param", nomDepartement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            } 
    }

    @Override
    public List<Centrebilletage> findCentrebilletagesD1Region(String nomRegion) {
        try{
            return em.createQuery("select c from Centrebilletage c join c.etablissement.arrondissement.departement.region r where r.nomreg=:param ORDER BY c.etablissement.arrondissement.departement.nomdepart asc,c.etablissement.arrondissement.nomarr asc,c.etablissement.abreviation asc").setParameter("param", nomRegion).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            } 
    }

    @Override
    public List<Centrebilletage> findCentrebilletagesD1NiveauD1Type(String niveau, String type) {
        try{
            return em.createQuery("select c from Centrebilletage c where c.niveau=:param1 and c.type=:param2 order by c.etablissement.arrondissement.departement.region.nomreg asc,c.etablissement.abreviation asc").setParameter("param1", niveau).setParameter("param2", type).getResultList();//c.etablissement.arrondissement.departement.nomdepart asc,c.etablissement.arrondissement.nomarr asc,
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            } 
    }
    
    
}
