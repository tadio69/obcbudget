
package couche_dao;

import couche_jpa.Jurytemoin;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class JurytemoinDao implements IJurytemoin{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public JurytemoinDao(){ 
    }
    
    @Override
    public Jurytemoin create(Jurytemoin jurytemoin) {
        try{
            em.persist(jurytemoin);
            return jurytemoin;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Jurytemoin edit(Jurytemoin jurytemoin) {
        try{
            em.merge(jurytemoin);
            return jurytemoin;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Jurytemoin jurytemoin) {
        try{
            em.remove(em.merge(jurytemoin));//on le rattache au contexte de persistance d'abord avec em.merge(jurytemoin)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Jurytemoin find(int id) {
        try{
            return em.find(Jurytemoin.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Jurytemoin> findAll() {
        try{
            return em.createQuery("select j from Jurytemoin j").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Jurytemoin findJurytemoinD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return (Jurytemoin) em.createQuery("select j from Jurytemoin j join j.session ses join j.centre cent join j.groupe gpe where cent.nomcent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4").setParameter("param1", nomCentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Jurytemoin> findJurystemoinsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select j from Jurytemoin j join j.session ses join j.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
