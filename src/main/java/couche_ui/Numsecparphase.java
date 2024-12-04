
package couche_ui;

import couche_jpa.Activite;
import java.util.ArrayList;

/**
 *
 * @author famille chijou
 */
public class Numsecparphase {
    private Activite activite;
    private boolean numsec1;
    private boolean numsec2;
    private boolean numsec3;
    
    public Numsecparphase(){
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public boolean isNumsec1() {
        return numsec1;
    }

    public void setNumsec1(boolean numsec1) {
        this.numsec1 = numsec1;
    }

    public boolean isNumsec2() {
        return numsec2;
    }

    public void setNumsec2(boolean numsec2) {
        this.numsec2 = numsec2;
    }

    public boolean isNumsec3() {
        return numsec3;
    }

    public void setNumsec3(boolean numsec3) {
        this.numsec3 = numsec3;
    }
    
}
