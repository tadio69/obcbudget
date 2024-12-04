
package couche_jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "activite")
public class Activite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idact")
    private Integer idact;
    @Basic(optional = false)
    @Column(name = "nomact")
    private String nomact;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "initiale")
    private Character initiale;
    
    public Activite() {
    }

    public Activite(Integer idact) {
        this.idact = idact;
    }

    public Activite(Integer idact, String nomact, int version) {
        this.idact = idact;
        this.nomact = nomact;
        this.version = version;
    }

    public Activite(String nomact,char initiale) {
        this.nomact = nomact;
        this.initiale = initiale;
    }
    
    public Integer getIdact() {
        return idact;
    }

    public void setIdact(Integer idact) {
        this.idact = idact;
    }

    public String getNomact() {
        return nomact;
    }

    public void setNomact(String nomact) {
        this.nomact = nomact;
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
        hash += (idact != null ? idact.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activite)) {
            return false;
        }
        Activite other = (Activite) object;
        if ((this.idact == null && other.idact != null) || (this.idact != null && !this.idact.equals(other.idact))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Activite[ idact=" + idact + " ]";
    }

    public Character getInitiale() {
        return initiale;
    }

    public void setInitiale(Character initiale) {
        this.initiale = initiale;
    }    
}
