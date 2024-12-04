
package couche_dao;

import couche_jpa.Caissesport;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author famille chijou
 */
@Transactional
public class CaissesportDao implements ICaissesport{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public CaissesportDao(){ 
    }
    
    @Override
    public Caissesport create(Caissesport caissesport) {
        try{
            em.persist(caissesport);
            return caissesport;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Caissesport edit(Caissesport caissesport) {
        try{
            em.merge(caissesport);
            return caissesport;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Caissesport caissesport) {
        try{
            em.remove(em.merge(caissesport));//on le rattache au contexte de persistance d'abord avec em.merge(caissesport)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Caissesport find(int id) {
        try{
            return em.find(Caissesport.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Caissesport> findAll() {
        try{
            return em.createQuery("select c from Caissesport c order by c.etablissement.arrondissement.departement.region.nomreg asc,c.etablissement.arrondissement.departement.nomdepart,c.etablissement.arrondissement.nomarr asc, c.rubetat.designation asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }   

    @Override
    public List<Caissesport> findCaissesportD1Session(int annee) {
        try{
            return em.createQuery("select c from Caissesport c join c.session s where s.annee=:param order by c.etablissement.arrondissement.departement.region.nomreg asc,c.etablissement.arrondissement.departement.nomdepart asc,c.etablissement.arrondissement.nomarr asc, c.rubetat.designation asc").setParameter("param", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Caissesport findCaissesportD1EtablissementDans1SessionPour1Groupedexamens(int annee, String nomEtablissement, String niveau, String type) {
        try{
            return (Caissesport) em.createQuery("select c from Caissesport c join c.session ses join c.etablissement etab join c.groupe g where ses.annee=:param1 and etab.abreviation=:param2 and g.niveau=:param3 and g.type=:param4").setParameter("param1", annee).setParameter("param2", nomEtablissement).setParameter("param3", niveau).setParameter("param4", type).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Caissesport> findCaissesportsD1SessionPour1Groupedexamens(int annee, String niveau, String type) {
        try{
            return em.createQuery("select c from Caissesport c join c.session ses join c.groupe g where ses.annee=:param1 and g.niveau=:param2 and g.type=:param3").setParameter("param1", annee).setParameter("param2", niveau).setParameter("param3", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
}
