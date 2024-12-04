
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
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "eltharmo")
public class Eltharmo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltharmo")
    private Integer ideltharmo;
    @Basic(optional = false)
    @Column(name = "nbep1")
    private int nbep1;
    @Basic(optional = false)
    @Column(name = "nbep2")
    private int nbep2;
    @Basic(optional = false)
    @Column(name = "nbep3")
    private int nbep3;
    @Basic(optional = false)
    @Column(name = "nbep4")
    private int nbep4;
    @Basic(optional = false)
    @Column(name = "nbep5")
    private int nbep5;
    @Basic(optional = false)
    @Column(name = "nbep6")
    private int nbep6;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "matiere_id", referencedColumnName = "idmat")
    @ManyToOne(optional = false)
    private Matiere matiere;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @Basic(optional = false)
    @Column(name = "deplace")
    private boolean deplace;

    public Eltharmo() {
    }

    public Eltharmo(Integer ideltharmo) {
        this.ideltharmo = ideltharmo;
    }

    public Eltharmo(Intervenant intervenant,Groupe groupe,Matiere matiere,Session session,boolean deplace, int nbep1, int nbep2, int nbep3, int nbep4, int nbep5, int nbep6) {
        this.intervenant = intervenant;
        this.groupe = groupe;
        this.matiere = matiere;
        this.session = session;
        this.deplace = deplace;
        this.nbep1 = nbep1;
        this.nbep2 = nbep2;
        this.nbep3 = nbep3;
        this.nbep4 = nbep4;
        this.nbep5 = nbep5;
        this.nbep6 = nbep6;
    }

    public Integer getIdeltharmo() {
        return ideltharmo;
    }

    public void setIdeltharmo(Integer ideltharmo) {
        this.ideltharmo = ideltharmo;
    }

    public int getNbep1() {
        return nbep1;
    }

    public void setNbep1(int nbep1) {
        this.nbep1 = nbep1;
    }

    public int getNbep2() {
        return nbep2;
    }

    public void setNbep2(int nbep2) {
        this.nbep2 = nbep2;
    }

    public int getNbep3() {
        return nbep3;
    }

    public void setNbep3(int nbep3) {
        this.nbep3 = nbep3;
    }

    public int getNbep4() {
        return nbep4;
    }

    public void setNbep4(int nbep4) {
        this.nbep4 = nbep4;
    }

    public int getNbep5() {
        return nbep5;
    }

    public void setNbep5(int nbep5) {
        this.nbep5 = nbep5;
    }

    public int getNbep6() {
        return nbep6;
    }

    public void setNbep6(int nbep6) {
        this.nbep6 = nbep6;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public boolean getDeplace() {
        return deplace;
    }

    public void setDeplace(boolean deplace) {
        this.deplace = deplace;
    }   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideltharmo != null ? ideltharmo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltharmo)) {
            return false;
        }
        Eltharmo other = (Eltharmo) object;
        if ((this.ideltharmo == null && other.ideltharmo != null) || (this.ideltharmo != null && !this.ideltharmo.equals(other.ideltharmo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltharmo[ ideltharmo=" + ideltharmo + " ]";
    }
    
}
