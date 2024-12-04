
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
@Table(name = "nature")
public class Nature implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnat")
    private Integer idnat;
    @JoinColumn(name = "exam_id", referencedColumnName = "idexam")
    @ManyToOne(optional = false)
    private Examen examen;
    @JoinColumn(name = "activite_id", referencedColumnName = "idact")
    @ManyToOne(optional = false)
    private Activite activite;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Nature() {
    }

    public Nature(Integer idnat) {
        this.idnat = idnat;
    }

    public Nature(Session session, Examen examen, Activite activite,Souscentre souscentre) {
        this.session = session;
        this.examen = examen;
        this.activite = activite;
        this.souscentre = souscentre;
    }
    
    public Integer getIdnat() {
        return idnat;
    }

    public void setIdnat(Integer idnat) {
        this.idnat = idnat;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
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
        hash += (idnat != null ? idnat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nature)) {
            return false;
        }
        Nature other = (Nature) object;
        if ((this.idnat == null && other.idnat != null) || (this.idnat != null && !this.idnat.equals(other.idnat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Nature[ idnat=" + idnat + " ]";
    }
    
}
