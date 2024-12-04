
package couche_dao;

import couche_jpa.Eltharmo;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltharmoDao implements IEltharmo{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltharmoDao(){ 
    }

    @Override
    public Eltharmo create(Eltharmo eltharmo) {
        try{
            em.persist(eltharmo);
            return eltharmo;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltharmo edit(Eltharmo eltharmo) {
        try{
            em.merge(eltharmo);
            return eltharmo;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltharmo eltharmo) {
        try{
            em.remove(em.merge(eltharmo));//on le rattache au contexte de persistance d'abord avec em.merge(eltharmo)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltharmo find(int id) {
        try{
            return em.find(Eltharmo.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Eltharmo> findAll() {
        try{
            return em.createQuery("select e from Eltharmo e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Eltharmo> findAllEltharmoD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltharmo e join e.session ses join e.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 order by e.intervenant.personnel.nompers asc,e.intervenant.personnel.prenom asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
}
