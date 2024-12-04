
package couche_dao;

import couche_jpa.Eltcorrecttech;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltcorrecttechDao implements IEltcorrecttech{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltcorrecttechDao(){ 
    }

    @Override
    public Eltcorrecttech create(Eltcorrecttech eltcorrecttech) {
        try{
            em.persist(eltcorrecttech);
            return eltcorrecttech;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltcorrecttech edit(Eltcorrecttech eltcorrecttech) {
        try{
            em.merge(eltcorrecttech);
            return eltcorrecttech;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltcorrecttech eltcorrecttech) {
        try{
            em.remove(em.merge(eltcorrecttech));//on le rattache au contexte de persistance d'abord avec em.merge(eltcorrecttech)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltcorrecttech find(int id) {
        try{
            return em.find(Eltcorrecttech.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Eltcorrecttech> findAll() {
        try{
            return em.createQuery("select e from Eltcorrecttech e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Eltcorrecttech findEltcorrecttechD1NatureD1SousfamilleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected, String natureSelected) {
        try{
            return (Eltcorrecttech) em.createQuery("select e from Eltcorrecttech e join e.ponderation p where e.souscentre.nomsouscent=:param1 and e.session.annee=:param2 and p.groupe.niveau=:param3 and p.groupe.type=:param4 and p.sousfamille.titre=:param5 and p.nature=:param6").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", titreSousfamilleSelected).setParameter("param6", natureSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Eltcorrecttech> findEltcorrecttechsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltcorrecttech e join e.ponderation p where e.session.annee=:param1 and p.groupe.niveau=:param2 and p.groupe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3",typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
