
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
@Table(name = "intervjuryti")
public class Intervjuryti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinterjti")
    private Integer idinterjti;
    @Basic(optional = false)
    @Column(name = "num")
    private int num;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @ManyToOne(optional = false)
    private Intervenant intervenant;

    public Intervjuryti() {
    }

    public Intervjuryti(Integer idinterjti) {
        this.idinterjti = idinterjti;
    }

    public Intervjuryti(Integer idinterjti, int num) {
        this.idinterjti = idinterjti;
        this.num = num;
    }

    public Intervjuryti(int num, Intervenant intervenant, int effectif) {
        this.num = num;
        this.intervenant=intervenant;
        this.effectif=effectif;
    }

    public Integer getIdinterjti() {
        return idinterjti;
    }

    public void setIdinterjti(Integer idinterjti) {
        this.idinterjti = idinterjti;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
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
        hash += (idinterjti != null ? idinterjti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Intervjuryti)) {
            return false;
        }
        Intervjuryti other = (Intervjuryti) object;
        if ((this.idinterjti == null && other.idinterjti != null) || (this.idinterjti != null && !this.idinterjti.equals(other.idinterjti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Intervjuryti[ idinterjti=" + idinterjti + " ]";
    }
    
}
