
package couche_dao;

import couche_jpa.Utilisateur;
import java.util.List;


public interface IUtilisateur {
    //créer un nouvel utilisateur
    public Utilisateur create(Utilisateur utilisateur);
    // modifier un utilisateur existant
    public Utilisateur edit(Utilisateur utilisateur);
    // supprimer un utilisateur existant
    public void destroy(Utilisateur utilisateur);
    // chercher un utilisateur particulier
    public Utilisateur find(int id);
    // obtenir tous les objets Utilisateur
    public List<Utilisateur> findAll();
    
    public Utilisateur findByLoginAndPwd(String log,String pwd);
}
