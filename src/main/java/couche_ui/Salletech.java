
package couche_ui;

import couche_jpa.Souscentre;


public class Salletech {
    private Souscentre souscentre;
    private String serie;
    private int effectif;
    private int nbsal;

    //constructeur
    public Salletech(){
    }
    
    public Salletech(Souscentre souscentre,String serie,int effectif,int nbsal){
        this.souscentre=souscentre;
        this.serie=serie;
        this.effectif=effectif;
        this.nbsal=nbsal;
    }
    
    //getters ans setters
    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
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
