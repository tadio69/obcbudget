
package couche_dao;

import couche_jpa.Eltetatmoepreuvefac;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltetatmoepreuvefacDao implements IEltetatmoepreuvefac{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltetatmoepreuvefacDao(){ 
    }

    @Override
    public Eltetatmoepreuvefac create(Eltetatmoepreuvefac eltetatmoepreuvefac) {
        try{
            em.persist(eltetatmoepreuvefac);
            return eltetatmoepreuvefac;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltetatmoepreuvefac edit(Eltetatmoepreuvefac eltetatmoepreuvefac) {
        try{
            em.merge(eltetatmoepreuvefac);
            return eltetatmoepreuvefac;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltetatmoepreuvefac eltetatmoepreuvefac) {
        try{
            em.remove(em.merge(eltetatmoepreuvefac));//on le rattache au contexte de persistance d'abord avec em.merge(eltetatmoepreuvefac)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltetatmoepreuvefac find(int id) {
        try{
            return em.find(Eltetatmoepreuvefac.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Eltetatmoepreuvefac> findAll() {
        try{
            return em.createQuery("select e from Eltetatmoepreuvefac e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public Eltetatmoepreuvefac findEltetatmoepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleEpreuvefacSelected) {
        try{
            return (Eltetatmoepreuvefac) em.createQuery("select e from Eltetatmoepreuvefac e join e.souscentre scent join e.session ses join e.groupe gpe join e.epreuve epr where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and epr.sigle=:param5").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", sigleEpreuvefacSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Eltetatmoepreuvefac> findEltetatmoepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltetatmoepreuvefac e join e.session ses join e.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
