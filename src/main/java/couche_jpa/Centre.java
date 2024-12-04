
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
@Table(name = "centre")
public class Centre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcent")
    private Integer idcent;
    @Basic(optional = false)
    @Column(name = "nomcent")
    private String nomcent;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "arrondissement_id", referencedColumnName = "idarr")
    @ManyToOne(optional = false)
    private Arrondissement arrondissement;
    @JoinColumn(name = "etab_id", referencedColumnName = "idetab")
    @ManyToOne(optional = false)
    private Etablissement etablissement;

    public Centre() {
    }

    public Centre(Integer idcent) {
        this.idcent = idcent;
    }

    public Centre(Integer idcent, String nomcent, int version) {
        this.idcent = idcent;
        this.nomcent = nomcent;
        this.version = version;
    }

    public Centre(String nomcent,Arrondissement arrondissement,Etablissement etablissement) {
        this.nomcent = nomcent;
        this.arrondissement = arrondissement;
        this.etablissement = etablissement;
    }
    
    public Integer getIdcent() {
        return idcent;
    }

    public void setIdcent(Integer idcent) {
        this.idcent = idcent;
    }

    public String getNomcent() {
        return nomcent;
    }

    public void setNomcent(String nomcent) {
        this.nomcent = nomcent;
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

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcent != null ? idcent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centre)) {
            return false;
        }
        Centre other = (Centre) object;
        if ((this.idcent == null && other.idcent != null) || (this.idcent != null && !this.idcent.equals(other.idcent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Centre[ idcent=" + idcent + " ]";
    }
}
