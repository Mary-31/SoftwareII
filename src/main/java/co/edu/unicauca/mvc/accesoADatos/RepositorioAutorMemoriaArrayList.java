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
public class RepositorioAutorMemoriaArrayList implements InterfaceRepositorioAutor {
    private ArrayList<Autor> listaAutores;
    
    public RepositorioAutorMemoriaArrayList() {
        this.listaAutores = new ArrayList();
    } 

    @Override
    public boolean registrarAutor(Autor objAutor) {
        boolean bandera = this.listaAutores.add(objAutor);
        return bandera;
    }

    @Override
    public List<Autor> listarAutores() {
        return this.listaAutores;
    }
}
