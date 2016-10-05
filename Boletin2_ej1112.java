/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej1112;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_ej1112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sueldoFijo = Float.parseFloat(JOptionPane.showInputDialog("Sueldo fijo"));
        float ventas = Float.parseFloat(JOptionPane.showInputDialog("Ventas"));
        float km = Float.parseFloat(JOptionPane.showInputDialog("Kilometros"));
        float dias = Float.parseFloat(JOptionPane.showInputDialog("Dias de desplazamiento por dietas"));
        double liquido= ( sueldoFijo + ventas * 0.05 + km * 2 + 30 * dias -36)* 0.82;
        System.out.println("Sueldo liquido a percibir:  " + liquido);
    }
    
}
