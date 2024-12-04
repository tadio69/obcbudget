
package couche_dao;

import couche_jpa.Nbcandepreuvefac;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbcandepreuvefacDao implements INbcandepreuvefac{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NbcandepreuvefacDao(){ 
    }

    @Override
    public Nbcandepreuvefac create(Nbcandepreuvefac nbcandepreuvefac) {
         try{
            em.persist(nbcandepreuvefac);
            return nbcandepreuvefac;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbcandepreuvefac edit(Nbcandepreuvefac nbcandepreuvefac) {
        try{
            em.merge(nbcandepreuvefac);
            return nbcandepreuvefac;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbcandepreuvefac nbcandepreuvefac) {
        try{
            em.remove(em.merge(nbcandepreuvefac));//on le rattache au contexte de persistance d'abord avec em.merge(nbcandepreuvefac)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbcandepreuvefac find(int id) {
        try{
            return em.find(Nbcandepreuvefac.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbcandepreuvefac> findAll() {
        try{
            return em.createQuery("select n from Nbcandepreuvefac n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Nbcandepreuvefac> findNbcandepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select n from Nbcandepreuvefac n join n.session ses join n.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Nbcandepreuvefac findNbcandepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String nomEpreuvefacSelected) {
        try{
            return (Nbcandepreuvefac) em.createQuery("select n from Nbcandepreuvefac n join n.souscentre scent join n.session ses join n.groupe gpe where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and n.nomepreuve=:param5").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", nomEpreuvefacSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
