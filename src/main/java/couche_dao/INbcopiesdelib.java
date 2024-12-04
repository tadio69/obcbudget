
package couche_dao;

import couche_jpa.Nbcopiesdelib;
import java.util.List;


public interface INbcopiesdelib {
    //créer un nouveau Nbcopiesdelib
    public Nbcopiesdelib create(Nbcopiesdelib nbcopiesdelib);
    // modifier un Nbcopiesdelib existant
    public Nbcopiesdelib edit(Nbcopiesdelib nbcopiesdelib);
    // supprimer un Nbcopiesdelib existant
    public void destroy(Nbcopiesdelib nbcopiesdelib);
    // chercher un Nbcopiesdelib particulier
    public Nbcopiesdelib find(int id);
    // obtenir tous les objets Nbcopiesdelib
    public List<Nbcopiesdelib> findAll();

    public Nbcopiesdelib findNbcopiesdelibD1CentredeliberationD1GroupedexamensD1Session(String nomCentredeliberationSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Nbcopiesdelib> findNbcopiesdelibD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
