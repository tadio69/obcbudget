
package couche_dao;


import couche_jpa.Mopratiquee;
import java.util.List;


public interface IMopratiquee {
    //créer un nouveau Mopratiquee
    public Mopratiquee create(Mopratiquee mopratiquee);
    // modifier un Mopratiquee existant
    public Mopratiquee edit(Mopratiquee mopratiquee);
    // supprimer un Mopratiquee existant
    public void destroy(Mopratiquee mopratiquee);
    // chercher une Mopratiquee particulier
    public Mopratiquee find(int id);
    // obtenir tous les objets Mopratiquee
    public List<Mopratiquee> findAll();

    public Mopratiquee findMopratiqueeD1SouscentreD1SouscentrepratD1GroupedexamensD1Session(String nomSouscentreSelected, String nomSouscentrepratSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Mopratiquee> findAllMopratiqueeD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
