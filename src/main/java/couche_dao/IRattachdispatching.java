
package couche_dao;

import couche_jpa.Rattachdispatching;
import java.util.List;


public interface IRattachdispatching {
    //créer un nouveau Rattachdispatching
    public Rattachdispatching create(Rattachdispatching rattachdispatching);
    // modifier un Rattachdispatching existant
    public Rattachdispatching edit(Rattachdispatching rattachdispatching);
    // supprimer un Rattachdispatching existant
    public void destroy(Rattachdispatching rattachdispatching);
    // chercher un Rattachdispatching particulier
    public Rattachdispatching find(int id);
    // obtenir tous les objets Rattachdispatching
    public List<Rattachdispatching> findAll();

    public List<Rattachdispatching> findRattachdispatchingsD1CentredispatchingD1Type(String nomCentreDispatchingSelected,String type);

    public List<Rattachdispatching> findRattachdispatchingsD1Centredispatching(String nomCentreDispatchingSelected);//que rattachdispatching soit regroupement ou ventilation

    public Rattachdispatching findRattachdispatchingD1SouscentreD1Type(String nomsouscent, String type);

    public List<Rattachdispatching> findRattachdispatchingsD1Souscentre(String nomsouscent);
}
