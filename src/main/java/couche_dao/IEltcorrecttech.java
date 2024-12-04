
package couche_dao;

import couche_jpa.Eltcorrecttech;
import java.util.List;


public interface IEltcorrecttech {
    //créer un nouveau Eltcorrecttech
    public Eltcorrecttech create(Eltcorrecttech eltcorrecttech);
    // modifier un Eltcorrecttech existant
    public Eltcorrecttech edit(Eltcorrecttech eltcorrecttech);
    // supprimer un Eltcorrecttech existant
    public void destroy(Eltcorrecttech eltcorrecttech);
    // chercher un Eltcorrecttech particulier
    public Eltcorrecttech find(int id);
    // obtenir tous les objets Eltcorrecttech
    public List<Eltcorrecttech> findAll();

    public Eltcorrecttech findEltcorrecttechD1NatureD1SousfamilleD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected, String natureSelected);

    public List<Eltcorrecttech> findEltcorrecttechsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
