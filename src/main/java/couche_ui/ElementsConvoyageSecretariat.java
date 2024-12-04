
package couche_ui;

import couche_jpa.Groupe;
import couche_jpa.Secretariat;


/**
 *
 * @author famille chijou
 */
public class ElementsConvoyageSecretariat {
    private Secretariat secretariat;
    private Groupe groupe;
    private int effectif;
    private int[] tab=new int[3];
   
    //constructeur
    public ElementsConvoyageSecretariat(){
    }
    
    public ElementsConvoyageSecretariat(Secretariat secretariat,Groupe groupe,int effectif){
        this.secretariat=secretariat;
        this.groupe=groupe;
        this.effectif=effectif;
    }
    
    //getters ans setters

    public Secretariat getSecretariat() {
        return secretariat;
    }

    public void setSecretariat(Secretariat secretariat) {
        this.secretariat = secretariat;
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
