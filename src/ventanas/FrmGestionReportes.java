package ventanas;

/**
 *
 * @author Walter
 */
public class FrmGestionReportes extends javax.swing.JInternalFrame {

    public FrmGestionReportes() {
        initComponents();
        setSize(605, 420);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tglEstado = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnImprimir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 590, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 300);

        jPanel2.setLayout(null);

        tglEstado.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        tglEstado.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\entregar.png")); // NOI18N
        tglEstado.setText("Alquilados");
        tglEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglEstadoActionPerformed(evt);
            }
        });
        jPanel2.add(tglEstado);
        tglEstado.setBounds(10, 0, 130, 50);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(257, 17, 0, 3);

        btnImprimir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\exportar.png")); // NOI18N
        btnImprimir.setText("Imprimir");
        jPanel2.add(btnImprimir);
        btnImprimir.setBounds(230, 0, 120, 50);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(347, 17, 0, 3);

        btnSalir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\inicio.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir);
        btnSalir.setBounds(450, 0, 130, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 310, 590, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tglEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglEstadoActionPerformed
        if (tglEstado.isSelected()) {
            tglEstado.setText("Disponibles");
        } else {
            tglEstado.setText("Alquilados");
        }
    }//GEN-LAST:event_tglEstadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton tglEstado;
    // End of variables declaration//GEN-END:variables
}
