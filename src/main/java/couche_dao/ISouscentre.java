
package couche_dao;

import couche_jpa.Centre;
import couche_jpa.Souscentre;
import java.util.List;


public interface ISouscentre {
    //créer un nouveau sous-centre
    public Souscentre create(Souscentre souscentre);
    // modifier un sous-centre existant
    public Souscentre edit(Souscentre souscentre);
    // supprimer un sous-centre existant
    public void destroy(Souscentre souscentre);
    // chercher un sous-centre particulier
    public Souscentre find(int id);
    // obtenir tous les objets Souscentre
    public List<Souscentre> findAll();
    // obtenir tous les objets Souscentre de nom like nom
    public List<Souscentre> findAllLikeName(String nom);

    //public List<Souscentre> findSouscentresD1Centre(String nomCentre);

    public List<Souscentre> findSouscentresD1Departement(String nomDepartement);

    public List<Souscentre> findSouscentresD1Arrondissement(String nomArrondissement);

    public Souscentre findSouscentreByName(String nom);

    public Souscentre findSouscentreByEtablissement(String abreviation);

    public List<Souscentre> findSouscentresNoso();

    public List<Souscentre> findSouscentresArisquesExtNord();

    public List<Souscentre> findSouscentresEnclaves();

    public List<Souscentre> findSouscentresPrivesD1Arrondissement(String nomArrondissementSouscentreSelected);
}
