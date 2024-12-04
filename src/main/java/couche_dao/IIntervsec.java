
package couche_dao;

import couche_jpa.Intervsec;
import java.util.List;


public interface IIntervsec {
    //créer un nouvel Intervsec
    public Intervsec create(Intervsec intervsec);
    // modifier un Intervsec existant
    public Intervsec edit(Intervsec intervsec);
    // supprimer un Intervsec existant
    public void destroy(Intervsec intervsec);
    // chercher un Intervsec particulier
    public Intervsec find(int id);
    // obtenir tous les objets Intervsec
    public List<Intervsec> findAll();

    public Intervsec findIntersecD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1QualiteD1Secretariat(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titreQualite, int numsec);

    public List<Intervsec> findIntervsecsD1GroupedexamensD1SessionD1ActiviteD1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titreQualite);
}
