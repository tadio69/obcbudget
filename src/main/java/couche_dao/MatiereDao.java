
package couche_dao;

import couche_jpa.Matiere;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MatiereDao implements IMatiere{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public MatiereDao(){ 
    }

    @Override
    public Matiere create(Matiere matiere) {
        try{
            em.persist(matiere);
            return matiere;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Matiere edit(Matiere matiere) {
        try{
            em.merge(matiere);
            return matiere;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Matiere matiere) {
        try{
            em.remove(em.merge(matiere));//on le rattache au contexte de persistance d'abord avec em.merge(matiere)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Matiere find(int id) {
        try{
            return em.find(Matiere.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Matiere> findAll() {
        try{
            return em.createQuery("select m from Matiere m order by m.nom asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Matiere> findMatieresLikeNom(String nomSaisi) {
        try{
            return em.createQuery("SELECT m FROM Matiere m WHERE m.nom LIKE :param").setParameter("param","%"+nomSaisi+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Matiere> findMatieresD1Famille(String titreFamille) {
        try{
            return em.createQuery("SELECT m FROM Matiere m join m.famille fam WHERE fam.titre=:param order by m.nom asc").setParameter("param",titreFamille).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public Matiere findMatiereByName(String nomMat) {
        try{
            return (Matiere) em.createQuery("SELECT m FROM Matiere m WHERE m.nom=:param").setParameter("param",nomMat).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
}
