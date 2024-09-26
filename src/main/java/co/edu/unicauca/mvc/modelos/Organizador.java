package co.edu.unicauca.mvc.modelos;

public class Organizador {
    private String nombreOrganizador;
    private String apellidoOrganizador;
    private String correo;
    
    public Organizador(String nombreOrganizador,String apellidoOrganizador, String correo) {
        this.nombreOrganizador = nombreOrganizador;
        this.apellidoOrganizador = apellidoOrganizador;      
        this.correo = correo;
    }

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
