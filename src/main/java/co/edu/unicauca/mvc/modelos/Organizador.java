package co.edu.unicauca.mvc.modelos;

/**
 *
 * @author Mary
 */

/**
 * Representa un organizador dentro del sistema de conferencias.
 * Contiene información sobre el nombre, apellido y correo electrónico del organizador.
 */
public class Organizador {
    private String nombreOrganizador;
    private String apellidoOrganizador;
    private String correo;
    
    /**
     * Constructor para inicializar un organizador con los detalles básicos.
     * 
     * @param nombreOrganizador Nombre del organizador.
     * @param apellidoOrganizador Apellido del organizador.
     * @param correo Correo electrónico del organizador.
     */
    
    public Organizador(String nombreOrganizador,String apellidoOrganizador, String correo) {
        this.nombreOrganizador = nombreOrganizador;
        this.apellidoOrganizador = apellidoOrganizador;      
        this.correo = correo;
    }
    
    // Métodos getters y setters
    
    public String getNombre() {
        return nombreOrganizador;
    }

    public void setNombre(String nombreOrganizador) {
        this.nombreOrganizador = nombreOrganizador;
    }

    public String getApellido() {
        return apellidoOrganizador;
    }

    public void setApellido(String apellidoOrganizador) {
        this.apellidoOrganizador=apellidoOrganizador;
    }
    
     public String getUniversidad() {
        return correo;
    }

    public void setUniversidad(String correo) {
        this.correo=correo;
    }
}
