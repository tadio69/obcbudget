
package couche_dao;

import couche_jpa.Elttranscriptepreuve;
import java.util.List;


public interface IElttranscriptepreuve {
    //créer un nouvel Elttranscriptepreuve
    public Elttranscriptepreuve create(Elttranscriptepreuve elttranscriptepreuve);
    // modifier un Elttranscriptepreuve existant
    public Elttranscriptepreuve edit(Elttranscriptepreuve elttranscriptepreuve);
    // supprimer un Elttranscriptepreuve existant
    public void destroy(Elttranscriptepreuve elttranscriptepreuve);
    // chercher un Elttranscriptepreuve particulier
    public Elttranscriptepreuve find(int id);
    // obtenir tous les objets Arrondissement
    public List<Elttranscriptepreuve> findAll();

    public List<Elttranscriptepreuve> findAllElttranscriptepreuveD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
