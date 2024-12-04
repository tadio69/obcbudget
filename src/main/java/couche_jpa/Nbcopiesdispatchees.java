
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author famille chijou
 */
@Entity
@Table(name = "nbcopiesdispatchees")
public class Nbcopiesdispatchees implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnbcopdisp")
    private Integer idnbcopdisp;
    @Basic(optional = false)
    @Column(name = "nbcopies")
    private int nbcopies;
    @JoinColumn(name = "centredispatching_id", referencedColumnName = "idcentdispatch")
    @OneToOne(optional = false)
    private Centredispatching centredispatching;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Nbcopiesdispatchees() {
    }

    public Nbcopiesdispatchees(Integer idnbcopdisp) {
        this.idnbcopdisp = idnbcopdisp;
    }

    public Nbcopiesdispatchees(Centredispatching centredispatching, int nbcopies,Groupe groupe,Session session) {
        this.centredispatching = centredispatching;
        this.nbcopies = nbcopies;
        this.groupe=groupe;
        this.session=session;
    }

    public Integer getIdnbcopdisp() {
        return idnbcopdisp;
    }

    public void setIdnbcopdisp(Integer idnbcopdisp) {
        this.idnbcopdisp = idnbcopdisp;
    }

    public int getNbcopies() {
        return nbcopies;
    }

    public void setNbcopies(int nbcopies) {
        this.nbcopies = nbcopies;
    }

    public Centredispatching getCentredispatching() {
        return centredispatching;
    }

    public void setCentredispatching(Centredispatching centredispatching) {
        this.centredispatching = centredispatching;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnbcopdisp != null ? idnbcopdisp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbcopiesdispatchees)) {
            return false;
        }
        Nbcopiesdispatchees other = (Nbcopiesdispatchees) object;
        if ((this.idnbcopdisp == null && other.idnbcopdisp != null) || (this.idnbcopdisp != null && !this.idnbcopdisp.equals(other.idnbcopdisp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbcopiesdispatchees[ idnbcopdisp=" + idnbcopdisp + " ]";
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
