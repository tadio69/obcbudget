
package couche_ui;

import couche_jpa.Examen;
import couche_jpa.Option;

/**
 *
 * @author famille chijou
 */
public class Secexamopt {
    int numero;
    Examen exam;
    Option opt;
    
    //constructeur
    public Secexamopt(){
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Examen getExam() {
        return exam;
    }

    public void setExam(Examen exam) {
        this.exam = exam;
    }

    public Option getOpt() {
        return opt;
    }

    public void setOpt(Option opt) {
        this.opt = opt;
    }
    
    
}
