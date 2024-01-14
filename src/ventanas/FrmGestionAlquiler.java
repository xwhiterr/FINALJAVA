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
        clases.Utils.activarPanel(false, jPanel2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEntregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        calFecha = new com.toedter.calendar.JDateChooser();
        btnAgregarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jButton1.setText("jButton1");

        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel3.setText("Gestion de Alquiler");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(50, 0, 220, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 530, 40);

        btnGuardar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnGuardar.setText("ENTREGAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnGuardar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEntregar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnEntregar.setText("RECIBIR");
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 243, 310, 70);

        jPanel2.setEnabled(false);
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel1.setText(" Ci");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 0, 30, 17);

        txtNombreCliente.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreCliente);
        txtNombreCliente.setBounds(130, 20, 280, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel2.setText("Libro");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 60, 160, 17);

        txtCi.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jPanel2.add(txtCi);
        txtCi.setBounds(10, 20, 110, 27);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel4.setText("Fecha ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 120, 40, 17);
        jPanel2.add(txtNombreLibro);
        txtNombreLibro.setBounds(10, 80, 280, 26);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel5.setText("Cliente");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(140, 0, 180, 17);
        jPanel2.add(calFecha);
        calFecha.setBounds(60, 140, 140, 26);

        btnAgregarCliente.setText("jButton1");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCliente);
        btnAgregarCliente.setBounds(410, 20, 20, 27);

        jLabel7.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel7.setText("Id");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 120, 20, 17);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(10, 140, 40, 26);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel8.setText("Estado");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(310, 60, 50, 20);
        jPanel2.add(txtEstado);
        txtEstado.setBounds(300, 80, 80, 26);

        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 110, 10);

        jScrollPane2.setViewportView(jList2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(130, 50, 280, 10);

        jScrollPane3.setViewportView(jList3);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 110, 280, 10);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 40, 470, 200);

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
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(380, 250, 100, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Utils.abrirInternalFrame(new FrmGestionClientes());
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        clases.Utils.activarPanel(true, jPanel2);
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private com.toedter.calendar.JDateChooser calFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
