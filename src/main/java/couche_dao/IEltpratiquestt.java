
package couche_dao;


import couche_jpa.Eltpratiquestt;
import java.util.List;


public interface IEltpratiquestt {
    //créer un nouvel Eltpratiquestt
    public Eltpratiquestt create(Eltpratiquestt eltpratiquestt);
    // modifier un Eltpratiquestt existant
    public Eltpratiquestt edit(Eltpratiquestt eltpratiquestt);
    // supprimer un Eltpratiquestt existant
    public void destroy(Eltpratiquestt eltpratiquestt);
    // chercher un Eltpratiquestt particulier
    public Eltpratiquestt find(int id);
    // obtenir tous les objets Eltpratiquestt
    public List<Eltpratiquestt> findAll();

    public List<Eltpratiquestt> findAllEltpratiquesttD1Session(int anneeSelected);

    public Eltpratiquestt findEltpratiquesttD1SouscentreD1OptionD1Session(String nomSouscentreSelected, String sigleOptionSelected, int anneeSelected);

    public List<Eltpratiquestt> findAllEltpratiquesttD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected);
}
