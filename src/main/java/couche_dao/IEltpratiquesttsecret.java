
package couche_dao;


import couche_jpa.Eltpratiquesttsecret;
import couche_jpa.Secretariat;
import java.util.List;


public interface IEltpratiquesttsecret {
    //créer un nouvel Eltpratiquesttsecret
    public Eltpratiquesttsecret create(Eltpratiquesttsecret eltpratiquesttsecret);
    // modifier un Eltpratiquesttsecret existant
    public Eltpratiquesttsecret edit(Eltpratiquesttsecret eltpratiquesttsecret);
    // supprimer un Eltpratiquesttsecret existant
    public void destroy(Eltpratiquesttsecret eltpratiquesttsecret);
    // chercher un Eltpratiquesttsecret particulier
    public Eltpratiquesttsecret find(int id);
    // obtenir tous les objets Eltvacpratiquesttsecret
    public List<Eltpratiquesttsecret> findAll();

    public Eltpratiquesttsecret findEltpratiquesttsecretD1SecretariatD1OptionD1Session(String nomSouscentreSelected, int numsec, String sigleOptionSelected, int anneeSelected);

    public List<Eltpratiquesttsecret> findEltpratiquesttsecretD1GroupedexamensD1Session(String niveauSelected, String typeSelected, int anneeSelected);
}
