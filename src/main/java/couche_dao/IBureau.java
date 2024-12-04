
package couche_dao;

import couche_jpa.Bureau;
import java.util.List;

/**
 *
 * @author famille chijou
 */
public interface IBureau {
    //créer un nouveau bureau
    public Bureau create(Bureau bureau);
    // modifier un bureau existant
    public Bureau edit(Bureau bureau);
    // supprimer un bureau existant
    public void destroy(Bureau bureau);
    // chercher un bureau particulier
    public Bureau find(int id);

    public Bureau findBureauD1CentrebilletageDans1Session(String nomCentrebilletage, int annee);

    public List<Bureau> findBureauxD1Session(int anneeSelected);

    public List<Bureau> findBureauxD1ArrondissementDans1Session(String nomArrondissement,int annee);

    public List<Bureau> findBureauxD1DepartementDans1Session(String nomDepartement, int annee);

    public List<Bureau> findBureauxD1RegionDans1Session(String nomRegion, int annee);
}
