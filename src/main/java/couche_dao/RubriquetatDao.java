
package couche_dao;

import couche_jpa.Rubriquetat;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RubriquetatDao implements IRubriquetat{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public RubriquetatDao(){ 
    }
    
    @Override
    public Rubriquetat create(Rubriquetat rubriquetat) {
        try{
            em.persist(rubriquetat);
            return rubriquetat;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Rubriquetat edit(Rubriquetat rubriquetat) {
        try{
            em.merge(rubriquetat);
            return rubriquetat;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Rubriquetat rubriquetat) {
        try{
            em.remove(em.merge(rubriquetat));//on le rattache au contexte de persistance d'abord avec em.merge(rubriquetat)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Rubriquetat find(int id) {
        try{
            return em.find(Rubriquetat.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Rubriquetat> findAll() {
        try{
            return em.createQuery("select r from Rubriquetat r order by r.categorie.titre asc, r.designation asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Rubriquetat> findAllLikeName(String designation) {
        try{
            return em.createQuery("SELECT r FROM Rubriquetat r WHERE r.designation LIKE :param").setParameter("param","%"+designation+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Rubriquetat> findRubriquetatsD1Categorie(String titreCategorie) {
        try{
            return em.createQuery("SELECT r FROM Rubriquetat r JOIN r.categorie c WHERE c.titre=:param ORDER BY r.designation ASC").setParameter("param",titreCategorie).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public Rubriquetat findRubriquetatByDesignation(String designation) {
        try{
            return (Rubriquetat) em.createQuery("SELECT r FROM Rubriquetat r WHERE r.designation=:param").setParameter("param",designation).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
    
}
