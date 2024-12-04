
package couche_dao;

import couche_jpa.Sousfamille;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class SousfamilleDao implements ISousfamille{
    
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public SousfamilleDao(){ 
    }

    @Override
    public Sousfamille create(Sousfamille sousfamille) {
        try{
            em.persist(sousfamille);
            return sousfamille;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Sousfamille edit(Sousfamille sousfamille) {
        try{
            em.merge(sousfamille);
            return sousfamille;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Sousfamille sousfamille) {
        try{
            em.remove(em.merge(sousfamille));//on le rattache au contexte de persistance d'abord avec em.merge(sousfamille)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Sousfamille find(int id) {
        try{
            return em.find(Sousfamille.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Sousfamille> findAll() {
        try{
            return em.createQuery("select s from Sousfamille s").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Sousfamille> findSousfamillesLikeTitre(String titre) {
        try{
            return em.createQuery("SELECT s FROM Sousfamille s WHERE s.titre LIKE :param").setParameter("param","%"+titre+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Sousfamille> findSousfamillesTI() {
        try{
            return em.createQuery("select s from Sousfamille s where s.famille.titre='TECHNIQUE INDUSTRIEL'").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public Sousfamille findSousfamillesByTitre(String titre) {
        try{
            return (Sousfamille) em.createQuery("SELECT s FROM Sousfamille s WHERE s.titre=:param").setParameter("param",titre).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Sousfamille> findSousfamillesESG() {
        try{
            return em.createQuery("select s from Sousfamille s where s.famille.titre='LITTÉRAIRE' or s.famille.titre='SCIENTIFIQUE'").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public List<Sousfamille> findSousfamillesSTT() {
        try{
            return em.createQuery("select s from Sousfamille s where s.famille.titre='TECHNIQUE COMMERCIAL'").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public List<Sousfamille> findAllSousfamillesD1Famille(String titreFamilleSelected) {
        try{
            return em.createQuery("select s from Sousfamille s where s.famille.titre=:param").setParameter("param",titreFamilleSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }
}
