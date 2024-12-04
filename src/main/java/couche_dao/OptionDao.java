
package couche_dao;

import couche_jpa.Nbepreuveprof;
import couche_jpa.Option;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class OptionDao implements IOption{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public OptionDao(){ 
    }
    
    @Override
    public Option create(Option option) {
        try{
            em.persist(option);
            return option;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Option edit(Option option) {
        try{
            em.merge(option);
            return option;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Option option) {
        try{
            em.remove(em.merge(option));//on le rattache au contexte de persistance d'abord avec em.merge(option)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Option find(int id) {
        try{
            return em.find(Option.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Option> findAll() {
        try{
            return em.createQuery("select o from Option o order by o.nomopt").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Option> findAllLikeName(String nom) {
        try{
            return em.createQuery("SELECT o FROM Option o WHERE o.nomopt LIKE :param").setParameter("param","%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Option findBySigle(String sigle) {
        try{
            return (Option) em.createQuery("SELECT o FROM Option o WHERE o.sigle=:param").setParameter("param",sigle).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Option> findOptionsDeSigleLikeChaine(String chaine) {
        try{
            return em.createQuery("SELECT o FROM Option o WHERE o.sigle LIKE :param").setParameter("param",chaine+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Option> findAllOptionsD1Famille(String titreFamilleSelected) {
       try{
            return em.createQuery("SELECT o FROM Option o WHERE o.famille.titre=:param").setParameter("param",titreFamilleSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }
    
}
