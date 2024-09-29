package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.IArticuloRepositorio;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de servicio que proporciona métodos para gestionar artículos
 * utilizando un repositorio de artículos.
 */

public class ArticuloServicio {
    /**
     * Repositorio de artículos utilizado por el servicio.
     */
    
    private IArticuloRepositorio objIArticulo;
    
    /**
     * Constructor que inicializa el servicio con un repositorio de artículos.
     *
     * @param objIArticulo El repositorio de artículos a utilizar.
     */
    
    public ArticuloServicio(IArticuloRepositorio objIArticulo)
    {
        this.objIArticulo = objIArticulo;
    }
    
    /**
     * Almacena un artículo utilizando el repositorio.
     *
     * @param objArticulo El artículo a almacenar.
     * @return true si el artículo se almacena correctamente, false en caso contrario.
     */
    
    public boolean almacenarArticulo(Articulo objArticulo)
    {
        return this.objIArticulo.almacenarArticulo(objArticulo);
    }
    /**
     * Lista todos los artículos almacenados en el repositorio.
     *
     * @return Una lista de todos los artículos.
     */ 
    public List<Articulo> listarArticulos()
    {
        return this.objIArticulo.listarArticulos();
    }
    
    /**
     * Elimina un artículo por su ID utilizando el repositorio.
     *
     * @param idArticulo El ID del artículo a eliminar.
     * @return true si el artículo se elimina correctamente, false en caso contrario.
     */
    
    public boolean eliminarArticulo(int idArticulo)
    {
        return this.objIArticulo.eliminarArticulo(idArticulo);
    }
    /**
     * Consulta un artículo por su ID utilizando el repositorio.
     *
     * @param idArticulo El ID del artículo a consultar.
     * @return El artículo consultado, o null si no se encuentra.
     */
    public Articulo consultarArticulo(int idArticulo)
    {
        return this.objIArticulo.consultarArticulo(idArticulo);
    }
    /**
     * Actualiza la información de un artículo utilizando el repositorio.
     *
     * @param objArticulo El artículo con la información actualizada.
     * @return true si el artículo se actualiza correctamente, false en caso contrario.
     */
    public boolean actualizarArticulo(Articulo objArticulo)
    {
        return this.objIArticulo.actualizarArticulo(objArticulo);
    }
    /**
     * Asigna evaluadores a un artículo utilizando el repositorio.
     *
     * @param id El ID del artículo.
     * @param listEvaluadores La lista de evaluadores a asignar.
     * @return true si los evaluadores se asignan correctamente, false en caso contrario.
     */
    public boolean asignarEvaluador(int id, ArrayList<Evaluador> listEvaluadores) {
        return this.objIArticulo.asignarEvaluadores(id, listEvaluadores);
    }
    
    public boolean cambiarEstado(int id, int estado){
        return this.objIArticulo.cambiarEstado(id, estado);
    }
}
