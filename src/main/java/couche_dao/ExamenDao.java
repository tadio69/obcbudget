
package couche_dao;

import couche_jpa.Examen;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ExamenDao implements IExamen{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public ExamenDao(){ 
    }

    @Override
    public Examen create(Examen examen) {
        try{
            em.persist(examen);
            return examen;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Examen edit(Examen examen) {
        try{
            em.merge(examen);
            return examen;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Examen examen) {
        try{
            em.remove(em.merge(examen));//on le rattache au contexte de persistance d'abord avec em.merge(examen)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Examen find(int id) {
        try{
            return em.find(Examen.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Examen> findAll() {
        try{
            return em.createQuery("select e from Examen e order by e.nomexam asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Examen> findAllLikeName(String nom) {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.nomexam LIKE :param").setParameter("param","%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public Examen findExamenBySigle(String sigle) {
        try{
            return (Examen) em.createQuery("SELECT e FROM Examen e WHERE e.sigle=:param").setParameter("param",sigle).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Examen> findExamensD1NiveauEtD1Type(String niveau, String type) {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.niveau=:param1 and e.type=:param2").setParameter("param1",niveau).setParameter("param2",type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Examen> findExamensD1Type(String type) {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.type=:param").setParameter("param",type).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public List<Examen> findExamensD1Niveau(String niveau) {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.niveau=:param").setParameter("param",niveau).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public List<Examen> findExamensIndustiels() {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.type LIKE 'IND%'").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }

    @Override
    public List<Examen> findExamensStt() {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.type LIKE 'STT%'").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    }

    @Override
    public List<Examen> findExamensEstp() {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.type<>'GEN'").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,13);
            }
    }

    @Override
    public List<Examen> findExamensIndustielsD1Niveau(String niveau) {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.type LIKE 'IND%' and e.niveau=:param").setParameter("param", niveau).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,14);
            }
    }

    @Override
    public List<Examen> findExamensSttD1Niveau(String niveau) {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.type LIKE 'STT%' and e.niveau=:param").setParameter("param", niveau).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,15);
            }
    }

    @Override
    public List<Examen> findExamensEstpD1Niveau(String niveau) {
        try{
            return em.createQuery("SELECT e FROM Examen e WHERE e.type<>'GEN' and e.niveau=:param").setParameter("param", niveau).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,16);
            }
    }
}
