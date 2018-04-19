import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import DunkinDonuts.CustomActionListener;

/*
 * Dunkin Dounuts
Display items and have a check box next to the item showing what they selected.
Once item is selected have a drop box that gives the options either amount of size.
Once amount/size is collected the price appears in the textbox.
Have coupon button that has a text field of the date and either a 10/15/20% which will have a boolean(t/f) 
and send it to billing.
Have checkout button that sends information to the billing and coupon information. 
Would pass one data structure to billing. (eg:two dim array, arrayofObjects).
Allow for a text field to show the amount from billing that does straight to textbox.
Pricing would pass a parameter to Dunkin Donuts.
Have a check promotions hidden which Eric will write the method. 
 */
public class DunkinDonuts {
	JTextField text = new JTextField("Item Choosen" , 60);
	//private int numClicks=0;
	
	class CustomActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			System.out.println("Total Price is: " + e);
			
			
			if(e.getActionCommand().equals("Iced Drinks")){
				System.out.println("Iced Drinks");
				text.setText(null);
			}else if(e.getActionCommand().equals("Hot Drinks")){
				System.out.println("Hot Drink");
				text.setText(null);
			}else if(e.getActionCommand().equals("Wakeup Wrap")){
				System.out.println("Wakeup Wrap");
				text.setText(null);
			}else if(e.getActionCommand().equals("Frozen Drinks")){
				System.out.println("You Clicked Button four");
				text.setText("Frozen");
			}else if(e.getActionCommand().equals("Donuts")){
				System.out.println("Donuts");
				text.setText(null);
			}else if(e.getActionCommand().equals("hot")){
				System.out.println("Hot Drinks");
				text.setText("Hot Drink");
		
				
			}
		
		}
	}
	public DunkinDonuts(){
		JFrame frame = new JFrame("Dunkin Donuts Menu");
				JButton btn1=new JButton("Iced Drinks");
				JButton btn2 =new JButton("Hot Drinks");
				JButton btn3 = new JButton("Wakeup Wrap");
				JButton btn4=new JButton("Frozen Drinks");
				JButton btn5=new JButton("Donuts");
				JButton btn6=new JButton("Coupons");
				//JButton btn7= new JButton("Coupons");
				//send a two d array so it would be item/price/qty to billing(matt.checkout compute bill) i would get back a double.
				//print the double.
				
	
		
				/**
				 * JPanel will use the GridBagLayout.
				 * uses a grid system to place the components 
				 * on the panel. the constraints are used
				 */
				
				JPanel p = new JPanel();
				p.setLayout(new GridBagLayout());
				p.add(text);
				
			
			
				GridBagConstraints gbc= new GridBagConstraints();
				gbc.fill=GridBagConstraints.HORIZONTAL;
				
				gbc.gridx=0;
				gbc.gridy=2;
				text.addActionListener(new CustomActionListener());
				p.add(text,gbc);
				gbc.gridx=0;  //x-axis
				gbc.gridy=0;
				btn1.addActionListener(new CustomActionListener());
				p.add(btn1,gbc);
				
				gbc.gridx=1;
				gbc.gridy=0;
				btn2.addActionListener(new CustomActionListener());
				p.add(btn2,gbc);
				
				gbc.gridx=2;
				gbc.gridy=0;
				btn3.addActionListener(new CustomActionListener());
				p.add(btn3,gbc);
				
				//gbc.gridwidth=3; //means use 3 grid spots
				
				gbc.gridx=0;
				gbc.gridy=1;
				btn4.addActionListener(new CustomActionListener());
				p.add(btn4,gbc);
				
				gbc.gridx=1;
				gbc.gridy=1;
				btn5.addActionListener(new CustomActionListener());
				p.add(btn5,gbc);
				
				gbc.gridx=2;
				gbc.gridy=1;
				btn6.addActionListener(new CustomActionListener());
				p.add(btn6,gbc);
				
				/*gbc.gridx=2;
				gbc.gridy=1;
				btn7.addActionListener(new CustomActionListener());
				p.add(btn7,gbc);
				*/
				JCheckBox jb= new JCheckBox("CheckBox 1");
				JCheckBox jb1= new JCheckBox("CheckBox 2");
				
				gbc.gridx=1;
				gbc.gridy=2;
				gbc.gridwidth=1;
				p.add(jb,gbc);
				
				gbc.gridx=2;
				gbc.gridy=2;
				p.add(jb1,gbc);
				

				
				JComboBox hot= new JComboBox();
				hot.addItem("Coffee");
				hot.addItem("Americano");
				hot.addItem("latte");
				hot.addItem("Macchiato");
				hot.addItem("Tea");
				hot.addItem("Hot Chocolate");
				hot.addItem("Vanilla Chai");
				hot.addItem("Cappuccino");
				hot.addItem("Espresso");
				hot.addActionListener(new CustomActionListener());
				Object hotItem= hot.getSelectedItem();
				System.out.println(hotItem);
				JComboBox iced = new JComboBox();
				iced.addItem("Cold Brew");
				iced.addItem("Iced Coffee");
				iced.addItem("Iced latte");
				iced.addItem("Iced Macchiato");
				iced.addItem("Iced Tea");
				iced.addItem("Fruited Iced Tea");
				iced.addActionListener(new CustomActionListener());
				
				
				gbc.gridx=0;
				gbc.gridy=3;
				p.add(hot,gbc);
				
				gbc.gridx=1;
				gbc.gridy=3;
				p.add(iced,gbc);
				
				/**
				 * Set the size of the Frame
				 * add the panel to the content pane
				 * make it visible
				 */
				
				frame.setSize(360,360);
				frame.getContentPane().add(p);
				frame.setVisible(true);
			
			//	Layout.Layout();
				
	}


}

 

