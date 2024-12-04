
package couche_dao;

import couche_jpa.Grandcentre;
import java.util.List;


public interface IGrandcentre {
    //créer un nouveau Grandcentre
    public Grandcentre create(Grandcentre grandcentre);
    // modifier un Grandcentre existant
    public Grandcentre edit(Grandcentre grandcentre);
    // supprimer un Grandcentre existant
    public void destroy(Grandcentre grandcentre);
    // chercher un Grandcentre particulier
    public Grandcentre find(int id);
    // obtenir tous les objets Grandcentre
    public List<Grandcentre> findAll();
    public List<Grandcentre> findGrandcentresD1Region(String nomRegion);
    public List<Grandcentre> findGrandcentresLikeName(String nom);

    public List<Grandcentre> findGrandcentresD1RegionD1NiveauEtD1Type(String nomreg, String nomniv, String nomtyp);
}
