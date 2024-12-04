
package couche_dao;

import couche_jpa.Epreuve;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EpreuveDao implements IEpreuve {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EpreuveDao(){ 
    }
    
    @Override
    public Epreuve create(Epreuve epreuve) {
        try{
            em.persist(epreuve);
            return epreuve;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Epreuve edit(Epreuve epreuve) {
        try{
            em.merge(epreuve);
            return epreuve;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Epreuve epreuve) {
        try{
            em.remove(em.merge(epreuve));//on le rattache au contexte de persistance d'abord avec em.merge(epreuve)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Epreuve find(int id) {
        try{
            return em.find(Epreuve.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Epreuve> findAll() {
        try{
            return em.createQuery("select e from Epreuve e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Epreuve> findEpreuvesLikeTitre(String titre) {
        try{
            return em.createQuery("SELECT e FROM Epreuve e WHERE e.titre LIKE :param order by e.titre asc").setParameter("param","%"+titre+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Epreuve> findAllEpreuvefacs() {
        try{
            return em.createQuery("SELECT e FROM Epreuve e WHERE e.caractere='Facultative' order by e.titre asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Epreuve> findEpreuvesD1Caractere(String caractere) {
        try{
            return em.createQuery("SELECT e FROM Epreuve e WHERE e.caractere=:param order by e.titre asc").setParameter("param",caractere).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
    
}
