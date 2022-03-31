/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import accesoDatos.ClienteDAO;
import accesoDatos.DatabaseConection;
import factory.FactoryAccesoDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetoNegocio.Cliente;

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
        System.out.println(factory.obtenerClienteDAO().consultarPorId(1).getNombre());
        factory.obtenerClienteDAO().insertar(new Cliente("Mauricio", "12123123", "11556111"));
        factory.obtenerClienteDAO().actualizar(new Cliente(2, "Michi", "711377777", "11556111"));
        //factory.obtenerClienteDAO().eliminar(4);
    }

}
