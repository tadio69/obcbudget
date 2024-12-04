
package couche_dao;

import couche_jpa.Stataptes;
import exception.ObcbudgetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class StataptesDao implements IStataptes{
    @PersistenceContext
    private EntityManager em;
    
    // constructeur
    public StataptesDao(){ 
    }

    @Override
    public Stataptes create(Stataptes stataptes) {
        try{
            em.persist(stataptes);
            return stataptes;
            }catch (Throwable th){
                throw new ObcbudgetException(th,1);
            }
    }

    @Override
    public Stataptes edit(Stataptes stataptes) {
        try{
            em.merge(stataptes);
            return stataptes;
            }catch (Throwable th){
                throw new ObcbudgetException(th,2);
            }
    }

    @Override
    public void destroy(Stataptes stataptes) {
        try{
            em.remove(em.merge(stataptes));//on le rattache au contexte de persistance d'abord avec em.merge(stataptes)
            }catch (Throwable th){
                throw new ObcbudgetException(th,3);
            }
    }

    @Override
    public Stataptes find(int id) {
        try{
            return em.find(Stataptes.class, id);
            }catch (Throwable th){
                throw new ObcbudgetException(th,4);
            }
    }

    @Override
    public List<Stataptes> findAll() {
        try{
            return em.createQuery("select s from Stataptes s").getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,5);
            }
    }

    @Override
    public Stataptes findStataptesD1EtablissementA1ExamenDans1Session(int annee, String nomEtablissement, String sigleExamen) {
        try{
            return (Stataptes) em.createQuery("select stat from Stataptes stat join stat.examen ex join stat.session ses join stat.etablissement etab where ses.annee=:param1 and etab.abreviation=:param2 and ex.sigle=:param3").setParameter("param1", annee).setParameter("param2", nomEtablissement).setParameter("param3", sigleExamen).getSingleResult();
            }catch (Throwable th){
                throw new ObcbudgetException(th,6);
            }
    }

    @Override
    public List<Stataptes> findAllStataptesD1ExamenDans1Session(int annee, String sigleExamen) {
        try{
            return em.createQuery("select stat from Stataptes stat join stat.examen ex join stat.session ses where ses.annee=:param1 and ex.sigle=:param2 order by stat.etablissement.arrondissement.departement.region.nomreg asc,stat.etablissement.arrondissement.departement.nomdepart asc,stat.etablissement.arrondissement.nomarr asc,stat.etablissement.abreviation asc").setParameter("param1", annee).setParameter("param2", sigleExamen).getResultList();
            }catch (Throwable th){
                throw new ObcbudgetException(th,7);
            }
    }   
}
