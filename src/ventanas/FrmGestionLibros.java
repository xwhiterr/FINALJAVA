package ventanas;

import clases.Utils;

/**
 *
 * @author Walter
 */
public class FrmGestionLibros extends javax.swing.JInternalFrame {

    public FrmGestionLibros() {
        initComponents();
        setSize(714, 310);
         clases.Utils.activarPanel(false, pnlCampos);
         clases.Utils.activarScrollList(false, pnlCampos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCampos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        btnAgregarGen = new javax.swing.JButton();
        btnAgregarAut = new javax.swing.JButton();
        btnAgregarEdi = new javax.swing.JButton();
        scrEditorial = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList<>();
        scrAutor = new javax.swing.JScrollPane();
        lstAutor = new javax.swing.JList<>();
        scrGenero = new javax.swing.JScrollPane();
        lstGenero = new javax.swing.JList<>();
        txtIdEdi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdGen = new javax.swing.JTextField();
        txtIdAut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnELliminar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(655, 310));
        setMinimumSize(new java.awt.Dimension(655, 310));
        getContentPane().setLayout(null);

        pnlCampos.setLayout(null);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("Gestion de Libros");
        pnlCampos.add(jLabel9);
        jLabel9.setBounds(40, 10, 133, 28);

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del Libro");
        pnlCampos.add(jLabel1);
        jLabel1.setBounds(30, 50, 150, 17);

        txtNombreLibro.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtNombreLibro);
        txtNombreLibro.setBounds(20, 70, 240, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setText("ISBN");
        pnlCampos.add(jLabel2);
        jLabel2.setBounds(280, 50, 80, 17);

        txtISBN.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtISBN);
        txtISBN.setBounds(260, 70, 180, 27);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del autor");
        pnlCampos.add(jLabel3);
        jLabel3.setBounds(70, 110, 160, 17);

        txtAutor.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtAutor);
        txtAutor.setBounds(60, 130, 230, 27);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Editorial");
        pnlCampos.add(jLabel4);
        jLabel4.setBounds(500, 50, 110, 17);

        txtEditorial.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        pnlCampos.add(txtEditorial);
        txtEditorial.setBounds(490, 70, 160, 27);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Género");
        pnlCampos.add(jLabel5);
        jLabel5.setBounds(380, 110, 90, 17);

        txtGenero.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });
        pnlCampos.add(txtGenero);
        txtGenero.setBounds(370, 130, 200, 27);

        btnAgregarGen.setText("jButton1");
        btnAgregarGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarGenActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarGen);
        btnAgregarGen.setBounds(570, 130, 20, 27);

        btnAgregarAut.setText("jButton1");
        btnAgregarAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarAut);
        btnAgregarAut.setBounds(290, 130, 20, 27);

        btnAgregarEdi.setText("jButton1");
        btnAgregarEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEdiActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarEdi);
        btnAgregarEdi.setBounds(650, 70, 20, 27);

        scrEditorial.setViewportView(lstEditorial);

        pnlCampos.add(scrEditorial);
        scrEditorial.setBounds(490, 100, 160, 10);

        scrAutor.setViewportView(lstAutor);

        pnlCampos.add(scrAutor);
        scrAutor.setBounds(60, 160, 230, 10);

        scrGenero.setViewportView(lstGenero);

        pnlCampos.add(scrGenero);
        scrGenero.setBounds(370, 160, 200, 10);
        pnlCampos.add(txtIdEdi);
        txtIdEdi.setBounds(450, 70, 40, 26);

        jLabel6.setText("ID");
        pnlCampos.add(jLabel6);
        jLabel6.setBounds(460, 50, 30, 16);
        pnlCampos.add(txtIdGen);
        txtIdGen.setBounds(330, 130, 40, 26);
        pnlCampos.add(txtIdAut);
        txtIdAut.setBounds(20, 130, 40, 26);

        jLabel7.setText("ID");
        pnlCampos.add(jLabel7);
        jLabel7.setBounds(30, 110, 30, 16);

        jLabel8.setText("ID");
        pnlCampos.add(jLabel8);
        jLabel8.setBounds(340, 110, 30, 16);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(0, 0, 700, 190);

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
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnELliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnELliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 190, 680, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        clases.Controlador.executeQuery("INSERT INTO libro (lib_nom, lib_isbn, edi_id, aut_id, gen_id) VALUES ('" + txtNombreLibro.getText() + 
                "', '" + txtISBN.getText() + 
                "', '" + txtIdEdi.getText() + 
                "', '" + txtIdAut.getText() + 
                "', '" + txtIdGen.getText() + "')");
        txtNombreLibro.setText("");
        txtISBN.setText("");
        txtEditorial.setText("");
        txtAutor.setText("");
        txtGenero.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnELliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnELliminarActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

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
    private javax.swing.JButton btnAgregarAut;
    private javax.swing.JButton btnAgregarEdi;
    private javax.swing.JButton btnAgregarGen;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnELliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
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
    private javax.swing.JList<String> lstAutor;
    private javax.swing.JList<String> lstEditorial;
    private javax.swing.JList<String> lstGenero;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JScrollPane scrAutor;
    private javax.swing.JScrollPane scrEditorial;
    private javax.swing.JScrollPane scrGenero;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtIdAut;
    private javax.swing.JTextField txtIdEdi;
    private javax.swing.JTextField txtIdGen;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
