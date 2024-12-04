
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
@Table(name = "fmissprimchefcentre")
public class Fmissprimchefcentre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfmisprim")
    private Integer idfmisprim;
    @Basic(optional = false)
    @Column(name = "liaisondres")
    private boolean liaisondres;
    @Basic(optional = false)
    @Column(name = "liaisoncentrebil")
    private boolean liaisoncentrebil;
    @Basic(optional = false)
    @Column(name = "megacentre")
    private boolean megacentre;
    @Basic(optional = false)
    @Column(name = "fraistrans")
    private boolean fraistrans;
    @Basic(optional = false)
    @Column(name = "prime")
    private int prime;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;

    public Fmissprimchefcentre() {
    }

    public Fmissprimchefcentre(Integer idfmisprim) {
        this.idfmisprim = idfmisprim;
    }

    public Fmissprimchefcentre(Intervenant intervenant, boolean liaisondres, boolean liaisoncentrebil, boolean fraistrans,boolean megacentre, int prime) {
        this.intervenant = intervenant;
        this.liaisondres = liaisondres;
        this.liaisoncentrebil = liaisoncentrebil;
        this.fraistrans = fraistrans;
        this.megacentre = megacentre;
        this.prime = prime;
    }

    public Integer getIdfmisprim() {
        return idfmisprim;
    }

    public void setIdfmisprim(Integer idfmisprim) {
        this.idfmisprim = idfmisprim;
    }

    public boolean getLiaisondres() {
        return liaisondres;
    }

    public void setLiaisondres(boolean liaisondres) {
        this.liaisondres = liaisondres;
    }

    public boolean getLiaisoncentrebil() {
        return liaisoncentrebil;
    }

    public void setLiaisoncentrebil(boolean liaisoncentrebil) {
        this.liaisoncentrebil = liaisoncentrebil;
    }

    public boolean getMegacentre() {
        return megacentre;
    }

    public void setMegacentre(boolean megacentre) {
        this.megacentre = megacentre;
    }

    public boolean getFraistrans() {
        return fraistrans;
    }

    public void setFraistrans(boolean fraistrans) {
        this.fraistrans = fraistrans;
    }
    
    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
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
        hash += (idfmisprim != null ? idfmisprim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fmissprimchefcentre)) {
            return false;
        }
        Fmissprimchefcentre other = (Fmissprimchefcentre) object;
        if ((this.idfmisprim == null && other.idfmisprim != null) || (this.idfmisprim != null && !this.idfmisprim.equals(other.idfmisprim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Fmissprimchefcentre[ idfmipri=" + idfmisprim + " ]";
    }
    
}
