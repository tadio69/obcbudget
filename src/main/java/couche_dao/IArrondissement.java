
package couche_dao;

import couche_jpa.Arrondissement;
import java.util.List;


public interface IArrondissement {
    //créer un nouvel arrondissement
    public Arrondissement create(Arrondissement arrondissement);
    // modifier un arrondissement existant
    public Arrondissement edit(Arrondissement arrondissement);
    // supprimer un arrondissement existant
    public void destroy(Arrondissement arrondissement);
    // chercher un arrondissement particulier
    public Arrondissement find(int id);
    // obtenir tous les objets Arrondissement
    public List<Arrondissement> findAll();
    // obtenir tous les objets Arrondissement de nom like nom
    public List<Arrondissement> findAllLikeName(String nom);
    // obtenir tous les Arrondissement d'un Departement donné par son nom
    public List<Arrondissement> findArrondissementsD1Departement(String nom);
    public List<Arrondissement> findArrondissementsD1Region(String nomRegion);
    public Arrondissement findArrondissementByName(String arrondt);
}
