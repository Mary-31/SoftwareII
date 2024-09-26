package co.edu.unicauca.mvc.controladores;

import java.util.List;
import co.edu.unicauca.mvc.modelos.Conferencia;
import co.edu.unicauca.mvc.accesoADatos.IConferenciaRepositorio;

public class ConferenciaServicio {

    private IConferenciaRepositorio objIConferencia;

    public ConferenciaServicio(IConferenciaRepositorio objIConferencia) {
        this.objIConferencia = objIConferencia;
    }

    public boolean almacenarConferencia(Conferencia objConfererencia) {
        boolean bandera = this.objIConferencia.almacenarConferencia(objConfererencia);
        return bandera;
    }

    public List<Conferencia> listarConferencias() {
        return this.objIConferencia.listarConferencias();
    }
}
