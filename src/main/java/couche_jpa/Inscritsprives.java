
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
@Table(name = "inscritsprives")
public class Inscritsprives implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinspriv")
    private Integer idinspriv;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Inscritsprives() {
    }

    public Inscritsprives(Integer idinspriv) {
        this.idinspriv = idinspriv;
    }

    public Inscritsprives(Souscentre souscentre,Groupe groupe,Session session, int effectif) {
        this.souscentre = souscentre;
        this.groupe = groupe;
        this.session = session;
        this.effectif = effectif;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public Integer getIdinspriv() {
        return idinspriv;
    }

    public void setIdinspriv(Integer idinspriv) {
        this.idinspriv = idinspriv;
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
        hash += (idinspriv != null ? idinspriv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscritsprives)) {
            return false;
        }
        Inscritsprives other = (Inscritsprives) object;
        if ((this.idinspriv == null && other.idinspriv != null) || (this.idinspriv != null && !this.idinspriv.equals(other.idinspriv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Inscritsprives[ idinspriv=" + idinspriv + " ]";
    }
    
}
