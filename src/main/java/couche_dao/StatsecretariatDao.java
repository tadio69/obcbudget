
package couche_dao;

import couche_jpa.Statsecretariat;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class StatsecretariatDao implements IStatsecretariat{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public StatsecretariatDao(){ 
    }

    @Override
    public Statsecretariat create(Statsecretariat statsecretariat) {
        try{
            em.persist(statsecretariat);
            return statsecretariat;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Statsecretariat edit(Statsecretariat statsecretariat) {
        try{
            em.merge(statsecretariat);
            return statsecretariat;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Statsecretariat statsecretariat) {
        try{
            em.remove(em.merge(statsecretariat));//on le rattache au contexte de persistance d'abord avec em.merge(statsecretariat)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Statsecretariat find(int id) {
        try{
            return em.find(Statsecretariat.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Statsecretariat> findAll() {
        try{
            return em.createQuery("select s from Statsecretariat s").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Statsecretariat> findStatsecretariatsD1SecretariatD1SouscentreA1ExamenDans1Session(int numsec, int annee, String nomSouscentre, String sigleExamen) {
        try{
            return em.createQuery("select s from Statsecretariat s where s.secretariat.numsec=:param1 and s.secretariat.session.annee=:param2 and s.secretariat.souscentre.nomsouscent=:param3 and s.examen.sigle=:param4 order by s.option.sigle asc").setParameter("param1", numsec).setParameter("param2", annee).setParameter("param3", nomSouscentre).setParameter("param4", sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Statsecretariat> findStatsecretariatsD1SouscentreA1ExamenDans1Session(int annee, String nomSouscentre, String sigleExamen) {
        try{
            return em.createQuery("select s from Statsecretariat s where s.secretariat.session.annee=:param1 and s.secretariat.souscentre.nomsouscent=:param2 and s.examen.sigle=:param3 order by s.option.sigle asc").setParameter("param1", annee).setParameter("param2", nomSouscentre).setParameter("param3", sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Statsecretariat> findStatsecretariatsD1ExamenDans1Session(int annee, String sigleExamen) {
        try{
            return em.createQuery("select s from Statsecretariat s where s.secretariat.session.annee=:param1 and s.examen.sigle=:param2 order by s.option.sigle asc").setParameter("param1", annee).setParameter("param2", sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Statsecretariat> findStatsecretariatsD1SouscentreA1SessionEt1Groupedexamens(String nomsouscent, int annee, String niveau, String type) {
        try{
            return em.createQuery("select s from Statsecretariat s where s.secretariat.souscentre.nomsouscent=:param1 and s.secretariat.session.annee=:param2 and s.examen.niveau=:param3 and s.examen.type=:param4").setParameter("param1", nomsouscent).setParameter("param2", annee).setParameter("param3", niveau).setParameter("param4", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public List<Statsecretariat> findStatsecretariatsABID1ExamenDans1Session(String sigle, int annee) {
        try{
            return em.createQuery("select stat from Statsecretariat stat join stat.examen exa where stat.option.sigle like '%ABI%' and exa.sigle=:param1 and stat.secretariat.session.annee=:param2 order by stat.secretariat.etablissement.arrondissement.departement.region asc,stat.secretariat.etablissement.arrondissement.departement.nomdepart asc,stat.secretariat.etablissement.arrondissement.nomarr asc,stat.secretariat.souscentre.nomsouscent asc,stat.option.sigle asc").setParameter("param1", sigle).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public List<Statsecretariat> findStatsecretariatsAutresLitterairesD1ExamenDans1Session(String sigle, int annee) {
        try{
            return em.createQuery("select stat from Statsecretariat stat join stat.examen exa where stat.option.sigle not like '%ABI%' and stat.option.famille.titre='LITTÉRAIRE' and exa.sigle=:param1 and stat.secretariat.session.annee=:param2 order by stat.secretariat.etablissement.arrondissement.departement.region asc,stat.secretariat.etablissement.arrondissement.departement.nomdepart asc,stat.secretariat.etablissement.arrondissement.nomarr asc,stat.secretariat.souscentre.nomsouscent asc,stat.option.sigle asc").setParameter("param1", sigle).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }

    @Override
    public List<Statsecretariat> findStatsecretariatsScientifiquesD1ExamenDans1Session(String sigle, int annee) {
        try{
            return em.createQuery("select stat from Statsecretariat stat join stat.examen exa where stat.option.famille.titre='SCIENTIFIQUE' and exa.sigle=:param1 and stat.secretariat.session.annee=:param2 order by stat.secretariat.etablissement.arrondissement.departement.region asc,stat.secretariat.etablissement.arrondissement.departement.nomdepart asc,stat.secretariat.etablissement.arrondissement.nomarr asc,stat.secretariat.souscentre.nomsouscent asc,stat.option.sigle asc").setParameter("param1", sigle).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    }
}
