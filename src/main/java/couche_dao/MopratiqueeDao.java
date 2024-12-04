
package couche_dao;

import couche_jpa.Mopratiquee;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MopratiqueeDao implements IMopratiquee{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public MopratiqueeDao(){ 
    }

    @Override
    public Mopratiquee create(Mopratiquee mopratiquee) {
        try{
            em.persist(mopratiquee);
            return mopratiquee;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Mopratiquee edit(Mopratiquee mopratiquee) {
        try{
            em.merge(mopratiquee);
            return mopratiquee;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Mopratiquee mopratiquee) {
        try{
            em.remove(em.merge(mopratiquee));//on le rattache au contexte de persistance d'abord avec em.merge(mopratiquee)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Mopratiquee find(int id) {
        try{
            return em.find(Mopratiquee.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Mopratiquee> findAll() {
        try{
            return em.createQuery("select m from Mopratiquee m").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Mopratiquee findMopratiqueeD1SouscentreD1SouscentrepratD1GroupedexamensD1Session(String nomSouscentreSelected, String nomSouscentrepratSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return (Mopratiquee) em.createQuery("select m from Mopratiquee m join m.souscentre scent join m.souscentreprat scentprat join m.session ses join m.groupe gpe where scent.nomsouscent=:param1 and scentprat.nomsouscent=:param2 and ses.annee=:param3 and gpe.niveau=:param4 and gpe.type=:param5").setParameter("param1", nomSouscentreSelected).setParameter("param2", nomSouscentrepratSelected).setParameter("param3", anneeSelected).setParameter("param4", niveauSelected).setParameter("param5", typeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Mopratiquee> findAllMopratiqueeD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select m from Mopratiquee m join m.session ses join m.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
    
}
