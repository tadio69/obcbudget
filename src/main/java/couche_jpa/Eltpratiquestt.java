
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
@Table(name = "eltpratiquestt")
public class Eltpratiquestt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltpratstt")
    private Integer ideltpratstt;
    @Basic(optional = false)
    @Column(name = "nbvac")
    private int nbvac;
    @Basic(optional = false)
    @Column(name = "nbchefsal")
    private int nbchefsal;
    @Basic(optional = false)
    @Column(name = "nbexamin")
    private int nbexamin;
    @Basic(optional = false)
    @Column(name = "nbepreuves")
    private int nbepreuves;
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

    public Eltpratiquestt() {
    }

    public Eltpratiquestt(Integer ideltpratstt) {
        this.ideltpratstt = ideltpratstt;
    }

    public Eltpratiquestt(Souscentre souscentre,Session session,Option option,Groupe groupe,int nbvac, int nbchefsal, int nbexamin, int nbepreuves) {
        this.souscentre = souscentre;
        this.session = session;
        this.option = option;
        this.groupe = groupe;
        this.nbvac = nbvac;
        this.nbchefsal = nbchefsal;
        this.nbexamin = nbexamin;
        this.nbepreuves = nbepreuves;
    }

    public Integer getIdeltpratstt() {
        return ideltpratstt;
    }

    public void setIdeltpratstt(Integer ideltpratstt) {
        this.ideltpratstt = ideltpratstt;
    }

    public int getNbvac() {
        return nbvac;
    }

    public void setNbvac(int nbvac) {
        this.nbvac = nbvac;
    }

    public int getNbchefsal() {
        return nbchefsal;
    }

    public void setNbchefsal(int nbchefsal) {
        this.nbchefsal = nbchefsal;
    }

    public int getNbexamin() {
        return nbexamin;
    }

    public void setNbexamin(int nbexamin) {
        this.nbexamin = nbexamin;
    }

    public int getNbepreuves() {
        return nbepreuves;
    }

    public void setNbepreuves(int nbepreuves) {
        this.nbepreuves = nbepreuves;
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
        hash += (ideltpratstt != null ? ideltpratstt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltpratiquestt)) {
            return false;
        }
        Eltpratiquestt other = (Eltpratiquestt) object;
        if ((this.ideltpratstt == null && other.ideltpratstt != null) || (this.ideltpratstt != null && !this.ideltpratstt.equals(other.ideltpratstt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltpratiquestt[ ideltpratstt=" + ideltpratstt + " ]";
    }
    
}
