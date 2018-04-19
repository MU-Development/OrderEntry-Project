import java.util.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Company here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Company extends Frame implements WindowListener, ActionListener
{
    Button selection1;
    final static String bText1 = "Selection 1";

    Button selection2;
    final static String bText2 = "Selection 2";

    Button selection3;
    final static String bText3 = "Selection 3";

    Button bExit;
    final static String exitProgram = "Exit Program";
    public Company() {
        
        setLayout(new FlowLayout());
        addWindowListener(this);

        selection1 = new Button(bText1);
        add(selection1);
        selection1.addActionListener(this);

        selection2 = new Button(bText2);
        add(selection2);
        selection2.addActionListener(this);

        selection3 = new Button(bText3);
        add(selection3);
        selection3.addActionListener(this);

        bExit = new Button(exitProgram);
        add(bExit);
        bExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(bText1)){
            System.out.println("Going to selection 1: " + bText1);
        }else if(e.getActionCommand().equals(bText2)){
            System.out.println("Going to selection 2: " + bText2);
        }else if(e.getActionCommand().equals(bText3)){
            System.out.println("Going to selection 3: " + bText3);
        }else if(e.getActionCommand().equals(exitProgram)){
            System.out.println("Exiting Program");
            System.exit(0);
        }
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

