
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
@Table(name = "jurypratique2")
public class Jurypratique2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjuprat2")
    private Integer idjuprat2;
    @Basic(optional = false)
    @Column(name = "nbexamin")
    private int nbexamin;
    @Basic(optional = false)
    @Column(name = "nbvac")
    private int nbvac;
    @Basic(optional = false)
    @Column(name = "nbchefatel")
    private int nbchefatel;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Jurypratique2() {
    }

    public Jurypratique2(Integer idjuprat2) {
        this.idjuprat2 = idjuprat2;
    }

    public Jurypratique2(Souscentre souscentre,Option option, int nbexamin, int nbvac, int nbchefatel,Groupe groupe,Session session) {
        this.souscentre = souscentre;
        this.option=option;
        this.nbexamin = nbexamin;
        this.nbvac = nbvac;
        this.nbchefatel = nbchefatel;
        this.groupe=groupe;
        this.session=session;
    }

    public Integer getIdjuprat2() {
        return idjuprat2;
    }

    public void setIdjuprat2(Integer idjuprat2) {
        this.idjuprat2 = idjuprat2;
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

    public int getNbchefatel() {
        return nbchefatel;
    }

    public void setNbchefatel(int nbchefatel) {
        this.nbchefatel = nbchefatel;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
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
        hash += (idjuprat2 != null ? idjuprat2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jurypratique2)) {
            return false;
        }
        Jurypratique2 other = (Jurypratique2) object;
        if ((this.idjuprat2 == null && other.idjuprat2 != null) || (this.idjuprat2 != null && !this.idjuprat2.equals(other.idjuprat2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Jurypratique2[ idjuprat2=" + idjuprat2 + " ]";
    }
    
}
