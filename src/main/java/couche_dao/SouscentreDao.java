
package couche_dao;

import couche_jpa.Souscentre;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class SouscentreDao implements ISouscentre{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public SouscentreDao(){ 
    }
    
    @Override
    public Souscentre create(Souscentre souscentre) {
        try{
            em.persist(souscentre);
            return souscentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Souscentre edit(Souscentre souscentre) {
        try{
            em.merge(souscentre);
            return souscentre;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Souscentre souscentre) {
        try{
            em.remove(em.merge(souscentre));//on le rattache au contexte de persistance d'abord avec em.merge(souscentre)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Souscentre find(int id) {
        try{
            return em.find(Souscentre.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Souscentre> findAll() {
        try{
            return em.createQuery("select s from Souscentre s order by s.etablissement.arrondissement.departement.region.nomreg asc,s.etablissement.arrondissement.departement.nomdepart asc,s.etablissement.arrondissement.nomarr asc").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public List<Souscentre> findAllLikeName(String nom) {
        try{
            return em.createQuery("SELECT s FROM Souscentre s WHERE s.nomsouscent LIKE :param").setParameter("param","%"+nom+"%").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Souscentre> findSouscentresD1Departement(String nomDepartement) {
        try{
            return em.createQuery("SELECT s FROM Souscentre s JOIN s.etablissement.arrondissement.departement d WHERE d.nomdepart=:param ORDER BY s.nomsouscent ASC").setParameter("param",nomDepartement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,8);
            }
    }

    @Override
    public List<Souscentre> findSouscentresD1Arrondissement(String nomArrondissement) {
        try{
            return em.createQuery("SELECT s FROM Souscentre s JOIN s.etablissement.arrondissement a WHERE a.nomarr=:param ORDER BY s.nomsouscent ASC").setParameter("param",nomArrondissement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,9);
            }
    }

    @Override
    public Souscentre findSouscentreByName(String nom) {
        try{
            return (Souscentre) em.createQuery("SELECT s FROM Souscentre s WHERE s.nomsouscent=:param").setParameter("param",nom).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,10);
            }
    }

    @Override
    public Souscentre findSouscentreByEtablissement(String abreviation) {
        try{
            return (Souscentre) em.createQuery("SELECT s FROM Souscentre s WHERE s.etablissement.abreviation=:param").setParameter("param",abreviation).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,11);
            }
    }

    @Override
    public List<Souscentre> findSouscentresNoso() {
        try{
            return em.createQuery("SELECT s FROM Souscentre s WHERE s.etablissement.type='Général' and (s.etablissement.arrondissement.departement.region.nomreg='NORD-OUEST' or s.etablissement.arrondissement.departement.region.nomreg='SUD-OUEST')").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,12);
            }
    }

    @Override
    public List<Souscentre> findSouscentresArisquesExtNord() {
        try{
            return em.createQuery("SELECT s FROM Souscentre s WHERE s.etablissement.type='Général' and (s.nomsouscent like '%KOZA%' or s.nomsouscent like '%MAKARI%' or s.nomsouscent like '%BLANGOUA%' or s.nomsouscent like '%OUZAL%' or s.nomsouscent like '%MORA%')").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,13);
            }
    }    

    @Override
    public List<Souscentre> findSouscentresEnclaves() {
        try{
            return em.createQuery("SELECT s FROM Souscentre s WHERE s.nomsouscent like '%BANYO%' or s.nomsouscent like '%TCHOLLIRE%' or s.nomsouscent like '%TOUBORO%' or s.nomsouscent like '%YOKO%' or s.nomsouscent like '%NTUI%' or s.nomsouscent like '%YOKADOUMA%' or s.nomsouscent like '%MOLOUNDOU%' or s.nomsouscent like '%KOUSSERI%' or s.nomsouscent like '%YABASSI%' or s.nomsouscent like '%BANKIM%' or s.nomsouscent like '%NDOM%' or s.nomsouscent like '%NGAMBE%' or s.nomsouscent like '%YINGUI%' or s.nomsouscent like '%BATOURI%' or s.nomsouscent like '%POLI%' or s.nomsouscent like '%MAMFE%' or s.nomsouscent like '%TIGNÈRE%' or s.nomsouscent like '%LOMIE%'").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,14);
            }
    }

    @Override
    public List<Souscentre> findSouscentresPrivesD1Arrondissement(String nomArrondissement) {
        try{
            return em.createQuery("SELECT s FROM Souscentre s JOIN s.etablissement.arrondissement a WHERE s.etablissement.secteur like 'Privé%' and a.nomarr=:param ORDER BY s.nomsouscent ASC").setParameter("param",nomArrondissement).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,15);
            }
    }
}
