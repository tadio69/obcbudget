
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
@Table(name = "stataptes")
public class Stataptes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idapt")
    private Integer idapt;
    @Basic(optional = false)
    @Column(name = "nbaptes")
    private int nbaptes;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "examen_id", referencedColumnName = "idexam")
    @ManyToOne(optional = false)
    private Examen examen;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "etablissement_id", referencedColumnName = "idetab")
    @ManyToOne(optional = false)
    private Etablissement etablissement;

    public Stataptes() {
    }

    public Stataptes(Integer idapt) {
        this.idapt = idapt;
    }

    public Stataptes(Integer idapt, int nbaptes,Session session,Examen examen,Etablissement etablissement) {
        this.idapt = idapt;      
        this.nbaptes = nbaptes;
        this.session = session;
        this.examen = examen;
        this.etablissement = etablissement;
    }

    public Stataptes(int nbaptes,Session session,Examen examen,Etablissement etablissement) {
        this.nbaptes = nbaptes;
        this.session = session;
        this.examen = examen;
        this.etablissement = etablissement;
    }
    
    public Integer getIdapt() {
        return idapt;
    }

    public void setIdapt(Integer idapt) {
        this.idapt = idapt;
    }

    public int getNbaptes() {
        return nbaptes;
    }

    public void setNbaptes(int nbaptes) {
        this.nbaptes = nbaptes;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idapt != null ? idapt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stataptes)) {
            return false;
        }
        Stataptes other = (Stataptes) object;
        if ((this.idapt == null && other.idapt != null) || (this.idapt != null && !this.idapt.equals(other.idapt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Stataptes[ idapt=" + idapt + " ]";
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }
    
}
