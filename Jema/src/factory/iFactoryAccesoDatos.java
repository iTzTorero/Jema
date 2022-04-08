/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import accesoDatos.*;

/**
 *
 * @author Juan Pablo
 */
public interface iFactoryAccesoDatos {
    public ClienteDAO obtenerClienteDAO();
    public CorteDAO obtenerCorteDAO();
    public DetalleVentaDAO obtenerDetalleVentaDAO();
    public ServicioDAO obtenerServicioDAO();
    public UsuarioDAO obtenerUsuarioDAO();
    public VentaDAO obtenerVentaDAO();
}
