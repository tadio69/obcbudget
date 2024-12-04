
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
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "deplacepratique")
public class Deplacepratique implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddeplprat")
    private Integer iddeplprat;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @Basic(optional = false)
    @Column(name = "numprat")
    private int numprat;
    @Basic(optional = false)
    @Column(name = "sansfrais")
    private boolean sansfrais;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;
    @JoinColumn(name = "matiere_id", referencedColumnName = "idmat")
    @ManyToOne(optional = false)
    private Matiere matiere;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;

    public Deplacepratique() {
    }

    public Deplacepratique(Integer iddeplprat) {
        this.iddeplprat = iddeplprat;
    }

    public Deplacepratique(Intervenant intervenant,Matiere matiere,Option option,int effectif, int numprat,boolean sansfrais) {
        this.intervenant = intervenant;
        this.matiere = matiere;
        this.option = option;
        this.effectif = effectif;
        this.numprat = numprat;
        this.sansfrais = sansfrais;
    }

    public Integer getIddeplprat() {
        return iddeplprat;
    }

    public void setIddeplprat(Integer iddeplprat) {
        this.iddeplprat = iddeplprat;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public int getNumprat() {
        return numprat;
    }

    public void setNumprat(int numprat) {
        this.numprat = numprat;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public boolean isSansfrais() {
        return sansfrais;
    }

    public void setSansfrais(boolean sansfrais) {
        this.sansfrais = sansfrais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddeplprat != null ? iddeplprat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deplacepratique)) {
            return false;
        }
        Deplacepratique other = (Deplacepratique) object;
        if ((this.iddeplprat == null && other.iddeplprat != null) || (this.iddeplprat != null && !this.iddeplprat.equals(other.iddeplprat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Deplacepratique[ iddeplprat=" + iddeplprat + " ]";
    }
    
}
