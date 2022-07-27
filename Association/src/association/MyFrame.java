/**
 * create JFrame for application
 * if any frame is needed then create it by creating by instance of this class
 */
package association;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/*-----------------Class MyFrame--------------------------------*/ 
public class MyFrame extends JFrame{
    /**
     * Constructor creates a frame with some specs
     */
    MyFrame()  // constructor
    { 
        Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize(); //get screen size to make responsive application
        this.setSize(scrSize.width, scrSize.height);
        
        this.getContentPane().setBackground(new Color(69, 84, 82)); //set background color of the frame
    }
    
}
