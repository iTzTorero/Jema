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
import objetoNegocio.Servicio;

/**
 *
 * @author Juan Pablo
 */
public class ServicioDAO extends Database implements IDAO<Servicio> {

    public ServicioDAO() {
        super();
    }

    @Override
    public void insertar(Servicio obj) throws Exception {
        String sql = "INSERT INTO `servicio` (`idServicio`,`nombre`, `costo`) VALUES (NULL, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ps.setString(1, obj.getNombre());
        ps.setString(2, String.valueOf(obj.getCosto()));

        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void actualizar(Servicio obj) throws Exception {
        String sql = String.format("UPDATE servicio SET nombre = '%s', costo = '%f' WHERE idServicio = %d",
                obj.getNombre(),
                obj.getCosto(),
                obj.getIdServicio());

        Statement statement = con.createStatement();
        
        int registroAfectado = statement.executeUpdate(sql);
        if(registroAfectado != 1){
            throw new Exception("El servicio no ha podido ser actualizado.");
        }
    }

    @Override
    public void eliminar(int id) throws Exception {
        String sql = String.format("DELETE FROM servicio WHERE idServicio = %d", id);
        Statement statement = con.createStatement();

        int registroAfectado = statement.executeUpdate(sql);
        if (registroAfectado != 1) {
            throw new Exception("El servicio no ha podido ser eliminado.");
        }
    }

    @Override
    public Servicio consultarPorId(int id) throws Exception {
//        String sql = "SELECT * FROM `cliente` WHERE cliente.idcliente = 1";
//        ResultSet rs = stmt.executeQuery(sql);
//        rs.next();
//        return new Servicio(rs.getNString("nombre"), rs.getFloat("costo"));
        return new Servicio(); //METODO INCOMPLETO
    }

    @Override
    public ResultSet consultarTodos() throws Exception {
        String sql = "SELECT * FROM `servicio`";
        try {
            return stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
