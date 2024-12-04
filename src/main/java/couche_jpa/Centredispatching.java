
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

/**
 *
 * @author famille chijou
 */
@Entity
@Table(name = "centredispatching")
public class Centredispatching implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcentdispatch")
    private Integer idcentdispatch;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "etablissement_id", referencedColumnName = "idetab")
    @ManyToOne(optional = false)
    private Etablissement etablissement;
    @JoinColumn(name = "famille_id", referencedColumnName = "idfam")
    @ManyToOne(optional = false)
    private Famille famille;
    

    public Centredispatching() {
    }

    public Centredispatching(Integer idcentdispatch) {
        this.idcentdispatch = idcentdispatch;
    }

    public Centredispatching(Integer idcentdispatch, String type, int version) {
        this.idcentdispatch = idcentdispatch;
        this.type = type;
        this.version = version;
    }
    
    public Centredispatching(Etablissement etablissement,String type,Famille famille) {
        this.etablissement = etablissement;
        this.type = type;
        this.famille=famille;
    }

    public Integer getIdcentdispatch() {
        return idcentdispatch;
    }

    public void setIdcentdispatch(Integer idcentdispatch) {
        this.idcentdispatch = idcentdispatch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcentdispatch != null ? idcentdispatch.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centredispatching)) {
            return false;
        }
        Centredispatching other = (Centredispatching) object;
        if ((this.idcentdispatch == null && other.idcentdispatch != null) || (this.idcentdispatch != null && !this.idcentdispatch.equals(other.idcentdispatch))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_dao.Centredispatching[ idcentdispatch=" + idcentdispatch + " ]";
    }

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }
}
