
package couche_dao;

import couche_jpa.Eltcorrecttechsecret;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EltcorrecttechsecretDao implements IEltcorrecttechsecret{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public EltcorrecttechsecretDao(){ 
    }

    @Override
    public Eltcorrecttechsecret create(Eltcorrecttechsecret eltcorrecttechsecret) {
        try{
            em.persist(eltcorrecttechsecret);
            return eltcorrecttechsecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Eltcorrecttechsecret edit(Eltcorrecttechsecret eltcorrecttechsecret) {
        try{
            em.merge(eltcorrecttechsecret);
            return eltcorrecttechsecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Eltcorrecttechsecret eltcorrecttechsecret) {
        try{
            em.remove(em.merge(eltcorrecttechsecret));//on le rattache au contexte de persistance d'abord avec em.merge(eltcorrecttechsecret)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Eltcorrecttechsecret find(int id) {
        try{
            return em.find(Eltcorrecttechsecret.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Eltcorrecttechsecret> findAll() {
        try{
            return em.createQuery("select e from Eltcorrecttechsecret e").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Eltcorrecttechsecret findEltcorrecttechsecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected) {
        try{
            return (Eltcorrecttechsecret) em.createQuery("select e from Eltcorrecttechsecret e where j.secretariat.souscentre.nomsouscent=:param1 and j.secretariat.numsec=:param2 and j.session.annee=:param3 and j.groupe.niveau=:param4 and j.groupe.type=:param5 and j.sousfamille.titre=:param6").setParameter("param1", nomSouscentreSelected).setParameter("param2", numsecSelected).setParameter("param3", anneeSelected).setParameter("param4", niveauSelected).setParameter("param5", typeSelected).setParameter("param6", titreSousfamilleSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Eltcorrecttechsecret> findEltcorrecttechsecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select e from Eltcorrecttechsecret e where e.session.annee=:param1 and e.secretariat.examen.niveau=:param2 and e.secretariat.examen.type=:param3").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
