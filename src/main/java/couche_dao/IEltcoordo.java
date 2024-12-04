
package couche_dao;


import couche_jpa.Eltcoordo;
import java.util.List;


public interface IEltcoordo {
    //créer un nouveau Eltcoordo
    public Eltcoordo create(Eltcoordo eltcoordo);
    // modifier un Eltcoordo existant
    public Eltcoordo edit(Eltcoordo eltcoordo);
    // supprimer un Eltcoordo existant
    public void destroy(Eltcoordo eltcoordo);
    // chercher un Eltcoordo particulier
    public Eltcoordo find(int id);
    // obtenir tous les objets Eltcoordo
    public List<Eltcoordo> findAll();

    public List<Eltcoordo> findAllEltcoordoD1Session(int anneeSelected);
}
