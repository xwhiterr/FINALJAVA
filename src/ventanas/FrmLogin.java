package ventanas;

import ventanas.FrmMdi;
import clases.Utils;
import clases.Controlador;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter
 */

public class FrmLogin extends javax.swing.JFrame {

    private static int envVarUsuarioId;
    private static String user;
    private static char[] password;
    // :)
    private static String passwordString;
    
    //login
    private static ResultSet rs;
    private static Statement statement;

    public FrmLogin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCampos = new javax.swing.JPanel();
        lblSaludo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        pswContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(434, 630));
        getContentPane().setLayout(null);

        pnlCampos.setLayout(null);

        lblSaludo.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblSaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaludo.setText("BIENVENIDO");
        pnlCampos.add(lblSaludo);
        lblSaludo.setBounds(120, 290, 198, 50);

        lblContraseña.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContraseña.setText("INGRESE SU CONTRASEÑA");
        pnlCampos.add(lblContraseña);
        lblContraseña.setBounds(120, 440, 201, 16);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlCampos.add(jLabel1);
        jLabel1.setBounds(60, 20, 316, 0);

        btnIngresar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlCampos.add(btnIngresar);
        btnIngresar.setBounds(160, 530, 120, 50);

        lblUsuario.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("INGRESE SU USUARIO");
        pnlCampos.add(lblUsuario);
        lblUsuario.setBounds(120, 360, 198, 15);

        pswContraseña.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        pswContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCampos.add(pswContraseña);
        pswContraseña.setBounds(120, 480, 198, 21);

        txtUsuario.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlCampos.add(txtUsuario);
        txtUsuario.setBounds(120, 400, 198, 21);

        getContentPane().add(pnlCampos);
        pnlCampos.setBounds(0, 0, 430, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (Utils.condicionalGuardar(pnlCampos)) {
            user = txtUsuario.getText();
            password = pswContraseña.getPassword();
            passwordString = new String(password);

            try {
                statement = Controlador.getStatement();
                rs = statement.executeQuery("SELECT * FROM empleado WHERE emp_usu = '" + user + "'");
                envVarUsuarioId = rs.getInt("emp_id");

                if (passwordString.equals(rs.getString("emp_pass"))) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new FrmMdi(envVarUsuarioId).setVisible(true);
                        }
                    });
                    dispose();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    FlatCarbonIJTheme.setup();

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
