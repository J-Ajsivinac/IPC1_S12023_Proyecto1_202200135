package Componentes;

import Usuario.Envios;
import Usuario.ctrlEnvios;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mesoi
 */
public class AdminReporteUsuario extends javax.swing.JPanel {

    private DefaultTableModel modelo;

    /**
     * Creates new form AdminReporteUsuario
     */
    public AdminReporteUsuario() {
        initComponents();
        this.setBounds(0, 0, 710, 500);
        modelo = (DefaultTableModel) tableRU.getModel();
        tableRU.fixTable(jScrollPane1);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(30);
    }

    public void ordenarUsuarios() {
        modelo.setRowCount(0);
        ArrayList<Envios> listaO = (ArrayList<Envios>) ctrlEnvios.getAllEnvios().clone();
        //int num = 1;
        ArrayList<String> usarioId = new ArrayList<>();

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> repeticiones = new ArrayList<>();
        for (Envios en : listaO) {
            if (!usarioId.contains(en.getIdUsuario())) {
                usarioId.add(en.getIdUsuario());
                nombres.add(en.getNombreUsuario());
            }
        }
        for (String usuarioIds : usarioId) {
            int contador = 0;
            for (Envios reg : listaO) {
                if (reg.getIdUsuario().equals(usuarioIds)) {
                    contador+=reg.getFactura().getNumeropaquetes();
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
                    String temp1 = nombres.get(j);
                    nombres.set(j, nombres.get(j + 1));
                    nombres.set(j + 1, temp1);
                }
            }
        }

        for (int i = 0; i < repeticiones.size(); i++) {
            Object datos[] = new Object[3];
            datos[0] = i + 1;
            datos[1] = nombres.get(i);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRU = new Elementos.CutomTable.TableDark();

        setOpaque(false);

        panelRound1.setBackground(new java.awt.Color(28, 28, 36));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reporte de usuarios con más paquetes Enviados");

        tableRU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Nombre Completo", "No. De paquetes"
            }
        ));
        tableRU.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tableRU.setRowHeight(40);
        jScrollPane1.setViewportView(tableRU);
        if (tableRU.getColumnModel().getColumnCount() > 0) {
            tableRU.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Elementos.PanelRound panelRound1;
    private Elementos.CutomTable.TableDark tableRU;
    // End of variables declaration//GEN-END:variables
}
