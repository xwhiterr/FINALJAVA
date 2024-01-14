package ventanas;

import classes.Utils;
import ventanas.FrmMdi;

/**
 *
 * @author Walter
 */
public class FrmGestionEmpleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmGestionEmpleados
     */
    public FrmGestionEmpleados() {
        initComponents();
        setSize(600, 380);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAgregarCiudad = new javax.swing.JButton();
        btnAgregarBarrio = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("Gestion de Empleados");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 20, 169, 21);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Apellido(s)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 60, 120, 17);

        txtNombre.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(30, 80, 220, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setText("Nombre(s)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 60, 120, 17);

        txtCi.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtCi);
        txtCi.setBounds(440, 80, 110, 27);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Nro de C.I.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 60, 70, 17);

        txtApellido.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtApellido);
        txtApellido.setBounds(250, 80, 190, 27);

        jLabel6.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel6.setText("Nro de Contacto");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 130, 100, 17);

        txtContacto.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoActionPerformed(evt);
            }
        });
        getContentPane().add(txtContacto);
        txtContacto.setBounds(30, 150, 150, 27);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel8.setText("Ciudad");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 130, 60, 17);
        getContentPane().add(txtCiudad);
        txtCiudad.setBounds(180, 150, 160, 26);

        jLabel7.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel7.setText("Barrio");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 130, 35, 17);
        getContentPane().add(txtBarrio);
        txtBarrio.setBounds(360, 150, 170, 26);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Dirección");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 200, 110, 17);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(30, 220, 520, 26);

        btnEditar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEditar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar);

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

        btnAgregar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar);

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
        jPanel2.add(jLabel1);

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

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 280, 580, 40);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCiudadActionPerformed
        Utils.abrirInternalFrame(new FrmGestionReferenciales());
    }//GEN-LAST:event_btnAgregarCiudadActionPerformed

    private void btnAgregarBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBarrioActionPerformed
        Utils.abrirInternalFrame(new FrmGestionReferenciales());
    }//GEN-LAST:event_btnAgregarBarrioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarBarrio;
    private javax.swing.JButton btnAgregarCiudad;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
