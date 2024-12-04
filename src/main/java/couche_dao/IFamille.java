
package couche_dao;

import couche_jpa.Famille;
import java.util.List;


public interface IFamille {
    //créer une nouvelle famille
    public Famille create(Famille famille);
    // modifier une famille existante
    public Famille edit(Famille famille);
    // supprimer une famille existante
    public void destroy(Famille famille);
    // chercher une famille particulière
    public Famille find(int id);
    // obtenir tous les objets famille
    public List<Famille> findAll();

    public List<Famille> findFamillesLikeTitre(String titre);

    public Famille findFamilleByTitre(String titre);
}
