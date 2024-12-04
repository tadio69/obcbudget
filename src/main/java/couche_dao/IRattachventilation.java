
package couche_dao;


import couche_jpa.Rattachventilation;
import java.util.List;


public interface IRattachventilation {
    //créer un nouveau Rattachventilation
    public Rattachventilation create(Rattachventilation rattachventilation);
    // modifier un Rattachventilation existant
    public Rattachventilation edit(Rattachventilation rattachventilation);
    // supprimer un Rattachventilation existant
    public void destroy(Rattachventilation rattachventilation);
    // chercher une Rattachventilation particulier
    public Rattachventilation find(int id);
    // obtenir tous les objets Rattachventilation
    public List<Rattachventilation> findAll();

    public Rattachventilation findRattachventilationD1Centreventilation(String nomCentreventil);

    public List<Rattachventilation> findRattachventilationsD1CentreventilationSpecial(String nomExacte);
}
