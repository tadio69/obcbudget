
package couche_dao;

import couche_jpa.Deplacepratique;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class DeplacepratiqueDao implements IDeplacepratique{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public DeplacepratiqueDao(){ 
    }

    @Override
    public Deplacepratique create(Deplacepratique deplacepratique) {
        try{
            em.persist(deplacepratique);
            return deplacepratique;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Deplacepratique edit(Deplacepratique deplacepratique) {
        try{
            em.merge(deplacepratique);
            return deplacepratique;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Deplacepratique deplacepratique) {
        try{
            em.remove(em.merge(deplacepratique));//on le rattache au contexte de persistance d'abord avec em.merge(deplacepratique)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Deplacepratique find(int id) {
        try{
            return em.find(Deplacepratique.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Deplacepratique> findAll() {
        try{
            return em.createQuery("select d from Deplacepratique d").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Deplacepratique> findDeplacepratiquesD1GroupeDexamensD1SessionD1Pratique(int anneeSelected,String niveauSelected, String typeSelected,int numprat) {
        try{
            return em.createQuery("select d from Deplacepratique d join d.intervenant interv where interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3 and d.numprat=:param4").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", numprat).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }       

    @Override
    public List<Deplacepratique> findDeplacepratiquesProfessionnelsD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected, int i) {
        try{
            return em.createQuery("select d from Deplacepratique d join d.intervenant interv where interv.personnel.fonction.titre='PROF' and interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3 and d.numprat=:param4").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", i).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Deplacepratique> findDeplacepratiquesNonProfessionnelsD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected, int numprat) {
        try{
            return em.createQuery("select d from Deplacepratique d join d.intervenant interv where interv.personnel.fonction.titre<>'PROF' and interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3 and d.numprat=:param4").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", numprat).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
}
