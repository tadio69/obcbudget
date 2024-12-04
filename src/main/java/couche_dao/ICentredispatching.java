
package couche_dao;

import couche_jpa.Centredispatching;
import java.util.List;

/**
 *
 * @author famille chijou
 */
public interface ICentredispatching {
    //créer un nouveau centre de dispatching
    public Centredispatching create(Centredispatching centredispatching);
    // modifier un centre de dispatching existant
    public Centredispatching edit(Centredispatching centredispatching);
    // supprimer un centre de dispatching existant
    public void destroy(Centredispatching centredispatching);
    // chercher un centre de dispatching particulier
    public Centredispatching find(int id);
    public List<Centredispatching> findCentresdispatchingD1Arrondissement(String nomArrondissementSelected);

    public Centredispatching findCentredispatchingLikeName(String nomCentre);

    public List<Centredispatching> findCentresdispatchingD1Region(String nomRegionSelected);

    public List<Centredispatching> findCentresdispatchingD1Departement(String nomDepartementSelected);

    public List<Centredispatching> findCentredispatchingD1Type(String type);

    public List<Centredispatching> findCentresdispatchingD1TypeD1Region(String type, String nomRegion);

    public List<Centredispatching> findCentresdispatchingD1TypeD1Departement(String type, String nomDepartement);

    public List<Centredispatching> findAll();

    public Centredispatching findCentredispatchingD1TypeByEtablissement(String etab, String type);

    public List<Centredispatching> findCentresVentilationEtspecialeD1Region(String nomRegionVentilationSelected);

    public List<Centredispatching> findCentresVentilationEtspeciale();
}
