/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import factory.FactoryAccesoDatos;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.DetalleVenta;
import textPrompt.TextPrompt;

/**
 *
 * @author Orlando Mendivil
 */
public class ActualizarDetalleVenta extends javax.swing.JFrame {
    FactoryAccesoDatos acceso;
    /**
     * Creates new form Actualizar
     */
    public ActualizarDetalleVenta() {
        initComponents();
        
        TextPrompt phCliente = new TextPrompt("Cliente", txtCliente);
        phCliente.setForeground(Color.GRAY);
        TextPrompt phTelefono = new TextPrompt("Telefono", txtTelefonoC);
        phTelefono.setForeground(Color.GRAY);
        TextPrompt phCantidad = new TextPrompt("Precio", txtCantidad);
        phCantidad.setForeground(Color.GRAY);
        TextPrompt phDescrip = new TextPrompt("Descripcion", txtDescripcion);
        phDescrip.setForeground(Color.GRAY);
        
        acceso = new FactoryAccesoDatos();
        
        llenarTabla();
        try {
            cb_servicios.setModel(acceso.obtenerServicioDAO().consultarServicioCB());
        } catch (Exception ex) {
            Logger.getLogger(ActualizarDetalleVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.tablaClientes.setShowGrid(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtTelefonoC = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        cb_servicios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actualizar");

        jPanel1.setBackground(new java.awt.Color(162, 201, 227));

        jPanel2.setBackground(new java.awt.Color(111, 159, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar");

        txtCliente.setEnabled(false);

        txtTelefonoC.setEnabled(false);

        txtCantidad.setEnabled(false);

        txtDescripcion.setEnabled(false);

        btn_aceptar.setBackground(new java.awt.Color(34, 145, 44));
        btn_aceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(193, 52, 52));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        cb_servicios.setEnabled(false);
        cb_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_serviciosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Servicio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtDescripcion)
                        .addComponent(txtCantidad)
                        .addComponent(txtTelefonoC)
                        .addComponent(txtCliente))
                    .addComponent(cb_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(162, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );

        tablaClientes.setBackground(new java.awt.Color(110, 157, 211));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cliente", "Telefono", "Descripci??n", "Precio", "Servicio"
            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Menu menu = new Menu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        actualizar();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void cb_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_serviciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_serviciosActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        editar();
    }//GEN-LAST:event_tablaClientesMouseClicked
    
    private void activarCampos() {
        cb_servicios.setEnabled(true);
        txtCantidad.setEnabled(true);
        txtDescripcion.setEnabled(true);
    }
    
    private void desactivarCampos() {
        cb_servicios.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtDescripcion.setEnabled(false);
    }

    private void editar() {
        try {
            int indice = this.tablaClientes.getSelectedRow();
            if (indice == -1) {
                JOptionPane.showMessageDialog(this, "Debe de seleccionar una fila", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
                int id = (int) modelo.getValueAt(indice, 0);
                DetalleVenta detVenta = acceso.obtenerDetalleVentaDAO().consultarPorId(id);
                
                if (detVenta != null) {
                    activarCampos();
                    cargarDatos(detVenta);
                }else{
                    JOptionPane.showMessageDialog(this, "No existe el detalle venta seleccionado", "AVISO",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
    }
    
    private void actualizar(){
          try {
            int indice = this.tablaClientes.getSelectedRow();
            if (indice == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione un detalle venta para modificar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                int opcion = JOptionPane.showConfirmDialog(this, "??Estas seguro de que desea modificar este detalle venta?", "Confirme su selecci??n",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (opcion == JOptionPane.YES_OPTION) {
                    DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
                    int id = (int) modelo.getValueAt(indice, 0);
                    
                    DetalleVenta detVenta = acceso.obtenerDetalleVentaDAO().consultarPorId(id);
                    
                    
                    int idServicio = acceso.obtenerServicioDAO().consultarPorNombre(this.cb_servicios.getSelectedItem().toString()).getIdServicio();
                    System.out.println(idServicio);
                    
                    detVenta.setIdServicio(idServicio);
                    detVenta.setCantidad(Integer.parseInt(txtCantidad.getText()));
                    detVenta.setDesc(txtDescripcion.getText());
                                  
                    acceso.obtenerDetalleVentaDAO().actualizar(detVenta);
                    
                    llenarTabla();
                    limpiar();
                    JOptionPane.showMessageDialog(this, "Se ha modificado el detalle de la venta","INFORMACI??N",JOptionPane.INFORMATION_MESSAGE);

                }
            }
        } catch (Exception ex) {
              System.out.println(ex.getMessage());
                
        }
    }  
    
    public void llenarTabla() {
        try {
            ArrayList<DetalleVenta> listaDetalle = acceso.obtenerDetalleVentaDAO().consultar();
            DefaultTableModel modeloTabla = (DefaultTableModel) this.tablaClientes.getModel();
            modeloTabla.setRowCount(0);
            for (DetalleVenta listaDetalle1 : listaDetalle) {
                Object[] filaDatos = new Object[6];
                filaDatos[0] = listaDetalle1.getIddetalle_venta();
                filaDatos[1] = acceso.obtenerClienteDAO().consultarPorId(listaDetalle1.getIdCliente()).getNombre();
                filaDatos[2] = acceso.obtenerClienteDAO().consultarPorId(listaDetalle1.getIdCliente()).getTelefono1();
                filaDatos[3] = listaDetalle1.getDesc();
                filaDatos[4] = listaDetalle1.getCantidad();
                filaDatos[5] = acceso.obtenerServicioDAO().consultarPorId(listaDetalle1.getIdServicio()).getNombre();
              
                
                modeloTabla.addRow(filaDatos);

            }

        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
    }
    
    private void limpiar() {
        this.txtCliente.setText("");
        this.txtDescripcion.setText("");
        cb_servicios.setSelectedIndex(0);
        this.txtCantidad.setText("");
        this.txtTelefonoC.setText("");
    }

    private void cargarDatos(DetalleVenta detalleVenta) {
        try {
            cb_servicios.setModel(acceso.obtenerServicioDAO().consultarServicioCB());
      
            this.txtCliente.setText(acceso.obtenerClienteDAO().consultarPorId(detalleVenta.getIdCliente()).getNombre());
            this.txtTelefonoC.setText(acceso.obtenerClienteDAO().consultarPorId(detalleVenta.getIdCliente()).getTelefono1());
            this.cb_servicios.setSelectedItem(acceso.obtenerServicioDAO().consultarPorId(detalleVenta.getIdServicio()).getNombre());
            this.txtDescripcion.setText(detalleVenta.getDesc());
            this.txtCantidad.setText(Float.toString(detalleVenta.getCantidad()));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cb_servicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtTelefonoC;
    // End of variables declaration//GEN-END:variables
}
