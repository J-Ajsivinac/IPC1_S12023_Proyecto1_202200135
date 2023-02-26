package Componentes.CRUD;

import Administrador.Regiones;
import Administrador.ctrlRegiones;
import Elementos.CutomTable.TableActionCellEditor;
import Elementos.CutomTable.TableActionCellEditorEliminar;
import Elementos.CutomTable.TableActionCellRender;
import Elementos.CutomTable.TableActionCellRenderEliminar;
import Elementos.CutomTable.TableActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mesoi
 */
public class AdminModificarRegion extends javax.swing.JPanel {

    private ArrayList<Regiones> totalRegiones;
    private DefaultTableModel modelo;
    private ArrayList<Regiones> regio;

    /**
     * Creates new form AdminModificarRegion
     */
    public AdminModificarRegion() {
        initComponents();
        this.setBounds(0, 0, 698, 422);
        modelo = (DefaultTableModel) tabla2.getModel();

        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                //System.out.println("Edit row : " + row);
                String dato = String.valueOf(modelo.getValueAt(row, 0));
                System.out.println(dato);
            }

            @Override
            public void onDelete(int row) {
                if (tabla2.isEditing()) {
                    tabla2.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) tabla2.getModel();

                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };

        tabla2.getColumnModel().getColumn(2).setCellRenderer(new TableActionCellRenderEliminar());
        tabla2.getColumnModel().getColumn(2).setCellEditor(new TableActionCellEditorEliminar(event));
        cargarRegiones();
    }

    public void cargarBoxRegiones() {
        regio = ctrlRegiones.getTodasRegiones();
        for (int i = 0; i < regio.size(); i++) {
            if (regio.get(i) != null) {
                String codeR = regio.get(i).getCodigo();
                String nombreRegion = regio.get(i).getNombre();
                boxRegion.addItem(new Regiones(codeR, nombreRegion));
            }

        }
    }

    public void cargarRegiones() {
        modelo.setRowCount(0);
        totalRegiones = (ArrayList<Regiones>) ctrlRegiones.getTodasRegiones().clone();
        for (Regiones Region : totalRegiones) {
            Object datos[] = new Object[2];
            datos[0] = Region.getCodigo();
            datos[1] = Region.getNombre();
            modelo.addRow(datos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Elementos.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRound2 = new Elementos.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        boxRegion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        boxPrecio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtNuevoPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonRound1 = new Elementos.ButtonRound();
        jLabel7 = new javax.swing.JLabel();
        lblPrecioActual = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new Elementos.CutomTable.TableDark();

        panelRound1.setBackground(new java.awt.Color(71, 74, 76));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        jLabel1.setText("Modificar");

        jLabel2.setText("Eliminar");

        jLabel3.setText("Región");

        jLabel4.setText("Precio");

        boxPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio Estandar", "Precio Especial" }));
        boxPrecio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxPrecioItemStateChanged(evt);
            }
        });

        jLabel5.setText("Nuevo Precio");

        jLabel6.setText("jLabel6");

        buttonRound1.setText("Actualizar");
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel7.setText("Precio Actual:");

        lblPrecioActual.setText("jLabel8");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addComponent(txtNuevoPrecio)
                                .addGap(40, 40, 40)))))
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(boxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(boxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(lblPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Codigo", "Region", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.setRowHeight(45);
        jScrollPane2.setViewportView(tabla2);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2)
                    .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        // TODO add your handling code here:
        Regiones regItem = (Regiones) boxRegion.getSelectedItem();
        int opciones = boxPrecio.getSelectedIndex() + 1;
        int nuevoPrecio = Integer.parseInt(txtNuevoPrecio.getText());
        if (ctrlRegiones.cambiarPrecios(regItem.getCodigo(), opciones, nuevoPrecio)) {
            JOptionPane.showMessageDialog(null, "Se cambiaron el precio correctamente");
            cargarBoxRegiones();
        }
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void boxPrecioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxPrecioItemStateChanged
        // TODO add your handling code here:
        Regiones regItem = (Regiones) boxRegion.getSelectedItem();
        int opciones = boxPrecio.getSelectedIndex() + 1;
        lblPrecioActual.setText(regItem.getPrecioEspecial()+"");
    }//GEN-LAST:event_boxPrecioItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPrecio;
    private javax.swing.JComboBox<Object> boxRegion;
    private Elementos.ButtonRound buttonRound1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPrecioActual;
    private Elementos.PanelRound panelRound1;
    private Elementos.PanelRound panelRound2;
    private Elementos.CutomTable.TableDark tabla2;
    private javax.swing.JTextField txtNuevoPrecio;
    // End of variables declaration//GEN-END:variables
}
