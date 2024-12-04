
package couche_dao;

import couche_jpa.Intervsec;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class IntervsecDao implements IIntervsec {

    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public IntervsecDao(){ 
    }
    
    @Override
    public Intervsec create(Intervsec intervsec) {
        try{
            em.persist(intervsec);
            return intervsec;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Intervsec edit(Intervsec intervsec) {
        try{
            em.merge(intervsec);
            return intervsec;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Intervsec intervsec) {
        try{
            em.remove(em.merge(intervsec));//on le rattache au contexte de persistance d'abord avec em.merge(intervsec)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Intervsec find(int id) {
        try{
            return em.find(Intervsec.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Intervsec> findAll() {
        try{
            return em.createQuery("select i from Intervsec i").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Intervsec findIntersecD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1QualiteD1Secretariat(int annee, String nomSouscentre, String niveau, String type, String phase, String titreQualite, int num) {
        try{
            return (Intervsec) em.createQuery("select i from Intervsec i join i.intervenant interv join i.secretariat sec where interv.session.annee=:param1 and interv.souscentre.nomsouscent=:param2 and interv.groupe.niveau=:param3 and interv.groupe.type=:param4 and interv.activite.nomact =:param5 and interv.qualite.titre=:param6 and sec.numsec=:param7").setParameter("param1", annee).setParameter("param2", nomSouscentre).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", phase).setParameter("param6", titreQualite).setParameter("param7", num).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Intervsec> findIntervsecsD1GroupedexamensD1SessionD1ActiviteD1Qualite(int annee, String niveau, String type, String phase, String titre) {
        try{
            return em.createQuery("select i from Intervsec i join i.intervenant interv where interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3 and interv.activite.nomact=:param4 and interv.qualite.titre=:param5").setParameter("param1", annee).setParameter("param2", niveau).setParameter("param3", type).setParameter("param4", phase).setParameter("param5", titre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
