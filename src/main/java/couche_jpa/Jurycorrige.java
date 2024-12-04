
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
@Table(name = "jurycorrige")
public class Jurycorrige implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjurycor")
    private Integer idjurycor;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    @JoinColumn(name = "sousfamille_id", referencedColumnName = "idsousfam")
    @ManyToOne(optional = false)
    private Sousfamille sousfamille;
    @Basic(optional = false)
    @Column(name = "nbjury")
    private int nbjury;

    public Jurycorrige() {
    }

    public Jurycorrige(Integer idjurycor) {
        this.idjurycor = idjurycor;
    }

    public Jurycorrige(Souscentre souscentre, int effectif,Groupe groupe,Sousfamille sousfamille,Session session,int nbjury) {
        this.souscentre = souscentre;
        this.effectif = effectif;
        this.groupe = groupe;
        this.sousfamille = sousfamille;
        this.session = session;
        this.nbjury=nbjury;
    }

    public Integer getIdjurycor() {
        return idjurycor;
    }

    public void setIdjurycor(Integer idjurycor) {
        this.idjurycor = idjurycor;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
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

    public Sousfamille getSousfamille() {
        return sousfamille;
    }

    public void setSousfamille(Sousfamille sousfamille) {
        this.sousfamille = sousfamille;
    }

    public int getNbjury() {
        return nbjury;
    }

    public void setNbjury(int nbjury) {
        this.nbjury = nbjury;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjurycor != null ? idjurycor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jurycorrige)) {
            return false;
        }
        Jurycorrige other = (Jurycorrige) object;
        if ((this.idjurycor == null && other.idjurycor != null) || (this.idjurycor != null && !this.idjurycor.equals(other.idjurycor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Jurycorrige[ idjurycor=" + idjurycor + " ]";
    }
    
}
