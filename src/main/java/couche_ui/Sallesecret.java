
package couche_ui;

import couche_jpa.Secretariat;


public class Sallesecret {
    private Secretariat secretariat;
    private int nbcandsal;
    private String serie;
    private int effectif;
    private int nbsal;

    //constructeur
    public Sallesecret(){
    }
    
    public Sallesecret(Secretariat secretariat,String serie,int effectif,int nbsal,int nbcandsal){
        this.secretariat=secretariat;
        this.serie=serie;
        this.effectif=effectif;
        this.nbsal=nbsal;
        this.nbcandsal=nbcandsal;
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

    public int getNbcandsal() {
        return nbcandsal;
    }

    public void setNbcandsal(int nbcandsal) {
        this.nbcandsal = nbcandsal;
    }   
    
    public void calculNbsal(){//ici effectif>=20
        if(effectif>=20 && effectif<nbcandsal) nbsal=1;
        if(effectif>=nbcandsal) nbsal=(int) Math.ceil((double) effectif/(double) nbcandsal);
    }
}
