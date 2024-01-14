package ventanas;

import classes.Utils;

/**
 *
 * @author Walter
 */
public class FrmGestionLibros extends javax.swing.JInternalFrame {

    public FrmGestionLibros() {
        initComponents();
        setSize(655, 310);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnELliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        btnAgregarGen = new javax.swing.JButton();
        btnAgregarAut = new javax.swing.JButton();
        btnAgregarEdi = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(655, 310));
        setMinimumSize(new java.awt.Dimension(655, 310));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("Gestion de Libros");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 10, 133, 28);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 40);

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

        btnELliminar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnELliminar.setText("ELIMINAR");
        btnELliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnELliminar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnELliminar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnELliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnELliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnELliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 190, 620, 70);

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del Libro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 50, 150, 17);

        txtNombreLibro.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtNombreLibro);
        txtNombreLibro.setBounds(40, 70, 240, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setText("ISBN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 50, 80, 17);

        txtISBN.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtISBN);
        txtISBN.setBounds(280, 70, 160, 27);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del autor");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 100, 160, 17);

        jTextField3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(40, 120, 230, 27);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Editorial");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 50, 110, 17);

        jTextField4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(440, 70, 160, 27);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Género");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 100, 90, 17);

        jTextField5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(290, 120, 200, 27);

        btnAgregarGen.setText("jButton1");
        btnAgregarGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarGenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarGen);
        btnAgregarGen.setBounds(490, 120, 20, 27);

        btnAgregarAut.setText("jButton1");
        btnAgregarAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAut);
        btnAgregarAut.setBounds(270, 120, 20, 27);

        btnAgregarEdi.setText("jButton1");
        btnAgregarEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEdiActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarEdi);
        btnAgregarEdi.setBounds(600, 70, 20, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnELliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnELliminarActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btnAgregarAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutActionPerformed
        Utils.abrirInternalFrame(new FrmGestionFuentes());
    }//GEN-LAST:event_btnAgregarAutActionPerformed

    private void btnAgregarEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEdiActionPerformed
        Utils.abrirInternalFrame(new FrmGestionFuentes());
    }//GEN-LAST:event_btnAgregarEdiActionPerformed

    private void btnAgregarGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarGenActionPerformed
        Utils.abrirInternalFrame(new FrmGestionFuentes());
    }//GEN-LAST:event_btnAgregarGenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarAut;
    private javax.swing.JButton btnAgregarEdi;
    private javax.swing.JButton btnAgregarGen;
    private javax.swing.JButton btnELliminar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
