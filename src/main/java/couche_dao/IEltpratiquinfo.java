
package couche_dao;

import couche_jpa.Eltpratiquinfo;
import java.util.List;


public interface IEltpratiquinfo {
    //créer une nouvelle Eltpratiquinfo
    public Eltpratiquinfo create(Eltpratiquinfo eltpratiquinfo);
    // modifier une Eltpratiquinfo existante
    public Eltpratiquinfo edit(Eltpratiquinfo eltpratiquinfo);
    // supprimer une Eltpratiquinfo existante
    public void destroy(Eltpratiquinfo eltpratiquinfo);
    // chercher une Eltpratiquinfo particulière
    public Eltpratiquinfo find(int id);
    // obtenir tous les objets Eltpratiquinfo
    public List<Eltpratiquinfo> findAll();

    public List<Eltpratiquinfo> findAllEltpratiquinfoD1GroupedexamensD1Session(int anneeSelected,String niveauSelected,String typeSelected);

    public Eltpratiquinfo findEltpratiquinfoD1GroupedexamensD1SouscentreD1Session(String niveauSelected, String typeSelected,String nomSouscentreSelected, int anneeSelected);
}
