
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
@Table(name = "eltjurypratique2")
public class Eltjurypratique2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltjuprat2")
    private Integer ideltjuprat2;
    @Basic(optional = false)
    @Column(name = "nbmbresec")
    private int nbmbresec;
    @Basic(optional = false)
    @Column(name = "nbcheftrav")
    private int nbcheftrav;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @OneToOne(optional = false)
    private Souscentre souscentre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Eltjurypratique2() {
    }

    public Eltjurypratique2(Integer ideltjuprat2) {
        this.ideltjuprat2 = ideltjuprat2;
    }

    public Eltjurypratique2(Souscentre souscentre, int nbmbresec, int nbcheftrav,Groupe groupe,Session session) {
        this.souscentre = souscentre;
        this.nbmbresec = nbmbresec;
        this.nbcheftrav = nbcheftrav;
        this.groupe=groupe;
        this.session=session;
    }

    public Integer getIdeltjuprat2() {
        return ideltjuprat2;
    }

    public void setIdeltjuprat2(Integer ideltjuprat2) {
        this.ideltjuprat2 = ideltjuprat2;
    }

    public int getNbmbresec() {
        return nbmbresec;
    }

    public void setNbmbresec(int nbmbresec) {
        this.nbmbresec = nbmbresec;
    }

    public int getNbcheftrav() {
        return nbcheftrav;
    }

    public void setNbcheftrav(int nbcheftrav) {
        this.nbcheftrav = nbcheftrav;
    }

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
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
        hash += (ideltjuprat2 != null ? ideltjuprat2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltjurypratique2)) {
            return false;
        }
        Eltjurypratique2 other = (Eltjurypratique2) object;
        if ((this.ideltjuprat2 == null && other.ideltjuprat2 != null) || (this.ideltjuprat2 != null && !this.ideltjuprat2.equals(other.ideltjuprat2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltjurypratique2[ ideltjuprat2=" + ideltjuprat2 + " ]";
    }
    
}
