
package couche_dao;

import couche_jpa.Eltcmpratique2sansnomsecret;
import couche_jpa.Eltcmpratique2secret;
import java.util.List;


public interface IEltcmpratique2sansnomsecret {
    //créer un nouveau Eltcmpratique2sansnomsecret
    public Eltcmpratique2sansnomsecret create(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret);
    // modifier un Eltcmpratique2sansnomsecret existant
    public Eltcmpratique2sansnomsecret edit(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret);
    // supprimer un Eltcmpratique2sansnomsecret existant
    public void destroy(Eltcmpratique2sansnomsecret eltcmpratique2sansnomsecret);
    // chercher un Eltcmpratique2sansnomsecret particulier
    public Eltcmpratique2sansnomsecret find(int id);
    // obtenir tous les objets Combine
    public List<Eltcmpratique2sansnomsecret> findAll();

    public List<Eltcmpratique2sansnomsecret> findEltcmpratique2sansnomsecretD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
