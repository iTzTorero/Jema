/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Pablo
 */
public class DatabaseConection {

    private String usuario = "root";
    private String clave = "";
    private String url = "jdbc:mysql://localhost:3306/jema?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Connection con;
    Statement stmt;
   

    /**
     * Constructor de la clase.
     */
    public DatabaseConection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConection.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Conexion
        try {
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConection.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
