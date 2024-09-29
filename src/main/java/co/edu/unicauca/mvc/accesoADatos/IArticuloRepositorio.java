package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.ArrayList;
import java.util.List;

/**
 * Interfaz que define los métodos para gestionar el almacenamiento,
 * consulta, actualización y eliminación de artículos, así como la 
 * asignación de evaluadores a artículos.
 */

public interface IArticuloRepositorio {
    /**
     * Almacena un artículo en el repositorio.
     *
     * @param objArticulo El artículo a almacenar.
     * @return true si el artículo se almacena correctamente, false en caso contrario.
     */
    
    public boolean almacenarArticulo(Articulo objArticulo);
    /**
     * Lista todos los artículos almacenados en el repositorio.
     *
     * @return Una lista de todos los artículos.
     */
    public List<Articulo> listarArticulos();
    
    /**
     * Elimina un artículo del repositorio por su ID.
     *
     * @param idArticulo El ID del artículo a eliminar.
     * @return true si el artículo se elimina correctamente, false en caso contrario.
     */
    public boolean eliminarArticulo(int idArticulo);
    
    /**
     * Consulta un artículo por su ID.
     *
     * @param idArticulo El ID del artículo a consultar.
     * @return El artículo consultado, o null si no se encuentra.
     */
    
    public Articulo consultarArticulo(int idArticulo);
    /**
     * Actualiza la información de un artículo en el repositorio.
     *
     * @param objArticulo El artículo con la información actualizada.
     * @return true si el artículo se actualiza correctamente, false en caso contrario.
     */
    public boolean actualizarArticulo(Articulo objArticulo);
    
    /**
     * Asigna evaluadores a un artículo.
     *
     * @param id El ID del artículo.
     * @param listEvaluadores La lista de evaluadores a asignar.
     * @return true si los evaluadores se asignan correctamente, false en caso contrario.
     */
    public boolean asignarEvaluadores(int id, ArrayList<Evaluador> listEvaluadores);
    
    public boolean cambiarEstado(int id, int estado);
    
}
