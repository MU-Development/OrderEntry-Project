import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UISetup extends JFrame {
 JTextField couponEntry = new JTextField("ex. bk15-S%wWCHM8");   
    class CustomActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        String input = couponEntry.getText();
        Test a = new Test();
        System.out.println(a.isBKValid(input));
        System.out.println(a.isTBValid(input));
        System.out.println(a.isDDValid(input));
    }
}
public UISetup() {  
    
    JFrame frame = new JFrame("Coupon Code");
    JButton btn = new JButton("Click");
    JLabel label = new JLabel("Enter Coupon Code");
    add(label);
    label.setLabelFor(couponEntry);
    
    
    
    /**
     *JPanel will use the GridBagLayout.
     *Uses a grid system to place the components
     *on the panel.  The constraints are used
     *to direct where the component should placed
     *on the grid.
     */
    
    JPanel p = new JPanel();
    p.setLayout(new GridBagLayout());
    
    p.add(couponEntry);
    
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    
    gbc.gridx = 0;    //x-axis
    gbc.gridy = 0;   //y-axis   Grid starts top left corner
    btn.addActionListener(new CustomActionListener());
	
    
    gbc.gridx = 0;    //x-axis
    gbc.gridy = 0;    //y-axis   Grid starts top left corner
    p.add(btn,gbc);
    
    gbc.gridx = 1;    //Move over 1 
    gbc.gridy = 0;    
    p.add(btn,gbc);
    
    gbc.gridx = 2;   // Move over 2
    gbc.gridy = 0;
    p.add(btn,gbc);
    
    gbc.gridwidth = 3; //Gridwidth means use 3 grid spots.
    gbc.gridx = 0;     //Place it all they left
    gbc.gridy = 1;     //Place it on a new row
    p.add(btn,gbc);
    
    /**
     * Set the size of the Frame
     * add the panel to the Content Pane
     * make it Visible
     */
    frame.setSize(300,300);
    frame.getContentPane().add(p);
    frame.setVisible(true);
    }
}
