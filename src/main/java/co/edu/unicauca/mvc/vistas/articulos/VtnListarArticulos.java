package co.edu.unicauca.mvc.vistas.articulos;

import co.edu.unicauca.mvc.controladores.ArticuloServicio;
import co.edu.unicauca.mvc.controladores.AutorServicio;
import co.edu.unicauca.mvc.controladores.ConferenciaServicio;
import co.edu.unicauca.mvc.controladores.EvaluadorServicio;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Autor;
import co.edu.unicauca.mvc.modelos.Conferencia;
import co.edu.unicauca.mvc.utilidades.Utilidades;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class VtnListarArticulos extends javax.swing.JInternalFrame {
    // Variables de instancia para los servicios utilizados en la ventana
    public ArticuloServicio objServicio;
    public ConferenciaServicio objServicio2;
    public AutorServicio objSAutores;
    private EvaluadorServicio objSEvaluador;
    /**
     * Constructor de la clase VtnListarArticulos.
     * 
     * @param objServicio Servicio para gestionar los artículos.
     * @param objServicio2 Servicio para gestionar las conferencias.
     * @param objSEvaluador Servicio para gestionar los evaluadores.
     */
    public VtnListarArticulos(
            ArticuloServicio objServicio,
            ConferenciaServicio objServicio2,
            EvaluadorServicio objSEvaluador,
            AutorServicio objSAutores) {
        initComponents();
        this.objServicio = objServicio;
        this.objServicio2 = objServicio2;
        this.objSEvaluador = objSEvaluador;
        this.objSAutores = objSAutores;
        this.jTableListarArticulos.setDefaultRenderer(Object.class, new Render());
    }

    // Método para llenar las tablas u otros elementos que necesiten actualizarse
    /**
     * Método para inicializar la ventana y actualizar los elementos.
     */
    public void initialize() {
        btnAsignar.setVisible(false);
        llenarTabla();
    }
    
    /**
     * Gestiona la visibilidad de los elementos de la ventana según el rol del usuario.
     *
     * @param rol El rol del usuario (Autor, Evaluador, Organizador).
     */

    public void gestionRol(String rol) {
        switch (rol) {
            case "Autor":
                btnAsignar.setEnabled(false);
                break;
            case "Organizador":
                btnAsignar.setEnabled(true);
                break;
            default:
                break;
        }
    }
    
    /**
     * Método para limpiar la tabla de artículos.
     */
    public void limpiarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableListarArticulos.getModel();
        int filas = this.jTableListarArticulos.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
    }
    /**
     * Método para llenar la tabla con los artículos listados.
     */
    public void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) this.jTableListarArticulos.getModel();
        limpiarTabla();
        ArrayList<Articulo> listaArticulos
                = (ArrayList<Articulo>) this.objServicio.listarArticulos();

        JButton JButtonEliminarArticulo = new JButton();
        JButtonEliminarArticulo.setName("Eliminar");
        JButtonEliminarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/remove.png")));

        JButton JButtonActualizarArticulo = new JButton();
        JButtonActualizarArticulo.setName("Actualizar");
        JButtonActualizarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/aplicar.png")));
        // Agregar filas a la tabla con los datos de cada artículo
        for (Articulo articulo : listaArticulos) {
            StringBuilder autoresConcatenados = new StringBuilder();
            for (Autor autor : articulo.getAutores()) {
                if (autoresConcatenados.length() > 0) {
                    autoresConcatenados.append(" - "); // Agregar una coma como separador
                }
                autoresConcatenados.append(autor.getNombre()).append(" ").append(autor.getApellido());
            }
            model.addRow(new Object[]{
                articulo.getIdArticulo(),
                articulo.getTitulo(),
                articulo.getResumen(),
                articulo.getPalabrasClave(),
                autoresConcatenados.toString(),
                articulo.getObjConferencia().getNombre(),
                JButtonActualizarArticulo,
                JButtonEliminarArticulo
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblIndice = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarArticulos = new javax.swing.JTable();
        btnAsignar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jPanelInferior = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(789, 416));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Listado de articulos");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIndice)
                .addGap(31, 31, 31))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblIndice))
                .addContainerGap())
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setForeground(new java.awt.Color(0, 0, 153));

        jTableListarArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TITULO", "RESUMEN", "PALABRAS CLAVE", "AUTORES", "CONFERENCIA", "ACTUALIZAR", "ELIMINAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListarArticulos.setColumnSelectionAllowed(true);
        jTableListarArticulos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableListarArticulos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableListarArticulos.setShowGrid(true);
        jTableListarArticulos.setSurrendersFocusOnKeystroke(true);
        jTableListarArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarArticulos);
        jTableListarArticulos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar.png"))); // NOI18N
        btnAsignar.setText("Asignar Evaluador");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/verificar.png"))); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRegistrar)))
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(btnAsignar))
                .addContainerGap())
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        jPanelInferior.setPreferredSize(new java.awt.Dimension(777, 30));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción del botón registrar para abrir la ventana de registro de artículos.
     * 
     * @param evt Evento de acción.
     */
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        VtnRegistrarArticulo objVtnRegistrarArticulo = new VtnRegistrarArticulo(objServicio, objServicio2, objSAutores, this);
        objVtnRegistrarArticulo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objVtnRegistrarArticulo.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed
    /**
     * Manejo del evento de clic en la tabla de artículos.
     * 
     * @param evt Evento de clic del mouse.
     */
    private void jTableListarArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarArticulosMouseClicked
        btnAsignar.setVisible(true);
        int column = this.jTableListarArticulos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTableListarArticulos.getRowHeight();

        if (row < jTableListarArticulos.getRowCount() && row >= 0 && column < jTableListarArticulos.getColumnCount() && column >= 0) {
            Object value = jTableListarArticulos.getValueAt(row, column);

            if (value instanceof JButton) {

                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                String idArticulo = jTableListarArticulos.getValueAt(row, 0).toString();
                int idArticuloConvertido = Integer.parseInt(idArticulo);
                if (boton.getName().equals("Eliminar")) {
                    try {
                        if (Utilidades.mensajeConfirmacion("¿ Estás seguro de que quieres eliminar el artículo con identificador " + idArticulo + " "
                                + " ?", "Confirmación") == 0) {
                            boolean bandera = this.objServicio.eliminarArticulo(idArticuloConvertido);
                            if (bandera == true) {
                                Utilidades.mensajeExito("El articulo con identificador " + idArticuloConvertido + " fue eliminado exitosamente", "Articulo eliminado");
                                llenarTabla();
                            } else {
                                Utilidades.mensajeAdvertencia("El artículo con identificador " + idArticuloConvertido + " no fue eliminado", "Error al eliminar");

                            }
                        }
                    } catch (Exception ex) {
                        Utilidades.mensajeError("Error al eliminar usuario. Intentelo de nuevo más tarde", "Error");
                    }
                } else if (boton.getName().equals("Actualizar")) {
                    VtnActualizarArticulo objVtnActualizarArticulo
                            = new VtnActualizarArticulo(objServicio, objServicio2);
                    objVtnActualizarArticulo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    objVtnActualizarArticulo.cargarDatos(idArticuloConvertido);
                    objVtnActualizarArticulo.setVisible(true);

                }
            }
        }


    }//GEN-LAST:event_jTableListarArticulosMouseClicked
    /**
     * Acción del botón asignar para abrir la ventana de asignación de evaluadores.
     * 
     * @param evt Evento de acción.
     */
    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        int indice = jTableListarArticulos.getSelectedRow();
        int idArticulo = Integer.parseInt(jTableListarArticulos.getValueAt(indice, 0).toString());
        VtnAsignarEvaluador objVtnAsignarEvaluador = new VtnAsignarEvaluador(objServicio, objSEvaluador, idArticulo);
        String titulo = jTableListarArticulos.getValueAt(indice, 0).toString(); 
        objVtnAsignarEvaluador.lblArticulo.setText(titulo);
        objVtnAsignarEvaluador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objVtnAsignarEvaluador.setVisible(true);
    }//GEN-LAST:event_btnAsignarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAsignar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarArticulos;
    private javax.swing.JLabel lblIndice;
    // End of variables declaration//GEN-END:variables
}
