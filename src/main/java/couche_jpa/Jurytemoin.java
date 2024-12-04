
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
 * @author famille chijou
 */
@Entity
@Table(name = "jurytemoin")
public class Jurytemoin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjutem")
    private Integer idjutem;
    @Basic(optional = false)
    @Column(name = "nbjurytemoin")
    private int nbjurytemoin;
    @JoinColumn(name = "centre_id", referencedColumnName = "idcent")
    @ManyToOne(optional = false)
    private Centre centre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Jurytemoin() {
    }

    public Jurytemoin(Integer idjutem) {
        this.idjutem = idjutem;
    }

    public Jurytemoin(int nbjurytemoin,Centre centre,Groupe groupe,Session session) {
        this.centre = centre;
        this.nbjurytemoin = nbjurytemoin;
        this.groupe=groupe;
        this.session=session;
    }

    public Integer getIdjutem() {
        return idjutem;
    }

    public void setIdjutem(Integer idjutem) {
        this.idjutem = idjutem;
    }

    public int getNbjurytemoin() {
        return nbjurytemoin;
    }

    public void setNbjurytemoin(int nbjurytemoin) {
        this.nbjurytemoin = nbjurytemoin;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjutem != null ? idjutem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jurytemoin)) {
            return false;
        }
        Jurytemoin other = (Jurytemoin) object;
        if ((this.idjutem == null && other.idjutem != null) || (this.idjutem != null && !this.idjutem.equals(other.idjutem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Jurytemoin[ idjutem=" + idjutem + " ]";
    }
    
}
