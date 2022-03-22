/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoNegocio;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Juan Pablo
 */
public class Venta {
 private Date fecha;
 private float total;
 private Servicio tipoServicio;
 private Usuario usuario;
 private ArrayList<DetalleVenta> detalleVenta;

    public Venta() {
    }

    public Venta(Date fecha, float total, Servicio tipoServicio, Usuario usuario, ArrayList<DetalleVenta> detalleVenta) {
        this.fecha = fecha;
        this.total = total;
        this.tipoServicio = tipoServicio;
        this.usuario = usuario;
        this.detalleVenta = detalleVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Servicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(Servicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<DetalleVenta> getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(ArrayList<DetalleVenta> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", total=" + total + ", tipoServicio=" + tipoServicio + ", usuario=" + usuario + ", detalleVenta=" + detalleVenta + '}';
    }
 
}
