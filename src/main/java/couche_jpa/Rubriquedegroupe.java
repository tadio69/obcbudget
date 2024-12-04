
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
@Table(name = "rubriquedegroupe")
public class Rubriquedegroupe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrubgpe")
    private Integer idrubgpe;
    @JoinColumn(name = "groupedexamen_id", referencedColumnName = "idgpexam")
    @ManyToOne(optional = false)
    private Groupedexamen groupedexamen;
    @JoinColumn(name = "rubriquetat_id", referencedColumnName = "idrubetat")
    @ManyToOne(optional = false)
    private Rubriquetat rubriquetat;

    public Rubriquedegroupe() {
    }

    public Rubriquedegroupe(Integer idrubgpe) {
        this.idrubgpe = idrubgpe;
    }

    public Integer getIdrubgpe() {
        return idrubgpe;
    }

    public void setIdrubgpe(Integer idrubgpe) {
        this.idrubgpe = idrubgpe;
    }

    public Groupedexamen getGroupedexamen() {
        return groupedexamen;
    }

    public void setGroupedexamen(Groupedexamen groupedexamen) {
        this.groupedexamen = groupedexamen;
    }

    public Rubriquetat getRubriquetat() {
        return rubriquetat;
    }

    public void setRubriquetat(Rubriquetat rubriquetat) {
        this.rubriquetat = rubriquetat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrubgpe != null ? idrubgpe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rubriquedegroupe)) {
            return false;
        }
        Rubriquedegroupe other = (Rubriquedegroupe) object;
        if ((this.idrubgpe == null && other.idrubgpe != null) || (this.idrubgpe != null && !this.idrubgpe.equals(other.idrubgpe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Rubriquedegroupe[ idrubgpe=" + idrubgpe + " ]";
    }
    
}
