
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
@Table(name = "rubriquetat")
public class Rubriquetat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrubetat")
    private Integer idrubetat;
    @Basic(optional = false)
    @Column(name = "designation")
    private String designation;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "categorie_id", referencedColumnName = "idcat")
    @ManyToOne(optional = false)
    private Categorie categorie;

    public Rubriquetat() {
    }

    public Rubriquetat(Integer idrubetat) {
        this.idrubetat = idrubetat;
    }

    public Rubriquetat(Integer idrubetat, String designation, int version) {
        this.idrubetat = idrubetat;
        this.designation = designation;
        this.version = version;
    }
    
    public Rubriquetat(String designation, Categorie categorie) {       
        this.designation = designation;
        this.categorie = categorie;
    }
    

    public Integer getIdrubetat() {
        return idrubetat;
    }

    public void setIdrubetat(Integer idrubetat) {
        this.idrubetat = idrubetat;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrubetat != null ? idrubetat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rubriquetat)) {
            return false;
        }
        Rubriquetat other = (Rubriquetat) object;
        if ((this.idrubetat == null && other.idrubetat != null) || (this.idrubetat != null && !this.idrubetat.equals(other.idrubetat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Rubriquetat[ idrubetat=" + idrubetat + " ]";
    }
}
