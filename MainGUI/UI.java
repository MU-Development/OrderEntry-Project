
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class OrderEntryUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UI extends Frame implements WindowListener, ActionListener
{
    protected final int sizeX = 500;
    protected final int sizeY = 250;
    protected static final String commonUser = " ";
    Scanner in = new Scanner(System.in);

    String[][] temp1 = new String[20][20];
    MenuData[] temp2 = new MenuData[50];
    // Find way to get multiple frequent users
    //Array of Users?

    Button bCompany1;
    final static String company1 = "Dunkin Donuts";

    Button bCompany2;
    final static String company2 = "Burger King";

    Button bCompany3;
    final static String company3 = "Taco Bell";

    TextField bFreqUser;
    final static String freqUser = "Email";

    Button bOwner;
    final static String storeOwner = "Owner";

    Button bExit;
    final static String exitProgram = "Exit Program";

    public UI(String title) {
        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);

        bCompany1 = new Button(company1);
        add(bCompany1);
        bCompany1.addActionListener(this);

        bCompany2 = new Button(company2);
        add(bCompany2);
        bCompany2.addActionListener(this);

        bCompany3 = new Button(company3);
        add(bCompany3);
        bCompany3.addActionListener(this);

        bFreqUser = new TextField(freqUser);
        add(bFreqUser);
        bFreqUser.addActionListener(this);
        bFreqUser.setColumns(20);

        bOwner = new Button(storeOwner);
        add(bOwner);
        bOwner.addActionListener(this);

        bExit = new Button(exitProgram);
        add(bExit);
        bExit.addActionListener(this);

        
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(company1)){
            System.out.println("Going to company 1: " + company1);
            DunkinDonuts DD1 = new DunkinDonuts();
            DD1.setSize(sizeX,sizeY);
            DD1.setVisible(true);
            //System.out.println(bCompany1.getWidth());
            //System.out.println(bCompany1.getHeight());
        }else if(e.getActionCommand().equals(company2)){
            System.out.println("Going to company 2: " + company2);
            BurgerKing BK1 = new BurgerKing();
            BK1.setSize(sizeX,sizeY);
            BK1.setVisible(true);
            //System.out.println(bCompany2.getWidth());
            //System.out.println(bCompany2.getHeight());
        }else if(e.getActionCommand().equals(company3)){
            System.out.println("Going to company 3: " + company3);
            TacoBell TB1 = new TacoBell();
            TB1.setSize(sizeX,sizeY);
            TB1.setVisible(true);
            //System.out.println(bCompany3.getWidth());
            //System.out.println(bCompany3.getHeight());
        }else if(e.getActionCommand().equals(commonUser)){
            System.out.println("Welcome Back!");
            FreqUser fq1 = new FreqUser("Frequent User");
            fq1.setVisible(true);
            fq1.setSize(sizeX, sizeY);
        }else if(e.getActionCommand().equals(storeOwner)){
            System.out.println("Welcome Back! Please enter Username and Password");
            Owner owner1 = new Owner("Store Owner");
            owner1.setVisible(true);
            owner1.setSize(sizeX, sizeY);
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
