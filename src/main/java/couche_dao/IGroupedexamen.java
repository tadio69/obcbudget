
package couche_dao;

import couche_jpa.Groupedexamen;
import java.util.List;


public interface IGroupedexamen {
    //créer un nouveau groupedexamen
    public Groupedexamen create(Groupedexamen groupedexamen);
    // modifier un groupedexamen existant
    public Groupedexamen edit(Groupedexamen groupedexamen);
    // supprimer un groupedexamen existant
    public void destroy(Groupedexamen groupedexamen);
    // chercher une groupedexamen particulier
    public Groupedexamen find(int id);
    // obtenir tous les objets groupedexamen
    public List<Groupedexamen> findAll();

    public List<Groupedexamen> findGroupedexamensD1NiveauEtD1Type(String niveau, String type);
}
