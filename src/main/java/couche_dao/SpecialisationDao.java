
package couche_dao;

import couche_jpa.Specialisation;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class SpecialisationDao implements ISpecialisation{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public SpecialisationDao(){ 
    }

    @Override
    public Specialisation create(Specialisation specialisation) {
        try{
            em.persist(specialisation);
            return specialisation;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Specialisation edit(Specialisation specialisation) {
        try{
            em.merge(specialisation);
            return specialisation;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Specialisation specialisation) {
        try{
            em.remove(em.merge(specialisation));//on le rattache au contexte de persistance d'abord avec em.merge(specialisation)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Specialisation find(int id) {
        try{
            return em.find(Specialisation.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Specialisation> findAll() {
        try{
            return em.createQuery("select s from Specialisation s").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Specialisation> findSpecialisationsD1SouscentrePour1ExamenEtSession(int annee, String sigleExamen, String nomSouscentre) {
         try{
            return em.createQuery("select s from Specialisation s join s.souscentre scent join s.examen exa join s.session sess where sess.annee=:param1 and exa.sigle=:param2 and scent.nomsouscent=:param3 order by s.option.sigle asc").setParameter("param1",annee).setParameter("param2", sigleExamen).setParameter("param3", nomSouscentre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Specialisation> findSpecialisationsD1ExamenEtD1Session(int annee, String sigleExamen) {
        try{
            return em.createQuery("select s from Specialisation s join s.session sess join s.examen ex where sess.annee=:param1 and ex.sigle=:param2 order by s.souscentre.etablissement.arrondissement.departement.region.nomreg asc,s.souscentre.etablissement.arrondissement.departement.nomdepart asc, s.option.sigle asc").setParameter("param1",annee).setParameter("param2",sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public void supprimerLesSpecialisationsD1SouscentrePour1SessionD1Examen(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected) {
        try{
            em.createQuery("delete from Specialisation s where s in (select sp from Specialisation sp where sp.session.annee=:param1 and sp.examen.sigle=:param2 and sp.souscentre.nomsouscent=:param3)").setParameter("param1",anneeSelected).setParameter("param2", sigleExamenSelected).setParameter("param3", nomSouscentreSelected).executeUpdate();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    } 

    @Override
    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1SessionEtniveau(int annee, String nomSouscentre, String niveau) {
        try{
            return em.createQuery("select s from Specialisation s join s.souscentre scent join s.session sess join s.examen exam where sess.annee=:param1 and scent.nomsouscent=:param2 and exam.niveau=:param3").setParameter("param1",annee).setParameter("param2", nomSouscentre).setParameter("param3", niveau).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1SessionD1NiveauEtType(int annee, String nomSouscentre, String niveau, String type) {
        try{
            return em.createQuery("select s from Specialisation s join s.souscentre scent join s.session sess join s.examen exam where sess.annee=:param1 and scent.nomsouscent=:param2 and exam.niveau=:param3 and exam.type=:param4").setParameter("param1",annee).setParameter("param2", nomSouscentre).setParameter("param3", niveau).setParameter("param4", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public List<Specialisation> findSpecialisationsD1SouscentreEtSession(int annee, String nomSouscentre) {
        try{
            return em.createQuery("select s from Specialisation s join s.souscentre scent join s.session sess where sess.annee=:param1 and scent.nomsouscent=:param2 order by s.option.sigle asc").setParameter("param1",annee).setParameter("param2", nomSouscentre).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }
}
