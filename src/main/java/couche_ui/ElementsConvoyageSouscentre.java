
package couche_ui;

import couche_jpa.Groupe;
import couche_jpa.Souscentre;

/**
 *
 * @author famille chijou
 */
public class ElementsConvoyageSouscentre {
    private Souscentre souscentre;
    private Groupe groupe;
    private int effectif;
    private int[] tab=new int[3];
   
    //constructeur
    public ElementsConvoyageSouscentre(){
    }
    
    public ElementsConvoyageSouscentre(Souscentre souscentre,Groupe groupe,int effectif){
        this.souscentre=souscentre;
        this.groupe=groupe;
        this.effectif=effectif;
    }
    
    //getters ans setters

    public Souscentre getSouscentre() {
        return souscentre;
    }

    public void setSouscentre(Souscentre souscentre) {
        this.souscentre = souscentre;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }
    
    public void calculElements(){
        tab[0]=(int) Math.ceil((double) effectif/(double) 50);
        tab[1]=(int) Math.ceil((double)effectif/(double)100);
        tab[2]=(int) Math.ceil((double)effectif/(double)100);
    }
}
