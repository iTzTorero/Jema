/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import accesoDatos.ClienteDAO;
import accesoDatos.DatabaseConection;
import factory.FactoryAccesoDatos;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetoNegocio.Cliente;
import objetoNegocio.DetalleVenta;
import objetoNegocio.Venta;

/**
 *
 * @author Juan Pablo
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        FactoryAccesoDatos factory = new FactoryAccesoDatos();
        // Código para insertar venta
//        factory.obtenerVentaDAO().insertar(new Venta(new Date(122, 3, 7), 100.0f));
        /**

        * Requisitos para insertar detalleVenta
        * Todos los id que se registren en las llaves foraneas tienen que existir realmente
        * en las tablas referenciadas, es decir si ponemos un idcliente = 1 y no existe ese 
        * idcliente en la base de datos va a tronar la llave foranea
        **/
        
        //Código para insertar detalle venta
//        factory.obtenerDetalleVentaDAO().insertar(new DetalleVenta(1, 140, 2, 1, 5, 1));
    }

}
