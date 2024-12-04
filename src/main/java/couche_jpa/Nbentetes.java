
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
@Table(name = "nbentetes")
public class Nbentetes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnbent")
    private Integer idnbent;
    @Basic(optional = false)
    @Column(name = "nbent")
    private int nbent;
    @JoinColumn(name = "centre_id", referencedColumnName = "idcent")
    @ManyToOne(optional = false)
    private Centre centre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Nbentetes() {
    }

    public Nbentetes(Integer idnbent) {
        this.idnbent = idnbent;
    }

    public Nbentetes(Centre centre,Groupe groupe,Session session, int nbent) {
        this.centre = centre;
        this.groupe = groupe;
        this.session = session;
        this.nbent = nbent;
    }

    public Integer getIdnbent() {
        return idnbent;
    }

    public void setIdnbent(Integer idnbent) {
        this.idnbent = idnbent;
    }

    public int getNbent() {
        return nbent;
    }

    public void setNbent(int nbent) {
        this.nbent = nbent;
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
        hash += (idnbent != null ? idnbent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbentetes)) {
            return false;
        }
        Nbentetes other = (Nbentetes) object;
        if ((this.idnbent == null && other.idnbent != null) || (this.idnbent != null && !this.idnbent.equals(other.idnbent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbentetes[ idnbent=" + idnbent + " ]";
    }
    
}
