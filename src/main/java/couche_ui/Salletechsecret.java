
package couche_ui;

import couche_jpa.Secretariat;


public class Salletechsecret {
    private Secretariat secretariat;
    private String serie;
    private int effectif;
    private int nbsal;

    //constructeur
    public Salletechsecret(){
    }
    
    public Salletechsecret(Secretariat secretariat,String serie,int effectif,int nbsal){
        this.secretariat=secretariat;
        this.serie=serie;
        this.effectif=effectif;
        this.nbsal=nbsal;
    }
    
    //getters ans setters

    public Secretariat getSecretariat() {
        return secretariat;
    }

    public void setSecretariat(Secretariat secretariat) {
        this.secretariat = secretariat;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public int getNbsal() {
        return nbsal;
    }

    public void setNbsal(int nbsal) {
        this.nbsal = nbsal;
    }
}
