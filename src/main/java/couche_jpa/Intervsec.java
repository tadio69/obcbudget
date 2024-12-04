
package couche_jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "intervsec")
public class Intervsec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idintervsec")
    private Integer idintervsec;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @ManyToOne(optional = false)
    private Intervenant intervenant;
    @JoinColumn(name = "secretariat_id", referencedColumnName = "idsec")
    @ManyToOne(optional = false)
    private Secretariat secretariat;

    public Intervsec() {
    }

    public Intervsec(Intervenant intervenant,Secretariat secretariat) {
        this.intervenant = intervenant;
        this.secretariat = secretariat;
    }

    public Integer getIdintervsec() {
        return idintervsec;
    }

    public void setIdintervsec(Integer idintervsec) {
        this.idintervsec = idintervsec;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
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
        hash += (idintervsec != null ? idintervsec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Intervsec)) {
            return false;
        }
        Intervsec other = (Intervsec) object;
        if ((this.idintervsec == null && other.idintervsec != null) || (this.idintervsec != null && !this.idintervsec.equals(other.idintervsec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Intervsec[ idintervsec=" + idintervsec + " ]";
    }
    
}
