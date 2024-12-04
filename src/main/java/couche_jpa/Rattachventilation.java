
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
 * @author famille chijou
 */
@Entity
@Table(name = "rattachventilation")
public class Rattachventilation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idratvent")
    private Integer idratvent;
    @Basic(optional = false)
    @Column(name = "distance")
    private int distance;
    @Basic(optional = false)
    @Column(name = "prixplace")
    private int prixplace;
    @JoinColumn(name = "centreventilation_id", referencedColumnName = "idcentdispatch")
    @OneToOne(optional = false)
    private Centredispatching centreventilation;
    @JoinColumn(name = "centreventilationspeciale_id", referencedColumnName = "idcentdispatch")
    @ManyToOne(optional = false)
    private Centredispatching centreventilationspeciale;

    public Rattachventilation() {
    }

    public Rattachventilation(Integer idratvent) {
        this.idratvent = idratvent;
    }

    public Rattachventilation(Centredispatching centreventilation,Centredispatching centreventilationspeciale, int distance, int prixplace) {
        this.centreventilation = centreventilation;
        this.centreventilationspeciale = centreventilationspeciale;
        this.distance = distance;
        this.prixplace = prixplace;
    }

    public Integer getIdratvent() {
        return idratvent;
    }

    public void setIdratvent(Integer idratvent) {
        this.idratvent = idratvent;
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

    public Centredispatching getCentreventilation() {
        return centreventilation;
    }

    public void setCentreventilation(Centredispatching centreventilation) {
        this.centreventilation = centreventilation;
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
        hash += (idratvent != null ? idratvent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rattachventilation)) {
            return false;
        }
        Rattachventilation other = (Rattachventilation) object;
        if ((this.idratvent == null && other.idratvent != null) || (this.idratvent != null && !this.idratvent.equals(other.idratvent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Rattachventilation[ idratvent=" + idratvent + " ]";
    }
    
}
