
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
@Table(name = "eltpratiquesttsecret")
public class Eltpratiquesttsecret implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nbchefsal")
    private int nbchefsal;
    @Basic(optional = false)
    @Column(name = "nbepreuves")
    private int nbepreuves;
    @Basic(optional = false)
    @Column(name = "nbexamin")
    private int nbexamin;
    @Basic(optional = false)
    @Column(name = "nbvac")
    private int nbvac;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;
    @JoinColumn(name = "secretariat_id", referencedColumnName = "idsec")
    @ManyToOne(optional = false)
    private Secretariat secretariat;

    public Eltpratiquesttsecret() {
    }

    public Eltpratiquesttsecret(Integer id) {
        this.id = id;
    }

    public Eltpratiquesttsecret(Secretariat secretariat, Groupe groupe, Option option, int nbchefsal, int nbepreuves, int nbexamin, int nbvac) {
        this.secretariat = secretariat;
        this.groupe = groupe;
        this.option = option;
        this.nbchefsal = nbchefsal;
        this.nbepreuves = nbepreuves;
        this.nbexamin = nbexamin;
        this.nbvac = nbvac;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNbchefsal() {
        return nbchefsal;
    }

    public void setNbchefsal(int nbchefsal) {
        this.nbchefsal = nbchefsal;
    }

    public int getNbepreuves() {
        return nbepreuves;
    }

    public void setNbepreuves(int nbepreuves) {
        this.nbepreuves = nbepreuves;
    }

    public int getNbexamin() {
        return nbexamin;
    }

    public void setNbexamin(int nbexamin) {
        this.nbexamin = nbexamin;
    }

    public int getNbvac() {
        return nbvac;
    }

    public void setNbvac(int nbvac) {
        this.nbvac = nbvac;
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

    public Secretariat getSecretariat() {
        return secretariat;
    }

    public void setSecretariat(Secretariat secretariat) {
        this.secretariat = secretariat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltpratiquesttsecret)) {
            return false;
        }
        Eltpratiquesttsecret other = (Eltpratiquesttsecret) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltpratiquesttsecret[ id=" + id + " ]";
    }
    
}
