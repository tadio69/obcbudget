
package couche_dao;

import couche_jpa.Matiere;
import java.util.List;


public interface IMatiere {
    //créer un nouveau Matiere
    public Matiere create(Matiere matiere);
    // modifier un Matiere existant
    public Matiere edit(Matiere matiere);
    // supprimer un Matiere existant
    public void destroy(Matiere matiere);
    // chercher un Matiere particulier
    public Matiere find(int id);
    // obtenir tous les objets Matiere
    public List<Matiere> findAll();

    public List<Matiere> findMatieresLikeNom(String nom);

    public List<Matiere> findMatieresD1Famille(String titreFamilleSelected);

    public Matiere findMatiereByName(String nomMat);
}
