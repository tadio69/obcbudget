
package couche_dao;

import couche_jpa.Secretariat;
import java.util.List;

/**
 *
 * @author famille chijou
 */
public interface ISecretariat {
    //créer un nouveau secrétariat
    public Secretariat create(Secretariat secretariat);
    // modifier un secrétariat existant
    public Secretariat edit(Secretariat secretariat);
    // supprimer un secrétariat existant
    public void destroy(Secretariat secretariat);
    // chercher un secrétariat particulier
    public Secretariat find(int id);
    // obtenir tous les objets Secretariat
    public List<Secretariat> findAll();
    public void supprimerSecretariatsD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected);

    //public List<Secretariat> findSecretariatsD1SouscentreD1Session(String nomSouscentre, int annee);

    //public List<Secretariat> findSecretariatsD1GroupedexamensDans1Session(int anneeSelected, String niveauSelected, String typeSelected);

    public Secretariat findSecretariatD1NumeroD1SessionD1SouscentreD1Etablissement(int numsec, int anneeSelected, String nomSouscentreSelected, String nomEtablissementSelected);

    //public List<Secretariat> findSecretariatsD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected);

    //public List<Secretariat> findSecretariatsD1SouscentreA1SessionEt1Examen(String nomSouscentreSelected,int anneeSelected,String sigleExamenSelected);

    //public Secretariat findSecretariatD1SouscentreD1numeroD1Session(String scentre, int numsec, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Secretariat> findSecretariatsD1SouscentreEtSession(String nomSouscentreSelected, int anneeSelected);

    public List<Secretariat> findSecretariatsD1Session(int anneeSelected);

    public Secretariat findSecretariatD1SouscentreDeNumeroEtSessionDonnes(String nomSouscentreSelected, int numsec, int anneeSelected);
}
