
package couche_dao;

import couche_jpa.Groupe;
import java.util.List;


public interface IGroupe {
    //créer un nouveau groupe
    public Groupe create(Groupe groupe);
    // modifier un groupe existant
    public Groupe edit(Groupe groupe);
    // supprimer un groupe existant
    public void destroy(Groupe groupe);
    // chercher une groupe particulier
    public Groupe find(int id);
    // obtenir tous les objets groupe
    public List<Groupe> findAll();

    public Groupe findGroupeD1NiveauEtD1Type(String niveau, String type);
}
