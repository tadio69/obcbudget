
package couche_dao;

import couche_jpa.Jurypratique2;
import java.util.List;


public interface IJurypratique2 {
    //créer un nouveau Jurypratique2
    public Jurypratique2 create(Jurypratique2 jurypratique2);
    // modifier un Jurypratique2 existant
    public Jurypratique2 edit(Jurypratique2 jurypratique2);
    // supprimer un Jurypratique2 existant
    public void destroy(Jurypratique2 jurypratique2);
    // chercher un Jurypratique2 particulier
    public Jurypratique2 find(int id);
    // obtenir tous les objets Jurypratique2
    public List<Jurypratique2> findAll();

    public Jurypratique2 findJurypratique2D1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected);

    public List<Jurypratique2> findJuryspratique2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
