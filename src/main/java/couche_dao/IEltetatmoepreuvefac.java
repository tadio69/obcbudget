
package couche_dao;

import couche_jpa.Eltetatmoepreuvefac;
import java.util.List;


public interface IEltetatmoepreuvefac {
    //créer un nouveau Eltetatmoepreuvefac
    public Eltetatmoepreuvefac create(Eltetatmoepreuvefac eltetatmoepreuvefac);
    // modifier un Eltetatmoepreuvefac existant
    public Eltetatmoepreuvefac edit(Eltetatmoepreuvefac eltetatmoepreuvefac);
    // supprimer un Eltetatmoepreuvefac existant
    public void destroy(Eltetatmoepreuvefac eltetatmoepreuvefac);
    // chercher un Eltetatmoepreuvefac particulier
    public Eltetatmoepreuvefac find(int id);
    // obtenir tous les objets Eltetatmoepreuvefac
    public List<Eltetatmoepreuvefac> findAll();

    public Eltetatmoepreuvefac findEltetatmoepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String sigleEpreuvefacSelected);

    public List<Eltetatmoepreuvefac> findEltetatmoepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
