
package couche_jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "examen")
public class Examen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idexam")
    private Integer idexam;
    @Basic(optional = false)
    @Column(name = "nomexam")
    private String nomexam;
    @Basic(optional = false)
    @Column(name = "sigle")
    private String sigle;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "nbepreuvecom")
    private int nbepreuvecom;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "niveau")
    private String niveau;

    public Examen() {
    }

    public Examen(Integer idexam) {
        this.idexam = idexam;
    }

    public Examen(Integer idexam, String nomexam, String sigle, int version, int nbepreuvecom) {
        this.idexam = idexam;
        this.nomexam = nomexam;
        this.sigle = sigle;
        this.version = version;
        this.nbepreuvecom = nbepreuvecom;
    }

    public Examen(String nomexam, String sigle, int nbepreuvecom,String type,String niveau) {
        this.nomexam = nomexam;
        this.sigle = sigle;
        this.nbepreuvecom = nbepreuvecom;
        this.type=type;
        this.niveau=niveau;
    }
    
    public Integer getIdexam() {
        return idexam;
    }

    public void setIdexam(Integer idexam) {
        this.idexam = idexam;
    }

    public String getNomexam() {
        return nomexam;
    }

    public void setNomexam(String nomexam) {
        this.nomexam = nomexam;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getNbepreuvecom() {
        return nbepreuvecom;
    }

    public void setNbepreuvecom(int nbepreuvecom) {
        this.nbepreuvecom = nbepreuvecom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idexam != null ? idexam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Examen)) {
            return false;
        }
        Examen other = (Examen) object;
        if ((this.idexam == null && other.idexam != null) || (this.idexam != null && !this.idexam.equals(other.idexam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Examen[ idexam=" + idexam + " ]";
    }    
}
