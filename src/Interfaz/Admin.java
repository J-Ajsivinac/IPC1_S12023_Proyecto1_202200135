package Interfaz;

import Componentes.*;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.util.function.Function;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author mesoi
 */
public class Admin extends javax.swing.JFrame {

    private AdminRegiones ad;
    private DepMun dm;
    private AdminiKioscos adK;
    private AdminReporteRegion adRRegion;
    private AdminReporteUsuario adRUsuario;
    private AdminReporteTotales adRTotales;
    public boolean activado;
    Border unselectedborder;
    Border selectedborder;
    private FlatSVGIcon svgIcono1;
    private FlatSVGIcon.ColorFilter fl;

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ad = new AdminRegiones();
        dm = new DepMun();
        adK = new AdminiKioscos();
        adRRegion = new AdminReporteRegion();
        adRUsuario = new AdminReporteUsuario();
        adRTotales = new AdminReporteTotales();
        panelMainContainer.add(ad);
        panelMainContainer.add(dm);
        panelMainContainer.add(adK);
        panelMainContainer.add(adRRegion);
        panelMainContainer.add(adRUsuario);
        panelMainContainer.add(adRTotales);
        menuClick(ad);

        unselectedborder = BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(150, 157, 175));
        selectedborder = BorderFactory.createMatteBorder(0, 4, 0, 0, new Color(197, 197, 252));
        panelRIngresos.setVisible(activado);
        panelRRegion.setVisible(activado);

        panelRUsuario.setVisible(activado);

        svgIcono1 = new FlatSVGIcon("img/imagenRegion.svg", 20, 20);
        FlatSVGIcon svgIcono2 = new FlatSVGIcon("img/imagenDep.svg", 20, 20);
        FlatSVGIcon svgIcono3 = new FlatSVGIcon("img/imagenKiosco1.svg", 20, 20);

        FlatSVGIcon svgIcono4 = new FlatSVGIcon("img/imagenR.svg", 20, 20);
        FlatSVGIcon svgIcono5 = new FlatSVGIcon("img/imagenR1.svg", 20, 20);
        FlatSVGIcon svgIcono6 = new FlatSVGIcon("img/imageR2.svg", 20, 20);

        FlatSVGIcon svgIcono7 = new FlatSVGIcon("img/imagenCerrar.svg", 20, 20);
        
        FlatSVGIcon adminLogo = new FlatSVGIcon("img/imagenAdmin.svg", 90, 90);
        fl = new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
            @Override
            public Color apply(Color t) {
                return new Color(195, 197, 199);
            }

        });
        //88,88,112
        FlatSVGIcon.ColorFilter logo1 = new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
            @Override
            public Color apply(Color t) {
                return new Color(88,88,112);
            }

        });
        svgIcono7.setColorFilter(fl);
        adminLogo.setColorFilter(logo1);
        jLabel1.setIcon(adminLogo);
        imgR6.setIcon(svgIcono7);
        bordeMenu(panelRegiones, txtRegion, imgR, 1);
        menuReportes();

    }

    public void menuReportes() {
        if (activado == true) {
            activado = false;
            panelRIngresos.setVisible(activado);
            panelRRegion.setVisible(activado);
            panelRUsuario.setVisible(activado);
            FlatSVGIcon svgFlecha = new FlatSVGIcon("img/imagenFlecha.svg", 20, 20);
            svgFlecha.setColorFilter(fl);
            flechaR.setIcon(svgFlecha);
        } else {
            activado = true;
            panelRIngresos.setVisible(activado);
            panelRRegion.setVisible(activado);
            panelRUsuario.setVisible(activado);
            
            FlatSVGIcon svgFlecha = new FlatSVGIcon("img/imagenFlecha2.svg", 20, 20);
            svgFlecha.setColorFilter(fl);
            flechaR.setIcon(svgFlecha);
        }
    }

    public void hoverMenu(JPanel activar, int estado) {
        if (estado == 1) {
            activar.setBackground(new Color(19, 19, 26));
        } else {
            activar.setBackground(new Color(28, 28, 36));
        }
    }

    public void bordeMenu(JPanel panel, JLabel texto, JLabel imagen1, int op) {
        Color desacti = new Color(28, 28, 36);
        Color txt1 = new Color(195, 197, 199);
        panelRegiones.setBorder(unselectedborder);
        panelDepartamentos.setBorder(unselectedborder);
        panelKiosco.setBorder(unselectedborder);
        panelRRegion.setBorder(unselectedborder);
        panelRUsuario.setBorder(unselectedborder);
        panelRIngresos.setBorder(unselectedborder);

        txtRegion.setForeground(txt1);
        txtDepartamentos.setForeground(txt1);
        txtKiosco.setForeground(txt1);
        txtDepartamentos.setForeground(txt1);
        txtPorRegion.setForeground(txt1);
        txtPorUsuario.setForeground(txt1);
        txtTotal.setForeground(txt1);
        panel.setBorder(selectedborder);

        svgIcono1 = new FlatSVGIcon("img/imagenRegion.svg", 20, 20);
        FlatSVGIcon svgIcono2 = new FlatSVGIcon("img/imagenDep.svg", 20, 20);
        FlatSVGIcon svgIcono3 = new FlatSVGIcon("img/imagenKiosco1.svg", 20, 20);
        FlatSVGIcon svgIcono4 = new FlatSVGIcon("img/imagenR.svg", 20, 20);
        FlatSVGIcon svgIcono5 = new FlatSVGIcon("img/imagenR1.svg", 20, 20);
        FlatSVGIcon svgIcono6 = new FlatSVGIcon("img/imageR2.svg", 20, 20);

        svgIcono1.setColorFilter(fl);
        svgIcono2.setColorFilter(fl);
        svgIcono3.setColorFilter(fl);
        svgIcono4.setColorFilter(fl);
        svgIcono5.setColorFilter(fl);
        svgIcono6.setColorFilter(fl);

        imgR.setIcon(svgIcono1);
        imgR1.setIcon(svgIcono2);
        imgR2.setIcon(svgIcono3);
        imgR3.setIcon(svgIcono4);
        imgR4.setIcon(svgIcono5);
        imgR5.setIcon(svgIcono6);

        FlatSVGIcon.ColorFilter activado = new FlatSVGIcon.ColorFilter(new Function<Color, Color>() {
            @Override
            public Color apply(Color t) {
                return new Color(121, 121, 252);
            }

        });
        //svgIcono1.setColorFilter(fl);
        //imgR.setIcon(svgIcono1);

        switch (op) {
            case 1:
                svgIcono1.setColorFilter(activado);
                imagen1.setIcon(svgIcono1);
                break;
            case 2:
                svgIcono2.setColorFilter(activado);
                imagen1.setIcon(svgIcono2);
                break;
            case 3:
                svgIcono3.setColorFilter(activado);
                imagen1.setIcon(svgIcono3);
                break;
            case 4:
                svgIcono4.setColorFilter(activado);
                imagen1.setIcon(svgIcono4);
                break;
            case 5:
                svgIcono5.setColorFilter(activado);
                imagen1.setIcon(svgIcono5);
                break;
            case 6:
                svgIcono6.setColorFilter(activado);
                imagen1.setIcon(svgIcono6);
                break;

            default:
        }
        texto.setForeground(new Color(121, 121, 252));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelRegiones = new javax.swing.JPanel();
        txtRegion = new javax.swing.JLabel();
        imgR = new javax.swing.JLabel();
        panelDepartamentos = new javax.swing.JPanel();
        txtDepartamentos = new javax.swing.JLabel();
        imgR1 = new javax.swing.JLabel();
        panelKiosco = new javax.swing.JPanel();
        txtKiosco = new javax.swing.JLabel();
        imgR2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        flechaR = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelRRegion = new javax.swing.JPanel();
        txtPorRegion = new javax.swing.JLabel();
        imgR3 = new javax.swing.JLabel();
        panelRUsuario = new javax.swing.JPanel();
        txtPorUsuario = new javax.swing.JLabel();
        imgR4 = new javax.swing.JLabel();
        panelRIngresos = new javax.swing.JPanel();
        txtTotal = new javax.swing.JLabel();
        imgR5 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        imgR6 = new javax.swing.JLabel();
        panelMainContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 19, 26));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(28, 28, 36));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Joab Ajsivinac");
        jPanel4.add(jLabel2);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrador");
        jPanel5.add(jLabel3);

        panelRegiones.setBackground(new java.awt.Color(28, 28, 36));
        panelRegiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRegionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRegionesMouseExited(evt);
            }
        });
        panelRegiones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRegion.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtRegion.setForeground(new java.awt.Color(255, 255, 255));
        txtRegion.setText("Regiones");
        panelRegiones.add(txtRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        imgR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRegiones.add(imgR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 35));

        panelDepartamentos.setBackground(new java.awt.Color(28, 28, 36));
        panelDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDepartamentosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelDepartamentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelDepartamentosMouseExited(evt);
            }
        });
        panelDepartamentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDepartamentos.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtDepartamentos.setForeground(new java.awt.Color(255, 255, 255));
        txtDepartamentos.setText("Departamentos y Municipios");
        panelDepartamentos.add(txtDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        imgR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelDepartamentos.add(imgR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 35));

        panelKiosco.setBackground(new java.awt.Color(28, 28, 36));
        panelKiosco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelKioscoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelKioscoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelKioscoMouseExited(evt);
            }
        });
        panelKiosco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtKiosco.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtKiosco.setForeground(new java.awt.Color(255, 255, 255));
        txtKiosco.setText("Kioscos");
        panelKiosco.add(txtKiosco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        imgR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelKiosco.add(imgR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 35));

        jPanel9.setBackground(new java.awt.Color(28, 28, 36));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reportes");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        flechaR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(flechaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 35));

        jPanel3.setBackground(new java.awt.Color(28, 28, 36));

        panelRRegion.setBackground(new java.awt.Color(28, 28, 36));
        panelRRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRRegionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRRegionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRRegionMouseExited(evt);
            }
        });

        txtPorRegion.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtPorRegion.setForeground(new java.awt.Color(255, 255, 255));
        txtPorRegion.setText("Por Región");

        imgR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelRRegionLayout = new javax.swing.GroupLayout(panelRRegion);
        panelRRegion.setLayout(panelRRegionLayout);
        panelRRegionLayout.setHorizontalGroup(
            panelRRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRRegionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(imgR3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPorRegion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRRegionLayout.setVerticalGroup(
            panelRRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRRegionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgR3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRRegionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPorRegion)
                .addContainerGap())
        );

        panelRUsuario.setBackground(new java.awt.Color(28, 28, 36));
        panelRUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRUsuarioMouseExited(evt);
            }
        });

        txtPorUsuario.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtPorUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtPorUsuario.setText("Por Usuario");

        imgR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelRUsuarioLayout = new javax.swing.GroupLayout(panelRUsuario);
        panelRUsuario.setLayout(panelRUsuarioLayout);
        panelRUsuarioLayout.setHorizontalGroup(
            panelRUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRUsuarioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(imgR4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPorUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRUsuarioLayout.setVerticalGroup(
            panelRUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPorUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRUsuarioLayout.createSequentialGroup()
                .addComponent(imgR4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelRIngresos.setBackground(new java.awt.Color(28, 28, 36));
        panelRIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRIngresosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRIngresosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRIngresosMouseExited(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setText("Totales");

        imgR5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelRIngresosLayout = new javax.swing.GroupLayout(panelRIngresos);
        panelRIngresos.setLayout(panelRIngresosLayout);
        panelRIngresosLayout.setHorizontalGroup(
            panelRIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRIngresosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(imgR5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRIngresosLayout.setVerticalGroup(
            panelRIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRIngresosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRIngresosLayout.createSequentialGroup()
                .addComponent(imgR5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelRIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelRRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCerrarSesion.setBackground(new java.awt.Color(28, 28, 36));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });
        btnCerrarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cerrar Sesión");
        btnCerrarSesion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        imgR6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.add(imgR6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 35));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDepartamentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addComponent(panelRegiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelKiosco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelKiosco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 540));

        panelMainContainer.setBackground(new java.awt.Color(204, 204, 204));
        panelMainContainer.setOpaque(false);
        jPanel1.add(panelMainContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 720, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDepartamentosMouseClicked
        // TODO add your handling code here:
        menuClick(dm);
        dm.cargar1();
        bordeMenu(panelDepartamentos, txtDepartamentos, imgR1, 2);
    }//GEN-LAST:event_panelDepartamentosMouseClicked

    private void panelRegionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegionesMouseClicked
        // TODO add your handling code here:
        ad.inicioModificar();
        ad.inicioAgregar();
        menuClick(ad);
        bordeMenu(panelRegiones, txtRegion, imgR, 1);
    }//GEN-LAST:event_panelRegionesMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        // TODO add your handling code here:
        login l = new login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void panelKioscoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKioscoMouseClicked
        // TODO add your handling code here:
        menuClick(adK);
        adK.cargarK1();
        bordeMenu(panelKiosco, txtKiosco, imgR2, 3);
    }//GEN-LAST:event_panelKioscoMouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        menuReportes();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void panelRRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRRegionMouseClicked
        // TODO add your handling code here:
        menuClick(adRRegion);
        bordeMenu(panelRRegion, txtPorRegion, imgR3, 4);
        adRRegion.ordenarRegiones();
    }//GEN-LAST:event_panelRRegionMouseClicked

    private void panelRUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRUsuarioMouseClicked
        // TODO add your handling code here:
        menuClick(adRUsuario);
        bordeMenu(panelRUsuario, txtPorUsuario, imgR4, 5);
        adRUsuario.ordenarUsuarios();
    }//GEN-LAST:event_panelRUsuarioMouseClicked

    private void panelRIngresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRIngresosMouseClicked
        // TODO add your handling code here:
        menuClick(adRTotales);
        bordeMenu(panelRIngresos, txtTotal, imgR5, 6);
        adRTotales.totalPaquetes();
        adRTotales.ingresosTotales();
    }//GEN-LAST:event_panelRIngresosMouseClicked

    private void panelRegionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegionesMouseEntered
        // TODO add your handling code here:
        hoverMenu(panelRegiones, 1);
    }//GEN-LAST:event_panelRegionesMouseEntered

    private void panelRegionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegionesMouseExited
        // TODO add your handling code here:
        hoverMenu(panelRegiones, 0);
    }//GEN-LAST:event_panelRegionesMouseExited

    private void panelDepartamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDepartamentosMouseEntered
        // TODO add your handling code here:
        hoverMenu(panelDepartamentos, 1);
    }//GEN-LAST:event_panelDepartamentosMouseEntered

    private void panelKioscoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKioscoMouseEntered
        // TODO add your handling code here:
        hoverMenu(panelKiosco, 1);
    }//GEN-LAST:event_panelKioscoMouseEntered

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        // TODO add your handling code here:
        hoverMenu(jPanel9, 1);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void panelRRegionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRRegionMouseEntered
        // TODO add your handling code here:
        hoverMenu(panelRRegion, 1);
    }//GEN-LAST:event_panelRRegionMouseEntered

    private void panelRUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRUsuarioMouseEntered
        // TODO add your handling code here:
        hoverMenu(panelRUsuario, 1);
    }//GEN-LAST:event_panelRUsuarioMouseEntered

    private void panelRIngresosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRIngresosMouseEntered
        // TODO add your handling code here:
        hoverMenu(panelRIngresos, 1);
    }//GEN-LAST:event_panelRIngresosMouseEntered

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        // TODO add your handling code here:
        hoverMenu(btnCerrarSesion, 1);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void panelDepartamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDepartamentosMouseExited
        // TODO add your handling code here:
        hoverMenu(panelDepartamentos, 0);
    }//GEN-LAST:event_panelDepartamentosMouseExited

    private void panelKioscoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKioscoMouseExited
        // TODO add your handling code here:
        hoverMenu(panelKiosco, 0);
    }//GEN-LAST:event_panelKioscoMouseExited

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        // TODO add your handling code here:
        hoverMenu(jPanel9, 0);
    }//GEN-LAST:event_jPanel9MouseExited

    private void panelRRegionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRRegionMouseExited
        // TODO add your handling code here:
        hoverMenu(panelRRegion, 0);
    }//GEN-LAST:event_panelRRegionMouseExited

    private void panelRUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRUsuarioMouseExited
        // TODO add your handling code here:
        hoverMenu(panelRUsuario, 0);
    }//GEN-LAST:event_panelRUsuarioMouseExited

    private void panelRIngresosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRIngresosMouseExited
        // TODO add your handling code here:
        hoverMenu(panelRIngresos, 0);
    }//GEN-LAST:event_panelRIngresosMouseExited

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        // TODO add your handling code here:
        hoverMenu(btnCerrarSesion, 0);
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);

            }
        });
    }

    public void menuClick(JPanel panel) {
        ad.setVisible(false);
        dm.setVisible(false);
        adK.setVisible(false);
        adRRegion.setVisible(false);
        adRUsuario.setVisible(false);
        adRTotales.setVisible(false);
        panel.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JLabel flechaR;
    private javax.swing.JLabel imgR;
    private javax.swing.JLabel imgR1;
    private javax.swing.JLabel imgR2;
    private javax.swing.JLabel imgR3;
    private javax.swing.JLabel imgR4;
    private javax.swing.JLabel imgR5;
    private javax.swing.JLabel imgR6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panelDepartamentos;
    private javax.swing.JPanel panelKiosco;
    private javax.swing.JPanel panelMainContainer;
    private javax.swing.JPanel panelRIngresos;
    private javax.swing.JPanel panelRRegion;
    private javax.swing.JPanel panelRUsuario;
    private javax.swing.JPanel panelRegiones;
    private javax.swing.JLabel txtDepartamentos;
    private javax.swing.JLabel txtKiosco;
    private javax.swing.JLabel txtPorRegion;
    private javax.swing.JLabel txtPorUsuario;
    private javax.swing.JLabel txtRegion;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
