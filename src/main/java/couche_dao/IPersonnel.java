
package couche_dao;

import couche_jpa.Personnel;
import java.util.List;


public interface IPersonnel {
    //créer un nouveau personnel
    public Personnel create(Personnel personnel);
    // modifier un personnel existant
    public Personnel edit(Personnel personnel);
    // supprimer un personnel existant
    public void destroy(Personnel personnel);
    // chercher un personnel particulier
    public Personnel find(int id);
    // obtenir tous les objets Personnel
    public List<Personnel> findAll();
    // obtenir tous les objets Personnel de nom like nom
    public List<Personnel> findAllLikeName(String nom);

    public List<Personnel> findPersonnelsD1Departement(String nomDepartement);

    public List<Personnel> findPersonnelsD1Arrondissement(String nomArrondissement);

    public Personnel findByMatricule(String matricule);
}
