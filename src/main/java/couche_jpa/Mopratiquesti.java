
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
@Table(name = "mopratiquesti")
public class Mopratiquesti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmopratesti")
    private Integer idmopratesti;
    @Basic(optional = false)
    @Column(name = "coutcand")
    private int coutcand;
    @Basic(optional = false)
    @Column(name = "coutposte")
    private int coutposte;
    @Basic(optional = false)
    @Column(name = "nbpostes")
    private int nbpostes;
    @Basic(optional = false)
    @Column(name = "forfait")
    private int forfait;
    @Basic(optional = false)
    @Column(name = "coutamort")
    private int coutamort;
    @Basic(optional = false)
    @Column(name = "numprat")
    private int numprat;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "option_id", referencedColumnName = "idopt")
    @ManyToOne(optional = false)
    private Option option;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Mopratiquesti() {
    }

    public Mopratiquesti(Integer idmopratesti) {
        this.idmopratesti = idmopratesti;
    }

    public Mopratiquesti(Souscentre souscentre,Option option,Groupe groupe,Session session,int coutcand, int coutposte,int nbpostes, int forfait, int coutamort,int numprat) {
        this.souscentre = souscentre;
        this.option = option;
        this.groupe = groupe;
        this.session = session;
        this.coutcand = coutcand;
        this.coutposte = coutposte;
        this.nbpostes = nbpostes;
        this.forfait = forfait;
        this.coutamort = coutamort;
        this.numprat=numprat;
    }

    public Integer getIdmopratesti() {
        return idmopratesti;
    }

    public void setIdmopratesti(Integer idmopratesti) {
        this.idmopratesti = idmopratesti;
    }

    public int getCoutcand() {
        return coutcand;
    }

    public void setCoutcand(int coutcand) {
        this.coutcand = coutcand;
    }

    public int getCoutposte() {
        return coutposte;
    }

    public void setCoutposte(int coutposte) {
        this.coutposte = coutposte;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public int getForfait() {
        return forfait;
    }

    public void setForfait(int forfait) {
        this.forfait = forfait;
    }

    public int getCoutamort() {
        return coutamort;
    }

    public void setCoutamort(int coutamort) {
        this.coutamort = coutamort;
    }

    public int getNumprat() {
        return numprat;
    }

    public void setNumprat(int numprat) {
        this.numprat = numprat;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmopratesti != null ? idmopratesti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mopratiquesti)) {
            return false;
        }
        Mopratiquesti other = (Mopratiquesti) object;
        if ((this.idmopratesti == null && other.idmopratesti != null) || (this.idmopratesti != null && !this.idmopratesti.equals(other.idmopratesti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Mopratique1esti[ idmoprat1=" + idmopratesti + " ]";
    }
    
}
