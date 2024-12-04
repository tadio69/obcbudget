
package couche_dao;


import couche_jpa.Fmissprimchefcentre;
import java.util.List;


public interface IFmissprimchefcentre {
    //créer un nouveau Fmissprimchefcentre
    public Fmissprimchefcentre create(Fmissprimchefcentre fmissprimchefcentre);
    // modifier un Fmissprimchefcentre existant
    public Fmissprimchefcentre edit(Fmissprimchefcentre fmissprimchefcentre);
    // supprimer un Fmissprimchefcentre existant
    public void destroy(Fmissprimchefcentre fmissprimchefcentre);
    // chercher un Fmissprimchefcentre particulier
    public Fmissprimchefcentre find(int id);
    // obtenir tous les objets Fmissprimchefcentre
    public List<Fmissprimchefcentre> findAll();

    public List<Fmissprimchefcentre> findFmissprimchefcentresD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
