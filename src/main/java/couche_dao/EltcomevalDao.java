
package couche_dao;

import couche_jpa.Eltcomeval;
import couche_jpa.Groupe;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltcomevalDao implements IEltcomeval{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltcomevalDao(){ 
    }

    @Override
    public Eltcomeval create(Eltcomeval eltcomeval) {
        try{
            em.persist(eltcomeval);
            return eltcomeval;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltcomeval edit(Eltcomeval eltcomeval) {
        try{
            em.merge(eltcomeval);
            return eltcomeval;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltcomeval eltcomeval) {
        try{
            em.remove(em.merge(eltcomeval));//on le rattache au contexte de persistance d'abord avec em.merge(eltcomeval)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltcomeval find(int id) {
        try{
            return em.find(Eltcomeval.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltcomeval> findAll() {
        try{
            return em.createQuery("select e from Eltcomeval e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Eltcomeval> findAllEltcomevalD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltcomeval e join e.session ses join e.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
}
