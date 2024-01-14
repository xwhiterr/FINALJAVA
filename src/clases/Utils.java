package clases;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static ventanas.FrmMdi.getDesktopPane;

/**
 *
 * @author Walter
 */
public class Utils {

    public static void abrirInternalFrame(JInternalFrame internalFrame) {

        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(internalFrame);
        internalFrame.toFront();
        internalFrame.setVisible(true);

        Dimension desktopSize = desktopPane.getSize();
        Dimension jInternalFrameSize = internalFrame.getSize();
        internalFrame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);

    }

    public static void activarPanel(boolean activarCampos, JPanel pnlPanel) {
        Component[] components = pnlPanel.getComponents();
        if (activarCampos == true) {
            for (Component component : components) {
                if (component instanceof JTextField) {
                    component.setEnabled(true);
                }
                if (component instanceof JDateChooser) {
                    component.setEnabled(true);
                }
            }
        } else {
            for (Component component : components) {
                if (component instanceof JTextField) {
                    component.setEnabled(false);
                }
                if (component instanceof JDateChooser) {
                    component.setEnabled(false);
                }
            }
        }

    }
}
