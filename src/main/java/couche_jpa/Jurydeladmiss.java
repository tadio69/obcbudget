
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
@Table(name = "jurydeladmiss")
public class Jurydeladmiss implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjudelad")
    private Integer idjudelad;
    @Basic(optional = false)
    @Column(name = "nbmbres")
    private int nbmbres;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @Basic(optional = false)
    @Column(name = "nbpresid")
    private int nbpresid;
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

    public Jurydeladmiss() {
    }

    public Jurydeladmiss(Integer idjudelad) {
        this.idjudelad = idjudelad;
    }

    public Jurydeladmiss(Centre centre,Groupe groupe, Session session,Sousfamille sousfamille, int nbmbres, int effectif,int nbpresid) {
        this.centre = centre;
        this.groupe = groupe;
        this.session = session;
        this.sousfamille = sousfamille;
        this.nbmbres = nbmbres;
        this.effectif = effectif;
        this.nbpresid = nbpresid;
    }

    public Integer getIdjudelad() {
        return idjudelad;
    }

    public void setIdjudelad(Integer idjudelad) {
        this.idjudelad = idjudelad;
    }

    public int getNbmbres() {
        return nbmbres;
    }

    public void setNbmbres(int nbmbres) {
        this.nbmbres = nbmbres;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
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

    public int getNbpresid() {
        return nbpresid;
    }

    public void setNbpresid(int nbpresid) {
        this.nbpresid = nbpresid;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjudelad != null ? idjudelad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jurydeladmiss)) {
            return false;
        }
        Jurydeladmiss other = (Jurydeladmiss) object;
        if ((this.idjudelad == null && other.idjudelad != null) || (this.idjudelad != null && !this.idjudelad.equals(other.idjudelad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Jurydeladmiss[ idjudelad=" + idjudelad + " ]";
    }
    
}
