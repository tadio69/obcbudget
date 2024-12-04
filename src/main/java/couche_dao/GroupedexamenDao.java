
package couche_dao;

import couche_jpa.Groupedexamen;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GroupedexamenDao implements IGroupedexamen{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public GroupedexamenDao(){ 
    }

    @Override
    public Groupedexamen create(Groupedexamen groupedexamen) {
        try{
            em.persist(groupedexamen);
            return groupedexamen;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Groupedexamen edit(Groupedexamen groupedexamen) {
        try{
            em.merge(groupedexamen);
            return groupedexamen;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Groupedexamen groupedexamen) {
        try{
            em.remove(em.merge(groupedexamen));//on le rattache au contexte de persistance d'abord avec em.merge(groupedexamen)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Groupedexamen find(int id) {
        try{
            return em.find(Groupedexamen.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Groupedexamen> findAll() {
        try{
            return em.createQuery("select g from Groupedexamen g").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Groupedexamen> findGroupedexamensD1NiveauEtD1Type(String niveau, String type) {
        try{
            return em.createQuery("select g from Groupedexamen g join g.groupe gpe where gpe.niveau=:param1 and gpe.type=:param2 order by g.examen.sigle asc").setParameter("param1",niveau).setParameter("param2", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
}
