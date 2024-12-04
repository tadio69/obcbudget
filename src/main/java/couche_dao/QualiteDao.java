
package couche_dao;

import couche_jpa.Qualite;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class QualiteDao implements IQualite {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public QualiteDao(){ 
    }

    @Override
    public Qualite create(Qualite qualite) {
        try{
            em.persist(qualite);
            return qualite;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Qualite edit(Qualite qualite) {
        try{
            em.merge(qualite);
            return qualite;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Qualite qualite) {
        try{
            em.remove(em.merge(qualite));//on le rattache au contexte de persistance d'abord avec em.merge(qualite)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Qualite find(int id) {
        try{
            return em.find(Qualite.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Qualite> findAll() {
        try{
            return em.createQuery("select q from Qualite q").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Qualite> findQualitesLikeTitre(String titre) {
        try{
            return em.createQuery("SELECT q FROM Qualite q WHERE q.titre LIKE :param").setParameter("param","%"+titre+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Qualite findQualiteByTitre(String titre) {
        try{
            return (Qualite) em.createQuery("SELECT q FROM Qualite q WHERE q.titre=:param").setParameter("param",titre).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
