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
    
    public boolean validarTexto(String texto){
        return texto.matches("([a-zA-Z]+( [a-zA-Z]+)+) áéíóú");
    }
    
    public boolean validarTelefono(String texto){
        return texto.matches("/^(\\(\\+?\\d{2,3}\\)"
                + "[\\*|\\s|\\-|\\.]?(([\\d][\\*|\\s|"
                + "\\-|\\.]?){6})(([\\d][\\s|\\-|\\.]"
                + "?){2})?|(\\+?[\\d][\\s|\\-|\\.]?){"
                + "8}(([\\d][\\s|\\-|\\.]?){2}(([\\d]"
                + "[\\s|\\-|\\.]?){2})?)?)$/");
    }
    
}
