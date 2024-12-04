package couche_dao;

import couche_jpa.Nbcandlibrestp;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbcandlibrestpDao implements INbcandlibrestp{

    @PersistenceContext
    private EntityManager em;

    // constructeur
    public NbcandlibrestpDao() {
    }

    @Override
    public Nbcandlibrestp create(Nbcandlibrestp nbcand) {
        try{
            em.persist(nbcand);
            return nbcand;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbcandlibrestp edit(Nbcandlibrestp nbcand) {
        try{
            em.merge(nbcand);
            return nbcand;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbcandlibrestp nbcand) {
        try{
            em.remove(em.merge(nbcand));//on le rattache au contexte de persistance d'abord avec em.merge(nbcand)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbcandlibrestp find(int id) {
        try{
            return em.find(Nbcandlibrestp.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbcandlibrestp> findAll() {
        try{
            return em.createQuery("select n from Nbcandlibrestp n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Nbcandlibrestp> findAllNbcandlibrestpD1Session(int anneeSelected) {
        try{
            return em.createQuery("select n from Nbcandlibrestp n join n.session ses where ses.annee=:param order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Nbcandlibrestp findNbcandlibrestpD1SouscentreD1Session(String nomSouscentre, int annee) {
        try{
            return (Nbcandlibrestp) em.createQuery("select n from Nbcandlibrestp n join n.souscentre scent join n.session ses where scent.nomsouscent=:param1 and ses.annee=:param2").setParameter("param1", nomSouscentre).setParameter("param2", annee).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
