package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Conferencia;
import java.util.List;

/**
 * Interfaz que define los métodos para gestionar el almacenamiento
 * y consulta de conferencias.
 */
public interface IConferenciaRepositorio {
    /**
     * Almacena una conferencia en el repositorio.
     *
     * @param objConferencia La conferencia a almacenar.
     * @return true si la conferencia se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarConferencia(Conferencia objConferencia);
    /**
     * Lista todas las conferencias almacenadas en el repositorio.
     *
     * @return Una lista de todas las conferencias.
     */
    public List<Conferencia> listarConferencias();
}
