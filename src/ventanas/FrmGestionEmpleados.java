package ventanas;

import clases.Controlador;
import clases.Utils;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Walter
 */
public class FrmGestionEmpleados extends javax.swing.JInternalFrame {

    ResultSet rs = null;
    Statement statement = null;
    
    public FrmGestionEmpleados() {
        initComponents();
        setSize(650, 400);
        clases.Utils.activarPanel(false, pnlCampos);
        scrCi.setVisible(false);
        clases.Utils.activarScrollList(false, pnlCampos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        scrBarrio = new javax.swing.JScrollPane();
        lstBarrio = new javax.swing.JList<>();
        scrCi = new javax.swing.JScrollPane();
        lstCi = new javax.swing.JList<>();
        scrNombre = new javax.swing.JScrollPane();
        lstNombre = new javax.swing.JList<>();
        scrCiudad = new javax.swing.JScrollPane();
        lstCiudad = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        btnAgregarBarrio = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnAgregarCiudad = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
        btnSalir.setBounds(490, 0, 100, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 280, 600, 60);

        pnlCampos.setLayout(null);

        scrBarrio.setViewportView(lstBarrio);

        pnlCampos.add(scrBarrio);
        scrBarrio.setBounds(430, 180, 150, 10);

        scrCi.setViewportView(lstCi);

        pnlCampos.add(scrCi);
        scrCi.setBounds(30, 120, 110, 10);

        scrNombre.setViewportView(lstNombre);

        pnlCampos.add(scrNombre);
        scrNombre.setBounds(160, 120, 230, 10);

        scrCiudad.setViewportView(lstCiudad);

        pnlCampos.add(scrCiudad);
        scrCiudad.setBounds(230, 180, 140, 10);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("Gestion de Empleados");
        pnlCampos.add(jLabel9);
        jLabel9.setBounds(40, 20, 169, 21);

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
        txtContacto.setBounds(30, 150, 160, 27);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel8.setText("Ciudad");
        pnlCampos.add(jLabel8);
        jLabel8.setBounds(300, 130, 60, 17);
        pnlCampos.add(txtCiudad);
        txtCiudad.setBounds(230, 150, 140, 26);

        jLabel7.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel7.setText("Barrio");
        pnlCampos.add(jLabel7);
        jLabel7.setBounds(430, 130, 35, 17);
        pnlCampos.add(txtBarrio);
        txtBarrio.setBounds(430, 150, 150, 26);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Dirección");
        pnlCampos.add(jLabel4);
        jLabel4.setBounds(40, 190, 110, 17);
        pnlCampos.add(txtDireccion);
        txtDireccion.setBounds(30, 210, 570, 26);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Nro de C.I.");
        pnlCampos.add(jLabel3);
        jLabel3.setBounds(40, 70, 70, 17);

        txtCi.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtCi);
        txtCi.setBounds(30, 90, 110, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setText("Nombre(s)");
        pnlCampos.add(jLabel2);
        jLabel2.setBounds(170, 70, 120, 17);

        txtNombre.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtNombre);
        txtNombre.setBounds(160, 90, 230, 27);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Apellido(s)");
        pnlCampos.add(jLabel5);
        jLabel5.setBounds(410, 70, 120, 17);

        txtApellido.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtApellido);
        txtApellido.setBounds(390, 90, 210, 27);

        btnAgregarBarrio.setText("jButton2");
        btnAgregarBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBarrioActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarBarrio);
        btnAgregarBarrio.setBounds(580, 150, 20, 27);

        jLabel16.setText("ID");
        pnlCampos.add(jLabel16);
        jLabel16.setBounds(400, 130, 20, 16);

        btnAgregarCiudad.setText("jButton1");
        btnAgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCiudadActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarCiudad);
        btnAgregarCiudad.setBounds(370, 150, 20, 27);
        pnlCampos.add(jTextField1);
        jTextField1.setBounds(390, 150, 40, 26);
        pnlCampos.add(jTextField2);
        jTextField2.setBounds(190, 150, 40, 26);

        jLabel17.setText("ID");
        pnlCampos.add(jLabel17);
        jLabel17.setBounds(200, 130, 43, 16);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlCampos.add(jButton1);
        jButton1.setBounds(300, 30, 79, 27);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(0, 0, 660, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        clases.Controlador.executeQuery("INSERT INTO empleado (emp_ci, emp_nom, emp_ape, emp_cel, ciu_id, bar_id, emp_dire) VALUES ('" + txtCi.getText()
                + "', '" + txtNombre.getText()
                + "', '" + txtApellido.getText()
                + "', '" + txtContacto.getText()
                + "', '" + txtCiudad.getText()
                + "', '" + txtBarrio.getText()
                + "', '" + txtDireccion.getText() + "')");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCi.setText("");
        txtCiudad.setText("");
        txtBarrio.setText("");
        txtContacto.setText("");
        txtDireccion.setText("");
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        statement = Controlador.getStatement();
        try {
                  rs  = statement.executeQuery("SELECT * FROM empleado");  
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBarrio;
    private javax.swing.JButton btnAgregarCiudad;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JList<String> lstBarrio;
    private javax.swing.JList<String> lstCi;
    private javax.swing.JList<String> lstCiudad;
    private javax.swing.JList<String> lstNombre;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JScrollPane scrBarrio;
    private javax.swing.JScrollPane scrCi;
    private javax.swing.JScrollPane scrCiudad;
    private javax.swing.JScrollPane scrNombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
