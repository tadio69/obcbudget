
package couche_dao;


import couche_jpa.Eltharmo;
import java.util.List;


public interface IEltharmo {
    //créer un nouveau Eltharmo
    public Eltharmo create(Eltharmo eltharmo);
    // modifier un Eltharmo existant
    public Eltharmo edit(Eltharmo eltharmo);
    // supprimer un Eltharmo existant
    public void destroy(Eltharmo eltharmo);
    // chercher un Eltharmo particulier
    public Eltharmo find(int id);
    // obtenir tous les objets Eltharmo
    public List<Eltharmo> findAll();

    public List<Eltharmo> findAllEltharmoD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
