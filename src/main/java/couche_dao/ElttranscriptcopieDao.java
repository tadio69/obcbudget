
package couche_dao;

import couche_jpa.Elttranscriptcopie;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author pc
 */
@Transactional
public class ElttranscriptcopieDao implements IElttranscriptcopie{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public ElttranscriptcopieDao(){ 
    }

    @Override
    public Elttranscriptcopie create(Elttranscriptcopie elttranscriptcopie) {
        try{
            em.persist(elttranscriptcopie);
            return elttranscriptcopie;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Elttranscriptcopie edit(Elttranscriptcopie elttranscriptcopie) {
        try{
            em.merge(elttranscriptcopie);
            return elttranscriptcopie;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Elttranscriptcopie elttranscriptcopie) {
        try{
            em.remove(em.merge(elttranscriptcopie));//on le rattache au contexte de persistance d'abord avec em.merge(elttranscriptcopie)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Elttranscriptcopie find(int id) {
        try{
            return em.find(Elttranscriptcopie.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Elttranscriptcopie> findAll() {
        try{
            return em.createQuery("select e from Elttranscriptcopie e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Elttranscriptcopie> findAllElttranscriptcopieD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Elttranscriptcopie e join e.session ses join e.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
}
