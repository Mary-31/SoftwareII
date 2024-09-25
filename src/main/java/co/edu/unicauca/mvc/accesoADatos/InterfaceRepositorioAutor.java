/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Autor;
import java.util.List;

/**
 *
 * @author SANTIAGO DORADO
 */
public interface InterfaceRepositorioAutor {
    public boolean registrarAutor(Autor objAutor);
    public List<Autor> listarAutores();
}
