package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la interfaz IArticuloRepositorio para gestionar 
 * el almacenamiento, consulta, actualización y eliminación de artículos.
 */
public class ArticuloRepositorio implements IArticuloRepositorio {

    /**
     * Lista que almacena los artículos.
     */
    private ArrayList<Articulo> listaDeArticulos;
    
    /**
     * Constructor de la clase. Inicializa la lista de artículos.
     */
    public ArticuloRepositorio() {
        this.listaDeArticulos = new ArrayList();
    }

    /**
     * Almacena un artículo en la lista.
     *
     * @param objArticulo El artículo a almacenar.
     * @return true si el artículo se almacena correctamente, false en caso contrario.
     */
    
    @Override
    public boolean almacenarArticulo(Articulo objArticulo) {
        objArticulo.setIdArticulo(getCantidadArticulos());
        return this.listaDeArticulos.add(objArticulo);
    }
    /**
     * Lista todos los artículos almacenados.
     *
     * @return Una lista de todos los artículos.
     */
    
    @Override
    public List<Articulo> listarArticulos() {
        return this.listaDeArticulos;
    }
    
    /**
     * Obtiene la cantidad de artículos almacenados.
     *
     * @return La cantidad de artículos más uno.
     */
    
    private int getCantidadArticulos() {
        return this.listaDeArticulos.size() + 1;
    }
    
    /**
     * Elimina un artículo de la lista por su ID.
     *
     * @param idArticulo El ID del artículo a eliminar.
     * @return true si el artículo se elimina correctamente, false en caso contrario.
     */
    
    @Override
    public boolean eliminarArticulo(int idArticulo) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == idArticulo) {
                this.listaDeArticulos.remove(i);
                bandera = true;
                break;
            }
        }
        return bandera;
    }
    /**
     * Consulta un artículo por su ID.
     *
     * @param idArticulo El ID del artículo a consultar.
     * @return El artículo consultado, o null si no se encuentra.
     */
    
    @Override
    public Articulo consultarArticulo(int idArticulo) {
        Articulo objArticulo = null;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == idArticulo) {
                objArticulo = this.listaDeArticulos.get(i);
                break;
            }
        }

        return objArticulo;
    }
    /**
     * Actualiza un artículo en la lista.
     *
     * @param objArticulo El artículo con la información actualizada.
     * @return true si el artículo se actualiza correctamente, false en caso contrario.
     */
    
    @Override
    public boolean actualizarArticulo(Articulo objArticulo) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == objArticulo.getIdArticulo()) {
                this.listaDeArticulos.set(i, objArticulo);
                bandera = true;
                break;
            }
        }

        return bandera;
    }
    
     /**
     * Asigna una lista de evaluadores a un artículo.
     *
     * @param id El ID del artículo.
     * @param listEvaluadores La lista de evaluadores a asignar.
     * @return true si los evaluadores se asignan correctamente, false en caso contrario.
     */

    @Override
    public boolean asignarEvaluadores(int id, ArrayList<Evaluador> listEvaluadores) {
        Articulo articulo = consultarArticulo(id);
        if (articulo != null) {
            articulo.setListEvaluadores(listEvaluadores); 
            return true;
        }
        return false;
    }
}
