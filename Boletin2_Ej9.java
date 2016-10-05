/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej9;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b100,b20,b5,monedas,operacion;
        b100 = Integer.parseInt(JOptionPane.showInputDialog("Billetes de 100")) ;
        b20=Integer.parseInt(JOptionPane.showInputDialog("Billetes de 20")) ;
        b5 = Integer.parseInt(JOptionPane.showInputDialog("Billetes de 5")) ;
        monedas = Integer.parseInt(JOptionPane.showInputDialog("Numero de monedas"));
        operacion = (b100 * 100) + (b20 * 20) + (b5 * 5) + monedas;
        JOptionPane.showMessageDialog(null, operacion);
    }
    
}
