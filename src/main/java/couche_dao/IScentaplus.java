
package couche_dao;

import couche_jpa.Scentaplus;
import java.util.List;


public interface IScentaplus {
    //créer une nouvelle scentaplus
    public Scentaplus create(Scentaplus scentaplus);
    // modifier une scentaplus existante
    public Scentaplus edit(Scentaplus scentaplus);
    // supprimer une scentaplus existante
    public void destroy(Scentaplus scentaplus);
    // chercher une scentaplus particulière
    public Scentaplus find(int id);
    // obtenir tous les objets Scentaplus
    public List<Scentaplus> findAll();
    public void supprimerUnScentaplus(int annee, String sigleExamen, String nomSouscentre);

    public List<Scentaplus> findScentaplusD1ExamenEt1Session(int annee, String sigleExamen);

    public List<Scentaplus> findScentaplusD1RegionA1ExamenEt1Session(int anneeSelected, String sigleExamenSelected, String nomRegionSelected);
}
