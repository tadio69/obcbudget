
package couche_dao;


import couche_jpa.Deplacecorrect;
import java.util.List;


public interface IDeplacecorrect {
    //créer une nouvelle Deplacecorrect
    public Deplacecorrect create(Deplacecorrect deplacecorrect);
    // modifier une Deplacecorrect existante
    public Deplacecorrect edit(Deplacecorrect deplacecorrect);
    // supprimer une Deplacecorrect existante
    public void destroy(Deplacecorrect deplacecorrect);
    // chercher une Deplacecorrect particulière
    public Deplacecorrect find(int id);
    // obtenir tous les objets Deplacecorrect
    public List<Deplacecorrect> findAll();

    public List<Deplacecorrect> findDeplacecorrectsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    public List<Deplacecorrect> findDeplacecorrectsProfessionnelsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    public List<Deplacecorrect> findDeplacecorrectsNonProfessionnelsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
