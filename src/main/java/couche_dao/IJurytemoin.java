
package couche_dao;

import couche_jpa.Jurytemoin;
import java.util.List;


public interface IJurytemoin {
    //créer un nouvel Jurytemoin
    public Jurytemoin create(Jurytemoin jurytemoin);
    // modifier un Jurytemoin existant
    public Jurytemoin edit(Jurytemoin jurytemoin);
    // supprimer un Jurytemoin existant
    public void destroy(Jurytemoin jurytemoin);
    // chercher un Jurytemoin particulier
    public Jurytemoin find(int id);
    // obtenir tous les objets Jurytemoin
    public List<Jurytemoin> findAll();

    public Jurytemoin findJurytemoinD1CentreD1GroupedexamensD1Session(String nomCentreSelected, int anneeSelected, String niveauSelected, String typeSelected);

    public List<Jurytemoin> findJurystemoinsD1GroupedexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
