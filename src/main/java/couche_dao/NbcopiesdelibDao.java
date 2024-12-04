
package couche_dao;

import couche_jpa.Nbcopiesdelib;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NbcopiesdelibDao implements INbcopiesdelib {

    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public NbcopiesdelibDao(){ 
    }
    
    
    @Override
    public Nbcopiesdelib create(Nbcopiesdelib nbcopiesdelib) {
        try{
            em.persist(nbcopiesdelib);
            return nbcopiesdelib;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Nbcopiesdelib edit(Nbcopiesdelib nbcopiesdelib) {
        try{
            em.merge(nbcopiesdelib);
            return nbcopiesdelib;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Nbcopiesdelib nbcopiesdelib) {
        try{
            em.remove(em.merge(nbcopiesdelib));//on le rattache au contexte de persistance d'abord avec em.merge(nbcopiesdelib)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Nbcopiesdelib find(int id) {
        try{
            return em.find(Nbcopiesdelib.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Nbcopiesdelib> findAll() {
        try{
            return em.createQuery("select n from Nbcopiesdelib n order by n.souscentre.etablissement.arrondissement.departement.region.nomreg asc,n.souscentre.etablissement.arrondissement.departement.nomdepart asc,n.souscentre.etablissement.arrondissement.nomarr asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Nbcopiesdelib findNbcopiesdelibD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return (Nbcopiesdelib) em.createQuery("select n from Nbcopiesdelib n join n.centre cent join n.groupe gpe join n.session ses where cent.nomcent=:param1 and ses.annee=:param2 and gpe.niveau=:param3 and gpe.type=:param4").setParameter("param1", nomCentredeliberationSelected).setParameter("param2", anneeSelected).setParameter("param3", niveauSelected).setParameter("param4", typeSelected).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Nbcopiesdelib> findNbcopiesdelibD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected) {
        try{
            return em.createQuery("select n from Nbcopiesdelib n join n.groupe gpe join n.session ses where ses.annee=:param1 and gpe.niveau=:param2 and gpe.type=:param3 order by n.centre.etablissement.arrondissement.departement.region.nomreg asc").setParameter("param1", anneeSelected).setParameter("param2", niveauSelected).setParameter("param3", typeSelected).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }
    
}
