
package couche_dao;

import couche_jpa.Nbcandlibrestp;
import java.util.List;


public interface INbcandlibrestp {
    //créer un nouveau Nbcandlibrestp
    public Nbcandlibrestp create(Nbcandlibrestp nbcand);
    // modifier un Nbcandlibrestp existant
    public Nbcandlibrestp edit(Nbcandlibrestp nbcand);
    // supprimer un Nbcandlibrestp existant
    public void destroy(Nbcandlibrestp nbcand);
    // chercher une Nbcandlibrestp particulier
    public Nbcandlibrestp find(int id);
    // obtenir tous les objets Nbcandlibrestp
    public List<Nbcandlibrestp> findAll();

    public List<Nbcandlibrestp> findAllNbcandlibrestpD1Session(int anneeSelected);

    public Nbcandlibrestp findNbcandlibrestpD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected);
}
