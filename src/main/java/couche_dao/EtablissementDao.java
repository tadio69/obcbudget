
package couche_dao;

import couche_jpa.Etablissement;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EtablissementDao implements IEtablissement{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EtablissementDao(){ 
    }

    @Override
    public Etablissement create(Etablissement etablissement) {
        try{
            em.persist(etablissement);
            return etablissement;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Etablissement edit(Etablissement etablissement) {
        try{
            em.merge(etablissement);
            return etablissement;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Etablissement etablissement) {
        try{
            em.remove(em.merge(etablissement));//on le rattache au contexte de persistance d'abord avec em.merge(etablissement)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Etablissement find(int id) {
        try{
            return em.find(Etablissement.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Etablissement> findAll() {
        try{
            return em.createQuery("select e from Etablissement e ORDER BY e.arrondissement.departement.region.nomreg ASC, e.arrondissement.departement.nomdepart ASC,e.arrondissement.nomarr asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Etablissement> findAllLikeName(String nom) {
        try{
            return em.createQuery("SELECT e FROM Etablissement e WHERE e.nometab LIKE :param").setParameter("param","%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Etablissement> findEtablissementsD1Departement(String nom) {
        try{
            return em.createQuery("SELECT e FROM Etablissement e JOIN e.arrondissement.departement d WHERE d.nomdepart=:param ORDER BY e.arrondissement.nomarr asc,e.abreviation  ASC").setParameter("param",nom).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Etablissement> findEtablissementsD1Arrondissement(String nomArrondissement) {
        try{
            return em.createQuery("SELECT e FROM Etablissement e JOIN e.arrondissement a WHERE a.nomarr=:param ORDER BY e.nometab ASC").setParameter("param",nomArrondissement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public Etablissement findEtablissementByAbreviation(String abreviation) {
        try{
            return (Etablissement) em.createQuery("SELECT e FROM Etablissement e WHERE e.abreviation=:param").setParameter("param",abreviation).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public List<Etablissement> findEtablissementsCentreDEpsD1Arrondissement(String nomArrondissement) {
        try{
            return em.createQuery("SELECT e FROM Etablissement e JOIN e.arrondissement a WHERE a.nomarr=:param and e.sport=true ORDER BY e.nometab ASC").setParameter("param",nomArrondissement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,13);
            }
    }   
}
