
package couche_jpa;

import couche_jpa.Examen;
import couche_jpa.Option;
import couche_jpa.Secretariat;
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

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "statsecretariat")
public class Statsecretariat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstatsec")
    private Integer idstatsec;
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
    @JoinColumn(name = "secretariat_id", referencedColumnName = "idsec")
    @ManyToOne(optional = false)
    private Secretariat secretariat;

    public Statsecretariat() {
    }

    public Statsecretariat(Integer idstatsec) {
        this.idstatsec = idstatsec;
    }

    public Statsecretariat(Secretariat secretariat, Examen examen,Option option, int nombre) {
        this.secretariat = secretariat;
        this.examen = examen;
        this.option = option;
        this.nombre = nombre;
    }

    public Integer getIdstatsec() {
        return idstatsec;
    }

    public void setIdstatsec(Integer idstatsec) {
        this.idstatsec = idstatsec;
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

    public Secretariat getSecretariat() {
        return secretariat;
    }

    public void setSecretariat(Secretariat secretariat) {
        this.secretariat = secretariat;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstatsec != null ? idstatsec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statsecretariat)) {
            return false;
        }
        Statsecretariat other = (Statsecretariat) object;
        if ((this.idstatsec == null && other.idstatsec != null) || (this.idstatsec != null && !this.idstatsec.equals(other.idstatsec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_dao.Statsecretariat[ idstatsec=" + idstatsec + " ]";
    }
    
}
