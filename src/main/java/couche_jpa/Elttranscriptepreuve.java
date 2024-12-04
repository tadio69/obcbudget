
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


@Entity
@Table(name = "elttranscriptepreuve")
public class Elttranscriptepreuve implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idelttransepreuve;
    @Basic(optional = false)
    @Column(nullable = false)
    private int fraistrans;
    @Basic(optional = false)
    @Column(nullable = false)
    private int indemdeplace;
    @Basic(optional = false)
    @Column(nullable = false)
    private int locatembos;
    @Basic(optional = false)
    @Column(nullable = false)
    private int indemtranscript;
    @Basic(optional = false)
    @Column(nullable = false)
    private int expertise;
    @JoinColumn(name = "groupe_id", referencedColumnName = "idgpe", nullable = false)
    @ManyToOne(optional = false)
    private Groupe groupe;
    @JoinColumn(name = "intervenant_id", referencedColumnName = "idinterv")
    @OneToOne(optional = false)
    private Intervenant intervenant;
    @JoinColumn(name = "session_id", referencedColumnName = "idsess", nullable = false)
    @ManyToOne(optional = false)
    private Session session;
    @JoinColumn(name = "souscentre_id", referencedColumnName = "idsouscent", nullable = false)
    @ManyToOne(optional = false)
    private Souscentre souscentre;

    public Elttranscriptepreuve() {
    }

    public Elttranscriptepreuve(Integer idelttransepreuve) {
        this.idelttransepreuve = idelttransepreuve;
    }

    public Elttranscriptepreuve(Souscentre souscentre,Session session,Groupe groupe,Intervenant intervenant,int fraistrans, int indemdeplace, int locatembos, int indemtranscript, int expertise) {
        this.souscentre = souscentre;
        this.session = session;
        this.groupe = groupe;
        this.intervenant = intervenant;
        this.fraistrans = fraistrans;
        this.indemdeplace = indemdeplace;
        this.locatembos = locatembos;
        this.indemtranscript = indemtranscript;
        this.expertise = expertise;
    }

    public Integer getIdelttransepreuve() {
        return idelttransepreuve;
    }

    public void setIdelttransepreuve(Integer idelttransepreuve) {
        this.idelttransepreuve = idelttransepreuve;
    }

    public int getFraistrans() {
        return fraistrans;
    }

    public void setFraistrans(int fraistrans) {
        this.fraistrans = fraistrans;
    }

    public int getIndemdeplace() {
        return indemdeplace;
    }

    public void setIndemdeplace(int indemdeplace) {
        this.indemdeplace = indemdeplace;
    }

    public int getLocatembos() {
        return locatembos;
    }

    public void setLocatembos(int locatembos) {
        this.locatembos = locatembos;
    }

    public int getIndemtranscript() {
        return indemtranscript;
    }

    public void setIndemtranscript(int indemtranscript) {
        this.indemtranscript = indemtranscript;
    }

    public int getExpertise() {
        return expertise;
    }

    public void setExpertise(int expertise) {
        this.expertise = expertise;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
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

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idelttransepreuve != null ? idelttransepreuve.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elttranscriptepreuve)) {
            return false;
        }
        Elttranscriptepreuve other = (Elttranscriptepreuve) object;
        if ((this.idelttransepreuve == null && other.idelttransepreuve != null) || (this.idelttransepreuve != null && !this.idelttransepreuve.equals(other.idelttransepreuve))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "couche_jpa.Elttranscriptepreuve[ idelttransepreuve=" + idelttransepreuve + " ]";
    }
    
}
