package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.IArticuloRepositorio;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.ArrayList;
import java.util.List;


public class ArticuloServicio {
    private IArticuloRepositorio objIArticulo;
    
    public ArticuloServicio(IArticuloRepositorio objIArticulo)
    {
        this.objIArticulo = objIArticulo;
    }
    
    public boolean almacenarArticulo(Articulo objArticulo)
    {
        return this.objIArticulo.almacenarArticulo(objArticulo);
    }
      
    public List<Articulo> listarArticulos()
    {
        return this.objIArticulo.listarArticulos();
    }
    
    public boolean eliminarArticulo(int idArticulo)
    {
        return this.objIArticulo.eliminarArticulo(idArticulo);
    }
    
    public Articulo consultarArticulo(int idArticulo)
    {
        return this.objIArticulo.consultarArticulo(idArticulo);
    }
    
    public boolean actualizarArticulo(Articulo objArticulo)
    {
        return this.objIArticulo.actualizarArticulo(objArticulo);
    }
    
    public boolean asignarEvaluador(int id, ArrayList<Evaluador> listEvaluadores) {
        return this.objIArticulo.asignarEvaluadores(id, listEvaluadores);
    }
}
