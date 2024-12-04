
package couche_dao;

import couche_jpa.Eltacmtemoin;
import couche_jpa.Eltcmpratique2;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Eltcmpratique2Dao implements IEltcmpratique2{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public Eltcmpratique2Dao(){ 
    }

    @Override
    public Eltcmpratique2 create(Eltcmpratique2 eltcmpratique2) {
        try{
            em.persist(eltcmpratique2);
            return eltcmpratique2;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltcmpratique2 edit(Eltcmpratique2 eltcmpratique2) {
        try{
            em.merge(eltcmpratique2);
            return eltcmpratique2;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltcmpratique2 eltcmpratique2) {
        try{
            em.remove(em.merge(eltcmpratique2));//on le rattache au contexte de persistance d'abord avec em.merge(eltcmpratique2)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltcmpratique2 find(int id) {
        try{
            return em.find(Eltcmpratique2.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Eltcmpratique2> findAll() {
        try{
            return em.createQuery("select e from Eltcmpratique2 e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Eltcmpratique2> findEltcmpratique2D1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltcmpratique2 e join e.intervenant interv where interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
    
}
