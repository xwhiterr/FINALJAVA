package ventanas;

import clases.BusquedaFuzzy;
import clases.Utils;

/**
 *
 * @author Walter
 */
public class FrmGestionLibros extends javax.swing.JInternalFrame {

    //Inicializa Motores de busqueda
    private static BusquedaFuzzy busqueda1 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda2 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda3 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda4 = new BusquedaFuzzy();

    public FrmGestionLibros() {
        initComponents();
        setSize(730, 310);
        clases.Utils.activarPanel(false, pnlCampos);
        clases.Utils.activarScrollList(false, pnlCampos);
        busqueda1.cerrarJListMouseExited(pnlCampos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotonera = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnELliminar = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        scrEditorial = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList<>();
        scrAutor = new javax.swing.JScrollPane();
        lstAutor = new javax.swing.JList<>();
        scrGenero = new javax.swing.JScrollPane();
        lstGenero = new javax.swing.JList<>();
        scrNombreLibro = new javax.swing.JScrollPane();
        lstNombreLibro = new javax.swing.JList<>();
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
        txtIdEdi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdGen = new javax.swing.JTextField();
        txtIdAut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdAut1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(655, 310));
        setMinimumSize(new java.awt.Dimension(655, 310));
        getContentPane().setLayout(null);

        btnBuscar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\buscar.png")); // NOI18N
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
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\guardar.png")); // NOI18N
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
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\inicio.png")); // NOI18N
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
        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\añadir.png")); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setMaximumSize(new java.awt.Dimension(100, 100));
        btnNuevo.setMinimumSize(new java.awt.Dimension(100, 100));
        btnNuevo.setNextFocusableComponent(txtNombreLibro);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnELliminar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnELliminar.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\eliminar.png")); // NOI18N
        btnELliminar.setText("ELIMINAR");
        btnELliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnELliminar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnELliminar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnELliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoneraLayout = new javax.swing.GroupLayout(pnlBotonera);
        pnlBotonera.setLayout(pnlBotoneraLayout);
        pnlBotoneraLayout.setHorizontalGroup(
            pnlBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnELliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlBotoneraLayout.setVerticalGroup(
            pnlBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnELliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBotonera);
        pnlBotonera.setBounds(10, 190, 700, 70);

        pnlCampos.setLayout(null);

        scrEditorial.setNextFocusableComponent(lstEditorial);

        lstEditorial.setNextFocusableComponent(txtAutor);
        lstEditorial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstEditorialFocusGained(evt);
            }
        });
        lstEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstEditorialKeyReleased(evt);
            }
        });
        scrEditorial.setViewportView(lstEditorial);

        pnlCampos.add(scrEditorial);
        scrEditorial.setBounds(490, 100, 160, 10);

        scrAutor.setNextFocusableComponent(lstAutor);

        lstAutor.setNextFocusableComponent(txtGenero);
        lstAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstAutorFocusGained(evt);
            }
        });
        lstAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstAutorKeyReleased(evt);
            }
        });
        scrAutor.setViewportView(lstAutor);

        pnlCampos.add(scrAutor);
        scrAutor.setBounds(60, 160, 230, 10);

        scrGenero.setNextFocusableComponent(lstGenero);

        lstGenero.setNextFocusableComponent(btnGuardar);
        lstGenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstGeneroFocusGained(evt);
            }
        });
        lstGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstGeneroKeyReleased(evt);
            }
        });
        scrGenero.setViewportView(lstGenero);

        pnlCampos.add(scrGenero);
        scrGenero.setBounds(370, 160, 200, 10);

        scrNombreLibro.setNextFocusableComponent(lstNombreLibro);

        lstNombreLibro.setNextFocusableComponent(txtISBN);
        lstNombreLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstNombreLibroFocusGained(evt);
            }
        });
        lstNombreLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstNombreLibroKeyReleased(evt);
            }
        });
        scrNombreLibro.setViewportView(lstNombreLibro);

        pnlCampos.add(scrNombreLibro);
        scrNombreLibro.setBounds(60, 100, 230, 10);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("Gestion de Libros");
        pnlCampos.add(jLabel9);
        jLabel9.setBounds(40, 10, 133, 28);

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del Libro");
        pnlCampos.add(jLabel1);
        jLabel1.setBounds(70, 50, 150, 17);

        txtNombreLibro.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtNombreLibro.setNextFocusableComponent(lstNombreLibro);
        txtNombreLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreLibroKeyReleased(evt);
            }
        });
        pnlCampos.add(txtNombreLibro);
        txtNombreLibro.setBounds(60, 70, 230, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setText("ISBN");
        pnlCampos.add(jLabel2);
        jLabel2.setBounds(280, 50, 80, 17);

        txtISBN.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtISBN.setNextFocusableComponent(txtEditorial);
        pnlCampos.add(txtISBN);
        txtISBN.setBounds(290, 70, 150, 27);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del autor");
        pnlCampos.add(jLabel3);
        jLabel3.setBounds(70, 110, 160, 17);

        txtAutor.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtAutor.setNextFocusableComponent(scrAutor);
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAutorKeyReleased(evt);
            }
        });
        pnlCampos.add(txtAutor);
        txtAutor.setBounds(60, 130, 230, 27);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Editorial");
        pnlCampos.add(jLabel4);
        jLabel4.setBounds(500, 50, 110, 17);

        txtEditorial.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtEditorial.setNextFocusableComponent(scrEditorial);
        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditorialKeyReleased(evt);
            }
        });
        pnlCampos.add(txtEditorial);
        txtEditorial.setBounds(490, 70, 160, 27);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Género");
        pnlCampos.add(jLabel5);
        jLabel5.setBounds(380, 110, 90, 17);

        txtGenero.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtGenero.setNextFocusableComponent(scrGenero);
        txtGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGeneroKeyReleased(evt);
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
        pnlCampos.add(txtIdAut1);
        txtIdAut1.setBounds(20, 70, 40, 26);

        jLabel10.setText("ID");
        pnlCampos.add(jLabel10);
        jLabel10.setBounds(30, 50, 30, 16);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(0, 0, 710, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        clases.Controlador.executeQuery("INSERT INTO libro (lib_nom, lib_isbn, edi_id, aut_id, gen_id) VALUES ('" + txtNombreLibro.getText()
                + "', '" + txtISBN.getText()
                + "', '" + txtIdEdi.getText()
                + "', '" + txtIdAut.getText()
                + "', '" + txtIdGen.getText() + "')");
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

    private void btnAgregarAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutActionPerformed
        Utils.abrirInternalFrame(new FrmGestionFuentes());
    }//GEN-LAST:event_btnAgregarAutActionPerformed

    private void btnAgregarEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEdiActionPerformed
        Utils.abrirInternalFrame(new FrmGestionFuentes());
    }//GEN-LAST:event_btnAgregarEdiActionPerformed

    private void btnAgregarGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarGenActionPerformed
        Utils.abrirInternalFrame(new FrmGestionFuentes());
    }//GEN-LAST:event_btnAgregarGenActionPerformed

    /*
        BLOQUE DE BUSQUEDA EDITORIAL
     */
    private void txtEditorialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialKeyReleased
        busqueda1.busqueda("edi_nom", "editorial", txtEditorial, scrEditorial, lstEditorial);
    }//GEN-LAST:event_txtEditorialKeyReleased

    private void lstEditorialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstEditorialFocusGained
        lstEditorial.setSelectedIndex(0);
    }//GEN-LAST:event_lstEditorialFocusGained

    private void lstEditorialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstEditorialKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda1.setText(txtEditorial, scrEditorial, lstEditorial);
        }
    }//GEN-LAST:event_lstEditorialKeyReleased

    /*
        BLOQUE DE BUSQUEDA AUTOR
     */
    private void txtAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyReleased
        busqueda2.busqueda("(aut_nom || ' ' || aut_ape)", "autor", txtAutor, scrAutor, lstAutor);
    }//GEN-LAST:event_txtAutorKeyReleased

    private void lstAutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstAutorFocusGained
        lstAutor.setSelectedIndex(0);
    }//GEN-LAST:event_lstAutorFocusGained

    private void lstAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstAutorKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda2.setText(txtAutor, scrAutor, lstAutor);
        }
    }//GEN-LAST:event_lstAutorKeyReleased

    /*
        BLOQUE DE BUSQUEDA GENERO
     */
    private void txtGeneroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneroKeyReleased
        busqueda3.busqueda("gen_desc", "genero", txtGenero, scrGenero, lstGenero);
    }//GEN-LAST:event_txtGeneroKeyReleased

    private void lstGeneroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstGeneroFocusGained
        lstGenero.setSelectedIndex(0);
    }//GEN-LAST:event_lstGeneroFocusGained

    private void lstGeneroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstGeneroKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda3.setText(txtGenero, scrGenero, lstGenero);
        }
    }//GEN-LAST:event_lstGeneroKeyReleased

    /*
        BLOQUE DE BUSQUEDA GENERO
     */
    private void lstNombreLibroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstNombreLibroFocusGained
        lstNombreLibro.setSelectedIndex(0);
    }//GEN-LAST:event_lstNombreLibroFocusGained

    private void lstNombreLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstNombreLibroKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda4.setText(txtNombreLibro, scrNombreLibro, lstNombreLibro);
        }
    }//GEN-LAST:event_lstNombreLibroKeyReleased

    private void txtNombreLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreLibroKeyReleased
        busqueda4.busqueda("lib_nom", "libro", txtNombreLibro, scrNombreLibro, lstNombreLibro);
    }//GEN-LAST:event_txtNombreLibroKeyReleased


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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> lstAutor;
    private javax.swing.JList<String> lstEditorial;
    private javax.swing.JList<String> lstGenero;
    private javax.swing.JList<String> lstNombreLibro;
    private javax.swing.JPanel pnlBotonera;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JScrollPane scrAutor;
    private javax.swing.JScrollPane scrEditorial;
    private javax.swing.JScrollPane scrGenero;
    private javax.swing.JScrollPane scrNombreLibro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtIdAut;
    private javax.swing.JTextField txtIdAut1;
    private javax.swing.JTextField txtIdEdi;
    private javax.swing.JTextField txtIdGen;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
