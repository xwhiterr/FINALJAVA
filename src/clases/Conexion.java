package clases;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexion {

    public static Connection conexion;
    public static Statement statement;

    public static boolean conectar() {
        
        File db = new File("data/db.sqlite");
        String path = db.getAbsolutePath();
        
        /* Intentamos la conexion. si falla, damos error.
           Retorna true si la conexion fue exitosa
           Retorna false si la conexion fallo
         */
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:" + path);
            statement = conexion.createStatement();
            return true;
        } catch (Exception ex) {
            System.err.println(ex + "\n" + ex.getStackTrace());
            return false;
        }
    }
}
