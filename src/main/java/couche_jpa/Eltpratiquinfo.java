
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
@Table(name = "eltpratiquinfo")
public class Eltpratiquinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltpratinfo")
    private Integer ideltpratinfo;
    @Basic(optional = false)
    @Column(name = "nbsal")
    private int nbsal;
    @Basic(optional = false)
    @Column(name = "nbexamin")
    private int nbexamin;
    @Basic(optional = false)
    @Column(name = "nbvaccor")
    private int nbvaccor;
    @Basic(optional = false)
    @Column(name = "nbchefsalprat")
    private int nbchefsalprat;
    @Basic(optional = false)
    @Column(name = "nbchefsalcor")
    private int nbchefsalcor;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Eltpratiquinfo() {
    }

    public Eltpratiquinfo(Integer ideltpratinfo) {
        this.ideltpratinfo = ideltpratinfo;
    }

    public Eltpratiquinfo(Souscentre souscentre, Session session, Groupe groupe, int nbsal, int nbexamin, int nbvaccor, int nbchefsalprat, int nbchefsalcor) {
        this.souscentre = souscentre;
        this.session = session;
        this.groupe = groupe;
        this.nbsal = nbsal;
        this.nbexamin = nbexamin;
        this.nbvaccor = nbvaccor;
        this.nbchefsalprat = nbchefsalprat;
        this.nbchefsalcor = nbchefsalcor;
    }

    public Integer getIdeltpratinfo() {
        return ideltpratinfo;
    }

    public void setIdeltpratinfo(Integer ideltpratinfo) {
        this.ideltpratinfo = ideltpratinfo;
    }

    public int getNbsal() {
        return nbsal;
    }

    public void setNbsal(int nbsal) {
        this.nbsal = nbsal;
    }

    public int getNbexamin() {
        return nbexamin;
    }

    public void setNbexamin(int nbexamin) {
        this.nbexamin = nbexamin;
    }

    public int getNbvaccor() {
        return nbvaccor;
    }

    public void setNbvaccor(int nbvaccor) {
        this.nbvaccor = nbvaccor;
    }

    public int getNbchefsalprat() {
        return nbchefsalprat;
    }

    public void setNbchefsalprat(int nbchefsalprat) {
        this.nbchefsalprat = nbchefsalprat;
    }

    public int getNbchefsalcor() {
        return nbchefsalcor;
    }

    public void setNbchefsalcor(int nbchefsalcor) {
        this.nbchefsalcor = nbchefsalcor;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideltpratinfo != null ? ideltpratinfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltpratiquinfo)) {
            return false;
        }
        Eltpratiquinfo other = (Eltpratiquinfo) object;
        if ((this.ideltpratinfo == null && other.ideltpratinfo != null) || (this.ideltpratinfo != null && !this.ideltpratinfo.equals(other.ideltpratinfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltpratiquinfo[ ideltpratinfo=" + ideltpratinfo + " ]";
    }
    
}
