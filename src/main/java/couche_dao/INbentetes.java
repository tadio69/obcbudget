
package couche_dao;

import couche_jpa.Nbentetes;
import java.util.List;


public interface INbentetes {
    //créer un nouvel Nbentetes
    public Nbentetes create(Nbentetes nbentetes);
    // modifier un Nbentetes existant
    public Nbentetes edit(Nbentetes nbentetes);
    // supprimer un Nbentetes existant
    public void destroy(Nbentetes nbentetes);
    // chercher un Nbentetes particulier
    public Nbentetes find(int id);
    // obtenir tous les objets Nbentetes
    public List<Nbentetes> findAll();

    public List<Nbentetes> findAllNbentetesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    public Nbentetes findNbentetesD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected);
}
