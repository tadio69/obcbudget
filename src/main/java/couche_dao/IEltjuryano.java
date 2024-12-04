
package couche_dao;

import couche_jpa.Eltjuryano;
import java.util.List;


public interface IEltjuryano {
    //créer un nouveau Eltjuryano
    public Eltjuryano create(Eltjuryano eltjuryano);
    // modifier un Eltjuryano existant
    public Eltjuryano edit(Eltjuryano eltjuryano);
    // supprimer un Eltjuryano existant
    public void destroy(Eltjuryano eltjuryano);
    // chercher un Eltjuryano particulier
    public Eltjuryano find(int id);
    // obtenir tous les objets Eltjuryano
    public List<Eltjuryano> findAll();

    public List<Eltjuryano> findAllEltjuryanoD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
