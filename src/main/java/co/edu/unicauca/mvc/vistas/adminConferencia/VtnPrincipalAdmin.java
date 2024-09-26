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

public class VtnPrincipalAdmin extends javax.swing.JFrame {

    private VtnListarArticulos objVtnListarArticulos;
    private VtnListarConferencias objVtnListarConferencias;
    private VtnListarOrganizadores objVtnRegistrarOrganizadores;
    private VtnRegistrarArticulo objVtnRegistrarArticulo;
    private VtnListarEvaluador objVtnListarEvaluador;
    private VtnRegistrarAutor objVtnRegistrarAutor;

    private ConferenciaServicio objServicio1;
    private ArticuloServicio objServicio2;
    private OrganizadorServicio objServicio3;
    private EvaluadorServicio objServicio4;
    private AutorServicio objSAutores;
    private String rol;

    public VtnPrincipalAdmin() {
        initComponents();
        establecerIconoOrganización();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

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

    private void establecerIconoOrganización() {
        Image img1 = new ImageIcon(getClass().getResource("/recursos/logo.png")).getImage();
        ImageIcon img2 = new ImageIcon(img1.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.jLabelImagenOrganizacion.setIcon(img2);
        this.jLabelImagenOrganizacion.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jButtonGestionarConferencias = new javax.swing.JButton();
        jButtonVerArticulosEnviados = new javax.swing.JButton();
        jButtonGestionarE = new javax.swing.JButton();
        jButtonGestionarO = new javax.swing.JButton();
        jButtonRegistrarArticulo = new javax.swing.JButton();
        btnRegistrarAutor = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jDesktopPanelPrincipal = new javax.swing.JDesktopPane();
        jPanelInferior = new javax.swing.JPanel();
        jLabelImagenOrganizacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanelSuperior.setAlignmentX(0.0F);
        jPanelSuperior.setAlignmentY(0.0F);
        jPanelSuperior.setAutoscrolls(true);
        jPanelSuperior.setLayout(new javax.swing.BoxLayout(jPanelSuperior, javax.swing.BoxLayout.LINE_AXIS));

        jButtonGestionarConferencias.setText("Gestionar conferencias");
        jButtonGestionarConferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarConferenciasActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonGestionarConferencias);

        jButtonVerArticulosEnviados.setText("Gestionar articulos");
        jButtonVerArticulosEnviados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerArticulosEnviadosActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonVerArticulosEnviados);

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

        jButtonRegistrarArticulo.setText("Registrar articulo");
        jButtonRegistrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarArticuloActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonRegistrarArticulo);

        btnRegistrarAutor.setText("Registrar Autor");
        btnRegistrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutorActionPerformed(evt);
            }
        });
        jPanelSuperior.add(btnRegistrarAutor);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanelSuperior.add(btnSalir);

        getContentPane().add(jPanelSuperior);

        jPanelCentral.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jDesktopPanelPrincipalLayout = new javax.swing.GroupLayout(jDesktopPanelPrincipal);
        jDesktopPanelPrincipal.setLayout(jDesktopPanelPrincipalLayout);
        jDesktopPanelPrincipalLayout.setHorizontalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jDesktopPanelPrincipalLayout.setVerticalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jPanelCentral.add(jDesktopPanelPrincipal, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelCentral);

        jPanelInferior.setPreferredSize(new java.awt.Dimension(75, 50));

        jLabelImagenOrganizacion.setText("jLabel1");

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelImagenOrganizacion)
                .addContainerGap(988, Short.MAX_VALUE))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelImagenOrganizacion)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelInferior);
        jPanelInferior.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButtonGestionarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarOActionPerformed
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(true);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarOActionPerformed

    private void jButtonGestionarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarEActionPerformed
        this.objVtnListarEvaluador.setVisible(true);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarEActionPerformed

    private void jButtonVerArticulosEnviadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerArticulosEnviadosActionPerformed
        objVtnListarArticulos.initialize();
        this.objVtnListarArticulos.setVisible(true);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
    }//GEN-LAST:event_jButtonVerArticulosEnviadosActionPerformed

    private void jButtonGestionarConferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarConferenciasActionPerformed
        this.objVtnListarConferencias.gestionRol(rol);
        this.objVtnListarConferencias.setVisible(true);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(false);
        this.objVtnRegistrarAutor.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarConferenciasActionPerformed

    private void jButtonRegistrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarArticuloActionPerformed
        objVtnRegistrarArticulo.initialize();
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarArticulo.setVisible(true);
        this.objVtnRegistrarAutor.setVisible(false);
    }//GEN-LAST:event_jButtonRegistrarArticuloActionPerformed

    private void btnRegistrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutorActionPerformed
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
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
