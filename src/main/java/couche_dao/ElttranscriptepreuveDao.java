
package couche_dao;

import couche_jpa.Elttranscriptepreuve;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ElttranscriptepreuveDao implements IElttranscriptepreuve{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public ElttranscriptepreuveDao(){ 
    }

    @Override
    public Elttranscriptepreuve create(Elttranscriptepreuve elttranscriptepreuve) {
        try{
            em.persist(elttranscriptepreuve);
            return elttranscriptepreuve;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Elttranscriptepreuve edit(Elttranscriptepreuve elttranscriptepreuve) {
        try{
            em.merge(elttranscriptepreuve);
            return elttranscriptepreuve;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Elttranscriptepreuve elttranscriptepreuve) {
        try{
            em.remove(em.merge(elttranscriptepreuve));//on le rattache au contexte de persistance d'abord avec em.merge(elttranscriptepreuve)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Elttranscriptepreuve find(int id) {
        try{
            return em.find(Elttranscriptepreuve.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Elttranscriptepreuve> findAll() {
        try{
            return em.createQuery("select e from Elttranscriptepreuve e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Elttranscriptepreuve> findAllElttranscriptepreuveD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Elttranscriptepreuve e join e.session ses join e.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
}
