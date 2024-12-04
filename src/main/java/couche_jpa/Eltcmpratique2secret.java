
package couche_jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "eltcmpratique2secret")
public class Eltcmpratique2secret implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "duree")
    private int duree;
    @JoinColumn(name = "intervenantsecret_id", referencedColumnName = "idintersec")
    @OneToOne(optional = false)
    private Intervenantsecret intervenantsecret;

    public Eltcmpratique2secret() {
    }

    public Eltcmpratique2secret(int duree,Intervenantsecret intervenantsecret) {
        this.duree =duree;
        this.intervenantsecret = intervenantsecret;
    }

    public Eltcmpratique2secret(Integer id, int duree) {
        this.id = id;
        this.duree = duree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Intervenantsecret getIntervenantsecret() {
        return intervenantsecret;
    }

    public void setIntervenantsecret(Intervenantsecret intervenantsecret) {
        this.intervenantsecret = intervenantsecret;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eltcmpratique2secret)) {
            return false;
        }
        Eltcmpratique2secret other = (Eltcmpratique2secret) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Eltcmpratique2secret[ id=" + id + " ]";
    }
    
}
