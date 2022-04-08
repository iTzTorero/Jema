/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import factory.FactoryAccesoDatos;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.DetalleVenta;
import objetoNegocio.Servicio;
import objetoNegocio.Usuario;
import objetoNegocio.Cliente;
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
    ArrayList<Float> total;
    private static Usuario usuario1;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.tableDesc.setShowGrid(true);

        TextPrompt phDescripcion = new TextPrompt("Inserte una descripción", txtArea_Descripcion);
        TextPrompt phPrecioU = new TextPrompt("Inserte el precio unitario", txtPrecioU);

        try {
            cb_clientes.setModel(acceso.obtenerClienteDAO().consultarClientesCB());
            cb_servicios.setModel(acceso.obtenerServicioDAO().consultarServicioCB());
            this.usuario1 = acceso.obtenerUsuarioDAO().consultarPorId(2);
            
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        detallesVenta = new ArrayList();
        total = new ArrayList<>();
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
        jLabel4 = new javax.swing.JLabel();
        fechaEntrega = new com.toedter.calendar.JDateChooser();
        btnLimpiarC = new javax.swing.JButton();
        cb_clientes = new javax.swing.JComboBox<>();
        label2 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        txtPrecioU = new javax.swing.JTextField();
        btnLimpiarC1 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        cb_servicios = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea_Descripcion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDesc = new javax.swing.JTable();
        btnCancelarR = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblNumNota = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Servicio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Entrega:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 35));
        jPanel3.add(fechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, 35));

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
        jPanel3.add(btnLimpiarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 40));

        cb_clientes.setBackground(new java.awt.Color(255, 155, 155));
        cb_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cb_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 50));

        label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label2.setText("Cliente:");
        jPanel3.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 400, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtPrecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 50));

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
        jPanel2.add(btnLimpiarC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 140, 40));

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
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 140, 40));

        cb_servicios.setBackground(new java.awt.Color(255, 155, 155));
        jPanel2.add(cb_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 50));

        label1.setText("Servicio");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtArea_Descripcion.setColumns(20);
        txtArea_Descripcion.setRows(5);
        jScrollPane2.setViewportView(txtArea_Descripcion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 400, 390));

        tableDesc.setBackground(new java.awt.Color(255, 155, 155));
        tableDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableDesc.setFont(new java.awt.Font("Tahoma", 0, 12));
        tableDesc.setForeground(new java.awt.Color(255, 255, 255));
        tableDesc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Descripción", "Servicio", "Precio Unitario ", "Importe "
            }
        ));
        tableDesc.setGridColor(new java.awt.Color(255, 255, 255));
        tableDesc.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableDesc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 730, 580));

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
        jPanel1.add(btnCancelarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 640, 250, 60));

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
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 230, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("NOTA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        lblNumNota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNumNota.setForeground(new java.awt.Color(255, 153, 153));
        jPanel1.add(lblNumNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 30, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("NOTA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1920, 1060));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Se agregan los detalle venta
        actualizarTabla();


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        this.dispose();
        
        this.activarCampos();
        
        menu.setVisible(true);
    }//GEN-LAST:event_btnCancelarRActionPerformed

    private void btnLimpiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCActionPerformed
        cb_clientes.setSelectedIndex(0);
        fechaEntrega.setCalendar(null);
    }//GEN-LAST:event_btnLimpiarCActionPerformed

    private void btnLimpiarC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarC1ActionPerformed
        txtArea_Descripcion.setText("");
        txtPrecioU.setText("");
        cb_servicios.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnLimpiarC1ActionPerformed
    
    private void actualizarTabla() {
        try {
            Cliente cliente = acceso.obtenerClienteDAO().consultarPorNombre(cb_clientes.getSelectedItem().toString());
            Servicio servicios = acceso.obtenerServicioDAO().consultarPorNombre(cb_servicios.getSelectedItem().toString());
            String servicio = "";
            Servicio ser = acceso.obtenerServicioDAO().consultarPorNombre(cb_servicios.getSelectedItem().toString());
            float precioServcicio = ser.getCosto();
            DefaultTableModel modelo = (DefaultTableModel) tableDesc.getModel();
            Object[] fila = new Object[4];
            fila[0] = txtArea_Descripcion.getText();
            servicio = cb_servicios.getSelectedItem().toString();
            fila[1] = servicio;
            fila[2] = txtPrecioU.getText();
            fila[3] = (Float) (Float.parseFloat(txtPrecioU.getText()) + precioServcicio);

            modelo.addRow(fila);
            tableDesc.setModel(modelo);

            total.add((Float) (Float.parseFloat(txtPrecioU.getText()) + precioServcicio));
            detallesVenta.add(new DetalleVenta(Float.parseFloat(txtPrecioU.getText()),
                    txtArea_Descripcion.getText(), cliente.getIdcliente(), usuario1.getIdUsuario(), servicios.getIdServicio()));
            
            limpiarCamposC2();
            
            this.desactivarCampos();
                      

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            llenarArrayList();
            Date now = new Date();
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            String mysqlDateString = formatter.format(now);

            acceso.obtenerVentaDAO().insertar(new Venta(new java.sql.Date(now.getTime()), calcularTotal(total), new java.sql.Date(fechaEntrega.getDate().getTime())));

            guardarDetalleVenta();
            JOptionPane.showMessageDialog(this, "Se ha registrado la venta.", "Exito!!", JOptionPane.INFORMATION_MESSAGE);
            
            this.activarCampos();
            
            limpiarTabla();
            limpiarCamposC1();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se ha podido registrar la venta.", "Error!!", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private float calcularTotal(ArrayList total) {
        float totalT = (float) 0.0;
        for (int i = 0; i < total.size(); i++) {
            totalT += Float.parseFloat(total.get(i).toString());
        }
        return totalT;
    }
    
    private void limpiarCamposC1() {
        cb_clientes.setSelectedIndex(0);
        fechaEntrega.setCalendar(null);
    }

    private void limpiarCamposC2(){
        txtArea_Descripcion.setText("");
        txtPrecioU.setText("");
        cb_servicios.setSelectedIndex(0);
        
    }


    public void guardarDetalleVenta() {
        try {
            
            for (int i = 0; i < detallesVenta.size(); i++) {
                detallesVenta.get(i).setIdVenta(acceso.obtenerVentaDAO().consultarUltimo().getIdventa());
            }
            for (int i = 0; i < detallesVenta.size(); i++) {
                acceso.obtenerDetalleVentaDAO().insertar(detallesVenta.get(i));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    private void llenarArrayList() {
        try {
            Cliente cliente = acceso.obtenerClienteDAO().consultarPorNombre(cb_clientes.getSelectedItem().toString());
            Servicio servicios = acceso.obtenerServicioDAO().consultarPorNombre(cb_servicios.getSelectedItem().toString());
            for (int i = 0; i < tableDesc.getRowCount(); i++) {
                detallesVenta.add(new DetalleVenta(Float.parseFloat(tableDesc.getValueAt(i, 2).toString()),
                        tableDesc.getValueAt(i, 0).toString(), cliente.getIdcliente(), usuario1.getIdUsuario(), servicios.getIdServicio()));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) tableDesc.getModel();
        model.setRowCount(0);
    }
    
    private void activarCampos() {
        cb_clientes.setEnabled(true);
        fechaEntrega.setEnabled(true);
        btnLimpiarC.setEnabled(true);
    }

    private void desactivarCampos() {
        cb_clientes.setEnabled(false);
        fechaEntrega.setEnabled(false);
        btnLimpiarC.setEnabled(false);
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
    private com.toedter.calendar.JDateChooser fechaEntrega;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JLabel lblNumNota;
    private javax.swing.JTable tableDesc;
    private javax.swing.JTextArea txtArea_Descripcion;
    private javax.swing.JTextField txtPrecioU;
    // End of variables declaration//GEN-END:variables
}
