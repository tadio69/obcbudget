
package couche_dao;

import couche_jpa.Inscritsprives;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class InscritsprivesDao implements IInscritsprives{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public InscritsprivesDao(){ 
    }

    @Override
    public Inscritsprives create(Inscritsprives inscritsprives) {
        try{
            em.persist(inscritsprives);
            return inscritsprives;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Inscritsprives edit(Inscritsprives inscritsprives) {
        try{
            em.merge(inscritsprives);
            return inscritsprives;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Inscritsprives inscritsprives) {
        try{
            em.remove(em.merge(inscritsprives));//on le rattache au contexte de persistance d'abord avec em.merge(inscritsprives)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Inscritsprives find(int id) {
        try{
            return em.find(Inscritsprives.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Inscritsprives> findAll() {
        try{
            return em.createQuery("select i from Inscritsprives i").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Inscritsprives findInscritsprivesD1SouscentreD1GroupedexamensD1Session(String nomSouscentre, String niveauSelected, String typeSelected, int anneeSelected) {
        try{
            return (Inscritsprives) em.createQuery("select i from Inscritsprives i join i.session ses join i.souscentre scent join i.groupe gpe where scent.nomsouscent=:param1 and gpe.niveau=:param2 and gpe.type=:param3 and ses.annee=:param4").setParameter("param1", nomSouscentre).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).setParameter("param4", anneeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Inscritsprives> findInscritsprivesD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select i from Inscritsprives i join i.session ses join i.groupe gpe where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 order by i.souscentre.etablissement.arrondissement.departement.region.nomreg asc,i.souscentre.etablissement.arrondissement.departement.nomdepart asc,i.souscentre.etablissement.arrondissement.nomarr asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
}
