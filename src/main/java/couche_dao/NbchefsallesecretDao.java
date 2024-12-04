
package couche_dao;

import couche_jpa.Nbchefsallesecret;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbchefsallesecretDao implements INbchefsallesecret{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NbchefsallesecretDao(){ 
    }

    @Override
    public Nbchefsallesecret create(Nbchefsallesecret nbchefsallesecret) {
        try{
            em.persist(nbchefsallesecret);
            return nbchefsallesecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbchefsallesecret edit(Nbchefsallesecret nbchefsallesecret) {
        try{
            em.merge(nbchefsallesecret);
            return nbchefsallesecret;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbchefsallesecret nbchefsallesecret) {
        try{
            em.remove(em.merge(nbchefsallesecret));//on le rattache au contexte de persistance d'abord avec em.merge(nbchefsallesecret)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbchefsallesecret find(int id) {
        try{
            return em.find(Nbchefsallesecret.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            } 
    }

    @Override
    public List<Nbchefsallesecret> findAll() {
        try{
            return em.createQuery("select n from Nbchefsallesecret n").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Nbchefsallesecret findNbchefsalleD1SecretariatD1GroupedexamensD1Session(String nomSouscentre, int numsec, int annee, String niveau, String type) {
        try{
            return (Nbchefsallesecret) em.createQuery("select n from Nbchefsallesecret n where n.secretariat.souscentre.nomsouscent=:param1 and n.secretariat.numsec=:param2 and n.session.annee=:param3 and n.groupe.niveau=:param4 and n.groupe.type=:param5").setParameter("param1", nomSouscentre).setParameter("param2", numsec).setParameter("param3", annee).setParameter("param4", niveau).setParameter("param5", type).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Nbchefsallesecret> findNbchefsallesecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select n from Nbchefsallesecret n join n.groupe gpe join n.session ses where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 order by n.secretariat.souscentre.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
    
}
