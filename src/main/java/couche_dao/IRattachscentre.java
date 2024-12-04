
package couche_dao;

import couche_jpa.Rattachscentre;
import java.util.List;


public interface IRattachscentre {
    //créer un nouveau Rattachscentre
    public Rattachscentre create(Rattachscentre rattachscentre);
    // modifier un Rattachscentre existant
    public Rattachscentre edit(Rattachscentre rattachscentre);
    // supprimer un Rattachscentre existant
    public void destroy(Rattachscentre rattachscentre);
    // chercher un Rattachscentre particulier
    public Rattachscentre find(int id);
    // obtenir tous les objets Rattachscentre
    public List<Rattachscentre> findAll();

    public List<Rattachscentre> findRattachscentresD1Centre(String nomCentre);

    public Rattachscentre findRattachscentreD1Souscentre(String nomSouscentre);
}
