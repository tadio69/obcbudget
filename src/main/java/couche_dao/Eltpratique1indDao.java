
package couche_dao;

import couche_jpa.Eltpratique1ind;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Eltpratique1indDao implements IEltpratique1ind{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public Eltpratique1indDao(){ 
    }

    @Override
    public Eltpratique1ind create(Eltpratique1ind eltpratique1ind) {
        try{
            em.persist(eltpratique1ind);
            return eltpratique1ind;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltpratique1ind edit(Eltpratique1ind eltpratique1ind) {
        try{
            em.merge(eltpratique1ind);
            return eltpratique1ind;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltpratique1ind eltpratique1ind) {
        try{
            em.remove(em.merge(eltpratique1ind));//on le rattache au contexte de persistance d'abord avec em.merge(eltpratique1ind)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltpratique1ind find(int id) {
        try{
            return em.find(Eltpratique1ind.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Eltpratique1ind> findAll() {
        try{
            return em.createQuery("select e from Eltpratique1ind e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Eltpratique1ind> findAllEltpratique1indD1Session(int anneeSelected) {
        try{
            return em.createQuery("select e from Eltpratique1ind e where e.session.annee=:param").setParameter("param", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Eltpratique1ind findEltpratique1indD1SouscentreD1OptionD1Session(String nomSouscentre, String sigleOption, int annee) {
        try{
            return (Eltpratique1ind) em.createQuery("select e from Eltpratique1ind e where e.souscentre.nomsouscent=:param1 and e.option.sigle=:param2 and e.session.annee=:param3").setParameter("param1", nomSouscentre).setParameter("param2", sigleOption).setParameter("param3", annee).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            } 
    }

    @Override
    public List<Eltpratique1ind> findAllEltpratique1indD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected) {
        try{
            return em.createQuery("select e from Eltpratique1ind e where e.groupe.niveau=:param1 and e.groupe.type=:param2 and e.session.annee=:param3").setParameter("param1", niveauSelected).setParameter("param2", typeSelected).setParameter("param3", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
}
