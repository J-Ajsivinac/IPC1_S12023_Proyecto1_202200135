package Componentes;

import Usuario.Envios;
import Usuario.ctrlEnvios;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mesoi
 */
public class AdminReporteRegion extends javax.swing.JPanel {

    private DefaultTableModel modelo;

    /**
     * Creates new form AdminReporteRegion
     */
    public AdminReporteRegion() {
        initComponents();
        this.setBounds(0, 0, 710, 500);
        modelo = (DefaultTableModel) tableA.getModel();
        tableA.fixTable(jScrollPane2);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(30);
        //ordenarRegiones();
    }

    public void ordenarRegiones() {
        modelo.setRowCount(0);
        ArrayList<Envios> listaO = (ArrayList<Envios>) ctrlEnvios.getAllEnvios().clone();

        ArrayList<String> RegionUnicos = new ArrayList<>();
        ArrayList<Integer> repeticiones = new ArrayList<>();
        for (Envios en : listaO) {
            if (!RegionUnicos.contains(en.getCodRegion())) {
                RegionUnicos.add(en.getCodRegion());
            }
        }
        for (String regionN : RegionUnicos) {
            int contador = 0;
            for (Envios reg : listaO) {
                if (reg.getCodRegion().equals(regionN)) {
                    contador++;
                }
            }
            repeticiones.add(contador);
        }

        // Ordenando el arreglo con el método burbuja
        for (int i = 0; i < repeticiones.size() - 1; i++) {
            for (int j = 0; j < repeticiones.size() - i - 1; j++) {
                if (repeticiones.get(j) < repeticiones.get(j + 1)) {
                    int temp = repeticiones.get(j);
                    repeticiones.set(j, repeticiones.get(j + 1));
                    repeticiones.set(j + 1, temp);
                    // arreglando los nombres de los productos
                    String temp1 = RegionUnicos.get(j);
                    RegionUnicos.set(j, RegionUnicos.get(j + 1));
                    RegionUnicos.set(j + 1, temp1);
                }
            }
        }

        for (int i = 0; i < repeticiones.size() ; i++) {
            Object datos[] = new Object[3];
            datos[0] = i+1;
            datos[1] = RegionUnicos.get(i);
            datos[2] = repeticiones.get(i);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tableA = new Elementos.CutomTable.TableDark();

        setOpaque(false);

        panelRound1.setBackground(new java.awt.Color(28, 28, 36));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Regiones con más Envios");

        tableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Region", "Numero de Envios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableA.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tableA.setRowHeight(40);
        jScrollPane2.setViewportView(tableA);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private Elementos.PanelRound panelRound1;
    private Elementos.CutomTable.TableDark tableA;
    // End of variables declaration//GEN-END:variables
}
