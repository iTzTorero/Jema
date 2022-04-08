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
public class Cliente {
   private int idcliente;
   private String nombre;
   private String telefono1;
   private String telefono2;

    public Cliente(int idcliente, String nombre, String telefono1, String telefono2) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }
   
    public Cliente(String nombre, String telefono1, String telefono2) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    public Cliente() {
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
   
   
}
