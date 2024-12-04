
package couche_jpa;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author famille chijou
 */
@Entity
@Table(name = "secretariat")
public class Secretariat implements Serializable {   

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsec")
    private Integer idsec;
    @Basic(optional = false)
    @Column(name = "numsec")
    private int numsec;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    @JoinColumn(name = "etablissement_id", referencedColumnName = "idetab")
    @ManyToOne(optional = false)
    private Etablissement etablissement;

    public Secretariat() {
    }

    public Secretariat(Integer idsec) {
        this.idsec = idsec;
    }

    public Secretariat(Integer idsec, int numsec) {
        this.idsec = idsec;
        this.numsec = numsec;
    }
    
    public Secretariat(int numsec, Session session, Souscentre souscentre, Etablissement etablissement) {
        this.numsec = numsec;
        this.session=session;
        this.souscentre=souscentre;
        this.etablissement=etablissement;
    }

    public Integer getIdsec() {
        return idsec;
    }

    public void setIdsec(Integer idsec) {
        this.idsec = idsec;
    }

    public int getNumsec() {
        return numsec;
    }

    public void setNumsec(int numsec) {
        this.numsec = numsec;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsec != null ? idsec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Secretariat)) {
            return false;
        }
        Secretariat other = (Secretariat) object;
        if ((this.idsec == null && other.idsec != null) || (this.idsec != null && !this.idsec.equals(other.idsec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "numsec="+numsec+" sous-centre="+souscentre.getNomsouscent();
    }
}
