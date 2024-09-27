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
            EvaluadorServicio objSEvaluador) {
        initComponents();
        this.objServicio = objServicio;
        this.objServicio2 = objServicio2;
        this.objSEvaluador = objSEvaluador;
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
    /*public void agregaDatos() {
        
        Articulo objA1 = new Articulo("Articulo1", "Resumen1", "Palabras1", null, 1, )
        Conferencia objConferencia1 = new Conferencia(1, "Conferencia1", fechaInicio, fechaFin, "Ubicacion1");
        this.objServicioAlmacenamiento.almacenarConferencia(objConferencia1);

        Conferencia objConferencia2 = new Conferencia(2, "Conferencia2", fechaInicio, fechaFin, "Ubicacion2");
        this.objServicioAlmacenamiento.almacenarConferencia(objConferencia2);

        Conferencia objConferencia3 = new Conferencia(3, "Conferencia3", fechaInicio, fechaFin, "Ubicacion3");
        this.objServicioAlmacenamiento.almacenarConferencia(objConferencia3);

        Conferencia objConferencia4 = new Conferencia(4, "Conferencia4", fechaInicio, fechaFin, "Ubicacion4");
        this.objServicioAlmacenamiento.almacenarConferencia(objConferencia4);
    }*/

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblIndice = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarArticulos = new javax.swing.JTable();
        jButtonRegistrar = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Gestionar articulos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(209, 209, 209)
                .addComponent(lblIndice)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblIndice))
                .addContainerGap())
        );

        jPanel3.setForeground(new java.awt.Color(0, 0, 153));

        jTableListarArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Titulo", "Resumen", "Palabras clave", "Autores", "Conferencia", "Actualizar", "Eliminar"
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
        jTableListarArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarArticulos);
        jTableListarArticulos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/verificar.png"))); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/asignar.png"))); // NOI18N
        btnAsignar.setText("Asignar Evaluador");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrar)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(btnAsignar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción del botón registrar para abrir la ventana de registro de artículos.
     * 
     * @param evt Evento de acción.
     */
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        VtnRegistrarArticulo objVtnRegistrarArticulo = new VtnRegistrarArticulo(objServicio, objServicio2, objSAutores);
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
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarArticulos;
    private javax.swing.JLabel lblIndice;
    // End of variables declaration//GEN-END:variables
}
