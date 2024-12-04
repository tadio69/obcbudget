
package couche_dao;

import couche_jpa.Nbnotesprat2;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Nbnotesprat2Dao implements INbnotesprat2{
    @PersistenceContext
    private EntityManager em;

    // constructeur
    public Nbnotesprat2Dao() {
    }

    @Override
    public Nbnotesprat2 create(Nbnotesprat2 nbnotesprat2) {
        try{
            em.persist(nbnotesprat2);
            return nbnotesprat2;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbnotesprat2 edit(Nbnotesprat2 nbnotesprat2) {
        try{
            em.merge(nbnotesprat2);
            return nbnotesprat2;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbnotesprat2 nbnotesprat2) {
        try{
            em.remove(em.merge(nbnotesprat2));//on le rattache au contexte de persistance d'abord avec em.merge(nbnotesprat2)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbnotesprat2 find(int id) {
        try{
            return em.find(Nbnotesprat2.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbnotesprat2> findAll() {
        try{
            return em.createQuery("select n from Nbnotesprat2 n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Nbnotesprat2> findAllNbnotesprat2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select n from Nbnotesprat2 n join n.groupe gpe join n.session ses where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 order by n.centre.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Nbnotesprat2 findNbnotesprat2D1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return (Nbnotesprat2) em.createQuery("select n from Nbnotesprat2 n join n.centre cent join n.groupe gpe join n.session ses where cent.nomcent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4").setParameter("param1", nomCentredeliberationSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}