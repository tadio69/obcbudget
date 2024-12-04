
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
@Table(name = "specialisation")
public class Specialisation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idspec")
    private Integer idspec;
    @JoinColumn(name = "examen_id", referencedColumnName = "idexam")
    @ManyToOne(optional = false)
    private Examen examen;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Specialisation() {
    }

    public Specialisation(Integer idspec) {
        this.idspec = idspec;
    }
    
    public Specialisation(Examen examen, Option option, Session session, Souscentre souscentre) {
        this.examen = examen;
        this.option = option;
        this.session = session;
        this.souscentre = souscentre;
    }

    public Integer getIdspec() {
        return idspec;
    }

    public void setIdspec(Integer idspec) {
        this.idspec = idspec;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
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
        hash += (idspec != null ? idspec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specialisation)) {
            return false;
        }
        Specialisation other = (Specialisation) object;
        if ((this.idspec == null && other.idspec != null) || (this.idspec != null && !this.idspec.equals(other.idspec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Specialisation[ idspec=" + idspec + " ]";
    }
    
}
