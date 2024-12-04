
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


@Entity
@Table(name = "eltpratiqueti")
public class Eltpratiqueti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltpratti")
    private Integer ideltpratti;
    @Basic(optional = false)
    @Column(name = "nbvac")
    private int nbvac;
    @Basic(optional = false)
    @Column(name = "nbchefsal")
    private int nbchefsal;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Eltpratiqueti() {
    }

    public Eltpratiqueti(Integer ideltpratti) {
        this.ideltpratti = ideltpratti;
    }

    public Eltpratiqueti(Souscentre souscentre,Session session,int nbvac, int nbchefsal) {
        this.souscentre = souscentre;
        this.session = session;
        this.nbvac = nbvac;
        this.nbchefsal = nbchefsal;
    }

    public Integer getIdeltpratti() {
        return ideltpratti;
    }

    public void setIdeltpratti(Integer ideltpratti) {
        this.ideltpratti = ideltpratti;
    }

    public int getNbvac() {
        return nbvac;
    }

    public void setNbvac(int nbvac) {
        this.nbvac = nbvac;
    }

    public int getNbchefsal() {
        return nbchefsal;
    }

    public void setNbchefsal(int nbchefsal) {
        this.nbchefsal = nbchefsal;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideltpratti != null ? ideltpratti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltpratiqueti)) {
            return false;
        }
        Eltpratiqueti other = (Eltpratiqueti) object;
        if ((this.ideltpratti == null && other.ideltpratti != null) || (this.ideltpratti != null && !this.ideltpratti.equals(other.ideltpratti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltpratiqueti[ ideltpratti=" + ideltpratti + " ]";
    }
    
}
