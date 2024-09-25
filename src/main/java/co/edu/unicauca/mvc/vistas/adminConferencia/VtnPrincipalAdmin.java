package co.edu.unicauca.mvc.vistas.adminConferencia;


import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoEvaluadores;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoOrganizadores;
import co.edu.unicauca.mvc.vistas.VtnLogin;
import co.edu.unicauca.mvc.vistas.articulos.VtnListarArticulos;
import co.unicauca.mvc.vistas.evaluador.VtnListarEvaluador;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VtnPrincipalAdmin extends javax.swing.JFrame {
    
    private VtnVerEstadisticas objVtnVerEstadisticas;
    private VtnListarArticulos objVtnListarArticulos;
    private VtnListarConferencias objVtnListarConferencias;
    private VtnVerArticulosEnviadosConferencias objVtnVerPrestamos;
    private VtnListarOrganizadores objVtnRegistrarOrganizadores;
    private VtnListarArticulos objVtnRegistrarArticulos;
    private VtnListarEvaluador objVtnListarEvaluador;
    private ServicioAlmacenamientoConferencias objServicio1;   
    private ServicioAlmacenamientoArticulos  objServicio2;
    private ServicioAlmacenamientoOrganizadores objServicio3;
    private ServicioAlmacenamientoEvaluadores  objServicio4;
        
    public VtnPrincipalAdmin() {
        initComponents();
        establecerIconoOrganización();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void gestionRol(String rol){
        switch (rol) {
            case "Autor":
                jButtonGestionarE.setVisible(false);
                jButtonGestionarO.setVisible(false);
                jButtonVerArticulosEnviados.setVisible(false);
                jButtonVerEstadisticas.setVisible(false);
                break;
            case "Evaluador":
                break;
            default:
                break;
        }
    }
    
    public void asociarServios(
        ServicioAlmacenamientoConferencias objServicio1,
        ServicioAlmacenamientoArticulos objServicio2, 
        ServicioAlmacenamientoOrganizadores objServicio3,
        ServicioAlmacenamientoEvaluadores objServicio4)
    {
        this.objServicio1=objServicio1;
        this.objServicio2=objServicio2;
        this.objServicio3=objServicio3;
        this.objServicio4=objServicio4;
        relacionarInternalFrameConJdesptokPane();
    }
    
    private void relacionarInternalFrameConJdesptokPane()
    {
        this.objVtnVerEstadisticas=new VtnVerEstadisticas();         
        this.jDesktopPanelPrincipal.add(this.objVtnVerEstadisticas);
        
        this.objVtnListarArticulos= new VtnListarArticulos(this.objServicio2, this.objServicio1);
        this.jDesktopPanelPrincipal.add(this.objVtnListarArticulos);
        
        this.objVtnListarConferencias= new VtnListarConferencias(this.objServicio1);
        this.jDesktopPanelPrincipal.add(this.objVtnListarConferencias);
        
        this.objVtnListarEvaluador= new VtnListarEvaluador(this.objServicio2, this.objServicio4);
        this.jDesktopPanelPrincipal.add(this.objVtnListarEvaluador);
        
        this.objVtnRegistrarOrganizadores  = new VtnListarOrganizadores(this.objServicio3);
        this.jDesktopPanelPrincipal.add(this.objVtnRegistrarOrganizadores);
        
        this.objVtnVerPrestamos= new VtnVerArticulosEnviadosConferencias();
        this.jDesktopPanelPrincipal.add(this.objVtnVerPrestamos);
    }

    private void establecerIconoOrganización()
    {
        Image img1= new ImageIcon(getClass().getResource("/recursos/logo.png")).getImage();
        ImageIcon img2=new ImageIcon(img1.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.jLabelImagenOrganizacion.setIcon(img2);
        this.jLabelImagenOrganizacion.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jButtonGestionarConferencias = new javax.swing.JButton();
        jButtonVerArticulosEnviados = new javax.swing.JButton();
        jButtonVerEstadisticas = new javax.swing.JButton();
        jButtonGestionarE = new javax.swing.JButton();
        jButtonGestionarO = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jDesktopPanelPrincipal = new javax.swing.JDesktopPane();
        jPanelInferior = new javax.swing.JPanel();
        jLabelImagenOrganizacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelSuperior.setAlignmentX(0.0F);
        jPanelSuperior.setAlignmentY(0.0F);
        jPanelSuperior.setLayout(new javax.swing.BoxLayout(jPanelSuperior, javax.swing.BoxLayout.LINE_AXIS));

        jButtonGestionarConferencias.setText("Gestionar conferencias");
        jButtonGestionarConferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarConferenciasActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonGestionarConferencias);

        jButtonVerArticulosEnviados.setText("Ver articulos enviados");
        jButtonVerArticulosEnviados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerArticulosEnviadosActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonVerArticulosEnviados);

        jButtonVerEstadisticas.setText("Ver estadisticas");
        jButtonVerEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerEstadisticasActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonVerEstadisticas);

        jButtonGestionarE.setText("Gestionar Evaluadores");
        jButtonGestionarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarEActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonGestionarE);

        jButtonGestionarO.setText("Gestionar Organizadores");
        jButtonGestionarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarOActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonGestionarO);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanelSuperior.add(btnSalir);

        getContentPane().add(jPanelSuperior);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelCentral.setLayout(new java.awt.BorderLayout());
        jPanelCentral.add(jDesktopPanelPrincipal, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelCentral);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelInferior.setPreferredSize(new java.awt.Dimension(75, 50));

        jLabelImagenOrganizacion.setText("jLabel1");

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelImagenOrganizacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelImagenOrganizacion)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelInferior);
        jPanelInferior.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButtonGestionarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarOActionPerformed
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnVerPrestamos.setVisible(false);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnVerPrestamos.setVisible(false);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(true);
    }//GEN-LAST:event_jButtonGestionarOActionPerformed

    private void jButtonGestionarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarEActionPerformed
        this.objVtnListarEvaluador.setVisible(true);
        this.objVtnVerPrestamos.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarEActionPerformed

    private void jButtonVerEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerEstadisticasActionPerformed
        this.objVtnVerEstadisticas.setVisible(true);
        this.objVtnVerPrestamos.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
    }//GEN-LAST:event_jButtonVerEstadisticasActionPerformed

    private void jButtonVerArticulosEnviadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerArticulosEnviadosActionPerformed
        this.objVtnVerPrestamos.setVisible(true);
        this.objVtnListarArticulos.setVisible(true);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
    }//GEN-LAST:event_jButtonVerArticulosEnviadosActionPerformed

    private void jButtonGestionarConferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarConferenciasActionPerformed
        this.objVtnListarConferencias.setVisible(true);
        this.objVtnVerPrestamos.setVisible(false);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarConferenciasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButtonGestionarConferencias;
    private javax.swing.JButton jButtonGestionarE;
    private javax.swing.JButton jButtonGestionarO;
    private javax.swing.JButton jButtonVerArticulosEnviados;
    private javax.swing.JButton jButtonVerEstadisticas;
    private javax.swing.JDesktopPane jDesktopPanelPrincipal;
    private javax.swing.JLabel jLabelImagenOrganizacion;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
