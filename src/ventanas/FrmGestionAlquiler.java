package ventanas;

import classes.Utils;
import javax.swing.JDesktopPane;

/**
 *
 * @author Walter
 */
public class FrmGestionAlquiler extends javax.swing.JInternalFrame {

    private static JDesktopPane desktopPane;
    public FrmGestionAlquiler() {
        initComponents();
        setSize(510, 330);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        calFecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel3.setText("Gestion de Alquiler");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(50, 10, 220, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 530, 40);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 190, 450, 72);

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel1.setText("Nro de Ci");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 50, 110, 17);

        txtNombreCliente.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        getContentPane().add(txtNombreCliente);
        txtNombreCliente.setBounds(170, 70, 270, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del Libro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 160, 17);

        txtCi.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        getContentPane().add(txtCi);
        txtCi.setBounds(40, 70, 130, 27);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel4.setText("Fecha del Alquiler");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 120, 110, 17);
        getContentPane().add(txtNombreLibro);
        txtNombreLibro.setBounds(40, 140, 280, 26);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel5.setText("Nombre del Cliente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 50, 180, 17);
        getContentPane().add(calFecha);
        calFecha.setBounds(320, 140, 140, 26);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 70, 20, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Utils.abrirInternalFrame(new FrmGestionClientes());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser calFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
