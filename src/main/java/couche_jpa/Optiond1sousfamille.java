
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
@Table(name = "optiond1sousfamille")
public class Optiond1sousfamille implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idoptsousfam")
    private Integer idoptsousfam;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option optionId;
    @JoinColumn(name = "sousfamille_id", referencedColumnName = "idsousfam")
    @ManyToOne(optional = false)
    private Sousfamille sousfamilleId;

    public Optiond1sousfamille() {
    }

    public Optiond1sousfamille(Integer idoptsousfam) {
        this.idoptsousfam = idoptsousfam;
    }

    public Integer getIdoptsousfam() {
        return idoptsousfam;
    }

    public void setIdoptsousfam(Integer idoptsousfam) {
        this.idoptsousfam = idoptsousfam;
    }

    public Option getOptionId() {
        return optionId;
    }

    public void setOptionId(Option optionId) {
        this.optionId = optionId;
    }

    public Sousfamille getSousfamilleId() {
        return sousfamilleId;
    }

    public void setSousfamilleId(Sousfamille sousfamilleId) {
        this.sousfamilleId = sousfamilleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoptsousfam != null ? idoptsousfam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Optiond1sousfamille)) {
            return false;
        }
        Optiond1sousfamille other = (Optiond1sousfamille) object;
        if ((this.idoptsousfam == null && other.idoptsousfam != null) || (this.idoptsousfam != null && !this.idoptsousfam.equals(other.idoptsousfam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Optiond1sousfamille[ idoptsousfam=" + idoptsousfam + " ]";
    }
    
}
