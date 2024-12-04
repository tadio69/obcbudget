
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
@Table(name = "nbnotesprat2")
public class Nbnotesprat2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnotprat2")
    private Integer idnotprat2;
    @Basic(optional = false)
    @Column(name = "nombre")
    private int nombre;
    @JoinColumn(name = "centre_id", referencedColumnName = "idcent")
    @ManyToOne(optional = false)
    private Centre centre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Nbnotesprat2() {
    }

    public Nbnotesprat2(Integer idnotprat2) {
        this.idnotprat2 = idnotprat2;
    }

    public Nbnotesprat2(Centre centre,Groupe groupe,Session session, int nombre) {
        this.centre = centre;
        this.groupe = groupe;
        this.session = session;
        this.nombre = nombre;
    }

    public Integer getIdnotprat2() {
        return idnotprat2;
    }

    public void setIdnotprat2(Integer idnotprat2) {
        this.idnotprat2 = idnotprat2;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnotprat2 != null ? idnotprat2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbnotesprat2)) {
            return false;
        }
        Nbnotesprat2 other = (Nbnotesprat2) object;
        if ((this.idnotprat2 == null && other.idnotprat2 != null) || (this.idnotprat2 != null && !this.idnotprat2.equals(other.idnotprat2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbnotesprat2[ idnotprat2=" + idnotprat2 + " ]";
    }
    
}
