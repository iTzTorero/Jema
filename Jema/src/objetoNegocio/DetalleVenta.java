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

    private int iddetalle_venta;
    private int idEstadoVenta;
    private int idServicio;
    private float precio;
    private int idCliente;
    private int idUsuario;
    private int idVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(int iddetalle_venta, int idEstadoVenta, float precio, int idCliente, int idUsuario, int idVenta, int idServicio) {
        this.iddetalle_venta = iddetalle_venta;
        this.idEstadoVenta = idEstadoVenta;
        this.precio = precio;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.idVenta = idVenta;
        this.idServicio = idServicio;
    }
    

    public DetalleVenta(int idEstadoVenta, float precio, int idCliente, int idUsuario, int idVenta, int idServicio) {
        this.idEstadoVenta = idEstadoVenta;
        this.precio = precio;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.idVenta = idVenta;
        this.idServicio = idServicio;
    }
    

    
    public int getIddetalle_venta() {
        return iddetalle_venta;
    }

    public void setIddetalle_venta(int iddetalle_venta) {
        this.iddetalle_venta = iddetalle_venta;
    }

    public int getIdEstadoVenta() {
        return idEstadoVenta;
    }

    public void setIdEstadoVenta(int idEstadoVenta) {
        this.idEstadoVenta = idEstadoVenta;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "iddetalle_venta=" + iddetalle_venta + ", idEstadoVenta=" + idEstadoVenta + ", idServicio=" + idServicio + ", precio=" + precio + ", idCliente=" + idCliente + ", idUsuario=" + idUsuario + ", idVenta=" + idVenta + '}';
    }

    
}
