
package couche_dao;

import couche_jpa.Statistique;
import java.util.List;


public interface IStatistique {
    //créer une nouvelle statistique
    public Statistique create(Statistique statistique);
    // modifier une statistique existante
    public Statistique edit(Statistique statistique);
    // supprimer une statistique existante
    public void destroy(Statistique statistique);
    // chercher une statistique particulière
    public Statistique find(int id);
    // obtenir tous les objets Statistique
    public List<Statistique> findAll();

    public List<Statistique> findStatistiquesD1SouscentreA1ExamenDans1Session(int annee, String nomSouscentre, String sigleExamen);

    public List<Statistique> findStatistiquesD1ExamenDans1Session(int annee,String sigleExamen);

    public List<Statistique> findAllStatistiquesD1ExamenDans1Session(String sigle, int anneeSelected);

    public List<Statistique> findStatistiquesD1ExamenDans1SessionET1Souscentre(String sigle, int anneeSelected, String nomSouscentreSelected);

    public List<Statistique> findStatistiquesD1SouscentreDans1Session(int annee, String nomSouscentre);

    public int findStatistiqueD1SouscentreA1Examen1SessionEt1Option(String nomsouscent, String sigleExamen, int annee, String sigleOption);

    public List<Statistique> findStatistiquesABID1ExamenDans1Session(String sigle, int anneeSelected);

    public List<Statistique> findStatistiquesAutresLitterairesD1ExamenDans1Session(String sigle, int anneeSelected);

    public List<Statistique> findStatistiquesScientifiquesD1ExamenDans1Session(String sigle, int anneeSelected);

    public List<Statistique> findStatistiquesTID1ExamenDans1Session(String sigle, int anneeSelected);
}
