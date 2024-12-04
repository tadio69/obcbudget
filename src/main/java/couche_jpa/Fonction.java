
package couche_jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "fonction")
public class Fonction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfonct")
    private Integer idfonct;
    @Basic(optional = false)
    @Column(name = "titre")
    private String titre;
    @Basic(optional = false)
    @Column(name = "version")
    private int version;

    public Fonction() {
    }

    public Fonction(Integer idfonct) {
        this.idfonct = idfonct;
    }

    public Fonction(Integer idfonct, String titre, int version) {
        this.idfonct = idfonct;
        this.titre = titre;
        this.version = version;
    }

    public Fonction(String titre) {        
        this.titre = titre;
    }
    
    public Integer getIdfonct() {
        return idfonct;
    }

    public void setIdfonct(Integer idfonct) {
        this.idfonct = idfonct;
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
        hash += (idfonct != null ? idfonct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fonction)) {
            return false;
        }
        Fonction other = (Fonction) object;
        if ((this.idfonct == null && other.idfonct != null) || (this.idfonct != null && !this.idfonct.equals(other.idfonct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Fonction[ idfonct=" + idfonct + " ]";
    }  
}
