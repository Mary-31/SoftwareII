package co.edu.unicauca.mvc.controladores;

import java.util.List;
import co.edu.unicauca.mvc.modelos.Organizador;
import co.edu.unicauca.mvc.accesoADatos.IOrganizadorRepositorio;

/**
 *
 * @author Usuario
 */
public class OrganizadorServicio {

    private IOrganizadorRepositorio objIOrganizador;

    public OrganizadorServicio(IOrganizadorRepositorio objIOrganizador) {
        this.objIOrganizador = objIOrganizador;
    }

    public boolean almacenarOrganizador(Organizador objOrganizador) {
        boolean bandera = this.objIOrganizador.almacenarOrganizador(objOrganizador);
        return bandera;
    }

    public List<Organizador> listarOrganizador() {
        return this.objIOrganizador.listarOrganizadores();
    }
}
