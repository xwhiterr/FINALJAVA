package clases;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Controlador {
    
        /**
         * Getter del objeto conexion.
         * 
         * @return Retorna un objeto {@code Connection} o {@code null} si falla la conexion.
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
         * @return Retorna un objeto {@code Statement} o {@code null} si falla la conexion.
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
     public static void executeQuery(String query){
         Statement statement = null;
            try{
            statement = getStatement();
            System.out.println(query);
            statement.execute(query);
            JOptionPane.showMessageDialog(null, "Registro agregado");
            }
            catch (Exception ex){
                System.err.println("err actualizar: Error SQL" + ex + "\n" + ex.getCause() );
                JOptionPane.showMessageDialog(null, "Se infringe la integridad de datos");
            }  
    }
    
}