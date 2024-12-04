
package couche_dao;

import couche_jpa.Combinetout;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CombinetoutDao implements ICombinetout{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public CombinetoutDao(){ 
    }

    @Override
    public Combinetout create(Combinetout combinetout) {
        try{
            em.persist(combinetout);
            return combinetout;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Combinetout edit(Combinetout combinetout) {
        try{
            em.merge(combinetout);
            return combinetout;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Combinetout combinetout) {
        try{
            em.remove(em.merge(combinetout));//on le rattache au contexte de persistance d'abord avec em.merge(combinetout)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Combinetout find(int id) {
        try{
            return em.find(Combinetout.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Combinetout> findAll() {
        try{
            return em.createQuery("select c from Combinetout c").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public Combinetout findCombinetoutD1EpreuveD1GroupedexamensDans1SessionD1Numprat(String titreEpreuve, int annee, String niveau, String type, int numprat) {
        try{
            return (Combinetout) em.createQuery("select c from Combinetout c join c.epreuve epr join c.groupe gpe join c.session sess where epr.titre=:param1 and sess.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and c.numprat=:param5").setParameter("param1", titreEpreuve).setParameter("param2", annee).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", numprat).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
    
}
