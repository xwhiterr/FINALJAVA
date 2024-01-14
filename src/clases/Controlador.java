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
    
     public void actualizar(String nomtabla, String parametros){
         Statement statement = null;
         String query;
            try{
            statement = getStatement();
            query = "CALL " +nomtabla+ "(" + parametros + ")";
            statement.execute(query);
            JOptionPane.showMessageDialog(null, "Registro fue insertado");
            }
            catch (Exception ex){
                System.err.println("err actualizar: Error SQL" + ex );
            }  
    }
    
}
