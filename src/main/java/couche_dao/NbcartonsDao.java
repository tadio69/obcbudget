
package couche_dao;

import couche_jpa.Nbcartons;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbcartonsDao implements INbcartons{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NbcartonsDao(){ 
    }

    @Override
    public Nbcartons create(Nbcartons nbcartons) {
        try{
            em.persist(nbcartons);
            return nbcartons;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbcartons edit(Nbcartons nbcartons) {
        try{
            em.merge(nbcartons);
            return nbcartons;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbcartons nbcartons) {
        try{
            em.remove(em.merge(nbcartons));//on le rattache au contexte de persistance d'abord avec em.merge(nbcartons)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbcartons find(int id) {
        try{
            return em.find(Nbcartons.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbcartons> findAll() {
        try{
            return em.createQuery("select n from Nbcartons n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }   

    @Override
    public Nbcartons findNbcartonsD1SouscentreD1GroupedexamensDans1SessionD1Numprat(int annee, String nomSouscentre, String niveau, String type, int numprat) {
        try{
            return (Nbcartons) em.createQuery("select n from Nbcartons n join n.souscentre scent join n.groupe gpe join n.session ses where ses.annee=:param1 and scent.nomsouscent=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and n.numprat=:param5").setParameter("param1", annee ).setParameter("param2", nomSouscentre).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", numprat).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Nbcartons> findAllNbcartonsD1GroupedexamensDans1SessionD1Numprat(int annee, String niveau, String type, int numprat) {
        try{
            return em.createQuery("select n from Nbcartons n join n.groupe gpe join n.session ses where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 and n.numprat=:param4").setParameter("param1", annee ).setParameter("param2", niveau).setParameter("param3", type).setParameter("param4", numprat).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
