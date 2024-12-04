
package couche_dao;

import couche_jpa.Nature;
import java.util.List;


public interface INature {
    //créer une nouvelle nature
    public Nature create(Nature nature);
    // modifier une nature existante
    public Nature edit(Nature nature);
    // supprimer une nature existante
    public void destroy(Nature nature);
    // chercher une nature particulière
    public Nature find(int id);
    // obtenir tous les objets Nature
    public List<Nature> findAll();

    public List<Character> findNaturesEnCharD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomEtablissement);//nomEtablissement abritant le sous-centre
    
    public List<String> findPhasesD1SouscentrePour1ExamenEtSession(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected);

    public List<String> findNaturesEnStringD1ExamenEtD1Session(int anneeSelected, String sigleExamenSelected);
    
    public void supprimerLesNaturesD1SouscentrePour1SessionD1Examen(int anneeSelected, String sigleExamenSelected, String nomSouscentreSelected);

    public List<Nature> findNaturesD1ExamenDans1Session(int anneeSelected, String sigle);

    public List<String> findNaturesD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected);

    public List<Nature> findNaturesDesCentreD1ExamenDans1Session(int annee,String sigleExamen);

    public List<Nature> findNaturesDesSousCentreD1ExamenDans1Session(int annee,String sigleExamen);

    public List<Nature> findPhasesD1SouscentreDans1Session(String nomSouscentreSelected, int anneeSelected);
}
