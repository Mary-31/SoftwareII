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
     /**
     * Obtiene el nombre de la conferencia.
     * 
     * @return el nombre de la conferencia.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre de la conferencia.
     * 
     * @param nombre el nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     /**
     * Obtiene la fecha de inicio de la conferencia.
     * 
     * @return la fecha de inicio de la conferencia.
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }
    /**
     * Establece la fecha de inicio de la conferencia.
     * 
     * @param fechaInicio la fecha de inicio a establecer.
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
     * Obtiene la fecha de finalización de la conferencia.
     * 
     * @return la fecha de finalización de la conferencia.
     */
    public Date getFechaFin() {
        return fechaFin;
    }
    /**
     * Establece la fecha de finalización de la conferencia.
     * 
     * @param fechaFin la fecha de finalización a establecer.
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    /**
     * Obtiene el identificador único de la conferencia.
     * 
     * @return el identificador único de la conferencia.
     */
    public int getId() {
        return id;
    }
    /**
     * Establece el identificador único de la conferencia.
     * 
     * @param id el identificador a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Obtiene la ubicación de la conferencia.
     * 
     * @return la ubicación de la conferencia.
     */
    public String getUbicacion() {
        return ubicacion;
    }
    /**
     * Establece la ubicación de la conferencia.
     * 
     * @param ubicacion la ubicación a establecer.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    /**
     * Devuelve una representación en formato de cadena de la conferencia.
     * 
     * @return una cadena que representa la conferencia.
     */
    @Override
    public String toString()
    {
        return this.nombre;
    }
}
