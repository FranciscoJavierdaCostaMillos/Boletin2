/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej8;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temperatura, fahrenheit, kelvin;
        temperatura = Integer.parseInt(JOptionPane.showInputDialog("Introduce temperatura en grados centigrados")) ;
        fahrenheit = temperatura * 1.8000 + 32.00;
        kelvin = temperatura + 273.15;
        
        JOptionPane.showMessageDialog(null, "Grados Fahrenheit: " + fahrenheit + " Grados Kelvin: " + kelvin);
    }
    
}
