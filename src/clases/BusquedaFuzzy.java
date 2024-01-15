package clases;

import clases.Controlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import me.xdrop.fuzzywuzzy.FuzzySearch;

/**
 *
 * @author caches
 */
public class BusquedaFuzzy {

    private static Statement statement = null;
    private static Connection conexion = null;
    private static DefaultListModel<String> listModel = null;
    private static String search = null;
    private static ArrayList<String> arrCache = new ArrayList<>();
    private static ArrayList<String> arrCacheCopy = new ArrayList<>();
    private static ResultSet rs = null;
    private static int fuzzyRatio = 0;
    private static boolean queryExecuted = false;
    private static boolean searchCacheFull = false;

    /**
     * Realiza una búsqueda fuzzy y actualiza la lista de resultados.
     *
     * @param nombreColumna Valor insertado despues de SELECT.
     * @param nombreTabla Nombre de tabla.
     * @param txtField {@code JTextField} que contiene la cadena de búsqueda.
     * @param scrPane {@code JScrollPane} que contiene la lista de resultados.
     * @param lstList {@code JList} que va a contener los resultados.
     *
     */
    public static void busqueda(String nombreColumna, String nombreTabla, JTextField txtField, JScrollPane scrPane, JList<String> lstList) {

        /*Variables importantes:
          statement
          conexion
          listModel
          search
          arrCache
          arrCacheCopy
          rs
          queryExecuted
          searchCacheFull
         */
        search = txtField.getText();

        if (search.length() < 3) {
            scrPane.setVisible(false);
        } else {
            scrPane.setVisible(true);
        }

        if (listModel == null) {
            listModel = new DefaultListModel<>();
            lstList.setModel(listModel);
            scrPane.setSize(scrPane.getWidth(), 100);
        }

        if (search.length() > 2 && queryExecuted == false) {
            try {
                conexion = Controlador.getConnection();
                statement = Controlador.getStatement();
                rs = statement.executeQuery(
                        "SELECT " + nombreColumna + " AS search, * FROM " + nombreTabla + " WHERE search LIKE '%" + search + "%'");
                queryExecuted = true;
            } catch (Exception e) {
                System.err.println("frmFuzzyTest err: Error SQL\n" + e);
            }

        }

        try {
            // Checkeamos si el usuario borro la 
            // busqueda por debajo de 3 caracteres
            if (search.length() < 2) {
                queryExecuted = false;
                searchCacheFull = false;
            }

            // llenamos el array cache con la respuesta SQL
            // , levantamos la bandera y cerramos la conexion
            // SQL
            if (searchCacheFull == false && queryExecuted == true) {
                arrCache.clear();
                while (rs.next()) {
                    arrCache.add(rs.getString("search"));
                }
                searchCacheFull = true;
                conexion.close();
            }

            // Creamos una copia no ordenada de arrCache filtrada
            // por la busqueda en cada KeyReleased
            if (!arrCache.isEmpty()) {

                arrCacheCopy.clear();

                arrCache.forEach(item -> {
                    fuzzyRatio = FuzzySearch.tokenSetPartialRatio(search, item);
                    System.out.println(fuzzyRatio);
                    if (fuzzyRatio >= 70) {
                        arrCacheCopy.add(item);
                    }
                });
                listModel.clear();
                arrCacheCopy.sort(Comparator.comparingInt((String item) -> FuzzySearch.tokenSortPartialRatio(search, item)).reversed());
                listModel.addAll(arrCacheCopy);
            }

        } catch (Exception e) {
            System.err.println("frmFuzzyTest err second TryCatch: Error SQL\n" + e);
        }

    }
}
