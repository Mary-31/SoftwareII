package co.edu.unicauca.mvc.controladores;
import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioOrganizador;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Organizador;
/**
 *
 * @author Usuario
 */
public class ServicioAlmacenamientoOrganizadores {
    
    private InterfaceRepositorioOrganizador referenciaRepositorioOrganizadores;
    
    public ServicioAlmacenamientoOrganizadores(InterfaceRepositorioOrganizador referenciaRepositorioOrganizadores)
    {
        this.referenciaRepositorioOrganizadores=referenciaRepositorioOrganizadores;
    }
    
    public boolean almacenarOrganizador(Organizador objOrganizador) {
        boolean bandera=this.referenciaRepositorioOrganizadores.almacenarOrganizador(objOrganizador);
        return bandera;
    }

   
    public List<Organizador> listarOrganizador() {
        return this.referenciaRepositorioOrganizadores.listarOrganizadores();
    }
}

