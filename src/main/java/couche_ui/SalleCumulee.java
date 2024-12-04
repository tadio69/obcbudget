package couche_ui;

import couche_jpa.Souscentre;

public class SalleCumulee {

    private Souscentre souscentre;
    private String serie;//concaténation des séries cumulées du sous-centre
    private int effectif;//effectif cumulé des séries correspondantes
    private int nbsal = 0;
    private int nbcandsal;
    private String zone = "PAIX";//zone de PAIX ou NOSO
    private String paquet = "ABI";//ABI,AUTRES, SCIENTIFIQUE

    //constructeur
    public SalleCumulee() {
    }

    public SalleCumulee(Souscentre souscentre, String serie, int effectif, int nbsal,int nbcandsal) {
        this.souscentre = souscentre;
        this.serie = serie;
        this.effectif = effectif;
        this.nbsal = nbsal;
        this.nbcandsal=nbcandsal;
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

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getPaquet() {
        return paquet;
    }

    public void setPaquet(String paquet) {
        this.paquet = paquet;
    }

    public int getNbcandsal() {
        return nbcandsal;
    }

    public void setNbcandsal(int nbcandsal) {
        this.nbcandsal = nbcandsal;
    }

    public void calculNbsal() {
        if (effectif >= nbcandsal) {
            nbsal = (int) Math.ceil((double) effectif / (double) nbcandsal);
        } else {
            if (paquet.equals("SCIENTIFIQUE")) {
                if (effectif < 10) {
                    if (zone.equals("NOSO")) {
                        nbsal = 1;
                    } else {
                        nbsal = 0;
                    }                    
                }                
                else nbsal = 1;
                
            } else {
                if (effectif < 15) {
                    if (zone.equals("NOSO")) {
                        nbsal = 1;
                    } else {
                        nbsal = 0;
                    }
                }
                else nbsal = 1;
            }
        }
    }
}
