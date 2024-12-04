
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

/**
 *
 * @author famille chijou
 */
@Entity
@Table(name = "grandcentre")
public class Grandcentre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgrandcent")
    private Integer idgrandcent;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "niveau")
    private String niveau;
    @JoinColumn(name = "region_id", referencedColumnName = "idreg")
    @ManyToOne(optional = false)
    private Region region;
    @JoinColumn(name = "famille_id", referencedColumnName = "idfam")
    @ManyToOne(optional = false)
    private Famille famille;

    public Grandcentre() {
    }

    public Grandcentre(Integer idgrandcent) {
        this.idgrandcent = idgrandcent;
    }

    public Grandcentre(String nom,Region region,String niveau, String type,Famille famille) {
        this.nom = nom;
        this.type = type;
        this.niveau = niveau;
        this.region=region;
        this.famille=famille;
    }

    public Integer getIdgrandcent() {
        return idgrandcent;
    }

    public void setIdgrandcent(Integer idgrandcent) {
        this.idgrandcent = idgrandcent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgrandcent != null ? idgrandcent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grandcentre)) {
            return false;
        }
        Grandcentre other = (Grandcentre) object;
        if ((this.idgrandcent == null && other.idgrandcent != null) || (this.idgrandcent != null && !this.idgrandcent.equals(other.idgrandcent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Grandcentre[ idgrandcent=" + idgrandcent + " ]";
    }  

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }
}
