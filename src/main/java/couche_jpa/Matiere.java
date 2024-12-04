
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


@Entity
@Table(name = "matiere")
public class Matiere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmat")
    private Integer idmat;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "sigle")
    private String sigle;
    @Column(name = "version")
    private Integer version;
    @JoinColumn(name = "famille_id", referencedColumnName = "idfam")
    @ManyToOne(optional = false)
    private Famille famille;

    public Matiere() {
    }

    public Matiere(Integer idmat) {
        this.idmat = idmat;
    }

    public Matiere(String nom, String sigle,Famille famille) {
        this.nom = nom;
        this.sigle = sigle;
        this.famille=famille;
    }

    public Integer getIdmat() {
        return idmat;
    }

    public void setIdmat(Integer idmat) {
        this.idmat = idmat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }


    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmat != null ? idmat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matiere)) {
            return false;
        }
        Matiere other = (Matiere) object;
        if ((this.idmat == null && other.idmat != null) || (this.idmat != null && !this.idmat.equals(other.idmat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Matiere[ idmat=" + idmat + " ]";
    }    
}
