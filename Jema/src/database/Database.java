/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Pablo
 */
public class Database {

    private String usuario = "root";
    private String clave = "";
    private String url = "jdbc:mysql://localhost:3306/jema";
    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    /**
     * Constructor de la clase.
     */
    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Conexion
        try {
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet consultaClientes() throws SQLException {
        String sql = "SELECT * FROM `cliente`";
        return stmt.executeQuery(sql);
    }

    public ResultSet consultarUsuarios() throws SQLException {
        String sql = "SELECT * FROM `usuario`";
        return stmt.executeQuery(sql);
    }

    public ResultSet consultarVentas() throws SQLException {
        String sql = "SELECT * FROM `venta`";
        return stmt.executeQuery(sql);
    }

    public void insertarCliente(String nombre, String telefono1, String telefono2) throws SQLException {
        String sql = "INSERT INTO `cliente` (`idcliente`,`nombre`, `telefono1`, `telefono2`) VALUES (NULL, ?, ?, ?)";
        PreparedStatement ps;
        ps = con.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setString(2, telefono1);
        ps.setString(3, telefono2);

        ps.executeUpdate();
        ps.close();
    }

    public void insertarUsuario(String nombre, String contrasena, String direccion, String telefono1, String telefono2) throws SQLException {
        String sql = "INSERT INTO `usuario` (`idusuario`, `nombre`, `contrasena`, `direccion`, `telefono1`, `telefono2`) VALUES (NULL, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        ps = con.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setString(2, contrasena);
        ps.setString(3, direccion);
        ps.setString(4, telefono1);
        ps.setString(5, telefono2);

        ps.executeUpdate();
        ps.close();
    }

    public void insertarVenta(Date date,float total) throws SQLException {
        String sql = "INSERT INTO `usuario` (`idusuario`, `nombre`, `contrasena`, `direccion`, `telefono1`, `telefono2`) VALUES (NULL, ?, ?, ?, ?, ?)";
        PreparedStatement ps;

        ps = con.prepareStatement(sql);
        ps.setDate(1, date);
        ps.setFloat(2, total);

        ps.executeUpdate();
        ps.close();
    }
}
