
package couche_dao;

import couche_jpa.Etablissement;
import java.util.List;


public interface IEtablissement {
    //créer un nouvel établissement
    public Etablissement create(Etablissement etablissement);
    // modifier un établissement existant
    public Etablissement edit(Etablissement etablissement);
    // supprimer un établissement existant
    public void destroy(Etablissement etablissement);
    // chercher un établissement particulier
    public Etablissement find(int id);
    // obtenir tous les objets Etablissement
    public List<Etablissement> findAll();
    // obtenir tous les objets Etablissement de nom like nom
    public List<Etablissement> findAllLikeName(String nom);
    public List<Etablissement> findEtablissementsD1Departement(String nom);

    public List<Etablissement> findEtablissementsD1Arrondissement(String nomArrondissement);

    public Etablissement findEtablissementByAbreviation(String abreviation);

    public List<Etablissement> findEtablissementsCentreDEpsD1Arrondissement(String nomArrondissement);
}
