package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    public static Connection conexion;
    public static Statement statement;

    public static boolean conectar() {


        String path = "/home/caches/Documents/UTIC/LPT1/FINALJAVA/data/db.sqlite";
        /* Intentamos la conexion. si falla, damos error.
           Retorna true si la conexion fue exitosa
           Retorna false si la conexion fallo
         */
        try {
            try {
            if (statement != null) {
                statement.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            conexion = DriverManager.getConnection("jdbc:sqlite:" + path);
            statement = conexion.createStatement();
            System.out.println("CONEXION " + conexion.isValid(1000));
            return true;
        } catch (Exception ex) {
            System.err.println(ex + "\n" + ex.getStackTrace());
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(conectar());
        
    }
}
