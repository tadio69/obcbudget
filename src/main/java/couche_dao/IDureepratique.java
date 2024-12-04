
package couche_dao;

import couche_jpa.Dureepratique;
import couche_jpa.Souscentre;
import java.util.List;


public interface IDureepratique {
    //créer un nouveau Dureepratique
    public Dureepratique create(Dureepratique dureepratique);
    // modifier un Dureepratique existant
    public Dureepratique edit(Dureepratique dureepratique);
    // supprimer un Dureepratique existant
    public void destroy(Dureepratique dureepratique);
    // chercher un Dureepratique particulier
    public Dureepratique find(int id);
    // obtenir tous les objets Dureepratique
    public List<Dureepratique> findAll();

    public List<Dureepratique> findDureespratiqueD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected,int numprat);

    public Dureepratique findDureepratiqueD1SouscentreD1GroupeDexamensD1SessionD1SpecialiteEt1Pratique(String nomSouscentre,int anneeSelected, String niveauSelected, String typeSelected, String sigleSpecialiteDureeSelected, int numprat);
}
