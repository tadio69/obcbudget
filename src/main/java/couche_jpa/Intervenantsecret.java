
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
@Table(name = "intervenantsecret")
public class Intervenantsecret implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idintersec")
    private Integer idintersec;
    @Basic(optional = false)
    @Column(name = "resident")
    private boolean resident;
    @JoinColumn(name = "activite_id", referencedColumnName = "idact")
    @ManyToOne(optional = false)
    private Activite activite;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "personnel_id", referencedColumnName = "idpers")
    @ManyToOne(optional = false)
    private Personnel personnel;
    @JoinColumn(name = "qualite_id", referencedColumnName = "idqual")
    @ManyToOne(optional = false)
    private Qualite qualite;
    @JoinColumn(name = "secretariat_id", referencedColumnName = "idsec")
    @ManyToOne(optional = false)
    private Secretariat secretariat;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Intervenantsecret() {
    }

    public Intervenantsecret(Integer idintersec) {
        this.idintersec = idintersec;
    }

    public Intervenantsecret(Groupe groupe, Session session, Personnel personnel, Secretariat secretariat,Activite activite,Qualite qualite,boolean resident){
        this.groupe=groupe;
        this.session=session;
        this.personnel=personnel;
        this.secretariat=secretariat;
        this.activite=activite;
        this.qualite=qualite;
        this.resident=resident;
    }

    public Integer getIdintersec() {
        return idintersec;
    }

    public void setIdintersec(Integer idintersec) {
        this.idintersec = idintersec;
    }

    public boolean getResident() {
        return resident;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    public Qualite getQualite() {
        return qualite;
    }

    public void setQualite(Qualite qualite) {
        this.qualite = qualite;
    }

    public Secretariat getSecretariat() {
        return secretariat;
    }

    public void setSecretariat(Secretariat secretariat) {
        this.secretariat = secretariat;
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
        hash += (idintersec != null ? idintersec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Intervenantsecret)) {
            return false;
        }
        Intervenantsecret other = (Intervenantsecret) object;
        if ((this.idintersec == null && other.idintersec != null) || (this.idintersec != null && !this.idintersec.equals(other.idintersec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Intervenantsecret[ idintersec=" + idintersec + " ]";
    }
    
}
