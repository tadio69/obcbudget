
package couche_dao;

import couche_jpa.Eltacmtemoin;
import java.util.List;


public interface IEltacmtemoin {
    //créer un nouveau Eltacmtemoin
    public Eltacmtemoin create(Eltacmtemoin eltacmtemoin);
    // modifier un Eltacmtemoin existant
    public Eltacmtemoin edit(Eltacmtemoin eltacmtemoin);
    // supprimer un Eltacmtemoin existant
    public void destroy(Eltacmtemoin eltacmtemoin);
    // chercher un Eltacmtemoin particulier
    public Eltacmtemoin find(int id);
    // obtenir tous les objets Eltacmtemoin
    public List<Eltacmtemoin> findAll();

    public List<Eltacmtemoin> findEltacmtemoinsD1GroupeDexamensD1Session(int anneeSelected, String niveauSelected, String typeSelected);
}
