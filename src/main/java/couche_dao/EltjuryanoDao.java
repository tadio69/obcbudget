
package couche_dao;

import couche_jpa.Eltjuryano;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltjuryanoDao implements IEltjuryano{

    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltjuryanoDao(){ 
    }
    
    @Override
    public Eltjuryano create(Eltjuryano eltjuryano) {
        try{
            em.persist(eltjuryano);
            return eltjuryano;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltjuryano edit(Eltjuryano eltjuryano) {
        try{
            em.merge(eltjuryano);
            return eltjuryano;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltjuryano eltjuryano) {
        try{
            em.remove(em.merge(eltjuryano));//on le rattache au contexte de persistance d'abord avec em.merge(eltjuryano)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltjuryano find(int id) {
        try{
            return em.find(Eltjuryano.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltjuryano> findAll() {
        try{
            return em.createQuery("select e from Eltjuryano e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Eltjuryano> findAllEltjuryanoD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltjuryano e join e.intervenant interv where interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
}
