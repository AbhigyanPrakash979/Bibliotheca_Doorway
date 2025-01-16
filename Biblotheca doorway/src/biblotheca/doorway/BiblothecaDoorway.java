
package biblotheca.doorway;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Aniket
 */
public class BiblothecaDoorway {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        openFrame frame1 = new openFrame();
                frame1.setVisible(true);
        
        Administrator frame = new Administrator();
                frame.setVisible(true);
                Timer timer;
                timer = new Timer(4000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                         
                    }
                });
                timer.setRepeats(false);
               timer.start();
    }
    
}
