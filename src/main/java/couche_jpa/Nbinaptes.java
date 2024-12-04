
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
 * @author pc
 */
@Entity
@Table(name = "nbinaptes")
public class Nbinaptes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnbinapte")
    private Integer idnbinapte;
    @Basic(optional = false)
    @Column(name = "nbfranco")
    private int nbfranco;
    @Basic(optional = false)
    @Column(name = "nbanglo")
    private int nbanglo;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Nbinaptes() {
    }

    public Nbinaptes(Integer idnbinapte) {
        this.idnbinapte = idnbinapte;
    }

    public Nbinaptes(Souscentre souscentre,Groupe groupe,Session session, int nbfranco, int nbanglo) {
        this.souscentre = souscentre;
        this.groupe = groupe;
        this.session = session;
        this.nbfranco = nbfranco;
        this.nbanglo = nbanglo;
    }

    public Integer getIdnbinapte() {
        return idnbinapte;
    }

    public void setIdnbinapte(Integer idnbinapte) {
        this.idnbinapte = idnbinapte;
    }

    public int getNbfranco() {
        return nbfranco;
    }

    public void setNbfranco(int nbfranco) {
        this.nbfranco = nbfranco;
    }

    public int getNbanglo() {
        return nbanglo;
    }

    public void setNbanglo(int nbanglo) {
        this.nbanglo = nbanglo;
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

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnbinapte != null ? idnbinapte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbinaptes)) {
            return false;
        }
        Nbinaptes other = (Nbinaptes) object;
        if ((this.idnbinapte == null && other.idnbinapte != null) || (this.idnbinapte != null && !this.idnbinapte.equals(other.idnbinapte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbinaptes[ idnbinapte=" + idnbinapte + " ]";
    }
    
}
