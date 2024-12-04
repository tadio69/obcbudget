
package couche_dao;

import couche_jpa.Nbchefsallesecret;
import java.util.List;


public interface INbchefsallesecret {
     //créer un nouvel Nbchefsallesecret
    public Nbchefsallesecret create(Nbchefsallesecret nbchefsallesecret);
    // modifier un Nbchefsallesecret existant
    public Nbchefsallesecret edit(Nbchefsallesecret nbchefsallesecret);
    // supprimer un Nbchefsallesecret existant
    public void destroy(Nbchefsallesecret nbchefsallesecret);
    // chercher un Nbchefsallesecret particulier
    public Nbchefsallesecret find(int id);
    // obtenir tous les objets Nbchefsallesecret
    public List<Nbchefsallesecret> findAll();

    public Nbchefsallesecret findNbchefsalleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Nbchefsallesecret> findNbchefsallesecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
