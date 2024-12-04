
package couche_dao;

import couche_jpa.Caissesport;
import java.util.List;


public interface ICaissesport {
    //créer une nouvelle Caissesport
    public Caissesport create(Caissesport caissesport);
    // modifier une Caissesport existante
    public Caissesport edit(Caissesport caissesport);
    // supprimer une Caissesport existante
    public void destroy(Caissesport caissesport);
    // chercher une Caissesport particulière
    public Caissesport find(int id);
    // obtenir tous les objets Caissesport
    public List<Caissesport> findAll();

    public List<Caissesport> findCaissesportD1Session(int anneeSelected);

    public Caissesport findCaissesportD1EtablissementDans1SessionPour1Groupedexamens(int annee, String nomEtablissement, String niveau, String type);

    public List<Caissesport> findCaissesportsD1SessionPour1Groupedexamens(int annee, String niveau, String type);
}
