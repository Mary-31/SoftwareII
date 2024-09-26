/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO DORADO
 */
public class AutorRepositorio implements IAutorRepositorio {
    private ArrayList<Autor> listaAutores;
    
    public AutorRepositorio() {
        this.listaAutores = new ArrayList();
    } 
    
    private int getCantidadAutores()
    {
        return this.listaAutores.size()+1;
    }

    @Override
    public boolean registrarAutor(Autor objAutor) {
        objAutor.setId(getCantidadAutores());
        return this.listaAutores.add(objAutor);
    }

    @Override
    public List<Autor> listarAutores() {
        return this.listaAutores;
    }
}
