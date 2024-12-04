
package couche_dao;

import couche_jpa.Mopratiquesti;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MopratiquestiDao implements IMopratiquesti{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public MopratiquestiDao(){ 
    }

    @Override
    public Mopratiquesti create(Mopratiquesti mopratiquesti) {
        try{
            em.persist(mopratiquesti);
            return mopratiquesti;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Mopratiquesti edit(Mopratiquesti mopratiquesti) {
        try{
            em.merge(mopratiquesti);
            return mopratiquesti;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Mopratiquesti mopratiquesti) {
        try{
            em.remove(em.merge(mopratiquesti));//on le rattache au contexte de persistance d'abord avec em.merge(mopratiquesti)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Mopratiquesti find(int id) {
        try{
            return em.find(Mopratiquesti.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Mopratiquesti> findAll() {
        try{
            return em.createQuery("select m from Mopratiquesti m").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Mopratiquesti> findMopratiquestisD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected,int numprat) {
        try{
            return em.createQuery("select m from Mopratiquesti m join m.session ses join m.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 and m.numprat=:param4").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", numprat).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Mopratiquesti findMopratiquestiD1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected,int numprat) {
        try{
            return (Mopratiquesti) em.createQuery("select m from Mopratiquesti m join m.souscentre scent join m.session ses join m.groupe gpe join m.option opt where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and opt.sigle=:param5 and m.numprat=:param6").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", sigleOptionSelected).setParameter("param6", numprat).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
