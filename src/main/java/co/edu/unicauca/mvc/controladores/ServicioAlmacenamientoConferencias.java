package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioConferencia;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Conferencia;


public class ServicioAlmacenamientoConferencias{
    
    private InterfaceRepositorioConferencia referenciaRepositorioConferencias;
    
    public ServicioAlmacenamientoConferencias(InterfaceRepositorioConferencia referenciaRepositorioConferencias)
    {
        this.referenciaRepositorioConferencias=referenciaRepositorioConferencias;
    }
    
    public boolean almacenarConferencia(Conferencia objConfererencia) {
        boolean bandera=this.referenciaRepositorioConferencias.almacenarConferencia(objConfererencia);
        return bandera;
    }

   
    public List<Conferencia> listarConferencias() {
        return this.referenciaRepositorioConferencias.listarConferencias();
    }
}
