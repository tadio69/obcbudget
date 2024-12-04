
package couche_dao;

import couche_jpa.Matoeuvresf;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MatoeuvresfDao implements IMatoeuvresf{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public MatoeuvresfDao(){ 
    }
    
    @Override
    public Matoeuvresf create(Matoeuvresf matoeuvresf) {
        try{
            em.persist(matoeuvresf);
            return matoeuvresf;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Matoeuvresf edit(Matoeuvresf matoeuvresf) {
        try{
            em.merge(matoeuvresf);
            return matoeuvresf;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Matoeuvresf matoeuvresf) {
        try{
            em.remove(em.merge(matoeuvresf));//on le rattache au contexte de persistance d'abord avec em.merge(matoeuvresf)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Matoeuvresf find(int id) {
        try{
            return em.find(Matoeuvresf.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Matoeuvresf> findAll() {
        try{
            return em.createQuery("select m from Matoeuvresf m").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Matoeuvresf findMatoeuvresfD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return (Matoeuvresf) em.createQuery("select m from Matoeuvresf m join m.souscentre scent join m.session ses join m.groupe gpe where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Matoeuvresf> findMatoeuvresfsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select m from Matoeuvresf m join m.session ses join m.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
}
