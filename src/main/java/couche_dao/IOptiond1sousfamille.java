

package couche_dao;


import couche_jpa.Optiond1sousfamille;
import java.util.List;


public interface IOptiond1sousfamille {
    //créer une nouvelle Optiond1sousfamille
    public Optiond1sousfamille create(Optiond1sousfamille optiond1sousfamille);
    // modifier une Optiond1sousfamille existante
    public Optiond1sousfamille edit(Optiond1sousfamille optiond1sousfamille);
    // supprimer une Optiond1sousfamille existante
    public void destroy(Optiond1sousfamille optiond1sousfamille);
    // chercher une Optiond1sousfamille particulière
    public Optiond1sousfamille find(int id);
    // obtenir tous les objets Optiond1sousfamille
    public List<Optiond1sousfamille> findAll();
}
