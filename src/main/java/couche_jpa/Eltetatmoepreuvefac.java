
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
@Table(name = "eltetatmoepreuvefac")
public class Eltetatmoepreuvefac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltmoepfac")
    private Integer ideltmoepfac;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @JoinColumn(name = "epreuve_id", referencedColumnName = "idep")
    @ManyToOne(optional = false)
    private Epreuve epreuve;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Eltetatmoepreuvefac() {
    }

    public Eltetatmoepreuvefac(Integer ideltmoepfac) {
        this.ideltmoepfac = ideltmoepfac;
    }

    public Eltetatmoepreuvefac(Souscentre souscentre,Groupe groupe,Session session,Epreuve epreuve,int effectif) {
        this.souscentre = souscentre;
        this.groupe = groupe;
        this.session = session;
        this.epreuve = epreuve;
        this.effectif = effectif;
    }

    public Integer getIdeltmoepfac() {
        return ideltmoepfac;
    }

    public void setIdeltmoepfac(Integer ideltmoepfac) {
        this.ideltmoepfac = ideltmoepfac;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public Epreuve getEpreuve() {
        return epreuve;
    }

    public void setEpreuve(Epreuve epreuve) {
        this.epreuve = epreuve;
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
        hash += (ideltmoepfac != null ? ideltmoepfac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltetatmoepreuvefac)) {
            return false;
        }
        Eltetatmoepreuvefac other = (Eltetatmoepreuvefac) object;
        if ((this.ideltmoepfac == null && other.ideltmoepfac != null) || (this.ideltmoepfac != null && !this.ideltmoepfac.equals(other.ideltmoepfac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltetatmoepreuvefac[ ideltmoepfac=" + ideltmoepfac + " ]";
    }    
}
