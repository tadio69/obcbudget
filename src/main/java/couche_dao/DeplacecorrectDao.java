
package couche_dao;

import couche_jpa.Deplacecorrect;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class DeplacecorrectDao implements IDeplacecorrect{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public DeplacecorrectDao(){ 
    }    

    @Override
    public Deplacecorrect create(Deplacecorrect deplacecorrect) {
        try{
            em.persist(deplacecorrect);
            return deplacecorrect;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Deplacecorrect edit(Deplacecorrect deplacecorrect) {
        try{
            em.merge(deplacecorrect);
            return deplacecorrect;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Deplacecorrect deplacecorrect) {
        try{
            em.remove(em.merge(deplacecorrect));//on le rattache au contexte de persistance d'abord avec em.merge(deplacecorrect)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Deplacecorrect find(int id) {
        try{
            return em.find(Deplacecorrect.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Deplacecorrect> findAll() {
        try{
            return em.createQuery("select d from Deplacecorrect d").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Deplacecorrect> findDeplacecorrectsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select d from Deplacecorrect d join d.intervenant interv where interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
  
    @Override
    public List<Deplacecorrect> findDeplacecorrectsNonProfessionnelsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select d from Deplacecorrect d join d.intervenant interv where interv.personnel.fonction.titre<>'PROF' and interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Deplacecorrect> findDeplacecorrectsProfessionnelsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select d from Deplacecorrect d join d.intervenant interv where interv.personnel.fonction.titre='PROF' and interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
}
