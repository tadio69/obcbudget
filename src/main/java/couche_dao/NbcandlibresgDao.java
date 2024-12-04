package couche_dao;

import couche_jpa.Nbcandlibresg;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbcandlibresgDao implements INbcandlibresg {

    @PersistenceContext
    private EntityManager em;

    // constructeur
    public NbcandlibresgDao() {
    }

    @Override
    public Nbcandlibresg create(Nbcandlibresg nbcand) {
        try{
            em.persist(nbcand);
            return nbcand;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbcandlibresg edit(Nbcandlibresg nbcand) {
        try{
            em.merge(nbcand);
            return nbcand;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbcandlibresg nbcand) {
        try{
            em.remove(em.merge(nbcand));//on le rattache au contexte de persistance d'abord avec em.merge(nbcand)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbcandlibresg find(int id) {
        try{
            return em.find(Nbcandlibresg.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbcandlibresg> findAll() {
        try{
            return em.createQuery("select n from Nbcandlibresg n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Nbcandlibresg> findAllNbcandlibresgD1Session(int anneeSelected) {
        try{
            return em.createQuery("select n from Nbcandlibresg n join n.session ses where ses.annee=:param order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Nbcandlibresg findNbcandlibresgD1SouscentreD1Session(String nomSouscentre, int annee) {
        try{
            return (Nbcandlibresg) em.createQuery("select n from Nbcandlibresg n join n.souscentre scent join n.session ses where scent.nomsouscent=:param1 and ses.annee=:param2").setParameter("param1", nomSouscentre).setParameter("param2", annee).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
