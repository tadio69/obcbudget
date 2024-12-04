
package couche_ui;

import couche_jpa.Examen;
import couche_jpa.Option;


public class StatParOptionEtexam {
    Examen exam;
    Option opt;
    int effectif;
    
    //constructeur
    public StatParOptionEtexam(){
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

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }
}
