
package couche_dao;

import couche_jpa.Ponderation;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class PonderationDao implements IPonderation{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public PonderationDao(){ 
    }

    @Override
    public Ponderation create(Ponderation ponderation) {
        try{
            em.persist(ponderation);
            return ponderation;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Ponderation edit(Ponderation ponderation) {
        try{
            em.merge(ponderation);
            return ponderation;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Ponderation ponderation) {
        try{
            em.remove(em.merge(ponderation));//on le rattache au contexte de persistance d'abord avec em.merge(ponderation)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Ponderation find(int id) {
        try{
            return em.find(Ponderation.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Ponderation> findAll() {
        try{
            return em.createQuery("select p from Ponderation p").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Ponderation findPonderationD1GroupedexamensD1NatureEtD1Sousfamille(String typeSelected, String niveauSelected, String natureSelected, String sousfamilleSelected) {
        try{
            return (Ponderation) em.createQuery("select p from Ponderation p where p.groupe.type=:param1 and p.groupe.niveau=:param2 and p.nature=:param3 and p.sousfamille.titre=:param4").setParameter("param1", typeSelected).setParameter("param2", niveauSelected).setParameter("param3", natureSelected).setParameter("param4", sousfamilleSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Ponderation> findPonderationsD1Groupedexamens(String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select p from Ponderation p where p.groupe.niveau=:param1 and p.groupe.type=:param2").setParameter("param1", niveauSelected).setParameter("param2",typeSelected ).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
