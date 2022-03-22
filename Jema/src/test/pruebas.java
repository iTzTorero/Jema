/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import accesoDatos.ClienteDAO;
import accesoDatos.Database;
import accesoDatos.ServicioDAO;
import factory.FactoryAccesoDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetoNegocio.Servicio;

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

//        ClienteDAO clienteDAO = new ClienteDAO();
//        clienteDAO.actualizar(new Cliente(4, "Michi", "711377777", "11556111"));
//        clienteDAO.eliminar(3);
        
        ServicioDAO servicioDAO = new ServicioDAO();
//        servicioDAO.insertar(new Servicio("Prueba", 100));
        servicioDAO.actualizar(new Servicio(1, "Prueba2", 50));
    }

}
