package ventanas;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author caches
 */
public class FrmMdi extends javax.swing.JFrame {

    public FrmMdi() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnGestionReportes = new javax.swing.JButton();
        btnGestionFuentes = new javax.swing.JButton();
        btnGestionReferenciales = new javax.swing.JButton();
        btnGestionLibros = new javax.swing.JButton();
        btnRegistrarAlquiler = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGestionClientes = new javax.swing.JButton();
        btnGestionEmpleados1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        desktopPane.setBackground(getBackground());
        desktopPane.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                desktopPaneComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                desktopPaneComponentRemoved(evt);
            }
        });

        btnGestionReportes.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnGestionReportes.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\reportes.png")); // NOI18N
        btnGestionReportes.setText("Gestion de Reportes");
        btnGestionReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionReportes.setIconTextGap(6);
        btnGestionReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionReportesActionPerformed(evt);
            }
        });
        desktopPane.add(btnGestionReportes);
        btnGestionReportes.setBounds(10, 500, 240, 50);

        btnGestionFuentes.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnGestionFuentes.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\fuentes.png")); // NOI18N
        btnGestionFuentes.setText("Gestion de Fuentes");
        btnGestionFuentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionFuentes.setIconTextGap(6);
        btnGestionFuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionFuentesActionPerformed(evt);
            }
        });
        desktopPane.add(btnGestionFuentes);
        btnGestionFuentes.setBounds(10, 400, 240, 50);

        btnGestionReferenciales.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnGestionReferenciales.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\referenciales.png")); // NOI18N
        btnGestionReferenciales.setText("Gestión de Referenciales");
        btnGestionReferenciales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionReferenciales.setIconTextGap(6);
        btnGestionReferenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionReferencialesActionPerformed(evt);
            }
        });
        desktopPane.add(btnGestionReferenciales);
        btnGestionReferenciales.setBounds(10, 450, 240, 50);

        btnGestionLibros.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnGestionLibros.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\libros.png")); // NOI18N
        btnGestionLibros.setText("Gestion de Libros");
        btnGestionLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionLibros.setIconTextGap(6);
        btnGestionLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionLibrosActionPerformed(evt);
            }
        });
        desktopPane.add(btnGestionLibros);
        btnGestionLibros.setBounds(10, 300, 240, 50);

        btnRegistrarAlquiler.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnRegistrarAlquiler.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\entregar.png")); // NOI18N
        btnRegistrarAlquiler.setText("Registrar alquiler");
        btnRegistrarAlquiler.setAutoscrolls(true);
        btnRegistrarAlquiler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarAlquiler.setIconTextGap(6);
        btnRegistrarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlquilerActionPerformed(evt);
            }
        });
        desktopPane.add(btnRegistrarAlquiler);
        btnRegistrarAlquiler.setBounds(10, 250, 240, 50);

        btnSalir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\cerrar.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setIconTextGap(6);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        desktopPane.add(btnSalir);
        btnSalir.setBounds(10, 640, 240, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\logo.png")); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(0, 0, 270, 230);

        btnGestionClientes.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnGestionClientes.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\clientes.png")); // NOI18N
        btnGestionClientes.setText("Gestion de Clientes");
        btnGestionClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionClientes.setIconTextGap(6);
        btnGestionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionClientesActionPerformed(evt);
            }
        });
        desktopPane.add(btnGestionClientes);
        btnGestionClientes.setBounds(10, 350, 240, 50);

        btnGestionEmpleados1.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnGestionEmpleados1.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\empleados.png")); // NOI18N
        btnGestionEmpleados1.setText("Gestion de Empleados");
        btnGestionEmpleados1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionEmpleados1.setIconTextGap(6);
        btnGestionEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionEmpleados1ActionPerformed(evt);
            }
        });
        desktopPane.add(btnGestionEmpleados1);
        btnGestionEmpleados1.setBounds(10, 550, 240, 50);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\acercade.png")); // NOI18N
        desktopPane.add(jButton1);
        jButton1.setBounds(10, 720, 50, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirInternalFrameMdi(JInternalFrame internalFrame) {
//        desactivarBotonesMdi();
        Dimension desktopSize = desktopPane.getSize();
        Dimension jInternalFrameSize = internalFrame.getSize();
        internalFrame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);

        desktopPane.add(internalFrame);
        internalFrame.setVisible(true);
    }

    private void btnGestionReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionReportesActionPerformed
        abrirInternalFrameMdi(new FrmGestionReportes());
    }//GEN-LAST:event_btnGestionReportesActionPerformed

    private void btnGestionReferencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionReferencialesActionPerformed
        abrirInternalFrameMdi(new FrmGestionReferenciales());
    }//GEN-LAST:event_btnGestionReferencialesActionPerformed

    private void btnGestionFuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionFuentesActionPerformed
        abrirInternalFrameMdi(new FrmGestionFuentes());
    }//GEN-LAST:event_btnGestionFuentesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlquilerActionPerformed
        abrirInternalFrameMdi(new FrmGestionAlquiler());
    }//GEN-LAST:event_btnRegistrarAlquilerActionPerformed

    private void btnGestionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionClientesActionPerformed
        abrirInternalFrameMdi(new FrmGestionClientes());
    }//GEN-LAST:event_btnGestionClientesActionPerformed

    private void btnGestionLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionLibrosActionPerformed
        abrirInternalFrameMdi(new FrmGestionLibros());
    }//GEN-LAST:event_btnGestionLibrosActionPerformed

    private void btnGestionEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEmpleados1ActionPerformed
        abrirInternalFrameMdi(new FrmGestionEmpleados());
    }//GEN-LAST:event_btnGestionEmpleados1ActionPerformed

    private void desktopPaneComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_desktopPaneComponentRemoved
        //desactiva botones
        activarBotonesMdi();
    }//GEN-LAST:event_desktopPaneComponentRemoved

    private void desktopPaneComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_desktopPaneComponentAdded

    }//GEN-LAST:event_desktopPaneComponentAdded

    public void desactivarBotonesMdi() {
        // Ocultar los botones
        btnGestionReportes.setVisible(false);
        btnGestionFuentes.setVisible(false);
        btnGestionReferenciales.setVisible(false);
        btnGestionLibros.setVisible(false);
        btnRegistrarAlquiler.setVisible(false);
        btnSalir.setVisible(false);
        btnGestionClientes.setVisible(false);
        btnGestionEmpleados1.setVisible(false);

    }

    public void activarBotonesMdi() {
        btnGestionReportes.setVisible(true);
        btnGestionFuentes.setVisible(true);
        btnGestionReferenciales.setVisible(true);
        btnGestionLibros.setVisible(true);
        btnRegistrarAlquiler.setVisible(true);
        btnSalir.setVisible(true);
        btnGestionClientes.setVisible(true);
        btnGestionEmpleados1.setVisible(true);
    }

    public static JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcDarkIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMdi().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionClientes;
    private javax.swing.JButton btnGestionEmpleados1;
    private javax.swing.JButton btnGestionFuentes;
    private javax.swing.JButton btnGestionLibros;
    private javax.swing.JButton btnGestionReferenciales;
    private javax.swing.JButton btnGestionReportes;
    private javax.swing.JButton btnRegistrarAlquiler;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
