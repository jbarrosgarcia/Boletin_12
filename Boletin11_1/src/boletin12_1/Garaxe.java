
package boletin12_1;

import javax.swing.JOptionPane;


public class Garaxe {
    private int  numeroCoches;
    private int  nVacantes=4;
    private Coche nMatricula[]=new Coche[5];
    private int tiempo=0;

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public Garaxe() {
    }
    public void aparcar(Coche nMatri[]){
       
        this.nMatricula[this.numeroCoches]=nMatri[this.numeroCoches];
        if (numeroCoches>=nVacantes){
            JOptionPane.showMessageDialog(null, "Completo");
        }else{
            JOptionPane.showMessageDialog(null, "Libre");
        }
         numeroCoches=numeroCoches+1;
    }
    public void cobro(double pago){
        String cobro="";
        if (tiempo>3){
            cobro="El precio por "+tiempo+" horas es "+(1.5+((tiempo-3)*0.2))+"\nSu cambio es "+(pago-(1.5+((tiempo-3)*0.2)));
        }else{
            cobro="El precio por "+tiempo+" horas es "+(1.5)+"\nSu cambio es "+(pago-1.5);
        
        }
        JOptionPane.showMessageDialog(null, cobro);
    
    }
    
}
