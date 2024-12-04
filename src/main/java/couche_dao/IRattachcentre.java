
package couche_dao;

import couche_jpa.Rattachcentre;
import couche_jpa.Rattachscentre;
import java.util.List;


public interface IRattachcentre {
    //créer un nouveau Rattachcentre
    public Rattachcentre create(Rattachcentre rattachcentre);
    // modifier un Rattachcentre existant
    public Rattachcentre edit(Rattachcentre rattachcentre);
    // supprimer un Rattachcentre existant
    public void destroy(Rattachcentre rattachcentre);
    // chercher un Rattachcentre particulier
    public Rattachcentre find(int id);
    // obtenir tous les objets Rattachcentre
    public List<Rattachcentre> findAll();
    public List<Rattachcentre> findRattachcentresD1Grandcentre(String nomGrandcentre);

    public Rattachcentre findRattachcentreD1Centre(String nomCentreDeliberation);
}
