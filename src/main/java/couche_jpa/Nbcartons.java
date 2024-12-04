
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
import javax.persistence.Version;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "nbcartons")
public class Nbcartons implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnbcart")
    private Integer idnbcart;
    @Basic(optional = false)
    @Column(name = "nbcart")
    private int nbcart;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "numprat")
    private int numprat;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Nbcartons() {
    }

    public Nbcartons(Integer idnbcart) {
        this.idnbcart = idnbcart;
    }

    public Nbcartons(Groupe groupe, Session session, Souscentre souscentre, int nbcart, int numprat) {
        this.groupe = groupe;
        this.session = session;
        this.souscentre = souscentre;
        this.nbcart = nbcart;       
        this.numprat = numprat;
    }

    public Integer getIdnbcart() {
        return idnbcart;
    }

    public void setIdnbcart(Integer idnbcart) {
        this.idnbcart = idnbcart;
    }

    public int getNbcart() {
        return nbcart;
    }

    public void setNbcart(int nbcart) {
        this.nbcart = nbcart;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getNumprat() {
        return numprat;
    }

    public void setNumprat(int numprat) {
        this.numprat = numprat;
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
        hash += (idnbcart != null ? idnbcart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbcartons)) {
            return false;
        }
        Nbcartons other = (Nbcartons) object;
        if ((this.idnbcart == null && other.idnbcart != null) || (this.idnbcart != null && !this.idnbcart.equals(other.idnbcart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbcartons[ idnbcart=" + idnbcart + " ]";
    }
    
}
