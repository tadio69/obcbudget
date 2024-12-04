
package couche_dao;

import couche_jpa.Jurydel;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class JurydelDao implements IJurydel {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public JurydelDao(){ 
    }
    
    @Override
    public Jurydel create(Jurydel jurydel) {
        try{
            em.persist(jurydel);
            return jurydel;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Jurydel edit(Jurydel jurydel) {
        try{
            em.merge(jurydel);
            return jurydel;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Jurydel jurydel) {
        try{
            em.remove(em.merge(jurydel));//on le rattache au contexte de persistance d'abord avec em.merge(jurydel)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Jurydel find(int id) {
        try{
            return em.find(Jurydel.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Jurydel> findAll() {
        try{
            return em.createQuery("select j from Jurydel j").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Jurydel findJurydelD1SousfamilleD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        try{
            return (Jurydel) em.createQuery("select j from Jurydel j join j.session ses join j.centre cent join j.groupe gpe join j.sousfamille sfam where cent.nomcent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and sfam.titre=:param5").setParameter("param1", nomCentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", titreSousfamilleSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Jurydel> findJurydelsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select j from Jurydel j join j.session ses join j.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
