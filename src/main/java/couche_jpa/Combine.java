
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
@Table(name = "combine")

public class Combine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcomb")
    private Integer idcomb;
    @Basic(optional = false)
    @Column(name = "numprat")
    private int numprat;
    @Basic(optional = false)
    @Column(name = "nbpart")
    private int nbpart;
    @Basic(optional = false)
    @Column(name = "exclus")
    private boolean exclus;
    @JoinColumn(name = "epreuve_id", referencedColumnName = "idep")
    @ManyToOne(optional = false)
    private Epreuve epreuve;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Combine() {
    }

    public Combine(Groupe groupe, Epreuve epreuve, Session session,Option option,int numprat, int nbpart, boolean exclus) {
        this.numprat = numprat;
        this.nbpart = nbpart;
        this.exclus = exclus;
        this.epreuve = epreuve;
        this.groupe = groupe;
        this.option = option;
        this.session = session;
    }

    public Integer getIdcomb() {
        return idcomb;
    }

    public void setIdcomb(Integer idcomb) {
        this.idcomb = idcomb;
    }

    public int getNumprat() {
        return numprat;
    }

    public void setNumprat(int numprat) {
        this.numprat = numprat;
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

    public int getNbpart() {
        return nbpart;
    }

    public void setNbpart(int nbpart) {
        this.nbpart = nbpart;
    }

    public boolean isExclus() {
        return exclus;
    }

    public void setExclus(boolean exclus) {
        this.exclus = exclus;
    }   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomb != null ? idcomb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Combine)) {
            return false;
        }
        Combine other = (Combine) object;
        if ((this.idcomb == null && other.idcomb != null) || (this.idcomb != null && !this.idcomb.equals(other.idcomb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Combine[ idcomb=" + idcomb + " ]";
    }
    
}
