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
    private int idServicio;
    private float precio;
    private int idCliente;
    private int idEstadoServicio;

    public DetalleVenta() {
    }

    public DetalleVenta(int idServicio, float precio, int idCliente, int idEstadoServicio) {
        this.idServicio = idServicio;
        this.precio = precio;
        this.idCliente = idCliente;
        this.idEstadoServicio = idEstadoServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEstadoServicio() {
        return idEstadoServicio;
    }

    public void setIdEstadoServicio(int idEstadoServicio) {
        this.idEstadoServicio = idEstadoServicio;
    }

    

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "DetalleVenta{" + "servicio=" + idServicio + ", precio=" + precio + ", cliente=" + idCliente + ", estadoServicio=" + idEstadoServicio + '}';
    }
    
    
}
