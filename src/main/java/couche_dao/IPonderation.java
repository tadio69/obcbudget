
package couche_dao;

import couche_jpa.Ponderation;
import java.util.List;


public interface IPonderation {
    //créer une nouvelle Ponderation
    public Ponderation create(Ponderation ponderation);
    // modifier une Ponderation existante
    public Ponderation edit(Ponderation ponderation);
    // supprimer une Ponderation existante
    public void destroy(Ponderation ponderation);
    // chercher une Ponderation particulière
    public Ponderation find(int id);
    // obtenir tous les objets Ponderation
    public List<Ponderation> findAll();

    public Ponderation findPonderationD1GroupedexamensD1NatureEtD1Sousfamille(String typeSelected, String niveauSelected, String natureSelected, String sousfamilleSelected);

    public List<Ponderation> findPonderationsD1Groupedexamens(String niveauSelected, String typeSelected);
}
