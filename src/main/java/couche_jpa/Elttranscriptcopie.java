
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "elttranscriptcopie")
public class Elttranscriptcopie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idelttranscopie")
    private Integer idelttranscopie;
    @Basic(optional = false)
    @Column(name = "nbmatlitter")
    private int nbmatlitter;
    @Basic(optional = false)
    @Column(name = "nbmatscient")
    private int nbmatscient;
    @Basic(optional = false)
    @Column(name = "nbcandlitter")
    private int nbcandlitter;
    @Basic(optional = false)
    @Column(name = "nbcandscient")
    private int nbcandscient;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Elttranscriptcopie() {
    }

    public Elttranscriptcopie(Integer idelttranscopie) {
        this.idelttranscopie = idelttranscopie;
    }

    public Elttranscriptcopie(Souscentre souscentre,Groupe groupe, Session session,Intervenant intervenant,int nbmatlitter,int nbmatscient, int nbcandlitter, int nbcandscient) {
        this.souscentre = souscentre;
        this.groupe = groupe;
        this.session = session;
        this.intervenant = intervenant;
        this.nbmatlitter = nbmatlitter;
        this.nbmatscient = nbmatscient;
        this.nbcandlitter = nbcandlitter;
        this.nbcandscient = nbcandscient;
    }

    public Integer getIdelttranscopie() {
        return idelttranscopie;
    }

    public void setIdelttranscopie(Integer idelttranscopie) {
        this.idelttranscopie = idelttranscopie;
    }

    public int getNbmatlitter() {
        return nbmatlitter;
    }

    public void setNbmatlitter(int nbmatlitter) {
        this.nbmatlitter = nbmatlitter;
    }

    public int getNbmatscient() {
        return nbmatscient;
    }

    public void setNbmatscient(int nbmatscient) {
        this.nbmatscient = nbmatscient;
    }
    
    public int getNbcandlitter() {
        return nbcandlitter;
    }

    public void setNbcandlitter(int nbcandlitter) {
        this.nbcandlitter = nbcandlitter;
    }

    public int getNbcandscient() {
        return nbcandscient;
    }

    public void setNbcandscient(int nbcandscient) {
        this.nbcandscient = nbcandscient;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
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
        hash += (idelttranscopie != null ? idelttranscopie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elttranscriptcopie)) {
            return false;
        }
        Elttranscriptcopie other = (Elttranscriptcopie) object;
        if ((this.idelttranscopie == null && other.idelttranscopie != null) || (this.idelttranscopie != null && !this.idelttranscopie.equals(other.idelttranscopie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Elttranscriptecopie[ idelttranscopie=" + idelttranscopie + " ]";
    }
    
}
