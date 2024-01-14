package ventanas;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;

/**
 *
 * @author Walter
 */
public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        pswContraseña = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSaludo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(434, 630));
        getContentPane().setLayout(null);

        txtUsuario.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(120, 400, 198, 27);

        pswContraseña.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        pswContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pswContraseña);
        pswContraseña.setBounds(120, 480, 198, 27);

        lblUsuario.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("INGRESE SU USUARIO");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(120, 360, 198, 17);

        btnIngresar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(160, 530, 120, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\BIBLIOTECA\\src\\assets\\account.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 20, 316, 256);

        lblSaludo.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        lblSaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaludo.setText("BIENVENIDO");
        getContentPane().add(lblSaludo);
        lblSaludo.setBounds(120, 290, 198, 50);

        lblContraseña.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContraseña.setText("INGRESE SU CONTRASEÑA");
        getContentPane().add(lblContraseña);
        lblContraseña.setBounds(120, 440, 201, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        dispose();
    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatCarbonIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
