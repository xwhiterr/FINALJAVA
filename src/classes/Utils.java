package classes;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
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
}
