
package couche_dao;

import couche_jpa.Jurydel;
import java.util.List;


public interface IJurydel {
    //créer un nouveau Jurydel
    public Jurydel create(Jurydel jurydel);
    // modifier un Jurydel existant
    public Jurydel edit(Jurydel jurydel);
    // supprimer un Jurydel existant
    public void destroy(Jurydel jurydel);
    // chercher un Jurydel particulier
    public Jurydel find(int id);
    // obtenir tous les objets Jurydel
    public List<Jurydel> findAll();

    public Jurydel findJurydelD1SousfamilleD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);

    public List<Jurydel> findJurydelsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
