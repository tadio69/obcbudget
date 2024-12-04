
package couche_dao;

import couche_jpa.Nbepreuveprof;
import java.util.List;


public interface INbepreuveprof {
    //créer un nouveau nbepreuveprof
    public Nbepreuveprof create(Nbepreuveprof nbepreuveprof);
    // modifier un nbepreuveprof existant
    public Nbepreuveprof edit(Nbepreuveprof nbepreuveprof);
    // supprimer un nbepreuveprof existant
    public void destroy(Nbepreuveprof nbepreuveprof);
    // chercher un nbepreuveprof particulier
    public Nbepreuveprof find(int id);
    // obtenir tous les objets Nbepreuveprof
    public List<Nbepreuveprof> findAll();

    public List<Nbepreuveprof> findNbepreuveprofsD1Examen(String sigleExamen);

    public Nbepreuveprof findNbepreuveprofsD1ExamenEtD1Option(String sigleExamen, String sigleOption);
    
    public List<Nbepreuveprof> findOptionsD1Examen(String sigleExamen);//ces options se trouvent dans nbreuveprof
}
