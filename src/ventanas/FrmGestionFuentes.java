package ventanas;

import clases.BusquedaFuzzy;
import clases.Controlador;
import clases.Utils;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Walter
 */
public class FrmGestionFuentes extends javax.swing.JInternalFrame {

    // Inicializa Motores de busqueda
    private static BusquedaFuzzy busqueda1 = new BusquedaFuzzy();

    // Variables para cargar campos
    private static ResultSet rs;
    private static Statement statement;

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
        scrPais = new javax.swing.JScrollPane();
        lstPais = new javax.swing.JList<>();
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
        txtPaisId = new javax.swing.JTextField();
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
        lblEditorial.setBounds(40, 20, 240, 30);

        txtEditorial.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        pnlEditorial.add(txtEditorial);
        txtEditorial.setBounds(30, 50, 250, 25);

        BotoneraEditorial.setLayout(null);

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
        BotoneraEditorial.add(btnGuardar1);
        btnGuardar1.setBounds(0, 0, 140, 60);

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
        BotoneraEditorial.add(btnSalir1);
        btnSalir1.setBounds(380, 0, 140, 60);

        pnlEditorial.add(BotoneraEditorial);
        BotoneraEditorial.setBounds(30, 130, 520, 60);

        tabInfoLibros.addTab("Editorial", pnlEditorial);

        pnlGenero.setLayout(null);

        lblGenero.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblGenero.setText("Ingrese Genero");
        pnlGenero.add(lblGenero);
        lblGenero.setBounds(40, 20, 230, 30);

        txtGenero.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        pnlGenero.add(txtGenero);
        txtGenero.setBounds(30, 50, 250, 25);

        BotoneraGenero.setLayout(null);

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
        BotoneraGenero.add(btnGuardar2);
        btnGuardar2.setBounds(0, 0, 140, 60);

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
        BotoneraGenero.add(btnSalir2);
        btnSalir2.setBounds(380, 0, 140, 60);

        pnlGenero.add(BotoneraGenero);
        BotoneraGenero.setBounds(30, 130, 540, 60);

        tabInfoLibros.addTab("Genero", pnlGenero);

        pnlAutor.setLayout(null);

        lstPais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstPaisFocusGained(evt);
            }
        });
        lstPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstPaisKeyReleased(evt);
            }
        });
        scrPais.setViewportView(lstPais);

        pnlAutor.add(scrPais);
        scrPais.setBounds(470, 130, 130, 10);

        lblAutor.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblAutor.setText("Ingrese Autor");
        pnlAutor.add(lblAutor);
        lblAutor.setBounds(30, 20, 98, 19);

        txtNombre.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        pnlAutor.add(txtNombre);
        txtNombre.setBounds(10, 90, 205, 30);

        BotoneraAutor.setLayout(null);

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
        BotoneraAutor.add(BtnGuardar);
        BtnGuardar.setBounds(6, 0, 116, 60);

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
        BotoneraAutor.add(btnSalir);
        btnSalir.setBounds(450, 0, 115, 60);

        pnlAutor.add(BotoneraAutor);
        BotoneraAutor.setBounds(20, 140, 580, 60);

        txtPais.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaisKeyReleased(evt);
            }
        });
        pnlAutor.add(txtPais);
        txtPais.setBounds(470, 90, 130, 31);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        pnlAutor.add(jLabel2);
        jLabel2.setBounds(20, 70, 190, 20);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");
        pnlAutor.add(jLabel3);
        jLabel3.setBounds(230, 70, 180, 20);

        jLabel6.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jLabel6.setText("Pais");
        pnlAutor.add(jLabel6);
        jLabel6.setBounds(480, 70, 40, 20);

        txtApellido.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        pnlAutor.add(txtApellido);
        txtApellido.setBounds(220, 90, 190, 31);

        txtPaisId.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtPaisId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaisIdKeyReleased(evt);
            }
        });
        pnlAutor.add(txtPaisId);
        txtPaisId.setBounds(420, 90, 50, 31);

        jLabel5.setText("ID");
        pnlAutor.add(jLabel5);
        jLabel5.setBounds(440, 60, 30, 40);

        tabInfoLibros.addTab("Autor", pnlAutor);

        getContentPane().add(tabInfoLibros);
        tabInfoLibros.setBounds(0, 0, 630, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar1btnGuaPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1btnGuaPaiActionPerformed
        if (Utils.condicionalGuardar(pnlEditorial)) {
            clases.Controlador.executeQuery("INSERT INTO editorial (edi_nom) VALUES ( '" + txtEditorial.getText() + "')");
            txtEditorial.setText("");
        }
    }//GEN-LAST:event_btnGuardar1btnGuaPaiActionPerformed

    private void btnSalir1btnSaliPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1btnSaliPaiActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir1btnSaliPaiActionPerformed

    private void btnGuardar2btnGuaPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2btnGuaPaiActionPerformed
        if (Utils.condicionalGuardar(pnlGenero)) {
            clases.Controlador.executeQuery("INSERT INTO genero (gen_desc) VALUES ( '" + txtGenero.getText() + "')");
            txtGenero.setText("");
        }
    }//GEN-LAST:event_btnGuardar2btnGuaPaiActionPerformed

    private void btnSalir2btnSaliPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2btnSaliPaiActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir2btnSaliPaiActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (Utils.condicionalGuardar(pnlAutor)) {
            clases.Controlador.executeQuery("INSERT INTO autor (aut_nom, aut_ape, pai_id) VALUES ('" + txtNombre.getText()
                    + "', '" + txtApellido.getText()
                    + "', '" + txtPaisId.getText() + "');");
            txtNombre.setText("");
            txtApellido.setText("");
            txtPaisId.setText("");
            txtPais.setText("");
        }

    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void txtPaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisKeyReleased
        busqueda1.busqueda("pai_desc", "pais", txtPais, scrPais, lstPais);
    }//GEN-LAST:event_txtPaisKeyReleased

    private void lstPaisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstPaisFocusGained
        lstPais.setSelectedIndex(0);
    }//GEN-LAST:event_lstPaisFocusGained

    private void lstPaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstPaisKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            busqueda1.setText(txtPais, scrPais, lstPais);
            try {
                statement = Controlador.getStatement();
                rs = statement.executeQuery("SELECT * FROM pais WHERE pai_desc = '" + txtPais.getText() + "'");
                txtPaisId.setText(rs.getString("pai_id"));
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_lstPaisKeyReleased

    private void txtPaisIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisIdKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                statement = Controlador.getStatement();
                rs = statement.executeQuery("SELECT * FROM pais WHERE pai_id = '" + txtPaisId.getText() + "'");
                txtPais.setText(rs.getString("pai_desc"));
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_txtPaisIdKeyReleased


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
    private javax.swing.JList<String> lstPais;
    private javax.swing.JPanel pnlAutor;
    private javax.swing.JPanel pnlEditorial;
    private javax.swing.JPanel pnlGenero;
    private javax.swing.JScrollPane scrPais;
    private javax.swing.JTabbedPane tabInfoLibros;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPaisId;
    // End of variables declaration//GEN-END:variables
}
