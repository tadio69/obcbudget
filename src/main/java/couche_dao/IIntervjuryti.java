
package couche_dao;

import couche_jpa.Intervjuryti;
import java.util.List;


public interface IIntervjuryti {
    //créer un nouvel Intervjuryti
    public Intervjuryti create(Intervjuryti intervjuryti);
    // modifier un Intervjuryti existant
    public Intervjuryti edit(Intervjuryti intervjuryti);
    // supprimer un Intervjuryti existant
    public void destroy(Intervjuryti intervjuryti);
    // chercher un Intervjuryti particulier
    public Intervjuryti find(int id);
    // obtenir tous les objets Intervjuryti
    public List<Intervjuryti> findAll();

    public List<Intervjuryti> findIntervjurytisD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String chefjury);

    public void supprimerIntervjurytiByIntervenantId(Integer idinterv);

    public List<Intervjuryti> findIntervjurytisD1SouscentreD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(String nomsouscent, int anneeSelected, String niveauSelected, String typeSelected, String phase, String chefjury);
}
