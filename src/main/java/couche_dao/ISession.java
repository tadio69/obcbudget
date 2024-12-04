
package couche_dao;

import couche_jpa.Session;
import java.util.List;


public interface ISession {
    //créer une nouvelle session
    public Session create(Session session);
    // modifier une session existante
    public Session edit(Session session);
    // supprimer une session existante
    public void destroy(Session session);
    // chercher une session particulière
    public Session find(int id);
    // obtenir tous les objets Session
    public List<Session> findAll();
}
