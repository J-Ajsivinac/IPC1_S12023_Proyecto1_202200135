package Componentes;

import Administrador.Departamentos;
import Administrador.Regiones;
import Administrador.ctrlDepartamentos;
import Administrador.ctrlRegiones;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mesoi
 */
public class DepMun extends javax.swing.JPanel {

    public ArrayList<Regiones> regio;
    public ArrayList<Departamentos> depa;

    /**
     * Creates new form DepMun
     */
    public DepMun() {
        initComponents();
        this.setBounds(0, 0, 710, 500);
        regio = ctrlRegiones.getTodasRegiones();
        depa = ctrlDepartamentos.getAllD();
        cargarRegiones();
        cargarDepartamentos();
    }

    public void cargarRegiones() {
        for (int i = 0; i < regio.size(); i++) {
            if (regio.get(i) != null) {
                String codeR = regio.get(i).getCodigo();
                String nombreRegion = regio.get(i).getNombre();
                boxRegion.addItem(new Regiones(codeR, nombreRegion));
            }

        }
    }

    public void cargarDepartamentos() {
        for (int i = 0; i < depa.size(); i++) {
            if (depa.get(i) != null) {
                String codeR = depa.get(i).getCodigo();
                String nombreRegion = depa.get(i).getNombre();
                boxDepartamento.addItem(new Departamentos(codeR, nombreRegion, depa.get(i).getPrecioEstandar(), depa.get(i).getPrecioEspecial(), depa.get(i).getCodDepartamento(), depa.get(i).getNombreDepartamento()));
            }
        }
    }
    
    public void limpiarDepartamentos(){
        boxDepartamento.removeAllItems();
    }

    public void ingresarDepartamentos(String codigo, String nombreDepartament) {
        if (!(codigo.equals("") && nombreDepartament.equals(""))) {
            if (ctrlDepartamentos.nuevoDepartamento(codigo, nombreDepartament)) {
                JOptionPane.showMessageDialog(null, "Departamento ingresado Correctamente");
                limpiarDepartamentos();
                cargarDepartamentos();
            }
        }
    }

    public void ingresarMunicipio(String codigo, String nombreMuni) {
        if (!(codigo.equals("") && nombreMuni.equals(""))) {
            if (ctrlDepartamentos.agregarMunicipios(codigo, nombreMuni)) {
                JOptionPane.showMessageDialog(null, "Municipio ingresado Correctamente");
            }

        }
    }
        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        boxRegion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreDepartamento = new javax.swing.JTextField();
        btnRegistrarDepartamento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        boxDepartamento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreMunicipio = new javax.swing.JTextField();
        btnRegistrarMunicipio = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        jLabel1.setText("Departamentos y Municipios");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLabel2.setText("Ingresar Departamentos");

        boxRegion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxRegionItemStateChanged(evt);
            }
        });

        jLabel3.setText("Región");

        jLabel4.setText("Nombre del Departamento");

        btnRegistrarDepartamento.setText("Registrar Departamento");
        btnRegistrarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDepartamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(boxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(btnRegistrarDepartamento)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarDepartamento)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLabel5.setText("Ingresar Municipio");

        jLabel6.setText("Departamento");

        jLabel7.setText("Nombre del Municipio");

        btnRegistrarMunicipio.setText("Registrar Municipio");
        btnRegistrarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMunicipioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(boxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(btnRegistrarMunicipio)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarMunicipio)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boxRegionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxRegionItemStateChanged
        // TODO add your handling code here:
        Regiones regItem = (Regiones) boxRegion.getSelectedItem();
        //System.out.println("CODIGO: " + regItem.getCodigo());
    }//GEN-LAST:event_boxRegionItemStateChanged

    private void btnRegistrarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDepartamentoActionPerformed
        // TODO add your handling code here:
        Regiones regItem = (Regiones) boxRegion.getSelectedItem();
        String nombreDep = txtNombreDepartamento.getText();
        ingresarDepartamentos(regItem.getCodigo(), nombreDep);
    }//GEN-LAST:event_btnRegistrarDepartamentoActionPerformed

    private void btnRegistrarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMunicipioActionPerformed
        // TODO add your handling code here:
        Departamentos departa = (Departamentos) boxDepartamento.getSelectedItem();
        String nombreDep = txtNombreMunicipio.getText();
        ingresarMunicipio(departa.getCodDepartamento(), nombreDep);
    }//GEN-LAST:event_btnRegistrarMunicipioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> boxDepartamento;
    private javax.swing.JComboBox<Object> boxRegion;
    private javax.swing.JButton btnRegistrarDepartamento;
    private javax.swing.JButton btnRegistrarMunicipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField txtNombreDepartamento;
    private javax.swing.JTextField txtNombreMunicipio;
    // End of variables declaration//GEN-END:variables
}
