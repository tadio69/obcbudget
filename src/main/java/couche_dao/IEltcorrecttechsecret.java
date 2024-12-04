
package couche_dao;

import couche_jpa.Eltcorrecttechsecret;
import java.util.List;


public interface IEltcorrecttechsecret {
    //créer un nouveau Eltcorrecttechsecret
    public Eltcorrecttechsecret create(Eltcorrecttechsecret eltcorrecttechsecret);
    // modifier un Eltcorrecttechsecret existant
    public Eltcorrecttechsecret edit(Eltcorrecttechsecret eltcorrecttechsecret);
    // supprimer un Eltcorrecttechsecret existant
    public void destroy(Eltcorrecttechsecret eltcorrecttechsecret);
    // chercher un Eltcorrecttechsecret particulier
    public Eltcorrecttechsecret find(int id);
    // obtenir tous les objets Eltcorrecttechsecret
    public List<Eltcorrecttechsecret> findAll();

    public Eltcorrecttechsecret findEltcorrecttechsecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);

    public List<Eltcorrecttechsecret> findEltcorrecttechsecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
