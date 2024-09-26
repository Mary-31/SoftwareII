package co.edu.unicauca.mvc.modelos;

/**
 *
 * @author Mary
 */

/**
 * Representa un evaluador dentro del sistema de conferencias.
 * Contiene información sobre el nombre, apellido, correo electrónico y los temas de experiencia del evaluador.
 */

public class Evaluador {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String temasExperto;
    
    /**
     * Constructor vacío para la clase Evaluador.
     */
    public Evaluador() {

    }
    /**
     * Constructor con parámetros para inicializar un evaluador.
     * 
     * @param id Identificador único del evaluador.
     * @param nombre Nombre del evaluador.
     * @param apellido Apellido del evaluador.
     * @param correo Correo electrónico del evaluador.
     * @param temasExperto Temas en los que el evaluador es experto.
     */
    public Evaluador(int id, String nombre, String apellido, String correo, String temasExperto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.temasExperto = temasExperto;
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

    public String getTemas() {
        return temasExperto;
    }

    public void setTemasExperto(String temasExperto) {
        this.temasExperto = temasExperto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
