
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

/**
 *
 * @author pc
 */
@Entity
@Table(name = "eltcoordo")
public class Eltcoordo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltcoord")
    private Integer ideltcoord;
    @Basic(optional = false)
    @Column(name = "examcoord")
    private String examcoord;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;

    public Eltcoordo() {
    }

    public Eltcoordo(Integer ideltcoord) {
        this.ideltcoord = ideltcoord;
    }

    public Eltcoordo(Intervenant intervenant,Session session, String examcoord) {
        this.intervenant = intervenant;
        this.examcoord = examcoord;
        this.session = session;
    }

    public Integer getIdeltcoord() {
        return ideltcoord;
    }

    public void setIdeltcoord(Integer ideltcoord) {
        this.ideltcoord = ideltcoord;
    }

    public String getExamcoord() {
        return examcoord;
    }

    public void setExamcoord(String examcoord) {
        this.examcoord = examcoord;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideltcoord != null ? ideltcoord.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltcoordo)) {
            return false;
        }
        Eltcoordo other = (Eltcoordo) object;
        if ((this.ideltcoord == null && other.ideltcoord != null) || (this.ideltcoord != null && !this.ideltcoord.equals(other.ideltcoord))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltcoordo[ ideltcoord=" + ideltcoord + " ]";
    }
    
}
