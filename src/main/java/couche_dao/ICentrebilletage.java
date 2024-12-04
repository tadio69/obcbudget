
package couche_dao;


import couche_jpa.Centrebilletage;
import java.util.List;

public interface ICentrebilletage {
    //créer un nouveau Centrebilletage
    public Centrebilletage create(Centrebilletage centrebilletage);
    // modifier un Centrebilletage existant
    public Centrebilletage edit(Centrebilletage centrebilletage);
    // supprimer un Centrebilletage existant
    public void destroy(Centrebilletage centrebilletage);
    // chercher un Centrebilletage particulier
    public Centrebilletage find(int id);
    // obtenir tous les objets Centrebilletage
    public List<Centrebilletage> findAll();
    public List<Centrebilletage> findCentrebilletagesD1Arrondissement(String nomArrondissement);

    public Centrebilletage findCentrebilletageD1Etablissement(String nomEtablissement);

    public List<Centrebilletage> findCentrebilletagesD1Departement(String nomDepartement);

    public List<Centrebilletage> findCentrebilletagesD1Region(String nomRegion);

    public List<Centrebilletage> findCentrebilletagesD1NiveauD1Type(String niveau, String type);
}
