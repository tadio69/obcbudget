
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
@Table(name = "bureau")
public class Bureau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idburo")
    private Integer idburo;
    @Version
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "assistant_id", referencedColumnName = "idpers")
    @ManyToOne(optional = false)
    private Personnel assistant;
    @JoinColumn(name = "responsable_id", referencedColumnName = "idpers")
    @ManyToOne(optional = false)
    private Personnel responsable;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "centrebilletage_id", referencedColumnName = "idcentrebill")
    @ManyToOne(optional = false)
    private Centrebilletage centrebilletage;

    public Bureau() {
    }

    public Bureau(Integer idburo) {
        this.idburo = idburo;
    }

    public Bureau(Integer idburo, int version) {
        this.idburo = idburo;
        this.version = version;
    }
    
    public Bureau(Centrebilletage centrebilletage,Personnel responsable,Personnel assistant,Session session) {
        this.centrebilletage = centrebilletage;
        this.responsable = responsable;
        this.assistant = assistant;
        this.session = session;  
    }

    public Integer getIdburo() {
        return idburo;
    }

    public void setIdburo(Integer idburo) {
        this.idburo = idburo;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Personnel getAssistant() {
        return assistant;
    }

    public void setAssistant(Personnel assistant) {
        this.assistant = assistant;
    }

    public Personnel getResponsable() {
        return responsable;
    }

    public void setResponsable(Personnel responsable) {
        this.responsable = responsable;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Centrebilletage getCentrebilletage() {
        return centrebilletage;
    }

    public void setCentrebilletage(Centrebilletage centrebilletage) {
        this.centrebilletage = centrebilletage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idburo != null ? idburo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bureau)) {
            return false;
        }
        Bureau other = (Bureau) object;
        if ((this.idburo == null && other.idburo != null) || (this.idburo != null && !this.idburo.equals(other.idburo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Bureau[ idburo=" + idburo + " ]";
    }
}
