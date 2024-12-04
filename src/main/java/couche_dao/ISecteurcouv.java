
package couche_dao;

import couche_jpa.Secteurcouv;
import java.util.List;

/**
 *
 * @author famille chijou
 */
public interface ISecteurcouv {
     //créer un nouvel secteurcouv
    public Secteurcouv create(Secteurcouv secteurcouv);
    // modifier un secteurcouv existant
    public Secteurcouv edit(Secteurcouv secteurcouv);
    // supprimer un secteurcouv existant
    public void destroy(Secteurcouv secteurcouv);
    // chercher une secteurcouv particulier
    public Secteurcouv find(int id);
    // obtenir tous les objets Secteurcouv
    public List<Secteurcouv> findAll();
    public List<Secteurcouv> findSecteurscouvD1Region(String nomRegion);
    public List<Secteurcouv> findSecteurscouvD1Centrebilletage(String nomCentrebilletage);
}
