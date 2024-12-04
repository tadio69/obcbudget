
package couche_dao;

import couche_jpa.Rattachetab;
import java.util.List;


public interface IRattachetab {
    //créer un nouveau Rattachetab
    public Rattachetab create(Rattachetab rattachetab);
    // modifier un Rattachetab existant
    public Rattachetab edit(Rattachetab rattachetab);
    // supprimer un Rattachetab existant
    public void destroy(Rattachetab rattachetab);
    // chercher un Rattachetab particulier
    public Rattachetab find(int id);
    // obtenir tous les objets Rattachetab
    public List<Rattachetab> findAll();
    public Rattachetab findRattachetabD1Etablissement(String nomEtablissement);
    public List<Rattachetab> findRattachetabD1Souscentre(String nomSouscentre);
}
