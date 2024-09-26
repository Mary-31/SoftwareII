/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mvc.modelos;

/**
 *
 * @author SANTIAGO DORADO
 */

/**
 * Representa un autor de un artículo dentro del sistema de conferencias.
 * Contiene información personal del autor como nombre, apellido y correo electrónico.
 */

    public class Autor {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    
     /**
     * Constructor vacío para la clase Autor.
     */
    public Autor(){
        
    }
    /**
     * Constructor con parámetros para inicializar un autor.
     * 
     * @param id Identificador único del autor.
     * @param nombre Nombre del autor.
     * @param apellido Apellido del autor.
     * @param correo Correo electrónico del autor.
     */
    
    public Autor(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    
    // Métodos getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }  

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
