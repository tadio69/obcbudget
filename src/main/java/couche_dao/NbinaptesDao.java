
package couche_dao;

import couche_jpa.Nbinaptes;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbinaptesDao implements INbinaptes{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NbinaptesDao(){ 
    }

    @Override
    public Nbinaptes create(Nbinaptes nb) {
        try{
            em.persist(nb);
            return nb;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbinaptes edit(Nbinaptes nb) {
        try{
            em.merge(nb);
            return nb;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbinaptes nb) {
        try{
            em.remove(em.merge(nb));//on le rattache au contexte de persistance d'abord avec em.merge(nb)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbinaptes find(int id) {
        try{
            return em.find(Nbinaptes.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbinaptes> findAll() {
        try{
            return em.createQuery("select n from Nbinaptes n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Nbinaptes findNbinaptesD1SouscentreD1GroupedexamensD1Session(String nomSouscentre, int annee, String niveau, String type) {
        try{
            return (Nbinaptes) em.createQuery("select n from Nbinaptes n join n.souscentre scent join n.groupe gpe join n.session ses where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4").setParameter("param1", nomSouscentre).setParameter("param2", annee).setParameter("param3", niveau).setParameter("param4", type).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Nbinaptes> findAllNbinaptesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select n from Nbinaptes n join n.groupe gpe join n.session ses where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
