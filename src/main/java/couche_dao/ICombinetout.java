
package couche_dao;


import couche_jpa.Combinetout;
import java.util.List;


public interface ICombinetout {
    //créer une nouvelle Combinetout
    public Combinetout create(Combinetout combinetout);
    // modifier une Combinetout existante
    public Combinetout edit(Combinetout combinetout);
    // supprimer une Combinetout existante
    public void destroy(Combinetout combinetout);
    // chercher une Combinetout particulière
    public Combinetout find(int id);
    // obtenir tous les objets Combinetout
    public List<Combinetout> findAll();

    public Combinetout findCombinetoutD1EpreuveD1GroupedexamensDans1SessionD1Numprat(String titreEpreuveSelected, int anneeSelected, String niveauSelected, String typeSelected, int numprat);
}
