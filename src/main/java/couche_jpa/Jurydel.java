
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
@Table(name = "jurydel")
public class Jurydel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjudel")
    private Integer idjudel;
    @Basic(optional = false)
    @Column(name = "nbjurydel")
    private int nbjurydel;
    @JoinColumn(name = "centre_id", referencedColumnName = "idcent")
    @ManyToOne(optional = false)
    private Centre centre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "sousfamille_id", referencedColumnName = "idsousfam")
    @ManyToOne(optional = false)
    private Sousfamille sousfamille;

    public Jurydel() {
    }

    public Jurydel(Integer idjudel) {
        this.idjudel = idjudel;
    }

    public Jurydel(int nbjurydel,Centre centre,Groupe groupe,Session session,Sousfamille sousfamille) {
        this.centre = centre;
        this.nbjurydel = nbjurydel;
        this.groupe=groupe;
        this.session=session;
        this.sousfamille=sousfamille;
    }

    public Integer getIdjudel() {
        return idjudel;
    }

    public void setIdjudel(Integer idjudel) {
        this.idjudel = idjudel;
    }

    public int getNbjurydel() {
        return nbjurydel;
    }

    public void setNbjurydel(int nbjurydel) {
        this.nbjurydel = nbjurydel;
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

    public Sousfamille getSousfamille() {
        return sousfamille;
    }

    public void setSousfamille(Sousfamille sousfamille) {
        this.sousfamille = sousfamille;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjudel != null ? idjudel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jurydel)) {
            return false;
        }
        Jurydel other = (Jurydel) object;
        if ((this.idjudel == null && other.idjudel != null) || (this.idjudel != null && !this.idjudel.equals(other.idjudel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Jurydel[ idjudel=" + idjudel + " ]";
    }
    
}
