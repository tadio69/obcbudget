
package couche_dao;

import couche_jpa.Eltcmpratique2sansnoms;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Eltcmpratique2sansnomsDao implements IEltcmpratique2sansnoms{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public Eltcmpratique2sansnomsDao(){ 
    }
    
    @Override
    public Eltcmpratique2sansnoms create(Eltcmpratique2sansnoms eltcmpratique2sansnoms) {
        try{
            em.persist(eltcmpratique2sansnoms);
            return eltcmpratique2sansnoms;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltcmpratique2sansnoms edit(Eltcmpratique2sansnoms eltcmpratique2sansnoms) {
        try{
            em.merge(eltcmpratique2sansnoms);
            return eltcmpratique2sansnoms;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltcmpratique2sansnoms eltcmpratique2sansnoms) {
        try{
            em.remove(em.merge(eltcmpratique2sansnoms));//on le rattache au contexte de persistance d'abord avec em.merge(eltcmpratique2sansnoms)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltcmpratique2sansnoms find(int id) {
        try{
            return em.find(Eltcmpratique2sansnoms.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltcmpratique2sansnoms> findAll() {
        try{
            return em.createQuery("select e from Eltcmpratique2sansnoms e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public Eltcmpratique2sansnoms findEltcmpratique2sansnomsD1GroupeDexamensD1SessionD1Souscentre(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected) {
        try{
            return (Eltcmpratique2sansnoms) em.createQuery("select e from Eltcmpratique2sansnoms e join e.souscentre scent where e.session.annee=:param1 and scent.nomsouscent=:param2 and e.groupe.niveau=:param3 and e.groupe.type=:param4").setParameter("param1", anneeSelected).setParameter("param2", nomSouscentreSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Eltcmpratique2sansnoms> findEltcmpratique2sansnomsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltcmpratique2sansnoms e where e.session.annee=:param1 and e.groupe.niveau=:param2 and e.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
