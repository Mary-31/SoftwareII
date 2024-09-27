package co.edu.unicauca.mvc.vistas.adminConferencia;

import co.edu.unicauca.mvc.controladores.ArticuloServicio;
import co.edu.unicauca.mvc.controladores.AutorServicio;
import co.edu.unicauca.mvc.controladores.EvaluadorServicio;
import co.edu.unicauca.mvc.controladores.ConferenciaServicio;
import co.edu.unicauca.mvc.controladores.OrganizadorServicio;
import co.edu.unicauca.mvc.vistas.articulos.VtnListarArticulos;
import co.edu.unicauca.mvc.vistas.articulos.VtnRegistrarArticulo;
import co.edu.unicauca.mvc.vistas.autor.VtnRegistrarAutor;
import co.edu.unicauca.mvc.vistas.evaluador.VtnListarEvaluador;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Clase VtnPrincipalAdmin
 * 
 * Esta clase representa la ventana principal para el administrador en la aplicación de gestión de conferencias.
 * Proporciona la interfaz gráfica para gestionar conferencias, artículos, organizadores, evaluadores y autores.
 * También permite la asignación de roles y la visibilidad de opciones basadas en el rol del usuario.
 * 
 * Se usa la librería Swing para la creación de la interfaz gráfica de usuario.
 */

public class VtnPrincipalAdmin extends javax.swing.JFrame {
    // Declaración de ventanas secundarias que serán gestionadas desde esta ventana principal
    private VtnListarArticulos objVtnListarArticulos;
    private VtnListarConferencias objVtnListarConferencias;
    private VtnListarOrganizadores objVtnRegistrarOrganizadores;
    private VtnRegistrarArticulo objVtnRegistrarArticulo;
    private VtnListarEvaluador objVtnListarEvaluador;
    private VtnRegistrarAutor objVtnRegistrarAutor;
    // Declaración de servicios utilizados por la aplicación
    private ConferenciaServicio objServicio1;
    private ArticuloServicio objServicio2;
    private OrganizadorServicio objServicio3;
    private EvaluadorServicio objServicio4;
    private AutorServicio objSAutores;
    // Rol del usuario actual
    private String rol;
    
     /**
     * Constructor de la clase VtnPrincipalAdmin.
     * Inicializa los componentes gráficos y establece el estado inicial de la ventana.
     */
    
    public VtnPrincipalAdmin() {
        initComponents();
        //establecerIconoOrganización();
        this.setExtendedState(JFrame.NORMAL);
    }
    /**
     * Método para gestionar la visibilidad de los botones según el rol del usuario.
     * 
     * @param rol El rol del usuario actual (Autor, Evaluador, Organizador).
     */
    
    public void gestionRol(String rol) {
        this.rol = rol;
        switch (rol) {
            case "Autor":
                jButtonGestionarE.setVisible(false);
                jButtonGestionarO.setVisible(false);
                jButtonVerArticulosEnviados.setVisible(false);
                break;
            case "Evaluador":
                break;
            case "Organizador":
                jButtonGestionarE.setVisible(true);
                jButtonGestionarO.setVisible(true);
                jButtonVerArticulosEnviados.setVisible(true);
                break;
            default:
                break;
        }
    }
    
    /* Método para asociar los servicios a la ventana principal.
     * 
     * @param objServicio1 Servicio de conferencias.
     * @param objServicio2 Servicio de artículos.
     * @param objServicio3 Servicio de organizadores.
     * @param objServicio4 Servicio de evaluadores.
     * @param objSAutores Servicio de autores.
     */

    public void asociarServios(
            ConferenciaServicio objServicio1,
            ArticuloServicio objServicio2,
            OrganizadorServicio objServicio3,
            EvaluadorServicio objServicio4,
            AutorServicio objSAutores) {
        this.objServicio1 = objServicio1;
        this.objServicio2 = objServicio2;
        this.objServicio3 = objServicio3;
        this.objServicio4 = objServicio4;
        this.objSAutores = objSAutores;
        relacionarInternalFrameConJdesptokPane();
    }
    
    /**
     * Método para relacionar las ventanas internas con el panel de escritorio principal.
     */

    private void relacionarInternalFrameConJdesptokPane() {

        this.objVtnListarArticulos = new VtnListarArticulos(this.objServicio2, this.objServicio1, this.objServicio4);
                this.jDesktopPanelPrincipal.add(this.objVtnListarArticulos);

        this.objVtnListarConferencias = new VtnListarConferencias(this.objServicio1);
                this.jDesktopPanelPrincipal.add(this.objVtnListarConferencias);

        this.objVtnListarEvaluador = new VtnListarEvaluador(this.objServicio2, this.objServicio4);
        this.jDesktopPanelPrincipal.add(this.objVtnListarEvaluador);

        this.objVtnRegistrarOrganizadores = new VtnListarOrganizadores(this.objServicio3);
        this.jDesktopPanelPrincipal.add(this.objVtnRegistrarOrganizadores);

        this.objVtnRegistrarArticulo = new VtnRegistrarArticulo(this.objServicio2, this.objServicio1, this.objSAutores);
                this.jDesktopPanelPrincipal.add(this.objVtnRegistrarArticulo);

        this.objVtnRegistrarAutor = new VtnRegistrarAutor(objSAutores);
                this.jDesktopPanelPrincipal.add(this.objVtnRegistrarAutor);


    }
/*
    private void establecerIconoOrganización() {
        Image img1 = new ImageIcon(getClass().getResource("/recursos/fondo1.jpg")).getImage();
        ImageIcon img2 = new ImageIcon(img1.getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.jLabelImagenOrganizacion.setIcon(img2);
        this.jLabelImagenOrganizacion.setText("");
    }
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCentrar = new javax.swing.JPanel();
        jLabelImagenOrganizacion = new javax.swing.JLabel();
        jPanelBar = new javax.swing.JPanel();
        jButtonGestionarConferencias = new javax.swing.JButton();
        jButtonVerArticulosEnviados = new javax.swing.JButton();
        jButtonGestionarE = new javax.swing.JButton();
        jButtonGestionarO = new javax.swing.JButton();
        jButtonRegistrarArticulo = new javax.swing.JButton();
        btnRegistrarAutor = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelSuperior = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jDesktopPanelPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        setMaximumSize(new java.awt.Dimension(1147483647, 1147483647));
        setSize(new java.awt.Dimension(1072, 400));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanelCentrar.setBackground(new java.awt.Color(204, 204, 204));

        jLabelImagenOrganizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/paper.png"))); // NOI18N

        jPanelBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonGestionarConferencias.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonGestionarConferencias.setText("Gestionar conferencias");
        jButtonGestionarConferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarConferenciasActionPerformed(evt);
            }
        });

        jButtonVerArticulosEnviados.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonVerArticulosEnviados.setText("Gestionar articulos");
        jButtonVerArticulosEnviados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerArticulosEnviadosActionPerformed(evt);
            }
        });

        jButtonGestionarE.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonGestionarE.setText("Gestionar Evaluadores");
        jButtonGestionarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarEActionPerformed(evt);
            }
        });

        jButtonGestionarO.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonGestionarO.setText("Gestionar Organizadores");
        jButtonGestionarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarOActionPerformed(evt);
            }
        });

        jButtonRegistrarArticulo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonRegistrarArticulo.setText("Registrar articulo");
        jButtonRegistrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarArticuloActionPerformed(evt);
            }
        });

        btnRegistrarAutor.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnRegistrarAutor.setText("Registrar Autor");
        btnRegistrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutorActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarLayout = new javax.swing.GroupLayout(jPanelBar);
        jPanelBar.setLayout(jPanelBarLayout);
        jPanelBarLayout.setHorizontalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGestionarConferencias)
                .addGap(0, 0, 0)
                .addComponent(jButtonVerArticulosEnviados)
                .addGap(0, 0, 0)
                .addComponent(jButtonGestionarE)
                .addGap(0, 0, 0)
                .addComponent(jButtonGestionarO)
                .addGap(0, 0, 0)
                .addComponent(jButtonRegistrarArticulo)
                .addGap(0, 0, 0)
                .addComponent(btnRegistrarAutor)
                .addGap(0, 0, 0)
                .addComponent(btnSalir)
                .addGap(85, 85, 85))
        );
        jPanelBarLayout.setVerticalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGestionarConferencias)
                    .addComponent(jButtonVerArticulosEnviados)
                    .addComponent(jButtonGestionarE)
                    .addComponent(jButtonGestionarO)
                    .addComponent(jButtonRegistrarArticulo)
                    .addComponent(btnRegistrarAutor)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCentrarLayout = new javax.swing.GroupLayout(jPanelCentrar);
        jPanelCentrar.setLayout(jPanelCentrarLayout);
        jPanelCentrarLayout.setHorizontalGroup(
            jPanelCentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagenOrganizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanelCentrarLayout.setVerticalGroup(
            jPanelCentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentrarLayout.createSequentialGroup()
                .addGroup(jPanelCentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelImagenOrganizacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCentrarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCentrar);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelSuperior.setAlignmentX(0.0F);
        jPanelSuperior.setAlignmentY(0.0F);
        jPanelSuperior.setAutoscrolls(true);
        jPanelSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelSuperior.setLayout(new javax.swing.BoxLayout(jPanelSuperior, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jPanelSuperior);

        jPanelCentral.setLayout(new java.awt.BorderLayout());

        jDesktopPanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPanelPrincipal.setMaximumSize(new java.awt.Dimension(1072, 400));

        javax.swing.GroupLayout jDesktopPanelPrincipalLayout = new javax.swing.GroupLayout(jDesktopPanelPrincipal);
        jDesktopPanelPrincipal.setLayout(jDesktopPanelPrincipalLayout);
        jDesktopPanelPrincipalLayout.setHorizontalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jDesktopPanelPrincipalLayout.setVerticalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        jPanelCentral.add(jDesktopPanelPrincipal, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelCentral);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Configurar la ventana para ocultarse al cerrarse
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButtonGestionarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarOActionPerformed
        // Configurar la ventana para ocultarse al cerrarse
        this.objVtnRegistrarOrganizadores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(true);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarOActionPerformed

    private void jButtonGestionarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarEActionPerformed
        // Configurar la ventana para ocultarse al cerrarse
        this.objVtnListarEvaluador.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.objVtnListarEvaluador.setVisible(true);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarEActionPerformed

    private void jButtonVerArticulosEnviadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerArticulosEnviadosActionPerformed
        // Configurar la ventana para ocultarse al cerrarse
        this.objVtnListarArticulos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        objVtnListarArticulos.initialize();
        this.objVtnListarArticulos.setVisible(true);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
    }//GEN-LAST:event_jButtonVerArticulosEnviadosActionPerformed

    private void jButtonGestionarConferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarConferenciasActionPerformed
        // Configurar la ventana para ocultarse al cerrarse
        this.objVtnListarConferencias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.objVtnListarConferencias.gestionRol(rol);
        this.objVtnListarConferencias.setVisible(true);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarConferenciasActionPerformed

    private void jButtonRegistrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarArticuloActionPerformed
        // Configurar la ventana para ocultarse al cerrarse
        this.objVtnRegistrarArticulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        objVtnRegistrarArticulo.initialize();
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(true);
        this.objVtnRegistrarAutor.setVisible(false);
    }//GEN-LAST:event_jButtonRegistrarArticuloActionPerformed

    private void btnRegistrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutorActionPerformed
       // Configurar la ventana para ocultarse al cerrarse
        this.objVtnRegistrarAutor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE); 
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(true);
    }//GEN-LAST:event_btnRegistrarAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarAutor;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButtonGestionarConferencias;
    private javax.swing.JButton jButtonGestionarE;
    private javax.swing.JButton jButtonGestionarO;
    private javax.swing.JButton jButtonRegistrarArticulo;
    private javax.swing.JButton jButtonVerArticulosEnviados;
    private javax.swing.JDesktopPane jDesktopPanelPrincipal;
    private javax.swing.JLabel jLabelImagenOrganizacion;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelCentrar;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
