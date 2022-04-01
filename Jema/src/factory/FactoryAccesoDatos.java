/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import accesoDatos.*;
import java.sql.ResultSet;

/**
 *
 * @author Juan Pablo
 */
public class FactoryAccesoDatos implements iFactoryAccesoDatos{
    private ClienteDAO clienteDAO;
    private CorteDAO  corteDAO;
    private DetalleVentaDAO detalleVentaDAO;
    private EstadoVentaDAO estadoVentaDAO;
    private ServicioDAO servicioDAO;
    private UsuarioDAO usuarioDAO;
    private VentaDAO ventaDAO;

    public FactoryAccesoDatos() {
        clienteDAO = new ClienteDAO();
        corteDAO = new CorteDAO();
        detalleVentaDAO = new DetalleVentaDAO();
        estadoVentaDAO = new EstadoVentaDAO();
        servicioDAO = new ServicioDAO();
        usuarioDAO = new UsuarioDAO();
        ventaDAO = new VentaDAO();
    }

    @Override
    public ClienteDAO obtenerClienteDAO() {
        return clienteDAO;
    }

    @Override
    public CorteDAO obtenerCorteDAO() {
       return corteDAO;
    }

    @Override
    public DetalleVentaDAO obtenerDetalleVentaDAO() {
        return detalleVentaDAO;
    }

    @Override
    public EstadoVentaDAO obtenerEstadoVentaDAO() {
        return estadoVentaDAO;
    }

    @Override
    public ServicioDAO obtenerServicioDAO() {
        return servicioDAO;
    }

    @Override
    public UsuarioDAO obtenerUsuarioDAO() {
        return usuarioDAO;
    }

    @Override
    public VentaDAO obtenerVentaDAO() {
        return ventaDAO;
    }
       
    
    
}
