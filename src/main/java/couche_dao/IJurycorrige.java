
package couche_dao;


import couche_jpa.Jurycorrige;
import java.util.List;


public interface IJurycorrige {
    //créer un nouveau Jurycorrige
    public Jurycorrige create(Jurycorrige jurycorrige);
    // modifier un Jurycorrige existant
    public Jurycorrige edit(Jurycorrige jurycorrige);
    // supprimer un Jurycorrige existant
    public void destroy(Jurycorrige jurycorrige);
    // chercher une Jurycorrige particulier
    public Jurycorrige find(int id);
    // obtenir tous les objets Jurycorrige
    public List<Jurycorrige> findAll();

    public Jurycorrige findJurycorrigeD1SousfamilleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);

    public List<Jurycorrige> findJurycorrigesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
