
package couche_dao;

import couche_jpa.Eltcmpratique2sansnomsecret;
import couche_jpa.Eltcmpratique2secret;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Eltcmpratique2sansnomsecretDao implements IEltcmpratique2sansnomsecret{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public Eltcmpratique2sansnomsecretDao(){ 
    }

    @Override
    public Eltcmpratique2sansnomsecret create(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret) {
        try{
            em.persist(eltcmpratique2sansnomsecret);
            return eltcmpratique2sansnomsecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltcmpratique2sansnomsecret edit(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret) {
        try{
            em.merge(eltcmpratique2sansnomsecret);
            return eltcmpratique2sansnomsecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret) {
        try{
            em.remove(em.merge(eltcmpratique2sansnomsecret));//on le rattache au contexte de persistance d'abord avec em.merge(eltcmpratique2sansnomsecret)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltcmpratique2sansnomsecret find(int id) {
        try{
            return em.find(Eltcmpratique2sansnomsecret.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Eltcmpratique2sansnomsecret> findAll() {
        try{
            return em.createQuery("select e from Eltcmpratique2sansnomsecret e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Eltcmpratique2sansnomsecret> findEltcmpratique2sansnomsecretD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltcmpratique2sansnomsecret e where e.session.annee=:param1 and e.groupe.niveau=:param2 and e.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
