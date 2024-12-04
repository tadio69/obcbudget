
package couche_dao;

import couche_jpa.Jurycorrigesecret;
import java.util.List;


public interface IJurycorrigesecret {
    //créer un nouvel Jurycorrigesecret
    public Jurycorrigesecret create(Jurycorrigesecret jurycorrigesecret);
    // modifier un Jurycorrigesecret existant
    public Jurycorrigesecret edit(Jurycorrigesecret jurycorrigesecret);
    // supprimer un Jurycorrigesecret existant
    public void destroy(Jurycorrigesecret jurycorrigesecret);
    // chercher un Jurycorrigesecret particulier
    public Jurycorrigesecret find(int id);
    // obtenir tous les objets Jurycorrigesecret
    public List<Jurycorrigesecret> findAll();

    public Jurycorrigesecret findJurycorrigesecretD1SousfamilleD1SecretariatD1GroupedexamensD1Session(String nomSouscentreSelected, int numsecSelected, int anneeSelected, String niveauSelected, String typeSelected, String titreSousfamilleSelected);

    public List<Jurycorrigesecret> findJurycorrigesecretsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
