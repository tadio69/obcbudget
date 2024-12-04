
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
@Table(name = "eltcmpratique2sansnoms")
public class Eltcmpratique2sansnoms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltprat2sans")
    private Integer ideltprat2sans;
    @Basic(optional = false)
    @Column(name = "duree")
    private int duree;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Eltcmpratique2sansnoms() {
    }

    public Eltcmpratique2sansnoms(Integer ideltprat2sans) {
        this.ideltprat2sans = ideltprat2sans;
    }

    public Eltcmpratique2sansnoms(int duree,Groupe groupe,Session session,Souscentre souscentre) {
        this.groupe = groupe;
        this.duree = duree;
        this.session = session;
        this.souscentre = souscentre;
    }

    public Integer getIdeltprat2sans() {
        return ideltprat2sans;
    }

    public void setIdeltprat2sans(Integer ideltprat2sans) {
        this.ideltprat2sans = ideltprat2sans;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
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
        hash += (ideltprat2sans != null ? ideltprat2sans.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltcmpratique2sansnoms)) {
            return false;
        }
        Eltcmpratique2sansnoms other = (Eltcmpratique2sansnoms) object;
        if ((this.ideltprat2sans == null && other.ideltprat2sans != null) || (this.ideltprat2sans != null && !this.ideltprat2sans.equals(other.ideltprat2sans))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltcmpratique2sansnoms[ ideltprat2sans=" + ideltprat2sans + " ]";
    }
    
}
