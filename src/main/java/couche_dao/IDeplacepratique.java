
package couche_dao;

import couche_jpa.Deplacepratique;
import couche_jpa.Dureepratique;
import java.util.List;


public interface IDeplacepratique {
    //créer un nouveau Deplacepratique
    public Deplacepratique create(Deplacepratique deplacepratique);
    // modifier un Deplacepratique existant
    public Deplacepratique edit(Deplacepratique deplacepratique);
    // supprimer un Deplacepratique existant
    public void destroy(Deplacepratique deplacepratique);
    // chercher un Deplacepratique particulier
    public Deplacepratique find(int id);
    // obtenir tous les objets Deplacepratique
    public List<Deplacepratique> findAll();

    public List<Deplacepratique> findDeplacepratiquesD1GroupeDexamensD1SessionD1Pratique(int anneeSelected,String niveauSelected, String typeSelected,int numprat);

    public List<Deplacepratique> findDeplacepratiquesProfessionnelsD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected, int i);

    public List<Deplacepratique> findDeplacepratiquesNonProfessionnelsD1GroupeDexamensD1SessionD1Pratique(int anneeSelected, String niveauSelected, String typeSelected, int numprat);
}
