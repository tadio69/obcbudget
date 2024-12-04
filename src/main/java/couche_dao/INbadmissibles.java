
package couche_dao;

import couche_jpa.Nbadmissibles;
import java.util.List;


public interface INbadmissibles {
    //créer un nouveau Nbadmissibles
    public Nbadmissibles create(Nbadmissibles nbadmissibles);
    // modifier un Nbadmissibles existant
    public Nbadmissibles edit(Nbadmissibles nbadmissibles);
    // supprimer un Nbadmissibles existant
    public void destroy(Nbadmissibles nbadmissibles);
    // chercher un Nbadmissibles particulier
    public Nbadmissibles find(int id);
    // obtenir tous les objets Nbadmissibles
    public List<Nbadmissibles> findAll();

    public Nbadmissibles findNbadmissiblesD1OptionD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleOptionSelected);

    public List<Nbadmissibles> findNbadmissiblesD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
