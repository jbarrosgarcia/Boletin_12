
package boletin12_1;

import javax.swing.JOptionPane;


public class Boletin12_1 {


    public static void main(String[] args) {
        Garaxe garaxe1=new Garaxe();
        String introducirMasCoches="si";
        Coche coche1[]=new Coche[5];
        for(int x=0;x<5;x++){
        
            coche1[x]=new Coche();
            garaxe1.aparcar(coche1);
            garaxe1.setTiempo(Integer.parseInt(JOptionPane.showInputDialog("Introducir el tiempo")));
            garaxe1.cobro(Double.parseDouble(JOptionPane.showInputDialog("Introducir el pago")));
        }
    }
    
}
