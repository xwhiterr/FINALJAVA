/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author caches
 */
public class Controlador {
    Conexion conexionLocal = new Conexion();
    Statement statement;
    String query;
    ResultSet rs;

    public String autoNumerico(String nomtabla, String parametros) {
        String retorno = "";

        try {
            conexionLocal.conectar();
            statement = conexionLocal.conexion.createStatement();
            // SELECT CASE WHEN pai_id IS NULL THEN 1 ELSE MAX(pai_id) + 1 END AS max FROM pais
            query = "SELECT * FROM pais";
            //query = "SELECT CASE WHEN " + parametros + " IS NULL THEN 1 ELSE MAX(" + parametros + ") + 1 END AS max FROM " + nomtabla;
            System.out.println(query);
            rs = statement.executeQuery(query);
            
            //System.out.println(rs.getInt(1));
            
           if (rs.next()) { // Avanzar al primer registro
            retorno = rs.getString("pai_desc");
            System.out.println(retorno);
            }
           
            rs.close();
            statement.close();
            conexionLocal.conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return retorno;
        
    }
}
