
package couche_jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "utilisateur")
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idutil")
    private Integer idutil;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "motpass")
    private String motpass;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;

    public Utilisateur() {
    }

    public Utilisateur(Integer idutil) {
        this.idutil = idutil;
    }

    public Utilisateur(Integer idutil, String login, String motpass, int version) {
        this.idutil = idutil;
        this.login = login;
        this.motpass = motpass;
        this.version = version;
    }
    
    public Utilisateur(String login, String motpass) {
        this.login = login;
        this.motpass = motpass;
    }

    public Integer getIdutil() {
        return idutil;
    }

    public void setIdutil(Integer idutil) {
        this.idutil = idutil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotpass() {
        return motpass;
    }

    public void setMotpass(String motpass) {
        this.motpass = motpass;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idutil != null ? idutil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idutil == null && other.idutil != null) || (this.idutil != null && !this.idutil.equals(other.idutil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Utilisateur[ idutil=" + idutil + " ]";
    }
    
}
