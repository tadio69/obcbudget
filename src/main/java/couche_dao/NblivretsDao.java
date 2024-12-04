
package couche_dao;

import couche_jpa.Nblivrets;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NblivretsDao implements INblivrets{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NblivretsDao(){ 
    }

    @Override
    public Nblivrets create(Nblivrets nbliv) {
        try{
            em.persist(nbliv);
            return nbliv;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nblivrets edit(Nblivrets nbliv) {
        try{
            em.merge(nbliv);
            return nbliv;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nblivrets nbliv) {
        try{
            em.remove(em.merge(nbliv));//on le rattache au contexte de persistance d'abord avec em.merge(nbliv)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nblivrets find(int id) {
        try{
            return em.find(Nblivrets.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Nblivrets> findAll() {
        try{
            return em.createQuery("select n from Nblivrets n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Nblivrets findNblivretsD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return (Nblivrets) em.createQuery("select n from Nblivrets n join n.centre cent join n.groupe gpe join n.session ses where cent.nomcent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4").setParameter("param1", nomCentredeliberationSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Nblivrets> findAllNblivretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select n from Nblivrets n join n.groupe gpe join n.session ses where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 order by n.centre.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
