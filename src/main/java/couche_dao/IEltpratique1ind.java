
package couche_dao;

import couche_jpa.Eltpratique1ind;
import java.util.List;


public interface IEltpratique1ind {
    //créer un nouvel Eltpratique1ind
    public Eltpratique1ind create(Eltpratique1ind caisse);
    // modifier un Eltpratique1ind existant
    public Eltpratique1ind edit(Eltpratique1ind caisse);
    // supprimer un Eltpratique1ind existant
    public void destroy(Eltpratique1ind caisse);
    // chercher un Eltpratique1ind particulier
    public Eltpratique1ind find(int id);
    // obtenir tous les objets Eltpratique1ind
    public List<Eltpratique1ind> findAll();

    public List<Eltpratique1ind> findAllEltpratique1indD1Session(int anneeSelected);

    public Eltpratique1ind findEltpratique1indD1SouscentreD1OptionD1Session(String nomSouscentreSelected, String sigleOptionSelected, int anneeSelected);

    public List<Eltpratique1ind> findAllEltpratique1indD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected);
}
