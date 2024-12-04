
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
@Table(name = "nbcandlibresg")
public class Nbcandlibresg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcdtlibresg")
    private Integer idcdtlibresg;
    @Basic(optional = false)
    @Column(name = "nbprob")
    private int nbprob;
    @Basic(optional = false)
    @Column(name = "nbbac")
    private int nbbac;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    @Basic(optional = false)
    @Column(name = "identifie")
    private boolean identifie;

    public Nbcandlibresg() {
    }

    public Nbcandlibresg(Integer idcdtlibresg) {
        this.idcdtlibresg = idcdtlibresg;
    }

    public Nbcandlibresg(Souscentre souscentre, Session session, int nbprob, int nbbac,boolean identifie) {
        this.souscentre = souscentre;
         this.session = session;
        this.nbprob = nbprob;
        this.nbbac = nbbac;
        this.identifie = identifie;
    }

    public Integer getIdcdtlibresg() {
        return idcdtlibresg;
    }

    public void setIdcdtlibresg(Integer idcdtlibresg) {
        this.idcdtlibresg = idcdtlibresg;
    }

    public int getNbprob() {
        return nbprob;
    }

    public void setNbprob(int nbprob) {
        this.nbprob = nbprob;
    }

    public int getNbbac() {
        return nbbac;
    }

    public void setNbbac(int nbbac) {
        this.nbbac = nbbac;
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

    public boolean getIdentifie() {
        return identifie;
    }

    
    public void setIdentifie(boolean identifie) {
        this.identifie = identifie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcdtlibresg != null ? idcdtlibresg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbcandlibresg)) {
            return false;
        }
        Nbcandlibresg other = (Nbcandlibresg) object;
        if ((this.idcdtlibresg == null && other.idcdtlibresg != null) || (this.idcdtlibresg != null && !this.idcdtlibresg.equals(other.idcdtlibresg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbcandlibresg[ idcdtlibresg=" + idcdtlibresg + " ]";
    }
    
}
