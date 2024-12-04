
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
 * @author pc
 */
@Entity
@Table(name = "eltpermanence")
public class Eltpermanence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltperm")
    private Integer ideltperm;
    @Basic(optional = false)
    @Column(name = "examconcern")
    private String examconcern;
    @Basic(optional = false)
    @Column(name = "nbj")
    private int nbj;
    @JoinColumn(name = "epreuve_id", referencedColumnName = "idep")
    @ManyToOne(optional = false)
    private Epreuve epreuve;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Eltpermanence() {
    }

    public Eltpermanence(Integer ideltperm) {
        this.ideltperm = ideltperm;
    }

    public Eltpermanence(Intervenant intervenant,Epreuve epreuve,Session session, String examconcern, int nbj) {
        this.intervenant = intervenant;
        this.epreuve = epreuve;
        this.session = session;
        this.examconcern = examconcern;
        this.nbj = nbj;
    }

    public Integer getIdeltperm() {
        return ideltperm;
    }

    public void setIdeltperm(Integer ideltperm) {
        this.ideltperm = ideltperm;
    }

    public String getExamconcern() {
        return examconcern;
    }

    public void setExamconcern(String examconcern) {
        this.examconcern = examconcern;
    }

    public int getNbj() {
        return nbj;
    }

    public void setNbj(int nbj) {
        this.nbj = nbj;
    }

    public Epreuve getEpreuve() {
        return epreuve;
    }

    public void setEpreuve(Epreuve epreuve) {
        this.epreuve = epreuve;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
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
        hash += (ideltperm != null ? ideltperm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltpermanence)) {
            return false;
        }
        Eltpermanence other = (Eltpermanence) object;
        if ((this.ideltperm == null && other.ideltperm != null) || (this.ideltperm != null && !this.ideltperm.equals(other.ideltperm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltpermanence[ ideltperm=" + ideltperm + " ]";
    }
    
}
