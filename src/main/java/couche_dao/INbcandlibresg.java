
package couche_dao;

import couche_jpa.Nbcandlibresg;
import java.util.List;


public interface INbcandlibresg {
    //créer un nouveau Nbcandlibresg
    public Nbcandlibresg create(Nbcandlibresg nbcand);
    // modifier un Nbcandlibresg existant
    public Nbcandlibresg edit(Nbcandlibresg nbcand);
    // supprimer un Nbcandlibresg existant
    public void destroy(Nbcandlibresg nbcand);
    // chercher une Nbcandlibresg particulier
    public Nbcandlibresg find(int id);
    // obtenir tous les objets Nbcandlibresg
    public List<Nbcandlibresg> findAll();

    public List<Nbcandlibresg> findAllNbcandlibresgD1Session(int anneeSelected);

    public Nbcandlibresg findNbcandlibresgD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected);
}
