
package couche_dao;

import couche_jpa.Caisse;
import java.util.List;


public interface ICaisse {
    //créer une nouvelle caisse
    public Caisse create(Caisse caisse);
    // modifier une caisse existante
    public Caisse edit(Caisse caisse);
    // supprimer une caisse existante
    public void destroy(Caisse caisse);
    // chercher une caisse particulière
    public Caisse find(int id);
    // obtenir tous les objets Caisse
    public List<Caisse> findAll();
    public List<Caisse> findCaissesD1Session(int annee);

    public Caisse findCaisseD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int annee, String nomSouscentre, String niveau, String type, String designationRubriquetat);

    public List<Caisse> findCaissesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int annee, String niveau, String type);

    public List<Caisse> findCaissesOrdinairesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Caisse> findCaissesAdditivesD1GroupedexamensDans1RubriquetatEt1Session(String designation, int anneeSelected, String niveauSelected, String typeSelected);

    public Caisse findCaisseOrdinaireD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String designationRubriquetatSelected);

    public Caisse findCaisseAdditiveD1SouscentreDans1Session1GroupedexamensEt1Rubrique(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected, String designationRubriquetatSelected);
}
