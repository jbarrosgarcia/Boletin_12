/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jbarrosgarcia
 */
public class Coche {
    private String matricula;

    public Coche() {
        this.matricula = JOptionPane.showInputDialog("Introduzca el numero de matricula");
    }

    public String getMatricula() {
        return matricula;
    }
    public  Coche getCoche(){
        return this;
    }
}
