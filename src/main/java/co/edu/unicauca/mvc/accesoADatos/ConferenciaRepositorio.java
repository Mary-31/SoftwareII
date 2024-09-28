package co.edu.unicauca.mvc.accesoADatos;

import java.util.ArrayList;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Conferencia;

/**
 * Clase que implementa la interfaz IConferenciaRepositorio para gestionar
 * el almacenamiento y consulta de conferencias.
 */

public class ConferenciaRepositorio implements IConferenciaRepositorio{

    /**
     * Lista que almacena las conferencias.
     */
    private ArrayList<Conferencia> listaConferencias;
    
    /**
     * Constructor de la clase. Inicializa la lista de conferencias.
     */
    
    public ConferenciaRepositorio()
    {
        this.listaConferencias= new ArrayList();
    }
    
    /**
    * Almacena una conferencia en la lista.
    * @return true si la conferencia se almacena correctamente, false en caso contrario.
    */
    
    @Override
    public boolean almacenarConferencia(Conferencia objConfererencia) {
        objConfererencia.setId(this.getCantidadConferencias());
        boolean bandera=this.listaConferencias.add(objConfererencia);
        return bandera;
    }
    
    /**
     * Lista todas las conferencias almacenadas.
     *
     * @return Una lista de todas las conferencias.
     */

    @Override
    public List<Conferencia> listarConferencias() {
        return this.listaConferencias;
    }
    
    private int getCantidadConferencias()
    {
        return this.listaConferencias.size()+1;
    }      
}
