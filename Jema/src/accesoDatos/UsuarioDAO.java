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
import objetoNegocio.Cliente;
import objetoNegocio.Servicio;
import objetoNegocio.Usuario;

/**
 *
 * @author Juan Pablo
 */
public class UsuarioDAO extends DatabaseConection implements IDAO<Usuario> {

    public UsuarioDAO() {
        super();
    }

    @Override
    public void insertar(Usuario obj) throws Exception {
        String sql = "INSERT INTO `usuario` (`idusuario`, `nombre`, `contrasena`, `direccion`, `telefono1`, `telefono2`) VALUES (NULL, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        ps = con.prepareStatement(sql);
        ps.setString(1, obj.getNombre());
        ps.setString(2, obj.getContrasena());
        ps.setString(3, obj.getDireccion());
        ps.setString(4, obj.getTelefono1());
        ps.setString(5, obj.getTelefono2());

        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void actualizar(Usuario obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) throws Exception {
        String sql = String.format("DELETE FROM usuario WHERE idusuario = %d", id);
        Statement statement = con.createStatement();

        int registroAfectado = statement.executeUpdate(sql);
        if (registroAfectado != 1) {
            throw new Exception("El usuario no ha podido ser eliminado.");
        }
    }

    @Override
    public Usuario consultarPorId(int id) throws Exception {
                try {
            String sql = "SELECT * FROM usuario WHERE idusuario = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            return new Usuario(rs.getInt("idusuario"),rs.getNString("nombre"),rs.getNString("contrasena"),rs.getNString("direccion"),rs.getNString("telefono1"),rs.getNString("telefono2"));
        } catch (SQLException e) {

        }
        return null;

    }

    @Override
    public ResultSet consultarTodos() throws Exception {
        try {
            String sql = "SELECT * FROM `usuario`";
            return stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Usuario consultarUsuarioPorNombre(String nombre) throws SQLException{
        String sql = String.format("SELECT * FROM usuario WHERE nombre = ?");
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, nombre);
        ResultSet rs  = pstmt.executeQuery();
        rs.next();
        return new Usuario(rs.getNString("nombre"), rs.getNString("contrasena"), rs.getNString("direccion"), rs.getNString("telefono1"), rs.getNString("telefono2"));
       
    }

}
