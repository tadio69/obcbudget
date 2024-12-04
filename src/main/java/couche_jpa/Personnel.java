
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
@Table(name = "personnel")
public class Personnel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpers")
    private Integer idpers;
    @Basic(optional = false)
    @Column(name = "nompers")
    private String nompers;
    @Column(name = "prenom")
    private String prenom;
    @JoinColumn(name = "fonction_id", referencedColumnName = "idfonct")
    @ManyToOne(optional = false)
    private Fonction fonction;
    @JoinColumn(name = "arrondissement_id", referencedColumnName = "idarr")
    @ManyToOne(optional = false)
    private Arrondissement arrondissement;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "structure")
    private String structure;

    public Personnel() {
    }

    public Personnel(Integer idpers) {
        this.idpers = idpers;
    }

    public Personnel(Integer idpers, String nompers, Fonction fonction) {
        this.idpers = idpers;
        this.nompers = nompers;
        this.fonction = fonction;
    }
    
    public Personnel(String nompers, String prenom,String structure,Fonction fonction,Arrondissement arrondissement) {
        this.nompers = nompers;
        this.prenom = prenom;
        this.fonction = fonction;
        this.arrondissement = arrondissement;
        this.structure=structure;
    }
    
    public Integer getIdpers() {
        return idpers;
    }

    public void setIdpers(Integer idpers) {
        this.idpers = idpers;
    }

    public String getNompers() {
        return nompers;
    }

    public void setNompers(String nompers) {
        this.nompers = nompers;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Arrondissement getArrondissement() {
        return arrondissement;
    }

    public void setArrondissement(Arrondissement arrondissement) {
        this.arrondissement = arrondissement;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpers != null ? idpers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personnel)) {
            return false;
        }
        Personnel other = (Personnel) object;
        if ((this.idpers == null && other.idpers != null) || (this.idpers != null && !this.idpers.equals(other.idpers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Personnel[ idpers=" + idpers + " ]";
    }
}
