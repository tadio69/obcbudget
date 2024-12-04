
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
@Table(name = "caissesport")
public class Caissesport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcaissport")
    private Integer idcaissport;
    @Basic(optional = false)
    @Column(name = "montantpercu")
    private int montantpercu;
    @Basic(optional = false)
    @Column(name = "montantdepense")
    private int montantdepense;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "etablissement_id", referencedColumnName = "idetab")
    @ManyToOne(optional = false)
    private Etablissement etablissement;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "rubetat_id", referencedColumnName = "idrubetat")
    @ManyToOne(optional = false)
    private Rubriquetat rubetat;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Caissesport() {
    }

    public Caissesport(Integer idcaissport) {
        this.idcaissport = idcaissport;
    }

    public Caissesport(int montantpercu,int montantdepense, Groupe groupe, Rubriquetat rubetat, Session session,Etablissement etablissement) {
        this.montantpercu = montantpercu;
        this.montantdepense = montantdepense;
        this.groupe = groupe;
        this.rubetat = rubetat;
        this.session = session;
        this.etablissement = etablissement;
    }

    public Integer getIdcaissport() {
        return idcaissport;
    }

    public void setIdcaissport(Integer idcaissport) {
        this.idcaissport = idcaissport;
    }

    public int getMontantpercu() {
        return montantpercu;
    }

    public void setMontantpercu(int montantpercu) {
        this.montantpercu = montantpercu;
    }

    public int getMontantdepense() {
        return montantdepense;
    }

    public void setMontantdepense(int montantdepense) {
        this.montantdepense = montantdepense;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Rubriquetat getRubetat() {
        return rubetat;
    }

    public void setRubetat(Rubriquetat rubetat) {
        this.rubetat = rubetat;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcaissport != null ? idcaissport.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caissesport)) {
            return false;
        }
        Caissesport other = (Caissesport) object;
        if ((this.idcaissport == null && other.idcaissport != null) || (this.idcaissport != null && !this.idcaissport.equals(other.idcaissport))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Caissesport[ idcaissport=" + idcaissport + " ]";
    }
    
}
