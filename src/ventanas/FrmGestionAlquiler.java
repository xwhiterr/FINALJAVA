package ventanas;

import ventanas.FrmMdi;
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
public class FrmGestionAlquiler extends javax.swing.JInternalFrame {

    private static boolean banderaNuevo = false;

    // Inicializa Motores de busqueda
    private static BusquedaFuzzy busqueda1 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda2 = new BusquedaFuzzy();
    private static BusquedaFuzzy busqueda3 = new BusquedaFuzzy();

    // Variables para cargar campos
    private static ResultSet rs;
    private static Statement statement;
    private static String query;

    public FrmGestionAlquiler() {
        initComponents();
        setSize(680, 370);
        clases.Utils.activarPanel(false, pnlCampos);
        clases.Utils.activarScrollList(false, pnlCampos);
        busqueda1.cerrarJListMouseExited(pnlCampos);

        //Setea empleado conectado
        txtEmpleado.setText(FrmMdi.getEmpleado());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlTitulo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtClienteId = new javax.swing.JTextField();
        pnlBotonera = new javax.swing.JPanel();
        btnEntregar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        scrCi = new javax.swing.JScrollPane();
        lstCi = new javax.swing.JList<>();
        scrCliente = new javax.swing.JScrollPane();
        lstCliente = new javax.swing.JList<>();
        scrLibro = new javax.swing.JScrollPane();
        lstLibro = new javax.swing.JList<>();
        txtCliente = new javax.swing.JTextField();
        txtLibro = new javax.swing.JTextField();
        calFecha = new com.toedter.calendar.JDateChooser();
        txtEstado = new javax.swing.JTextField();
        txtEmpleado = new javax.swing.JTextField();
        txtLibroId = new javax.swing.JTextField();
        txtCi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAgregarCliente = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jButton1.setText("jButton1");

        getContentPane().setLayout(null);

        pnlTitulo.setLayout(null);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        jLabel3.setText("Gestion de Alquiler");
        pnlTitulo.add(jLabel3);
        jLabel3.setBounds(120, 0, 220, 30);

        getContentPane().add(pnlTitulo);
        pnlTitulo.setBounds(0, 0, 590, 40);

        txtClienteId.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtClienteId.setNextFocusableComponent(lstCi);
        getContentPane().add(txtClienteId);
        txtClienteId.setBounds(40, 10, 30, 20);

        pnlBotonera.setLayout(null);

        btnEntregar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
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
        btnRecibir.setText("RECIBIR");
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnRecibir);
        btnRecibir.setBounds(250, 0, 120, 61);

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
        pnlBotonera.add(btnCancelar);
        btnCancelar.setBounds(370, 0, 130, 60);

        Salir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        pnlBotonera.add(Salir);
        Salir.setBounds(530, 0, 120, 60);

        btnNuevo.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setIconTextGap(2);
        btnNuevo.setNextFocusableComponent(txtClienteId);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnNuevo);
        btnNuevo.setBounds(0, 0, 120, 60);

        getContentPane().add(pnlBotonera);
        pnlBotonera.setBounds(10, 240, 660, 60);

        pnlCampos.setEnabled(false);
        pnlCampos.setLayout(null);

        lstCi.setNextFocusableComponent(txtCliente);
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
        scrCi.setBounds(120, 50, 110, 10);

        lstCliente.setNextFocusableComponent(txtLibroId);
        lstCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstClienteFocusGained(evt);
            }
        });
        lstCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstClienteKeyReleased(evt);
            }
        });
        scrCliente.setViewportView(lstCliente);

        pnlCampos.add(scrCliente);
        scrCliente.setBounds(250, 50, 300, 10);

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
        scrLibro.setBounds(180, 110, 330, 10);

        txtCliente.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtCliente.setNextFocusableComponent(lstCliente);
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteKeyReleased(evt);
            }
        });
        pnlCampos.add(txtCliente);
        txtCliente.setBounds(250, 20, 300, 21);

        txtLibro.setNextFocusableComponent(lstLibro);
        txtLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLibroKeyReleased(evt);
            }
        });
        pnlCampos.add(txtLibro);
        txtLibro.setBounds(180, 80, 330, 24);

        calFecha.setNextFocusableComponent(btnEntregar);
        pnlCampos.add(calFecha);
        calFecha.setBounds(120, 140, 140, 24);

        txtEstado.setEditable(false);
        pnlCampos.add(txtEstado);
        txtEstado.setBounds(510, 80, 60, 24);

        txtEmpleado.setEditable(false);
        pnlCampos.add(txtEmpleado);
        txtEmpleado.setBounds(390, 140, 180, 24);

        txtLibroId.setNextFocusableComponent(txtLibro);
        txtLibroId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLibroIdKeyReleased(evt);
            }
        });
        pnlCampos.add(txtLibroId);
        txtLibroId.setBounds(120, 80, 40, 24);

        txtCi.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtCi.setNextFocusableComponent(lstCi);
        txtCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiKeyReleased(evt);
            }
        });
        pnlCampos.add(txtCi);
        txtCi.setBounds(120, 20, 110, 21);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel2.setText("Libro");
        pnlCampos.add(jLabel2);
        jLabel2.setBounds(190, 60, 160, 20);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel4.setText("Fecha ");
        pnlCampos.add(jLabel4);
        jLabel4.setBounds(130, 120, 40, 20);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel5.setText("Cliente");
        pnlCampos.add(jLabel5);
        jLabel5.setBounds(260, 0, 180, 20);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel8.setText("Empleado");
        pnlCampos.add(jLabel8);
        jLabel8.setBounds(400, 120, 120, 20);

        jLabel9.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel9.setText(" Ci");
        pnlCampos.add(jLabel9);
        jLabel9.setBounds(130, 0, 30, 20);

        jLabel7.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel7.setText("ID");
        pnlCampos.add(jLabel7);
        jLabel7.setBounds(130, 60, 20, 20);

        jLabel11.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel11.setText("Estado");
        pnlCampos.add(jLabel11);
        jLabel11.setBounds(520, 60, 50, 20);

        btnAgregarCliente.setText("jButton1");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        pnlCampos.add(btnAgregarCliente);
        btnAgregarCliente.setBounds(550, 20, 20, 24);

        btnBuscar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setIconTextGap(2);
        btnBuscar.setNextFocusableComponent(txtClienteId);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlCampos.add(btnBuscar);
        btnBuscar.setBounds(10, 140, 90, 50);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(0, 40, 670, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        txtEstado.setText("O");
        if (Utils.condicionalGuardar(pnlCampos)) {
            Controlador.executeQuery("INSERT INTO estado (cli_id, lib_id, lib_est, est_fecha) VALUES ('" + txtClienteId.getText()
                    + "', '" + txtLibroId.getText()
                    + "', 'O"
                    + "', '" + calFecha.getDate() + "')");

            btnNuevo.setEnabled(true);
            btnBuscar.setEnabled(true);
            banderaNuevo = false;
            clases.Utils.activarPanel(false, pnlCampos);
            Utils.limpiarPanel(pnlCampos);

            // :))))
            txtEmpleado.setText(FrmMdi.getEmpleado());
        } else {
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
        }
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        txtEstado.setText("I");
        if (Utils.condicionalGuardar(pnlCampos)) {
            Controlador.executeQuery("INSERT INTO estado (cli_id, lib_id, lib_est, est_fecha) VALUES ('" + txtClienteId.getText()
                    + "', '" + txtLibroId.getText()
                    + "', 'I"
                    + "', '" + calFecha.getDate() + "')");

            btnNuevo.setEnabled(true);
            btnBuscar.setEnabled(true);
            banderaNuevo = false;
            clases.Utils.activarPanel(false, pnlCampos);
            Utils.limpiarPanel(pnlCampos);

            // :))))
            txtEmpleado.setText(FrmMdi.getEmpleado());
        } else {
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
        }
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(false);
        banderaNuevo = false;
        clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(true);
        banderaNuevo = false;
        clases.Utils.activarPanel(false, pnlCampos);
        Utils.limpiarPanel(pnlCampos);

        // :))))
        txtEmpleado.setText(FrmMdi.getEmpleado());
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        busqueda1.reset();
        busqueda2.reset();
        busqueda3.reset();
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Utils.abrirInternalFrame(new FrmGestionClientes());
    }//GEN-LAST:event_btnAgregarClienteActionPerformed
    /*
        BLOQUE DE BUSQUEDA CI CLIENTE
     */
    private void txtCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiKeyReleased
        busqueda1.busqueda("cli_ci", "cliente", txtCi, scrCi, lstCi);

    }//GEN-LAST:event_txtCiKeyReleased
    private void lstCiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstCiFocusGained
        lstCi.setSelectedIndex(0);
    }//GEN-LAST:event_lstCiFocusGained
    private void lstCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstCiKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda1.setText(txtCi, scrCi, lstCi);

            if (banderaNuevo == false) {
                cargarCampos("txtCi", txtCi);

            } else {
                try {
                    statement = Controlador.getStatement();
                    rs = statement.executeQuery("SELECT * FROM vestado WHERE cli_id = '" + txtCi.getText() + "' order by est_id desc");
                    System.out.println("cli_nom: " + rs.getString("cli_nom"));
                    System.out.println("cli_ape: " + rs.getString("cli_ape"));
                    txtCliente.setText(rs.getString("cli_nom") + ' ' + rs.getString("cli_ape"));
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }

        }
    }//GEN-LAST:event_lstCiKeyReleased

    /*
        BLOQUE DE BUSQUEDA NOMBRE CLIENTE
     */
    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
        busqueda2.busqueda("(cli_nom || ' ' || cli_ape)", "cliente", txtCliente, scrCliente, lstCliente);
    }//GEN-LAST:event_txtClienteKeyReleased

    private void lstClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstClienteFocusGained
        lstCliente.setSelectedIndex(0);
    }//GEN-LAST:event_lstClienteFocusGained

    private void lstClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstClienteKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda2.setText(txtCliente, scrCliente, lstCliente);

            if (banderaNuevo == false) {
                cargarCampos("txtCliente", txtCliente);

            } else {
                try {
                    statement = Controlador.getStatement();
                    rs = statement.executeQuery("SELECT * FROM vestado WHERE cli_nom = '" + txtCliente.getText().split(" ")[0] + "' order by est_id desc");
                    txtCi.setText(rs.getString("cli_ci"));
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        }
    }//GEN-LAST:event_lstClienteKeyReleased

    /*
        BLOQUE DE BUSQUEDA NOMBRE LIBRO
     */
    private void txtLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLibroKeyReleased
        busqueda3.busqueda("lib_nom", "libro", txtLibro, scrLibro, lstLibro);
    }//GEN-LAST:event_txtLibroKeyReleased

    private void lstLibroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstLibroFocusGained
        lstLibro.setSelectedIndex(0);
    }//GEN-LAST:event_lstLibroFocusGained

    private void lstLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstLibroKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda3.setText(txtLibro, scrLibro, lstLibro);

            if (banderaNuevo == false) {
                cargarCampos("txtLibro", txtLibro);
            } else {
                try {
                    statement = Controlador.getStatement();
                    rs = statement.executeQuery("SELECT * FROM vestado WHERE lib_nom = '" + txtLibro.getText() + "' order by est_id desc");
                    txtLibroId.setText(rs.getString("lib_id"));
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }

        }
    }//GEN-LAST:event_lstLibroKeyReleased


    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnNuevo.setEnabled(false);
        btnBuscar.setEnabled(true);
        banderaNuevo = true;
        clases.Utils.activarPanel(true, pnlCampos);
    }//GEN-LAST:event_btnNuevoActionPerformed

    /*
        SETEO DE LIBRO ID
     */
    private void txtLibroIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLibroIdKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {

            if (banderaNuevo == false) {
                cargarCampos("txtLibroId", txtLibroId);
            } else {
                try {
                    statement = Controlador.getStatement();
                    rs = statement.executeQuery("SELECT * FROM vestado WHERE lib_id = '" + txtLibroId.getText() + "' order by est_id desc");
                    txtLibro.setText(rs.getString("lib_nom"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }//GEN-LAST:event_txtLibroIdKeyReleased
    private void cargarCampos(String cajaTexto, JTextField txtText) {
        try {
            rs = null;
            statement = Controlador.getStatement();
            System.out.println(txtText.getText());
            query = txtText.getText();

            if (cajaTexto == "txtCliente") {
                query = txtCliente.getText().split(" ")[0];
                rs = statement.executeQuery("SELECT * FROM vestado WHERE cli_nom = '" + query + "' order by est_id desc");
            }
            if (cajaTexto == "txtCi") {
                rs = statement.executeQuery("SELECT * FROM vestado WHERE cli_ci = '" + query + "' order by est_id desc");
            }
            if (cajaTexto == "txtLibroId") {
                rs = statement.executeQuery("SELECT * FROM vestado WHERE lib_id = '" + query + "' order by est_id desc");
            }
            if (cajaTexto == "txtLibro") {
                rs = statement.executeQuery("SELECT * FROM vestado WHERE lib_nom = '" + query + "' order by est_id desc");
            }

            if (rs.next()) {
                //DEBUG
                System.out.println("lib_est: " + rs.getString("lib_est"));
                System.out.println("est_fecha: " + rs.getString("est_fecha"));
                System.out.println("emp_nom: " + rs.getString("emp_nom"));
                System.out.println("emp_ape: " + rs.getString("emp_ape"));
                System.out.println("cli_nom: " + rs.getString("cli_nom"));
                System.out.println("cli_ape: " + rs.getString("cli_ape"));
                System.out.println("lib_id: " + rs.getString("lib_id"));
                System.out.println("lib_nom: " + rs.getString("lib_nom"));
                System.out.println("cli_ci: " + rs.getString("cli_ci"));
                //DEBUG

                txtEstado.setText(rs.getString("lib_est"));
                calFecha.setDateFormatString(rs.getString("est_fecha"));
                txtEmpleado.setText(rs.getString("emp_nom") + ' ' + rs.getString("emp_ape"));
                txtCliente.setText(rs.getString("cli_nom") + ' ' + rs.getString("cli_ape"));
                txtLibroId.setText(rs.getString("lib_id"));
                txtLibro.setText(rs.getString("lib_nom"));
                txtCi.setText(rs.getString("cli_ci"));
            }

        } catch (Exception e) {
            System.err.println("Nombre err: Error SQL\n" + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRecibir;
    private com.toedter.calendar.JDateChooser calFecha;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JList<String> lstCliente;
    private javax.swing.JList<String> lstLibro;
    private javax.swing.JPanel pnlBotonera;
    private static javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JScrollPane scrCi;
    private javax.swing.JScrollPane scrCliente;
    private javax.swing.JScrollPane scrLibro;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtLibroId;
    // End of variables declaration//GEN-END:variables
}
