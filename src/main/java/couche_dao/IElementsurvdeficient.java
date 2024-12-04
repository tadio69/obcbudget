
package couche_dao;

import couche_jpa.Elementsurvdeficient;
import java.util.List;


public interface IElementsurvdeficient {
    //créer un nouveau Elementsurvdeficient
    public Elementsurvdeficient create(Elementsurvdeficient elementsurvdeficient);
    // modifier un Elementsurvdeficient existant
    public Elementsurvdeficient edit(Elementsurvdeficient elementsurvdeficient);
    // supprimer un Elementsurvdeficient existant
    public void destroy(Elementsurvdeficient elementsurvdeficient);
    // chercher un Elementsurvdeficient particulier
    public Elementsurvdeficient find(int id);
    // obtenir tous les objets Elementsurvdeficient
    public List<Elementsurvdeficient> findAll();
    public List<Elementsurvdeficient> findElementsurvdeficientsD1groupedexamenA1Session(int annee, String niveau, String type);
}
