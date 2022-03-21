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
}
