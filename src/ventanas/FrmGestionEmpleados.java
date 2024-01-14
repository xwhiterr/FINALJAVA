package ventanas;

import clases.Utils;

/**
 *
 * @author Walter
 */
public class FrmGestionEmpleados extends javax.swing.JInternalFrame {

    public FrmGestionEmpleados() {
        initComponents();
        setSize(600, 380);
         clases.Utils.activarPanel(false, pnlCampos);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAgregarCiudad = new javax.swing.JButton();
        btnAgregarBarrio = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCi1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtContacto1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        btnBuscar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnBuscar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(210, 0, 100, 60);

        btnGuardar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnGuardar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);
        btnGuardar.setBounds(110, 0, 100, 60);

        btnNuevo.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setMaximumSize(new java.awt.Dimension(100, 100));
        btnNuevo.setMinimumSize(new java.awt.Dimension(100, 100));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo);
        btnNuevo.setBounds(10, 0, 100, 60);

        btnEliminar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEliminar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(310, 0, 100, 60);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(435, 19, 0, 0);

        btnSalir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSalir.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir);
        btnSalir.setBounds(460, 0, 100, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 280, 570, 60);

        btnAgregarCiudad.setText("jButton1");
        btnAgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCiudad);
        btnAgregarCiudad.setBounds(340, 150, 20, 27);

        btnAgregarBarrio.setText("jButton2");
        btnAgregarBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBarrioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarBarrio);
        btnAgregarBarrio.setBounds(530, 150, 20, 27);

        pnlCampos.setLayout(null);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("Gestion de Empleados");
        pnlCampos.add(jLabel9);
        jLabel9.setBounds(40, 20, 169, 21);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Apellido(s)");
        pnlCampos.add(jLabel5);
        jLabel5.setBounds(260, 60, 120, 17);

        txtNombre.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtNombre);
        txtNombre.setBounds(30, 80, 220, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setText("Nombre(s)");
        pnlCampos.add(jLabel2);
        jLabel2.setBounds(40, 60, 120, 17);

        txtCi.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtCi);
        txtCi.setBounds(440, 80, 110, 27);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Nro de C.I.");
        pnlCampos.add(jLabel3);
        jLabel3.setBounds(450, 60, 70, 17);

        txtApellido.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtApellido);
        txtApellido.setBounds(250, 80, 190, 27);

        jLabel6.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel6.setText("Nro de Contacto");
        pnlCampos.add(jLabel6);
        jLabel6.setBounds(40, 130, 100, 17);

        txtContacto.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoActionPerformed(evt);
            }
        });
        pnlCampos.add(txtContacto);
        txtContacto.setBounds(30, 150, 150, 27);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel8.setText("Ciudad");
        pnlCampos.add(jLabel8);
        jLabel8.setBounds(200, 130, 60, 17);
        pnlCampos.add(txtCiudad);
        txtCiudad.setBounds(180, 150, 160, 26);

        jLabel7.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel7.setText("Barrio");
        pnlCampos.add(jLabel7);
        jLabel7.setBounds(370, 130, 35, 17);
        pnlCampos.add(txtBarrio);
        txtBarrio.setBounds(360, 150, 170, 26);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Dirección");
        pnlCampos.add(jLabel4);
        jLabel4.setBounds(40, 200, 110, 17);
        pnlCampos.add(txtDireccion);
        txtDireccion.setBounds(30, 220, 520, 26);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(0, 0, 580, 260);

        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 580, 260);

        jLabel10.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel10.setText("Gestion de Empleados");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 20, 169, 21);

        jLabel11.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel11.setText("Apellido(s)");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(260, 60, 120, 17);

        txtNombre1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtNombre1);
        txtNombre1.setBounds(30, 80, 220, 27);

        jLabel12.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel12.setText("Nombre(s)");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 60, 120, 17);

        txtCi1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtCi1);
        txtCi1.setBounds(440, 80, 110, 27);

        jLabel13.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel13.setText("Nro de C.I.");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(450, 60, 70, 17);

        txtApellido1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtApellido1);
        txtApellido1.setBounds(250, 80, 190, 27);

        jLabel14.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel14.setText("Nro de Contacto");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 130, 100, 17);

        txtContacto1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtContacto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContacto1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtContacto1);
        txtContacto1.setBounds(30, 150, 150, 27);

        jLabel15.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel15.setText("Ciudad");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(200, 130, 60, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCiudadActionPerformed
        Utils.abrirInternalFrame(new FrmGestionReferenciales());
    }//GEN-LAST:event_btnAgregarCiudadActionPerformed

    private void btnAgregarBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBarrioActionPerformed
        Utils.abrirInternalFrame(new FrmGestionReferenciales());
    }//GEN-LAST:event_btnAgregarBarrioActionPerformed

    private void txtContacto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContacto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContacto1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBarrio;
    private javax.swing.JButton btnAgregarCiudad;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtCi1;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtContacto1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
