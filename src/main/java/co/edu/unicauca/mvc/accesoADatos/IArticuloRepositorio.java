package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.ArrayList;
import java.util.List;

public interface IArticuloRepositorio {
    public boolean almacenarArticulo(Articulo objArticulo);
    public List<Articulo> listarArticulos();
    public boolean eliminarArticulo(int idArticulo);
    public Articulo consultarArticulo(int idArticulo);
    public boolean actualizarArticulo(Articulo objArticulo);
    public boolean asignarEvaluadores(int id, ArrayList<Evaluador> listEvaluadores);
}
