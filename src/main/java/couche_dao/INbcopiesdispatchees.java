
package couche_dao;

import couche_jpa.Nbcopiesdispatchees;
import java.util.List;


public interface INbcopiesdispatchees {
    //créer un nouveau Nbcopiesdispatchees
    public Nbcopiesdispatchees create(Nbcopiesdispatchees nbcopiesdispatchees);
    // modifier un Nbcopiesdispatchees existant
    public Nbcopiesdispatchees edit(Nbcopiesdispatchees nbcopiesdispatchees);
    // supprimer un Nbcopiesdispatchees existant
    public void destroy(Nbcopiesdispatchees nbcopiesdispatchees);
    // chercher un Nbcopiesdispatchees particulier
    public Nbcopiesdispatchees find(int id);
    // obtenir tous les objets Nbcopiesdispatchees
    public List<Nbcopiesdispatchees> findAll();

    public Nbcopiesdispatchees findNbcopiesdispatcheesD1CentreregroupementD1GroupedexamensD1Session(String nomCentreregroupementSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Nbcopiesdispatchees> findNbcopiesdispatcheesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
