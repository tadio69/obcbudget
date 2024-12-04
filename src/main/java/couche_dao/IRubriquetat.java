
package couche_dao;

import couche_jpa.Rubriquetat;
import java.util.List;


public interface IRubriquetat {
    //créer un nouveau rubriquetat
    public Rubriquetat create(Rubriquetat rubriquetat);
    // modifier un rubriquetat existant
    public Rubriquetat edit(Rubriquetat rubriquetat);
    // supprimer un rubriquetat existant
    public void destroy(Rubriquetat rubriquetat);
    // chercher un rubriquetat particulier
    public Rubriquetat find(int id);
    // obtenir tous les objets Rubriquetat
    public List<Rubriquetat> findAll();
    // obtenir tous les objets Rubriquetat de désignation like designation
    public List<Rubriquetat> findAllLikeName(String designation);

    public List<Rubriquetat> findRubriquetatsD1Categorie(String titreCategorie);

    public Rubriquetat findRubriquetatByDesignation(String designation);
}
