
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

/**
 *
 * @author famille chijou
 */
@Entity
@Table(name = "rattachscentre")
public class Rattachscentre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idratscent")
    private Integer idratscent;
    @JoinColumn(name = "centre_id", referencedColumnName = "idcent")
    @ManyToOne(optional = false)
    private Centre centre;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Rattachscentre() {
    }

    public Rattachscentre(Integer idratscent) {
        this.idratscent = idratscent;
    }
    
    public Rattachscentre(Centre centre,Souscentre souscentre) {
        this.centre = centre;
        this.souscentre = souscentre;
    }

    public Integer getIdratscent() {
        return idratscent;
    }

    public void setIdratscent(Integer idratscent) {
        this.idratscent = idratscent;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idratscent != null ? idratscent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rattachscentre)) {
            return false;
        }
        Rattachscentre other = (Rattachscentre) object;
        if ((this.idratscent == null && other.idratscent != null) || (this.idratscent != null && !this.idratscent.equals(other.idratscent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Rattachscentre[ idratscent=" + idratscent + " ]";
    }
    
}
