
package couche_dao;

import couche_jpa.Mopratiquesti;
import java.util.List;


public interface IMopratiquesti {
    //créer un nouvel Mopratiquesti
    public Mopratiquesti create(Mopratiquesti mopratique1esti);
    // modifier un Mopratiquesti existant
    public Mopratiquesti edit(Mopratiquesti mopratique1esti);
    // supprimer un Mopratiquesti existant
    public void destroy(Mopratiquesti mopratique1esti);
    // chercher un Mopratiquesti particulier
    public Mopratiquesti find(int id);
    // obtenir tous les objets Mopratiquesti
    public List<Mopratiquesti> findAll();

    public List<Mopratiquesti> findMopratiquestisD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected,int numprat);

    public Mopratiquesti findMopratiquestiD1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected,int numprat);
}
