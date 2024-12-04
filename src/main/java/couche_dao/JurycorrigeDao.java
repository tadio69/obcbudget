
package couche_dao;

import couche_jpa.Jurycorrige;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class JurycorrigeDao implements IJurycorrige{
    
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public JurycorrigeDao(){ 
    }

    @Override
    public Jurycorrige create(Jurycorrige jurycorrige) {
        try{
            em.persist(jurycorrige);
            return jurycorrige;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Jurycorrige edit(Jurycorrige jurycorrige) {
        try{
            em.merge(jurycorrige);
            return jurycorrige;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Jurycorrige jurycorrige) {
        try{
            em.remove(em.merge(jurycorrige));//on le rattache au contexte de persistance d'abord avec em.merge(jurycorrige)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Jurycorrige find(int id) {
        try{
            return em.find(Jurycorrige.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Jurycorrige> findAll() {
        try{
            return em.createQuery("select j from Jurycorrige j").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Jurycorrige findJurycorrigeD1SousfamilleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        try{
            return (Jurycorrige) em.createQuery("select j from Jurycorrige j join j.souscentre scent join j.session ses join j.groupe gpe join j.sousfamille sousfam where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and sousfam.titre=:param5").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", titreSousfamilleSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Jurycorrige> findJurycorrigesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select j from Jurycorrige j join j.session ses join j.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }   
}
