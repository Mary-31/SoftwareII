package co.edu.unicauca.mvc.modelos;

import java.util.Date;

/**
 * Representa una conferencia dentro del sistema de conferencias.
 * Contiene información sobre el nombre, fechas de inicio y fin, y ubicación de la conferencia.
 */

public class Conferencia {
    private int id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;   
    private String ubicacion;
    
    /**
     * Constructor vacío para la clase Conferencia.
     */
    public Conferencia() {
    }
    /**
     * Constructor con parámetros para inicializar una conferencia.
     * 
     * @param id Identificador único de la conferencia.
     * @param nombre Nombre de la conferencia.
     * @param fechaInicio Fecha de inicio de la conferencia.
     * @param fechaFin Fecha de finalización de la conferencia.
     * @param ubicacion Ubicación de la conferencia.
     */
    
    public Conferencia(int id, String nombre, Date fechaInicio, Date fechaFin, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;        
        this.ubicacion = ubicacion;
    }
    
    // Métodos getters y setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    @Override
    public String toString()
    {
        return this.nombre;
    }
}
