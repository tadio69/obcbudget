
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
@Table(name = "departement")
public class Departement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddepart")
    private Integer iddepart;
    @Basic(optional = false)
    @Column(name = "nomdepart")
    private String nomdepart;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "region_id", referencedColumnName = "idreg")
    @ManyToOne(optional = false)
    private Region region;

    public Departement() {
    }

    public Departement(Integer iddepart) {
        this.iddepart = iddepart;
    }

    public Departement(Integer iddepart, String nomdepart, int version) {
        this.iddepart = iddepart;
        this.nomdepart = nomdepart;
        this.version = version;
    }

    public Departement(String nomdepart, Region region) {
        this.nomdepart = nomdepart;
        this.region = region;
    }
    
    public Integer getIddepart() {
        return iddepart;
    }

    public void setIddepart(Integer iddepart) {
        this.iddepart = iddepart;
    }

    public String getNomdepart() {
        return nomdepart;
    }

    public void setNomdepart(String nomdepart) {
        this.nomdepart = nomdepart;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddepart != null ? iddepart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departement)) {
            return false;
        }
        Departement other = (Departement) object;
        if ((this.iddepart == null && other.iddepart != null) || (this.iddepart != null && !this.iddepart.equals(other.iddepart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Departement[ iddepart=" + iddepart + " ]";
    }

}
