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
public class Servicio {
    private int idServicio;
    private String nombre;
    private float costo;

    public Servicio() {
    }

    public Servicio(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public Servicio(int idServicio, String nombre, float costo) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.costo = costo;
    }
    
    

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "nombre=" + nombre + ", costo=" + costo + '}';
    }
    
    
}
