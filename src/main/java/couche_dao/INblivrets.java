
package couche_dao;

import couche_jpa.Nblivrets;
import java.util.List;


public interface INblivrets {
    //créer un nouvel Nblivrets
    public Nblivrets create(Nblivrets nbliv);
    // modifier un Nblivrets existant
    public Nblivrets edit(Nblivrets nbliv);
    // supprimer un Nblivrets existant
    public void destroy(Nblivrets nbliv);
    // chercher un Nblivrets particulier
    public Nblivrets find(int id);
    // obtenir tous les objets Nblivrets
    public List<Nblivrets> findAll();

    public Nblivrets findNblivretsD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Nblivrets> findAllNblivretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
