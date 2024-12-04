
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
@Table(name = "eltcmpratique2sansnomsecret")
public class Eltcmpratique2sansnomsecret implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "duree")
    private int duree;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "secretariat_id", referencedColumnName = "idsec")
    @ManyToOne(optional = false)
    private Secretariat secretariat;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Eltcmpratique2sansnomsecret() {
    }

    public Eltcmpratique2sansnomsecret(Integer id) {
        this.id = id;
    }

    public Eltcmpratique2sansnomsecret(Groupe groupe, Secretariat secretariat, Session session, int duree) {
        this.groupe = groupe;
        this.secretariat = secretariat;
        this.session = session;
        this.duree = duree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltcmpratique2sansnomsecret)) {
            return false;
        }
        Eltcmpratique2sansnomsecret other = (Eltcmpratique2sansnomsecret) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltcmpratique2sansnomsecret[ id=" + id + " ]";
    }
    
}
