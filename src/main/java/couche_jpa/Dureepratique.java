
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
@Table(name = "dureepratique")
public class Dureepratique implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idduree")
    private Integer idduree;
    @Basic(optional = false)
    @Column(name = "duree")
    private int duree;
    @Basic(optional = false)
    @Column(name = "numprat")
    private int numprat;
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

    public Dureepratique() {
    }

    public Dureepratique(Integer idduree) {
        this.idduree = idduree;
    }

    public Dureepratique(Groupe groupe,Option option,Session session, int duree, int numprat,Souscentre souscentre) {
        this.groupe = groupe;
        this.option = option;
        this.session = session;
        this.duree = duree;
        this.numprat = numprat;
        this.souscentre=souscentre;
    }

    public Integer getIdduree() {
        return idduree;
    }

    public void setIdduree(Integer idduree) {
        this.idduree = idduree;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getNumprat() {
        return numprat;
    }

    public void setNumprat(int numprat) {
        this.numprat = numprat;
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
        hash += (idduree != null ? idduree.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dureepratique)) {
            return false;
        }
        Dureepratique other = (Dureepratique) object;
        if ((this.idduree == null && other.idduree != null) || (this.idduree != null && !this.idduree.equals(other.idduree))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Dureepratique[ idduree=" + idduree + " ]";
    }
    
}
