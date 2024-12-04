
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
@Table(name = "eltcomeval")
public class Eltcomeval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltcomeval")
    private Integer ideltcomeval;
    @Basic(optional = false)
    @Column(name = "numtel")
    private String numtel;
    @Basic(optional = false)
    @Column(name = "nbcas")
    private int nbcas;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;
    @JoinColumn(name = "sousfamille_id", referencedColumnName = "idsousfam")
    @ManyToOne(optional = false)
    private Sousfamille sousfamille;   
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    

    public Eltcomeval() {
    }

    public Eltcomeval(Integer ideltcomeval) {
        this.ideltcomeval = ideltcomeval;
    }

    public Eltcomeval(Groupe groupe,Session session,Intervenant intervenant, Option option, String numtel, int nbcas, Sousfamille sousfamille) {
        this.groupe = groupe;
        this.session = session;
        this.intervenant = intervenant;
        this.option = option;
        this.numtel = numtel;
        this.sousfamille = sousfamille;
        this.nbcas = nbcas;
    }

    public Integer getIdeltcomeval() {
        return ideltcomeval;
    }

    public void setIdeltcomeval(Integer ideltcomeval) {
        this.ideltcomeval = ideltcomeval;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public int getNbcas() {
        return nbcas;
    }

    public void setNbcas(int nbcas) {
        this.nbcas = nbcas;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    
    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
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
        hash += (ideltcomeval != null ? ideltcomeval.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltcomeval)) {
            return false;
        }
        Eltcomeval other = (Eltcomeval) object;
        if ((this.ideltcomeval == null && other.ideltcomeval != null) || (this.ideltcomeval != null && !this.ideltcomeval.equals(other.ideltcomeval))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltcomeval[ ideltcomeval=" + ideltcomeval + " ]";
    } 
}
