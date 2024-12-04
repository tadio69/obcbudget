
package couche_dao;

import couche_jpa.Region;
import java.util.List;


public interface IRegion {
    //créer une nouvelle région
    public Region create(Region region);
    // modifier une région existante
    public Region edit(Region region);
    // supprimer une région existante
    public void destroy(Region region);
    // chercher une région particulière
    public Region find(int id);
    // obtenir tous les objets Region
    public List<Region> findAll();
    // obtenir tous les objets Region de nom proche de nom
    public List<Region> findAllLikeName(String nom);
}
