
package couche_dao;

import couche_jpa.Rattachregroupement;
import java.util.List;


public interface IRattachregroupement {
    //créer un nouveau Rattachregroupement
    public Rattachregroupement create(Rattachregroupement rattachregroupement);
    // modifier un Rattachregroupement existant
    public Rattachregroupement edit(Rattachregroupement rattachregroupement);
    // supprimer un Rattachregroupement existant
    public void destroy(Rattachregroupement rattachregroupement);
    // chercher un Rattachregroupement particulier
    public Rattachregroupement find(int id);
    // obtenir tous les objets Rattachregroupement
    public List<Rattachregroupement> findAll();

    //public List<Rattachregroupement> findRattachregroupementsD1Centreventilation(String nomCentreVentilation);

    public Rattachregroupement findRattachregroupementD1Centreregroupement(String centreregroup);//impossible de l'avoir d'un autre type

    public List<Rattachregroupement> findRattachregroupementsD1CentredispatchingD1Type(String nomExacte, String typeExate);

    public List<Rattachregroupement> findRattachregroupementsD1Centredispatching(String nom);
}
