
package couche_dao;

import couche_jpa.Nbadmissibles;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbadmissiblesDao implements INbadmissibles {
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NbadmissiblesDao(){ 
    }

    @Override
    public Nbadmissibles create(Nbadmissibles nbadmissibles) {
        try{
            em.persist(nbadmissibles);
            return nbadmissibles;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbadmissibles edit(Nbadmissibles nbadmissibles) {
        try{
            em.merge(nbadmissibles);
            return nbadmissibles;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbadmissibles nbadmissibles) {
        try{
            em.remove(em.merge(nbadmissibles));//on le rattache au contexte de persistance d'abord avec em.merge(nbadmissibles)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbadmissibles find(int id) {
         try{
            return em.find(Nbadmissibles.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbadmissibles> findAll() {
        try{
            return em.createQuery("select n from Nbadmissibles n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Nbadmissibles findNbadmissiblesD1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentre, int annee, String niveau, String type, String sigleOption) {
        try{
            return (Nbadmissibles) em.createQuery("select n from Nbadmissibles n join n.souscentre scent join n.groupe gpe join n.session ses join n.option opt where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and opt.sigle=:param5").setParameter("param1", nomSouscentre).setParameter("param2", annee).setParameter("param3", niveau).setParameter("param4", type).setParameter("param5", sigleOption).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Nbadmissibles> findNbadmissiblesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select n from Nbadmissibles n join n.groupe gpe join n.session ses where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
