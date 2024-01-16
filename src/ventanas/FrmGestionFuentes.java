package ventanas;

/**
 *
 * @author Walter
 */
public class FrmGestionFuentes extends javax.swing.JInternalFrame {

    public FrmGestionFuentes() {
        initComponents();
        setSize(630, 300);
        clases.Utils.activarScrollList(false, pnlAutor);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tabInfoLibros = new javax.swing.JTabbedPane();
        pnlEditorial = new javax.swing.JPanel();
        lblEditorial = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        BotoneraEditorial = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        pnlGenero = new javax.swing.JPanel();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        BotoneraGenero = new javax.swing.JPanel();
        btnGuardar2 = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        pnlAutor = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        BotoneraAutor = new javax.swing.JPanel();
        BtnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtPais = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtIdPais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel4.setText("jLabel4");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setMaximumSize(new java.awt.Dimension(550, 270));
        setMinimumSize(new java.awt.Dimension(550, 270));
        getContentPane().setLayout(null);

        tabInfoLibros.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        tabInfoLibros.setMinimumSize(new java.awt.Dimension(550, 350));

        pnlEditorial.setLayout(null);

        lblEditorial.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblEditorial.setText("Ingrese Editorial");
        pnlEditorial.add(lblEditorial);
        lblEditorial.setBounds(35, 22, 240, 21);

        txtEditorial.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        txtEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialActionPerformed(evt);
            }
        });
        pnlEditorial.add(txtEditorial);
        txtEditorial.setBounds(25, 52, 250, 31);

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

        javax.swing.GroupLayout BotoneraEditorialLayout = new javax.swing.GroupLayout(BotoneraEditorial);
        BotoneraEditorial.setLayout(BotoneraEditorialLayout);
        BotoneraEditorialLayout.setHorizontalGroup(
            BotoneraEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraEditorialLayout.createSequentialGroup()
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        BotoneraEditorialLayout.setVerticalGroup(
            BotoneraEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraEditorialLayout.createSequentialGroup()
                .addGroup(BotoneraEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnlEditorial.add(BotoneraEditorial);
        BotoneraEditorial.setBounds(25, 127, 515, 60);

        tabInfoLibros.addTab("Editorial", pnlEditorial);

        pnlGenero.setLayout(null);

        lblGenero.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblGenero.setText("Ingrese Genero");
        pnlGenero.add(lblGenero);
        lblGenero.setBounds(35, 22, 230, 21);

        txtGenero.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        pnlGenero.add(txtGenero);
        txtGenero.setBounds(25, 52, 250, 31);

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

        javax.swing.GroupLayout BotoneraGeneroLayout = new javax.swing.GroupLayout(BotoneraGenero);
        BotoneraGenero.setLayout(BotoneraGeneroLayout);
        BotoneraGeneroLayout.setHorizontalGroup(
            BotoneraGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        BotoneraGeneroLayout.setVerticalGroup(
            BotoneraGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraGeneroLayout.createSequentialGroup()
                .addGroup(BotoneraGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnlGenero.add(BotoneraGenero);
        BotoneraGenero.setBounds(25, 127, 518, 60);

        tabInfoLibros.addTab("Genero", pnlGenero);

        pnlAutor.setLayout(null);

        lblAutor.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblAutor.setText("Ingrese Autor");
        pnlAutor.add(lblAutor);
        lblAutor.setBounds(41, 27, 105, 21);

        txtNombre.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        pnlAutor.add(txtNombre);
        txtNombre.setBounds(25, 87, 205, 30);

        BtnGuardar.setFont(new java.awt.Font("HP Simplified", 1, 12)); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardar.setMaximumSize(new java.awt.Dimension(100, 100));
        BtnGuardar.setMinimumSize(new java.awt.Dimension(100, 100));
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
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

        javax.swing.GroupLayout BotoneraAutorLayout = new javax.swing.GroupLayout(BotoneraAutor);
        BotoneraAutor.setLayout(BotoneraAutorLayout);
        BotoneraAutorLayout.setHorizontalGroup(
            BotoneraAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotoneraAutorLayout.setVerticalGroup(
            BotoneraAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraAutorLayout.createSequentialGroup()
                .addGroup(BotoneraAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnlAutor.add(BotoneraAutor);
        BotoneraAutor.setBounds(20, 140, 520, 60);

        txtPais.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        pnlAutor.add(txtPais);
        txtPais.setBounds(486, 87, 130, 31);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        pnlAutor.add(jLabel2);
        jLabel2.setBounds(41, 65, 190, 17);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");
        pnlAutor.add(jLabel3);
        jLabel3.setBounds(242, 65, 180, 17);

        jLabel6.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel6.setText("Pais");
        pnlAutor.add(jLabel6);
        jLabel6.setBounds(500, 60, 40, 17);

        txtApellido.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        pnlAutor.add(txtApellido);
        txtApellido.setBounds(236, 87, 190, 31);

        txtIdPais.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtIdPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPaisActionPerformed(evt);
            }
        });
        pnlAutor.add(txtIdPais);
        txtIdPais.setBounds(436, 87, 50, 31);

        jLabel5.setText("ID");
        pnlAutor.add(jLabel5);
        jLabel5.setBounds(450, 60, 30, 16);

        tabInfoLibros.addTab("Autor", pnlAutor);

        getContentPane().add(tabInfoLibros);
        tabInfoLibros.setBounds(0, 0, 630, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar1btnGuaPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1btnGuaPaiActionPerformed
        clases.Controlador.executeQuery("INSERT INTO editorial (edi_nom) VALUES ( '"+txtEditorial.getText() +"')");
        txtEditorial.setText("");
    }//GEN-LAST:event_btnGuardar1btnGuaPaiActionPerformed

    private void btnSalir1btnSaliPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1btnSaliPaiActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir1btnSaliPaiActionPerformed

    private void btnGuardar2btnGuaPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2btnGuaPaiActionPerformed
        clases.Controlador.executeQuery("INSERT INTO genero (gen_desc) VALUES ( '"+txtGenero.getText() +"')");
        txtGenero.setText("");
    }//GEN-LAST:event_btnGuardar2btnGuaPaiActionPerformed

    private void btnSalir2btnSaliPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2btnSaliPaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir2btnSaliPaiActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
       clases.Controlador.executeQuery("INSERT INTO autor (aut_nom, aut_ape, pai_id) VALUES ('" + txtNombre.getText() + 
                "', '" + txtApellido.getText() + 
              "', '" + txtIdPais.getText() + "');");
       txtNombre.setText("");  
       txtApellido.setText("");  
       txtIdPais.setText(""); 
       txtPais.setText("");
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialActionPerformed

    private void txtIdPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPaisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotoneraAutor;
    private javax.swing.JPanel BotoneraEditorial;
    private javax.swing.JPanel BotoneraGenero;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JPanel pnlAutor;
    private javax.swing.JPanel pnlEditorial;
    private javax.swing.JPanel pnlGenero;
    private javax.swing.JTabbedPane tabInfoLibros;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdPais;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
