
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "option")
public class Option implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idopt")
    private Integer idopt;
    @Basic(optional = false)
    @Column(name = "nomopt")
    private String nomopt;
    @Basic(optional = false)
    @Column(name = "sigle")
    private String sigle;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "famille_id", referencedColumnName = "idfam")
    @ManyToOne(optional = false)
    private Famille famille;
    

    public Option() {
    }

    public Option(Integer idopt) {
        this.idopt = idopt;
    }

    public Option(Integer idopt, String nomopt, String sigle, int version) {
        this.idopt = idopt;
        this.nomopt = nomopt;
        this.sigle = sigle;
        this.version = version;
    }

    public Option(String nomopt, String sigle,Famille famille) {
        this.nomopt = nomopt;
        this.sigle = sigle;
        this.famille=famille;
    }
    
    public Integer getIdopt() {
        return idopt;
    }

    public void setIdopt(Integer idopt) {
        this.idopt = idopt;
    }

    public String getNomopt() {
        return nomopt;
    }

    public void setNomopt(String nomopt) {
        this.nomopt = nomopt;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idopt != null ? idopt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Option)) {
            return false;
        }
        Option other = (Option) object;
        if ((this.idopt == null && other.idopt != null) || (this.idopt != null && !this.idopt.equals(other.idopt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Option[ idopt=" + idopt + " ]";
    }

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }
}
