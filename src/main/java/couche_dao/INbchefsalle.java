
package couche_dao;

import couche_jpa.Nbchefsalle;
import java.util.List;


public interface INbchefsalle {
    //créer un nouvel Nbchefsalle
    public Nbchefsalle create(Nbchefsalle nbchefsalle);
    // modifier un Nbchefsalle existant
    public Nbchefsalle edit(Nbchefsalle nbchefsalle);
    // supprimer un Nbchefsalle existant
    public void destroy(Nbchefsalle nbchefsalle);
    // chercher un Nbchefsalle particulier
    public Nbchefsalle find(int id);
    // obtenir tous les objets Nbchefsalle
    public List<Nbchefsalle> findAll();

    public Nbchefsalle findNbchefsalleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Nbchefsalle> findNbchefsallesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
