
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
@Table(name = "rattachetab")
public class Rattachetab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idratetab")
    private Integer idratetab;
    @JoinColumn(name = "etablissement_id", referencedColumnName = "idetab")
    @ManyToOne(optional = false)
    private Etablissement etablissement;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Rattachetab() {
    }

    public Rattachetab(Integer idratetab) {
        this.idratetab = idratetab;
    }
    
    public Rattachetab(Souscentre souscentre,Etablissement etablissement) {
        this.souscentre = souscentre;
        this.etablissement=etablissement;
    }

    public Integer getIdratetab() {
        return idratetab;
    }

    public void setIdratetab(Integer idratetab) {
        this.idratetab = idratetab;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
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
        hash += (idratetab != null ? idratetab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rattachetab)) {
            return false;
        }
        Rattachetab other = (Rattachetab) object;
        if ((this.idratetab == null && other.idratetab != null) || (this.idratetab != null && !this.idratetab.equals(other.idratetab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Rattachetab[ idratetab=" + idratetab + " ]";
    }
    
}
