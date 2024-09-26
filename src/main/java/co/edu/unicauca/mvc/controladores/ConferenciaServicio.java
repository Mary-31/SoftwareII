package co.edu.unicauca.mvc.controladores;

import java.util.List;
import co.edu.unicauca.mvc.modelos.Conferencia;
import co.edu.unicauca.mvc.accesoADatos.IConferenciaRepositorio;

/**
 * Clase de servicio que proporciona métodos para gestionar conferencias
 * utilizando un repositorio de conferencias.
 */

public class ConferenciaServicio {
    
    /**
     * Repositorio de conferencias utilizado por el servicio.
     */

    private IConferenciaRepositorio objIConferencia;
    
    /**
     * Constructor que inicializa el servicio con un repositorio de conferencias.
     *
     * @param objIConferencia El repositorio de conferencias a utilizar.
     */
    
    public ConferenciaServicio(IConferenciaRepositorio objIConferencia) {
        this.objIConferencia = objIConferencia;
    }
    /**
     * Almacena una conferencia utilizando el repositorio.
     *
     * @param objConfererencia La conferencia a almacenar.
     * @return true si la conferencia se almacena correctamente, false en caso contrario.
     */
    
    public boolean almacenarConferencia(Conferencia objConfererencia) {
        boolean bandera = this.objIConferencia.almacenarConferencia(objConfererencia);
        return bandera;
    }
    
    /**
     * Lista todas las conferencias almacenadas en el repositorio.
     *
     * @return Una lista de todas las conferencias.
     */
    
    public List<Conferencia> listarConferencias() {
        return this.objIConferencia.listarConferencias();
    }
}
