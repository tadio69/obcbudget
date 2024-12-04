
package couche_dao;

import couche_jpa.Matoeuvresf;
import java.util.List;


public interface IMatoeuvresf {
    //créer un nouveau Matoeuvresf
    public Matoeuvresf create(Matoeuvresf matoeuvresf);
    // modifier un Matoeuvresf existant
    public Matoeuvresf edit(Matoeuvresf matoeuvresf);
    // supprimer un Matoeuvresf existant
    public void destroy(Matoeuvresf matoeuvresf);
    // chercher une Matoeuvresf particulier
    public Matoeuvresf find(int id);
    // obtenir tous les objets groupe
    public List<Matoeuvresf> findAll();

    public Matoeuvresf findMatoeuvresfD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Matoeuvresf> findMatoeuvresfsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
