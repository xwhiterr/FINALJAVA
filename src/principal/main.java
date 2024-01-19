package principal;



import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import ventanas.FrmLogin;

/**
 *
 * @author Walter
 */
public class main {


    public static void main(String[] args) {
        
        FlatArcDarkIJTheme.setup();
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }
    
}
