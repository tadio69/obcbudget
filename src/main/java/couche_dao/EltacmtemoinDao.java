
package couche_dao;

import couche_jpa.Eltacmtemoin;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltacmtemoinDao implements IEltacmtemoin{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltacmtemoinDao(){ 
    }
    
    @Override
    public Eltacmtemoin create(Eltacmtemoin eltacmtemoin) {
        try{
            em.persist(eltacmtemoin);
            return eltacmtemoin;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltacmtemoin edit(Eltacmtemoin eltacmtemoin) {
        try{
            em.merge(eltacmtemoin);
            return eltacmtemoin;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltacmtemoin eltacmtemoin) {
        try{
            em.remove(em.merge(eltacmtemoin));//on le rattache au contexte de persistance d'abord avec em.merge(eltacmtemoin)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltacmtemoin find(int id) {
        try{
            return em.find(Eltacmtemoin.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Eltacmtemoin> findAll() {
        try{
            return em.createQuery("select e from Eltacmtemoin e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Eltacmtemoin> findEltacmtemoinsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltacmtemoin e join e.intervenant interv where interv.session.annee=:param1 and interv.groupe.niveau=:param2 and interv.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
}