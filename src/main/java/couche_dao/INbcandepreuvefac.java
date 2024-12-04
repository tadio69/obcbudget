
package couche_dao;

import couche_jpa.Nbcandepreuvefac;
import java.util.List;


public interface INbcandepreuvefac {
    //créer un nouvel Nbcandepreuvefac
    public Nbcandepreuvefac create(Nbcandepreuvefac nbcandepreuvefac);
    // modifier un Nbcandepreuvefac existant
    public Nbcandepreuvefac edit(Nbcandepreuvefac nbcandepreuvefac);
    // supprimer un Nbcandepreuvefac existant
    public void destroy(Nbcandepreuvefac nbcandepreuvefac);
    // chercher un Nbcandepreuvefac particulier
    public Nbcandepreuvefac find(int id);
    // obtenir tous les objets Intervsec
    public List<Nbcandepreuvefac> findAll();

    public List<Nbcandepreuvefac> findNbcandepreuvefacsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);

    public Nbcandepreuvefac findNbcandepreuvefacD1EpreuvefacD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, int anneeSelected, String niveauSelected, String typeSelected, String nomEpreuvefacSelected);
}
