
package couche_dao;

import couche_jpa.Intervjuryti;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class IntervjurytiDao implements IIntervjuryti {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public IntervjurytiDao(){ 
    }

    @Override
    public Intervjuryti create(Intervjuryti intervjuryti) {
        try{
            em.persist(intervjuryti);
            return intervjuryti;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Intervjuryti edit(Intervjuryti intervjuryti) {
        try{
            em.merge(intervjuryti);
            return intervjuryti;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Intervjuryti intervjuryti) {
       try{
            em.remove(em.merge(intervjuryti));//on le rattache au contexte de persistance d'abord avec em.merge(intervjuryti)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Intervjuryti find(int id) {
        try{
            return em.find(Intervjuryti.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Intervjuryti> findAll() {
        try{
            return em.createQuery("select i from Intervjuryti i").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Intervjuryti> findIntervjurytisD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String chefjury) {
        try{
            return em.createQuery("select i from Intervjuryti i join i.intervenant interv where interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3 and interv.activite.nomact=:param4 and interv.qualite.titre=:param5").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", phase).setParameter("param5", chefjury).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public void supprimerIntervjurytiByIntervenantId(Integer idinterv) {
        try{
            em.createQuery("delete from Intervjuryti i where i in (select intervj from Intervjuryti intervj where intervj.intervenant.idinterv=:param)").setParameter("param",idinterv).executeUpdate();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            } 
    }

    @Override
    public List<Intervjuryti> findIntervjurytisD1SouscentreD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(String nomsouscent, int anneeSelected, String niveauSelected, String typeSelected, String phase, String chefjury) {
        try{
            return em.createQuery("select i from Intervjuryti i join i.intervenant interv where interv.souscentre.nomsouscent=:param1 and interv.session.annee=:param2 and interv.groupe.niveau=:param3 and interv.groupe.type=:param4 and interv.activite.nomact=:param5 and interv.qualite.titre=:param6").setParameter("param1", nomsouscent).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", phase).setParameter("param6", chefjury).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
    
    
}
