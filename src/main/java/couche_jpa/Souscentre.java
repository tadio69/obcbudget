
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "souscentre")
public class Souscentre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsouscent")
    private Integer idsouscent;
    @Basic(optional = false)
    @Column(name = "nomsouscent")
    private String nomsouscent;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "etab_id", referencedColumnName = "idetab")
    @ManyToOne(optional = false)
    private Etablissement etablissement;
    @Basic(optional = false)
    @Column(name = "deficients")
    private boolean deficients;
    @Column(name = "chinita")
    private Boolean chinita;
    

    public Souscentre() {
    }

    public Souscentre(Integer idsouscent) {
        this.idsouscent = idsouscent;
    }

    public Souscentre(Integer idsouscent, String nomsouscent, int version) {
        this.idsouscent = idsouscent;
        this.nomsouscent = nomsouscent;
        this.version = version;
    }
    
    public Souscentre(String nomsouscent, Etablissement etablissement,boolean deficients,Boolean chinita) {
        this.nomsouscent = nomsouscent;
        this.etablissement = etablissement;
        this.deficients=deficients;
        this.chinita=chinita;
    }

    public Integer getIdsouscent() {
        return idsouscent;
    }

    public void setIdsouscent(Integer idsouscent) {
        this.idsouscent = idsouscent;
    }

    public String getNomsouscent() {
        return nomsouscent;
    }

    public void setNomsouscent(String nomsouscent) {
        this.nomsouscent = nomsouscent;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsouscent != null ? idsouscent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Souscentre)) {
            return false;
        }
        Souscentre other = (Souscentre) object;
        if ((this.idsouscent == null && other.idsouscent != null) || (this.idsouscent != null && !this.idsouscent.equals(other.idsouscent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Souscentre[ idsouscent=" + idsouscent + " ]";
    }

    public boolean getDeficients() {
        return deficients;
    }

    public void setDeficients(boolean deficients) {
        this.deficients = deficients;
    }

    public Boolean getChinita() {
        return chinita;
    }

    public void setChinita(Boolean chinita) {
        this.chinita = chinita;
    }
}
