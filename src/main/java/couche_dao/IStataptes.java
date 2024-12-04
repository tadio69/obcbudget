
package couche_dao;

import couche_jpa.Stataptes;
import java.util.List;


public interface IStataptes {
    //créer une nouvelle stataptes
    public Stataptes create(Stataptes stataptes);
    // modifier une stataptes existante
    public Stataptes edit(Stataptes stataptes);
    // supprimer une stataptes existante
    public void destroy(Stataptes stataptes);
    // chercher une stataptes particulière
    public Stataptes find(int id);
    // obtenir tous les objets Fonction
    public List<Stataptes> findAll();
    public Stataptes findStataptesD1EtablissementA1ExamenDans1Session(int anneeSelected, String nomEtablissementSelected, String sigleExamenSelected);
    public List<Stataptes> findAllStataptesD1ExamenDans1Session(int anneeSelected, String sigleExamenSelected);
}
