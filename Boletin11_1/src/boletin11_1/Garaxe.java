
package boletin11_1;

import javax.swing.JOptionPane;


public class Garaxe {
    private int  numeroCoches;
    private int  nVacantes=5;
    private Coche nMatricula[];
    public Garaxe() {
    }
    public void aparcar(Coche nMatri){
        numeroCoches=numeroCoches+1;
        this.nMatricula[this.numeroCoches]=nMatri;
        if (numeroCoches>=nVacantes){
            JOptionPane.showMessageDialog(null, "Completo");
        }else{
            JOptionPane.showMessageDialog(null, "Libre");
        }
    }
    
    
    
}
