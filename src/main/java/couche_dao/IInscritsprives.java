
package couche_dao;

import couche_jpa.Inscritsprives;
import java.util.List;


public interface IInscritsprives {
    //créer un nouvel Inscritsprives
    public Inscritsprives create(Inscritsprives inscritsprives);
    // modifier un Inscritsprives existant
    public Inscritsprives edit(Inscritsprives inscritsprives);
    // supprimer un Inscritsprives existant
    public void destroy(Inscritsprives inscritsprives);
    // chercher un Inscritsprives particulier
    public Inscritsprives find(int id);
    // obtenir tous les objets Inscritsprives
    public List<Inscritsprives> findAll();

    public Inscritsprives findInscritsprivesD1SouscentreD1GroupedexamensD1Session(String nomSouscentreSelected, String niveauSelected, String typeSelected, int anneeSelected);

    public List<Inscritsprives> findInscritsprivesD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
