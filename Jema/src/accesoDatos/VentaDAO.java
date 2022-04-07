/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetoNegocio.Venta;

/**
 *
 * @author Juan Pablo
 */
public class VentaDAO extends DatabaseConection implements IDAO<Venta> {

    public VentaDAO() {
        super();
    }

    @Override
    public void insertar(Venta obj) throws Exception {

        String sql = "INSERT INTO `venta` (`idventa`,`fecha`,`total`) VALUES (NULL, ?, ?)";
        PreparedStatement ps;

        ps = con.prepareStatement(sql);
        ps.setDate(1, obj.getFecha());
        ps.setFloat(2, obj.getTotal());

        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void actualizar(Venta obj) throws Exception {
        String sql = String.format("UPDATE venta SET fecha = 'date', total = '%f' WHERE idventa = %d",
                obj.getFecha(),
                obj.getTotal(),
                obj.getIdventa());
                
        Statement statement = con.createStatement();

        int registroAfectado = statement.executeUpdate(sql);
        if (registroAfectado != 1) {
            throw new Exception("La venta no ha podido ser actualizada.");
        }
    }

    @Override
    public void eliminar(int id) throws Exception {
        String sql = String.format("DELETE FROM venta WHERE idventa = %d", id);
        Statement statement = con.createStatement();

        int registroAfectado = statement.executeUpdate(sql);
        if (registroAfectado != 1) {
            throw new Exception("La venta no ha podido ser eliminado.");
        }
    }

    @Override
    public Venta consultarPorId(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet consultarTodos() throws Exception {

        try {
            String sql = "SELECT * FROM `venta`";
            return stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
