/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import accesoDatos.ClienteDAO;
import accesoDatos.DatabaseConection;
import com.sun.glass.events.KeyEvent;
import factory.FactoryAccesoDatos;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.DetalleVenta;
import objetoNegocio.Venta;
import textPrompt.TextPrompt;
import validacion.*;

/**
 *
 * @author PC
 */
public class Principal extends javax.swing.JFrame {
    ValidarCampos validar = new ValidarCampos();
    FactoryAccesoDatos acceso = new FactoryAccesoDatos();
    static float importe = 0;
    ArrayList<DetalleVenta> detallesVenta;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.tableDesc.setShowGrid(true);
        // llenarComboboxClientes();

        TextPrompt phPiezas = new TextPrompt("Inserte el número de piezas", txtNoPiezas);
        TextPrompt phDescripcion = new TextPrompt("Inserte una descripción", txtDescRopa);
        TextPrompt phPrecioU = new TextPrompt("Inserte el precio unitario", txtPrecioU);
        TextPrompt phImporte = new TextPrompt("Inserte el importe", txtImporte);

        try {
            cb_clientes.setModel(acceso.obtenerClienteDAO().consultarClientesCB());
            cb_servicios.setModel(acceso.obtenerServicioDAO().consultarServicioCB());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        detallesVenta = new ArrayList();
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
        jPanel3 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnLimpiarC = new javax.swing.JButton();
        cb_clientes = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txtNoPiezas = new javax.swing.JTextField();
        txtDescRopa = new javax.swing.JTextField();
        txtPrecioU = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        btnLimpiarC1 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        cb_servicios = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDesc = new javax.swing.JTable();
        btnCancelarR = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblNumNota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Servicio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fecha:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Entrega:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 70, 35));
        jPanel3.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, 35));

        btnLimpiarC.setBackground(new java.awt.Color(255, 102, 102));
        btnLimpiarC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiarC.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarC.setText("Limpiar ");
        btnLimpiarC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 140, 40));

        cb_clientes.setBackground(new java.awt.Color(255, 155, 155));
        cb_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cb_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 230, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 450, 290));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNoPiezas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNoPiezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoPiezasActionPerformed(evt);
            }
        });
        jPanel2.add(txtNoPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 230, 40));

        txtDescRopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescRopaActionPerformed(evt);
            }
        });
        jPanel2.add(txtDescRopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 400, 90));

        txtPrecioU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, 50));

        txtImporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteActionPerformed(evt);
            }
        });
        jPanel2.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 50));

        btnLimpiarC1.setBackground(new java.awt.Color(255, 102, 102));
        btnLimpiarC1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiarC1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarC1.setText("Limpiar ");
        btnLimpiarC1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiarC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarC1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiarC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 140, 40));

        btnAgregar.setBackground(new java.awt.Color(51, 255, 102));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 140, 40));

        cb_servicios.setBackground(new java.awt.Color(255, 155, 155));
        jPanel2.add(cb_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 170, 50));

        label1.setText("Servicio");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 450, 390));

        tableDesc.setBackground(new java.awt.Color(255, 155, 155));
        tableDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableDesc.setFont(new java.awt.Font("Tahoma", 0, 12));
        tableDesc.setForeground(new java.awt.Color(255, 255, 255));
        tableDesc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "PZ", "Descripción", "Servicio", "Precio Unitario ", "Importe "
            }
        ));
        tableDesc.setGridColor(new java.awt.Color(255, 255, 255));
        tableDesc.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableDesc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 730, 580));

        btnCancelarR.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelarR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCancelarR.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarR.setText("Cancelar ");
        btnCancelarR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 670, 250, 60));

        btnRegistrar.setBackground(new java.awt.Color(102, 255, 102));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar ");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 230, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("NOTA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        lblNumNota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNumNota.setForeground(new java.awt.Color(255, 153, 153));
        jPanel1.add(lblNumNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 30, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1920, 1060));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoPiezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoPiezasActionPerformed
         
    }//GEN-LAST:event_txtNoPiezasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Se agregan los detalle venta
        actualizarTabla();
        double precioUnit = 0.0;
            try {
                detallesVenta.add(new DetalleVenta(acceso.obtenerServicioDAO().consultarPorNombre(cb_servicios.getSelectedItem().toString()).getIdServicio(),
                        acceso.obtenerServicioDAO().consultarPorNombre(cb_servicios.getSelectedItem().toString()).getCosto(), acceso.obtenerClienteDAO().consultarPorNombre(cb_clientes.getSelectedItem().toString()).getIdcliente(), 0));
                //Agregar los ids del cliente seleccionado
       //         acceso.obtenerDetalleVentaDAO().insertar(new DetalleVenta(acceso.obtenerServicioDAO().consultarPorNombre("Lavado").getIdServicio(),
         //               acceso.obtenerServicioDAO().consultarPorNombre("Lavado").getCosto(), acceso.obtenerClienteDAO().consultarPorNombre(cb_clientes.getSelectedItem().toString()).getIdcliente(), 0));
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        

            precioUnit += acceso.obtenerServicioDAO().consultarPorNombre(cb_servicios.getSelectedItem().toString()).getCosto();
        

        txtPrecioU.setText(String.valueOf(precioUnit));
        importe = (float) (precioUnit * Integer.parseInt(txtNoPiezas.getText()));

        //Falta agregarlos al arraylist

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnCancelarRActionPerformed

    private void btnLimpiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCActionPerformed
      
        jDateChooser1.setCalendar(null);
        jDateChooser2.setCalendar(null);
    }//GEN-LAST:event_btnLimpiarCActionPerformed

    private void btnLimpiarC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarC1ActionPerformed
        // TODO add your handling code here:
        txtNoPiezas.setText("");
        txtDescRopa.setText("");
        txtImporte.setText("");
        txtPrecioU.setText("");
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarC1ActionPerformed
    private void actualizarTabla() {
        String servicio = "";
        DefaultTableModel modelo = (DefaultTableModel) tableDesc.getModel();
        Object[] fila = new Object[5];
        fila[0] = txtNoPiezas.getText();
        fila[1] = txtDescRopa.getText();
        servicio = cb_servicios.getSelectedItem().toString();
        fila[2] = servicio;
        fila[3] = "$ " + txtPrecioU.getText();
        fila[4] = "$ " + txtImporte.getText();
        
        modelo.addRow(fila);
        tableDesc.setModel(modelo);

    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (jDateChooser2.getDate().after(jDateChooser2.getDate())) {
            try {
                // falta obtener el usuario de la sesión actual y guardar los detalle venta en el arreglo:
                
                acceso.obtenerVentaDAO().insertar(new Venta(new java.sql.Date(jDateChooser1.getDate().getTime()), importe, acceso.obtenerUsuarioDAO().consultarPorId(0), detallesVenta));
                
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtPrecioUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUActionPerformed

    private void txtImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteActionPerformed

    private void txtDescRopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescRopaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescRopaActionPerformed
    private void limpiarTabla() {
        tableDesc.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "PZ", "Descripción", "Precio Unitario ", "Importe "
                }
        ));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelarR;
    private javax.swing.JButton btnLimpiarC;
    private javax.swing.JButton btnLimpiarC1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cb_clientes;
    private javax.swing.JComboBox<String> cb_servicios;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel lblNumNota;
    private javax.swing.JTable tableDesc;
    private javax.swing.JTextField txtDescRopa;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNoPiezas;
    private javax.swing.JTextField txtPrecioU;
    // End of variables declaration//GEN-END:variables
}
