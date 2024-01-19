package ventanas;

import javax.swing.table.DefaultTableModel;
import clases.Controlador;
import clases.Reporte;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Walter
 */
public class FrmGestionReportes extends javax.swing.JInternalFrame {

    
    private static Reporte reporte = new Reporte();
    DefaultTableModel tableModel = new DefaultTableModel();

    public FrmGestionReportes() {
        initComponents();
        setSize(605, 420);
        tableModel = Controlador.cargarJTable(tableModel, "SELECT\n"
                + "    l.lib_nom AS libro,\n"
                + "    c.cli_nom || ' ' || c.cli_ape AS cliente,\n"
                + "    e.est_fecha AS fecha,\n"
                + "    e.lib_est AS estado\n"
                + "FROM\n"
                + "    estado e\n"
                + "LEFT JOIN libro l ON e.lib_id = l.lib_id\n"
                + "LEFT JOIN cliente c ON e.cli_id = c.cli_id;");
        tblReporte.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        pnlBotonera = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnImprimir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();

        getContentPane().setLayout(null);

        pnlTabla.setLayout(null);

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Libro", "Cliente", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReporte.setEnabled(false);
        jScrollPane1.setViewportView(tblReporte);
        if (tblReporte.getColumnModel().getColumnCount() > 0) {
            tblReporte.getColumnModel().getColumn(0).setResizable(false);
            tblReporte.getColumnModel().getColumn(1).setResizable(false);
            tblReporte.getColumnModel().getColumn(4).setResizable(false);
        }

        pnlTabla.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 590, 300);

        getContentPane().add(pnlTabla);
        pnlTabla.setBounds(0, 0, 590, 300);

        pnlBotonera.setLayout(null);
        pnlBotonera.add(jSeparator1);
        jSeparator1.setBounds(257, 17, 0, 3);

        btnImprimir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\exportar.png")); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnImprimir);
        btnImprimir.setBounds(10, 0, 120, 50);
        pnlBotonera.add(jSeparator2);
        jSeparator2.setBounds(347, 17, 0, 3);

        btnSalir.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\JAVALPI\\FINALJAVA\\src\\assets\\inicio.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlBotonera.add(btnSalir);
        btnSalir.setBounds(450, 0, 130, 50);

        getContentPane().add(pnlBotonera);
        pnlBotonera.setBounds(0, 310, 590, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String path = "C:\\JAVALPI\\FINALJAVA\\src\\reporte\\reporte.jasper";
        JasperReport jr = null;
        try {
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, Controlador.getConnection());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
            jv.setTitle(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnlBotonera;
    private javax.swing.JPanel pnlTabla;
    public javax.swing.JTable tblReporte;
    // End of variables declaration//GEN-END:variables
}
