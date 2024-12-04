
package couche_dao;

import couche_jpa.Fmissprimchefcentre;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class FmissprimchefcentreDao implements IFmissprimchefcentre{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public FmissprimchefcentreDao(){ 
    }

    @Override
    public Fmissprimchefcentre create(Fmissprimchefcentre fmissprimchefcentre) {
        try{
            em.persist(fmissprimchefcentre);
            return fmissprimchefcentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Fmissprimchefcentre edit(Fmissprimchefcentre fmissprimchefcentre) {
        try{
            em.merge(fmissprimchefcentre);
            return fmissprimchefcentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Fmissprimchefcentre fmissprimchefcentre) {
        try{
            em.remove(em.merge(fmissprimchefcentre));//on le rattache au contexte de persistance d'abord avec em.merge(fmissprimchefcentre)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Fmissprimchefcentre find(int id) {
         try{
            return em.find(Fmissprimchefcentre.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Fmissprimchefcentre> findAll() {
        try{
            return em.createQuery("select f from Fmissprimchefcentre f").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Fmissprimchefcentre> findFmissprimchefcentresD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select f from Fmissprimchefcentre f join f.intervenant interv where interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

}
