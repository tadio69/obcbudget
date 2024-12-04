
package couche_dao;

import couche_jpa.Nbnotesprat2;
import java.util.List;


public interface INbnotesprat2 {
    //créer un nouvel Nbnotesprat2
    public Nbnotesprat2 create(Nbnotesprat2 nbnotesprat2);
    // modifier un Nbnotesprat2 existant
    public Nbnotesprat2 edit(Nbnotesprat2 nbnotesprat2);
    // supprimer un Nbnotesprat2 existant
    public void destroy(Nbnotesprat2 nbnotesprat2);
    // chercher un Nbnotesprat2 particulier
    public Nbnotesprat2 find(int id);
    // obtenir tous les objets Nbnotesprat2
    public List<Nbnotesprat2> findAll();

    public List<Nbnotesprat2> findAllNbnotesprat2D1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    public Nbnotesprat2 findNbnotesprat2D1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected);
}
