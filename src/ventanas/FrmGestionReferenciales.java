package ventanas;

import clases.Controlador;
import clases.Utils;

/**
 *
 * @author Walter
 */
public class FrmGestionReferenciales extends javax.swing.JInternalFrame {

    public FrmGestionReferenciales() {
        initComponents();
        setSize(330, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabReferenciales = new javax.swing.JTabbedPane();
        pnlPais = new javax.swing.JPanel();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        pnlCiudad = new javax.swing.JPanel();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnSalir1 = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        pnlBarrio = new javax.swing.JPanel();
        lblBarrio = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btnSalir2 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(550, 350));
        getContentPane().setLayout(null);

        tabReferenciales.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        tabReferenciales.setMinimumSize(new java.awt.Dimension(550, 350));

        pnlPais.setLayout(null);

        lblPais.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblPais.setText("Ingrese Pais");
        pnlPais.add(lblPais);
        lblPais.setBounds(40, 20, 220, 30);

        txtPais.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        pnlPais.add(txtPais);
        txtPais.setBounds(30, 50, 260, 25);

        jPanel6.setLayout(null);

        btnSalir.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setIconTextGap(2);
        btnSalir.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSalir.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel6.add(btnSalir);
        btnSalir.setBounds(190, 0, 100, 60);

        btnAgregar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setIconTextGap(2);
        btnAgregar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel6.add(btnAgregar);
        btnAgregar.setBounds(30, 0, 100, 60);

        pnlPais.add(jPanel6);
        jPanel6.setBounds(0, 130, 310, 60);

        tabReferenciales.addTab("Pais", pnlPais);

        pnlCiudad.setLayout(null);

        lblCiudad.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblCiudad.setText("Ingrese Ciudad");
        pnlCiudad.add(lblCiudad);
        lblCiudad.setBounds(40, 20, 230, 30);

        txtCiudad.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        pnlCiudad.add(txtCiudad);
        txtCiudad.setBounds(30, 50, 260, 25);

        jPanel8.setLayout(null);

        btnSalir1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnSalir1.setText("SALIR");
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSalir1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        jPanel8.add(btnSalir1);
        btnSalir1.setBounds(160, 0, 100, 60);

        btnAgregar1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnAgregar1.setText("AGREGAR");
        btnAgregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        jPanel8.add(btnAgregar1);
        btnAgregar1.setBounds(0, 0, 100, 60);

        pnlCiudad.add(jPanel8);
        jPanel8.setBounds(30, 130, 270, 60);

        tabReferenciales.addTab("Ciudad", pnlCiudad);

        pnlBarrio.setLayout(null);

        lblBarrio.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblBarrio.setText("Ingrese Barrio");
        pnlBarrio.add(lblBarrio);
        lblBarrio.setBounds(40, 20, 200, 30);

        txtBarrio.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        pnlBarrio.add(txtBarrio);
        txtBarrio.setBounds(30, 50, 260, 25);

        jPanel9.setLayout(null);

        btnSalir2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnSalir2.setText("SALIR");
        btnSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSalir2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        jPanel9.add(btnSalir2);
        btnSalir2.setBounds(160, 0, 100, 60);

        btnAgregar2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnAgregar2.setText("GUARDAR");
        btnAgregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });
        jPanel9.add(btnAgregar2);
        btnAgregar2.setBounds(0, 0, 100, 60);

        pnlBarrio.add(jPanel9);
        jPanel9.setBounds(30, 130, 270, 60);

        tabReferenciales.addTab("Barrio", pnlBarrio);

        getContentPane().add(tabReferenciales);
        tabReferenciales.setBounds(0, 0, 320, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (Utils.condicionalGuardar(pnlPais)) {
            clases.Controlador.executeQuery("INSERT INTO pais (pai_desc) VALUES ( '" + txtPais.getText() + "')");
            txtPais.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        if (Utils.condicionalGuardar(pnlCiudad)) {
            clases.Controlador.executeQuery("INSERT INTO ciudad (ciu_desc) VALUES ( '" + txtCiudad.getText() + "')");
            txtCiudad.setText("");
        }
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        if (Utils.condicionalGuardar(pnlBarrio)) {
            clases.Controlador.executeQuery("INSERT INTO barrio (bar_desc) VALUES ( '" + txtBarrio.getText() + "')");
            txtBarrio.setText("");
        }
    }//GEN-LAST:event_btnAgregar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblBarrio;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblPais;
    private javax.swing.JPanel pnlBarrio;
    private javax.swing.JPanel pnlCiudad;
    private javax.swing.JPanel pnlPais;
    public static javax.swing.JTabbedPane tabReferenciales;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
