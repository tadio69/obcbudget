
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
@Table(name = "secteurcouv")
public class Secteurcouv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsecteurcouv")
    private Integer idsecteurcouv;
    @JoinColumn(name = "centrebilletage_id", referencedColumnName = "idcentrebill")
    @ManyToOne(optional = false)
    private Centrebilletage centrebilletage;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    

    public Secteurcouv() {
    }

    public Secteurcouv(Integer idsecteurcouv) {
        this.idsecteurcouv = idsecteurcouv;
    }
    
    public Secteurcouv(Centrebilletage centrebilletage,Souscentre souscentre) {
        this.centrebilletage=centrebilletage;
        this.souscentre=souscentre;
    }

    public Integer getIdsecteurcouv() {
        return idsecteurcouv;
    }

    public void setIdsecteurcouv(Integer idsecteurcouv) {
        this.idsecteurcouv = idsecteurcouv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsecteurcouv != null ? idsecteurcouv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Secteurcouv)) {
            return false;
        }
        Secteurcouv other = (Secteurcouv) object;
        if ((this.idsecteurcouv == null && other.idsecteurcouv != null) || (this.idsecteurcouv != null && !this.idsecteurcouv.equals(other.idsecteurcouv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Secteurcouv[ idsecteurcouv=" + idsecteurcouv + " ]";
    }

    public Centrebilletage getCentrebilletage() {
        return centrebilletage;
    }

    public void setCentrebilletage(Centrebilletage centrebilletage) {
        this.centrebilletage = centrebilletage;
    }

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }
}
