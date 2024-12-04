
package couche_dao;


import couche_jpa.Statsecretariat;
import java.util.List;


public interface IStatsecretariat {
    //créer une nouvelle Statsecretariat
    public Statsecretariat create(Statsecretariat statsecretariat);
    // modifier une Statsecretariat existante
    public Statsecretariat edit(Statsecretariat statsecretariat);
    // supprimer une Statsecretariat existante
    public void destroy(Statsecretariat statsecretariat);
    // chercher une Statsecretariat particulière
    public Statsecretariat find(int id);
    // obtenir tous les objets Statsecretariat
    public List<Statsecretariat> findAll();

    public List<Statsecretariat> findStatsecretariatsD1SecretariatD1SouscentreA1ExamenDans1Session(int numsec, int anneeSelected, String nomSouscentreSelected, String sigleExamenSelected);

    public List<Statsecretariat> findStatsecretariatsD1SouscentreA1ExamenDans1Session(int anneeSelected, String nomSouscentreSelected, String sigleExamenSelected);

    public List<Statsecretariat> findStatsecretariatsD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected);

    public List<Statsecretariat> findStatsecretariatsD1SouscentreA1SessionEt1Groupedexamens(String nomsouscent, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Statsecretariat> findStatsecretariatsABID1ExamenDans1Session(String sigle, int anneeSelected);

    public List<Statsecretariat> findStatsecretariatsAutresLitterairesD1ExamenDans1Session(String sigle, int anneeSelected);

    public List<Statsecretariat> findStatsecretariatsScientifiquesD1ExamenDans1Session(String sigle, int anneeSelected);
}
