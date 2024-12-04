
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
@Table(name = "rattachcentre")
public class Rattachcentre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idratcent")
    private Integer idratcent;
    @JoinColumn(name = "centre_id", referencedColumnName = "idcent")
    @ManyToOne(optional = false)
    private Centre centre;
    @JoinColumn(name = "grandcentre_id", referencedColumnName = "idgrandcent")
    @ManyToOne(optional = false)
    private Grandcentre grandcentre;

    public Rattachcentre() {
    }

    public Rattachcentre(Integer idratcent) {
        this.idratcent = idratcent;
    }
    
    public Rattachcentre(Grandcentre grandcentre,Centre centre) {
        this.grandcentre = grandcentre;
        this.centre = centre;
    }

    public Integer getIdratcent() {
        return idratcent;
    }

    public void setIdratcent(Integer idratcent) {
        this.idratcent = idratcent;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public Grandcentre getGrandcentre() {
        return grandcentre;
    }

    public void setGrandcentre(Grandcentre grandcentre) {
        this.grandcentre = grandcentre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idratcent != null ? idratcent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rattachcentre)) {
            return false;
        }
        Rattachcentre other = (Rattachcentre) object;
        if ((this.idratcent == null && other.idratcent != null) || (this.idratcent != null && !this.idratcent.equals(other.idratcent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Rattachcentre[ idratcent=" + idratcent + " ]";
    }
    
}
