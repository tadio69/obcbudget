
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
@Table(name = "intervenant")
public class Intervenant implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinterv")
    private Integer idinterv;
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
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;
    @Basic(optional = false)
    @Column(name = "resident")
    private boolean resident;

    public Intervenant() {
    }

    public Intervenant(Integer idinterv) {
        this.idinterv = idinterv;
    }
    
    public Intervenant(Groupe groupe, Session session, Personnel personnel, Souscentre souscentre,Activite activite,Qualite qualite,boolean resident){
        this.groupe=groupe;
        this.session=session;
        this.personnel=personnel;
        this.souscentre=souscentre;
        this.activite=activite;
        this.qualite=qualite;
        this.resident=resident;
    }

    public Integer getIdinterv() {
        return idinterv;
    }

    public void setIdinterv(Integer idinterv) {
        this.idinterv = idinterv;
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
        hash += (idinterv != null ? idinterv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Intervenant)) {
            return false;
        }
        Intervenant other = (Intervenant) object;
        if ((this.idinterv == null && other.idinterv != null) || (this.idinterv != null && !this.idinterv.equals(other.idinterv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Intervenant[ idinterv=" + idinterv + " ]";
    }

    public boolean getResident() {
        return resident;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }   
}
