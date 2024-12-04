
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
@Table(name = "arrondissement")
public class Arrondissement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idarr")
    private Integer idarr;
    @Basic(optional = false)
    @Column(name = "nomarr")
    private String nomarr;
    @Basic(optional = false)
    @Column(name = "zone")
    private String zone;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "departement_id", referencedColumnName = "iddepart")
    @ManyToOne(optional = false)
    private Departement departement;

    public Arrondissement() {
    }

    public Arrondissement(Integer idarr) {
        this.idarr = idarr;
    }

    public Arrondissement(Integer idarr, String nomarr) {
        this.idarr = idarr;
        this.nomarr = nomarr;
    }
    
    public Arrondissement(String nomarr, String zone,Departement departement) {
        this.nomarr = nomarr;
        this.zone=zone;
        this.departement=departement;
    }

    public Integer getIdarr() {
        return idarr;
    }

    public void setIdarr(Integer idarr) {
        this.idarr = idarr;
    }

    public String getNomarr() {
        return nomarr;
    }

    public void setNomarr(String nomarr) {
        this.nomarr = nomarr;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
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
        hash += (idarr != null ? idarr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arrondissement)) {
            return false;
        }
        Arrondissement other = (Arrondissement) object;
        if ((this.idarr == null && other.idarr != null) || (this.idarr != null && !this.idarr.equals(other.idarr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Arrondissement[ idarr=" + idarr + " ]";
    }
}
