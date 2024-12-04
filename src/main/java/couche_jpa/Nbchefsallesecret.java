
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "nbchefsallesecret")
public class Nbchefsallesecret implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnbchefsalsec")
    private Integer idnbchefsalsec;
    @Basic(optional = false)
    @Column(name = "nombre")
    private int nombre;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "secretariat_id", referencedColumnName = "idsec")
    @ManyToOne(optional = false)
    private Secretariat secretariat;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Nbchefsallesecret() {
    }

    public Nbchefsallesecret(Integer idnbchefsalsec) {
        this.idnbchefsalsec = idnbchefsalsec;
    }

    public Nbchefsallesecret(Secretariat secretariat,int nombre,Groupe groupe,Session session) {
        this.secretariat = secretariat;
        this.nombre = nombre;
        this.groupe = groupe;
        this.session = session;
    }

    public Integer getIdnbchefsalsec() {
        return idnbchefsalsec;
    }

    public void setIdnbchefsalsec(Integer idnbchefsalsec) {
        this.idnbchefsalsec = idnbchefsalsec;
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

    public Secretariat getSecretariat() {
        return secretariat;
    }

    public void setSecretariat(Secretariat secretariat) {
        this.secretariat = secretariat;
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
        hash += (idnbchefsalsec != null ? idnbchefsalsec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbchefsallesecret)) {
            return false;
        }
        Nbchefsallesecret other = (Nbchefsallesecret) object;
        if ((this.idnbchefsalsec == null && other.idnbchefsalsec != null) || (this.idnbchefsalsec != null && !this.idnbchefsalsec.equals(other.idnbchefsalsec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbchefsallesecret[ idnbchefsalsec=" + idnbchefsalsec + " ]";
    }
    
}
