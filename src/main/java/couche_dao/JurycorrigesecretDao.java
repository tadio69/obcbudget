
package couche_dao;

import couche_jpa.Jurycorrigesecret;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class JurycorrigesecretDao implements IJurycorrigesecret{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public JurycorrigesecretDao(){ 
    }

    @Override
    public Jurycorrigesecret create(Jurycorrigesecret jurycorrigesecret) {
        try{
            em.persist(jurycorrigesecret);
            return jurycorrigesecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Jurycorrigesecret edit(Jurycorrigesecret jurycorrigesecret) {
        try{
            em.merge(jurycorrigesecret);
            return jurycorrigesecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Jurycorrigesecret jurycorrigesecret) {
        try{
            em.remove(em.merge(jurycorrigesecret));//on le rattache au contexte de persistance d'abord avec em.merge(jurycorrigesecret)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Jurycorrigesecret find(int id) {
        try{
            return em.find(Jurycorrigesecret.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Jurycorrigesecret> findAll() {
        try{
            return em.createQuery("select j from Jurycorrigesecret j").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Jurycorrigesecret findJurycorrigesecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        try{
            return (Jurycorrigesecret) em.createQuery("select j from Jurycorrigesecret j where j.secretariat.souscentre.nomsouscent=:param1 and j.secretariat.numsec=:param2 and j.session.annee=:param3 and j.groupe.niveau=:param4 and j.groupe.type=:param5 and j.sousfamille.titre=:param6").setParameter("param1", nomSouscentreSelected).setParameter("param2", numsecSelected).setParameter("param3", anneeSelected).setParameter("param4", niveauSelected).setParameter("param5", typeSelected).setParameter("param6", titreSousfamilleSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Jurycorrigesecret> findJurycorrigesecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select j from Jurycorrigesecret j where j.session.annee=:param1 and j.groupe.niveau=:param2 and j.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
    
}
