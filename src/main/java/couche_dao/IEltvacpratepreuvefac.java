
package couche_dao;

import couche_jpa.Eltvacpratepreuvefac;
import java.util.List;


public interface IEltvacpratepreuvefac {
    //créer un nouvel Eltvacpratepreuvefac
    public Eltvacpratepreuvefac create(Eltvacpratepreuvefac eltvacpratepreuvefac);
    // modifier un Eltvacpratepreuvefac existant
    public Eltvacpratepreuvefac edit(Eltvacpratepreuvefac eltvacpratepreuvefac);
    // supprimer un Eltvacpratepreuvefac existant
    public void destroy(Eltvacpratepreuvefac eltvacpratepreuvefac);
    // chercher un Eltvacpratepreuvefac particulier
    public Eltvacpratepreuvefac find(int id);
    // obtenir tous les objets Eltvacpratepreuvefac
    public List<Eltvacpratepreuvefac> findAll();

    public List<Eltvacpratepreuvefac> findEltvacpratepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    public Eltvacpratepreuvefac findEltvacpratepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleEpreuvefacSelected);
}
