
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
@Table(name = "eltcorrecttechsecret")
public class Eltcorrecttechsecret implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltcortechsec")
    private Integer ideltcortechsec;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @Basic(optional = false)
    @Column(name = "nbchefsal")
    private int nbchefsal;
    @JoinColumn(name = "ponderation_id", referencedColumnName = "idpond")
    @ManyToOne(optional = false)
    private Ponderation ponderation;
    @JoinColumn(name = "secretariat_id", referencedColumnName = "idsec")
    @ManyToOne(optional = false)
    private Secretariat secretariat;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Eltcorrecttechsecret() {
    }

    public Eltcorrecttechsecret(Integer ideltcortechsec) {
        this.ideltcortechsec = ideltcortechsec;
    }

    public Eltcorrecttechsecret(int nbchefsal, int effectif,Ponderation ponderation,Session session,Secretariat secretariat) {
        this.nbchefsal = nbchefsal;
        this.effectif = effectif;
        this.ponderation=ponderation;
        this.session=session;
        this.secretariat=secretariat;
    }

    public Integer getIdeltcortechsec() {
        return ideltcortechsec;
    }

    public void setIdeltcortechsec(Integer ideltcortechsec) {
        this.ideltcortechsec = ideltcortechsec;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public int getNbchefsal() {
        return nbchefsal;
    }

    public void setNbchefsal(int nbchefsal) {
        this.nbchefsal = nbchefsal;
    }

    public Ponderation getPonderation() {
        return ponderation;
    }

    public void setPonderationId(Ponderation ponderation) {
        this.ponderation = ponderation;
    }

    public Secretariat getSecretariat() {
        return secretariat;
    }

    public void setSecretariat(Secretariat secretariat) {
        this.secretariat = secretariat;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideltcortechsec != null ? ideltcortechsec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltcorrecttechsecret)) {
            return false;
        }
        Eltcorrecttechsecret other = (Eltcorrecttechsecret) object;
        if ((this.ideltcortechsec == null && other.ideltcortechsec != null) || (this.ideltcortechsec != null && !this.ideltcortechsec.equals(other.ideltcortechsec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltcorrecttechsecret[ ideltcortechsec=" + ideltcortechsec + " ]";
    }
    
}
