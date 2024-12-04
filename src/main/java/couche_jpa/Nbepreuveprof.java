
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
@Table(name = "nbepreuveprof")
public class Nbepreuveprof implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnbepprof")
    private Integer idnbepprof;
    @Basic(optional = false)
    @Column(name = "nbprofecrit")
    private int nbprofecrit;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "examen_id", referencedColumnName = "idexam")
    @ManyToOne(optional = false)
    private Examen examen;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;
    @Basic(optional = false)
    @Column(name = "nbprofpratique1")
    private int nbprofpratique1;
    @Basic(optional = false)
    @Column(name = "nbprofpratique2")
    private int nbprofpratique2;
    

    public Nbepreuveprof() {
    }

    public Nbepreuveprof(Integer idnbepprof) {
        this.idnbepprof = idnbepprof;
    }

    public Nbepreuveprof(Integer idnbepprof, int nbprofecrit,int nbprofpratique1,int nbprofpratique2, int version) {
        this.idnbepprof = idnbepprof;
        this.nbprofecrit = nbprofecrit;
        this.nbprofpratique1 = nbprofpratique1;
        this.nbprofpratique2 = nbprofpratique2;
        this.version = version;
    }

    public Nbepreuveprof(Examen examen,Option option,int nbprofecrit,int nbprofpratique1,int nbprofpratique2) {
        this.examen = examen;
        this.option = option;
        this.nbprofecrit = nbprofecrit;
        this.nbprofpratique1 = nbprofpratique1; 
        this.nbprofpratique2 = nbprofpratique2;
    }
    
    public Integer getIdnbepprof() {
        return idnbepprof;
    }

    public void setIdnbepprof(Integer idnbepprof) {
        this.idnbepprof = idnbepprof;
    }

    public int getNbprofecrit() {
        return nbprofecrit;
    }

    public void setNbprofecrit(int nbprofecrit) {
        this.nbprofecrit = nbprofecrit;
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

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnbepprof != null ? idnbepprof.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nbepreuveprof)) {
            return false;
        }
        Nbepreuveprof other = (Nbepreuveprof) object;
        if ((this.idnbepprof == null && other.idnbepprof != null) || (this.idnbepprof != null && !this.idnbepprof.equals(other.idnbepprof))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nbepreuveprof[ idnbepprof=" + idnbepprof + " ]";
    }

    public int getNbprofpratique1() {
        return nbprofpratique1;
    }

    public void setNbprofpratique1(int nbprofpratique1) {
        this.nbprofpratique1 = nbprofpratique1;
    }

    public int getNbprofpratique2() {
        return nbprofpratique2;
    }

    public void setNbprofpratique2(int nbprofpratique2) {
        this.nbprofpratique2 = nbprofpratique2;
    }
    
}
