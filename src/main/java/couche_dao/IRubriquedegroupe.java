
package couche_dao;

import couche_jpa.Rubriquedegroupe;
import java.util.List;


public interface IRubriquedegroupe {
    //créer une nouvelle Rubriquedegroupe
    public Rubriquedegroupe create(Rubriquedegroupe rubriquedegroupe);
    // modifier une Rubriquedegroupe existante
    public Rubriquedegroupe edit(Rubriquedegroupe rubriquedegroupe);
    // supprimer une Rubriquedegroupe existante
    public void destroy(Rubriquedegroupe rubriquedegroupe);
    // chercher une Rubriquedegroupe particulière
    public Rubriquedegroupe find(int id);
    // obtenir tous les objets Rubriquedegroupe
    public List<Rubriquedegroupe> findAll();
}
