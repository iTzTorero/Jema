/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import objetoNegocio.Cliente;

/**
 *
 * @author Juan Pablo
 */
public class ClienteDAO extends DatabaseConection implements IDAO<Cliente> {

    public ClienteDAO() {
        super();
    }

    @Override
    public void insertar(Cliente cliente) throws Exception {
        String sql = "INSERT INTO `cliente` (`idcliente`,`nombre`, `telefono1`, `telefono2`) VALUES (NULL, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ps.setString(1, cliente.getNombre());
        ps.setString(2, cliente.getTelefono1());
        ps.setString(3, cliente.getTelefono2());

        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void actualizar(Cliente obj) throws Exception {
        String sql = String.format("UPDATE cliente SET nombre = '%s', telefono1 = '%s', telefono2 = '%s' WHERE idcliente = %d",
                obj.getNombre(),
                obj.getTelefono1(),
                obj.getTelefono2(),
                obj.getIdcliente());

        Statement statement = con.createStatement();

        int registroAfectado = statement.executeUpdate(sql);
        if (registroAfectado != 1) {
            throw new Exception("El cliente no ha podido ser actualizado.");
        }
    }

    @Override
    public void eliminar(int id) throws Exception {
        String sql = String.format("DELETE FROM cliente WHERE idcliente = %d", id);
        Statement statement = con.createStatement();

        int registroAfectado = statement.executeUpdate(sql);
        if (registroAfectado != 1) {
            throw new Exception("El cliente no ha podido ser eliminado.");
        }
    }

    @Override
    public Cliente consultarPorId(int id) throws Exception {
        try {
            String sql = "SELECT * FROM cliente WHERE idcliente = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
        return new Cliente(rs.getNString("nombre"), rs.getNString("telefono1"), rs.getNString("telefono2"));
        }catch(Exception ex){
                System.out.println(ex.getMessage());
                }
        return null;
    }

    public Cliente consultarPorNombre(String nombre) throws SQLException {
  try {
            String sql = "SELECT * FROM cliente WHERE nombre = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, nombre);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            return new Cliente(rs.getInt("idcliente"),rs.getNString("nombre"),rs.getNString("telefono1"),rs.getNString("telefono2"));
        } catch (SQLException e) {

        }
        return null;

    }

    public DefaultComboBoxModel consultarClientesCB() throws Exception {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         modelo.addElement("Seleccione un cliente:");
        ResultSet rs = consultarTodos();
        rs.next();
        do {
            modelo.addElement(rs.getString("nombre"));

        }while(rs.next());
        
        return modelo;

    }

    public Cliente consultarPorTelefono(String telefono) throws SQLException {
        String sql = String.format("SELECT * FROM 'cliente' WHERE telefono1 = %s", telefono);
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        return new Cliente(rs.getNString("nombre"), rs.getNString("telefono1"), rs.getNString("telefono2"));
    }

    @Override
    public ResultSet consultarTodos() throws Exception {
        String sql = "SELECT * FROM `cliente` ORDER BY nombre ASC";
        try {
            return stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
