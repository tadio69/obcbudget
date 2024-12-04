
package couche_dao;

import couche_jpa.Eltvacpratepreuvefac;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltvacpratepreuvefacDao implements IEltvacpratepreuvefac{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltvacpratepreuvefacDao(){ 
    }

    @Override
    public Eltvacpratepreuvefac create(Eltvacpratepreuvefac eltvacpratepreuvefac) {
        try{
            em.persist(eltvacpratepreuvefac);
            return eltvacpratepreuvefac;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltvacpratepreuvefac edit(Eltvacpratepreuvefac eltvacpratepreuvefac) {
        try{
            em.merge(eltvacpratepreuvefac);
            return eltvacpratepreuvefac;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltvacpratepreuvefac eltvacpratepreuvefac) {
        try{
            em.remove(em.merge(eltvacpratepreuvefac));//on le rattache au contexte de persistance d'abord avec em.merge(eltvacpratepreuvefac)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltvacpratepreuvefac find(int id) {
        try{
            return em.find(Eltvacpratepreuvefac.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltvacpratepreuvefac> findAll() {
        try{
            return em.createQuery("select e from Eltvacpratepreuvefac e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public List<Eltvacpratepreuvefac> findEltvacpratepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltvacpratepreuvefac e join e.session ses join e.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Eltvacpratepreuvefac findEltvacpratepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleEpreuvefacSelected) {
        try{
            return (Eltvacpratepreuvefac) em.createQuery("select e from Eltvacpratepreuvefac e join e.souscentre scent join e.session ses join e.groupe gpe join e.epreuve epr where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and epr.sigle=:param5").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", sigleEpreuvefacSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
