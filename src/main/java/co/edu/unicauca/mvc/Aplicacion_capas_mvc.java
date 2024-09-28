package co.edu.unicauca.mvc;

import co.edu.unicauca.mvc.vistas.VtnLogin;

/**
 * Clase principal de la aplicación MVC.
 * 
 * Esta clase sirve como punto de entrada para la aplicación, inicializando y mostrando
 * la ventana de login (VtnLogin) al usuario.
 * 
 * @author SANTIAGO DORADO
 */
public class Aplicacion_capas_mvc {
    /**
     * Método principal (main) de la aplicación.
     * 
     * Este método crea una instancia de la ventana de login (VtnLogin) y la hace visible.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        VtnLogin objVtnLogin = new VtnLogin();
        objVtnLogin.setVisible(true);
    }
}
