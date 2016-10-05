/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej7;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n,i,t,operacion;
        n = Double.parseDouble(JOptionPane.showInputDialog("Nominal")) ;
        i = Double.parseDouble(JOptionPane.showInputDialog("Interes anual")) ;
        t = Double.parseDouble(JOptionPane.showInputDialog("Numeros de anos")) ;
        operacion = n * Math.pow((1+i),t) * i/ Math.pow((1+i),t)-1;
        JOptionPane.showMessageDialog(null, operacion);
        
        
        
    }
    
}
