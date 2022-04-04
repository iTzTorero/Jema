/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

/**
 *
 * @author carmi
 */
public class ValidarCampos {
    
    public boolean validarTexto(String texto) throws Exception{
        if(texto.matches("([a-zA-Z]+( [a-zA-Z]+)+) áéíóú")){
            return true;
        }
        throw new Exception("Error, ingrese solo texto. ");
    }
    
    public boolean validarTelefono(String texto) throws Exception{
        if(texto.matches("/^(\\(\\+?\\d{2,3}\\)"
                + "[\\*|\\s|\\-|\\.]?(([\\d][\\*|\\s|"
                + "\\-|\\.]?){6})(([\\d][\\s|\\-|\\.]"
                + "?){2})?|(\\+?[\\d][\\s|\\-|\\.]?){"
                + "8}(([\\d][\\s|\\-|\\.]?){2}(([\\d]"
                + "[\\s|\\-|\\.]?){2})?)?)$/")){
            return true;
        }
        throw new Exception("Error, solo numeros para numero telefonico. ");
    }
    
    public boolean validarNumero(String num) throws Exception{
        if(num.matches("[0-9]+")){
        return true;
        }
        throw new Exception("Error, ingrese solo numeros. ");
    }
    
    public boolean soloLetras(String respuesta) throws Exception {
        if (respuesta.matches("[a-zA-Z]+")) {
            return true;
        }
        throw new Exception("Error, el campo debe ser alfabético. ");
    }
    
    public boolean soloFecha(String respuesta) throws Exception {
        if (respuesta.matches("^([0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4})$") || respuesta.matches("^([0-9]{1}[/]{1}[0-9]{1}[/]{1}[0-9]{4})$")) {
            return true;
        }
        throw new Exception("Error, formato requerido (dd/mm/yyyy). ");
    }
    
}
