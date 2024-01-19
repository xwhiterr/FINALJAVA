package ventanas;

import clases.BusquedaFuzzy;
import clases.Controlador;
import clases.Utils;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Walter
 */
public class FrmGestionLibros extends javax.swing.JInternalFrame {

    private static boolean banderaNuevo = false;

    //Inicializa Motores de busqueda
    private static BusquedaFuzzy busqueda1 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda2 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda3 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda4 = new BusquedaFuzzy();

    // Variables para cargar campos
    private static ResultSet rs;
    private static Statement statement;
    private static String query;

    public FrmGestionLibros() {
        initComponents();
        setSize(730, 310);
        clases.Utils.activarPanel(false, pnlCampos);
        clases.Utils.activarScrollList(false, pnlCampos);
        busqueda1.cerrarJListMouseExited(pnlCampos);
        txtLibroId.setEnabled(false);
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
        btnCancelar = new javax.swing.JButton();
        txtLibroId = new javax.swing.JTextField();
        pnlCampos = new javax.swing.JPanel();
        scrEditorial = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList<>();
        scrAutor = new javax.swing.JScrollPane();
        lstAutor = new javax.swing.JList<>();
        scrGenero = new javax.swing.JScrollPane();
        lstGenero = new javax.swing.JList<>();
        scrLibro = new javax.swing.JScrollPane();
        lstLibro = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLibro = new javax.swing.JTextField();
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
        txtEditorialId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGeneroId = new javax.swing.JTextField();
        txtAutorId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(655, 310));
        setMinimumSize(new java.awt.Dimension(655, 310));
        getContentPane().setLayout(null);

        pnlBotonera.setLayout(null);

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
        pnlBotonera.add(btnBuscar);
        btnBuscar.setBounds(210, 0, 100, 60);

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
        pnlBotonera.add(btnGuardar);
        btnGuardar.setBounds(110, 0, 100, 60);

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
        pnlBotonera.add(btnSalir);
        btnSalir.setBounds(570, 0, 100, 60);

        btnNuevo.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setMaximumSize(new java.awt.Dimension(100, 100));
        btnNuevo.setMinimumSize(new java.awt.Dimension(100, 100));
        btnNuevo.setNextFocusableComponent(txtLibro);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnNuevo);
        btnNuevo.setBounds(10, 0, 100, 60);

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
        pnlBotonera.add(btnELliminar);
        btnELliminar.setBounds(310, 0, 100, 60);

        btnCancelar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnCancelar);
        btnCancelar.setBounds(410, 0, 100, 60);

        getContentPane().add(pnlBotonera);
        pnlBotonera.setBounds(10, 200, 690, 60);

        txtLibroId.setNextFocusableComponent(txtLibro);
        txtLibroId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLibroIdKeyReleased(evt);
            }
        });
        getContentPane().add(txtLibroId);
        txtLibroId.setBounds(20, 70, 40, 24);

        pnlCampos.setLayout(null);

        scrEditorial.setNextFocusableComponent(txtAutorId);

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
        scrEditorial.setBounds(500, 100, 160, 10);

        scrAutor.setNextFocusableComponent(lstAutor);

        lstAutor.setNextFocusableComponent(txtGeneroId);
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

        scrLibro.setNextFocusableComponent(lstLibro);

        lstLibro.setNextFocusableComponent(txtISBN);
        lstLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstLibroFocusGained(evt);
            }
        });
        lstLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstLibroKeyReleased(evt);
            }
        });
        scrLibro.setViewportView(lstLibro);

        pnlCampos.add(scrLibro);
        scrLibro.setBounds(60, 100, 230, 10);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("Gestion de Libros");
        pnlCampos.add(jLabel9);
        jLabel9.setBounds(40, 10, 133, 28);

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del Libro");
        pnlCampos.add(jLabel1);
        jLabel1.setBounds(70, 50, 150, 20);

        txtLibro.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtLibro.setNextFocusableComponent(lstLibro);
        txtLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLibroKeyReleased(evt);
            }
        });
        pnlCampos.add(txtLibro);
        txtLibro.setBounds(60, 70, 230, 21);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setText("ISBN");
        pnlCampos.add(jLabel2);
        jLabel2.setBounds(300, 50, 80, 20);

        txtISBN.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtISBN.setNextFocusableComponent(txtEditorialId);
        pnlCampos.add(txtISBN);
        txtISBN.setBounds(290, 70, 150, 21);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del autor");
        pnlCampos.add(jLabel3);
        jLabel3.setBounds(70, 110, 160, 20);

        txtAutor.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtAutor.setNextFocusableComponent(lstAutor);
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAutorKeyReleased(evt);
            }
        });
        pnlCampos.add(txtAutor);
        txtAutor.setBounds(60, 130, 230, 21);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Editorial");
        pnlCampos.add(jLabel4);
        jLabel4.setBounds(510, 50, 110, 20);

        txtEditorial.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtEditorial.setNextFocusableComponent(lstEditorial);
        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditorialKeyReleased(evt);
            }
        });
        pnlCampos.add(txtEditorial);
        txtEditorial.setBounds(500, 70, 160, 21);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Género");
        pnlCampos.add(jLabel5);
        jLabel5.setBounds(380, 110, 90, 20);

        txtGenero.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtGenero.setNextFocusableComponent(lstGenero);
        txtGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGeneroKeyReleased(evt);
            }
        });
        pnlCampos.add(txtGenero);
        txtGenero.setBounds(370, 130, 200, 21);

        btnAgregarGen.setText("jButton1");
        btnAgregarGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarGenActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarGen);
        btnAgregarGen.setBounds(570, 130, 20, 24);

        btnAgregarAut.setText("jButton1");
        btnAgregarAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarAut);
        btnAgregarAut.setBounds(290, 130, 20, 24);

        btnAgregarEdi.setText("jButton1");
        btnAgregarEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEdiActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarEdi);
        btnAgregarEdi.setBounds(660, 70, 20, 24);

        txtEditorialId.setNextFocusableComponent(txtEditorial);
        txtEditorialId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditorialIdKeyReleased(evt);
            }
        });
        pnlCampos.add(txtEditorialId);
        txtEditorialId.setBounds(460, 70, 40, 24);

        jLabel6.setText("ID");
        pnlCampos.add(jLabel6);
        jLabel6.setBounds(470, 50, 30, 18);

        txtGeneroId.setNextFocusableComponent(txtGenero);
        txtGeneroId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGeneroIdKeyReleased(evt);
            }
        });
        pnlCampos.add(txtGeneroId);
        txtGeneroId.setBounds(330, 130, 40, 24);

        txtAutorId.setNextFocusableComponent(txtAutor);
        txtAutorId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAutorIdKeyReleased(evt);
            }
        });
        pnlCampos.add(txtAutorId);
        txtAutorId.setBounds(20, 130, 40, 24);

        jLabel7.setText("ID");
        pnlCampos.add(jLabel7);
        jLabel7.setBounds(30, 110, 30, 18);

        jLabel8.setText("ID");
        pnlCampos.add(jLabel8);
        jLabel8.setBounds(340, 110, 30, 18);

        jLabel10.setText("ID");
        pnlCampos.add(jLabel10);
        jLabel10.setBounds(30, 50, 30, 18);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(0, 0, 710, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(true);
        banderaNuevo = false;
        clases.Utils.activarPanel(true, pnlCampos);
        txtLibroId.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Utils.condicionalGuardar(pnlCampos)) {
            clases.Controlador.executeQuery("INSERT INTO libro (lib_nom, lib_isbn, edi_id, aut_id, gen_id) VALUES ('" + txtLibro.getText()
                    + "', '" + txtISBN.getText()
                    + "', '" + txtEditorialId.getText()
                    + "', '" + txtAutorId.getText()
                    + "', '" + txtGeneroId.getText() + "')");

            btnNuevo.setEnabled(true);
            btnBuscar.setEnabled(true);
            banderaNuevo = false;
            clases.Utils.activarPanel(false, pnlCampos);
            Utils.limpiarPanel(pnlCampos);
            txtLibroId.setText("");
            txtLibroId.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        busqueda1.reset();
        busqueda2.reset();
        busqueda3.reset();
        busqueda4.reset();
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnNuevo.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(true);
        banderaNuevo = true;
        clases.Utils.activarPanel(true, pnlCampos);
        txtLibroId.setText("");
        txtLibroId.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnELliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELliminarActionPerformed
        Controlador.executeQuery("DELETE FROM libro where lib_id = '" + txtLibroId.getText() + "'");
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(true);
        banderaNuevo = false;
        clases.Utils.activarPanel(false, pnlCampos);
        Utils.limpiarPanel(pnlCampos);
        txtLibroId.setText("");
        txtLibroId.setEnabled(false);
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
            try {
                statement = Controlador.getStatement();
                rs = statement.executeQuery("SELECT * FROM editorial WHERE edi_nom = '" + txtEditorial.getText() + "'");
                txtEditorialId.setText(rs.getString("edi_id"));
            } catch (Exception e) {
                e.getStackTrace();
            }
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
            try {
                statement = Controlador.getStatement();
                rs = statement.executeQuery("SELECT * FROM autor WHERE aut_nom = '" + txtAutor.getText().split(" ")[0] + "'");
                txtAutorId.setText(rs.getString("aut_id"));
            } catch (Exception e) {
                e.getStackTrace();
            }
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
            try {
                statement = Controlador.getStatement();
                rs = statement.executeQuery("SELECT * FROM genero WHERE gen_desc = '" + txtGenero.getText() + "'");
                txtGeneroId.setText(rs.getString("gen_id"));
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_lstGeneroKeyReleased

    /*
        BLOQUE DE BUSQUEDA LIBRO
     */
    private void txtLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLibroKeyReleased
        if (banderaNuevo == false) {
            busqueda4.busqueda("lib_nom", "libro", txtLibro, scrLibro, lstLibro);
        }
    }//GEN-LAST:event_txtLibroKeyReleased

    private void lstLibroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstLibroFocusGained
        lstLibro.setSelectedIndex(0);
    }//GEN-LAST:event_lstLibroFocusGained

    private void lstLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstLibroKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda4.setText(txtLibro, scrLibro, lstLibro);
            cargarCampos("txtLibro", txtLibro);
        }
    }//GEN-LAST:event_lstLibroKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(true);
        banderaNuevo = false;
        clases.Utils.activarPanel(false, pnlCampos);
        Utils.limpiarPanel(pnlCampos);
        txtLibroId.setText("");
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtLibroIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLibroIdKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cargarCampos("txtLibroId", txtLibroId);
        }
    }//GEN-LAST:event_txtLibroIdKeyReleased

    private void txtEditorialIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialIdKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                statement = Controlador.getStatement();
                rs = statement.executeQuery("SELECT * FROM editorial WHERE edi_id = '" + txtEditorialId.getText() + "'");
                txtEditorial.setText(rs.getString("edi_nom"));
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_txtEditorialIdKeyReleased

    private void txtAutorIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorIdKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                statement = Controlador.getStatement();
                rs = statement.executeQuery("SELECT * FROM autor WHERE aut_id = '" + txtAutorId.getText() + "'");
                txtAutor.setText(rs.getString("aut_nom") + ' ' + rs.getString("aut_ape"));
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_txtAutorIdKeyReleased

    private void txtGeneroIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneroIdKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                statement = Controlador.getStatement();
                rs = statement.executeQuery("SELECT * FROM genero WHERE gen_id = '" + txtGeneroId.getText() + "'");
                txtGenero.setText(rs.getString("gen_desc"));
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_txtGeneroIdKeyReleased
    

    private void cargarCampos(String cajaTexto, JTextField txtText) {
        try {
            rs = null;
            statement = Controlador.getStatement();
            System.out.println(txtText.getText());
            query = txtText.getText();

            if (cajaTexto == "txtLibro") {
                rs = statement.executeQuery("SELECT * FROM v_libro WHERE lib_nom = '" + query + "'");
            }

            if (cajaTexto == "txtLibroId") {
                rs = statement.executeQuery("SELECT * FROM v_libro WHERE lib_id = '" + query + "'");
            }

            if (rs.next()) {
                // DEBUG
                System.out.println("gen_desc: " + rs.getString("gen_desc"));
                System.out.println("gen_id: " + rs.getString("gen_id"));
                System.out.println("aut_nom_ape: " + rs.getString("aut_nom") + ' ' + rs.getString("aut_ape"));
                System.out.println("aut_id: " + rs.getString("aut_id"));
                System.out.println("edi_nom: " + rs.getString("edi_nom"));
                System.out.println("edi_id: " + rs.getString("edi_id"));
                System.out.println("lib_isbn: " + rs.getString("lib_isbn"));
                System.out.println("lib_nom: " + rs.getString("lib_nom"));
                System.out.println("lib_id: " + rs.getString("lib_id"));
                // DEBUG

                txtGenero.setText(rs.getString("gen_desc"));
                txtGeneroId.setText(rs.getString("gen_id"));
                txtAutor.setText(rs.getString("aut_nom") + ' ' + rs.getString("aut_ape"));
                txtAutorId.setText(rs.getString("aut_id"));
                txtEditorial.setText(rs.getString("edi_nom"));
                txtEditorialId.setText(rs.getString("edi_id"));
                txtISBN.setText(rs.getString("lib_isbn"));
                txtLibro.setText(rs.getString("lib_nom"));
                txtLibroId.setText(rs.getString("lib_id"));
            }

        } catch (Exception e) {
            System.err.println("Nombre err: Error SQL\n" + e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAut;
    private javax.swing.JButton btnAgregarEdi;
    private javax.swing.JButton btnAgregarGen;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
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
    private javax.swing.JList<String> lstLibro;
    private javax.swing.JPanel pnlBotonera;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JScrollPane scrAutor;
    private javax.swing.JScrollPane scrEditorial;
    private javax.swing.JScrollPane scrGenero;
    private javax.swing.JScrollPane scrLibro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAutorId;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEditorialId;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtGeneroId;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtLibroId;
    // End of variables declaration//GEN-END:variables
}
