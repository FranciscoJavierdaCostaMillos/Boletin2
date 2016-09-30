/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej2;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lado, area;
        lado = Float.parseFloat(JOptionPane.showInputDialog("Dame el lado")) ;
        area = lado * lado;
        JOptionPane.showMessageDialog(null, (int)area);
    }
    
}
