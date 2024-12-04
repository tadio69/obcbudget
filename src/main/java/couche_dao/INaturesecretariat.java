
package couche_dao;

import couche_jpa.Naturesecretariat;
import couche_jpa.Secretariat;
import java.util.List;
import java.util.Map;

/**
 *
 * @author famille chijou
 */

public interface INaturesecretariat {
    //créer une nouvelle naturesecretariat
    public Naturesecretariat create(Naturesecretariat naturesecretariat);
    // modifier une naturesecretariat existante
    public Naturesecretariat edit(Naturesecretariat naturesecretariat);
    // supprimer une naturesecretariat existante
    public void destroy(Naturesecretariat naturesecretariat);
    // chercher une naturesecretariat particulière
    public Naturesecretariat find(int id);
    // obtenir tous les objets naturesecretariat
    public List<Naturesecretariat> findAll();

    public void supprimerNaturesecretariatsD1SouscentreDans1SessionEt1Groupedexamens(String nomSouscentreSelected, int annee,String niveau,String type);

    public List<Naturesecretariat> findNaturesecretariatsD1SouscentreA1SessionDans1Activite(String act, String nomSouscentreSelected, int anneeSelected);

    public List<Naturesecretariat> findNaturesecretariatsD1SouscentreA1SessionEt1Groupedexamens(String nomSouscentre, int annee, String niveauSelected, String typeSelected);

    public List<Naturesecretariat> findNaturesecretariatsD1GroupedexamensA1SessionDans1Activite(String phase, String niveauSelected, String typeSelected, int anneeSelected);

    public List<Naturesecretariat> findNaturesecretariatsD1Secreatariat(Integer idsec);

    public List<Naturesecretariat> findNaturesecretariatD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected, int numsec);

    public List<Naturesecretariat> findNaturesecretariatsD1ExamensD1Session(int anneeSelected, String sigleExamenSelected);

    public List<Naturesecretariat> findNaturesecretariatsD1Session(int anneeSelected);

    public List<Naturesecretariat> findNaturesecretariatD1SouscentreEtSession(int anneeSelected, String nomSouscentreSelected);

    public List<Naturesecretariat> findNaturesecretariatD1Secretariat(int num, int sess, String scent, String etab);

}
