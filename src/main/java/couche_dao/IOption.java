
package couche_dao;

import couche_jpa.Option;
import java.util.List;


public interface IOption {
    //créer une nouvelle option
    public Option create(Option option);
    // modifier une option existante
    public Option edit(Option option);
    // supprimer une option existante
    public void destroy(Option option);
    // chercher une option particulière
    public Option find(int id);
    // obtenir tous les objets Option
    public List<Option> findAll();
    // obtenir tous les objets Option de nom like nom
    public List<Option> findAllLikeName(String nom);
    public Option findBySigle(String sigle);

    public List<Option> findOptionsDeSigleLikeChaine(String chaine);

    public List<Option> findAllOptionsD1Famille(String titreFamilleSelected);
}
