
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
@Table(name = "groupe")
public class Groupe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgpe")
    private Integer idgpe;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "niveau")
    private String niveau;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;

    public Groupe() {
    }

    public Groupe(Integer idgpe) {
        this.idgpe = idgpe;
    }

    public Groupe(String type, String niveau) {        
        this.type = type;
        this.niveau = niveau;  
    }

    public Integer getIdgpe() {
        return idgpe;
    }

    public void setIdgpe(Integer idgpe) {
        this.idgpe = idgpe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
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
        hash += (idgpe != null ? idgpe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupe)) {
            return false;
        }
        Groupe other = (Groupe) object;
        if ((this.idgpe == null && other.idgpe != null) || (this.idgpe != null && !this.idgpe.equals(other.idgpe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Groupe[ idgpe=" + idgpe + " ]";
    }
}
