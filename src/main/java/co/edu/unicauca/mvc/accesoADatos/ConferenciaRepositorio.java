package co.edu.unicauca.mvc.accesoADatos;

import java.util.ArrayList;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Conferencia;


public class ConferenciaRepositorio implements IConferenciaRepositorio{

    private ArrayList<Conferencia> listaConferencias;
    
    public ConferenciaRepositorio()
    {
        this.listaConferencias= new ArrayList();
    }
    
    @Override
    public boolean almacenarConferencia(Conferencia objConfererencia) {
        objConfererencia.setId(this.getCantidadConferencias());
        boolean bandera=this.listaConferencias.add(objConfererencia);
        return bandera;
    }

    @Override
    public List<Conferencia> listarConferencias() {
        return this.listaConferencias;
    }
    
    private int getCantidadConferencias()
    {
        return this.listaConferencias.size()+1;
    }
    
    
    
}
