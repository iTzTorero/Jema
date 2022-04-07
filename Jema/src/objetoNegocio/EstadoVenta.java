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
public class EstadoVenta {
    private int idEstadoVenta;
    private String estado;

    public EstadoVenta() {
    }

    public EstadoVenta(int idEstadoVenta, String estado) {
        this.idEstadoVenta = idEstadoVenta;
        this.estado = estado;
    }

    public int getIdEstadoVenta() {
        return idEstadoVenta;
    }

    public void setIdEstadoVenta(int idEstadoVenta) {
        this.idEstadoVenta = idEstadoVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EstadoVenta{" + "idEstadoVenta=" + idEstadoVenta + ", estado=" + estado + '}';
    }
    
    
}
