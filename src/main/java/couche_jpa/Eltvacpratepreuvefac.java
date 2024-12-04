
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
 * @author pc
 */
@Entity
@Table(name = "eltvacpratepreuvefac")
public class Eltvacpratepreuvefac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltvacpratfac")
    private Integer ideltvacpratfac;
    @Basic(optional = false)
    @Column(name = "nbexamin")
    private int nbexamin;
    @Basic(optional = false)
    @Column(name = "nbvac")
    private int nbvac;
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

    public Eltvacpratepreuvefac() {
    }

    public Eltvacpratepreuvefac(Integer ideltvacpratfac) {
        this.ideltvacpratfac = ideltvacpratfac;
    }

    public Eltvacpratepreuvefac(Souscentre souscentre,Session session,Groupe groupe,Epreuve epreuve, int nbexamin, int nbvac) {
        this.souscentre = souscentre;
        this.session = session;
        this.groupe = groupe;
        this.epreuve = epreuve;
        this.nbexamin = nbexamin;
        this.nbvac = nbvac;
    }

    public Integer getIdeltvacpratfac() {
        return ideltvacpratfac;
    }

    public void setIdeltvacpratfac(Integer ideltvacpratfac) {
        this.ideltvacpratfac = ideltvacpratfac;
    }

    public int getNbexamin() {
        return nbexamin;
    }

    public void setNbexamin(int nbexamin) {
        this.nbexamin = nbexamin;
    }

    public int getNbvac() {
        return nbvac;
    }

    public void setNbvac(int nbvac) {
        this.nbvac = nbvac;
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
        hash += (ideltvacpratfac != null ? ideltvacpratfac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltvacpratepreuvefac)) {
            return false;
        }
        Eltvacpratepreuvefac other = (Eltvacpratepreuvefac) object;
        if ((this.ideltvacpratfac == null && other.ideltvacpratfac != null) || (this.ideltvacpratfac != null && !this.ideltvacpratfac.equals(other.ideltvacpratfac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltvacpratepreuvefac_1[ ideltvacpratfac=" + ideltvacpratfac + " ]";
    }
    
}
