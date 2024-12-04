
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


@Entity
@Table(name = "rattachregroupement")
public class Rattachregroupement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idratregroup")
    private Integer idratregroup;
    @Basic(optional = false)
    @Column(name = "distance")
    private int distance;
    @Basic(optional = false)
    @Column(name = "prixplace")
    private int prixplace;
    @JoinColumn(name = "etablissement_id", referencedColumnName = "idetab")
    @OneToOne(optional = false)
    private Etablissement etablissement;//abritant le centre de regroupement ou le centre de délibération
    @JoinColumn(name = "centreventilation_id", referencedColumnName = "idcentdispatch")
    @ManyToOne(optional = false)
    private Centredispatching centreventilation;

    public Rattachregroupement() {
    }

    public Rattachregroupement(Integer idratregroup) {
        this.idratregroup = idratregroup;
    }

    public Rattachregroupement(Etablissement etablissement,Centredispatching centreventilation, int distance,int prixplace) {
        this.etablissement = etablissement;
         this.centreventilation = centreventilation;
        this.distance = distance;
        this.prixplace=prixplace;
    }

    public Integer getIdratregroup() {
        return idratregroup;
    }

    public void setIdratregroup(Integer idratregroup) {
        this.idratregroup = idratregroup;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public Centredispatching getCentreventilation() {
        return centreventilation;
    }

    public int getPrixplace() {
        return prixplace;
    }

    public void setPrixplace(int prixplace) {
        this.prixplace = prixplace;
    }
    
    public void setCentreventilation(Centredispatching centreventilation) {
        this.centreventilation = centreventilation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idratregroup != null ? idratregroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rattachregroupement)) {
            return false;
        }
        Rattachregroupement other = (Rattachregroupement) object;
        if ((this.idratregroup == null && other.idratregroup != null) || (this.idratregroup != null && !this.idratregroup.equals(other.idratregroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Rattachregroupement[ idratregroup=" + idratregroup + " ]";
    }
    
}
