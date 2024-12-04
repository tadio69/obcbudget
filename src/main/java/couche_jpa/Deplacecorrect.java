
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

/**
 *
 * @author famille chijou
 */
@Entity
@Table(name = "deplacecorrect")
public class Deplacecorrect implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddeplcor")
    private Integer iddeplcor;
    @Basic(optional = false)
    @Column(name = "jurys")
    private String jurys;
    @Basic(optional = false)
    @Column(name = "nbcopies")
    private int nbcopies;
    @Basic(optional = false)
    @Column(name = "correction")
    private boolean correction;
    @Basic(optional = false)
    @Column(name = "harmonisation")
    private boolean harmonisation;
    @Basic(optional = false)
    @Column(name = "harmocorrect")
    private boolean harmocorrect;
    @Basic(optional = false)
    @Column(name = "deladmissibilite")
    private boolean deladmissibilite;
    @Basic(optional = false)
    @Column(name = "deladmission")
    private boolean deladmission;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @ManyToOne(optional = false)
    private Intervenant intervenant;
    @JoinColumn(name = "matiere_id", referencedColumnName = "idmat")
    @ManyToOne(optional = false)
    private Matiere matiere;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;

    public Deplacecorrect() {
    }

    public Deplacecorrect(Integer iddeplcor) {
        this.iddeplcor = iddeplcor;
    }

    public Deplacecorrect(Intervenant intervenant,Option option,Matiere matiere,String jurys, int nbcopies, boolean correction, boolean harmonisation, boolean harmocorrect, boolean deladmissibilite, boolean deladmission) {
        this.intervenant = intervenant;
        this.option = option;
        this.matiere = matiere;
        this.jurys = jurys;
        this.nbcopies = nbcopies;
        this.correction = correction;
        this.harmonisation = harmonisation;
        this.harmocorrect = harmocorrect;
        this.deladmissibilite = deladmissibilite;
        this.deladmission = deladmission;
    }

    public Integer getIddeplcor() {
        return iddeplcor;
    }

    public void setIddeplcor(Integer iddeplcor) {
        this.iddeplcor = iddeplcor;
    }

    public String getJurys() {
        return jurys;
    }

    public void setJurys(String jurys) {
        this.jurys = jurys;
    }

    public int getNbcopies() {
        return nbcopies;
    }

    public void setNbcopies(int nbcopies) {
        this.nbcopies = nbcopies;
    }

    public boolean getCorrection() {
        return correction;
    }

    public void setCorrection(boolean correction) {
        this.correction = correction;
    }

    public boolean getHarmonisation() {
        return harmonisation;
    }

    public void setHarmonisation(boolean harmonisation) {
        this.harmonisation = harmonisation;
    }

    public boolean getHarmocorrect() {
        return harmocorrect;
    }

    public void setHarmocorrect(boolean harmocorrect) {
        this.harmocorrect = harmocorrect;
    }

    public boolean getDeladmissibilite() {
        return deladmissibilite;
    }

    public void setDeladmissibilite(boolean deladmissibilite) {
        this.deladmissibilite = deladmissibilite;
    }

    public boolean getDeladmission() {
        return deladmission;
    }

    public void setDeladmission(boolean deladmission) {
        this.deladmission = deladmission;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddeplcor != null ? iddeplcor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deplacecorrect)) {
            return false;
        }
        Deplacecorrect other = (Deplacecorrect) object;
        if ((this.iddeplcor == null && other.iddeplcor != null) || (this.iddeplcor != null && !this.iddeplcor.equals(other.iddeplcor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Deplacecorrect[ iddeplcor=" + iddeplcor + " ]";
    }
    
}
