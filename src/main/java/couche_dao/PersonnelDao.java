
package couche_dao;

import couche_jpa.Personnel;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class PersonnelDao implements IPersonnel{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public PersonnelDao(){ 
    }

    @Override
    public Personnel create(Personnel personnel) {
        try{
            em.persist(personnel);
            return personnel;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Personnel edit(Personnel personnel) {
        try{
            em.merge(personnel);
            return personnel;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Personnel personnel) {
        try{
            em.remove(em.merge(personnel));//on le rattache au contexte de persistance d'abord avec em.merge(personnel)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Personnel find(int id) {
        try{
            return em.find(Personnel.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Personnel> findAll() {
        try{
            return em.createQuery("select p from Personnel p order by p.arrondissement.departement.region.nomreg,p.arrondissement.departement.nomdepart,p.arrondissement.nomarr").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Personnel> findAllLikeName(String nom) {
        try{
            return em.createQuery("SELECT p FROM Personnel p WHERE p.nompers LIKE :param order by p.nompers asc, p.prenom asc").setParameter("param","%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }
    
    @Override
    public List<Personnel> findPersonnelsD1Departement(String nomDepartement) {
        try{
            return em.createQuery("SELECT p FROM Personnel p JOIN p.arrondissement.departement d WHERE d.nomdepart=:param order by p.arrondissement.nomarr,p.nompers").setParameter("param",nomDepartement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }

    @Override
    public List<Personnel> findPersonnelsD1Arrondissement(String nomArrondissement) {
        try{
            return em.createQuery("SELECT p FROM Personnel p JOIN p.arrondissement a WHERE a.nomarr=:param order by p.nompers").setParameter("param",nomArrondissement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public Personnel findByMatricule(String matricule) {
        try{
            return (Personnel)em.createQuery("SELECT p FROM Personnel p WHERE p.matricule=:param").setParameter("param",matricule).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }
}
