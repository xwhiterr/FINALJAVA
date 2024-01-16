package ventanas;

import clases.Utils;
import javax.swing.JDesktopPane;

/**
 *
 * @author Walter
 */
public class FrmGestionAlquiler extends javax.swing.JInternalFrame {

    private static JDesktopPane desktopPane;

    public FrmGestionAlquiler() {
        initComponents();
        setSize(533, 365);
        clases.Utils.activarPanel(false, pnlCampos);
        clases.Utils.activarScrollList(false, pnlCampos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEntregar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        scrCi = new javax.swing.JScrollPane();
        lstCi = new javax.swing.JList<>();
        scrCliente = new javax.swing.JScrollPane();
        lstcliente = new javax.swing.JList<>();
        scrLibro = new javax.swing.JScrollPane();
        lstLibro = new javax.swing.JList<>();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        calFecha = new com.toedter.calendar.JDateChooser();
        btnAgregarCliente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        txtIdLibro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jButton1.setText("jButton1");

        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel3.setText("Gestion de Alquiler");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(50, 0, 220, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 520, 40);

        jPanel1.setLayout(null);

        btnEntregar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnEntregar.setText("ENTREGAR");
        btnEntregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntregar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEntregar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntregar);
        btnEntregar.setBounds(90, 0, 100, 60);

        btnRecibir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnRecibir.setText("RECIBIR");
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecibir);
        btnRecibir.setBounds(190, 0, 100, 61);

        btnNuevo.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setNextFocusableComponent(txtCi);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo);
        btnNuevo.setBounds(0, 0, 91, 60);

        btnCancelar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(290, 0, 100, 60);

        Salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir);
        Salir.setBounds(420, 0, 76, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 243, 520, 60);

        pnlCampos.setEnabled(false);
        pnlCampos.setLayout(null);

        lstCi.setNextFocusableComponent(txtIdCliente);
        scrCi.setViewportView(lstCi);
        lstCi.getAccessibleContext().setAccessibleParent(null);

        pnlCampos.add(scrCi);
        scrCi.setBounds(10, 50, 110, 10);

        lstcliente.setNextFocusableComponent(txtIdLibro);
        scrCliente.setViewportView(lstcliente);

        pnlCampos.add(scrCliente);
        scrCliente.setBounds(170, 50, 310, 10);

        lstLibro.setNextFocusableComponent(calFecha);
        scrLibro.setViewportView(lstLibro);

        pnlCampos.add(scrLibro);
        scrLibro.setBounds(50, 110, 330, 10);

        txtNombreCliente.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtNombreCliente.setNextFocusableComponent(lstcliente);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        pnlCampos.add(txtNombreCliente);
        txtNombreCliente.setBounds(170, 20, 310, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel2.setText("Libro");
        pnlCampos.add(jLabel2);
        jLabel2.setBounds(60, 60, 160, 17);

        txtCi.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtCi.setNextFocusableComponent(lstCi);
        pnlCampos.add(txtCi);
        txtCi.setBounds(10, 20, 110, 27);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel4.setText("Fecha ");
        pnlCampos.add(jLabel4);
        jLabel4.setBounds(20, 120, 40, 17);
        pnlCampos.add(txtNombreLibro);
        txtNombreLibro.setBounds(50, 80, 330, 26);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel5.setText("Cliente");
        pnlCampos.add(jLabel5);
        jLabel5.setBounds(170, 0, 180, 17);
        pnlCampos.add(calFecha);
        calFecha.setBounds(10, 140, 140, 26);

        btnAgregarCliente.setText("jButton1");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarCliente);
        btnAgregarCliente.setBounds(480, 20, 20, 27);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel8.setText("Empleado");
        pnlCampos.add(jLabel8);
        jLabel8.setBounds(220, 120, 120, 20);

        txtEstado.setEditable(false);
        pnlCampos.add(txtEstado);
        txtEstado.setBounds(390, 80, 60, 26);

        txtIdCliente.setNextFocusableComponent(txtNombreCliente);
        pnlCampos.add(txtIdCliente);
        txtIdCliente.setBounds(130, 20, 40, 26);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel9.setText(" Ci");
        pnlCampos.add(jLabel9);
        jLabel9.setBounds(20, 0, 30, 17);

        jLabel10.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel10.setText("ID");
        pnlCampos.add(jLabel10);
        jLabel10.setBounds(140, 0, 20, 17);

        txtEmpleado.setEditable(false);
        pnlCampos.add(txtEmpleado);
        txtEmpleado.setBounds(210, 140, 180, 26);

        txtIdLibro.setNextFocusableComponent(txtNombreLibro);
        pnlCampos.add(txtIdLibro);
        txtIdLibro.setBounds(10, 80, 40, 26);

        jLabel7.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel7.setText("ID");
        pnlCampos.add(jLabel7);
        jLabel7.setBounds(20, 60, 20, 17);

        jLabel11.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel11.setText("Estado");
        pnlCampos.add(jLabel11);
        jLabel11.setBounds(400, 60, 50, 20);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(20, 40, 480, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        clases.Controlador.executeQuery("INSERT INTO estado (cli_id, lib_id, lib_est, est_fecha) VALUES ('" + txtIdCliente.getText()
                + "', '" + txtIdLibro.getText()
                + "', 'O"
                + "', '" + calFecha.getDate() + "')");
        txtCi.setText("");
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtIdLibro.setText("");
        txtNombreLibro.setText("");
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        clases.Controlador.executeQuery("INSERT INTO estado (cli_id, lib_id, lib_est, est_fecha) VALUES ('" + txtIdCliente.getText()
                + "', '" + txtIdLibro.getText()
                + "', 'I"
                + "', '" + calFecha.getDate() + "')");
        txtCi.setText("");
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtIdLibro.setText("");
        txtNombreLibro.setText("");
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Utils.abrirInternalFrame(new FrmGestionClientes());
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clases.Utils.activarPanel(false, pnlCampos);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRecibir;
    private com.toedter.calendar.JDateChooser calFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JList<String> lstCi;
    private javax.swing.JList<String> lstLibro;
    private javax.swing.JList<String> lstcliente;
    private static javax.swing.JPanel pnlCampos;
    private javax.swing.JScrollPane scrCi;
    private javax.swing.JScrollPane scrCliente;
    private javax.swing.JScrollPane scrLibro;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
