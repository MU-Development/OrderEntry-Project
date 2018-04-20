import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class OrderEntryUI here.
 * 
 *Eric Moul
 * Version 4.3
 */
public class OrderEntryUI extends Frame implements WindowListener, ActionListener
{
    protected final int sizeX = 500;
    protected final int sizeY = 250;
    protected static final String commonUser = " ";
    Scanner in = new Scanner(System.in);

    String[][] temp1 = new String[20][4];
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

    public OrderEntryUI(String title, String[][] arr1, MenuData[] arr2 ) {
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

        // *** arr1 --> user data - it appears that the .getMenu method returns default values rather than the full set of data        
        this.setTemp1(arr1);
        this.setTemp2(arr2);
        /*
        int r; int c; int row; int col;
        row = temp1.length; col = temp1[0].length;
        System.out.printf ("User Data: %d\t%d\n",row, col);
        for (r = 0; r <row  ; r++){
        if ( temp1[r][0] != null ) {
        System.out.printf("%s\t%s\t%s\n",temp1[r][0],temp1[r][1],temp1[r][2]);
        }
        }

        // arr2 --> menu data
        row = temp2.length; 
        System.out.printf ("\nMenu Data: %d\n",row);
        for (r = 0; r <row  ; r++){
        if ( temp2[r] != null ) {
        System.out.printf("%s\t%f\t%f\t%f\t%f\t%f\n",temp2[r].name,temp2[r].cost, temp2[r].small, temp2[r].medium, temp2[r].large,temp2[r].quantity);
        }
        }
         */

    }

    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case company1:
                System.out.println("Going to company 1: " + company1);
                DunkinDonuts DD1 = new DunkinDonuts(sizeX,sizeY); //** Set Window Size
                //System.out.println(bCompany1.getWidth());
                //System.out.println(bCompany1.getHeight());
                break;

            case company2:
                System.out.println("Going to company 2: " + company2);
                bkpanel BK1 = new bkpanel(sizeX, sizeY);
                //BK1.setSize(sizeX,sizeY);
                //BK1.setVisible(true);
                //System.out.println(bCompany2.getWidth());
                //System.out.println(bCompany2.getHeight());
                break;

            case company3:
                System.out.println("Going to company 3: " + company3);
                TacoBell TB1 = new TacoBell();
                //TBell TB1 = new TBell(); //*** Written as a Main, No Constructor
                TB1.setSize(sizeX,sizeY);
                TB1.setVisible(true);
                //System.out.println(bCompany3.getWidth());
                //System.out.println(bCompany3.getHeight());
                break;

            case commonUser:
                System.out.println("Welcome Back!");
                FreqUser fq1 = new FreqUser("Frequent User");
                fq1.setSize(sizeX, sizeY);
                fq1.setVisible(true);
                break;

            case storeOwner:
                System.out.println("Welcome Back! Please enter Username and Password");
                UISetupLogin so1 = new UISetupLogin();
                //Owner owner1 = new Owner("Store Owner");
                //owner1.setSize(sizeX, sizeY);
                //owner1.setVisible(true);
                break;

            case exitProgram:
                System.out.println("Exiting Program");
                System.exit(0);
                break;

            default:
                System.out.println ("Unknown Input in OrderEntryUI " + e.getActionCommand());
                break;
        }
        /*if(e.getActionCommand().equals(company1)){
        System.out.println("Going to company 1: " + company1);
        DunkinDonuts DD1 = new DunkinDonuts();
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
        fq1.setSize(sizeX, sizeY);
        fq1.setVisible(true);
        }else if(e.getActionCommand().equals(storeOwner)){
        System.out.println("Welcome Back! Please enter Username and Password");
        Owner owner1 = new Owner("Store Owner");
        owner1.setSize(sizeX, sizeY);
        owner1.setVisible(true);
        }else if(e.getActionCommand().equals(exitProgram)){
        System.out.println("Exiting Program");
        System.exit(0);
        }*/
    }

    public void setTemp1(String[][] arr1){
        for(int i = 0; i < arr1[0].length; i++){
            for(int j = 0; j < arr1.length; j++){
                temp1[j][i] = arr1[j][i]; // *** Swap i and j
            }
        }
    }

    public void setTemp2(MenuData[] arr2){
        for(int i = 0; i < arr2.length; i++){
            temp2[i] = arr2[i];
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
