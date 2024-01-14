package ventanas;

/**
 *
 * @author Walter
 */
public class FrmGestionFuentes extends javax.swing.JInternalFrame {

    public FrmGestionFuentes() {
        initComponents();
        setSize(550, 270);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabInfoLibros = new javax.swing.JTabbedPane();
        pnlAutor = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        BotoneraAutor = new javax.swing.JPanel();
        BtnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        pnlEditorial = new javax.swing.JPanel();
        lblEditorial = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        BotoneraEditorial = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        pnlGenero = new javax.swing.JPanel();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        BotoneraGenero = new javax.swing.JPanel();
        btnGuardar2 = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(550, 270));
        setMinimumSize(new java.awt.Dimension(550, 270));
        getContentPane().setLayout(null);

        tabInfoLibros.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        tabInfoLibros.setMinimumSize(new java.awt.Dimension(550, 350));

        lblAutor.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblAutor.setText("Ingrese Autor");

        txtAutor.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N

        BtnGuardar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardar.setMaximumSize(new java.awt.Dimension(100, 100));
        BtnGuardar.setMinimumSize(new java.awt.Dimension(100, 100));

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

        bntEliminar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        bntEliminar.setText("ELIMINAR");
        bntEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntEliminar.setMaximumSize(new java.awt.Dimension(100, 100));
        bntEliminar.setMinimumSize(new java.awt.Dimension(100, 100));

        btnAgregar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar.setMinimumSize(new java.awt.Dimension(100, 100));

        btnEditar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEditar.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout BotoneraAutorLayout = new javax.swing.GroupLayout(BotoneraAutor);
        BotoneraAutor.setLayout(BotoneraAutorLayout);
        BotoneraAutorLayout.setHorizontalGroup(
            BotoneraAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        BotoneraAutorLayout.setVerticalGroup(
            BotoneraAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraAutorLayout.createSequentialGroup()
                .addGroup(BotoneraAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlAutorLayout = new javax.swing.GroupLayout(pnlAutor);
        pnlAutor.setLayout(pnlAutorLayout);
        pnlAutorLayout.setHorizontalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotoneraAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAutorLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAutor))
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlAutorLayout.setVerticalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblAutor)
                .addGap(9, 9, 9)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(BotoneraAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        tabInfoLibros.addTab("Autor", pnlAutor);

        lblEditorial.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblEditorial.setText("Ingrese Editorial");

        txtEditorial.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N

        btnGuardar1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnGuardar1.setText("GUARDAR");
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnGuardar1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1btnGuaPaiActionPerformed(evt);
            }
        });

        btnSalir1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnSalir1.setText("SALIR");
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSalir1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1btnSaliPaiActionPerformed(evt);
            }
        });

        btnEliminar1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEliminar1.setText("ELIMINAR");
        btnEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEliminar1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1btnAgregar4ActionPerformed(evt);
            }
        });

        btnAgregar1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnAgregar1.setText("AGREGAR");
        btnAgregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1btnAgrePaiActionPerformed(evt);
            }
        });

        btnEditar1.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEditar1.setText("EDITAR");
        btnEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar1.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEditar1.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1btnAgregar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoneraEditorialLayout = new javax.swing.GroupLayout(BotoneraEditorial);
        BotoneraEditorial.setLayout(BotoneraEditorialLayout);
        BotoneraEditorialLayout.setHorizontalGroup(
            BotoneraEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraEditorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        BotoneraEditorialLayout.setVerticalGroup(
            BotoneraEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraEditorialLayout.createSequentialGroup()
                .addGroup(BotoneraEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlEditorialLayout = new javax.swing.GroupLayout(pnlEditorial);
        pnlEditorial.setLayout(pnlEditorialLayout);
        pnlEditorialLayout.setHorizontalGroup(
            pnlEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditorialLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotoneraEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEditorialLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblEditorial))
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlEditorialLayout.setVerticalGroup(
            pnlEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditorialLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblEditorial)
                .addGap(9, 9, 9)
                .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(BotoneraEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        tabInfoLibros.addTab("Editorial", pnlEditorial);

        lblGenero.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblGenero.setText("Ingrese Genero");

        txtGenero.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N

        btnGuardar2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnGuardar2.setText("GUARDAR");
        btnGuardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnGuardar2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2btnGuaPaiActionPerformed(evt);
            }
        });

        btnSalir2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnSalir2.setText("SALIR");
        btnSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSalir2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2btnSaliPaiActionPerformed(evt);
            }
        });

        btnEliminar2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEliminar2.setText("ELIMINAR");
        btnEliminar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEliminar2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2btnAgregar4ActionPerformed(evt);
            }
        });

        btnAgregar2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnAgregar2.setText("AGREGAR");
        btnAgregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnAgregar2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2btnAgrePaiActionPerformed(evt);
            }
        });

        btnEditar2.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        btnEditar2.setText("EDITAR");
        btnEditar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar2.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEditar2.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2btnAgregar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoneraGeneroLayout = new javax.swing.GroupLayout(BotoneraGenero);
        BotoneraGenero.setLayout(BotoneraGeneroLayout);
        BotoneraGeneroLayout.setHorizontalGroup(
            BotoneraGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        BotoneraGeneroLayout.setVerticalGroup(
            BotoneraGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraGeneroLayout.createSequentialGroup()
                .addGroup(BotoneraGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlGeneroLayout = new javax.swing.GroupLayout(pnlGenero);
        pnlGenero.setLayout(pnlGeneroLayout);
        pnlGeneroLayout.setHorizontalGroup(
            pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotoneraGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGeneroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblGenero))
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlGeneroLayout.setVerticalGroup(
            pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblGenero)
                .addGap(9, 9, 9)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(BotoneraGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        tabInfoLibros.addTab("Genero", pnlGenero);

        getContentPane().add(tabInfoLibros);
        tabInfoLibros.setBounds(0, 0, 560, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar1btnGuaPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1btnGuaPaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1btnGuaPaiActionPerformed

    private void btnSalir1btnSaliPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1btnSaliPaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1btnSaliPaiActionPerformed

    private void btnEliminar1btnAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1btnAgregar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1btnAgregar4ActionPerformed

    private void btnAgregar1btnAgrePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1btnAgrePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar1btnAgrePaiActionPerformed

    private void btnEditar1btnAgregar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1btnAgregar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditar1btnAgregar6ActionPerformed

    private void btnGuardar2btnGuaPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2btnGuaPaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar2btnGuaPaiActionPerformed

    private void btnSalir2btnSaliPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2btnSaliPaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir2btnSaliPaiActionPerformed

    private void btnEliminar2btnAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2btnAgregar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar2btnAgregar4ActionPerformed

    private void btnAgregar2btnAgrePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2btnAgrePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar2btnAgrePaiActionPerformed

    private void btnEditar2btnAgregar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2btnAgregar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditar2btnAgregar6ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotoneraAutor;
    private javax.swing.JPanel BotoneraEditorial;
    private javax.swing.JPanel BotoneraGenero;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JPanel pnlAutor;
    private javax.swing.JPanel pnlEditorial;
    private javax.swing.JPanel pnlGenero;
    private javax.swing.JTabbedPane tabInfoLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    // End of variables declaration//GEN-END:variables
}
