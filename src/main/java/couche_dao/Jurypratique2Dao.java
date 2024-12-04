package couche_dao;

import couche_jpa.Jurypratique2;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Jurypratique2Dao implements IJurypratique2{

    @PersistenceContext
    private EntityManager em;

    // constructeur
    public Jurypratique2Dao() {
    }

    @Override
    public Jurypratique2 create(Jurypratique2 jurypratique2) {
        try{
            em.persist(jurypratique2);
            return jurypratique2;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Jurypratique2 edit(Jurypratique2 jurypratique2) {
        try{
            em.merge(jurypratique2);
            return jurypratique2;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Jurypratique2 jurypratique2) {
        try{
            em.remove(em.merge(jurypratique2));//on le rattache au contexte de persistance d'abord avec em.merge(jurypratique2)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Jurypratique2 find(int id) {
        try{
            return em.find(Jurypratique2.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Jurypratique2> findAll() {
        try{
            return em.createQuery("select j from Jurypratique2 j").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            } 
    }

    @Override
    public Jurypratique2 findJurypratique2D1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected) {
        try{
            return (Jurypratique2) em.createQuery("select j from Jurypratique2 j join j.souscentre scent join j.session ses join j.groupe gpe join j.option opt where scent.nomsouscent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4 and opt.sigle=:param5").setParameter("param1", nomSouscentreSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).setParameter("param5", sigleOptionSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Jurypratique2> findJuryspratique2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select j from Jurypratique2 j join j.session ses join j.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
