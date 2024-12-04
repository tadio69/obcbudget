
package couche_dao;


import couche_jpa.Eltpermanence;
import java.util.List;


public interface IEltpermanence {
    //créer un nouveau Eltpermanence
    public Eltpermanence create(Eltpermanence eltpermanence);
    // modifier un Eltpermanence existant
    public Eltpermanence edit(Eltpermanence eltpermanence);
    // supprimer un Eltpermanence existant
    public void destroy(Eltpermanence eltpermanence);
    // chercher un Eltpermanence particulier
    public Eltpermanence find(int id);
    // obtenir tous les objets Eltpermanence
    public List<Eltpermanence> findAll();

    public List<Eltpermanence> findAllEltpermanenceD1Session(int anneeSelected);
}
