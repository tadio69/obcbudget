
package couche_dao;

import couche_jpa.Eltcmpratique2;
import java.util.List;


public interface IEltcmpratique2 {
    //créer un nouveau Eltcmpratique2
    public Eltcmpratique2 create(Eltcmpratique2 eltcmpratique2);
    // modifier un Eltcmpratique2 existant
    public Eltcmpratique2 edit(Eltcmpratique2 eltcmpratique2);
    // supprimer un Eltcmpratique2 existant
    public void destroy(Eltcmpratique2 eltcmpratique2);
    // chercher un Eltcmpratique2 particulier
    public Eltcmpratique2 find(int id);
    // obtenir tous les objets Eltcmpratique2
    public List<Eltcmpratique2> findAll();

    public List<Eltcmpratique2> findEltcmpratique2D1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
