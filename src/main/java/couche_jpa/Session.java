
package couche_jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "session")
public class Session implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsess")
    private Integer idsess;
    @Basic(optional = false)
    @Column(name = "annee")
    private int annee;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "cloturee")
    private boolean cloturee;
    
    public Session() {
    }

    public Session(Integer idsess) {
        this.idsess = idsess;
    }

    public Session(Integer idsess, int annee, int version) {
        this.idsess = idsess;
        this.annee = annee;
        this.version = version;
    }

    public Session(int annee, boolean cloturee) {
        this.annee = annee;
        this.cloturee=cloturee;
    }
    
    public Integer getIdsess() {
        return idsess;
    }

    public void setIdsess(Integer idsess) {
        this.idsess = idsess;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isCloturee() {
        return cloturee;
    }

    public void setCloturee(boolean cloturee) {
        this.cloturee = cloturee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsess != null ? idsess.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Session)) {
            return false;
        }
        Session other = (Session) object;
        if ((this.idsess == null && other.idsess != null) || (this.idsess != null && !this.idsess.equals(other.idsess))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Session[ idsess=" + idsess + " ]";
    }
}
