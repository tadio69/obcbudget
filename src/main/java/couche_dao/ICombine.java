
package couche_dao;

import couche_jpa.Combine;
import java.util.List;


public interface ICombine {
    //créer un nouveau Combine
    public Combine create(Combine combine);
    // modifier un Combine existant
    public Combine edit(Combine combine);
    // supprimer un Combine existant
    public void destroy(Combine combine);
    // chercher un Combine particulier
    public Combine find(int id);
    // obtenir tous les objets Combine
    public List<Combine> findAll();

    public List<Combine> findCombinesD1EpreuveD1GroupedexamensDans1SessionD1Numprat(String titreEpreuveSelected, int anneeSelected, String niveauSelected, String typeSelected, int numprat);
}
