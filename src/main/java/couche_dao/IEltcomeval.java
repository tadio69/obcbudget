
package couche_dao;


import couche_jpa.Eltcomeval;
import java.util.List;


public interface IEltcomeval {
    //créer un nouveau Eltcomeval
    public Eltcomeval create(Eltcomeval eltcomeval);
    // modifier un Eltcomeval existant
    public Eltcomeval edit(Eltcomeval eltcomeval);
    // supprimer un Eltcomeval existant
    public void destroy(Eltcomeval eltcomeval);
    // chercher un Eltcomeval particulier
    public Eltcomeval find(int id);
    // obtenir tous les objets Eltcomeval
    public List<Eltcomeval> findAll();

    public List<Eltcomeval> findAllEltcomevalD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
