package co.edu.unicauca.mvc.modelos;

import java.util.ArrayList;

public class Articulo {
    private int idArticulo;
    private String titulo;
    private String resumen;
    private String palabrasClave;
    private ArrayList<Autor> autores;
    private Conferencia objConferencia;
   
    public Articulo(int idArticulo, String titulo, String resumen, String palabrasClave, ArrayList<Autor> autores, Conferencia objConferencia) {
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.resumen = resumen;
        this.palabrasClave = palabrasClave;
        this.autores = autores;
        this.objConferencia = objConferencia;
    }

    public Articulo() {
        
    }
    
    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public Conferencia getObjConferencia() {
        return objConferencia;
    }

    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }
}
