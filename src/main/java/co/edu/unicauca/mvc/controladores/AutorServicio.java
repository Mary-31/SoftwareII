/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.modelos.Autor;
import java.util.List;
import co.edu.unicauca.mvc.accesoADatos.IAutorRepositorio;

/**
 *
 * @author SANTIAGO DORADO
 */
public class AutorServicio {
    private IAutorRepositorio objIAutor;
    
    public AutorServicio(IAutorRepositorio objIAutor) {
        this.objIAutor = objIAutor;
    }
    
    public boolean registrarAutor(Autor objAutor){
        boolean bandera = this.objIAutor.registrarAutor(objAutor);
        return bandera;
    }
    
    public List<Autor> listarAutores(){
        return this.objIAutor.listarAutores();
    }
}
