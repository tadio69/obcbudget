
package couche_dao;


import couche_jpa.Sousfamille;
import java.util.List;


public interface ISousfamille {
    //créer une nouvelle Sousfamille
    public Sousfamille create(Sousfamille sousfamille);
    // modifier une Sousfamille existante
    public Sousfamille edit(Sousfamille sousfamille);
    // supprimer une Sousfamille existante
    public void destroy(Sousfamille sousfamille);
    // chercher une Sousfamille particulière
    public Sousfamille find(int id);
    // obtenir tous les objets famille
    public List<Sousfamille> findAll();
    public List<Sousfamille> findSousfamillesLikeTitre(String titre);
    public Sousfamille findSousfamillesByTitre(String titre);
    public List<Sousfamille> findSousfamillesTI();

    public List<Sousfamille> findSousfamillesESG();

    public List<Sousfamille> findSousfamillesSTT();

    public List<Sousfamille> findAllSousfamillesD1Famille(String titreFamilleSelected);
}
