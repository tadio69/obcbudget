
package couche_dao;

import couche_jpa.Centre;
import java.util.List;


public interface ICentre {
    //créer un nouveau centre
    public Centre create(Centre centre);
    // modifier un centre existant
    public Centre edit(Centre centre);
    // supprimer un centre existant
    public void destroy(Centre centre);
    // chercher un centre particulier
    public Centre find(int id);
    // obtenir tous les objets Centre
    public List<Centre> findAll();
    // obtenir tous les objets Centre de nom like nom
    public List<Centre> findAllLikeName(String nom);
    public List<Centre> findCentresD1Departement(String nomDepartement);

    public List<Centre> findCentresD1Arrondissement(String nomArrondissement);

    public List<Centre> findCentresD1Region(String nomRegionSelected);

    public Centre findCentreByNom(String centreDeliberation);

    public Centre findCentreByEtablissement(String abreviation);
}
