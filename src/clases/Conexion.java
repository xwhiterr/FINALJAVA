package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexion {

    public static Connection conexion;
    public static Statement statement;

    public static boolean conectar() {

        /* Intentamos la conexion. si falla, damos error.
           Retorna true si la conexion fue exitosa
           Retorna false si la conexion fallo
         */
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:/home/caches/Documents/UTIC/LPT1/FINALJAVA/data/Chinook.db");
            statement = conexion.createStatement();
            return true;
        } catch (Exception ex) {
            System.err.println(ex);
            return false;
        }
    }

}
