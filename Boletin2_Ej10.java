/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej10;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dinero,resto,b100,b20,b5,monedas;
        dinero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dinero")) ;
        b100 = dinero/100;
        resto = dinero%100;
        b20 = resto/20;
        resto = resto%20;
        b5 = resto/5;
        resto = resto%5;
        monedas = resto;
        JOptionPane.showMessageDialog(null, "Billetes de 100: " + (int)b100 + "  Billetes de 20: " + (int)b20 + "  Billetes de 5: " + (int)b5 + " Monedas: " + (int)monedas);
    }
    
}
