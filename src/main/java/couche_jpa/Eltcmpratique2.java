
package couche_jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author famille chijou
 */
@Entity
@Table(name = "eltcmpratique2")
public class Eltcmpratique2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltprat2")
    private Integer ideltprat2;
    @Basic(optional = false)
    @Column(name = "duree")
    private int duree;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;

    public Eltcmpratique2() {
    }

    public Eltcmpratique2(Integer ideltprat2) {
        this.ideltprat2 = ideltprat2;
    }
    
    public Eltcmpratique2(int duree,Intervenant intervenant) {
        this.duree = duree;
        this.intervenant=intervenant;
    }

    public Integer getIdeltprat2() {
        return ideltprat2;
    }

    public void setIdeltprat2(Integer ideltprat2) {
        this.ideltprat2 = ideltprat2;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideltprat2 != null ? ideltprat2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltcmpratique2)) {
            return false;
        }
        Eltcmpratique2 other = (Eltcmpratique2) object;
        if ((this.ideltprat2 == null && other.ideltprat2 != null) || (this.ideltprat2 != null && !this.ideltprat2.equals(other.ideltprat2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltcmpratique2[ ideltprat2=" + ideltprat2 + " ]";
    }
    
}
