
package couche_dao;

import couche_jpa.Eltpratiquinfo;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltpratiquinfoDao implements IEltpratiquinfo{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltpratiquinfoDao(){ 
    }
    
    @Override
    public Eltpratiquinfo create(Eltpratiquinfo eltpratiquinfo) {
        try{
            em.persist(eltpratiquinfo);
            return eltpratiquinfo;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltpratiquinfo edit(Eltpratiquinfo eltpratiquinfo) {
        try{
            em.merge(eltpratiquinfo);
            return eltpratiquinfo;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltpratiquinfo eltpratiquinfo) {
        try{
            em.remove(em.merge(eltpratiquinfo));//on le rattache au contexte de persistance d'abord avec em.merge(eltpratiquinfo)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltpratiquinfo find(int id) {
        try{
            return em.find(Eltpratiquinfo.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltpratiquinfo> findAll() {
        try{
            return em.createQuery("select e from Eltpratiquinfo e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Eltpratiquinfo> findAllEltpratiquinfoD1GroupedexamensD1Session(int anneeSelected,String niveauSelected,String typeSelected) {
        try{
            return em.createQuery("select e from Eltpratiquinfo e where e.session.annee=:param1 and e.groupe.niveau=:param2 and e.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Eltpratiquinfo findEltpratiquinfoD1GroupedexamensD1SouscentreD1Session(String niveau, String type,String nomSouscentre, int annee) {
        try{
            return (Eltpratiquinfo) em.createQuery("select e from Eltpratiquinfo e where e.groupe.niveau=:param1 and e.groupe.type=:param2 and e.souscentre.nomsouscent=:param3 and e.session.annee=:param4").setParameter("param1", niveau).setParameter("param2", type).setParameter("param3", nomSouscentre).setParameter("param4", annee).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            } 
    }
    
}
