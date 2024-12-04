
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
@Table(name = "jurycorrigesecret")
public class Jurycorrigesecret implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjurycorsec")
    private Integer idjurycorsec;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @Basic(optional = false)
    @Column(name = "nbjury")
    private int nbjury;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "secretariat_id", referencedColumnName = "idsec")
    @ManyToOne(optional = false)
    private Secretariat secretariat;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "sousfamille_id", referencedColumnName = "idsousfam")
    @ManyToOne(optional = false)
    private Sousfamille sousfamille;

    public Jurycorrigesecret() {
    }

    public Jurycorrigesecret(Integer idjurycorsec) {
        this.idjurycorsec = idjurycorsec;
    }

    public Jurycorrigesecret(Secretariat secretariat,int effectif,Groupe groupe,Sousfamille sousfamille,Session session,int nbjury) {
        this.secretariat = secretariat;
        this.effectif = effectif;
        this.groupe = groupe;
        this.sousfamille = sousfamille;
        this.session = session;
        this.nbjury=nbjury;
    }

    public Integer getIdjurycorsec() {
        return idjurycorsec;
    }

    public void setIdjurycorsec(Integer idjurycorsec) {
        this.idjurycorsec = idjurycorsec;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public int getNbjury() {
        return nbjury;
    }

    public void setNbjury(int nbjury) {
        this.nbjury = nbjury;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
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

    public Sousfamille getSousfamille() {
        return sousfamille;
    }

    public void setSousfamille(Sousfamille sousfamille) {
        this.sousfamille = sousfamille;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjurycorsec != null ? idjurycorsec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jurycorrigesecret)) {
            return false;
        }
        Jurycorrigesecret other = (Jurycorrigesecret) object;
        if ((this.idjurycorsec == null && other.idjurycorsec != null) || (this.idjurycorsec != null && !this.idjurycorsec.equals(other.idjurycorsec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Jurycorrigesecret[ idjurycorsec=" + idjurycorsec + " ]";
    }
    
}
