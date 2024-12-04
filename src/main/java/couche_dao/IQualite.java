
package couche_dao;

import couche_jpa.Qualite;
import java.util.List;


public interface IQualite {
    //créer une nouvelle Qualite
    public Qualite create(Qualite qualite);
    // modifier une Qualite existante
    public Qualite edit(Qualite qualite);
    // supprimer une Qualite existante
    public void destroy(Qualite qualite);
    // chercher une Qualite particulière
    public Qualite find(int id);
    // obtenir tous les objets Qualite
    public List<Qualite> findAll();

    public List<Qualite> findQualitesLikeTitre(String titre);

    public Qualite findQualiteByTitre(String titre);
}
