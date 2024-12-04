
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
@Table(name = "nbcandlibrestp")
public class Nbcandlibrestp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcdtlibrestp")
    private Integer idcdtlibrestp;
    @Basic(optional = false)
    @Column(name = "nbesti")
    private int nbesti;
    @Basic(optional = false)
    @Column(name = "nbprobstt")
    private int nbprobstt;
    @Basic(optional = false)
    @Column(name = "nbbacstt")
    private int nbbacstt;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    @Column(name = "identifie")
    private boolean identifie;

    public Nbcandlibrestp() {
    }

    public Nbcandlibrestp(Integer idcdtlibrestp) {
        this.idcdtlibrestp = idcdtlibrestp;
    }

    public Nbcandlibrestp(Souscentre souscentre, Session session, int nbesti, int nbprobstt, int nbbacstt,boolean identifie) {
        this.souscentre = souscentre;
         this.session = session;
        this.nbesti = nbesti;
        this.nbprobstt = nbprobstt;
        this.nbbacstt = nbbacstt;
        this.identifie = identifie;
    }

    public Integer getIdcdtlibrestp() {
        return idcdtlibrestp;
    }

    public void setIdcdtlibrestp(Integer idcdtlibrestp) {
        this.idcdtlibrestp = idcdtlibrestp;
    }

    public int getNbesti() {
        return nbesti;
    }

    public void setNbesti(int nbesti) {
        this.nbesti = nbesti;
    }

    public int getNbprobstt() {
        return nbprobstt;
    }

    public void setNbprobstt(int nbprobstt) {
        this.nbprobstt = nbprobstt;
    }

    public int getNbbacstt() {
        return nbbacstt;
    }

    public void setNbbacstt(int nbbacstt) {
        this.nbbacstt = nbbacstt;
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

    public boolean getIdentifie() {
        return identifie;
    }

    public void setIdentifie(boolean identifie) {
        this.identifie = identifie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcdtlibrestp != null ? idcdtlibrestp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbcandlibrestp)) {
            return false;
        }
        Nbcandlibrestp other = (Nbcandlibrestp) object;
        if ((this.idcdtlibrestp == null && other.idcdtlibrestp != null) || (this.idcdtlibrestp != null && !this.idcdtlibrestp.equals(other.idcdtlibrestp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbcandlibrestp[ idcdtlibrestp=" + idcdtlibrestp + " ]";
    }
    
}
