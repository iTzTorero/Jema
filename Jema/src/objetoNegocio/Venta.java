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
    private int idventa;
    private Date fecha;
    private float total;
    private Date fecha_entrega;

    public Venta() {
    }

    public Venta(int idventa){
        this.idventa= idventa;
    }
    
    public Venta(int idventa, Date fecha, float total, Date fecha_entrega) {
        this.idventa = idventa;
        this.fecha = fecha;
        this.total = total;
        this.fecha_entrega = fecha_entrega;
    }

    public Venta(Date fecha, float total, Date fecha_entrega) {
        this.fecha = fecha;
        this.total = total;
        this.fecha_entrega=fecha_entrega;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
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

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }


    @Override
    public String toString() {
        return "Venta{" + "idventa=" + idventa + ", fecha=" + fecha + ", total=" + total + ", fecha_entrega=" + fecha_entrega + '}';
    }


}
