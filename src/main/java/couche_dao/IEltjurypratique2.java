
package couche_dao;

import couche_jpa.Eltjurypratique2;
import java.util.List;


public interface IEltjurypratique2 {
    //créer un nouveau Eltjurypratique2
    public Eltjurypratique2 create(Eltjurypratique2 eltjurypratique2);
    // modifier un Eltjurypratique2 existant
    public Eltjurypratique2 edit(Eltjurypratique2 eltjurypratique2);
    // supprimer un Eltjurypratique2 existant
    public void destroy(Eltjurypratique2 eltjurypratique2);
    // chercher un Eltjurypratique2 particulier
    public Eltjurypratique2 find(int id);
    // obtenir tous les objets Eltjurypratique2
    public List<Eltjurypratique2> findAll();

    public Eltjurypratique2 findEltjurypratique2D1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Eltjurypratique2> findEltjurypratique2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
