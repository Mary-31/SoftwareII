package co.edu.unicauca.mvc.vistas.evaluador;

import co.edu.unicauca.mvc.controladores.ArticuloServicio;
import co.edu.unicauca.mvc.controladores.EvaluadorServicio;
import co.edu.unicauca.mvc.modelos.Evaluador;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.utilidades.Utilidades;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author Mary
 */

/**
 * Clase VtnRegistrarEvaluador.
 * 
 * Esta clase representa una ventana para registrar un nuevo evaluador en la aplicación.
 */
public class VtnRegistrarEvaluador extends javax.swing.JFrame {

    private EvaluadorServicio objServicio4;
    
    /**
     * Constructor de la clase VtnRegistrarEvaluador.
     * 
     * Inicializa la ventana y asigna el servicio de evaluadores.
     * 
     * @param objServicio4 Instancia del servicio de evaluadores.
     */
    
    public VtnRegistrarEvaluador(EvaluadorServicio objServicio4) {
        initComponents();
        this.objServicio4=objServicio4;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInferior = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jLabelNombreE = new javax.swing.JLabel();
        jLabelTemasE = new javax.swing.JLabel();
        jTextFieldNombreE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTemas = new javax.swing.JTextArea();
        jButtonRegistrarE = new javax.swing.JButton();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelTemasE1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelTitulo.setText("Registrar Evaluador");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(147, 147, 147))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitulo)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNombreE.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelNombreE.setText("Nombre:");

        jLabelTemasE.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelTemasE.setText("Temas Experto:");

        jTextAreaTemas.setColumns(20);
        jTextAreaTemas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTemas);

        jButtonRegistrarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cliente.png"))); // NOI18N
        jButtonRegistrarE.setText("Registrar");
        jButtonRegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarEActionPerformed(evt);
            }
        });

        jLabelApellido.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelApellido.setText("Apellido:");

        jLabelTemasE1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelTemasE1.setText("Correo:");

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrarE))
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreE)
                            .addComponent(jLabelApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTemasE1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTemasE, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabelNombreE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTemasE1))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTemasE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de acción para el botón de registrar evaluador.
     * 
     * Recoge los datos ingresados en los campos de texto, crea un nuevo objeto Evaluador,
     * y llama al servicio para almacenar el evaluador en el sistema. Muestra mensajes 
     * de éxito o error según el resultado de la operación.
     * 
     * @param evt Evento de acción que ocurre al presionar el botón.
     */
    
    private void jButtonRegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarEActionPerformed
        String nombreEvaluador, apellidoEvaluador, temasExperto, correo;
    
        boolean bandera;
        
        nombreEvaluador=this.jTextFieldNombreE.getText();
        apellidoEvaluador=this.jTextFieldApellido.getText();
        temasExperto=this.jTextAreaTemas.getText();
        correo = this.txtCorreo.getText();
        
        Evaluador objEvaluador= new Evaluador();
        objEvaluador.setNombre(nombreEvaluador);
        objEvaluador.setApellido(apellidoEvaluador);
        objEvaluador.setTemasExperto(temasExperto);
        objEvaluador.setCorreo(correo);
        
        bandera=this.objServicio4.almacenarEvaluador(objEvaluador);
        
        if(bandera==true)
        {
            Utilidades.mensajeExito("Registro exitoso", "Registro exitoso");
            dispose();
        }
        else
        {
            Utilidades.mensajeError("Evaluador no almacenado","Error al almacenar el evaluador");
        }
    }//GEN-LAST:event_jButtonRegistrarEActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarE;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelNombreE;
    private javax.swing.JLabel jLabelTemasE;
    private javax.swing.JLabel jLabelTemasE1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTemas;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombreE;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
