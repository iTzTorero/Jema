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
public class Usuario {
    private String nombre;
    private String password;
    private String direccion;
    private String telefono1;
    private String telefono2;

    public Usuario(String nombre, String password, String direccion, String telefono1, String telefono2) {
        this.nombre = nombre;
        this.password = password;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    public Usuario() {
    }

    public Usuario(String nombre, String password, String direccion, String telefono1) {
        this.nombre = nombre;
        this.password = password;
        this.direccion = direccion;
        this.telefono1 = telefono1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", password=" + password + ", direccion=" + direccion + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + '}';
    }
    
    
}
