package co.edu.unicauca.mvc.modelos;

/**
 *
 * @author Usuario
 */
public class Evaluador {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String temasExperto;

    public Evaluador() {

    }

    public Evaluador(int id, String nombre, String apellido, String temasExperto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.temasExperto = temasExperto;
    }

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

    public String getTemas() {
        return temasExperto;
    }

    public void setTemasExperto(String temasExperto) {
        this.temasExperto = temasExperto;
    }
}
