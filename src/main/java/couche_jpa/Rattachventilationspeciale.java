
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "rattachventilationspeciale")
public class Rattachventilationspeciale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idratventspec")
    private Integer idratventspec;
    @Basic(optional = false)
    @Column(name = "distance")
    private int distance;
    @Basic(optional = false)
    @Column(name = "prixplace")
    private int prixplace;
    @JoinColumn(name = "centretri_id", referencedColumnName = "idcentdispatch")
    @ManyToOne(optional = false)
    private Centredispatching centretri;
    @JoinColumn(name = "centreventilationspeciale_id", referencedColumnName = "idcentdispatch")
    @OneToOne(optional = false)
    private Centredispatching centreventilationspeciale;

    public Rattachventilationspeciale() {
    }

    public Rattachventilationspeciale(Integer idratventspec) {
        this.idratventspec = idratventspec;
    }

    public Rattachventilationspeciale(Centredispatching centretri,Centredispatching centreventilationspeciale, int distance, int prixplace) {
        this.centretri = centretri;
        this.centreventilationspeciale = centreventilationspeciale;
        this.distance = distance;
        this.prixplace = prixplace;
    }

    public Integer getIdratventspec() {
        return idratventspec;
    }

    public void setIdratventspec(Integer idratventspec) {
        this.idratventspec = idratventspec;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPrixplace() {
        return prixplace;
    }

    public void setPrixplace(int prixplace) {
        this.prixplace = prixplace;
    }

    public Centredispatching getCentretri() {
        return centretri;
    }

    public void setCentretri(Centredispatching centretri) {
        this.centretri = centretri;
    }

    public Centredispatching getCentreventilationspeciale() {
        return centreventilationspeciale;
    }

    public void setCentreventilationspeciale(Centredispatching centreventilationspeciale) {
        this.centreventilationspeciale = centreventilationspeciale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idratventspec != null ? idratventspec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rattachventilationspeciale)) {
            return false;
        }
        Rattachventilationspeciale other = (Rattachventilationspeciale) object;
        if ((this.idratventspec == null && other.idratventspec != null) || (this.idratventspec != null && !this.idratventspec.equals(other.idratventspec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Rattachventilationspeciale[ idratventspec=" + idratventspec + " ]";
    }
    
}
