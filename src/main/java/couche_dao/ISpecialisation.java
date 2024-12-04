
package couche_dao;



import couche_jpa.Specialisation;
import java.util.List;


public interface ISpecialisation {
    //créer une nouvelle spécialisation
    public Specialisation create(Specialisation specialisation);
    // modifier une spécialisation existante
    public Specialisation edit(Specialisation specialisation);
    // supprimer une spécialisation existante
    public void destroy(Specialisation specialisation);
    // chercher une spécialisation particulière
    public Specialisation find(int id);
    // obtenir tous les objets Specialisation
    public List<Specialisation> findAll();

    public List<Specialisation> findSpecialisationsD1SouscentrePour1ExamenEtSession(int annee, String sigleExamen, String nomSouscentre);

    public List<Specialisation> findSpecialisationsD1ExamenEtD1Session(int anneeSelected,String sigleExamen);

    public void supprimerLesSpecialisationsD1SouscentrePour1SessionD1Examen(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected);

    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1SessionEtniveau(int anneeSelected, String nomSouscentreSelected, String niveauSelected);

    public List<Specialisation> findAllSpecialisationsD1SouscentrePour1SessionD1NiveauEtType(int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected);

    public List<Specialisation> findSpecialisationsD1SouscentreEtSession(int anneeSelected, String nomSouscentreSelected);
}
