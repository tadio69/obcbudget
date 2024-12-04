
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
@Table(name = "region")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreg")
    private Integer idreg;
    @Basic(optional = false)
    @Column(name = "nomreg")
    private String nomreg;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    

    public Region() {
    }

    public Region(Integer idreg) {
        this.idreg = idreg;
    }

    public Region(Integer idreg, String nomreg, int version) {
        this.idreg = idreg;
        this.nomreg = nomreg;
        this.version = version;
    }
    
    public Region(String nomreg) {
        this.nomreg = nomreg;
    }

    public Integer getIdreg() {
        return idreg;
    }

    public void setIdreg(Integer idreg) {
        this.idreg = idreg;
    }

    public String getNomreg() {
        return nomreg;
    }

    public void setNomreg(String nomreg) {
        this.nomreg = nomreg;
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
        hash += (idreg != null ? idreg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Region)) {
            return false;
        }
        Region other = (Region) object;
        if ((this.idreg == null && other.idreg != null) || (this.idreg != null && !this.idreg.equals(other.idreg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "idreg=" + idreg + ", nom="+nomreg;
    }
}
