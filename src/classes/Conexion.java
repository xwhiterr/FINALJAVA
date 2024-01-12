package classes;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Conexion {

    public static Connection conexion = null;
    static Statement statement;
    static String retorno;
    static ResultSet rs;

    public static boolean conectar() {
        String rutaAbsoluta = new File("data/db.sqlite").getPath();

        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:" + rutaAbsoluta);

            statement = conexion.createStatement();
            System.out.println("SELECT * FROM pais");
            rs = statement.executeQuery("SELECT * FROM pais");

            //System.out.println(rs.);
            if (rs.next()) { // Avanzar al primer registro
                while (rs.next()) {
                    retorno = rs.getString("pai_desc");
                    System.out.println(retorno);
                }
            }

            return true;
        } catch (Exception ex) {
            System.err.println(ex);
            return false;
        }

    }

    public static boolean TestDeDB() {

        try {
            Statement statement = conexion.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            System.out.println("true");
            return true;

        } catch (Exception e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println("No se conecto a la base de datos");
            System.err.println(e.getMessage());
            System.out.println("false");
            return false;
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        conectar();
    }
}
