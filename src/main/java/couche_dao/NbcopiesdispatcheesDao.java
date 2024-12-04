
package couche_dao;

import couche_jpa.Nbcopiesdispatchees;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbcopiesdispatcheesDao implements INbcopiesdispatchees {
    
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NbcopiesdispatcheesDao(){ 
    }
    
    @Override
    public Nbcopiesdispatchees create(Nbcopiesdispatchees nbcopiesdispatchees) {
        try{
            em.persist(nbcopiesdispatchees);
            return nbcopiesdispatchees;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbcopiesdispatchees edit(Nbcopiesdispatchees nbcopiesdispatchees) {
        try{
            em.merge(nbcopiesdispatchees);
            return nbcopiesdispatchees;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbcopiesdispatchees nbcopiesdispatchees) {
        try{
            em.remove(em.merge(nbcopiesdispatchees));//on le rattache au contexte de persistance d'abord avec em.merge(nbcopiesdispatchees)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbcopiesdispatchees find(int id) {
        try{
            return em.find(Nbcopiesdispatchees.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbcopiesdispatchees> findAll() {
        try{
            return em.createQuery("select n from Nbcopiesdispatchees n order by n.centredispatching.etablissement.arrondissement.departement.region.nomreg asc,n.centredispatching.etablissement.arrondissement.departement.nomdepart asc,n.centredispatching.etablissement.arrondissement.nomarr asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Nbcopiesdispatchees findNbcopiesdispatcheesD1CentreregroupementD1GroupedexamensD1Session(String nomCentreregroupementSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return (Nbcopiesdispatchees) em.createQuery("select n from Nbcopiesdispatchees n join n.centredispatching cent join n.groupe gpe join n.session ses where cent.etablissement.abreviation=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4").setParameter("param1", nomCentreregroupementSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Nbcopiesdispatchees> findNbcopiesdispatcheesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select n from Nbcopiesdispatchees n join n.groupe gpe join n.session ses where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 order by n.centredispatching.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
