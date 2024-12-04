
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

/**
 *
 * @author famille chijou
 */
@Entity
@Table(name = "centrebilletage")
public class Centrebilletage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcentrebill")
    private Integer idcentrebill;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "niveau")
    private String niveau;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "dres")
    private boolean dres;
    @Basic(optional = false)
    @Column(name = "ddes")
    private boolean ddes;
    @JoinColumn(name = "etablissement_id", referencedColumnName = "idetab")
    @ManyToOne(optional = false)
    private Etablissement etablissement;//qui abrite le centre de billetage

    public Centrebilletage() {
    }

    public Centrebilletage(Integer idcentrebill) {
        this.idcentrebill = idcentrebill;
    }

    public Centrebilletage(Etablissement etablissement, String niveau, String type,boolean dres, boolean ddes) {
        this.etablissement = etablissement;
        this.type = type;
        this.niveau = niveau;
        this.dres = dres;
        this.ddes = ddes;
    }

    public Integer getIdcentrebill() {
        return idcentrebill;
    }

    public void setIdcentrebill(Integer idcentrebill) {
        this.idcentrebill = idcentrebill;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean getDres() {
        return dres;
    }

    public void setDres(boolean dres) {
        this.dres = dres;
    }

    public boolean getDdes() {
        return ddes;
    }

    public void setDdes(boolean ddes) {
        this.ddes = ddes;
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
        hash += (idcentrebill != null ? idcentrebill.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centrebilletage)) {
            return false;
        }
        Centrebilletage other = (Centrebilletage) object;
        if ((this.idcentrebill == null && other.idcentrebill != null) || (this.idcentrebill != null && !this.idcentrebill.equals(other.idcentrebill))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Centrebilletage[ idcentrebill=" + idcentrebill + " ]";
    }    
}
