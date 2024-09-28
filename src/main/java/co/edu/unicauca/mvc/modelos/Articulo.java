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
    /**
     * Obtiene el identificador único del articulo.
     * 
     * @return el identificador único del articulo.
     */
    public int getIdArticulo() {
        return idArticulo;
    }
    /**
     * Establece el ID del artículo.
     * 
     * @param idArticulo el nuevo ID del artículo.
     */
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
    
    /**
    * Obtiene el titulo del artículo.
    * 
    * @return el titulo del artícul.
    */
    public String getTitulo() {
        return titulo;
    }
     /**
     * Establece el Titulo del artículo.
     * 
     * @param titulo el nuevo tirulo del artículo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
    * Obtiene el resumen del artículo.
    * 
    * @return el resumen del artículo.
    */
    public String getResumen() {
        return resumen;
    }
    /**
     * Establece el Resumen del artículo.
     * 
     * @param resumen el nuevo resumen del artículo.
     */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    /**
    * Obtiene las palabras claves del artículo.
    * 
    * @return palabras claves del artículo.
    */
    public String getPalabrasClave() {
        return palabrasClave;
    }
    /**
     * Establece las palabras claves del artículo.
     * 
     * @param palabrasClave las palabras claves del artículo.
     */
    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }
    /**
    * Obtiene la lista de autores asociados al artículo.
    *
    * @return Una lista de objetos Autor que representan los autores del artículo.
    */
    public ArrayList<Autor> getAutores() {
        return listAutores;
    }
    /**
    * Establece la lista de autores asociados al artículo.
    *
    * @param autores Una lista de objetos Autor que representan los nuevos autores del artículo.
    */
    public void setAutores(ArrayList<Autor> autores) {
        this.listAutores = autores;
    }
    /**
    * Obtiene la conferencia asociada al artículo.
    *
    * @return Un objeto Conferencia que representa la conferencia del artículo.
    */
    public Conferencia getObjConferencia() {
        return objConferencia;
    }
    /**
    * Establece la conferencia asociada al artículo.
    *
    * @param objConferencia Un objeto Conferencia que representa la nueva conferencia del artículo.
    */
    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }
    /**
    * Obtiene la lista de autores asociados al artículo.
    * Este método es redundante ya que es idéntico a getAutores().
    *
    * @return Una lista de objetos Autor que representan los autores del artículo.
    */
    public ArrayList<Autor> getListAutores() {
        return listAutores;
    }
   /**
    * Establece la lista de autores asociados al artículo.
    * Este método es redundante ya que es idéntico a setAutores.
    * @param listAutores Una lista de objetos Autor que representan los nuevos autores del artículo.
    */
    public void setListAutores(ArrayList<Autor> listAutores) {
        this.listAutores = listAutores;
    }
    
    /**
    * Obtiene la lista de evaluadores asociados al artículo.
    *
    * @return Una lista de objetos Evaluador que representan los evaluadores del artículo.
    */
    public ArrayList<Evaluador> getListEvaluadores() {
        return listEvaluadores;
    }
    /**
    * Establece la lista de evaluadores asociados al artículo.
    *
    * @param listEvaluadores Una lista de objetos Evaluador que representan los nuevos evaluadores del artículo.
    */
    public void setListEvaluadores(ArrayList<Evaluador> listEvaluadores) {
        this.listEvaluadores = listEvaluadores;
    }
}
