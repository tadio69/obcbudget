
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
@Table(name = "elementsurvdeficient")
public class Elementsurvdeficient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideltsurvdef")
    private Integer ideltsurvdef;
    @Basic(optional = false)
    @Column(name = "effectif")
    private int effectif;
    @Basic(optional = false)
    @Column(name = "nbsurv")
    private int nbsurv;
    @Basic(optional = false)
    @Column(name = "vacsurv")
    private int vacsurv;
    @Basic(optional = false)
    @Column(name = "nbtranscript")
    private int nbtranscript;
    @Basic(optional = false)
    @Column(name = "vactranscript")
    private int vactranscript;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe")
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess")
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent")
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Elementsurvdeficient() {
    }

    public Elementsurvdeficient(Integer ideltsurvdef) {
        this.ideltsurvdef = ideltsurvdef;
    }

    public Elementsurvdeficient(int effectif, int nbsurv, int vacsurv, int nbtranscript, int vactranscript,Groupe groupe,Session session,Souscentre souscentre) {
        this.effectif = effectif;
        this.nbsurv = nbsurv;
        this.vacsurv = vacsurv;
        this.nbtranscript = nbtranscript;
        this.vactranscript = vactranscript;
        this.groupe = groupe;
        this.session = session;
        this.souscentre = souscentre;
    }

    public Integer getIdeltsurvdef() {
        return ideltsurvdef;
    }

    public void setIdeltsurvdef(Integer ideltsurvdef) {
        this.ideltsurvdef = ideltsurvdef;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public int getNbsurv() {
        return nbsurv;
    }

    public void setNbsurv(int nbsurv) {
        this.nbsurv = nbsurv;
    }

    public int getVacsurv() {
        return vacsurv;
    }

    public void setVacsurv(int vacsurv) {
        this.vacsurv = vacsurv;
    }

    public int getNbtranscript() {
        return nbtranscript;
    }

    public void setNbtranscript(int nbtranscript) {
        this.nbtranscript = nbtranscript;
    }

    public int getVactranscript() {
        return vactranscript;
    }

    public void setVactranscript(int vactranscript) {
        this.vactranscript = vactranscript;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
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
        hash += (ideltsurvdef != null ? ideltsurvdef.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elementsurvdeficient)) {
            return false;
        }
        Elementsurvdeficient other = (Elementsurvdeficient) object;
        if ((this.ideltsurvdef == null && other.ideltsurvdef != null) || (this.ideltsurvdef != null && !this.ideltsurvdef.equals(other.ideltsurvdef))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Elementsurvdeficient[ ideltsurvdef=" + ideltsurvdef + " ]";
    }
    
}
