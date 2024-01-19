package ventanas;

import clases.BusquedaFuzzy;
import clases.Utils;
import javax.swing.JDesktopPane;
import clases.Utils;

/**
 *
 * @author Walter
 */

public class FrmGestionAlquiler extends javax.swing.JInternalFrame {

    private static JDesktopPane desktopPane;
    Utils funciones = new Utils();

    //Inicializa Motores de busqueda
    private static BusquedaFuzzy busqueda1 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda2 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda3 = new BusquedaFuzzy();

    public FrmGestionAlquiler() {
        initComponents();
        setSize(680, 370);
        clases.Utils.activarPanel(false, pnlCampos);
        clases.Utils.activarScrollList(false, pnlCampos);
        busqueda1.cerrarJListMouseExited(pnlCampos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlTitulo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlBotonera = new javax.swing.JPanel();
        btnEntregar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        scrCi = new javax.swing.JScrollPane();
        lstCi = new javax.swing.JList<>();
        scrCliente = new javax.swing.JScrollPane();
        lstcliente = new javax.swing.JList<>();
        scrLibro = new javax.swing.JScrollPane();
        lstLibro = new javax.swing.JList<>();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        calFecha = new com.toedter.calendar.JDateChooser();
        btnAgregarCliente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        txtIdLibro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jButton1.setText("jButton1");

        getContentPane().setLayout(null);

        pnlTitulo.setLayout(null);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel3.setText("Gestion de Alquiler");
        pnlTitulo.add(jLabel3);
        jLabel3.setBounds(50, 0, 220, 30);

        getContentPane().add(pnlTitulo);
        pnlTitulo.setBounds(0, 0, 520, 40);

        pnlBotonera.setLayout(null);

        btnEntregar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnEntregar.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\entregar.png")); // NOI18N
        btnEntregar.setText("ENTREGAR");
        btnEntregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntregar.setIconTextGap(2);
        btnEntregar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEntregar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnEntregar);
        btnEntregar.setBounds(120, 0, 130, 60);

        btnRecibir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnRecibir.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\recibir.png")); // NOI18N
        btnRecibir.setText("RECIBIR");
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnRecibir);
        btnRecibir.setBounds(250, 0, 120, 61);

        btnNuevo.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\añadir.png")); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setIconTextGap(2);
        btnNuevo.setNextFocusableComponent(txtCi);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnNuevo);
        btnNuevo.setBounds(0, 0, 120, 60);

        btnCancelar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\cerrar.png")); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnCancelar);
        btnCancelar.setBounds(370, 0, 130, 60);

        Salir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\inicio.png")); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        pnlBotonera.add(Salir);
        Salir.setBounds(530, 0, 120, 60);

        getContentPane().add(pnlBotonera);
        pnlBotonera.setBounds(10, 240, 660, 60);

        pnlCampos.setEnabled(false);
        pnlCampos.setLayout(null);

        lstCi.setNextFocusableComponent(txtNombreCliente);
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
        scrCi.setBounds(20, 50, 110, 10);

        lstcliente.setNextFocusableComponent(txtIdLibro);
        lstcliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstclienteFocusGained(evt);
            }
        });
        lstcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstclienteKeyReleased(evt);
            }
        });
        scrCliente.setViewportView(lstcliente);

        pnlCampos.add(scrCliente);
        scrCliente.setBounds(180, 50, 290, 10);

        lstLibro.setNextFocusableComponent(calFecha);
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
        scrLibro.setBounds(60, 110, 330, 10);

        txtNombreCliente.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtNombreCliente.setNextFocusableComponent(lstcliente);
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyReleased(evt);
            }
        });
        pnlCampos.add(txtNombreCliente);
        txtNombreCliente.setBounds(180, 20, 290, 27);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel2.setText("Libro");
        pnlCampos.add(jLabel2);
        jLabel2.setBounds(70, 60, 160, 17);

        txtCi.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtCi.setNextFocusableComponent(lstCi);
        txtCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiKeyReleased(evt);
            }
        });
        pnlCampos.add(txtCi);
        txtCi.setBounds(20, 20, 110, 27);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel4.setText("Fecha ");
        pnlCampos.add(jLabel4);
        jLabel4.setBounds(30, 120, 40, 17);

        txtNombreLibro.setNextFocusableComponent(lstLibro);
        txtNombreLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreLibroKeyReleased(evt);
            }
        });
        pnlCampos.add(txtNombreLibro);
        txtNombreLibro.setBounds(60, 80, 330, 26);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel5.setText("Cliente");
        pnlCampos.add(jLabel5);
        jLabel5.setBounds(180, 0, 180, 17);

        calFecha.setNextFocusableComponent(btnEntregar);
        pnlCampos.add(calFecha);
        calFecha.setBounds(20, 140, 140, 26);

        btnAgregarCliente.setText("jButton1");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarCliente);
        btnAgregarCliente.setBounds(470, 20, 20, 27);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel8.setText("Empleado");
        pnlCampos.add(jLabel8);
        jLabel8.setBounds(230, 120, 120, 20);

        txtEstado.setEditable(false);
        pnlCampos.add(txtEstado);
        txtEstado.setBounds(400, 80, 60, 26);

        txtIdCliente.setEditable(false);
        txtIdCliente.setNextFocusableComponent(txtNombreCliente);
        pnlCampos.add(txtIdCliente);
        txtIdCliente.setBounds(140, 20, 40, 26);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel9.setText(" Ci");
        pnlCampos.add(jLabel9);
        jLabel9.setBounds(30, 0, 30, 17);

        jLabel10.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel10.setText("ID");
        pnlCampos.add(jLabel10);
        jLabel10.setBounds(150, 0, 20, 17);

        txtEmpleado.setEditable(false);
        pnlCampos.add(txtEmpleado);
        txtEmpleado.setBounds(220, 140, 180, 26);

        txtIdLibro.setNextFocusableComponent(txtNombreLibro);
        pnlCampos.add(txtIdLibro);
        txtIdLibro.setBounds(20, 80, 40, 26);

        jLabel7.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel7.setText("ID");
        pnlCampos.add(jLabel7);
        jLabel7.setBounds(30, 60, 20, 17);

        jLabel11.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel11.setText("Estado");
        pnlCampos.add(jLabel11);
        jLabel11.setBounds(410, 60, 50, 20);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(0, 40, 670, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        clases.Controlador.executeQuery("INSERT INTO estado (cli_id, lib_id, lib_est, est_fecha) VALUES ('" + txtIdCliente.getText()
                + "', '" + txtIdLibro.getText()
                + "', 'O"
                + "', '" + funciones.convertirFecha(calFecha) + "')");
        txtCi.setText("");
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtIdLibro.setText("");
        txtNombreLibro.setText("");
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        clases.Controlador.executeQuery("INSERT INTO estado (cli_id, lib_id, lib_est, est_fecha) VALUES ('" + txtIdCliente.getText()
                + "', '" + txtIdLibro.getText()
                + "', 'I"
                + "', '" + funciones.convertirFecha(calFecha) + "')");
        txtCi.setText("");
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtIdLibro.setText("");
        txtNombreLibro.setText("");
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clases.Utils.activarPanel(false, pnlCampos);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Utils.abrirInternalFrame(new FrmGestionClientes());
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    /*
        BLOQUE DE BUSQUEDA CI
     */
    private void txtCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiKeyReleased
        busqueda1.busqueda("cli_ci", "cliente", txtCi, scrCi, lstCi);
    }//GEN-LAST:event_txtCiKeyReleased

    private void lstCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstCiKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda1.setText(txtCi, scrCi, lstCi);
        }
    }//GEN-LAST:event_lstCiKeyReleased

    private void lstCiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstCiFocusGained
        lstCi.setSelectedIndex(0);
    }//GEN-LAST:event_lstCiFocusGained

    /*
        BLOQUE DE BUSQUEDA NOMBRE CLIENTE
     */
    private void txtNombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyReleased
        busqueda2.busqueda("(cli_nom || ' ' || cli_ape)", "cliente", txtNombreCliente, scrCliente, lstcliente);
    }//GEN-LAST:event_txtNombreClienteKeyReleased

    private void lstclienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstclienteFocusGained
        lstcliente.setSelectedIndex(0);
    }//GEN-LAST:event_lstclienteFocusGained

    private void lstclienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstclienteKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda2.setText(txtNombreCliente, scrCliente, lstcliente);
        }
    }//GEN-LAST:event_lstclienteKeyReleased

    /*
        BLOQUE DE BUSQUEDA NOMBRE LIBRO
     */
    private void txtNombreLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreLibroKeyReleased
        busqueda3.busqueda("lib_nom", "libro", txtNombreLibro, scrLibro, lstLibro);
    }//GEN-LAST:event_txtNombreLibroKeyReleased

    private void lstLibroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstLibroFocusGained
        lstLibro.setSelectedIndex(0);
    }//GEN-LAST:event_lstLibroFocusGained

    private void lstLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstLibroKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda3.setText(txtNombreLibro, scrLibro, lstLibro);
        }
    }//GEN-LAST:event_lstLibroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRecibir;
    private com.toedter.calendar.JDateChooser calFecha;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JList<String> lstCi;
    private javax.swing.JList<String> lstLibro;
    private javax.swing.JList<String> lstcliente;
    private javax.swing.JPanel pnlBotonera;
    private static javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JScrollPane scrCi;
    private javax.swing.JScrollPane scrCliente;
    private javax.swing.JScrollPane scrLibro;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
