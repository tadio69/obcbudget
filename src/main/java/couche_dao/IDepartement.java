
package couche_dao;

import couche_jpa.Departement;
import java.util.List;


public interface IDepartement {
    //créer un nouveau département
    public Departement create(Departement departement);
    // modifier un département existant
    public Departement edit(Departement departement);
    // supprimer un département existant
    public void destroy(Departement departement);
    // chercher un département particulier
    public Departement find(int id);
    // obtenir tous les objets Departement
    public List<Departement> findAll();
    // obtenir tous les objets Departement de nom like nom
    public List<Departement> findAllLikeName(String nom);
    // obtenir tous les Departements d'une région donnée par son nom
    public List<Departement> findDepartementsD1Region(String nom);
}
