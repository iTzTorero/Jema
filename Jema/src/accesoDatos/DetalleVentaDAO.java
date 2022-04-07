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
import objetoNegocio.DetalleVenta;

/**
 *
 * @author Juan Pablo
 */
public class DetalleVentaDAO extends DatabaseConection implements IDAO<DetalleVenta> {

    public DetalleVentaDAO() {
        super();
    }

    @Override
    public void insertar(DetalleVenta obj) throws Exception {
        String sql = "INSERT INTO `detalle_venta` (`iddetalle_venta`, `idestadoventa`, `precio`, `idcliente`, `idusuario`, `idventa`, `idServicio`) VALUES (NULL, ?, ?, ?, ?, ?, ?);";     
        PreparedStatement ps;
        ps = con.prepareStatement(sql);
        ps.setInt(1, obj.getIdEstadoVenta());
        ps.setFloat(2, obj.getPrecio());
        ps.setInt(3, obj.getIdCliente());
        ps.setInt(4, obj.getIdUsuario());
        ps.setInt(5, obj.getIdVenta());
        ps.setInt(6, obj.getIdServicio());

        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void actualizar(DetalleVenta obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) throws Exception {
        String sql = String.format("DELETE FROM detalleventa WHERE iddetalle_venta = %d", id);
        Statement statement = con.createStatement();

        int registroAfectado = statement.executeUpdate(sql);
        if (registroAfectado != 1) {
            throw new Exception("El cliente no ha podido ser eliminado.");
        }
    }

    @Override
    public DetalleVenta consultarPorId(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet consultarTodos() throws Exception {
        String sql = "SELECT * FROM `detalleVenta`";
        try {
            return stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
