package ventanas;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;

/**
 *
 * @author Walter
 */
public class FrmGestionClientes extends javax.swing.JFrame {

    /**
     * Creates new form RegistroClientes
     */
    public FrmGestionClientes() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(631, 360));
        setMinimumSize(new java.awt.Dimension(631, 360));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese Nombre(s)");
        jLabel2.setFocusCycleRoot(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 50, 218, 17);

        jTextField1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jTextField1.setFocusCycleRoot(true);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 70, 218, 27);

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese Nro de C.I.");
        jLabel3.setFocusCycleRoot(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 50, 110, 17);

        jTextField3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jTextField3.setFocusCycleRoot(true);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(480, 70, 120, 27);

        jLabel4.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese Dirección");
        jLabel4.setFocusCycleRoot(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 170, 130, 17);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel5.setText("Ingrese Apellido(s)");
        jLabel5.setFocusCycleRoot(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 50, 218, 17);

        jTextField5.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jTextField5.setFocusCycleRoot(true);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(250, 70, 218, 27);

        jLabel6.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel6.setText("Ingrese Nro de Contacto");
        jLabel6.setFocusCycleRoot(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 110, 218, 17);

        jTextField6.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jTextField6.setFocusCycleRoot(true);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(30, 130, 218, 27);

        jLabel7.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel7.setText("Barrio");
        jLabel7.setFocusCycleRoot(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(430, 110, 50, 17);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel8.setText("Ciudad");
        jLabel8.setFocusCycleRoot(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 110, 150, 20);

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

        jButton4.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jButton4.setText("EDITAR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(110, 0, 110, 60);

        jButton5.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jButton5.setText("GUARDAR");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton5.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(330, 0, 110, 60);

        jButton6.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jButton6.setText("SALIR");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton6.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(460, 0, 110, 60);

        jButton7.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jButton7.setText("AGREGAR");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton7.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(0, 0, 110, 60);

        jButton8.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        jButton8.setText("ELIMINAR");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton8.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(220, 0, 110, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 240, 570, 60);

        jTextField4.setFocusCycleRoot(true);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(430, 130, 170, 26);

        jTextField7.setFocusCycleRoot(true);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(250, 130, 180, 26);

        jTextField8.setFocusCycleRoot(true);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(30, 190, 570, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatCarbonIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
