package clases;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

/**
 *
 * @author caches
 */
public class BusquedaFuzzy {

    private Statement statement = null;
    private Connection conexion = null;
    private DefaultListModel<String> listModel = null;
    private String search = null;
    private ArrayList<String> arrCache = new ArrayList<>();
    private ArrayList<String> arrCacheCopy = new ArrayList<>();
    private ResultSet rs = null;
    private int fuzzyRatio = 0;
    private boolean queryExecuted = false;
    private boolean searchCacheFull = false;

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
    public void busqueda(String nombreColumna, String nombreTabla, JTextField txtField, JScrollPane scrPane, JList<String> lstList) {
        
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
                //conexion.close();
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
    
    public void reset() {
    listModel = null;
    queryExecuted = false;
    arrCache.clear();
    arrCacheCopy.clear();
    searchCacheFull = false;
    // Reset any other state variables if needed
}

    /**
     * Setea el texto de la lista en el {@code JtextField} y oculta el
     * {@code JScrollPane}. Mejor usado bajo un evento
     *
     * @param txtField {@code JTextField} que contiene la cadena de búsqueda.
     * @param scrPane {@code JScrollPane} que contiene la lista de resultados.
     * @param lstList {@code JList} que va a contener los resultados.
     *
     */
    public void setText(JTextField txtField, JScrollPane scrPane, JList<String> lstList) {
        txtField.setText(lstList.getSelectedValue());
        KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
        scrPane.setVisible(false);
    }

    public void setText(JTextField txtFieldApe, JTextField txtField, JScrollPane scrPane, JList<String> lstList) {
        txtField.setText(lstList.getSelectedValue().split(" ")[0]);
        txtFieldApe.setText(lstList.getSelectedValue().split(" ")[1]);
        KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
        scrPane.setVisible(false);
    }

    public void cerrarJListMouseExited(JPanel pnlPanel) {
        Component[] components = pnlPanel.getComponents();

        for (Component component : components) {
            if (component instanceof JTextField) {

                component.addMouseListener(new MouseAdapter() {
                    public void mouseExited(MouseEvent e) {
                        Utils.activarScrollList(false, pnlPanel);
                    }
                });

            } else if (component instanceof JScrollPane) {

                component.addMouseListener(new MouseAdapter() {
                    public void mouseExited(MouseEvent e) {
                        Utils.activarScrollList(false, pnlPanel);
                    }
                });

            } else if (component instanceof JList) {

                component.addMouseListener(new MouseAdapter() {
                    public void mouseExited(MouseEvent e) {
                        Utils.activarScrollList(false, pnlPanel);
                    }
                });
            }
        }
    }
}
