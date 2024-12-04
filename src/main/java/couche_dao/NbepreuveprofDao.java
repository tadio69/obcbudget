
package couche_dao;

import couche_jpa.Nbepreuveprof;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbepreuveprofDao implements INbepreuveprof{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NbepreuveprofDao(){ 
    }

    @Override
    public Nbepreuveprof create(Nbepreuveprof nbepreuveprof) {
        try{
            em.persist(nbepreuveprof);
            return nbepreuveprof;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbepreuveprof edit(Nbepreuveprof nbepreuveprof) {
        try{
            em.merge(nbepreuveprof);
            return nbepreuveprof;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbepreuveprof nbepreuveprof) {
        try{
            em.remove(em.merge(nbepreuveprof));//on le rattache au contexte de persistance d'abord avec em.merge(nbepreuveprof)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbepreuveprof find(int id) {
        try{
            return em.find(Nbepreuveprof.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbepreuveprof> findAll() {
        try{
            return em.createQuery("select n from Nbepreuveprof n order by n.examen.sigle asc,n.option.sigle asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Nbepreuveprof> findNbepreuveprofsD1Examen(String sigleExamen) {
        try{
            return em.createQuery("select n from Nbepreuveprof n join n.examen e where e.sigle=:param ORDER BY n.option.sigle asc").setParameter("param",sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Nbepreuveprof findNbepreuveprofsD1ExamenEtD1Option(String sigleExamen, String sigleOption) {
        try{
            return (Nbepreuveprof)em.createQuery("select n from Nbepreuveprof n join n.examen e join n.option o where e.sigle=:param1 and o.sigle=:param2").setParameter("param1",sigleExamen).setParameter("param2", sigleOption).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
    @Override
    public List<Nbepreuveprof> findOptionsD1Examen(String sigleExamen) {
        try{
            return em.createQuery("SELECT n FROM Nbepreuveprof n JOIN n.examen e WHERE e.sigle=:param ORDER BY n.option.sigle asc").setParameter("param",sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
