
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
@Table(name = "naturesecretariat")
public class Naturesecretariat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnatsec")
    private Integer idnatsec;
    @JoinColumn(name = "activite_id", referencedColumnName = "idact")
    @ManyToOne(optional = false)
    private Activite activite;
    @JoinColumn(name = "secretariat_id", referencedColumnName = "idsec")
    @ManyToOne(optional = false)
    private Secretariat secretariat;

    public Naturesecretariat() {
    }

    public Naturesecretariat(Integer idnatsec) {
        this.idnatsec = idnatsec;
    }
    
    public Naturesecretariat(Activite activite,Secretariat secretariat) {
        this.activite = activite;
        this.secretariat=secretariat;
    }

    public Integer getIdnatsec() {
        return idnatsec;
    }

    public void setIdnatsec(Integer idnatsec) {
        this.idnatsec = idnatsec;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public Secretariat getSecretariat() {
        return secretariat;
    }

    public void setSecretariat(Secretariat secretariat) {
        this.secretariat = secretariat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnatsec != null ? idnatsec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Naturesecretariat)) {
            return false;
        }
        Naturesecretariat other = (Naturesecretariat) object;
        if ((this.idnatsec == null && other.idnatsec != null) || (this.idnatsec != null && !this.idnatsec.equals(other.idnatsec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Naturesecretariat[ idnatsec=" + idnatsec + " ]";
    }    
}
