package couche_dao;

import couche_jpa.Eltjurypratique2;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Eltjurypratique2Dao implements IEltjurypratique2{

    @PersistenceContext
    private EntityManager em;

    // constructeur
    public Eltjurypratique2Dao() {
    }

    @Override
    public Eltjurypratique2 create(Eltjurypratique2 eltjurypratique2) {
        try{
            em.persist(eltjurypratique2);
            return eltjurypratique2;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltjurypratique2 edit(Eltjurypratique2 eltjurypratique2) {
        try{
            em.merge(eltjurypratique2);
            return eltjurypratique2;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltjurypratique2 eltjurypratique2) {
        try{
            em.remove(em.merge(eltjurypratique2));//on le rattache au contexte de persistance d'abord avec em.merge(eltjurypratique2)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltjurypratique2 find(int id) {
        try{
            return em.find(Eltjurypratique2.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltjurypratique2> findAll() {
        try{
            return em.createQuery("select e from Eltjurypratique2 e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public Eltjurypratique2 findEltjurypratique2D1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return (Eltjurypratique2) em.createQuery("select e from Eltjurypratique2 e join e.souscentre scent join e.session ses join e.groupe grpe where scent.nomsouscent=:param1 and ses.annee=:param2 and grpe.niveau=:param3 and grpe.type=:param4").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Eltjurypratique2> findEltjurypratique2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltjurypratique2 e join e.session ses join e.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
