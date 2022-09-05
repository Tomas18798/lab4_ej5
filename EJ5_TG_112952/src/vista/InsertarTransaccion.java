/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorTransaccion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import modelo.Transaccion;
import modelo.Vendedor;

/**
 *
 * @author tom
 */
public class InsertarTransaccion extends javax.swing.JFrame {

    private ControladorTransaccion controlador;

    public InsertarTransaccion(ControladorTransaccion _controlador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = _controlador;
        cargarLista();
        cargarComboV();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboTipoOperacion = new javax.swing.JComboBox<>();
        cboTipoInmueble = new javax.swing.JComboBox<>();
        cboVendedor = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTransacciones = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVentaMayor = new javax.swing.JButton();
        btnPorcentajeAlquiler = new javax.swing.JButton();
        btnTransOficina = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Insertar Transaccion");

        jLabel2.setText("Fecha dd/mm/yyyy");

        jLabel3.setText("Vendedor");

        jLabel4.setText("Tipo de operacion");

        jLabel5.setText("Tipo de inmueble");

        jLabel6.setText("Monto");

        cboTipoOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alquiler", "Venta" }));

        cboTipoInmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oficina", "Local", "Casa" }));

        jButton1.setText("btnLimpiar");

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaTransacciones);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Transacciones Realizadas");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Reportes");

        btnVentaMayor.setText("Venta de mayor valor");
        btnVentaMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaMayorActionPerformed(evt);
            }
        });

        btnPorcentajeAlquiler.setText("Porcentaje de alquiler");
        btnPorcentajeAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeAlquilerActionPerformed(evt);
            }
        });

        btnTransOficina.setText("Transacciones de oficina");
        btnTransOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransOficinaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(78, 78, 78)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboVendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboTipoOperacion, 0, 109, Short.MAX_VALUE)
                            .addComponent(cboTipoInmueble, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPorcentajeAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVentaMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTransOficina, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboTipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVentaMayor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPorcentajeAlquiler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTransOficina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String fecha = txtFecha.getText();
        int idVendedor = cboVendedor.getSelectedIndex() + 1;
        String nombreV = cboVendedor.getItemAt(idVendedor - 1);
        Vendedor vendedor = new Vendedor(idVendedor, nombreV);

        int tipoOperacion = cboTipoOperacion.getSelectedIndex();
        int tipoInmueble = cboTipoInmueble.getSelectedIndex();
        float monto = Float.valueOf(txtMonto.getText());
        Transaccion newT = new Transaccion(fecha, vendedor, tipoOperacion, tipoInmueble, monto);

        if (controlador.insertarTransaccion(newT) == true) {
            JOptionPane.showMessageDialog(this, "Transaccion registrada");

            cargarLista();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVentaMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaMayorActionPerformed

        Transaccion t = controlador.transaccionDeMayorValor();

        String result = "La transaccion de mayor valor: Nº " + t.getId() + " - Monto " + t.getMonto() + " - Vendedor " + t.getVendedor().getNombreVendedor() + " - Operacion " + t.getTipoOperacion() + " - Inmueble " + t.getTipoInmueble();

        JOptionPane.showMessageDialog(rootPane, result);
    }//GEN-LAST:event_btnVentaMayorActionPerformed

    private void btnPorcentajeAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeAlquilerActionPerformed

        List<Transaccion> transacciones = controlador.obtenerTransacciones();
        int cantTransacciones = 0;
        int cantAlquiler = 0;

        for (Transaccion t : transacciones) {
            cantTransacciones++;
            if (t.getTipoOperacion() == 0) {
                cantAlquiler++;
            }
        }
        float porcentaje = (cantAlquiler * 100) / cantTransacciones;

        String result = "Del total de " + cantTransacciones + " transaciones, el %" + porcentaje + " son de Alquiler";

        JOptionPane.showMessageDialog(rootPane, result);
    }//GEN-LAST:event_btnPorcentajeAlquilerActionPerformed

    private void btnTransOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransOficinaActionPerformed
        List<Transaccion> transacciones = controlador.obtenerTransacciones();
        int cantTransacciones = 0;
        int cantOficina = 0;

        for (Transaccion t : transacciones) {
            cantTransacciones++;
            if (t.getTipoOperacion() == 1) {
                cantOficina++;
            }
        }

        String result = "Del total de " + cantTransacciones + " transaciones, "+cantOficina+" son de Oficinas";

        JOptionPane.showMessageDialog(rootPane, result);
    }//GEN-LAST:event_btnTransOficinaActionPerformed

    public void cargarComboV() {
        List<Vendedor> lista = controlador.obtenerVendedores();

        for (Vendedor vendedor : lista) {
            cboVendedor.addItem(vendedor.getNombreVendedor());
        }
    }

    public void cargarLista() {

        List<Transaccion> lista = controlador.obtenerTransacciones();

        Transaccion[] array = new Transaccion[lista.size()];

//        for (Transaccion transaccion : lista) {
//            int c = 0;
//            array[c] = transaccion;
//            c++;
//        }
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        listaTransacciones.setListData(array);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPorcentajeAlquiler;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTransOficina;
    private javax.swing.JButton btnVentaMayor;
    private javax.swing.JComboBox<String> cboTipoInmueble;
    private javax.swing.JComboBox<String> cboTipoOperacion;
    private javax.swing.JComboBox<String> cboVendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Transaccion> listaTransacciones;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
