/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioAutor;
import co.edu.unicauca.mvc.modelos.Autor;
import java.util.List;

/**
 *
 * @author SANTIAGO DORADO
 */
public class ServicioAlmacenamientoAutores {
    private InterfaceRepositorioAutor objIRA;
    
    public ServicioAlmacenamientoAutores(InterfaceRepositorioAutor objIRA) {
        this.objIRA = objIRA;
    }
    
    public boolean registrarAutor(Autor objAutor){
        boolean bandera = this.objIRA.registrarAutor(objAutor);
        return bandera;
    }
    
    public List<Autor> listarAutores(){
        return this.objIRA.listarAutores();
    }
}
