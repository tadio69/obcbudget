
package couche_dao;

import couche_jpa.Eltpratiqueti;
import java.util.List;


public interface IEltpratiqueti {
    //créer un nouveau Eltpratiqueti
    public Eltpratiqueti create(Eltpratiqueti eltpratiqueti);
    // modifier un Eltpratiqueti existant
    public Eltpratiqueti edit(Eltpratiqueti eltpratiqueti);
    // supprimer un Eltpratiqueti existant
    public void destroy(Eltpratiqueti eltpratiqueti);
    // chercher un Eltpratiqueti particulier
    public Eltpratiqueti find(int id);
    // obtenir tous les objets Eltpratiqueti
    public List<Eltpratiqueti> findAll();

    public List<Eltpratiqueti> findAllEltpratiquetiD1Session(int anneeSelected);

    public Eltpratiqueti findEltpratiquetiD1SouscentreD1Session(String nomSouscentreSelected, int anneeSelected);
}
