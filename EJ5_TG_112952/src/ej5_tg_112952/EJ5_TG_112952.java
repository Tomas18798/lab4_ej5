/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5_tg_112952;

import controlador.ControladorTransaccion;
import modelo.Transaccion;
import modelo.Vendedor;
import vista.InsertarTransaccion;

/**
 *
 * @author tom
 */
public class EJ5_TG_112952 {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            new InsertarTransaccion(new ControladorTransaccion()).setVisible(true);
        } catch (Exception ex) {
            // handle the error driver
        }

//        Servicio s = new Servicio(0, jtConcepto.getText(), precio, habSeleccionada);
//            if (controlador.registrarServicio(s) == true) {
//                JOptionPane.showMessageDialog(this, "Servicio registrado!");
//                this.dispose();
//            }
    }

}
