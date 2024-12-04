
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


@Entity
@Table(name = "eltjuryano")
public class Eltjuryano implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltjurano")
    private Integer ideltjurano;
    @Basic(optional = false)
    @Column(name = "nbjury")
    private int nbjury;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;

    public Eltjuryano() {
    }

    public Eltjuryano(Integer ideltjurano) {
        this.ideltjurano = ideltjurano;
    }

    public Eltjuryano(Intervenant intervenant, int nbjury) {
        this.intervenant = intervenant;
        this.nbjury = nbjury;
    }

    public Integer getIdeltjurano() {
        return ideltjurano;
    }

    public void setIdeltjurano(Integer ideltjurano) {
        this.ideltjurano = ideltjurano;
    }

    public int getNbjury() {
        return nbjury;
    }

    public void setNbjury(int nbjury) {
        this.nbjury = nbjury;
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
        hash += (ideltjurano != null ? ideltjurano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltjuryano)) {
            return false;
        }
        Eltjuryano other = (Eltjuryano) object;
        if ((this.ideltjurano == null && other.ideltjurano != null) || (this.ideltjurano != null && !this.ideltjurano.equals(other.ideltjurano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltjuryano[ ideltjurano=" + ideltjurano + " ]";
    }
    
}
