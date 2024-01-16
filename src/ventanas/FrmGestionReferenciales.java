package ventanas;

import clases.Controlador;

/**
 *
 * @author Walter
 */
public class FrmGestionReferenciales extends javax.swing.JInternalFrame {

    public FrmGestionReferenciales() {
        initComponents();
        setSize(550, 270);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabReferenciales = new javax.swing.JTabbedPane();
        pnlPais = new javax.swing.JPanel();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        pnlCiudad = new javax.swing.JPanel();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnBuscar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        pnlBarrio = new javax.swing.JPanel();
        lblBarrio = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btnBuscar2 = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(550, 350));
        getContentPane().setLayout(null);

        tabReferenciales.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        tabReferenciales.setMinimumSize(new java.awt.Dimension(550, 350));

        lblPais.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblPais.setText("Ingrese Pais");

        txtPais.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnBuscar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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

        btnEliminar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEliminar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        btnEditar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEditar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlPaisLayout = new javax.swing.GroupLayout(pnlPais);
        pnlPais.setLayout(pnlPaisLayout);
        pnlPaisLayout.setHorizontalGroup(
            pnlPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPaisLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPaisLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPais))
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlPaisLayout.setVerticalGroup(
            pnlPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPaisLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblPais)
                .addGap(9, 9, 9)
                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        tabReferenciales.addTab("Pais", pnlPais);

        lblCiudad.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblCiudad.setText("Ingrese Ciudad");

        txtCiudad.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N

        btnBuscar1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnBuscar1.setText("BUSCAR");
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnBuscar1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

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

        btnEliminar1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEliminar1.setText("ELIMINAR");
        btnEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEliminar1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
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

        btnEditar1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEditar1.setText("EDITAR");
        btnEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEditar1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlCiudadLayout = new javax.swing.GroupLayout(pnlCiudad);
        pnlCiudad.setLayout(pnlCiudadLayout);
        pnlCiudadLayout.setHorizontalGroup(
            pnlCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCiudadLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCiudadLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCiudad))
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlCiudadLayout.setVerticalGroup(
            pnlCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCiudadLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblCiudad)
                .addGap(9, 9, 9)
                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        tabReferenciales.addTab("Ciudad", pnlCiudad);

        lblBarrio.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblBarrio.setText("Ingrese Barrio");

        txtBarrio.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N

        btnBuscar2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnBuscar2.setText("BUSCAR");
        btnBuscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnBuscar2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

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

        btnEliminar2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEliminar2.setText("ELIMINAR");
        btnEliminar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEliminar2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        btnAgregar2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnAgregar2.setText("AGREGAR");
        btnAgregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        btnEditar2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEditar2.setText("EDITAR");
        btnEditar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEditar2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlBarrioLayout = new javax.swing.GroupLayout(pnlBarrio);
        pnlBarrio.setLayout(pnlBarrioLayout);
        pnlBarrioLayout.setHorizontalGroup(
            pnlBarrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarrioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlBarrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBarrioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblBarrio))
                    .addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlBarrioLayout.setVerticalGroup(
            pnlBarrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarrioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBarrio)
                .addGap(9, 9, 9)
                .addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        tabReferenciales.addTab("Barrio", pnlBarrio);

        getContentPane().add(tabReferenciales);
        tabReferenciales.setBounds(0, 0, 560, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        clases.Controlador.executeQuery("INSERT INTO pais (pai_desc) VALUES ( '"+txtPais.getText() +"')");
        txtPais.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        clases.Controlador.executeQuery("INSERT INTO ciudad (ciu_desc) VALUES ( '"+txtCiudad.getText() +"')");
        txtPais.setText("");
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        clases.Controlador.executeQuery("INSERT INTO barrio (bar_desc) VALUES ( '"+txtBarrio.getText() +"')");
        txtPais.setText("");
         
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditar2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
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
