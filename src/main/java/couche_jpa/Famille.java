
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
@Table(name = "famille")
public class Famille implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfam")
    private Integer idfam;
    @Basic(optional = false)
    @Column(name = "titre")
    private String titre;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
 

    public Famille() {
    }

    public Famille(Integer idfam) {
        this.idfam = idfam;
    }

    public Famille(String titre) {
        this.titre = titre;
    }

    public Integer getIdfam() {
        return idfam;
    }

    public void setIdfam(Integer idfam) {
        this.idfam = idfam;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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
        hash += (idfam != null ? idfam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Famille)) {
            return false;
        }
        Famille other = (Famille) object;
        if ((this.idfam == null && other.idfam != null) || (this.idfam != null && !this.idfam.equals(other.idfam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Famille[ idfam=" + idfam + " ]";
    }     
}
