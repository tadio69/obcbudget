
package couche_dao;

import couche_jpa.Specialisationsec;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class SpecialisationsecDao implements ISpecialisationsec{
     @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public SpecialisationsecDao(){ 
    }

    @Override
    public Specialisationsec create(Specialisationsec specialisationsec) {
        try{
            em.persist(specialisationsec);
            return specialisationsec;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Specialisationsec edit(Specialisationsec specialisationsec) {
        try{
            em.merge(specialisationsec);
            return specialisationsec;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Specialisationsec specialisationsec) {
        try{
            em.remove(em.merge(specialisationsec));//on le rattache au contexte de persistance d'abord avec em.merge(specialisationsec)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Specialisationsec find(int id) {
        try{
            return em.find(Specialisationsec.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Specialisationsec> findAll() {
        try{
            return em.createQuery("select s from Specialisationsec s").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Specialisationsec> findSpecialisationsecD1Secretariat(int numsec, int annee, String nomsouscent, String abreviation) {
        try{
            return em.createQuery("select s from Specialisationsec s where s.secretariat.numsec=:param1 and s.secretariat.session.annee=:param2 and s.secretariat.souscentre.nomsouscent=:param3 and s.secretariat.etablissement.abreviation=:param4").setParameter("param1",numsec).setParameter("param2",annee).setParameter("param3", nomsouscent).setParameter("param4", abreviation).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Specialisationsec> findSpecialisationsecD1SecretariatEtExamen(int numsec, int annee, String nomSouscentre, String abreviation, String sigleExamen) {
        try{
            return em.createQuery("select s from Specialisationsec s where s.secretariat.numsec=:param1 and s.secretariat.session.annee=:param2 and s.secretariat.souscentre.nomsouscent=:param3 and s.secretariat.etablissement.abreviation=:param4 and s.examen.sigle=:param5").setParameter("param1",numsec).setParameter("param2",annee).setParameter("param3", nomSouscentre).setParameter("param4", abreviation).setParameter("param5", sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Specialisationsec> findSpecialisationsecD1SecretariatD1GroupedexamenD1session(int numsec, int annee, String nomSouscentre, String niveau, String type) {
        try{
            return em.createQuery("select s from Specialisationsec s where s.secretariat.numsec=:param1 and s.secretariat.session.annee=:param2 and s.secretariat.souscentre.nomsouscent=:param3 and s.examen.niveau=:param4 and s.examen.type=:param5").setParameter("param1",numsec).setParameter("param2",annee).setParameter("param3", nomSouscentre).setParameter("param4", niveau).setParameter("param5", type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }
}
