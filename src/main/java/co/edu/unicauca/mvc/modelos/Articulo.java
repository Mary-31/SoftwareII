package co.edu.unicauca.mvc.modelos;
/**
 *
 * @author Mary
 */
import java.util.ArrayList;
/**
 * Representa un artículo dentro del sistema de conferencias.
 * Contiene información sobre el título, resumen, palabras clave,
 * autores asociados, conferencia y evaluadores.
 */
public class Articulo {
    private int idArticulo;
    private String titulo;
    private String resumen;
    private String palabrasClave;
    private ArrayList<Autor> listAutores;
    private Conferencia objConferencia;
    private ArrayList<Evaluador> listEvaluadores;
   
     /**
     * Constructor con parámetros para inicializar un artículo.
     * 
     * @param idArticulo Identificador único del artículo.
     * @param titulo Título del artículo.
     * @param resumen Resumen del contenido del artículo.
     * @param palabrasClave Palabras clave asociadas al artículo.
     * @param listAutores Lista de autores que participaron en el artículo.
     * @param objConferencia Conferencia a la que pertenece el artículo.
     * @param listEvaluadores Lista de evaluadores asignados al artículo.
     */
    
    public Articulo(int idArticulo, String titulo, String resumen, 
            String palabrasClave, ArrayList<Autor> listAutores, 
            Conferencia objConferencia, ArrayList<Evaluador> listEvaluadores) {
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.resumen = resumen;
        this.palabrasClave = palabrasClave;
        this.listAutores = listAutores;
        this.objConferencia = objConferencia;
        this.listEvaluadores = new ArrayList<>();
    }
    /**
     * Constructor vacío para la clase Articulo.
     */
    public Articulo() {
        
    }
    // Métodos getters y setters
    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public ArrayList<Autor> getAutores() {
        return listAutores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.listAutores = autores;
    }

    public Conferencia getObjConferencia() {
        return objConferencia;
    }

    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }
    
    public ArrayList<Autor> getListAutores() {
        return listAutores;
    }

    public void setListAutores(ArrayList<Autor> listAutores) {
        this.listAutores = listAutores;
    }

    public ArrayList<Evaluador> getListEvaluadores() {
        return listEvaluadores;
    }

    public void setListEvaluadores(ArrayList<Evaluador> listEvaluadores) {
        this.listEvaluadores = listEvaluadores;
    }
}
