
package couche_dao;

import couche_jpa.Caisse;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CaisseDao implements ICaisse {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public CaisseDao(){ 
    }
    
    @Override
    public Caisse create(Caisse caisse) {
        try{
            em.persist(caisse);
            return caisse;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Caisse edit(Caisse caisse) {
        try{
            em.merge(caisse);
            return caisse;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Caisse caisse) {
        try{
            em.remove(em.merge(caisse));//on le rattache au contexte de persistance d'abord avec em.merge(caisse)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Caisse find(int id) {
        try{
            return em.find(Caisse.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Caisse> findAll() {
        try{
            return em.createQuery("select c from Caisse c order by c.souscentre.etablissement.arrondissement.departement.region.nomreg asc,c.souscentre.etablissement.arrondissement.departement.nomdepart,c.souscentre.etablissement.arrondissement.nomarr asc, c.rubetat.designation asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Caisse> findCaissesD1Session(int annee) {
        try{
            return em.createQuery("select c from Caisse c join c.session s where s.annee=:param order by c.souscentre.etablissement.arrondissement.departement.region.nomreg asc,c.souscentre.etablissement.arrondissement.departement.nomdepart,c.souscentre.etablissement.arrondissement.nomarr asc, c.rubetat.designation asc").setParameter("param", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    } 

    @Override
    public Caisse findCaisseD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int annee, String nomSouscentre, String niveau, String type, String designationRubriquetat) {
        try{
            return (Caisse) em.createQuery("select c from Caisse c join c.session ses join c.souscentre scent join c.groupe g join c.rubetat rub where  ses.annee=:param1 and scent.nomsouscent=:param2 and g.niveau=:param3 and g.type=:param4 and rub.designation=:param5").setParameter("param1", annee).setParameter("param2", nomSouscentre).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", designationRubriquetat).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Caisse> findCaissesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int annee, String niveau, String type) {
        try{
            return em.createQuery("select c from Caisse c join c.rubetat rub join c.session ses join c.groupe g where rub.designation=:param1 and ses.annee=:param2 and g.niveau=:param3 and g.type=:param4 order by c.souscentre.etablissement.arrondissement.departement.region.nomreg asc,c.souscentre.etablissement.arrondissement.departement.nomdepart asc,c.souscentre.etablissement.arrondissement.nomarr asc, c.souscentre.nomsouscent asc").setParameter("param1", designation).setParameter("param2", annee).setParameter("param3", niveau).setParameter("param4", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Caisse> findCaissesOrdinairesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int annee, String niveau, String type) {
        try{
            return em.createQuery("select c from Caisse c join c.rubetat rub join c.session ses join c.groupe g where c.additif=false and rub.designation=:param1 and ses.annee=:param2 and g.niveau=:param3 and g.type=:param4 order by c.souscentre.etablissement.arrondissement.departement.region.nomreg asc,c.souscentre.etablissement.arrondissement.departement.nomdepart asc,c.souscentre.etablissement.arrondissement.nomarr asc, c.souscentre.nomsouscent asc").setParameter("param1", designation).setParameter("param2", annee).setParameter("param3", niveau).setParameter("param4", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public List<Caisse> findCaissesAdditivesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int annee, String niveau, String type) {
        try{
            return em.createQuery("select c from Caisse c join c.rubetat rub join c.session ses join c.groupe g where c.additif=true and rub.designation=:param1 and ses.annee=:param2 and g.niveau=:param3 and g.type=:param4 order by c.souscentre.etablissement.arrondissement.departement.region.nomreg asc,c.souscentre.etablissement.arrondissement.departement.nomdepart asc,c.souscentre.etablissement.arrondissement.nomarr asc, c.souscentre.nomsouscent asc").setParameter("param1", designation).setParameter("param2", annee).setParameter("param3", niveau).setParameter("param4", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public Caisse findCaisseOrdinaireD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int annee, String nomSouscentre, String niveau, String type, String designationRubriquetat) {
        try{
            return (Caisse) em.createQuery("select c from Caisse c join c.session ses join c.souscentre scent join c.groupe g join c.rubetat rub where c.additif=false and ses.annee=:param1 and scent.nomsouscent=:param2 and g.niveau=:param3 and g.type=:param4 and rub.designation=:param5").setParameter("param1", annee).setParameter("param2", nomSouscentre).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", designationRubriquetat).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }

    @Override
    public Caisse findCaisseAdditiveD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int annee, String nomSouscentre, String niveau, String type, String designationRubriquetat) {
        try{
            return (Caisse) em.createQuery("select c from Caisse c join c.session ses join c.souscentre scent join c.groupe g join c.rubetat rub where c.additif=true and ses.annee=:param1 and scent.nomsouscent=:param2 and g.niveau=:param3 and g.type=:param4 and rub.designation=:param5").setParameter("param1", annee).setParameter("param2", nomSouscentre).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", designationRubriquetat).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    }
}
