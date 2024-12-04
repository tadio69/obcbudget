
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
@Table(name = "caisse")
public class Caisse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcais")
    private Integer idcais;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "avance")
    private int avance;
    @Basic(optional = false)
    @Column(name = "avancedepensee")
    private int avancedepensee;
    @Basic(optional = false)
    @Column(name = "reliquat")
    private int reliquat;
    @Basic(optional = false)
    @Column(name = "reliquatdepense")
    private int reliquatdepense;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "rubetat_id", referencedColumnName = "idrubetat")
    @ManyToOne(optional = false)
    private Rubriquetat rubetat;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    @Basic(optional = false)
    @Column(name = "additif")
    private boolean additif;

    public Caisse() {
    }

    public Caisse(Integer idcais) {
        this.idcais = idcais;
    }
    
    public Caisse(int avance,int avancedepensee, int reliquat,int reliquatdepense, Groupe groupe, Rubriquetat rubetat, Session session,Souscentre souscentre,boolean additif) {
        this.avance = avance;
        this.avancedepensee = avancedepensee;
        this.reliquat = reliquat;
        this.reliquatdepense = reliquatdepense;
        this.groupe = groupe;
        this.rubetat = rubetat;
        this.session = session;
        this.souscentre = souscentre;
        this.additif = additif;
    }

    public Integer getIdcais() {
        return idcais;
    }

    public void setIdcais(Integer idcais) {
        this.idcais = idcais;
    }


    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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

    public boolean isAdditif() {
        return additif;
    }

    public void setAdditif(boolean additif) {
        this.additif = additif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcais != null ? idcais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caisse)) {
            return false;
        }
        Caisse other = (Caisse) object;
        if ((this.idcais == null && other.idcais != null) || (this.idcais != null && !this.idcais.equals(other.idcais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Caisse[ idcais=" + idcais + " ]";
    }

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public int getAvancedepensee() {
        return avancedepensee;
    }

    public void setAvancedepensee(int avancedepensee) {
        this.avancedepensee = avancedepensee;
    }

    public int getReliquat() {
        return reliquat;
    }

    public void setReliquat(int reliquat) {
        this.reliquat = reliquat;
    }

    public int getReliquatdepense() {
        return reliquatdepense;
    }

    public void setReliquatdepense(int reliquatdepense) {
        this.reliquatdepense = reliquatdepense;
    }
}
