
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
@Table(name = "nbadmissibles")
public class Nbadmissibles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnbadmiss")
    private Integer idnbadmiss;
    @Basic(optional = false)
    @Column(name = "nbadmiss")
    private int nbadmiss;
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

    public Nbadmissibles() {
    }

    public Nbadmissibles(Integer idnbadmiss) {
        this.idnbadmiss = idnbadmiss;
    }

    public Nbadmissibles(Souscentre souscentre,Session session,Groupe groupe,Option option,int nbadmiss) {
        this.souscentre = souscentre;
        this.session = session;
        this.groupe = groupe;
        this.option = option;
        this.nbadmiss = nbadmiss;
    }

    public Integer getIdnbadmiss() {
        return idnbadmiss;
    }

    public void setIdnbadmiss(Integer idnbadmiss) {
        this.idnbadmiss = idnbadmiss;
    }

    public int getNbadmiss() {
        return nbadmiss;
    }

    public void setNbadmiss(int nbadmiss) {
        this.nbadmiss = nbadmiss;
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
        hash += (idnbadmiss != null ? idnbadmiss.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbadmissibles)) {
            return false;
        }
        Nbadmissibles other = (Nbadmissibles) object;
        if ((this.idnbadmiss == null && other.idnbadmiss != null) || (this.idnbadmiss != null && !this.idnbadmiss.equals(other.idnbadmiss))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbadmissibles[ idnbadmiss=" + idnbadmiss + " ]";
    }
    
}
