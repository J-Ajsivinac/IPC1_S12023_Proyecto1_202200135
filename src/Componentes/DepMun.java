package Componentes;

import Administrador.Departamentos;
import Administrador.Municipios;
import Administrador.Regiones;
import Administrador.ctrlDepartamentos;
import Administrador.ctrlRegiones;
import Componentes.CRUD.AdminAgregarDepMun;
import Componentes.CRUD.AdminModificarDepMun;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author mesoi
 */
public class DepMun extends javax.swing.JPanel {

    private AdminAgregarDepMun aADep;
    private AdminModificarDepMun aMDep;
    private Border unselect, selected;

    /**
     * Creates new form DepMun
     */
    public DepMun() {
        initComponents();
        this.setBounds(0, 0, 710, 500);
        unselect = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 157, 175));
        selected = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED);
        panelBackground.setBorder(unselect);
        aADep = new AdminAgregarDepMun();
        aMDep = new AdminModificarDepMun();
        panelCrud.add(aADep);
        panelCrud.add(aMDep);
        menuClick(aADep, panelAgregar);
    }

    public void menuClick(JPanel panel, JPanel btn) {
        aADep.setVisible(false);
        aMDep.setVisible(false);
        panelAgregar.setBorder(unselect);
        panelModificar.setBorder(unselect);
        btn.setBorder(selected);
        panel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        panelRound3 = new Elementos.PanelRound();
        panelBackground = new javax.swing.JPanel();
        panelAgregar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelModificar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelCrud = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N

        panelRound3.setBackground(new java.awt.Color(69, 74, 78));

        panelBackground.setOpaque(false);
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAgregarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLabel4.setText("Agregar");
        panelAgregar.add(jLabel4);

        panelBackground.add(panelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 121, -1));

        panelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelModificarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLabel5.setText("Modificar");
        panelModificar.add(jLabel5);

        panelBackground.add(panelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 121, -1));

        panelCrud.setBackground(new java.awt.Color(255, 51, 153));
        panelCrud.setOpaque(false);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCrud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(476, 476, 476)
                .addComponent(jLabel1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgregarMouseClicked
        // TODO add your handling code here:
        menuClick(aADep, panelAgregar);
        aADep.cargarRegiones();
    }//GEN-LAST:event_panelAgregarMouseClicked

    private void panelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificarMouseClicked
        // TODO add your handling code here:
        menuClick(aMDep,panelModificar);
        //aMR.cargarRegiones();
        //aMR.cargarBoxRegiones();
        //aMR.mostrarDatos();
    }//GEN-LAST:event_panelModificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelCrud;
    private javax.swing.JPanel panelModificar;
    private Elementos.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables
}
