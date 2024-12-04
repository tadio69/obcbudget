
package couche_dao;

import couche_jpa.Intervenant;
import java.util.List;


public interface IIntervenant {
    //créer un nouvel Intervenant
    public Intervenant create(Intervenant intervenant);
    // modifier un Intervenant existant
    public Intervenant edit(Intervenant intervenant);
    // supprimer un Intervenant existant
    public void destroy(Intervenant intervenant);
    // chercher un Intervenant particulier
    public Intervenant find(int id);
    // obtenir tous les objets Intervenant
    public List<Intervenant> findAll();

    public Intervenant findIntervenantByNomEtPrenomD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(String nom, String prenom, int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titre);

    public List<Intervenant> findIntervenantsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titre);

    public Intervenant findIntervenantByQualiteD1GroupeDexamensD1SessionD1SouscentreEtActivite(int anneeSelected, String nomsouscent, String niveauSelected, String typeSelected, String phase, String qualiteResponsble);

    public List<Intervenant> findIntervenantsD1GroupeDexamensD1SouscentreD1SessionD1ActiviteEt1Qualite(int annee, String nomSouscentre, String niveau, String type, String phase, String titreQualite);

    public Intervenant findIntervenantD1GroupeDexamensD1SessionD1SouscentreD1ActiviteEt1Qualite(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titreQualite);

    public List<Intervenant> findIntervenantsProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String correcteur);

    public List<Intervenant> findIntervenantsNonProfessionnelsD1GroupeDexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String correcteur);
}
