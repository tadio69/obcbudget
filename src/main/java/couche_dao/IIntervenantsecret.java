
package couche_dao;


import couche_jpa.Intervenantsecret;
import couche_jpa.Secretariat;
import java.util.List;


public interface IIntervenantsecret {
    //créer un nouvel Intervenantsecret
    public Intervenantsecret create(Intervenantsecret intervenantsecret);
    // modifier un Intervenantsecret existant
    public Intervenantsecret edit(Intervenantsecret intervenantsecret);
    // supprimer un Intervenantsecret existant
    public void destroy(Intervenantsecret intervenantsecret);
    // chercher un Intervenantsecret particulier
    public Intervenantsecret find(int id);
    // obtenir tous les objets Intervenantsecret
    public List<Intervenantsecret> findAll();

    public List<Intervenantsecret> findIntervenantsecretD1GroupedexamensD1SouscentreA1SessionD1ActiviteEt1Qualite(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String phase, String titreQualiteSelected);

    public List<Intervenantsecret> findIntervenantsecretD1GroupedexamensD1SessionD1ActiviteEt1Qualite(int anneeSelected, String niveauSelected, String typeSelected, String phase, String titreQualiteSelected);

    public Intervenantsecret findIntervenantsecretByNomEtPrenomD1GroupeDexamensD1SessionD1SecretariatD1ActiviteEt1Qualite(String nompers, String prenom, int anneeSelected, String nomSouscentreSelected,int numsecSelected, String niveauSelected, String typeSelected, String phase, String titreQualite);
}
