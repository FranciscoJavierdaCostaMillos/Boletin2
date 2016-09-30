/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej5;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float millas, metros = 1852, operacion;
        millas = Float.parseFloat(JOptionPane.showInputDialog("Numero de millas")) ;
        operacion = millas * metros;
        JOptionPane.showMessageDialog(null, operacion);
    }
    
}
