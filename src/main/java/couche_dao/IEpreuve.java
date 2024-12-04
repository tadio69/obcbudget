
package couche_dao;

import couche_jpa.Epreuve;
import java.util.List;


public interface IEpreuve {
    //créer une nouvelle Epreuve
    public Epreuve create(Epreuve epreuve);
    // modifier une Epreuve existante
    public Epreuve edit(Epreuve epreuve);
    // supprimer une Epreuve existante
    public void destroy(Epreuve epreuve);
    // chercher une Epreuve particulière
    public Epreuve find(int id);
    // obtenir tous les objets Epreuve
    public List<Epreuve> findAll();

    public List<Epreuve> findEpreuvesLikeTitre(String titre);

    public List<Epreuve> findAllEpreuvefacs();

    public List<Epreuve> findEpreuvesD1Caractere(String caractereSelected);
}
