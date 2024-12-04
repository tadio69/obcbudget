
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
 * @author famille chijou
 */
@Entity
@Table(name = "nbcopiesdelib")
public class Nbcopiesdelib implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnbcopdel")
    private Integer idnbcopdel;
    @Basic(optional = false)
    @Column(name = "nbcopies")
    private int nbcopies;
    @JoinColumn(name = "centre_id", referencedColumnName = "idcent")
    @ManyToOne(optional = false)
    private Centre centre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    

    public Nbcopiesdelib() {
    }

    public Nbcopiesdelib(Integer idnbcopdel) {
        this.idnbcopdel = idnbcopdel;
    }

    public Nbcopiesdelib(Centre centre,int nbcopies,Groupe groupe,Session session) {
        this.centre=centre;
        this.nbcopies = nbcopies;
        this.groupe=groupe;
        this.session=session;
    }

    public Integer getIdnbcopdel() {
        return idnbcopdel;
    }

    public void setIdnbcopdel(Integer idnbcopdel) {
        this.idnbcopdel = idnbcopdel;
    }

    public int getNbcopies() {
        return nbcopies;
    }

    public void setNbcopies(int nbcopies) {
        this.nbcopies = nbcopies;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnbcopdel != null ? idnbcopdel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbcopiesdelib)) {
            return false;
        }
        Nbcopiesdelib other = (Nbcopiesdelib) object;
        if ((this.idnbcopdel == null && other.idnbcopdel != null) || (this.idnbcopdel != null && !this.idnbcopdel.equals(other.idnbcopdel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbcopiesdelib[ idnbcopdel=" + idnbcopdel + " ]";
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
    
}
