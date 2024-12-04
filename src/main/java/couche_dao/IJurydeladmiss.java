
package couche_dao;

import couche_jpa.Jurydeladmiss;
import java.util.List;


public interface IJurydeladmiss {
    //créer un nouveau Jurydeladmiss
    public Jurydeladmiss create(Jurydeladmiss jurydeladmiss);
    // modifier un Jurydeladmiss existant
    public Jurydeladmiss edit(Jurydeladmiss jurydeladmiss);
    // supprimer un Jurydeladmiss existant
    public void destroy(Jurydeladmiss jurydeladmiss);
    // chercher un Jurydeladmiss particulier
    public Jurydeladmiss find(int id);
    // obtenir tous les objets Jurydeladmiss
    public List<Jurydeladmiss> findAll();

    public List<Jurydeladmiss> findJurydeladmissD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    public Jurydeladmiss findJurydeladmissD1SousfamilleD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);
}
