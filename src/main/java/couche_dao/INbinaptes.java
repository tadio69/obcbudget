
package couche_dao;

import couche_jpa.Nbinaptes;
import java.util.List;


public interface INbinaptes {
    //créer un nouveau Nbinaptes
    public Nbinaptes create(Nbinaptes nb);
    // modifier une Nbinaptes existant
    public Nbinaptes edit(Nbinaptes nb);
    // supprimer une Nbinaptes existant
    public void destroy(Nbinaptes nb);
    // chercher une Nbinaptes particulier
    public Nbinaptes find(int id);
    // obtenir tous les objets Nbinaptes
    public List<Nbinaptes> findAll();

    public Nbinaptes findNbinaptesD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Nbinaptes> findAllNbinaptesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
