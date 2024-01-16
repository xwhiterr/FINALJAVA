package ventanas;

import clases.Controlador;

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
        lblPais.setBounds(50, 20, 93, 21);

        txtPais.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        pnlPais.add(txtPais);
        txtPais.setBounds(40, 50, 250, 31);

        btnSalir.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSalir.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnlPais.add(jPanel6);
        jPanel6.setBounds(25, 128, 290, 60);

        tabReferenciales.addTab("Pais", pnlPais);

        pnlCiudad.setLayout(null);

        lblCiudad.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblCiudad.setText("Ingrese Ciudad");
        pnlCiudad.add(lblCiudad);
        lblCiudad.setBounds(35, 22, 114, 21);

        txtCiudad.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        pnlCiudad.add(txtCiudad);
        txtCiudad.setBounds(25, 52, 250, 31);

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnlCiudad.add(jPanel8);
        jPanel8.setBounds(25, 131, 260, 60);

        tabReferenciales.addTab("Ciudad", pnlCiudad);

        pnlBarrio.setLayout(null);

        lblBarrio.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblBarrio.setText("Ingrese Barrio");
        pnlBarrio.add(lblBarrio);
        lblBarrio.setBounds(35, 22, 109, 21);

        txtBarrio.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        pnlBarrio.add(txtBarrio);
        txtBarrio.setBounds(25, 52, 250, 31);

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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnlBarrio.add(jPanel9);
        jPanel9.setBounds(25, 134, 270, 60);

        tabReferenciales.addTab("Barrio", pnlBarrio);

        getContentPane().add(tabReferenciales);
        tabReferenciales.setBounds(0, 0, 320, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        clases.Controlador.executeQuery("INSERT INTO pais (pai_desc) VALUES ( '"+txtPais.getText() +"')");
        txtPais.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        clases.Controlador.executeQuery("INSERT INTO ciudad (ciu_desc) VALUES ( '"+txtCiudad.getText() +"')");
        txtPais.setText("");
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        clases.Controlador.executeQuery("INSERT INTO barrio (bar_desc) VALUES ( '"+txtBarrio.getText() +"')");
        txtPais.setText("");
         
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
