
package couche_dao;

import couche_jpa.Groupe;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GroupeDao implements IGroupe{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public GroupeDao(){ 
    }

    @Override
    public Groupe create(Groupe groupe) {
        try{
            em.persist(groupe);
            return groupe;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Groupe edit(Groupe groupe) {
        try{
            em.merge(groupe);
            return groupe;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Groupe groupe) {
        try{
            em.remove(em.merge(groupe));//on le rattache au contexte de persistance d'abord avec em.merge(groupe)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Groupe find(int id) {
        try{
            return em.find(Groupe.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Groupe> findAll() {
        try{
            return em.createQuery("select g from Groupe g").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Groupe findGroupeD1NiveauEtD1Type(String niveau, String type) {
        try{
            return (Groupe) em.createQuery("select g from Groupe g where g.niveau=:param1 and g.type=:param2").setParameter("param1", niveau).setParameter("param2", type).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
    
}
