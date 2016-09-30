/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base, altura,area;
        base = Float.parseFloat(JOptionPane.showInputDialog("Dame la base")) ;
        altura = Float.parseFloat(JOptionPane.showInputDialog("Dame la altura"));
        area = (base*altura)/2;
        JOptionPane.showMessageDialog(null, (int)area);
    }
    
}
