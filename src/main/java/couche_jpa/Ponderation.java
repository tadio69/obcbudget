
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


@Entity
@Table(name = "ponderation")
public class Ponderation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpond")
    private Integer idpond;
    @Basic(optional = false)
    @Column(name = "nbmat")
    private int nbmat;
    @Basic(optional = false)
    @Column(name = "nature")
    private String nature;
    @Basic(optional = false)
    @Column(name = "coef")
    private double coef;
    @Column(name = "version")
    private Integer version;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "sousfamille_id", referencedColumnName = "idsousfam")
    @ManyToOne(optional = false)
    private Sousfamille sousfamille;

    public Ponderation() {
    }

    public Ponderation(Integer idpond) {
        this.idpond = idpond;
    }

    public Ponderation(double coef, int nbmat, String nature,Groupe groupe,Sousfamille sousfamille) {
        this.coef = coef;
        this.nbmat = nbmat;
        this.nature = nature;
        this.groupe=groupe;
        this.sousfamille=sousfamille;
    }

    public Integer getIdpond() {
        return idpond;
    }

    public void setIdpond(Integer idpond) {
        this.idpond = idpond;
    }


    public int getNbmat() {
        return nbmat;
    }

    public void setNbmat(int nbmat) {
        this.nbmat = nbmat;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Sousfamille getSousfamille() {
        return sousfamille;
    }

    public void setSousfamille(Sousfamille sousfamille) {
        this.sousfamille = sousfamille;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpond != null ? idpond.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ponderation)) {
            return false;
        }
        Ponderation other = (Ponderation) object;
        if ((this.idpond == null && other.idpond != null) || (this.idpond != null && !this.idpond.equals(other.idpond))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Ponderation[ idpond=" + idpond + " ]";
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }    
}
