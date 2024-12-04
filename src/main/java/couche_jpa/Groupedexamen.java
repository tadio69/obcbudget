
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
@Table(name = "groupedexamen")
public class Groupedexamen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgpexam")
    private Integer idgpexam;
    @JoinColumn(name = "examen_id", referencedColumnName = "idexam")
    @ManyToOne(optional = false)
    private Examen examen;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    

    public Groupedexamen() {
    }

    public Groupedexamen(Integer idgpexam) {
        this.idgpexam = idgpexam;
    }

    public Groupedexamen(Examen examen,Groupe groupe) {
        this.examen = examen;
        this.groupe = groupe;
    }
    
    public Integer getIdgpexam() {
        return idgpexam;
    }

    public void setIdgpexam(Integer idgpexam) {
        this.idgpexam = idgpexam;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgpexam != null ? idgpexam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupedexamen)) {
            return false;
        }
        Groupedexamen other = (Groupedexamen) object;
        if ((this.idgpexam == null && other.idgpexam != null) || (this.idgpexam != null && !this.idgpexam.equals(other.idgpexam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Groupedexamen[ idgpexam=" + idgpexam + " ]";
    }
    
}
