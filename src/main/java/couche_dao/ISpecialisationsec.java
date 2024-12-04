
package couche_dao;

import couche_jpa.Specialisationsec;
import java.util.List;


public interface ISpecialisationsec {
    //créer un nouveau Specialisationsec
    public Specialisationsec create(Specialisationsec specialisationsec);
    // modifier un Specialisationsec existant
    public Specialisationsec edit(Specialisationsec specialisationsec);
    // supprimer un Specialisationsec existant
    public void destroy(Specialisationsec specialisationsec);
    // chercher un Specialisationsec particulier
    public Specialisationsec find(int id);
    // obtenir tous les objets Specialisationsec
    public List<Specialisationsec> findAll();

    public List<Specialisationsec> findSpecialisationsecD1Secretariat(int numsec, int annee, String nomsouscent, String abreviation);

    public List<Specialisationsec> findSpecialisationsecD1SecretariatEtExamen(int numsec, int anneeSelected, String nomSouscentreSelected, String abreviation, String sigleExamenSelected);

    public List<Specialisationsec> findSpecialisationsecD1SecretariatD1GroupedexamenD1session(int numsecSelected, int anneeSelected, String nomSouscentreSelected, String niveauSelected, String typeSelected);
}
