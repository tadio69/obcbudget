
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
@Table(name = "eltcorrecttech")
public class Eltcorrecttech implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltcorrecttech")
    private Integer ideltcorrecttech;
    @Basic(optional = false)
    @Column(name = "nbchefsal")
    private int nbchefsal;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    @JoinColumn(name = "ponderation_id", referencedColumnName = "idpond")
    @ManyToOne(optional = false)
    private Ponderation ponderation;

    public Eltcorrecttech() {
    }

    public Eltcorrecttech(Integer ideltcorrecttech) {
        this.ideltcorrecttech = ideltcorrecttech;
    }

    public Eltcorrecttech(int nbchefsal, int effectif,Ponderation ponderation,Session session,Souscentre souscentre) {
        this.nbchefsal = nbchefsal;
        this.effectif = effectif;
        this.ponderation=ponderation;
        this.session=session;
        this.souscentre=souscentre;
    }

    public Integer getIdeltcorrecttech() {
        return ideltcorrecttech;
    }

    public void setIdeltcorrecttech(Integer ideltcorrecttech) {
        this.ideltcorrecttech = ideltcorrecttech;
    }

    public int getNbchefsal() {
        return nbchefsal;
    }

    public void setNbchefsal(int nbchefsal) {
        this.nbchefsal = nbchefsal;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
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

    public Ponderation getPonderation() {
        return ponderation;
    }

    public void setPonderation(Ponderation ponderation) {
        this.ponderation = ponderation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideltcorrecttech != null ? ideltcorrecttech.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltcorrecttech)) {
            return false;
        }
        Eltcorrecttech other = (Eltcorrecttech) object;
        if ((this.ideltcorrecttech == null && other.ideltcorrecttech != null) || (this.ideltcorrecttech != null && !this.ideltcorrecttech.equals(other.ideltcorrecttech))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltcorrecttech[ ideltcorrecttech=" + ideltcorrecttech + " ]";
    }
    
}
