
package couche_dao;

import couche_jpa.Nbcartons;
import java.util.List;


public interface INbcartons {
    //créer un nouveau Nbcartons
    public Nbcartons create(Nbcartons nbcartons);
    // modifier un Nbcartons existant
    public Nbcartons edit(Nbcartons nbcartons);
    // supprimer un Nbcartons existant
    public void destroy(Nbcartons nbcartons);
    // chercher un Nbcartons particulier
    public Nbcartons find(int id);
    // obtenir tous les objets Nbcartons
    public List<Nbcartons> findAll();

    public Nbcartons findNbcartonsD1SouscentreD1GroupedexamensDans1SessionD1Numprat(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, int numprat);

    public List<Nbcartons> findAllNbcartonsD1GroupedexamensDans1SessionD1Numprat(int anneeSelected, String niveauSelected, String typeSelected, int numprat);
}
