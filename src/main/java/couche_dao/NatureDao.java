
package couche_dao;

import couche_jpa.Nature;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NatureDao implements INature{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NatureDao(){ 
    }

    @Override
    public Nature create(Nature nature) {
        try{
            em.persist(nature);
            return nature;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nature edit(Nature nature) {
        try{
            em.merge(nature);
            return nature;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nature nature) {
        try{
            em.remove(em.merge(nature));//on le rattache au contexte de persistance d'abord avec em.merge(nature)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nature find(int id) {
        try{
            return em.find(Nature.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nature> findAll() {
        try{
            return em.createQuery("select n from Nature n order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc,n.souscentre.etablissement.arrondissement.departement.nomdepart asc, n.souscentre.etablissement.arrondissement.nomarr asc, n.souscentre.nomsouscent asc, n.activite.nomact asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Character> findNaturesEnCharD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomEtablissement) {
        try{
            return em.createQuery("select distinct n.activite.initiale from Nature n join n.session ses join n.examen ex join n.souscentre sous where ses.annee=:param1 and ex.sigle=:param2 and sous.etablissement.abreviation=:param3 order by n.activite.initiale asc").setParameter("param1",anneeSelected).setParameter("param2", sigleExamenSelected).setParameter("param3", nomEtablissement).getResultList();//nomEtablissement abritant le sous-centre
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
    @Override
    public List<String> findPhasesD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected) {
        try{
            return em.createQuery("select distinct n.activite.nomact from Nature n join n.session ses join n.examen ex join n.souscentre sous where ses.annee=:param1 and ex.sigle=:param2 and sous.nomsouscent=:param3 order by n.activite.nomact asc").setParameter("param1",anneeSelected).setParameter("param2", sigleExamenSelected).setParameter("param3", nomSouscentreSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<String> findNaturesEnStringD1ExamenEtD1Session(int anneeSelected, String sigleExamenSelected) {
        try{
            return em.createQuery("select distinct n.activite.nomact from Nature n join n.session ses join n.examen ex where ses.annee=:param1 and ex.sigle=:param2 order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc,n.souscentre.etablissement.arrondissement.departement.nomdepart asc, n.souscentre.etablissement.arrondissement.nomarr asc, n.souscentre.nomsouscent asc, n.activite.nomact asc").setParameter("param1",anneeSelected).setParameter("param2", sigleExamenSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public void supprimerLesNaturesD1SouscentrePour1SessionD1Examen(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected) {
       try{
            em.createQuery("delete from Nature n where n in (select na from Nature na where na.session.annee=:param1 and na.examen.sigle=:param2 and na.souscentre.nomsouscent=:param3)").setParameter("param1",anneeSelected).setParameter("param2", sigleExamenSelected).setParameter("param3", nomSouscentreSelected).executeUpdate();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            } 
    }

    @Override
    public List<Nature> findNaturesD1ExamenDans1Session(int anneeSelected, String sigle) {
        try{
            return em.createQuery("select n from Nature n join n.session ses join n.examen ex where ses.annee=:param1 and ex.sigle=:param2 order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc,n.souscentre.etablissement.arrondissement.departement.nomdepart asc, n.souscentre.etablissement.arrondissement.nomarr asc, n.souscentre.nomsouscent asc, n.activite.nomact asc").setParameter("param1",anneeSelected).setParameter("param2", sigle).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }

    @Override
    public List<String> findNaturesD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected) {
        try{
            return em.createQuery("select distinct n.activite.nomact from Nature n join n.session ses join n.souscentre sous where sous.nomsouscent=:param1 and ses.annee=:param2 order by n.activite.nomact asc").setParameter("param1", nomSouscentreSelected).setParameter("param2",anneeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    }

    @Override
    public List<Nature> findNaturesDesCentreD1ExamenDans1Session(int annee,String sigleExamen) {
        try{
            return em.createQuery("select n from Nature n join n.session ses join n.examen ex where ses.annee=:param1 and ex.sigle=:param2 and n.activite.initiale='D' order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc,n.souscentre.etablissement.arrondissement.departement.nomdepart asc, n.souscentre.etablissement.arrondissement.nomarr asc, n.souscentre.nomsouscent asc, n.activite.nomact asc").setParameter("param1",annee).setParameter("param2",sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,13);
            }
    }

    @Override
    public List<Nature> findNaturesDesSousCentreD1ExamenDans1Session(int annee,String sigleExamen) {
        try{
            return em.createQuery("select n from Nature n join n.session ses join n.examen ex where ses.annee=:param1 and ex.sigle=:param2 and n.activite.initiale='E' order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc,n.souscentre.etablissement.arrondissement.departement.nomdepart asc, n.souscentre.etablissement.arrondissement.nomarr asc, n.souscentre.nomsouscent asc, n.activite.nomact asc").setParameter("param1",annee).setParameter("param2",sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,14);
            }
    }

    @Override
    public List<Nature> findPhasesD1SouscentreDans1Session(String nomSouscentre, int annee) {
        try{
            return em.createQuery("select distinct n.activite.nomact from Nature n join n.session ses join n.souscentre sous where sous.nomsouscent=:param1 and ses.annee=:param2 order by n.activite.nomact asc").setParameter("param1", nomSouscentre).setParameter("param1",annee).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,15);
            }
    }
}
