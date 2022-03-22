/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoNegocio;

/**
 *
 * @author Juan Pablo
 */
public class DetalleVenta {
    private Servicio servicio;
    private float precio;
    private Cliente cliente;
    private EstadoVenta estadoServicio;

    public DetalleVenta() {
    }

    public DetalleVenta(Servicio servicio, float precio, Cliente cliente, EstadoVenta estadoServicio) {
        this.servicio = servicio;
        this.precio = precio;
        this.cliente = cliente;
        this.estadoServicio = estadoServicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EstadoVenta getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(EstadoVenta estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "servicio=" + servicio + ", precio=" + precio + ", cliente=" + cliente + ", estadoServicio=" + estadoServicio + '}';
    }
    
    
}
