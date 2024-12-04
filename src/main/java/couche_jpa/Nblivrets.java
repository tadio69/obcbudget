
package couche_jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "nblivrets")
public class Nblivrets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnblivret")
    private Integer idnblivret;
    @Basic(optional = false)
    @Column(name = "nombre")
    private int nombre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "centre_id", referencedColumnName = "idcent")
    @ManyToOne(optional = false)
    private Centre centre;

    public Nblivrets() {
    }

    public Nblivrets(Integer idnblivret) {
        this.idnblivret = idnblivret;
    }

    public Nblivrets(Centre centre,Groupe groupe,Session session, int nombre) {
        this.centre = centre;
        this.groupe = groupe;
        this.session = session;
        this.nombre = nombre;
    }

    public Integer getIdnblivret() {
        return idnblivret;
    }

    public void setIdnblivret(Integer idnblivret) {
        this.idnblivret = idnblivret;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnblivret != null ? idnblivret.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nblivrets)) {
            return false;
        }
        Nblivrets other = (Nblivrets) object;
        if ((this.idnblivret == null && other.idnblivret != null) || (this.idnblivret != null && !this.idnblivret.equals(other.idnblivret))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nblivrets[ idnblivret=" + idnblivret + " ]";
    }   
}
