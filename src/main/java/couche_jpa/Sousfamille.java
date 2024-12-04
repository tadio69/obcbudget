
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
import javax.persistence.Version;


@Entity
@Table(name = "sousfamille")
public class Sousfamille implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsousfam")
    private Integer idsousfam;
    @Basic(optional = false)
    @Column(name = "titre")
    private String titre;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "famille_id", referencedColumnName = "idfam")
    @ManyToOne(optional = false)
    private Famille famille;
    

    public Sousfamille() {
    }

    public Sousfamille(Integer idsousfam) {
        this.idsousfam = idsousfam;
    }

    public Sousfamille(String titre,Famille famille) {
        this.famille = famille;
        this.titre = titre;
    }

    public Integer getIdsousfam() {
        return idsousfam;
    }

    public void setIdsousfam(Integer idsousfam) {
        this.idsousfam = idsousfam;
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

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsousfam != null ? idsousfam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sousfamille)) {
            return false;
        }
        Sousfamille other = (Sousfamille) object;
        if ((this.idsousfam == null && other.idsousfam != null) || (this.idsousfam != null && !this.idsousfam.equals(other.idsousfam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Sousfamille[ idsousfam=" + idsousfam + " ]";
    }    
}
