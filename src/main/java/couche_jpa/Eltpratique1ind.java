
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
@Table(name = "eltpratique1ind")
public class Eltpratique1ind implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltprat1ind")
    private Integer ideltprat1ind;
    @Basic(optional = false)
    @Column(name = "nbsal")
    private int nbsal;
    @Basic(optional = false)
    @Column(name = "nbepreuve")
    private int nbepreuve;
    @Basic(optional = false)
    @Column(name = "nbexaminprat")
    private int nbexaminprat;
    @Basic(optional = false)
    @Column(name = "nbexaminrapp")
    private int nbexaminrapp;
    @Basic(optional = false)
    @Column(name = "nbvacprat")
    private int nbvacprat;
    @Basic(optional = false)
    @Column(name = "nbvacrapp")
    private int nbvacrapp;
    @Basic(optional = false)
    @Column(name = "nbchefsalprat")
    private int nbchefsalprat;
    @Basic(optional = false)
    @Column(name = "nbchefsalrapp")
    private int nbchefsalrapp;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Eltpratique1ind() {
    }

    public Eltpratique1ind(Integer ideltprat1ind) {
        this.ideltprat1ind = ideltprat1ind;
    }

    public Eltpratique1ind(Souscentre souscentre, Groupe groupe,Session session, Option option,int nbsal, int nbepreuve, int nbexaminprat, int nbexaminrapp, int nbvacprat, int nbvacrapp, int nbchefsalprat, int nbchefsalrapp) {
        this.souscentre = souscentre;
        this.groupe = groupe;
        this.session = session;
        this.option = option;
        this.nbsal = nbsal;
        this.nbepreuve = nbepreuve;
        this.nbexaminprat = nbexaminprat;
        this.nbexaminrapp = nbexaminrapp;
        this.nbvacprat = nbvacprat;
        this.nbvacrapp = nbvacrapp;
        this.nbchefsalprat = nbchefsalprat;
        this.nbchefsalrapp = nbchefsalrapp;
    }

    public Integer getIdeltprat1ind() {
        return ideltprat1ind;
    }

    public void setIdeltprat1ind(Integer ideltprat1ind) {
        this.ideltprat1ind = ideltprat1ind;
    }

    public int getNbsal() {
        return nbsal;
    }

    public void setNbsal(int nbsal) {
        this.nbsal = nbsal;
    }

    public int getNbepreuve() {
        return nbepreuve;
    }

    public void setNbepreuve(int nbepreuve) {
        this.nbepreuve = nbepreuve;
    }

    public int getNbexaminprat() {
        return nbexaminprat;
    }

    public void setNbexaminprat(int nbexaminprat) {
        this.nbexaminprat = nbexaminprat;
    }

    public int getNbexaminrapp() {
        return nbexaminrapp;
    }

    public void setNbexaminrapp(int nbexaminrapp) {
        this.nbexaminrapp = nbexaminrapp;
    }

    public int getNbvacprat() {
        return nbvacprat;
    }

    public void setNbvacprat(int nbvacprat) {
        this.nbvacprat = nbvacprat;
    }

    public int getNbvacrapp() {
        return nbvacrapp;
    }

    public void setNbvacrapp(int nbvacrapp) {
        this.nbvacrapp = nbvacrapp;
    }

    public int getNbchefsalprat() {
        return nbchefsalprat;
    }

    public void setNbchefsalprat(int nbchefsalprat) {
        this.nbchefsalprat = nbchefsalprat;
    }

    public int getNbchefsalrapp() {
        return nbchefsalrapp;
    }

    public void setNbchefsalrapp(int nbchefsalrapp) {
        this.nbchefsalrapp = nbchefsalrapp;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
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
        hash += (ideltprat1ind != null ? ideltprat1ind.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltpratique1ind)) {
            return false;
        }
        Eltpratique1ind other = (Eltpratique1ind) object;
        if ((this.ideltprat1ind == null && other.ideltprat1ind != null) || (this.ideltprat1ind != null && !this.ideltprat1ind.equals(other.ideltprat1ind))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltpratique1ind[ ideltprat1ind=" + ideltprat1ind + " ]";
    }
    
}
