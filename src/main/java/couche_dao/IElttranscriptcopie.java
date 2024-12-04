
package couche_dao;

import couche_jpa.Elttranscriptcopie;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IElttranscriptcopie {
    //créer un nouveau Elttranscriptcopie
    public Elttranscriptcopie create(Elttranscriptcopie elttranscriptcopie);
    // modifier un Elttranscriptcopie existant
    public Elttranscriptcopie edit(Elttranscriptcopie elttranscriptcopie);
    // supprimer un Elttranscriptcopie existant
    public void destroy(Elttranscriptcopie elttranscriptcopie);
    // chercher un Elttranscriptcopie particulier
    public Elttranscriptcopie find(int id);
    // obtenir tous les objets Elttranscriptcopie
    public List<Elttranscriptcopie> findAll();

    public List<Elttranscriptcopie> findAllElttranscriptcopieD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
