
package couche_dao;

import couche_jpa.Rattachventilationspeciale;
import java.util.List;


public interface IRattachventilationspeciale {
    //créer un nouveau Rattachventilationspeciale
    public Rattachventilationspeciale create(Rattachventilationspeciale rattachventilationspeciale);
    // modifier un Rattachventilationspeciale existant
    public Rattachventilationspeciale edit(Rattachventilationspeciale rattachventilationspeciale);
    // supprimer un Rattachventilationspeciale existant
    public void destroy(Rattachventilationspeciale rattachventilationspeciale);
    // chercher un Rattachventilationspeciale particulier
    public Rattachventilationspeciale find(int id);
    // obtenir tous les objets Rattachventilationspeciale
    public List<Rattachventilationspeciale> findAll();

    public Rattachventilationspeciale findRattachventilationspecialeD1Centreventilationspeciale(String abreviation);

    public List<Rattachventilationspeciale> findAllRattachventilationspeciauxD1CentreTri(String abreviation);
}
