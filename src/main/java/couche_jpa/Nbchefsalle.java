
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
@Table(name = "nbchefsalle")
public class Nbchefsalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idchefsal")
    private Integer idchefsal;
    @Basic(optional = false)
    @Column(name = "nombre")
    private int nombre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Nbchefsalle() {
    }

    public Nbchefsalle(Integer idchefsal) {
        this.idchefsal = idchefsal;
    }

    public Nbchefsalle(Souscentre souscentre,int nombre,Groupe groupe,Session session) {
        this.souscentre = souscentre;
        this.nombre = nombre;
        this.groupe = groupe;
        this.session = session;
    }

    public Integer getIdchefsal() {
        return idchefsal;
    }

    public void setIdchefsal(Integer idchefsal) {
        this.idchefsal = idchefsal;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
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
        hash += (idchefsal != null ? idchefsal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbchefsalle)) {
            return false;
        }
        Nbchefsalle other = (Nbchefsalle) object;
        if ((this.idchefsal == null && other.idchefsal != null) || (this.idchefsal != null && !this.idchefsal.equals(other.idchefsal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbchefsalle[ idchefsal=" + idchefsal + " ]";
    }
    
}
