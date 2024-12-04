
package couche_dao;

import couche_jpa.Eltpratiquestt;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltpratiquesttDao implements IEltpratiquestt{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltpratiquesttDao(){ 
    }
    
    @Override
    public Eltpratiquestt create(Eltpratiquestt eltpratiquestt) {
        try{
            em.persist(eltpratiquestt);
            return eltpratiquestt;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltpratiquestt edit(Eltpratiquestt eltpratiquestt) {
        try{
            em.merge(eltpratiquestt);
            return eltpratiquestt;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltpratiquestt eltpratiquestt) {
        try{
            em.remove(em.merge(eltpratiquestt));//on le rattache au contexte de persistance d'abord avec em.merge(eltpratiquestt)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltpratiquestt find(int id) {
        try{
            return em.find(Eltpratiquestt.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltpratiquestt> findAll() {
        try{
            return em.createQuery("select e from Eltpratiquestt e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Eltpratiquestt> findAllEltpratiquesttD1Session(int anneeSelected) {
        try{
            return em.createQuery("select e from Eltpratiquestt e where e.session.annee=:param").setParameter("param", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            } 
    }

    @Override
    public Eltpratiquestt findEltpratiquesttD1SouscentreD1OptionD1Session(String nomSouscentre, String sigleOption, int annee) {
        try{
            return (Eltpratiquestt) em.createQuery("select e from Eltpratiquestt e where e.souscentre.nomsouscent=:param1 and e.option.sigle=:param2 and e.session.annee=:param3").setParameter("param1", nomSouscentre).setParameter("param2", sigleOption).setParameter("param3", annee).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            } 
    }

    @Override
    public List<Eltpratiquestt> findAllEltpratiquesttD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected) {
        try{
            return em.createQuery("select e from Eltpratiquestt e where e.groupe.niveau=:param1 and e.groupe.type=:param2 and e.session.annee=:param3").setParameter("param1", niveauSelected).setParameter("param2", typeSelected).setParameter("param3", anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
    
}
