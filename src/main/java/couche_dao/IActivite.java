
package couche_dao;

import couche_jpa.Activite;
import java.util.List;


public interface IActivite {
    //créer une nouvelle activité
    public Activite create(Activite activite);
    // modifier une activité existante
    public Activite edit(Activite activite);
    // supprimer une activité existante
    public void destroy(Activite activite);
    // chercher une activité particulière
    public Activite find(int id);
    // obtenir tous les objets activité
    public List<Activite> findAll();
    // obtenir tous les objets Activite de nom proche de nom
    public List<Activite> findAllLikeNom(String nom);
    public Activite findByNom(String nom);
}
