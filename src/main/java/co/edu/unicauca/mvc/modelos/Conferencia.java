package co.edu.unicauca.mvc.modelos;

import java.util.Date;

public class Conferencia {
    private int id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;   
    private String ubicacion;

    public Conferencia() {
    }

    public Conferencia(int id, String nombre, Date fechaInicio, Date fechaFin, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;        
        this.ubicacion = ubicacion;
    }
    
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
