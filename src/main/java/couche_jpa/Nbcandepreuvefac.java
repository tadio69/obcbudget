
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
@Table(name = "nbcandepreuvefac")
public class Nbcandepreuvefac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnbcdepfac")
    private Integer idnbcdepfac;
    @Basic(optional = false)
    @Column(name = "nomepreuve")
    private String nomepreuve;
    @Basic(optional = false)
    @Column(name = "nbre")
    private int nbre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Nbcandepreuvefac() {
    }

    public Nbcandepreuvefac(Integer idnbcdepfac) {
        this.idnbcdepfac = idnbcdepfac;
    }

    public Nbcandepreuvefac(String nomepreuve, int nbre, Groupe groupe, Session session, Souscentre souscentre) {
        this.nomepreuve = nomepreuve;
        this.nbre = nbre;
        this.groupe = groupe;
        this.session = session;
        this.souscentre = souscentre;
    }

    public Integer getIdnbcdepfac() {
        return idnbcdepfac;
    }

    public void setIdnbcdepfac(Integer idnbcdepfac) {
        this.idnbcdepfac = idnbcdepfac;
    }

    public String getNomepreuve() {
        return nomepreuve;
    }

    public void setNomepreuve(String nomepreuve) {
        this.nomepreuve = nomepreuve;
    }

    public int getNbre() {
        return nbre;
    }

    public void setNbre(int nbre) {
        this.nbre = nbre;
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
        hash += (idnbcdepfac != null ? idnbcdepfac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbcandepreuvefac)) {
            return false;
        }
        Nbcandepreuvefac other = (Nbcandepreuvefac) object;
        if ((this.idnbcdepfac == null && other.idnbcdepfac != null) || (this.idnbcdepfac != null && !this.idnbcdepfac.equals(other.idnbcdepfac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbcandepreuvefac[ idnbcdepfac=" + idnbcdepfac + " ]";
    }
    
}
