
package couche_dao;

import couche_jpa.Jurydeladmiss;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class JurydeladmissDao implements IJurydeladmiss {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public JurydeladmissDao(){ 
    }
    
    @Override
    public Jurydeladmiss create(Jurydeladmiss jurydeladmiss) {
        try{
            em.persist(jurydeladmiss);
            return jurydeladmiss;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Jurydeladmiss edit(Jurydeladmiss jurydeladmiss) {
        try{
            em.merge(jurydeladmiss);
            return jurydeladmiss;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Jurydeladmiss jurydeladmiss) {
        try{
            em.remove(em.merge(jurydeladmiss));//on le rattache au contexte de persistance d'abord avec em.merge(jurydeladmiss)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Jurydeladmiss find(int id) {
        try{
            return em.find(Jurydeladmiss.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Jurydeladmiss> findAll() {
        try{
            return em.createQuery("select j from Jurydeladmiss j").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Jurydeladmiss> findJurydeladmissD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select j from Jurydeladmiss j join j.session ses join j.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Jurydeladmiss findJurydeladmissD1SousfamilleD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        try{
            return (Jurydeladmiss) em.createQuery("select j from Jurydeladmiss j join j.session ses join j.centre cent join j.groupe gpe join j.sousfamille sfam where cent.nomcent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and sfam.titre=:param5").setParameter("param1", nomCentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", titreSousfamilleSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
