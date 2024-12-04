
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
@Table(name = "scentaplus")
public class Scentaplus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idplus")
    private Integer idplus;
    @JoinColumn(name = "examen_id", referencedColumnName = "idexam")
    @ManyToOne(optional = false)
    private Examen examen;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Scentaplus() {
    }

    public Scentaplus(Integer idplus) {
        this.idplus = idplus;
    }

    public Scentaplus(Session session,Examen examen,Souscentre souscentre) {
        this.examen = examen;
        this.session = session;
        this.souscentre = souscentre;
    }
    
    public Integer getIdplus() {
        return idplus;
    }

    public void setIdplus(Integer idplus) {
        this.idplus = idplus;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
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
        hash += (idplus != null ? idplus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Scentaplus)) {
            return false;
        }
        Scentaplus other = (Scentaplus) object;
        if ((this.idplus == null && other.idplus != null) || (this.idplus != null && !this.idplus.equals(other.idplus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Scentaplus[ idplus=" + idplus + " ]";
    }
    
}
