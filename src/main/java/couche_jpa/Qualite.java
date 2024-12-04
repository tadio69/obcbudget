
package couche_jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "qualite")
public class Qualite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idqual")
    private Integer idqual;
    @Basic(optional = false)
    @Column(name = "titre")
    private String titre;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;

    public Qualite() {
    }

    public Qualite(Integer idqual) {
        this.idqual = idqual;
    }

    public Qualite(String titre) {       
        this.titre = titre;
    }

    public Integer getIdqual() {
        return idqual;
    }

    public void setIdqual(Integer idqual) {
        this.idqual = idqual;
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
        hash += (idqual != null ? idqual.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Qualite)) {
            return false;
        }
        Qualite other = (Qualite) object;
        if ((this.idqual == null && other.idqual != null) || (this.idqual != null && !this.idqual.equals(other.idqual))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Qualite[ idqual=" + idqual + " ]";
    }
}
