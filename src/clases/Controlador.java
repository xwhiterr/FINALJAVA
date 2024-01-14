package clases;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Controlador {

    public static Connection getConnection() {
        if (Conexion.conectar()) {
            return Conexion.conexion;
        } else {
            System.err.println("err getConnection: CONEXION FALLIDA");
            return null;
        }
    }

    public static Statement getStatement() {
        if (Conexion.conectar()) {
            return Conexion.statement;
        } else {
            System.err.println("err getStatement: CONEXION FALLIDA");
            return null;
        }
    }
        /**
         * Este metodo Agrega nueva informacion a la base de datos
         * 
         */
     public static void actualizar(String query){
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

