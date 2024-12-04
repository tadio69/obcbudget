
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


@Entity
@Table(name = "rattachdispatching")
public class Rattachdispatching implements Serializable {

    @Column(name = "prixplace")
    private Integer prixplace;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idratdispatch")
    private Integer idratdispatch;
    @JoinColumn(name = "centredispatching_id", referencedColumnName = "idcentdispatch")
    @ManyToOne(optional = false)
    private Centredispatching centredispatching;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    @Basic(optional = false)
    @Column(name = "distance")
    private int distance;

    public Rattachdispatching() {
    }

    public Rattachdispatching(Integer idratdispatch) {
        this.idratdispatch = idratdispatch;
    }
    
    public Rattachdispatching(Centredispatching centredispatching,Souscentre souscentre,int distance,int prixplace) {
        this.centredispatching = centredispatching;
        this.souscentre = souscentre;
        this.distance = distance;
        this.prixplace=prixplace;
    }

    public Integer getIdratdispatch() {
        return idratdispatch;
    }

    public void setIdratdispatch(Integer idratdispatch) {
        this.idratdispatch = idratdispatch;
    }

    public Centredispatching getCentredispatching() {
        return centredispatching;
    }

    public void setCentredispatching(Centredispatching centredispatching) {
        this.centredispatching = centredispatching;
    }

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }

    public int getDistance() {
        return distance;
    }
    
    public void setDistance(int distance) {
        this.distance = distance;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idratdispatch != null ? idratdispatch.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rattachdispatching)) {
            return false;
        }
        Rattachdispatching other = (Rattachdispatching) object;
        if ((this.idratdispatch == null && other.idratdispatch != null) || (this.idratdispatch != null && !this.idratdispatch.equals(other.idratdispatch))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Rattachdispatching[ idratdispatch=" + idratdispatch + " ]";
    }

    public Integer getPrixplace() {
        return prixplace;
    }

    public void setPrixplace(Integer prixplace) {
        this.prixplace = prixplace;
    }
}
