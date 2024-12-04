
package couche_dao;


import couche_jpa.Categorie;
import java.util.List;


public interface ICategorie {
    //créer une nouvelle catégorie
    public Categorie create(Categorie categorie);
    // modifier une catégorie existante
    public Categorie edit(Categorie categorie);
    // supprimer une catégorie existante
    public void destroy(Categorie categorie);
    // chercher une catégorie particulière
    public Categorie find(int id);
    // obtenir tous les objets Categorie
    public List<Categorie> findAll();
    // obtenir tous les objets Categorie de titre proche de nom
    public List<Categorie> findAllLikeTitre(String titre);
}
