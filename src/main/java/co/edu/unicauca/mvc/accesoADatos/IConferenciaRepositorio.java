package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Conferencia;
import java.util.List;

public interface IConferenciaRepositorio {
    public boolean almacenarConferencia(Conferencia objConferencia);
    public List<Conferencia> listarConferencias();
}