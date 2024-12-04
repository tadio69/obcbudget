
package couche_dao;

import couche_jpa.Eltcmpratique2sansnoms;
import java.util.List;

public interface IEltcmpratique2sansnoms {
    //créer un nouveau Eltcmpratique2sansnoms
    public Eltcmpratique2sansnoms create(Eltcmpratique2sansnoms eltcmpratique2sansnoms);
    // modifier un Eltcmpratique2sansnoms existant
    public Eltcmpratique2sansnoms edit(Eltcmpratique2sansnoms eltcmpratique2sansnoms);
    // supprimer un Eltcmpratique2sansnoms existant
    public void destroy(Eltcmpratique2sansnoms eltcmpratique2sansnoms);
    // chercher un Eltcmpratique2sansnoms particulier
    public Eltcmpratique2sansnoms find(int id);
    // obtenir tous les objets Eltcmpratique2sansnoms
    public List<Eltcmpratique2sansnoms> findAll();

    public Eltcmpratique2sansnoms findEltcmpratique2sansnomsD1GroupeDexamensD1SessionD1Souscentre(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected);

    public List<Eltcmpratique2sansnoms> findEltcmpratique2sansnomsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
