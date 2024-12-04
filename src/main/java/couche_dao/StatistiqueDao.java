
package couche_dao;

import couche_jpa.Statistique;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class StatistiqueDao implements IStatistique{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public StatistiqueDao(){ 
    }

    @Override
    public Statistique create(Statistique statistique) {
        try{
            em.persist(statistique);
            return statistique;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Statistique edit(Statistique statistique) {
        try{
            em.merge(statistique);
            return statistique;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Statistique statistique) {
        try{
            em.remove(em.merge(statistique));//on le rattache au contexte de persistance d'abord avec em.merge(statistique)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Statistique find(int id) {
        try{
            return em.find(Statistique.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Statistique> findAll() {
        try{
            return em.createQuery("select s from Statistique s").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Statistique> findStatistiquesD1SouscentreA1ExamenDans1Session(int annee, String nomSouscentre, String sigleExamen) {
        try{
            return em.createQuery("select stat from Statistique stat join stat.examen ex join stat.session ses join stat.souscentre sous where ses.annee=:param1 and sous.nomsouscent=:param2 and ex.sigle=:param3 order by stat.option.sigle asc").setParameter("param1", annee).setParameter("param2", nomSouscentre).setParameter("param3", sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Statistique> findStatistiquesD1ExamenDans1Session(int annee,String sigleExamen) {
        try{
            return em.createQuery("select stat from Statistique stat join stat.session ses join stat.examen exa where ses.annee=:param1 and exa.sigle=:param2 order by stat.souscentre.etablissement.arrondissement.departement.region.nomreg asc,stat.souscentre.etablissement.arrondissement.departement.nomdepart asc,stat.souscentre.etablissement.arrondissement.nomarr asc,stat.souscentre.nomsouscent asc,stat.examen.sigle asc  stat.option.sigle asc").setParameter("param1", annee).setParameter("param2", sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Statistique> findAllStatistiquesD1ExamenDans1Session(String sigle, int annee) {
        try{
            return em.createQuery("select stat from Statistique stat join stat.session ses join stat.examen exa where exa.sigle=:param1 and ses.annee=:param2 order by stat.souscentre.etablissement.arrondissement.departement.region asc,stat.souscentre.etablissement.arrondissement.departement.nomdepart asc,stat.souscentre.etablissement.arrondissement.nomarr asc,stat.souscentre.nomsouscent asc,stat.option.sigle asc").setParameter("param1", sigle).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Statistique> findStatistiquesD1ExamenDans1SessionET1Souscentre(String sigle, int annee, String nomSouscentre) {
        try{
            return em.createQuery("select stat from Statistique stat join stat.session ses join stat.examen exa join stat.souscentre scent where exa.sigle=:param1 and ses.annee=:param2 and  scent.nomsouscent=:param3 order by stat.option.sigle asc").setParameter("param1", sigle).setParameter("param2", annee).setParameter("param3", nomSouscentre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public List<Statistique> findStatistiquesD1SouscentreDans1Session(int annee, String nomSouscentre) {
        try{
            return em.createQuery("select stat from Statistique stat join stat.session ses join stat.souscentre scent where ses.annee=:param1 and  scent.nomsouscent=:param2 order by stat.option.sigle asc").setParameter("param1", annee).setParameter("param2", nomSouscentre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }

    @Override
    public int findStatistiqueD1SouscentreA1Examen1SessionEt1Option(String nomsouscent, String sigleExamen, int annee, String sigleOption) {
        try{
            return (int) em.createQuery("select stat.nombre from Statistique stat join stat.souscentre scent join stat.examen exam join stat.session ses join stat.option opt where scent.nomsouscent=:param1 and exam.sigle=:param2 and ses.annee=:param3 and opt.sigle=:param4").setParameter("param1", nomsouscent).setParameter("param2", sigleExamen).setParameter("param3", annee).setParameter("param4", sigleOption).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    }

    @Override
    public List<Statistique> findStatistiquesABID1ExamenDans1Session(String sigle, int annee) {
        try{
            return em.createQuery("select stat from Statistique stat join stat.session ses join stat.examen exa where stat.option.sigle like '%ABI%' and exa.sigle=:param1 and ses.annee=:param2 order by stat.souscentre.etablissement.arrondissement.departement.region asc,stat.souscentre.etablissement.arrondissement.departement.nomdepart asc,stat.souscentre.etablissement.arrondissement.nomarr asc,stat.souscentre.nomsouscent asc,stat.option.sigle asc").setParameter("param1", sigle).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,13);
            }
    }

    @Override
    public List<Statistique> findStatistiquesAutresLitterairesD1ExamenDans1Session(String sigle, int annee) {
        try{
            return em.createQuery("select stat from Statistique stat join stat.session ses join stat.examen exa where stat.option.sigle not like '%ABI%' and stat.option.famille.titre='LITTÉRAIRE' and exa.sigle=:param1 and ses.annee=:param2 order by stat.souscentre.etablissement.arrondissement.departement.region asc,stat.souscentre.etablissement.arrondissement.departement.nomdepart asc,stat.souscentre.etablissement.arrondissement.nomarr asc,stat.souscentre.nomsouscent asc,stat.option.sigle asc").setParameter("param1", sigle).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,14);
            }
    }

    @Override
    public List<Statistique> findStatistiquesScientifiquesD1ExamenDans1Session(String sigle, int annee) {
        try{
            return em.createQuery("select stat from Statistique stat join stat.session ses join stat.examen exa where stat.option.famille.titre='SCIENTIFIQUE' and exa.sigle=:param1 and ses.annee=:param2 order by stat.souscentre.etablissement.arrondissement.departement.region asc,stat.souscentre.etablissement.arrondissement.departement.nomdepart asc,stat.souscentre.etablissement.arrondissement.nomarr asc,stat.souscentre.nomsouscent asc,stat.option.sigle asc").setParameter("param1", sigle).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,15);
            }
    }
    
    @Override
    public List<Statistique> findStatistiquesTID1ExamenDans1Session(String sigle, int annee) {
        try{
            return em.createQuery("select stat from Statistique stat join stat.session ses join stat.examen exa where stat.option.sigle='TI' and exa.sigle=:param1 and ses.annee=:param2 order by stat.souscentre.etablissement.arrondissement.departement.region asc,stat.souscentre.etablissement.arrondissement.departement.nomdepart asc,stat.souscentre.etablissement.arrondissement.nomarr asc,stat.souscentre.nomsouscent asc,stat.option.sigle asc").setParameter("param1", sigle).setParameter("param2", annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,14);
            }
    }
    
}
