
package couche_jpa;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "etablissement")
public class Etablissement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idetab")
    private Integer idetab;
    @Basic(optional = false)
    @Column(name = "nometab")
    private String nometab;
    @Basic(optional = false)
    @Column(name = "secteur")
    private String secteur;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "abreviation")
    private String abreviation;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "sport")
    private boolean sport;
    @JoinColumn(name = "arrondissement_id", referencedColumnName = "idarr")
    @ManyToOne(optional = false)
    private Arrondissement arrondissement;
    

    public Etablissement() {
    }

    public Etablissement(Integer idetab) {
        this.idetab = idetab;
    }

    public Etablissement(Integer idetab, String nometab, String secteur, String type,String abreviation, int version) {
        this.idetab = idetab;
        this.nometab = nometab;
        this.secteur = secteur;
        this.type = type;
        this.abreviation=abreviation;
        this.version = version;
    }
    
    public Etablissement(String nometab, String secteur, String type,String abreviation, Arrondissement arrondissement,boolean sport) {
        this.nometab = nometab;
        this.secteur = secteur;
        this.type = type;
        this.abreviation=abreviation;
        this.arrondissement=arrondissement;
        this.sport=sport;
    }

    public Integer getIdetab() {
        return idetab;
    }

    public void setIdetab(Integer idetab) {
        this.idetab = idetab;
    }

    public String getNometab() {
        return nometab;
    }

    public void setNometab(String nometab) {
        this.nometab = nometab;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Arrondissement getArrondissement() {
        return arrondissement;
    }

    public void setArrondissement(Arrondissement arrondissement) {
        this.arrondissement = arrondissement;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idetab != null ? idetab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etablissement)) {
            return false;
        }
        Etablissement other = (Etablissement) object;
        if ((this.idetab == null && other.idetab != null) || (this.idetab != null && !this.idetab.equals(other.idetab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Etablissement[ idetab=" + idetab + " ]";
    }

    public boolean getSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }
}
