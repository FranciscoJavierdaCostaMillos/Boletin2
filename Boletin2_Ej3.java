/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej3;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float euros, cambioDolar,operacion;
        euros = Float.parseFloat(JOptionPane.showInputDialog("Cantidad de dinero")) ;
        cambioDolar = Float.parseFloat(JOptionPane.showInputDialog("Valor del dolar"));
        operacion = euros*cambioDolar;
        JOptionPane.showMessageDialog(null, operacion);
    }
    
}