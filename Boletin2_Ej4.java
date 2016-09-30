/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej4;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        float n1, n2,suma,resta,multiplicacion,division;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Insertar Primer Numero")) ;
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Insertar Segundo Numero"));
        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        division = n1 / n2;
        
        JOptionPane.showMessageDialog(null, "La suma es: " + suma + " La resta es: " + resta + " La multiplicacion es :" + multiplicacion + " La divison es :" + division);
    }
    
}
