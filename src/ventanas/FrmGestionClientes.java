package ventanas;

import clases.Utils;
import clases.BusquedaFuzzy;
import java.awt.KeyboardFocusManager;
import java.util.Set;
import javax.swing.JInternalFrame;

public class FrmGestionClientes extends javax.swing.JInternalFrame {

    private static boolean banderaNuevo = false;

    // Inicializa motores de busqueda
    private static BusquedaFuzzy busqueda1 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda2 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda3 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda4 = new BusquedaFuzzy();

    public FrmGestionClientes() {
        initComponents();
        setTitle("Gestion de Clientes");
        setSize(800, 350);

        clases.Utils.activarPanel(false, pnlCampos);
        clases.Utils.activarScrollList(false, pnlCampos);
        busqueda1.attachFocusLostListener(pnlCampos, txtNombre, scrNombre, lstNombre);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCampos = new javax.swing.JPanel();
        scrBarrio = new javax.swing.JScrollPane();
        lstBarrio = new javax.swing.JList<>();
        scrNombre = new javax.swing.JScrollPane();
        lstNombre = new javax.swing.JList<>();
        scrCi = new javax.swing.JScrollPane();
        lstCi = new javax.swing.JList<>();
        scrCiudad = new javax.swing.JScrollPane();
        lstCiudad = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnAgregarCiudad = new javax.swing.JButton();
        btnAgregarBarrio = new javax.swing.JButton();
        txtContacto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCiudadId = new javax.swing.JTextField();
        txtBarrio = new javax.swing.JTextField();
        txtBarrioId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        getContentPane().setLayout(null);

        pnlCampos.setLayout(null);

        lstBarrio.setNextFocusableComponent(txtDireccion);
        lstBarrio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstBarrioFocusGained(evt);
            }
        });
        lstBarrio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstBarrioKeyReleased(evt);
            }
        });
        scrBarrio.setViewportView(lstBarrio);

        pnlCampos.add(scrBarrio);
        scrBarrio.setBounds(560, 140, 160, 10);

        lstNombre.setNextFocusableComponent(txtApellido);
        lstNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstNombreFocusGained(evt);
            }
        });
        lstNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstNombreKeyReleased(evt);
            }
        });
        scrNombre.setViewportView(lstNombre);

        pnlCampos.add(scrNombre);
        scrNombre.setBounds(170, 80, 290, 10);

        lstCi.setNextFocusableComponent(txtNombre);
        lstCi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstCiFocusGained(evt);
            }
        });
        lstCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstCiKeyReleased(evt);
            }
        });
        scrCi.setViewportView(lstCi);

        pnlCampos.add(scrCi);
        scrCi.setBounds(30, 80, 120, 10);

        lstCiudad.setNextFocusableComponent(txtBarrioId);
        lstCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstCiudadFocusGained(evt);
            }
        });
        lstCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstCiudadKeyReleased(evt);
            }
        });
        scrCiudad.setViewportView(lstCiudad);

        pnlCampos.add(scrCiudad);
        scrCiudad.setBounds(310, 140, 160, 10);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setText("Nombre(s)");
        jLabel2.setFocusCycleRoot(true);
        pnlCampos.add(jLabel2);
        jLabel2.setBounds(180, 30, 140, 20);

        txtNombre.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtNombre.setFocusCycleRoot(true);
        txtNombre.setNextFocusableComponent(lstNombre);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        pnlCampos.add(txtNombre);
        txtNombre.setBounds(170, 50, 290, 21);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Nro de C.I.");
        jLabel3.setFocusCycleRoot(true);
        pnlCampos.add(jLabel3);
        jLabel3.setBounds(40, 30, 110, 20);

        txtCi.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtCi.setFocusCycleRoot(true);
        txtCi.setNextFocusableComponent(lstCi);
        txtCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiKeyReleased(evt);
            }
        });
        pnlCampos.add(txtCi);
        txtCi.setBounds(30, 50, 120, 21);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Dirección");
        jLabel4.setFocusCycleRoot(true);
        pnlCampos.add(jLabel4);
        jLabel4.setBounds(40, 150, 130, 20);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Apellido(s)");
        jLabel5.setFocusCycleRoot(true);
        pnlCampos.add(jLabel5);
        jLabel5.setBounds(470, 30, 80, 20);

        txtCiudad.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtCiudad.setFocusCycleRoot(true);
        txtCiudad.setNextFocusableComponent(lstCiudad);
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiudadKeyReleased(evt);
            }
        });
        pnlCampos.add(txtCiudad);
        txtCiudad.setBounds(310, 110, 160, 21);

        jLabel6.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel6.setText("Nro de Contacto");
        jLabel6.setFocusCycleRoot(true);
        pnlCampos.add(jLabel6);
        jLabel6.setBounds(40, 90, 218, 20);

        jLabel7.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel7.setText("Barrio");
        jLabel7.setFocusCycleRoot(true);
        pnlCampos.add(jLabel7);
        jLabel7.setBounds(570, 90, 50, 20);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel8.setText("ID");
        jLabel8.setFocusCycleRoot(true);
        pnlCampos.add(jLabel8);
        jLabel8.setBounds(530, 90, 60, 20);

        txtDireccion.setFocusCycleRoot(true);
        txtDireccion.setNextFocusableComponent(btnGuardar);
        pnlCampos.add(txtDireccion);
        txtDireccion.setBounds(30, 170, 720, 24);

        btnAgregarCiudad.setText("jButton1");
        btnAgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCiudadActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarCiudad);
        btnAgregarCiudad.setBounds(470, 110, 30, 20);

        btnAgregarBarrio.setText("jButton2");
        btnAgregarBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBarrioActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarBarrio);
        btnAgregarBarrio.setBounds(720, 110, 30, 20);

        txtContacto.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtContacto.setFocusCycleRoot(true);
        txtContacto.setNextFocusableComponent(txtCiudadId);
        pnlCampos.add(txtContacto);
        txtContacto.setBounds(30, 110, 218, 21);

        jLabel10.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel10.setText("Ciudad");
        jLabel10.setFocusCycleRoot(true);
        pnlCampos.add(jLabel10);
        jLabel10.setBounds(330, 90, 150, 20);

        jLabel11.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel11.setText("ID");
        jLabel11.setFocusCycleRoot(true);
        pnlCampos.add(jLabel11);
        jLabel11.setBounds(280, 90, 60, 20);

        txtApellido.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtApellido.setFocusCycleRoot(true);
        txtApellido.setNextFocusableComponent(txtContacto);
        pnlCampos.add(txtApellido);
        txtApellido.setBounds(460, 50, 290, 21);

        txtCiudadId.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtCiudadId.setFocusCycleRoot(true);
        txtCiudadId.setNextFocusableComponent(txtCiudad);
        pnlCampos.add(txtCiudadId);
        txtCiudadId.setBounds(260, 110, 50, 21);

        txtBarrio.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtBarrio.setFocusCycleRoot(true);
        txtBarrio.setNextFocusableComponent(lstBarrio);
        txtBarrio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarrioKeyReleased(evt);
            }
        });
        pnlCampos.add(txtBarrio);
        txtBarrio.setBounds(560, 110, 160, 21);

        txtBarrioId.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtBarrioId.setFocusCycleRoot(true);
        txtBarrioId.setNextFocusableComponent(txtBarrio);
        pnlCampos.add(txtBarrioId);
        txtBarrioId.setBounds(510, 110, 50, 21);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(0, 0, 760, 230);

        jPanel1.setFocusCycleRoot(true);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel9.setText("Gestion de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 2, 570, 30);

        jPanel2.setFocusCycleRoot(true);
        jPanel2.setLayout(null);

        btnBuscar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnBuscar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnBuscar.setNextFocusableComponent(txtCi);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(190, 0, 100, 60);

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
        jPanel2.add(btnSalir);
        btnSalir.setBounds(610, 0, 110, 60);

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
        jPanel2.add(btnGuardar);
        btnGuardar.setBounds(90, 0, 100, 60);

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
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(290, 0, 100, 60);

        btnNuevo.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setNextFocusableComponent(txtCi);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo);
        btnNuevo.setBounds(0, 0, 90, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 240, 720, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        clases.Utils.activarPanel(true, pnlCampos);
        KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        clases.Controlador.executeQuery("INSERT INTO cliente (cli_ci, cli_nom, cli_ape, cli_tel, ciu_id, bar_id, cli_dire) VALUES ('" + txtCi.getText()
                + "', '" + txtNombre.getText()
                + "', '" + txtCiudad.getText()
                + "', '" + txtContacto.getText()
                + "', '" + txtCiudad.getText()
                + "', '" + txtCiudadId.getText()
                + "', '" + txtDireccion.getText() + "');");
        txtNombre.setText("");
        txtCiudad.setText("");
        txtCi.setText("");
        txtCiudad.setText("");
        txtCiudadId.setText("");
        txtContacto.setText("");
        txtDireccion.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCiudadActionPerformed
        Utils.abrirInternalFrame(new FrmGestionReferenciales());
    }//GEN-LAST:event_btnAgregarCiudadActionPerformed

    private void btnAgregarBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBarrioActionPerformed
        Utils.abrirInternalFrame(new FrmGestionReferenciales());
    }//GEN-LAST:event_btnAgregarBarrioActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        banderaNuevo = true;
        clases.Utils.activarPanel(true, pnlCampos);
        KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
    }//GEN-LAST:event_btnNuevoActionPerformed
    /*
        BLOQUE DE BUSQUEDA NOMBRE
     */
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (banderaNuevo == false) {
            busqueda1.busqueda("(cli_nom || ' ' || cli_ape)", "cliente", txtNombre, scrNombre, lstNombre);
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void lstNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstNombreFocusGained
        lstNombre.setSelectedIndex(0);
    }//GEN-LAST:event_lstNombreFocusGained

    private void lstNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstNombreKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda1.setText(txtNombre, scrNombre, lstNombre);
        }
    }//GEN-LAST:event_lstNombreKeyReleased
    /*
        BLOQUE DE BUSQUEDA CI
     */
    private void txtCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiKeyReleased
        busqueda2.busqueda("cli_ci", "cliente", txtCi, scrCi, lstCi);
    }//GEN-LAST:event_txtCiKeyReleased

    private void lstCiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstCiFocusGained
        lstCi.setSelectedIndex(0);
    }//GEN-LAST:event_lstCiFocusGained

    private void lstCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstCiKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda2.setText(txtCi, scrCi, lstCi);
        }
    }//GEN-LAST:event_lstCiKeyReleased
    /*
        BLOQUE DE BUSQUEDA CIUDAD
     */
    private void txtCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyReleased
        busqueda3.busqueda("ciu_desc", "ciudad", txtCiudad, scrCiudad, lstCiudad);
    }//GEN-LAST:event_txtCiudadKeyReleased

    private void lstCiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstCiudadFocusGained
        lstCiudad.setSelectedIndex(0);
    }//GEN-LAST:event_lstCiudadFocusGained

    private void lstCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstCiudadKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda3.setText(txtCiudad, scrCiudad, lstCiudad);
        }
    }//GEN-LAST:event_lstCiudadKeyReleased
    /*
        BLOQUE DE BUSQUEDA BARRIO
     */
    private void txtBarrioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarrioKeyReleased
        busqueda4.busqueda("bar_desc", "barrio", txtBarrio, scrBarrio, lstBarrio);
    }//GEN-LAST:event_txtBarrioKeyReleased

    private void lstBarrioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstBarrioFocusGained
        lstBarrio.setSelectedIndex(0);
    }//GEN-LAST:event_lstBarrioFocusGained

    private void lstBarrioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstBarrioKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda4.setText(txtBarrio, scrBarrio, lstBarrio);
        }
    }//GEN-LAST:event_lstBarrioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBarrio;
    private javax.swing.JButton btnAgregarCiudad;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList<String> lstBarrio;
    private static javax.swing.JList<String> lstCi;
    private javax.swing.JList<String> lstCiudad;
    private static javax.swing.JList<String> lstNombre;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JScrollPane scrBarrio;
    private javax.swing.JScrollPane scrCi;
    private javax.swing.JScrollPane scrCiudad;
    private javax.swing.JScrollPane scrNombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtBarrioId;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCiudadId;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
