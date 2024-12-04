
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
@Table(name = "combinetout")
public class Combinetout implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcombto")
    private Integer idcombto;
    @Basic(optional = false)
    @Column(name = "numprat")
    private int numprat;
    @Basic(optional = false)
    @Column(name = "nbpart")
    private int nbpart;
    @JoinColumn(name = "epreuve_id", referencedColumnName = "idep")
    @ManyToOne(optional = false)
    private Epreuve epreuve;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Combinetout() {
    }

    public Combinetout(Integer idcombto) {
        this.idcombto = idcombto;
    }

    public Combinetout(Groupe groupe, Session session, Epreuve epreuve, int numprat, int nbpart) {
        this.groupe = groupe;
        this.session = session;
        this.epreuve = epreuve;
        this.numprat = numprat;
        this.nbpart = nbpart;
    }

    public Integer getIdcombto() {
        return idcombto;
    }

    public void setIdcombto(Integer idcombto) {
        this.idcombto = idcombto;
    }

    public int getNumprat() {
        return numprat;
    }

    public void setNumprat(int numprat) {
        this.numprat = numprat;
    }

    public int getNbpart() {
        return nbpart;
    }

    public void setNbpart(int nbpart) {
        this.nbpart = nbpart;
    }

    public Epreuve getEpreuve() {
        return epreuve;
    }

    public void setEpreuve(Epreuve epreuve) {
        this.epreuve = epreuve;
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
        hash += (idcombto != null ? idcombto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Combinetout)) {
            return false;
        }
        Combinetout other = (Combinetout) object;
        if ((this.idcombto == null && other.idcombto != null) || (this.idcombto != null && !this.idcombto.equals(other.idcombto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Combinetout[ idcombto=" + idcombto + " ]";
    }
    
}
