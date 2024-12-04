
package couche_dao;

import couche_jpa.Dureepratique;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class DureepratiqueDao implements IDureepratique{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public DureepratiqueDao(){ 
    }

    @Override
    public Dureepratique create(Dureepratique dureepratique) {
        try{
            em.persist(dureepratique);
            return dureepratique;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Dureepratique edit(Dureepratique dureepratique) {
        try{
            em.merge(dureepratique);
            return dureepratique;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Dureepratique dureepratique) {
        try{
            em.remove(em.merge(dureepratique));//on le rattache au contexte de persistance d'abord avec em.merge(dureepratique)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Dureepratique find(int id) {
        try{
            return em.find(Dureepratique.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Dureepratique> findAll() {
        try{
            return em.createQuery("select d from Dureepratique d").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Dureepratique> findDureespratiqueD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected,int numprat) {
        try{
            return em.createQuery("select d from Dureepratique d join d.groupe gpe join d.session ses where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 and d.numprat=:param4").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", numprat).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
    @Override
    public Dureepratique findDureepratiqueD1SouscentreD1GroupeDexamensD1SessionD1SpecialiteEt1Pratique(String nomSouscentre,int anneeSelected, String niveauSelected, String typeSelected, String sigle, int numprat) {
        try{
            return (Dureepratique) em.createQuery("select d from Dureepratique d join d.souscentre scent join d.groupe gpe join d.session ses where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and d.option.sigle=:param5 and d.numprat=:param6").setParameter("param1", nomSouscentre).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", sigle).setParameter("param6", numprat).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
