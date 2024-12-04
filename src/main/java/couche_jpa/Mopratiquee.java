
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
@Table(name = "mopratiquee")
public class Mopratiquee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmoprate")
    private Integer idmoprate;
    @Basic(optional = false)
    @Column(name = "coutcand")
    private int coutcand;
    @Basic(optional = false)
    @Column(name = "coutposte")
    private int coutposte;
    @Basic(optional = false)
    @Column(name = "nbpostes")
    private int nbpostes;
    @Basic(optional = false)
    @Column(name = "forfait")
    private int forfait;
    @Basic(optional = false)
    @Column(name = "coutamort")
    private int coutamort;
    @JoinColumn(name = "souscentreprat_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentreprat;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Mopratiquee() {
    }

    public Mopratiquee(Integer idmoprate) {
        this.idmoprate = idmoprate;
    }
    
    public Mopratiquee(Souscentre souscentre,Souscentre souscentreprat,Groupe groupe,Session session,int coutcand, int coutposte, int nbpostes, int forfait, int coutamort) {
        this.souscentre = souscentre;
        this.souscentreprat = souscentreprat;
        this.groupe = groupe;
        this.session = session;
        this.coutcand = coutcand;
        this.coutposte = coutposte;
        this.nbpostes = nbpostes;
        this.forfait = forfait;
        this.coutamort = coutamort;
    }

    public Integer getIdmoprate() {
        return idmoprate;
    }

    public void setIdmoprate(Integer idmoprate) {
        this.idmoprate = idmoprate;
    }

    public int getCoutcand() {
        return coutcand;
    }

    public void setCoutcand(int coutcand) {
        this.coutcand = coutcand;
    }

    public int getCoutposte() {
        return coutposte;
    }

    public void setCoutposte(int coutposte) {
        this.coutposte = coutposte;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public int getForfait() {
        return forfait;
    }

    public void setForfait(int forfait) {
        this.forfait = forfait;
    }

    public int getCoutamort() {
        return coutamort;
    }

    public void setCoutamort(int coutamort) {
        this.coutamort = coutamort;
    }

    public Souscentre getSouscentreprat() {
        return souscentreprat;
    }

    public void setSouscentreprat(Souscentre souscentreprat) {
        this.souscentreprat = souscentreprat;
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
        hash += (idmoprate != null ? idmoprate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mopratiquee)) {
            return false;
        }
        Mopratiquee other = (Mopratiquee) object;
        if ((this.idmoprate == null && other.idmoprate != null) || (this.idmoprate != null && !this.idmoprate.equals(other.idmoprate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Mopratiquee[ idmoprate=" + idmoprate + " ]";
    }
    
}
