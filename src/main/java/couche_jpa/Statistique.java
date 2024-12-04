
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
import javax.persistence.Version;


@Entity
@Table(name = "statistique")
public class Statistique implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstat")
    private Integer idstat;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "nombre")
    private int nombre;
    @JoinColumn(name = "examen_id", referencedColumnName = "idexam")
    @ManyToOne(optional = false)
    private Examen examen;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscent_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    
    public Statistique() {
    }

    public Statistique(Integer idstat) {
        this.idstat = idstat;
    }

    public Statistique(Integer idstat, int version, int nombre) {
        this.idstat = idstat;
        this.version = version;
        this.nombre = nombre;
    }
    
    public Statistique(int nombre,Examen examen,Option option,Session session,Souscentre souscentre) {
        this.nombre = nombre;
        this.examen=examen;
        this.option=option;
        this.session=session;
        this.souscentre=souscentre;
    }

    public Integer getIdstat() {
        return idstat;
    }

    public void setIdstat(Integer idstat) {
        this.idstat = idstat;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
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
        hash += (idstat != null ? idstat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statistique)) {
            return false;
        }
        Statistique other = (Statistique) object;
        if ((this.idstat == null && other.idstat != null) || (this.idstat != null && !this.idstat.equals(other.idstat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Statistique[ idstat=" + idstat + " ]";
    }
    
}
