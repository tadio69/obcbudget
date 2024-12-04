
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
@Table(name = "eltacmtemoin")
public class Eltacmtemoin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idelttem")
    private Integer idelttem;
    @Basic(optional = false)
    @Column(name = "fraisconv")
    private int fraisconv;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;//contient le sous-centre d'examen
    @JoinColumn(name = "centre_id", referencedColumnName = "idcent")
    @ManyToOne(optional = false)
    private Centre centre;//centre de destination

    public Eltacmtemoin() {
    }

    public Eltacmtemoin(Integer idelttem) {
        this.idelttem = idelttem;
    }

    public Eltacmtemoin(Intervenant intervenant,Centre centre, int fraisconv) {
        this.intervenant = intervenant;
        this.centre = centre;
        this.fraisconv = fraisconv;
    }

    public Integer getIdelttem() {
        return idelttem;
    }

    public void setIdelttem(Integer idelttem) {
        this.idelttem = idelttem;
    }

    public int getFraisconv() {
        return fraisconv;
    }

    public void setFraisconv(int fraisconv) {
        this.fraisconv = fraisconv;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idelttem != null ? idelttem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltacmtemoin)) {
            return false;
        }
        Eltacmtemoin other = (Eltacmtemoin) object;
        if ((this.idelttem == null && other.idelttem != null) || (this.idelttem != null && !this.idelttem.equals(other.idelttem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltacmtemoin[ idelttem=" + idelttem + " ]";
    }
    
}
