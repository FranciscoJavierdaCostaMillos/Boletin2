/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_ej6;

import javax.swing.JOptionPane;

/**
 *
 * @author fdacostamillos
 */
public class Boletin2_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float precioTarifa, precioPagado,operacion;
        precioTarifa = Float.parseFloat(JOptionPane.showInputDialog("Precio de la tarifa")) ;
        precioPagado = Float.parseFloat(JOptionPane.showInputDialog("Precio Pagado"));
        operacion = (precioPagado*100)/precioTarifa;
        JOptionPane.showMessageDialog(null, operacion);
            
    
    }
    
}
