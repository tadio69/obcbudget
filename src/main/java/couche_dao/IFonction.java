
package couche_dao;

import couche_jpa.Fonction;
import java.util.List;


public interface IFonction {
    //créer une nouvelle fonction
    public Fonction create(Fonction fonction);
    // modifier une fonction existante
    public Fonction edit(Fonction fonction);
    // supprimer une fonction existante
    public void destroy(Fonction fonction);
    // chercher une fonction particulière
    public Fonction find(int id);
    // obtenir tous les objets Fonction
    public List<Fonction> findAll();
    public List<Fonction> findFonctionsLikeTitre(String titre);

    public Fonction findFonctionByTitre(String titrefonct);
}
