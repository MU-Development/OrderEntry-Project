import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class Owner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Owner extends Frame implements ActionListener, WindowListener
{
    TextField bUsername;
    protected String userName = "Username";

    TextField bPassword;
    protected String userPassword = "Password";

    String validUser = "Eric Moul";
    String validPassword = "1129403";

    public Owner(String Title){
        super(Title);
        setLayout(new FlowLayout());
        addWindowListener(this);

        bUsername = new TextField(userName);
        add(bUsername);
        bUsername.addActionListener(this);

        bPassword = new TextField(userPassword);
        add(bPassword);
        bPassword.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        
    }

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
