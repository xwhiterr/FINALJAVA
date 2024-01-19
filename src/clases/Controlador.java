package clases;

import static clases.Conexion.conectar;
import static clases.Conexion.statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador {

    /**
     * Getter del objeto conexion.
     *
     * @return Retorna un objeto {@code Connection} o {@code null} si falla la
     * conexion.
     */
    public static Connection getConnection() {
        if (Conexion.conectar()) {
            return Conexion.conexion;
        } else {
            System.err.println("err getConnection: CONEXION FALLIDA");
            return null;
        }
    }

    /**
     * Getter del objeto statement.
     *
     * @return Retorna un objeto {@code Statement} o {@code null} si falla la
     * conexion.
     */
    public static Statement getStatement() {
        if (Conexion.conectar()) {
            return Conexion.statement;
        } else {
            System.err.println("err getStatement: CONEXION FALLIDA");
            return null;
        }
    }

    /**
     * Ejecuta una instruccion SQL.
     *
     * @param query Toma un {@code String} SQL y lo ejecuta en la base de datos.
     */
    public static void executeQuery(String query) {
        Statement statement = null;
        try {
            statement = getStatement();
            System.out.println(query);
            statement.execute(query);
            JOptionPane.showMessageDialog(null, "Registro agregado");
        } catch (Exception ex) {
            System.err.println("err actualizar: Error SQL" + ex + "\n" + ex.getCause());
            JOptionPane.showMessageDialog(null, "Se infringe la integridad de datos");
        }
    }

    public static ResultSet consultar(String cadenaSQL) {
        ResultSet rs = null;
        Conexion conectar = new Conexion();
        conectar();
        try {
            rs = statement.executeQuery(cadenaSQL);
            System.out.println(statement);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public static DefaultTableModel cargarJTable(DefaultTableModel tablaAuxiliar, String cadenaSQL) {
        ResultSet rs = null;
        tablaAuxiliar.setRowCount(0);
        tablaAuxiliar.setColumnCount(0);
        try {
            rs = consultar(cadenaSQL);
            if (rs != null) {
                int nCol = rs.getMetaData().getColumnCount();
                for (int n = 1; n <= nCol; n++) { //nombre de columnas
                    tablaAuxiliar.addColumn(rs.getMetaData().getColumnName(n).toUpperCase());
                }
                while (rs.next()) {
                    Object[] fila = new Object[nCol];
                    for (int o = 1; o <= nCol; o++) { //agregando filas encontradas
                        fila[o - 1] = rs.getObject(o);
                    }
                    tablaAuxiliar.addRow(fila);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return tablaAuxiliar;
    }

}
