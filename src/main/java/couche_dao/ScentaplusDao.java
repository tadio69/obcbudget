
package couche_dao;

import couche_jpa.Scentaplus;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ScentaplusDao implements IScentaplus{

    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public ScentaplusDao(){ 
    }
    
    @Override
    public Scentaplus create(Scentaplus scentaplus) {
        try{
            em.persist(scentaplus);
            return scentaplus;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Scentaplus edit(Scentaplus scentaplus) {
        try{
            em.merge(scentaplus);
            return scentaplus;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Scentaplus scentaplus) {
        try{
            em.remove(em.merge(scentaplus));//on le rattache au contexte de persistance d'abord avec em.merge(scentaplus)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Scentaplus find(int id) {
        try{
            return em.find(Scentaplus.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Scentaplus> findAll() {
        try{
            return em.createQuery("select s from Scentaplus s order by s.souscentre.etablissement.arrondissement.departement.region.nomreg asc,s.souscentre.etablissement.arrondissement.departement.nomdepart asc, s.souscentre.etablissement.arrondissement.nomarr asc, s.souscentre.nomsouscent asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public void supprimerUnScentaplus(int annee, String sigleExamen, String nomSouscentre) {
        try{
            em.createQuery("delete from Scentaplus s where s in (select sc from Scentaplus sc where sc.session.annee=:param1 and sc.examen.sigle=:param2 and sc.souscentre.nomsouscent=:param3)").setParameter("param1",annee).setParameter("param2", sigleExamen).setParameter("param3", nomSouscentre).executeUpdate();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            } 
    }

    @Override
    public List<Scentaplus> findScentaplusD1ExamenEt1Session(int annee, String sigleExamen) {
        try{
            return em.createQuery("select s from Scentaplus s join s.session ses join s.examen exa where ses.annee=:param1 and exa.sigle=:param2 order by s.souscentre.etablissement.arrondissement.departement.region.nomreg asc,s.souscentre.etablissement.arrondissement.departement.nomdepart asc, s.souscentre.etablissement.arrondissement.nomarr asc, s.souscentre.nomsouscent asc").setParameter("param1",annee).setParameter("param2",sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Scentaplus> findScentaplusD1RegionA1ExamenEt1Session(int anneeSelected, String sigleExamenSelected, String nomRegionSelected) {
        try{
            return em.createQuery("select s from Scentaplus s join s.session ses join s.examen exa join s.souscentre.etablissement.arrondissement.departement.region reg where ses.annee=:param1 and exa.sigle=:param2 and reg.nomreg=:param3 order by s.souscentre.etablissement.arrondissement.departement.nomdepart asc, s.souscentre.etablissement.arrondissement.nomarr asc, s.souscentre.nomsouscent asc").setParameter("param1",anneeSelected).setParameter("param2",sigleExamenSelected).setParameter("param3",nomRegionSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
