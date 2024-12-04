
package couche_dao;

import couche_jpa.Eltcmpratique2secret;
import java.util.List;


public interface IEltcmpratique2secret {
    //créer un nouveau Eltcmpratique2secret
    public Eltcmpratique2secret create(Eltcmpratique2secret eltcmpratique2secret);
    // modifier un Eltcmpratique2secret existant
    public Eltcmpratique2secret edit(Eltcmpratique2secret eltcmpratique2secret);
    // supprimer un Eltcmpratique2secret existant
    public void destroy(Eltcmpratique2secret eltcmpratique2secret);
    // chercher un Eltcmpratique2secret particulier
    public Eltcmpratique2secret find(int id);
    // obtenir tous les objets Eltcmpratique2secret
    public List<Eltcmpratique2secret> findAll();

    public List<Eltcmpratique2secret> findEltcmpratique2secretD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
