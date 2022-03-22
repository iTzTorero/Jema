/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetoNegocio.Corte;

/**
 *
 * @author Juan Pablo
 */
public class CorteDAO extends Database implements IDAO<Corte> {

    public CorteDAO() {
        super();
    }

    @Override
    public void insertar(Corte corte) throws Exception {
       
        String sql = "INSERT INTO `corte` (`fecha`,`total`, `idUsuario`) VALUES (NULL, ?, ?)";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CorteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ps.setDate(1, corte.getFecha());
        ps.setFloat(2, corte.getTotal());
        ps.setInt(3, corte.getIdUsuario());

        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void actualizar(Corte obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Corte consultarPorId(int id) throws Exception {
        String sql = "SELECT * FROM `cliente` WHERE cliente.idcliente = 1";
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        return new Corte(rs.getDate("fecha"), rs.getFloat("total"), rs.getInt("idUsuario"));
    }

    @Override
    public ResultSet consultarTodos() throws Exception {
        String sql = "SELECT * FROM `corte`";
        try {
            return stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
