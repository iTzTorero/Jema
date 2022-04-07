/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoNegocio;

import java.sql.Date;

/**
 *
 * @author Juan Pablo
 */
public class Corte {
    private int idCorte;
    private Date fecha;
    private float total;
    private int idUsuario;

    public Corte() {
    }

    public Corte(Date fecha, float total, int usuario) {
        this.fecha = fecha;
        this.total = total;
        this.idUsuario = usuario;
    }

    public Corte(int idCorte, Date fecha, float total, int idUsuario) {
        this.idCorte = idCorte;
        this.fecha = fecha;
        this.total = total;
        this.idUsuario = idUsuario;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCorte() {
        return idCorte;
    }

    public void setIdCorte(int idCorte) {
        this.idCorte = idCorte;
    }

   

    @Override
    public String toString() {
        return "Corte{" + "fecha=" + fecha + ", total=" + total + ", usuario=" + idUsuario + '}';
    }
    
    
}
