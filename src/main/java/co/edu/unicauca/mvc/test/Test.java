package co.edu.unicauca.mvc.test;

import co.edu.unicauca.mvc.accesoADatos.RepositorioArticuloMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioConferenciaMemoriaLinkedist;
import co.edu.unicauca.mvc.accesoADatos.RepositorioEvaluadorMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioOrganizadorMemoriaLinkedist;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoEvaluadores;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoOrganizadores;
import co.edu.unicauca.mvc.vistas.adminConferencia.VtnPrincipalAdmin;
import javax.swing.UIManager;



public class Test {
    public static void main(String[] args) {
        
        seleccionarLookAndField();
                
        RepositorioConferenciaMemoriaLinkedist objRepositorio1=
                new RepositorioConferenciaMemoriaLinkedist();
        ServicioAlmacenamientoConferencias objServicio1
                = new   ServicioAlmacenamientoConferencias(objRepositorio1);
        
        RepositorioArticuloMemoriaArrayList objRepositorio2
                = new RepositorioArticuloMemoriaArrayList();
        ServicioAlmacenamientoArticulos objServicio2
                = new ServicioAlmacenamientoArticulos(objRepositorio2);
        
        RepositorioOrganizadorMemoriaLinkedist objRepositorio3
                = new RepositorioOrganizadorMemoriaLinkedist();
        ServicioAlmacenamientoOrganizadores objServicio3
                = new ServicioAlmacenamientoOrganizadores(objRepositorio3);
        
        RepositorioEvaluadorMemoriaArrayList objRepositorio4=
                new RepositorioEvaluadorMemoriaArrayList();
        ServicioAlmacenamientoEvaluadores objServicio4
                = new   ServicioAlmacenamientoEvaluadores(objRepositorio4); 
        
        
        VtnPrincipalAdmin objVtnPrincipal= new VtnPrincipalAdmin();    
        objVtnPrincipal.asociarServios(objServicio1,objServicio2, objServicio3, objServicio4); 
        
        objVtnPrincipal.setVisible(true);
    }
    
    private static void seleccionarLookAndField()
    {
        for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(laf.getName()))
                try {
                UIManager.setLookAndFeel(laf.getClassName());
                 } catch (Exception ex) {
            }
        }
    }
    
    
    
}
