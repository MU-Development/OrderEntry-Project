import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class FreqUser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FreqUser extends Frame implements ActionListener, WindowListener
{
    
    
    public FreqUser(String Title){
        super(Title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        
    }
    
    
    public void actionPerformed(ActionEvent e) {}
    
    
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {}

    public void windowActivated(WindowEvent e) {}

    public void windowIconified(WindowEvent e) {}

    public void windowDeiconified(WindowEvent e) {}

    public void windowDeactivated(WindowEvent e) {}

    public void windowClosed(WindowEvent e) {}
}
