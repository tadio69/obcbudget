
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

/**
 *
 * @author pc
 */
@Entity
@Table(name = "epreuve")
public class Epreuve implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idep")
    private Integer idep;
    @Basic(optional = false)
    @Column(name = "titre")
    private String titre;
    @Basic(optional = false)
    @Column(name = "sigle")
    private String sigle;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "caractere")
    private String caractere;

    public Epreuve() {
    }

    public Epreuve(Integer idep) {
        this.idep = idep;
    }

    public Epreuve(String titre, String sigle, String caractere) {       
        this.titre = titre;
        this.sigle = sigle;
        this.caractere = caractere;
    }

    public Integer getIdep() {
        return idep;
    }

    public void setIdep(Integer idep) {
        this.idep = idep;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idep != null ? idep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Epreuve)) {
            return false;
        }
        Epreuve other = (Epreuve) object;
        if ((this.idep == null && other.idep != null) || (this.idep != null && !this.idep.equals(other.idep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Epreuve[ idep=" + idep + " ]";
    }   
}
